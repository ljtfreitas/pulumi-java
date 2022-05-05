// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.alb.TargetGroupArgs;
import com.pulumi.aws.alb.inputs.TargetGroupState;
import com.pulumi.aws.alb.outputs.TargetGroupHealthCheck;
import com.pulumi.aws.alb.outputs.TargetGroupStickiness;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Target Group resource for use with Load Balancer resources.
 * 
 * &gt; **Note:** `aws.alb.TargetGroup` is known as `aws.lb.TargetGroup`. The functionality is identical.
 * 
 * ## Example Usage
 * ### Instance Target Group
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
 *         var main = new Vpc(&#34;main&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var test = new TargetGroup(&#34;test&#34;, TargetGroupArgs.builder()        
 *             .port(80)
 *             .protocol(&#34;HTTP&#34;)
 *             .vpcId(main.getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### IP Target Group
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
 *         var main = new Vpc(&#34;main&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var ip_example = new TargetGroup(&#34;ip-example&#34;, TargetGroupArgs.builder()        
 *             .port(80)
 *             .protocol(&#34;HTTP&#34;)
 *             .targetType(&#34;ip&#34;)
 *             .vpcId(main.getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Lambda Target Group
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
 *         var lambda_example = new TargetGroup(&#34;lambda-example&#34;, TargetGroupArgs.builder()        
 *             .targetType(&#34;lambda&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### ALB Target Group
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
 *         var lambda_example = new TargetGroup(&#34;lambda-example&#34;, TargetGroupArgs.builder()        
 *             .targetType(&#34;alb&#34;)
 *             .port(80)
 *             .protocol(&#34;TCP&#34;)
 *             .vpcId(aws_vpc.getMain().getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Target Groups can be imported using their ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:alb/targetGroup:TargetGroup app_front_end arn:aws:elasticloadbalancing:us-west-2:187416307283:targetgroup/app-front-end/20cfe21448b66314
 * ```
 * 
 */
@ResourceType(type="aws:alb/targetGroup:TargetGroup")
public class TargetGroup extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the Target Group (matches `id`).
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the Target Group (matches `id`).
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * ARN suffix for use with CloudWatch Metrics.
     * 
     */
    @Export(name="arnSuffix", type=String.class, parameters={})
    private Output<String> arnSuffix;

    /**
     * @return ARN suffix for use with CloudWatch Metrics.
     * 
     */
    public Output<String> arnSuffix() {
        return this.arnSuffix;
    }
    /**
     * Whether to terminate connections at the end of the deregistration timeout on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#deregistration-delay) for more information. Default is `false`.
     * 
     */
    @Export(name="connectionTermination", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> connectionTermination;

    /**
     * @return Whether to terminate connections at the end of the deregistration timeout on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#deregistration-delay) for more information. Default is `false`.
     * 
     */
    public Output<Optional<Boolean>> connectionTermination() {
        return Codegen.optional(this.connectionTermination);
    }
    /**
     * Amount time for Elastic Load Balancing to wait before changing the state of a deregistering target from draining to unused. The range is 0-3600 seconds. The default value is 300 seconds.
     * 
     */
    @Export(name="deregistrationDelay", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> deregistrationDelay;

    /**
     * @return Amount time for Elastic Load Balancing to wait before changing the state of a deregistering target from draining to unused. The range is 0-3600 seconds. The default value is 300 seconds.
     * 
     */
    public Output<Optional<Integer>> deregistrationDelay() {
        return Codegen.optional(this.deregistrationDelay);
    }
    /**
     * Health Check configuration block. Detailed below.
     * 
     */
    @Export(name="healthCheck", type=TargetGroupHealthCheck.class, parameters={})
    private Output<TargetGroupHealthCheck> healthCheck;

    /**
     * @return Health Check configuration block. Detailed below.
     * 
     */
    public Output<TargetGroupHealthCheck> healthCheck() {
        return this.healthCheck;
    }
    /**
     * Whether the request and response headers exchanged between the load balancer and the Lambda function include arrays of values or strings. Only applies when `target_type` is `lambda`. Default is `false`.
     * 
     */
    @Export(name="lambdaMultiValueHeadersEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> lambdaMultiValueHeadersEnabled;

    /**
     * @return Whether the request and response headers exchanged between the load balancer and the Lambda function include arrays of values or strings. Only applies when `target_type` is `lambda`. Default is `false`.
     * 
     */
    public Output<Optional<Boolean>> lambdaMultiValueHeadersEnabled() {
        return Codegen.optional(this.lambdaMultiValueHeadersEnabled);
    }
    /**
     * Determines how the load balancer selects targets when routing requests. Only applicable for Application Load Balancer Target Groups. The value is `round_robin` or `least_outstanding_requests`. The default is `round_robin`.
     * 
     */
    @Export(name="loadBalancingAlgorithmType", type=String.class, parameters={})
    private Output<String> loadBalancingAlgorithmType;

    /**
     * @return Determines how the load balancer selects targets when routing requests. Only applicable for Application Load Balancer Target Groups. The value is `round_robin` or `least_outstanding_requests`. The default is `round_robin`.
     * 
     */
    public Output<String> loadBalancingAlgorithmType() {
        return this.loadBalancingAlgorithmType;
    }
    /**
     * Name of the target group. If omitted, this provider will assign a random, unique name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the target group. If omitted, this provider will assign a random, unique name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Cannot be longer than 6 characters.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`. Cannot be longer than 6 characters.
     * 
     */
    public Output<Optional<String>> namePrefix() {
        return Codegen.optional(this.namePrefix);
    }
    /**
     * Port to use to connect with the target. Valid values are either ports 1-65535, or `traffic-port`. Defaults to `traffic-port`.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return Port to use to connect with the target. Valid values are either ports 1-65535, or `traffic-port`. Defaults to `traffic-port`.
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    /**
     * Whether client IP preservation is enabled. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#client-ip-preservation) for more information.
     * 
     */
    @Export(name="preserveClientIp", type=String.class, parameters={})
    private Output<String> preserveClientIp;

    /**
     * @return Whether client IP preservation is enabled. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#client-ip-preservation) for more information.
     * 
     */
    public Output<String> preserveClientIp() {
        return this.preserveClientIp;
    }
    /**
     * Protocol to use to connect with the target. Defaults to `HTTP`. Not applicable when `target_type` is `lambda`.
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> protocol;

    /**
     * @return Protocol to use to connect with the target. Defaults to `HTTP`. Not applicable when `target_type` is `lambda`.
     * 
     */
    public Output<Optional<String>> protocol() {
        return Codegen.optional(this.protocol);
    }
    /**
     * Only applicable when `protocol` is `HTTP` or `HTTPS`. The protocol version. Specify GRPC to send requests to targets using gRPC. Specify HTTP2 to send requests to targets using HTTP/2. The default is HTTP1, which sends requests to targets using HTTP/1.1
     * 
     */
    @Export(name="protocolVersion", type=String.class, parameters={})
    private Output<String> protocolVersion;

    /**
     * @return Only applicable when `protocol` is `HTTP` or `HTTPS`. The protocol version. Specify GRPC to send requests to targets using gRPC. Specify HTTP2 to send requests to targets using HTTP/2. The default is HTTP1, which sends requests to targets using HTTP/1.1
     * 
     */
    public Output<String> protocolVersion() {
        return this.protocolVersion;
    }
    /**
     * Whether to enable support for proxy protocol v2 on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#proxy-protocol) for more information. Default is `false`.
     * 
     */
    @Export(name="proxyProtocolV2", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> proxyProtocolV2;

    /**
     * @return Whether to enable support for proxy protocol v2 on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#proxy-protocol) for more information. Default is `false`.
     * 
     */
    public Output<Optional<Boolean>> proxyProtocolV2() {
        return Codegen.optional(this.proxyProtocolV2);
    }
    /**
     * Amount time for targets to warm up before the load balancer sends them a full share of requests. The range is 30-900 seconds or 0 to disable. The default value is 0 seconds.
     * 
     */
    @Export(name="slowStart", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> slowStart;

    /**
     * @return Amount time for targets to warm up before the load balancer sends them a full share of requests. The range is 30-900 seconds or 0 to disable. The default value is 0 seconds.
     * 
     */
    public Output<Optional<Integer>> slowStart() {
        return Codegen.optional(this.slowStart);
    }
    /**
     * Stickiness configuration block. Detailed below.
     * 
     */
    @Export(name="stickiness", type=TargetGroupStickiness.class, parameters={})
    private Output<TargetGroupStickiness> stickiness;

    /**
     * @return Stickiness configuration block. Detailed below.
     * 
     */
    public Output<TargetGroupStickiness> stickiness() {
        return this.stickiness;
    }
    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
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
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Type of target that you must specify when registering targets with this target group. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_CreateTargetGroup.html) for supported values. The default is `instance`.
     * 
     */
    @Export(name="targetType", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetType;

    /**
     * @return Type of target that you must specify when registering targets with this target group. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_CreateTargetGroup.html) for supported values. The default is `instance`.
     * 
     */
    public Output<Optional<String>> targetType() {
        return Codegen.optional(this.targetType);
    }
    /**
     * Identifier of the VPC in which to create the target group. Required when `target_type` is `instance`, `ip` or `alb`. Does not apply when `target_type` is `lambda`.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpcId;

    /**
     * @return Identifier of the VPC in which to create the target group. Required when `target_type` is `instance`, `ip` or `alb`. Does not apply when `target_type` is `lambda`.
     * 
     */
    public Output<Optional<String>> vpcId() {
        return Codegen.optional(this.vpcId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TargetGroup(String name) {
        this(name, TargetGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TargetGroup(String name, @Nullable TargetGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TargetGroup(String name, @Nullable TargetGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:alb/targetGroup:TargetGroup", name, args == null ? TargetGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TargetGroup(String name, Output<String> id, @Nullable TargetGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:alb/targetGroup:TargetGroup", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("aws:applicationloadbalancing/targetGroup:TargetGroup").build())
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
    public static TargetGroup get(String name, Output<String> id, @Nullable TargetGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TargetGroup(name, id, state, options);
    }
}
