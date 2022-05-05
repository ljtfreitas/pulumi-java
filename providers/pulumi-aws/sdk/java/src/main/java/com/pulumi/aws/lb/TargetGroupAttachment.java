// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lb.TargetGroupAttachmentArgs;
import com.pulumi.aws.lb.inputs.TargetGroupAttachmentState;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides the ability to register instances and containers with an Application Load Balancer (ALB) or Network Load Balancer (NLB) target group. For attaching resources with Elastic Load Balancer (ELB), see the `aws.elb.Attachment` resource.
 * 
 * &gt; **Note:** `aws.alb.TargetGroupAttachment` is known as `aws.lb.TargetGroupAttachment`. The functionality is identical.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var testTargetGroup = new TargetGroup(&#34;testTargetGroup&#34;);
 * 
 *         var testInstance = new Instance(&#34;testInstance&#34;);
 * 
 *         var testTargetGroupAttachment = new TargetGroupAttachment(&#34;testTargetGroupAttachment&#34;, TargetGroupAttachmentArgs.builder()        
 *             .targetGroupArn(testTargetGroup.getArn())
 *             .targetId(testInstance.getId())
 *             .port(80)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ## Usage with lambda
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var testTargetGroup = new TargetGroup(&#34;testTargetGroup&#34;, TargetGroupArgs.builder()        
 *             .targetType(&#34;lambda&#34;)
 *             .build());
 * 
 *         var testFunction = new Function(&#34;testFunction&#34;);
 * 
 *         var withLb = new Permission(&#34;withLb&#34;, PermissionArgs.builder()        
 *             .action(&#34;lambda:InvokeFunction&#34;)
 *             .function(testFunction.getArn())
 *             .principal(&#34;elasticloadbalancing.amazonaws.com&#34;)
 *             .sourceArn(testTargetGroup.getArn())
 *             .build());
 * 
 *         var testTargetGroupAttachment = new TargetGroupAttachment(&#34;testTargetGroupAttachment&#34;, TargetGroupAttachmentArgs.builder()        
 *             .targetGroupArn(testTargetGroup.getArn())
 *             .targetId(testFunction.getArn())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Target Group Attachments cannot be imported.
 * 
 */
@ResourceType(type="aws:lb/targetGroupAttachment:TargetGroupAttachment")
public class TargetGroupAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to &#39;all&#39;.
     * 
     */
    @Export(name="availabilityZone", type=String.class, parameters={})
    private Output</* @Nullable */ String> availabilityZone;

    /**
     * @return The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to &#39;all&#39;.
     * 
     */
    public Output<Optional<String>> availabilityZone() {
        return Codegen.optional(this.availabilityZone);
    }
    /**
     * The port on which targets receive traffic.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return The port on which targets receive traffic.
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    /**
     * The ARN of the target group with which to register targets
     * 
     */
    @Export(name="targetGroupArn", type=String.class, parameters={})
    private Output<String> targetGroupArn;

    /**
     * @return The ARN of the target group with which to register targets
     * 
     */
    public Output<String> targetGroupArn() {
        return this.targetGroupArn;
    }
    /**
     * The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda. If the target type is alb, specify the arn of alb.
     * 
     */
    @Export(name="targetId", type=String.class, parameters={})
    private Output<String> targetId;

    /**
     * @return The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda. If the target type is alb, specify the arn of alb.
     * 
     */
    public Output<String> targetId() {
        return this.targetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TargetGroupAttachment(String name) {
        this(name, TargetGroupAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TargetGroupAttachment(String name, TargetGroupAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TargetGroupAttachment(String name, TargetGroupAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lb/targetGroupAttachment:TargetGroupAttachment", name, args == null ? TargetGroupAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TargetGroupAttachment(String name, Output<String> id, @Nullable TargetGroupAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lb/targetGroupAttachment:TargetGroupAttachment", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("aws:elasticloadbalancingv2/targetGroupAttachment:TargetGroupAttachment").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static TargetGroupAttachment get(String name, Output<String> id, @Nullable TargetGroupAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TargetGroupAttachment(name, id, state, options);
    }
}
