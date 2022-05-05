// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.VpnGatewayAttachmentArgs;
import com.pulumi.aws.ec2.inputs.VpnGatewayAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Virtual Private Gateway attachment resource, allowing for an existing
 * hardware VPN gateway to be attached and/or detached from a VPC.
 * 
 * &gt; **Note:** The `aws.ec2.VpnGateway`
 * resource can also automatically attach the Virtual Private Gateway it creates
 * to an existing VPC by setting the `vpc_id` attribute accordingly.
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
 *         var network = new Vpc(&#34;network&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var vpn = new VpnGateway(&#34;vpn&#34;, VpnGatewayArgs.builder()        
 *             .tags(Map.of(&#34;Name&#34;, &#34;example-vpn-gateway&#34;))
 *             .build());
 * 
 *         var vpnAttachment = new VpnGatewayAttachment(&#34;vpnAttachment&#34;, VpnGatewayAttachmentArgs.builder()        
 *             .vpcId(network.getId())
 *             .vpnGatewayId(vpn.getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * See [Virtual Private Cloud](http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Introduction.html)
 * and [Virtual Private Gateway](http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html) user
 * guides for more information.
 * 
 * ## Import
 * 
 * This resource does not support importing.
 * 
 */
@ResourceType(type="aws:ec2/vpnGatewayAttachment:VpnGatewayAttachment")
public class VpnGatewayAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the VPC.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The ID of the Virtual Private Gateway.
     * 
     */
    @Export(name="vpnGatewayId", type=String.class, parameters={})
    private Output<String> vpnGatewayId;

    /**
     * @return The ID of the Virtual Private Gateway.
     * 
     */
    public Output<String> vpnGatewayId() {
        return this.vpnGatewayId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpnGatewayAttachment(String name) {
        this(name, VpnGatewayAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpnGatewayAttachment(String name, VpnGatewayAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpnGatewayAttachment(String name, VpnGatewayAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpnGatewayAttachment:VpnGatewayAttachment", name, args == null ? VpnGatewayAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpnGatewayAttachment(String name, Output<String> id, @Nullable VpnGatewayAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpnGatewayAttachment:VpnGatewayAttachment", name, state, makeResourceOptions(options, id));
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
    public static VpnGatewayAttachment get(String name, Output<String> id, @Nullable VpnGatewayAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpnGatewayAttachment(name, id, state, options);
    }
}
