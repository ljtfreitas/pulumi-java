// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.wafv2.RuleGroupArgs;
import io.pulumi.awsnative.wafv2.enums.RuleGroupScope;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupCustomResponseBodies;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupLabelSummary;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupRule;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupTag;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupVisibilityConfig;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Contains the Rules that identify the requests that you want to allow, block, or count. In a RuleGroup, you also specify a default action (ALLOW or BLOCK), and the action for each Rule that you add to a RuleGroup, for example, block requests from specified IP addresses or block requests from specified referrers. You also associate the RuleGroup with a CloudFront distribution to identify the requests that you want AWS WAF to filter. If you add more than one Rule to a RuleGroup, a request needs to match only one of the specifications to be allowed, blocked, or counted.
 * 
 */
@ResourceType(type="aws-native:wafv2:RuleGroup")
public class RuleGroup extends io.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Collection of Available Labels.
     * 
     */
    @Export(name="availableLabels", type=List.class, parameters={RuleGroupLabelSummary.class})
    private Output<List<RuleGroupLabelSummary>> availableLabels;

    /**
     * @return Collection of Available Labels.
     * 
     */
    public Output<List<RuleGroupLabelSummary>> getAvailableLabels() {
        return this.availableLabels;
    }
    @Export(name="capacity", type=Integer.class, parameters={})
    private Output<Integer> capacity;

    public Output<Integer> getCapacity() {
        return this.capacity;
    }
    /**
     * Collection of Consumed Labels.
     * 
     */
    @Export(name="consumedLabels", type=List.class, parameters={RuleGroupLabelSummary.class})
    private Output<List<RuleGroupLabelSummary>> consumedLabels;

    /**
     * @return Collection of Consumed Labels.
     * 
     */
    public Output<List<RuleGroupLabelSummary>> getConsumedLabels() {
        return this.consumedLabels;
    }
    @Export(name="customResponseBodies", type=RuleGroupCustomResponseBodies.class, parameters={})
    private Output</* @Nullable */ RuleGroupCustomResponseBodies> customResponseBodies;

    public Output</* @Nullable */ RuleGroupCustomResponseBodies> getCustomResponseBodies() {
        return this.customResponseBodies;
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @Export(name="labelNamespace", type=String.class, parameters={})
    private Output<String> labelNamespace;

    public Output<String> getLabelNamespace() {
        return this.labelNamespace;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * Collection of Rules.
     * 
     */
    @Export(name="rules", type=List.class, parameters={RuleGroupRule.class})
    private Output</* @Nullable */ List<RuleGroupRule>> rules;

    /**
     * @return Collection of Rules.
     * 
     */
    public Output</* @Nullable */ List<RuleGroupRule>> getRules() {
        return this.rules;
    }
    @Export(name="scope", type=RuleGroupScope.class, parameters={})
    private Output<RuleGroupScope> scope;

    public Output<RuleGroupScope> getScope() {
        return this.scope;
    }
    @Export(name="tags", type=List.class, parameters={RuleGroupTag.class})
    private Output</* @Nullable */ List<RuleGroupTag>> tags;

    public Output</* @Nullable */ List<RuleGroupTag>> getTags() {
        return this.tags;
    }
    @Export(name="visibilityConfig", type=RuleGroupVisibilityConfig.class, parameters={})
    private Output<RuleGroupVisibilityConfig> visibilityConfig;

    public Output<RuleGroupVisibilityConfig> getVisibilityConfig() {
        return this.visibilityConfig;
    }

    public interface BuilderApplicator {
        public void apply(RuleGroupArgs.Builder a);
    }
    private static io.pulumi.awsnative.wafv2.RuleGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.wafv2.RuleGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RuleGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RuleGroup(String name) {
        this(name, RuleGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RuleGroup(String name, RuleGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RuleGroup(String name, RuleGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:wafv2:RuleGroup", name, args == null ? RuleGroupArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private RuleGroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:wafv2:RuleGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static RuleGroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RuleGroup(name, id, options);
    }
}
