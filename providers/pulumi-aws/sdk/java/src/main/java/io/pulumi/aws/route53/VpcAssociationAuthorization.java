// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53.VpcAssociationAuthorizationArgs;
import io.pulumi.aws.route53.inputs.VpcAssociationAuthorizationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Authorizes a VPC in a different account to be associated with a local Route53 Hosted Zone.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Route 53 VPC Association Authorizations can be imported via the Hosted Zone ID and VPC ID, separated by a colon (`:`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53/vpcAssociationAuthorization:VpcAssociationAuthorization example Z123456ABCDEFG:vpc-12345678
 * ```
 * 
 */
@ResourceType(type="aws:route53/vpcAssociationAuthorization:VpcAssociationAuthorization")
public class VpcAssociationAuthorization extends io.pulumi.resources.CustomResource {
    /**
     * The VPC to authorize for association with the private hosted zone.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The VPC to authorize for association with the private hosted zone.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }
    /**
     * The VPC's region. Defaults to the region of the AWS provider.
     * 
     */
    @Export(name="vpcRegion", type=String.class, parameters={})
    private Output<String> vpcRegion;

    /**
     * @return The VPC's region. Defaults to the region of the AWS provider.
     * 
     */
    public Output<String> getVpcRegion() {
        return this.vpcRegion;
    }
    /**
     * The ID of the private hosted zone that you want to authorize associating a VPC with.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The ID of the private hosted zone that you want to authorize associating a VPC with.
     * 
     */
    public Output<String> getZoneId() {
        return this.zoneId;
    }

    public interface BuilderApplicator {
        public void apply(VpcAssociationAuthorizationArgs.Builder a);
    }
    private static io.pulumi.aws.route53.VpcAssociationAuthorizationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.route53.VpcAssociationAuthorizationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VpcAssociationAuthorization(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcAssociationAuthorization(String name) {
        this(name, VpcAssociationAuthorizationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcAssociationAuthorization(String name, VpcAssociationAuthorizationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcAssociationAuthorization(String name, VpcAssociationAuthorizationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/vpcAssociationAuthorization:VpcAssociationAuthorization", name, args == null ? VpcAssociationAuthorizationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VpcAssociationAuthorization(String name, Output<String> id, @Nullable VpcAssociationAuthorizationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/vpcAssociationAuthorization:VpcAssociationAuthorization", name, state, makeResourceOptions(options, id));
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
    public static VpcAssociationAuthorization get(String name, Output<String> id, @Nullable VpcAssociationAuthorizationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VpcAssociationAuthorization(name, id, state, options);
    }
}
