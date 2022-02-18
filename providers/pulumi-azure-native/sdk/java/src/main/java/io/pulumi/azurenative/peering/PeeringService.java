// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.peering.PeeringServiceArgs;
import io.pulumi.azurenative.peering.outputs.PeeringServiceSkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Peering Service
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:peering:PeeringService peeringServiceName /subscriptions/subId/resourceGroups/rgName/providers/Microsoft.Peering/peeringServices/peeringServiceName 
 * ```
 * 
 */
@ResourceType(type="azure-native:peering:PeeringService")
public class PeeringService extends io.pulumi.resources.CustomResource {
    /**
     * The location of the resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The location (state/province) of the customer.
     * 
     */
    @OutputExport(name="peeringServiceLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> peeringServiceLocation;

    /**
     * @return The location (state/province) of the customer.
     * 
     */
    public Output</* @Nullable */ String> getPeeringServiceLocation() {
        return this.peeringServiceLocation;
    }
    /**
     * The name of the service provider.
     * 
     */
    @OutputExport(name="peeringServiceProvider", type=String.class, parameters={})
    private Output</* @Nullable */ String> peeringServiceProvider;

    /**
     * @return The name of the service provider.
     * 
     */
    public Output</* @Nullable */ String> getPeeringServiceProvider() {
        return this.peeringServiceProvider;
    }
    /**
     * The backup peering (Microsoft/service provider) location to be used for customer traffic.
     * 
     */
    @OutputExport(name="providerBackupPeeringLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> providerBackupPeeringLocation;

    /**
     * @return The backup peering (Microsoft/service provider) location to be used for customer traffic.
     * 
     */
    public Output</* @Nullable */ String> getProviderBackupPeeringLocation() {
        return this.providerBackupPeeringLocation;
    }
    /**
     * The primary peering (Microsoft/service provider) location to be used for customer traffic.
     * 
     */
    @OutputExport(name="providerPrimaryPeeringLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> providerPrimaryPeeringLocation;

    /**
     * @return The primary peering (Microsoft/service provider) location to be used for customer traffic.
     * 
     */
    public Output</* @Nullable */ String> getProviderPrimaryPeeringLocation() {
        return this.providerPrimaryPeeringLocation;
    }
    /**
     * The provisioning state of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The SKU that defines the type of the peering service.
     * 
     */
    @OutputExport(name="sku", type=PeeringServiceSkuResponse.class, parameters={})
    private Output</* @Nullable */ PeeringServiceSkuResponse> sku;

    /**
     * @return The SKU that defines the type of the peering service.
     * 
     */
    public Output</* @Nullable */ PeeringServiceSkuResponse> getSku() {
        return this.sku;
    }
    /**
     * The resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
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

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PeeringService get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PeeringService(name, id, options);
    }
}
