// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.waf.WebAclArgs;
import io.pulumi.aws.waf.inputs.WebAclState;
import io.pulumi.aws.waf.outputs.WebAclDefaultAction;
import io.pulumi.aws.waf.outputs.WebAclLoggingConfiguration;
import io.pulumi.aws.waf.outputs.WebAclRule;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a WAF Web ACL Resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * WAF Web ACL can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:waf/webAcl:WebAcl main 0c8e583e-18f3-4c13-9e2a-67c4805d2f94
 * ```
 * 
 */
@ResourceType(type="aws:waf/webAcl:WebAcl")
public class WebAcl extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the WAF WebACL.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the WAF WebACL.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Configuration block with action that you want AWS WAF to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL. Detailed below.
     * 
     */
    @Export(name="defaultAction", type=WebAclDefaultAction.class, parameters={})
    private Output<WebAclDefaultAction> defaultAction;

    /**
     * @return Configuration block with action that you want AWS WAF to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL. Detailed below.
     * 
     */
    public Output<WebAclDefaultAction> getDefaultAction() {
        return this.defaultAction;
    }
    /**
     * Configuration block to enable WAF logging. Detailed below.
     * 
     */
    @Export(name="loggingConfiguration", type=WebAclLoggingConfiguration.class, parameters={})
    private Output</* @Nullable */ WebAclLoggingConfiguration> loggingConfiguration;

    /**
     * @return Configuration block to enable WAF logging. Detailed below.
     * 
     */
    public Output</* @Nullable */ WebAclLoggingConfiguration> getLoggingConfiguration() {
        return this.loggingConfiguration;
    }
    /**
     * The name or description for the Amazon CloudWatch metric of this web ACL.
     * 
     */
    @Export(name="metricName", type=String.class, parameters={})
    private Output<String> metricName;

    /**
     * @return The name or description for the Amazon CloudWatch metric of this web ACL.
     * 
     */
    public Output<String> getMetricName() {
        return this.metricName;
    }
    /**
     * The name or description of the web ACL.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name or description of the web ACL.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Configuration blocks containing rules to associate with the web ACL and the settings for each rule. Detailed below.
     * 
     */
    @Export(name="rules", type=List.class, parameters={WebAclRule.class})
    private Output</* @Nullable */ List<WebAclRule>> rules;

    /**
     * @return Configuration blocks containing rules to associate with the web ACL and the settings for each rule. Detailed below.
     * 
     */
    public Output</* @Nullable */ List<WebAclRule>> getRules() {
        return this.rules;
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
        public void apply(WebAclArgs.Builder a);
    }
    private static io.pulumi.aws.waf.WebAclArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.waf.WebAclArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public WebAcl(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAcl(String name) {
        this(name, WebAclArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAcl(String name, WebAclArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAcl(String name, WebAclArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/webAcl:WebAcl", name, args == null ? WebAclArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private WebAcl(String name, Output<String> id, @Nullable WebAclState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/webAcl:WebAcl", name, state, makeResourceOptions(options, id));
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
    public static WebAcl get(String name, Output<String> id, @Nullable WebAclState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAcl(name, id, state, options);
    }
}
