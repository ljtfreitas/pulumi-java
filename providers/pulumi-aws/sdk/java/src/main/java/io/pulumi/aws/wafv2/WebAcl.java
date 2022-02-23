// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.wafv2.WebAclArgs;
import io.pulumi.aws.wafv2.inputs.WebAclState;
import io.pulumi.aws.wafv2.outputs.WebAclCustomResponseBody;
import io.pulumi.aws.wafv2.outputs.WebAclDefaultAction;
import io.pulumi.aws.wafv2.outputs.WebAclRule;
import io.pulumi.aws.wafv2.outputs.WebAclVisibilityConfig;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a WAFv2 Web ACL resource.
 * 
 * ## Example Usage
 * 
 * This resource is based on `aws.wafv2.RuleGroup`, check the documentation of the `aws.wafv2.RuleGroup` resource to see examples of the various available statements.
 * 
 * ## Import
 * 
 * WAFv2 Web ACLs can be imported using `ID/Name/Scope` e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:wafv2/webAcl:WebAcl example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc/example/REGIONAL
 * ```
 * 
 */
@ResourceType(type="aws:wafv2/webAcl:WebAcl")
public class WebAcl extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The web ACL capacity units (WCUs) currently being used by this web ACL.
     * 
     */
    @OutputExport(name="capacity", type=Integer.class, parameters={})
    private Output<Integer> capacity;

    /**
     * @return The web ACL capacity units (WCUs) currently being used by this web ACL.
     * 
     */
    public Output<Integer> getCapacity() {
        return this.capacity;
    }
    /**
     * Defines custom response bodies that can be referenced by `custom_response` actions. See Custom Response Body below for details.
     * 
     */
    @OutputExport(name="customResponseBodies", type=List.class, parameters={WebAclCustomResponseBody.class})
    private Output</* @Nullable */ List<WebAclCustomResponseBody>> customResponseBodies;

    /**
     * @return Defines custom response bodies that can be referenced by `custom_response` actions. See Custom Response Body below for details.
     * 
     */
    public Output</* @Nullable */ List<WebAclCustomResponseBody>> getCustomResponseBodies() {
        return this.customResponseBodies;
    }
    /**
     * The action to perform if none of the `rules` contained in the WebACL match. See Default Action below for details.
     * 
     */
    @OutputExport(name="defaultAction", type=WebAclDefaultAction.class, parameters={})
    private Output<WebAclDefaultAction> defaultAction;

    /**
     * @return The action to perform if none of the `rules` contained in the WebACL match. See Default Action below for details.
     * 
     */
    public Output<WebAclDefaultAction> getDefaultAction() {
        return this.defaultAction;
    }
    /**
     * A friendly description of the WebACL.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A friendly description of the WebACL.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="lockToken", type=String.class, parameters={})
    private Output<String> lockToken;

    public Output<String> getLockToken() {
        return this.lockToken;
    }
    /**
     * The label string.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The label string.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
     * 
     */
    @OutputExport(name="rules", type=List.class, parameters={WebAclRule.class})
    private Output</* @Nullable */ List<WebAclRule>> rules;

    /**
     * @return The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
     * 
     */
    public Output</* @Nullable */ List<WebAclRule>> getRules() {
        return this.rules;
    }
    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    @OutputExport(name="scope", type=String.class, parameters={})
    private Output<String> scope;

    /**
     * @return Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    public Output<String> getScope() {
        return this.scope;
    }
    /**
     * An map of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return An map of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    @OutputExport(name="visibilityConfig", type=WebAclVisibilityConfig.class, parameters={})
    private Output<WebAclVisibilityConfig> visibilityConfig;

    /**
     * @return Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    public Output<WebAclVisibilityConfig> getVisibilityConfig() {
        return this.visibilityConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAcl(String name, WebAclArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafv2/webAcl:WebAcl", name, args == null ? WebAclArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebAcl(String name, Input<String> id, @Nullable WebAclState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafv2/webAcl:WebAcl", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
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
    public static WebAcl get(String name, Input<String> id, @Nullable WebAclState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAcl(name, id, state, options);
    }
}
