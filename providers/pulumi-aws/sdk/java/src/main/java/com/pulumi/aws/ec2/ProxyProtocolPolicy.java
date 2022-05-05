// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.ProxyProtocolPolicyArgs;
import com.pulumi.aws.ec2.inputs.ProxyProtocolPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a proxy protocol policy, which allows an ELB to carry a client connection information to a backend.
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
 *         var lb = new LoadBalancer(&#34;lb&#34;, LoadBalancerArgs.builder()        
 *             .availabilityZones(&#34;us-east-1a&#34;)
 *             .listeners(            
 *                 LoadBalancerListener.builder()
 *                     .instancePort(25)
 *                     .instanceProtocol(&#34;tcp&#34;)
 *                     .lbPort(25)
 *                     .lbProtocol(&#34;tcp&#34;)
 *                     .build(),
 *                 LoadBalancerListener.builder()
 *                     .instancePort(587)
 *                     .instanceProtocol(&#34;tcp&#34;)
 *                     .lbPort(587)
 *                     .lbProtocol(&#34;tcp&#34;)
 *                     .build())
 *             .build());
 * 
 *         var smtp = new ProxyProtocolPolicy(&#34;smtp&#34;, ProxyProtocolPolicyArgs.builder()        
 *             .loadBalancer(lb.getName())
 *             .instancePorts(            
 *                 &#34;25&#34;,
 *                 &#34;587&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 */
@ResourceType(type="aws:ec2/proxyProtocolPolicy:ProxyProtocolPolicy")
public class ProxyProtocolPolicy extends com.pulumi.resources.CustomResource {
    /**
     * List of instance ports to which the policy
     * should be applied. This can be specified if the protocol is SSL or TCP.
     * 
     */
    @Export(name="instancePorts", type=List.class, parameters={String.class})
    private Output<List<String>> instancePorts;

    /**
     * @return List of instance ports to which the policy
     * should be applied. This can be specified if the protocol is SSL or TCP.
     * 
     */
    public Output<List<String>> instancePorts() {
        return this.instancePorts;
    }
    /**
     * The load balancer to which the policy
     * should be attached.
     * 
     */
    @Export(name="loadBalancer", type=String.class, parameters={})
    private Output<String> loadBalancer;

    /**
     * @return The load balancer to which the policy
     * should be attached.
     * 
     */
    public Output<String> loadBalancer() {
        return this.loadBalancer;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProxyProtocolPolicy(String name) {
        this(name, ProxyProtocolPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProxyProtocolPolicy(String name, ProxyProtocolPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProxyProtocolPolicy(String name, ProxyProtocolPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/proxyProtocolPolicy:ProxyProtocolPolicy", name, args == null ? ProxyProtocolPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProxyProtocolPolicy(String name, Output<String> id, @Nullable ProxyProtocolPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/proxyProtocolPolicy:ProxyProtocolPolicy", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static ProxyProtocolPolicy get(String name, Output<String> id, @Nullable ProxyProtocolPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProxyProtocolPolicy(name, id, state, options);
    }
}
