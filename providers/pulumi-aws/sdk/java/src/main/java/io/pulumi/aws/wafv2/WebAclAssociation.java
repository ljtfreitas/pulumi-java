// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.wafv2.WebAclAssociationArgs;
import io.pulumi.aws.wafv2.inputs.WebAclAssociationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a WAFv2 Web ACL Association.
 * 
 * > **NOTE on associating a WAFv2 Web ACL with a Cloudfront distribution:** Do not use this resource to associate a WAFv2 Web ACL with a Cloudfront Distribution. The [AWS API call backing this resource](https://docs.aws.amazon.com/waf/latest/APIReference/API_AssociateWebACL.html) notes that you should use the [`web_acl_id`][2] property on the [`cloudfront_distribution`][2] instead.
 * 
 * [1]: https://docs.aws.amazon.com/waf/latest/APIReference/API_AssociateWebACL.html
 * [2]: https://www.terraform.io/docs/providers/aws/r/cloudfront_distribution.html#web_acl_id
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * WAFv2 Web ACL Association can be imported using `WEB_ACL_ARN,RESOURCE_ARN` e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:wafv2/webAclAssociation:WebAclAssociation example arn:aws:wafv2:...7ce849ea,arn:aws:apigateway:...ages/name
 * ```
 * 
 */
@ResourceType(type="aws:wafv2/webAclAssociation:WebAclAssociation")
public class WebAclAssociation extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer or an Amazon API Gateway stage.
     * 
     */
    @Export(name="resourceArn", type=String.class, parameters={})
    private Output<String> resourceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the resource to associate with the web ACL. This must be an ARN of an Application Load Balancer or an Amazon API Gateway stage.
     * 
     */
    public Output<String> getResourceArn() {
        return this.resourceArn;
    }
    /**
     * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     * 
     */
    @Export(name="webAclArn", type=String.class, parameters={})
    private Output<String> webAclArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     * 
     */
    public Output<String> getWebAclArn() {
        return this.webAclArn;
    }

    public interface BuilderApplicator {
        public void apply(WebAclAssociationArgs.Builder a);
    }
    private static io.pulumi.aws.wafv2.WebAclAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.wafv2.WebAclAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public WebAclAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAclAssociation(String name) {
        this(name, WebAclAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAclAssociation(String name, WebAclAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAclAssociation(String name, WebAclAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafv2/webAclAssociation:WebAclAssociation", name, args == null ? WebAclAssociationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private WebAclAssociation(String name, Output<String> id, @Nullable WebAclAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafv2/webAclAssociation:WebAclAssociation", name, state, makeResourceOptions(options, id));
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
    public static WebAclAssociation get(String name, Output<String> id, @Nullable WebAclAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAclAssociation(name, id, state, options);
    }
}
