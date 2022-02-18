// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datalakestore.VirtualNetworkRuleArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Data Lake Store virtual network rule information.
 * API Version: 2016-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datalakestore:VirtualNetworkRule test_virtual_network_rules_name 34adfa4f-cedf-4dc0-ba29-b6d1a69ab345 
 * ```
 * 
 */
@ResourceType(type="azure-native:datalakestore:VirtualNetworkRule")
public class VirtualNetworkRule extends io.pulumi.resources.CustomResource {
    /**
     * The resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The resource identifier for the subnet.
     * 
     */
    @OutputExport(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return The resource identifier for the subnet.
     * 
     */
    public Output<String> getSubnetId() {
        return this.subnetId;
    }
    /**
     * The resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
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
    public VirtualNetworkRule(String name, VirtualNetworkRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datalakestore:VirtualNetworkRule", name, args == null ? VirtualNetworkRuleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VirtualNetworkRule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datalakestore:VirtualNetworkRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:datalakestore/v20161101:VirtualNetworkRule").build())
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
    public static VirtualNetworkRule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualNetworkRule(name, id, options);
    }
}
