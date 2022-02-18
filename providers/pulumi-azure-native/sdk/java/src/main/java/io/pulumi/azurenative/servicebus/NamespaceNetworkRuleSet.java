// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicebus.NamespaceNetworkRuleSetArgs;
import io.pulumi.azurenative.servicebus.outputs.NWRuleSetIpRulesResponse;
import io.pulumi.azurenative.servicebus.outputs.NWRuleSetVirtualNetworkRulesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Description of NetworkRuleSet resource.
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:servicebus:NamespaceNetworkRuleSet default /subscriptions/854d368f-1828-428f-8f3c-f2affa9b2f7d/resourceGroups/resourcegroupid/providers/Microsoft.ServiceBus/namespaces/sdk-Namespace-9659/networkrulesets/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:servicebus:NamespaceNetworkRuleSet")
public class NamespaceNetworkRuleSet extends io.pulumi.resources.CustomResource {
    /**
     * Default Action for Network Rule Set
     * 
     */
    @OutputExport(name="defaultAction", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultAction;

    /**
     * @return Default Action for Network Rule Set
     * 
     */
    public Output</* @Nullable */ String> getDefaultAction() {
        return this.defaultAction;
    }
    /**
     * List of IpRules
     * 
     */
    @OutputExport(name="ipRules", type=List.class, parameters={NWRuleSetIpRulesResponse.class})
    private Output</* @Nullable */ List<NWRuleSetIpRulesResponse>> ipRules;

    /**
     * @return List of IpRules
     * 
     */
    public Output</* @Nullable */ List<NWRuleSetIpRulesResponse>> getIpRules() {
        return this.ipRules;
    }
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * List VirtualNetwork Rules
     * 
     */
    @OutputExport(name="virtualNetworkRules", type=List.class, parameters={NWRuleSetVirtualNetworkRulesResponse.class})
    private Output</* @Nullable */ List<NWRuleSetVirtualNetworkRulesResponse>> virtualNetworkRules;

    /**
     * @return List VirtualNetwork Rules
     * 
     */
    public Output</* @Nullable */ List<NWRuleSetVirtualNetworkRulesResponse>> getVirtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NamespaceNetworkRuleSet(String name, NamespaceNetworkRuleSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicebus:NamespaceNetworkRuleSet", name, args == null ? NamespaceNetworkRuleSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NamespaceNetworkRuleSet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicebus:NamespaceNetworkRuleSet", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:servicebus/v20170401:NamespaceNetworkRuleSet").build()),
                Input.of(Alias.builder().setType("azure-native:servicebus/v20180101preview:NamespaceNetworkRuleSet").build()),
                Input.of(Alias.builder().setType("azure-native:servicebus/v20210101preview:NamespaceNetworkRuleSet").build()),
                Input.of(Alias.builder().setType("azure-native:servicebus/v20210601preview:NamespaceNetworkRuleSet").build()),
                Input.of(Alias.builder().setType("azure-native:servicebus/v20211101:NamespaceNetworkRuleSet").build())
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
    public static NamespaceNetworkRuleSet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NamespaceNetworkRuleSet(name, id, options);
    }
}
