// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logz.MetricsSourceTagRuleArgs;
import io.pulumi.azurenative.logz.outputs.MetricsTagRulesPropertiesResponse;
import io.pulumi.azurenative.logz.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Capture metrics of Azure resources based on ARM tags.
 * API Version: 2022-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:logz:MetricsSourceTagRule default /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.Logz/monitors/myMonitor/metricsSource/MetricsSource1/tagRules/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:logz:MetricsSourceTagRule")
public class MetricsSourceTagRule extends io.pulumi.resources.CustomResource {
    /**
     * Name of the rule set.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the rule set.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Definition of the properties for a TagRules resource.
     * 
     */
    @Export(name="properties", type=MetricsTagRulesPropertiesResponse.class, parameters={})
    private Output<MetricsTagRulesPropertiesResponse> properties;

    /**
     * @return Definition of the properties for a TagRules resource.
     * 
     */
    public Output<MetricsTagRulesPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * The system metadata relating to this resource
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the rule set.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the rule set.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(MetricsSourceTagRuleArgs.Builder a);
    }
    private static io.pulumi.azurenative.logz.MetricsSourceTagRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.logz.MetricsSourceTagRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public MetricsSourceTagRule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MetricsSourceTagRule(String name) {
        this(name, MetricsSourceTagRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MetricsSourceTagRule(String name, MetricsSourceTagRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MetricsSourceTagRule(String name, MetricsSourceTagRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logz:MetricsSourceTagRule", name, args == null ? MetricsSourceTagRuleArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private MetricsSourceTagRule(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logz:MetricsSourceTagRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:logz/v20220101preview:MetricsSourceTagRule").build())
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
    public static MetricsSourceTagRule get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MetricsSourceTagRule(name, id, options);
    }
}
