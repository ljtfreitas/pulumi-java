// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.TransitGatewayArgs;
import io.pulumi.awsnative.ec2.outputs.TransitGatewayTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::EC2::TransitGateway
 * 
 */
@ResourceType(type="aws-native:ec2:TransitGateway")
public class TransitGateway extends io.pulumi.resources.CustomResource {
    @Export(name="amazonSideAsn", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> amazonSideAsn;

    public Output</* @Nullable */ Integer> getAmazonSideAsn() {
        return this.amazonSideAsn;
    }
    @Export(name="associationDefaultRouteTableId", type=String.class, parameters={})
    private Output</* @Nullable */ String> associationDefaultRouteTableId;

    public Output</* @Nullable */ String> getAssociationDefaultRouteTableId() {
        return this.associationDefaultRouteTableId;
    }
    @Export(name="autoAcceptSharedAttachments", type=String.class, parameters={})
    private Output</* @Nullable */ String> autoAcceptSharedAttachments;

    public Output</* @Nullable */ String> getAutoAcceptSharedAttachments() {
        return this.autoAcceptSharedAttachments;
    }
    @Export(name="defaultRouteTableAssociation", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultRouteTableAssociation;

    public Output</* @Nullable */ String> getDefaultRouteTableAssociation() {
        return this.defaultRouteTableAssociation;
    }
    @Export(name="defaultRouteTablePropagation", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultRouteTablePropagation;

    public Output</* @Nullable */ String> getDefaultRouteTablePropagation() {
        return this.defaultRouteTablePropagation;
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @Export(name="dnsSupport", type=String.class, parameters={})
    private Output</* @Nullable */ String> dnsSupport;

    public Output</* @Nullable */ String> getDnsSupport() {
        return this.dnsSupport;
    }
    @Export(name="multicastSupport", type=String.class, parameters={})
    private Output</* @Nullable */ String> multicastSupport;

    public Output</* @Nullable */ String> getMulticastSupport() {
        return this.multicastSupport;
    }
    @Export(name="propagationDefaultRouteTableId", type=String.class, parameters={})
    private Output</* @Nullable */ String> propagationDefaultRouteTableId;

    public Output</* @Nullable */ String> getPropagationDefaultRouteTableId() {
        return this.propagationDefaultRouteTableId;
    }
    @Export(name="tags", type=List.class, parameters={TransitGatewayTag.class})
    private Output</* @Nullable */ List<TransitGatewayTag>> tags;

    public Output</* @Nullable */ List<TransitGatewayTag>> getTags() {
        return this.tags;
    }
    @Export(name="transitGatewayCidrBlocks", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> transitGatewayCidrBlocks;

    public Output</* @Nullable */ List<String>> getTransitGatewayCidrBlocks() {
        return this.transitGatewayCidrBlocks;
    }
    @Export(name="vpnEcmpSupport", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpnEcmpSupport;

    public Output</* @Nullable */ String> getVpnEcmpSupport() {
        return this.vpnEcmpSupport;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable TransitGatewayArgs.Builder a);
    }
    private static io.pulumi.awsnative.ec2.TransitGatewayArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.ec2.TransitGatewayArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TransitGateway(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitGateway(String name) {
        this(name, TransitGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitGateway(String name, @Nullable TransitGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitGateway(String name, @Nullable TransitGatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:TransitGateway", name, args == null ? TransitGatewayArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private TransitGateway(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:TransitGateway", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TransitGateway get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TransitGateway(name, id, options);
    }
}
