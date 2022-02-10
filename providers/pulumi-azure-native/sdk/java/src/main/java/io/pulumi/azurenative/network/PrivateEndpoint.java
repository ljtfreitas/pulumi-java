// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.PrivateEndpointArgs;
import io.pulumi.azurenative.network.outputs.CustomDnsConfigPropertiesFormatResponse;
import io.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.network.outputs.NetworkInterfaceResponse;
import io.pulumi.azurenative.network.outputs.PrivateLinkServiceConnectionResponse;
import io.pulumi.azurenative.network.outputs.SubnetResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:network:PrivateEndpoint")
public class PrivateEndpoint extends io.pulumi.resources.CustomResource {
    @OutputExport(name="customDnsConfigs", type=List.class, parameters={CustomDnsConfigPropertiesFormatResponse.class})
    private Output</* @Nullable */ List<CustomDnsConfigPropertiesFormatResponse>> customDnsConfigs;

    public Output</* @Nullable */ List<CustomDnsConfigPropertiesFormatResponse>> getCustomDnsConfigs() {
        return this.customDnsConfigs;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    public Output</* @Nullable */ ExtendedLocationResponse> getExtendedLocation() {
        return this.extendedLocation;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="manualPrivateLinkServiceConnections", type=List.class, parameters={PrivateLinkServiceConnectionResponse.class})
    private Output</* @Nullable */ List<PrivateLinkServiceConnectionResponse>> manualPrivateLinkServiceConnections;

    public Output</* @Nullable */ List<PrivateLinkServiceConnectionResponse>> getManualPrivateLinkServiceConnections() {
        return this.manualPrivateLinkServiceConnections;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="networkInterfaces", type=List.class, parameters={NetworkInterfaceResponse.class})
    private Output<List<NetworkInterfaceResponse>> networkInterfaces;

    public Output<List<NetworkInterfaceResponse>> getNetworkInterfaces() {
        return this.networkInterfaces;
    }
    @OutputExport(name="privateLinkServiceConnections", type=List.class, parameters={PrivateLinkServiceConnectionResponse.class})
    private Output</* @Nullable */ List<PrivateLinkServiceConnectionResponse>> privateLinkServiceConnections;

    public Output</* @Nullable */ List<PrivateLinkServiceConnectionResponse>> getPrivateLinkServiceConnections() {
        return this.privateLinkServiceConnections;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="subnet", type=SubnetResponse.class, parameters={})
    private Output</* @Nullable */ SubnetResponse> subnet;

    public Output</* @Nullable */ SubnetResponse> getSubnet() {
        return this.subnet;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public PrivateEndpoint(String name, PrivateEndpointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PrivateEndpoint", name, args == null ? PrivateEndpointArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrivateEndpoint(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PrivateEndpoint", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20180801:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181001:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181101:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181201:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190201:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:PrivateEndpoint").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PrivateEndpoint get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateEndpoint(name, id, options);
    }
}