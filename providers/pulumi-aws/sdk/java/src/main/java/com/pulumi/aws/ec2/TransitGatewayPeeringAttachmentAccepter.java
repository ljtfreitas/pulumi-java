// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.TransitGatewayPeeringAttachmentAccepterArgs;
import com.pulumi.aws.ec2.inputs.TransitGatewayPeeringAttachmentAccepterState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages the accepter&#39;s side of an EC2 Transit Gateway Peering Attachment.
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
 *         var example = new TransitGatewayPeeringAttachmentAccepter(&#34;example&#34;, TransitGatewayPeeringAttachmentAccepterArgs.builder()        
 *             .transitGatewayAttachmentId(aws_ec2_transit_gateway_peering_attachment.getExample().getId())
 *             .tags(Map.of(&#34;Name&#34;, &#34;Example cross-account attachment&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_ec2_transit_gateway_peering_attachment_accepter` can be imported by using the EC2 Transit Gateway Attachment identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/transitGatewayPeeringAttachmentAccepter:TransitGatewayPeeringAttachmentAccepter example tgw-attach-12345678
 * ```
 * 
 */
@ResourceType(type="aws:ec2/transitGatewayPeeringAttachmentAccepter:TransitGatewayPeeringAttachmentAccepter")
public class TransitGatewayPeeringAttachmentAccepter extends com.pulumi.resources.CustomResource {
    /**
     * Identifier of the AWS account that owns the EC2 TGW peering.
     * 
     */
    @Export(name="peerAccountId", type=String.class, parameters={})
    private Output<String> peerAccountId;

    /**
     * @return Identifier of the AWS account that owns the EC2 TGW peering.
     * 
     */
    public Output<String> peerAccountId() {
        return this.peerAccountId;
    }
    @Export(name="peerRegion", type=String.class, parameters={})
    private Output<String> peerRegion;

    public Output<String> peerRegion() {
        return this.peerRegion;
    }
    /**
     * Identifier of EC2 Transit Gateway to peer with.
     * 
     */
    @Export(name="peerTransitGatewayId", type=String.class, parameters={})
    private Output<String> peerTransitGatewayId;

    /**
     * @return Identifier of EC2 Transit Gateway to peer with.
     * 
     */
    public Output<String> peerTransitGatewayId() {
        return this.peerTransitGatewayId;
    }
    /**
     * Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The ID of the EC2 Transit Gateway Peering Attachment to manage.
     * 
     */
    @Export(name="transitGatewayAttachmentId", type=String.class, parameters={})
    private Output<String> transitGatewayAttachmentId;

    /**
     * @return The ID of the EC2 Transit Gateway Peering Attachment to manage.
     * 
     */
    public Output<String> transitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }
    /**
     * Identifier of EC2 Transit Gateway.
     * 
     */
    @Export(name="transitGatewayId", type=String.class, parameters={})
    private Output<String> transitGatewayId;

    /**
     * @return Identifier of EC2 Transit Gateway.
     * 
     */
    public Output<String> transitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitGatewayPeeringAttachmentAccepter(String name) {
        this(name, TransitGatewayPeeringAttachmentAccepterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitGatewayPeeringAttachmentAccepter(String name, TransitGatewayPeeringAttachmentAccepterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitGatewayPeeringAttachmentAccepter(String name, TransitGatewayPeeringAttachmentAccepterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/transitGatewayPeeringAttachmentAccepter:TransitGatewayPeeringAttachmentAccepter", name, args == null ? TransitGatewayPeeringAttachmentAccepterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TransitGatewayPeeringAttachmentAccepter(String name, Output<String> id, @Nullable TransitGatewayPeeringAttachmentAccepterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/transitGatewayPeeringAttachmentAccepter:TransitGatewayPeeringAttachmentAccepter", name, state, makeResourceOptions(options, id));
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
    public static TransitGatewayPeeringAttachmentAccepter get(String name, Output<String> id, @Nullable TransitGatewayPeeringAttachmentAccepterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitGatewayPeeringAttachmentAccepter(name, id, state, options);
    }
}
