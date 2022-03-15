// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2transitgateway.RouteTableAssociationArgs;
import io.pulumi.aws.ec2transitgateway.inputs.RouteTableAssociationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an EC2 Transit Gateway Route Table association.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_ec2_transit_gateway_route_table_association` can be imported by using the EC2 Transit Gateway Route Table identifier, an underscore, and the EC2 Transit Gateway Attachment identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2transitgateway/routeTableAssociation:RouteTableAssociation example tgw-rtb-12345678_tgw-attach-87654321
 * ```
 * 
 */
@ResourceType(type="aws:ec2transitgateway/routeTableAssociation:RouteTableAssociation")
public class RouteTableAssociation extends io.pulumi.resources.CustomResource {
    /**
     * Identifier of the resource
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return Identifier of the resource
     * 
     */
    public Output<String> getResourceId() {
        return this.resourceId;
    }
    /**
     * Type of the resource
     * 
     */
    @Export(name="resourceType", type=String.class, parameters={})
    private Output<String> resourceType;

    /**
     * @return Type of the resource
     * 
     */
    public Output<String> getPropResourceType() {
        return this.resourceType;
    }
    /**
     * Identifier of EC2 Transit Gateway Attachment.
     * 
     */
    @Export(name="transitGatewayAttachmentId", type=String.class, parameters={})
    private Output<String> transitGatewayAttachmentId;

    /**
     * @return Identifier of EC2 Transit Gateway Attachment.
     * 
     */
    public Output<String> getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }
    /**
     * Identifier of EC2 Transit Gateway Route Table.
     * 
     */
    @Export(name="transitGatewayRouteTableId", type=String.class, parameters={})
    private Output<String> transitGatewayRouteTableId;

    /**
     * @return Identifier of EC2 Transit Gateway Route Table.
     * 
     */
    public Output<String> getTransitGatewayRouteTableId() {
        return this.transitGatewayRouteTableId;
    }

    public interface BuilderApplicator {
        public void apply(RouteTableAssociationArgs.Builder a);
    }
    private static io.pulumi.aws.ec2transitgateway.RouteTableAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2transitgateway.RouteTableAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RouteTableAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouteTableAssociation(String name) {
        this(name, RouteTableAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouteTableAssociation(String name, RouteTableAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouteTableAssociation(String name, RouteTableAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/routeTableAssociation:RouteTableAssociation", name, args == null ? RouteTableAssociationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private RouteTableAssociation(String name, Output<String> id, @Nullable RouteTableAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/routeTableAssociation:RouteTableAssociation", name, state, makeResourceOptions(options, id));
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
    public static RouteTableAssociation get(String name, Output<String> id, @Nullable RouteTableAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RouteTableAssociation(name, id, state, options);
    }
}
