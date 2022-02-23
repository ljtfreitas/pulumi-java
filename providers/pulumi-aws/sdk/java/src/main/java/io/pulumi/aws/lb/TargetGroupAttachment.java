// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.lb.TargetGroupAttachmentArgs;
import io.pulumi.aws.lb.inputs.TargetGroupAttachmentState;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides the ability to register instances and containers with an Application Load Balancer (ALB) or Network Load Balancer (NLB) target group. For attaching resources with Elastic Load Balancer (ELB), see the `aws.elb.Attachment` resource.
 * 
 * > **Note:** `aws.alb.TargetGroupAttachment` is known as `aws.lb.TargetGroupAttachment`. The functionality is identical.
 * 
 * ## Example Usage
 * ## Usage with lambda
 * 
 * ## Import
 * 
 * Target Group Attachments cannot be imported.
 * 
 */
@ResourceType(type="aws:lb/targetGroupAttachment:TargetGroupAttachment")
public class TargetGroupAttachment extends io.pulumi.resources.CustomResource {
    /**
     * The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to 'all'.
     * 
     */
    @OutputExport(name="availabilityZone", type=String.class, parameters={})
    private Output</* @Nullable */ String> availabilityZone;

    /**
     * @return The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to 'all'.
     * 
     */
    public Output</* @Nullable */ String> getAvailabilityZone() {
        return this.availabilityZone;
    }
    /**
     * The port on which targets receive traffic.
     * 
     */
    @OutputExport(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return The port on which targets receive traffic.
     * 
     */
    public Output</* @Nullable */ Integer> getPort() {
        return this.port;
    }
    /**
     * The ARN of the target group with which to register targets
     * 
     */
    @OutputExport(name="targetGroupArn", type=String.class, parameters={})
    private Output<String> targetGroupArn;

    /**
     * @return The ARN of the target group with which to register targets
     * 
     */
    public Output<String> getTargetGroupArn() {
        return this.targetGroupArn;
    }
    /**
     * The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda. If the target type is alb, specify the arn of alb.
     * 
     */
    @OutputExport(name="targetId", type=String.class, parameters={})
    private Output<String> targetId;

    /**
     * @return The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda. If the target type is alb, specify the arn of alb.
     * 
     */
    public Output<String> getTargetId() {
        return this.targetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TargetGroupAttachment(String name, TargetGroupAttachmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:lb/targetGroupAttachment:TargetGroupAttachment", name, args == null ? TargetGroupAttachmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TargetGroupAttachment(String name, Input<String> id, @Nullable TargetGroupAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:lb/targetGroupAttachment:TargetGroupAttachment", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("aws:elasticloadbalancingv2/targetGroupAttachment:TargetGroupAttachment").build())
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TargetGroupAttachment get(String name, Input<String> id, @Nullable TargetGroupAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TargetGroupAttachment(name, id, state, options);
    }
}
