// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventhub.NamespaceIpFilterRuleArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Single item in a List or Get IpFilterRules operation
 * API Version: 2018-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:eventhub:NamespaceIpFilterRule sdk-IPFilterRules-7337 /subscriptions/Subscription/resourceGroups/ResourceGroup/providers/Microsoft.EventHub/namespaces/sdk-Namespace-5232/ipfilterrules/sdk-IPFilterRules-7337 
 * ```
 * 
 */
@ResourceType(type="azure-native:eventhub:NamespaceIpFilterRule")
public class NamespaceIpFilterRule extends io.pulumi.resources.CustomResource {
    /**
     * The IP Filter Action
     * 
     */
    @Export(name="action", type=String.class, parameters={})
    private Output</* @Nullable */ String> action;

    /**
     * @return The IP Filter Action
     * 
     */
    public Output</* @Nullable */ String> getAction() {
        return this.action;
    }
    /**
     * IP Filter name
     * 
     */
    @Export(name="filterName", type=String.class, parameters={})
    private Output</* @Nullable */ String> filterName;

    /**
     * @return IP Filter name
     * 
     */
    public Output</* @Nullable */ String> getFilterName() {
        return this.filterName;
    }
    /**
     * IP Mask
     * 
     */
    @Export(name="ipMask", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipMask;

    /**
     * @return IP Mask
     * 
     */
    public Output</* @Nullable */ String> getIpMask() {
        return this.ipMask;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(NamespaceIpFilterRuleArgs.Builder a);
    }
    private static io.pulumi.azurenative.eventhub.NamespaceIpFilterRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.eventhub.NamespaceIpFilterRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public NamespaceIpFilterRule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NamespaceIpFilterRule(String name) {
        this(name, NamespaceIpFilterRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NamespaceIpFilterRule(String name, NamespaceIpFilterRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NamespaceIpFilterRule(String name, NamespaceIpFilterRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:NamespaceIpFilterRule", name, args == null ? NamespaceIpFilterRuleArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private NamespaceIpFilterRule(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:NamespaceIpFilterRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:eventhub/v20180101preview:NamespaceIpFilterRule").build())
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
    public static NamespaceIpFilterRule get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NamespaceIpFilterRule(name, id, options);
    }
}
