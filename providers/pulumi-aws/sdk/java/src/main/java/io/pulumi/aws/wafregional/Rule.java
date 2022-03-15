// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.wafregional.RuleArgs;
import io.pulumi.aws.wafregional.inputs.RuleState;
import io.pulumi.aws.wafregional.outputs.RulePredicate;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an WAF Regional Rule Resource for use with Application Load Balancer.
 * 
 * ## Example Usage
 * ## Nested Fields
 * 
 * ### `predicate`
 * 
 * See the [WAF Documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_Predicate.html) for more information.
 * 
 * #### Arguments
 * 
 * * `type` - (Required) The type of predicate in a rule. Valid values: `ByteMatch`, `GeoMatch`, `IPMatch`, `RegexMatch`, `SizeConstraint`, `SqlInjectionMatch`, or `XssMatch`
 * * `data_id` - (Required) The unique identifier of a predicate, such as the ID of a `ByteMatchSet` or `IPSet`.
 * * `negated` - (Required) Whether to use the settings or the negated settings that you specified in the objects.
 * 
 * ## Import
 * 
 * WAF Regional Rule can be imported using the id, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:wafregional/rule:Rule wafrule a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
 * ```
 * 
 */
@ResourceType(type="aws:wafregional/rule:Rule")
public class Rule extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the WAF Regional Rule.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the WAF Regional Rule.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name or description for the Amazon CloudWatch metric of this rule.
     * 
     */
    @Export(name="metricName", type=String.class, parameters={})
    private Output<String> metricName;

    /**
     * @return The name or description for the Amazon CloudWatch metric of this rule.
     * 
     */
    public Output<String> getMetricName() {
        return this.metricName;
    }
    /**
     * The name or description of the rule.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name or description of the rule.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The objects to include in a rule (documented below).
     * 
     */
    @Export(name="predicates", type=List.class, parameters={RulePredicate.class})
    private Output</* @Nullable */ List<RulePredicate>> predicates;

    /**
     * @return The objects to include in a rule (documented below).
     * 
     */
    public Output</* @Nullable */ List<RulePredicate>> getPredicates() {
        return this.predicates;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(RuleArgs.Builder a);
    }
    private static io.pulumi.aws.wafregional.RuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.wafregional.RuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Rule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Rule(String name) {
        this(name, RuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Rule(String name, RuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Rule(String name, RuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafregional/rule:Rule", name, args == null ? RuleArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Rule(String name, Output<String> id, @Nullable RuleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafregional/rule:Rule", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Rule get(String name, Output<String> id, @Nullable RuleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Rule(name, id, state, options);
    }
}
