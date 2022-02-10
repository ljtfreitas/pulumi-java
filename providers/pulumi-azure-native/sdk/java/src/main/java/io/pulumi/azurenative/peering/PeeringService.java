// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.peering.PeeringServiceArgs;
import io.pulumi.azurenative.peering.outputs.PeeringServiceSkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:peering:PeeringService")
public class PeeringService extends io.pulumi.resources.CustomResource {
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="peeringServiceLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> peeringServiceLocation;

    public Output</* @Nullable */ String> getPeeringServiceLocation() {
        return this.peeringServiceLocation;
    }
    @OutputExport(name="peeringServiceProvider", type=String.class, parameters={})
    private Output</* @Nullable */ String> peeringServiceProvider;

    public Output</* @Nullable */ String> getPeeringServiceProvider() {
        return this.peeringServiceProvider;
    }
    @OutputExport(name="providerBackupPeeringLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> providerBackupPeeringLocation;

    public Output</* @Nullable */ String> getProviderBackupPeeringLocation() {
        return this.providerBackupPeeringLocation;
    }
    @OutputExport(name="providerPrimaryPeeringLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> providerPrimaryPeeringLocation;

    public Output</* @Nullable */ String> getProviderPrimaryPeeringLocation() {
        return this.providerPrimaryPeeringLocation;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="sku", type=PeeringServiceSkuResponse.class, parameters={})
    private Output</* @Nullable */ PeeringServiceSkuResponse> sku;

    public Output</* @Nullable */ PeeringServiceSkuResponse> getSku() {
        return this.sku;
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

    public PeeringService(String name, PeeringServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:peering:PeeringService", name, args == null ? PeeringServiceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PeeringService(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:peering:PeeringService", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:peering/v20190801preview:PeeringService").build()),
                Input.of(Alias.builder().setType("azure-native:peering/v20190901preview:PeeringService").build()),
                Input.of(Alias.builder().setType("azure-native:peering/v20200101preview:PeeringService").build()),
                Input.of(Alias.builder().setType("azure-native:peering/v20200401:PeeringService").build()),
                Input.of(Alias.builder().setType("azure-native:peering/v20201001:PeeringService").build()),
                Input.of(Alias.builder().setType("azure-native:peering/v20210101:PeeringService").build()),
                Input.of(Alias.builder().setType("azure-native:peering/v20210601:PeeringService").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PeeringService get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PeeringService(name, id, options);
    }
}