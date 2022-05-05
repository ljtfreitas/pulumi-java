// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.alb.LoadBalancerArgs;
import com.pulumi.aws.alb.inputs.LoadBalancerState;
import com.pulumi.aws.alb.outputs.LoadBalancerAccessLogs;
import com.pulumi.aws.alb.outputs.LoadBalancerSubnetMapping;
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
 * Provides a Load Balancer resource.
 * 
 * &gt; **Note:** `aws.alb.LoadBalancer` is known as `aws.lb.LoadBalancer`. The functionality is identical.
 * 
 * ## Example Usage
 * ### Specifying Elastic IPs
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
 *         var example = new LoadBalancer(&#34;example&#34;, LoadBalancerArgs.builder()        
 *             .loadBalancerType(&#34;network&#34;)
 *             .subnetMappings(            
 *                 LoadBalancerSubnetMapping.builder()
 *                     .subnetId(aws_subnet.getExample1().getId())
 *                     .allocationId(aws_eip.getExample1().getId())
 *                     .build(),
 *                 LoadBalancerSubnetMapping.builder()
 *                     .subnetId(aws_subnet.getExample2().getId())
 *                     .allocationId(aws_eip.getExample2().getId())
 *                     .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Specifying private IP addresses for an internal-facing load balancer
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
 *         var example = new LoadBalancer(&#34;example&#34;, LoadBalancerArgs.builder()        
 *             .loadBalancerType(&#34;network&#34;)
 *             .subnetMappings(            
 *                 LoadBalancerSubnetMapping.builder()
 *                     .subnetId(aws_subnet.getExample1().getId())
 *                     .privateIpv4Address(&#34;10.0.1.15&#34;)
 *                     .build(),
 *                 LoadBalancerSubnetMapping.builder()
 *                     .subnetId(aws_subnet.getExample2().getId())
 *                     .privateIpv4Address(&#34;10.0.2.15&#34;)
 *                     .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * LBs can be imported using their ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:alb/loadBalancer:LoadBalancer bar arn:aws:elasticloadbalancing:us-west-2:123456789012:loadbalancer/app/my-load-balancer/50dc6c495c0c9188
 * ```
 * 
 */
@ResourceType(type="aws:alb/loadBalancer:LoadBalancer")
public class LoadBalancer extends com.pulumi.resources.CustomResource {
    /**
     * An Access Logs block. Access Logs documented below.
     * 
     */
    @Export(name="accessLogs", type=LoadBalancerAccessLogs.class, parameters={})
    private Output</* @Nullable */ LoadBalancerAccessLogs> accessLogs;

    /**
     * @return An Access Logs block. Access Logs documented below.
     * 
     */
    public Output<Optional<LoadBalancerAccessLogs>> accessLogs() {
        return Codegen.optional(this.accessLogs);
    }
    /**
     * The ARN of the load balancer (matches `id`).
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the load balancer (matches `id`).
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ARN suffix for use with CloudWatch Metrics.
     * 
     */
    @Export(name="arnSuffix", type=String.class, parameters={})
    private Output<String> arnSuffix;

    /**
     * @return The ARN suffix for use with CloudWatch Metrics.
     * 
     */
    public Output<String> arnSuffix() {
        return this.arnSuffix;
    }
    /**
     * The ID of the customer owned ipv4 pool to use for this load balancer.
     * 
     */
    @Export(name="customerOwnedIpv4Pool", type=String.class, parameters={})
    private Output</* @Nullable */ String> customerOwnedIpv4Pool;

    /**
     * @return The ID of the customer owned ipv4 pool to use for this load balancer.
     * 
     */
    public Output<Optional<String>> customerOwnedIpv4Pool() {
        return Codegen.optional(this.customerOwnedIpv4Pool);
    }
    /**
     * Determines how the load balancer handles requests that might pose a security risk to an application due to HTTP desync. Valid values are `monitor`, `defensive` (default), `strictest`.
     * 
     */
    @Export(name="desyncMitigationMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> desyncMitigationMode;

    /**
     * @return Determines how the load balancer handles requests that might pose a security risk to an application due to HTTP desync. Valid values are `monitor`, `defensive` (default), `strictest`.
     * 
     */
    public Output<Optional<String>> desyncMitigationMode() {
        return Codegen.optional(this.desyncMitigationMode);
    }
    /**
     * The DNS name of the load balancer.
     * 
     */
    @Export(name="dnsName", type=String.class, parameters={})
    private Output<String> dnsName;

    /**
     * @return The DNS name of the load balancer.
     * 
     */
    public Output<String> dnsName() {
        return this.dnsName;
    }
    /**
     * Indicates whether HTTP headers with header fields that are not valid are removed by the load balancer (true) or routed to targets (false). The default is false. Elastic Load Balancing requires that message header names contain only alphanumeric characters and hyphens. Only valid for Load Balancers of type `application`.
     * 
     */
    @Export(name="dropInvalidHeaderFields", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> dropInvalidHeaderFields;

    /**
     * @return Indicates whether HTTP headers with header fields that are not valid are removed by the load balancer (true) or routed to targets (false). The default is false. Elastic Load Balancing requires that message header names contain only alphanumeric characters and hyphens. Only valid for Load Balancers of type `application`.
     * 
     */
    public Output<Optional<Boolean>> dropInvalidHeaderFields() {
        return Codegen.optional(this.dropInvalidHeaderFields);
    }
    /**
     * If true, cross-zone load balancing of the load balancer will be enabled.
     * This is a `network` load balancer feature. Defaults to `false`.
     * 
     */
    @Export(name="enableCrossZoneLoadBalancing", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableCrossZoneLoadBalancing;

    /**
     * @return If true, cross-zone load balancing of the load balancer will be enabled.
     * This is a `network` load balancer feature. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> enableCrossZoneLoadBalancing() {
        return Codegen.optional(this.enableCrossZoneLoadBalancing);
    }
    /**
     * If true, deletion of the load balancer will be disabled via
     * the AWS API. This will prevent this provider from deleting the load balancer. Defaults to `false`.
     * 
     */
    @Export(name="enableDeletionProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableDeletionProtection;

    /**
     * @return If true, deletion of the load balancer will be disabled via
     * the AWS API. This will prevent this provider from deleting the load balancer. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> enableDeletionProtection() {
        return Codegen.optional(this.enableDeletionProtection);
    }
    /**
     * Indicates whether HTTP/2 is enabled in `application` load balancers. Defaults to `true`.
     * 
     */
    @Export(name="enableHttp2", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableHttp2;

    /**
     * @return Indicates whether HTTP/2 is enabled in `application` load balancers. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enableHttp2() {
        return Codegen.optional(this.enableHttp2);
    }
    /**
     * Indicates whether to allow a WAF-enabled load balancer to route requests to targets if it is unable to forward the request to AWS WAF. Defaults to `false`.
     * 
     */
    @Export(name="enableWafFailOpen", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableWafFailOpen;

    /**
     * @return Indicates whether to allow a WAF-enabled load balancer to route requests to targets if it is unable to forward the request to AWS WAF. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> enableWafFailOpen() {
        return Codegen.optional(this.enableWafFailOpen);
    }
    /**
     * The time in seconds that the connection is allowed to be idle. Only valid for Load Balancers of type `application`. Default: 60.
     * 
     */
    @Export(name="idleTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> idleTimeout;

    /**
     * @return The time in seconds that the connection is allowed to be idle. Only valid for Load Balancers of type `application`. Default: 60.
     * 
     */
    public Output<Optional<Integer>> idleTimeout() {
        return Codegen.optional(this.idleTimeout);
    }
    /**
     * If true, the LB will be internal.
     * 
     */
    @Export(name="internal", type=Boolean.class, parameters={})
    private Output<Boolean> internal;

    /**
     * @return If true, the LB will be internal.
     * 
     */
    public Output<Boolean> internal() {
        return this.internal;
    }
    /**
     * The type of IP addresses used by the subnets for your load balancer. The possible values are `ipv4` and `dualstack`
     * 
     */
    @Export(name="ipAddressType", type=String.class, parameters={})
    private Output<String> ipAddressType;

    /**
     * @return The type of IP addresses used by the subnets for your load balancer. The possible values are `ipv4` and `dualstack`
     * 
     */
    public Output<String> ipAddressType() {
        return this.ipAddressType;
    }
    /**
     * The type of load balancer to create. Possible values are `application`, `gateway`, or `network`. The default value is `application`.
     * 
     */
    @Export(name="loadBalancerType", type=String.class, parameters={})
    private Output</* @Nullable */ String> loadBalancerType;

    /**
     * @return The type of load balancer to create. Possible values are `application`, `gateway`, or `network`. The default value is `application`.
     * 
     */
    public Output<Optional<String>> loadBalancerType() {
        return Codegen.optional(this.loadBalancerType);
    }
    /**
     * The name of the LB. This name must be unique within your AWS account, can have a maximum of 32 characters,
     * must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen. If not specified,
     * this provider will autogenerate a name beginning with `tf-lb`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the LB. This name must be unique within your AWS account, can have a maximum of 32 characters,
     * must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen. If not specified,
     * this provider will autogenerate a name beginning with `tf-lb`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output<Optional<String>> namePrefix() {
        return Codegen.optional(this.namePrefix);
    }
    /**
     * A list of security group IDs to assign to the LB. Only valid for Load Balancers of type `application`.
     * 
     */
    @Export(name="securityGroups", type=List.class, parameters={String.class})
    private Output<List<String>> securityGroups;

    /**
     * @return A list of security group IDs to assign to the LB. Only valid for Load Balancers of type `application`.
     * 
     */
    public Output<List<String>> securityGroups() {
        return this.securityGroups;
    }
    /**
     * A subnet mapping block as documented below.
     * 
     */
    @Export(name="subnetMappings", type=List.class, parameters={LoadBalancerSubnetMapping.class})
    private Output<List<LoadBalancerSubnetMapping>> subnetMappings;

    /**
     * @return A subnet mapping block as documented below.
     * 
     */
    public Output<List<LoadBalancerSubnetMapping>> subnetMappings() {
        return this.subnetMappings;
    }
    /**
     * A list of subnet IDs to attach to the LB. Subnets
     * cannot be updated for Load Balancers of type `network`. Changing this value
     * for load balancers of type `network` will force a recreation of the resource.
     * 
     */
    @Export(name="subnets", type=List.class, parameters={String.class})
    private Output<List<String>> subnets;

    /**
     * @return A list of subnet IDs to attach to the LB. Subnets
     * cannot be updated for Load Balancers of type `network`. Changing this value
     * for load balancers of type `network` will force a recreation of the resource.
     * 
     */
    public Output<List<String>> subnets() {
        return this.subnets;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The canonical hosted zone ID of the load balancer (to be used in a Route 53 Alias record).
     * * `subnet_mapping.*.outpost_id` - ID of the Outpost containing the load balancer.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The canonical hosted zone ID of the load balancer (to be used in a Route 53 Alias record).
     * * `subnet_mapping.*.outpost_id` - ID of the Outpost containing the load balancer.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadBalancer(String name) {
        this(name, LoadBalancerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadBalancer(String name, @Nullable LoadBalancerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancer(String name, @Nullable LoadBalancerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:alb/loadBalancer:LoadBalancer", name, args == null ? LoadBalancerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoadBalancer(String name, Output<String> id, @Nullable LoadBalancerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:alb/loadBalancer:LoadBalancer", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("aws:applicationloadbalancing/loadBalancer:LoadBalancer").build())
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
    public static LoadBalancer get(String name, Output<String> id, @Nullable LoadBalancerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancer(name, id, state, options);
    }
}
