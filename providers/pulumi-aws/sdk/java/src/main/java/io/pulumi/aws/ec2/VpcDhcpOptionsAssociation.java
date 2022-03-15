// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.VpcDhcpOptionsAssociationArgs;
import io.pulumi.aws.ec2.inputs.VpcDhcpOptionsAssociationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a VPC DHCP Options Association resource.
 * 
 * ## Example Usage
 * ## Remarks
 * 
 * * You can only associate one DHCP Options Set to a given VPC ID.
 * * Removing the DHCP Options Association automatically sets AWS's `default` DHCP Options Set to the VPC.
 * 
 * ## Import
 * 
 * DHCP associations can be imported by providing the VPC ID associated with the options
 * 
 * ```sh
 *  $ pulumi import aws:ec2/vpcDhcpOptionsAssociation:VpcDhcpOptionsAssociation imported vpc-0f001273ec18911b1
 * ```
 * 
 */
@ResourceType(type="aws:ec2/vpcDhcpOptionsAssociation:VpcDhcpOptionsAssociation")
public class VpcDhcpOptionsAssociation extends io.pulumi.resources.CustomResource {
    /**
     * The ID of the DHCP Options Set to associate to the VPC.
     * 
     */
    @Export(name="dhcpOptionsId", type=String.class, parameters={})
    private Output<String> dhcpOptionsId;

    /**
     * @return The ID of the DHCP Options Set to associate to the VPC.
     * 
     */
    public Output<String> getDhcpOptionsId() {
        return this.dhcpOptionsId;
    }
    /**
     * The ID of the VPC to which we would like to associate a DHCP Options Set.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC to which we would like to associate a DHCP Options Set.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public interface BuilderApplicator {
        public void apply(VpcDhcpOptionsAssociationArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.VpcDhcpOptionsAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.VpcDhcpOptionsAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VpcDhcpOptionsAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcDhcpOptionsAssociation(String name) {
        this(name, VpcDhcpOptionsAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcDhcpOptionsAssociation(String name, VpcDhcpOptionsAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcDhcpOptionsAssociation(String name, VpcDhcpOptionsAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcDhcpOptionsAssociation:VpcDhcpOptionsAssociation", name, args == null ? VpcDhcpOptionsAssociationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VpcDhcpOptionsAssociation(String name, Output<String> id, @Nullable VpcDhcpOptionsAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcDhcpOptionsAssociation:VpcDhcpOptionsAssociation", name, state, makeResourceOptions(options, id));
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
    public static VpcDhcpOptionsAssociation get(String name, Output<String> id, @Nullable VpcDhcpOptionsAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VpcDhcpOptionsAssociation(name, id, state, options);
    }
}
