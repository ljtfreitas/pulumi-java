// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53.ResolverDnsSecConfigArgs;
import io.pulumi.aws.route53.inputs.ResolverDnsSecConfigState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Route 53 Resolver DNSSEC config resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 *  Route 53 Resolver DNSSEC configs can be imported using the Route 53 Resolver DNSSEC config ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53/resolverDnsSecConfig:ResolverDnsSecConfig example rdsc-be1866ecc1683e95
 * ```
 * 
 */
@ResourceType(type="aws:route53/resolverDnsSecConfig:ResolverDnsSecConfig")
public class ResolverDnsSecConfig extends io.pulumi.resources.CustomResource {
    /**
     * The ARN for a configuration for DNSSEC validation.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN for a configuration for DNSSEC validation.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The owner account ID of the virtual private cloud (VPC) for a configuration for DNSSEC validation.
     * 
     */
    @OutputExport(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return The owner account ID of the virtual private cloud (VPC) for a configuration for DNSSEC validation.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * The ID of the virtual private cloud (VPC) that you're updating the DNSSEC validation status for.
     * 
     */
    @OutputExport(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return The ID of the virtual private cloud (VPC) that you're updating the DNSSEC validation status for.
     * 
     */
    public Output<String> getResourceId() {
        return this.resourceId;
    }
    /**
     * The validation status for a DNSSEC configuration. The status can be one of the following: `ENABLING`, `ENABLED`, `DISABLING` and `DISABLED`.
     * 
     */
    @OutputExport(name="validationStatus", type=String.class, parameters={})
    private Output<String> validationStatus;

    /**
     * @return The validation status for a DNSSEC configuration. The status can be one of the following: `ENABLING`, `ENABLED`, `DISABLING` and `DISABLED`.
     * 
     */
    public Output<String> getValidationStatus() {
        return this.validationStatus;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverDnsSecConfig(String name, ResolverDnsSecConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverDnsSecConfig:ResolverDnsSecConfig", name, args == null ? ResolverDnsSecConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResolverDnsSecConfig(String name, Input<String> id, @Nullable ResolverDnsSecConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverDnsSecConfig:ResolverDnsSecConfig", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
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
    public static ResolverDnsSecConfig get(String name, Input<String> id, @Nullable ResolverDnsSecConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResolverDnsSecConfig(name, id, state, options);
    }
}
