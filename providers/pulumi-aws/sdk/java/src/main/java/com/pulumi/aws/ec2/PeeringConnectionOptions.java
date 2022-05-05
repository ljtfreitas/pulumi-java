// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.PeeringConnectionOptionsArgs;
import com.pulumi.aws.ec2.inputs.PeeringConnectionOptionsState;
import com.pulumi.aws.ec2.outputs.PeeringConnectionOptionsAccepter;
import com.pulumi.aws.ec2.outputs.PeeringConnectionOptionsRequester;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage VPC peering connection options.
 * 
 * &gt; **NOTE on VPC Peering Connections and VPC Peering Connection Options:** This provider provides
 * both a standalone VPC Peering Connection Options and a VPC Peering Connection
 * resource with `accepter` and `requester` attributes. Do not manage options for the same VPC peering
 * connection in both a VPC Peering Connection resource and a VPC Peering Connection Options resource.
 * Doing so will cause a conflict of options and will overwrite the options.
 * Using a VPC Peering Connection Options resource decouples management of the connection options from
 * management of the VPC Peering Connection and allows options to be set correctly in cross-region and
 * cross-account scenarios.
 * 
 * ## Example Usage
 * ### Basic Usage
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
 *         var fooVpc = new Vpc(&#34;fooVpc&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var bar = new Vpc(&#34;bar&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.1.0.0/16&#34;)
 *             .build());
 * 
 *         var fooVpcPeeringConnection = new VpcPeeringConnection(&#34;fooVpcPeeringConnection&#34;, VpcPeeringConnectionArgs.builder()        
 *             .vpcId(fooVpc.getId())
 *             .peerVpcId(bar.getId())
 *             .autoAccept(true)
 *             .build());
 * 
 *         var fooPeeringConnectionOptions = new PeeringConnectionOptions(&#34;fooPeeringConnectionOptions&#34;, PeeringConnectionOptionsArgs.builder()        
 *             .vpcPeeringConnectionId(fooVpcPeeringConnection.getId())
 *             .accepter(PeeringConnectionOptionsAccepter.builder()
 *                 .allowRemoteVpcDnsResolution(true)
 *                 .build())
 *             .requester(PeeringConnectionOptionsRequester.builder()
 *                 .allowVpcToRemoteClassicLink(true)
 *                 .allowClassicLinkToRemoteVpc(true)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Cross-Account Usage
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
 *         var requester = new Provider(&#34;requester&#34;);
 * 
 *         var accepter = new Provider(&#34;accepter&#34;);
 * 
 *         var main = new Vpc(&#34;main&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .enableDnsSupport(true)
 *             .enableDnsHostnames(true)
 *             .build());
 * 
 *         var peerVpc = new Vpc(&#34;peerVpc&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.1.0.0/16&#34;)
 *             .enableDnsSupport(true)
 *             .enableDnsHostnames(true)
 *             .build());
 * 
 *         final var peerCallerIdentity = Output.of(AwsFunctions.getCallerIdentity());
 * 
 *         var peerVpcPeeringConnection = new VpcPeeringConnection(&#34;peerVpcPeeringConnection&#34;, VpcPeeringConnectionArgs.builder()        
 *             .vpcId(main.getId())
 *             .peerVpcId(peerVpc.getId())
 *             .peerOwnerId(peerCallerIdentity.apply(getCallerIdentityResult -&gt; getCallerIdentityResult.getAccountId()))
 *             .autoAccept(false)
 *             .tags(Map.of(&#34;Side&#34;, &#34;Requester&#34;))
 *             .build());
 * 
 *         var peerVpcPeeringConnectionAccepter = new VpcPeeringConnectionAccepter(&#34;peerVpcPeeringConnectionAccepter&#34;, VpcPeeringConnectionAccepterArgs.builder()        
 *             .vpcPeeringConnectionId(peerVpcPeeringConnection.getId())
 *             .autoAccept(true)
 *             .tags(Map.of(&#34;Side&#34;, &#34;Accepter&#34;))
 *             .build());
 * 
 *         var requesterPeeringConnectionOptions = new PeeringConnectionOptions(&#34;requesterPeeringConnectionOptions&#34;, PeeringConnectionOptionsArgs.builder()        
 *             .vpcPeeringConnectionId(peerVpcPeeringConnectionAccepter.getId())
 *             .requester(PeeringConnectionOptionsRequester.builder()
 *                 .allowRemoteVpcDnsResolution(true)
 *                 .build())
 *             .build());
 * 
 *         var accepterPeeringConnectionOptions = new PeeringConnectionOptions(&#34;accepterPeeringConnectionOptions&#34;, PeeringConnectionOptionsArgs.builder()        
 *             .vpcPeeringConnectionId(peerVpcPeeringConnectionAccepter.getId())
 *             .accepter(PeeringConnectionOptionsAccepter.builder()
 *                 .allowRemoteVpcDnsResolution(true)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * VPC Peering Connection Options can be imported using the `vpc peering id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/peeringConnectionOptions:PeeringConnectionOptions foo pcx-111aaa111
 * ```
 * 
 */
@ResourceType(type="aws:ec2/peeringConnectionOptions:PeeringConnectionOptions")
public class PeeringConnectionOptions extends com.pulumi.resources.CustomResource {
    /**
     * An optional configuration block that allows for [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
     * the peering connection (a maximum of one).
     * 
     */
    @Export(name="accepter", type=PeeringConnectionOptionsAccepter.class, parameters={})
    private Output<PeeringConnectionOptionsAccepter> accepter;

    /**
     * @return An optional configuration block that allows for [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
     * the peering connection (a maximum of one).
     * 
     */
    public Output<PeeringConnectionOptionsAccepter> accepter() {
        return this.accepter;
    }
    /**
     * A optional configuration block that allows for [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
     * the peering connection (a maximum of one).
     * 
     */
    @Export(name="requester", type=PeeringConnectionOptionsRequester.class, parameters={})
    private Output<PeeringConnectionOptionsRequester> requester;

    /**
     * @return A optional configuration block that allows for [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
     * the peering connection (a maximum of one).
     * 
     */
    public Output<PeeringConnectionOptionsRequester> requester() {
        return this.requester;
    }
    /**
     * The ID of the requester VPC peering connection.
     * 
     */
    @Export(name="vpcPeeringConnectionId", type=String.class, parameters={})
    private Output<String> vpcPeeringConnectionId;

    /**
     * @return The ID of the requester VPC peering connection.
     * 
     */
    public Output<String> vpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PeeringConnectionOptions(String name) {
        this(name, PeeringConnectionOptionsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PeeringConnectionOptions(String name, PeeringConnectionOptionsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PeeringConnectionOptions(String name, PeeringConnectionOptionsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/peeringConnectionOptions:PeeringConnectionOptions", name, args == null ? PeeringConnectionOptionsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PeeringConnectionOptions(String name, Output<String> id, @Nullable PeeringConnectionOptionsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/peeringConnectionOptions:PeeringConnectionOptions", name, state, makeResourceOptions(options, id));
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
    public static PeeringConnectionOptions get(String name, Output<String> id, @Nullable PeeringConnectionOptionsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PeeringConnectionOptions(name, id, state, options);
    }
}
