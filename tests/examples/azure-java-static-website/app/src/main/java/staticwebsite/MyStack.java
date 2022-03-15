package staticwebsite;

import java.util.List;

import io.pulumi.Stack;
import io.pulumi.azurenative.cdn.Endpoint;
import io.pulumi.azurenative.cdn.Profile;
import io.pulumi.azurenative.cdn.enums.QueryStringCachingBehavior;
import io.pulumi.azurenative.cdn.inputs.DeepCreatedOriginArgs;
import io.pulumi.azurenative.resources.ResourceGroup;
import io.pulumi.azurenative.storage.Blob;
import io.pulumi.azurenative.storage.StorageAccount;
import io.pulumi.azurenative.storage.StorageAccountStaticWebsite;
import io.pulumi.azurenative.storage.enums.Kind;
import io.pulumi.azurenative.storage.enums.SkuName;
import io.pulumi.azurenative.storage.inputs.SkuArgs;
import io.pulumi.core.Asset;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;

public final class MyStack extends Stack {

    @Export(type = String.class)
    private Output<String> staticEndpoint;

    @Export(type = String.class)
    private Output<String> cdnEndpoint;

    public MyStack() {
        var resourceGroup = new ResourceGroup("resourceGroup");

        var storageAccount = new StorageAccount("storageaccount",
                $ -> $.kind(Either.ofRight(Kind.StorageV2))
                        .resourceGroupName(resourceGroup.getName())
                        .sku(SkuArgs.builder()
                                .name(Either.ofRight(SkuName.Standard_LRS))
                                .build()));

        var staticWebsite = new StorageAccountStaticWebsite("staticWebsite",
                $ -> $.accountName(storageAccount.getName())
                        .resourceGroupName(resourceGroup.getName())
                        .indexDocument("index.html")
                        .error404Document("404.html"));

        var indexHtml = new Blob("index.html",
                $ -> $.accountName(storageAccount.getName())
                        .resourceGroupName(resourceGroup.getName())
                        .containerName(staticWebsite.getContainerName())
                        .source(new Asset.FileAsset("./wwwroot/index.html"))
                        .contentType("text/html"));

        var notFoundHtml = new Blob("404.html",
                $ -> $.accountName(storageAccount.getName())
                        .resourceGroupName(resourceGroup.getName())
                        .containerName(staticWebsite.getContainerName())
                        .source(new Asset.FileAsset("./wwwroot/404.html"))
                        .contentType("text/html"));

        // Web endpoint to the website.
        this.staticEndpoint = storageAccount.getPrimaryEndpoints()
                .applyValue(primaryEndpoints -> primaryEndpoints.getWeb());

        // (Optional) Add a CDN in front of the storage account.
        var profile = new Profile("profile",
                $ -> $.resourceGroupName(resourceGroup.getName())
                        .location("global")
                        .sku(io.pulumi.azurenative.cdn.inputs.SkuArgs.builder()
                                .name(Either.ofRight(io.pulumi.azurenative.cdn.enums.SkuName.Standard_Microsoft))
                                .build()));

        var endpointOrigin = storageAccount.getPrimaryEndpoints()
                .applyValue(pe -> pe.getWeb().replace("https://", "").replace("/", ""));

        var endpoint = new Endpoint("endpoint",
                $ -> $.isHttpAllowed(false)
                        .isHttpsAllowed(true)
                        .originHostHeader(endpointOrigin)
                        .origins(List.of(DeepCreatedOriginArgs.builder()
                                .hostName(endpointOrigin)
                                .httpsPort(443)
                                .name("origin-storage-account")
                                .build()))
                        .profileName(profile.getName())
                        .queryStringCachingBehavior(QueryStringCachingBehavior.NotSet)
                        .resourceGroupName(resourceGroup.getName())
                );


        // CDN endpoint to the website.
        // Allow it some time after the deployment to get ready.
        this.cdnEndpoint = endpoint.getHostName()
                .applyValue(hostName -> String.format("https://%s", hostName));
    }
}
