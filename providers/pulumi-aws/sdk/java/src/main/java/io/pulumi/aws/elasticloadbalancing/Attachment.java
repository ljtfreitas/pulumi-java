// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elasticloadbalancing.AttachmentArgs;
import io.pulumi.aws.elasticloadbalancing.inputs.AttachmentState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Attaches an EC2 instance to an Elastic Load Balancer (ELB). For attaching resources with Application Load Balancer (ALB) or Network Load Balancer (NLB), see the `aws.lb.TargetGroupAttachment` resource.
 * 
 * > **NOTE on ELB Instances and ELB Attachments:** This provider currently provides
 * both a standalone ELB Attachment resource (describing an instance attached to
 * an ELB), and an Elastic Load Balancer resource with
 * `instances` defined in-line. At this time you cannot use an ELB with in-line
 * instances in conjunction with an ELB Attachment resource. Doing so will cause a
 * conflict and will overwrite attachments.
 * 
 * ## Example Usage
 * 
 * @deprecated
 * aws.elasticloadbalancing.Attachment has been deprecated in favor of aws.elb.Attachment
 * 
 */
@Deprecated /* aws.elasticloadbalancing.Attachment has been deprecated in favor of aws.elb.Attachment */
@ResourceType(type="aws:elasticloadbalancing/attachment:Attachment")
public class Attachment extends io.pulumi.resources.CustomResource {
    /**
     * The name of the ELB.
     * 
     */
    @OutputExport(name="elb", type=String.class, parameters={})
    private Output<String> elb;

    /**
     * @return The name of the ELB.
     * 
     */
    public Output<String> getElb() {
        return this.elb;
    }
    /**
     * Instance ID to place in the ELB pool.
     * 
     */
    @OutputExport(name="instance", type=String.class, parameters={})
    private Output<String> instance;

    /**
     * @return Instance ID to place in the ELB pool.
     * 
     */
    public Output<String> getInstance() {
        return this.instance;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Attachment(String name, AttachmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticloadbalancing/attachment:Attachment", name, args == null ? AttachmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Attachment(String name, Input<String> id, @Nullable AttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticloadbalancing/attachment:Attachment", name, state, makeResourceOptions(options, id));
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
    public static Attachment get(String name, Input<String> id, @Nullable AttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Attachment(name, id, state, options);
    }
}
