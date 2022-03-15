// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.VpcEndpointServiceAllowedPrincipleArgs;
import io.pulumi.aws.ec2.inputs.VpcEndpointServiceAllowedPrincipleState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to allow a principal to discover a VPC endpoint service.
 * 
 * > **NOTE on VPC Endpoint Services and VPC Endpoint Service Allowed Principals:** This provider provides
 * both a standalone VPC Endpoint Service Allowed Principal resource
 * and a VPC Endpoint Service resource with an `allowed_principals` attribute. Do not use the same principal ARN in both
 * a VPC Endpoint Service resource and a VPC Endpoint Service Allowed Principal resource. Doing so will cause a conflict
 * and will overwrite the association.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:ec2/vpcEndpointServiceAllowedPrinciple:VpcEndpointServiceAllowedPrinciple")
public class VpcEndpointServiceAllowedPrinciple extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the principal to allow permissions.
     * 
     */
    @Export(name="principalArn", type=String.class, parameters={})
    private Output<String> principalArn;

    /**
     * @return The ARN of the principal to allow permissions.
     * 
     */
    public Output<String> getPrincipalArn() {
        return this.principalArn;
    }
    /**
     * The ID of the VPC endpoint service to allow permission.
     * 
     */
    @Export(name="vpcEndpointServiceId", type=String.class, parameters={})
    private Output<String> vpcEndpointServiceId;

    /**
     * @return The ID of the VPC endpoint service to allow permission.
     * 
     */
    public Output<String> getVpcEndpointServiceId() {
        return this.vpcEndpointServiceId;
    }

    public interface BuilderApplicator {
        public void apply(VpcEndpointServiceAllowedPrincipleArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.VpcEndpointServiceAllowedPrincipleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.VpcEndpointServiceAllowedPrincipleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VpcEndpointServiceAllowedPrinciple(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcEndpointServiceAllowedPrinciple(String name) {
        this(name, VpcEndpointServiceAllowedPrincipleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcEndpointServiceAllowedPrinciple(String name, VpcEndpointServiceAllowedPrincipleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcEndpointServiceAllowedPrinciple(String name, VpcEndpointServiceAllowedPrincipleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcEndpointServiceAllowedPrinciple:VpcEndpointServiceAllowedPrinciple", name, args == null ? VpcEndpointServiceAllowedPrincipleArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VpcEndpointServiceAllowedPrinciple(String name, Output<String> id, @Nullable VpcEndpointServiceAllowedPrincipleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcEndpointServiceAllowedPrinciple:VpcEndpointServiceAllowedPrinciple", name, state, makeResourceOptions(options, id));
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
    public static VpcEndpointServiceAllowedPrinciple get(String name, Output<String> id, @Nullable VpcEndpointServiceAllowedPrincipleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VpcEndpointServiceAllowedPrinciple(name, id, state, options);
    }
}
