// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.TransitGatewayPeeringAttachmentAccepterArgs;
import io.pulumi.aws.ec2.inputs.TransitGatewayPeeringAttachmentAccepterState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages the accepter's side of an EC2 Transit Gateway Peering Attachment.
 * 
 * ## Example Usage
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
public class TransitGatewayPeeringAttachmentAccepter extends io.pulumi.resources.CustomResource {
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
    public Output<String> getPeerAccountId() {
        return this.peerAccountId;
    }
    @Export(name="peerRegion", type=String.class, parameters={})
    private Output<String> peerRegion;

    public Output<String> getPeerRegion() {
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
    public Output<String> getPeerTransitGatewayId() {
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
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
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
    public Output<Map<String,String>> getTagsAll() {
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
    public Output<String> getTransitGatewayAttachmentId() {
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
    public Output<String> getTransitGatewayId() {
        return this.transitGatewayId;
    }

    public interface BuilderApplicator {
        public void apply(TransitGatewayPeeringAttachmentAccepterArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.TransitGatewayPeeringAttachmentAccepterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.TransitGatewayPeeringAttachmentAccepterArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TransitGatewayPeeringAttachmentAccepter(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
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
    public TransitGatewayPeeringAttachmentAccepter(String name, TransitGatewayPeeringAttachmentAccepterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/transitGatewayPeeringAttachmentAccepter:TransitGatewayPeeringAttachmentAccepter", name, args == null ? TransitGatewayPeeringAttachmentAccepterArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private TransitGatewayPeeringAttachmentAccepter(String name, Output<String> id, @Nullable TransitGatewayPeeringAttachmentAccepterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/transitGatewayPeeringAttachmentAccepter:TransitGatewayPeeringAttachmentAccepter", name, state, makeResourceOptions(options, id));
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
    public static TransitGatewayPeeringAttachmentAccepter get(String name, Output<String> id, @Nullable TransitGatewayPeeringAttachmentAccepterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TransitGatewayPeeringAttachmentAccepter(name, id, state, options);
    }
}
