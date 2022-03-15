// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53.ResolverQueryLogConfigAssociationArgs;
import io.pulumi.aws.route53.inputs.ResolverQueryLogConfigAssociationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Route 53 Resolver query logging configuration association resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 *  Route 53 Resolver query logging configuration associations can be imported using the Route 53 Resolver query logging configuration association ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53/resolverQueryLogConfigAssociation:ResolverQueryLogConfigAssociation example rqlca-b320624fef3c4d70
 * ```
 * 
 */
@ResourceType(type="aws:route53/resolverQueryLogConfigAssociation:ResolverQueryLogConfigAssociation")
public class ResolverQueryLogConfigAssociation extends io.pulumi.resources.CustomResource {
    /**
     * The ID of the Route 53 Resolver query logging configuration that you want to associate a VPC with.
     * 
     */
    @Export(name="resolverQueryLogConfigId", type=String.class, parameters={})
    private Output<String> resolverQueryLogConfigId;

    /**
     * @return The ID of the Route 53 Resolver query logging configuration that you want to associate a VPC with.
     * 
     */
    public Output<String> getResolverQueryLogConfigId() {
        return this.resolverQueryLogConfigId;
    }
    /**
     * The ID of a VPC that you want this query logging configuration to log queries for.
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return The ID of a VPC that you want this query logging configuration to log queries for.
     * 
     */
    public Output<String> getResourceId() {
        return this.resourceId;
    }

    public interface BuilderApplicator {
        public void apply(ResolverQueryLogConfigAssociationArgs.Builder a);
    }
    private static io.pulumi.aws.route53.ResolverQueryLogConfigAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.route53.ResolverQueryLogConfigAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ResolverQueryLogConfigAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResolverQueryLogConfigAssociation(String name) {
        this(name, ResolverQueryLogConfigAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResolverQueryLogConfigAssociation(String name, ResolverQueryLogConfigAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverQueryLogConfigAssociation(String name, ResolverQueryLogConfigAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverQueryLogConfigAssociation:ResolverQueryLogConfigAssociation", name, args == null ? ResolverQueryLogConfigAssociationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ResolverQueryLogConfigAssociation(String name, Output<String> id, @Nullable ResolverQueryLogConfigAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverQueryLogConfigAssociation:ResolverQueryLogConfigAssociation", name, state, makeResourceOptions(options, id));
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
    public static ResolverQueryLogConfigAssociation get(String name, Output<String> id, @Nullable ResolverQueryLogConfigAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResolverQueryLogConfigAssociation(name, id, state, options);
    }
}
