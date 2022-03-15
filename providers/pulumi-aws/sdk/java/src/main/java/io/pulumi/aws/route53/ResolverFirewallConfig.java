// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53.ResolverFirewallConfigArgs;
import io.pulumi.aws.route53.inputs.ResolverFirewallConfigState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Route 53 Resolver DNS Firewall config resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Route 53 Resolver DNS Firewall configs can be imported using the Route 53 Resolver DNS Firewall config ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53/resolverFirewallConfig:ResolverFirewallConfig example rdsc-be1866ecc1683e95
 * ```
 * 
 */
@ResourceType(type="aws:route53/resolverFirewallConfig:ResolverFirewallConfig")
public class ResolverFirewallConfig extends io.pulumi.resources.CustomResource {
    /**
     * Determines how Route 53 Resolver handles queries during failures, for example when all traffic that is sent to DNS Firewall fails to receive a reply. By default, fail open is disabled, which means the failure mode is closed. This approach favors security over availability. DNS Firewall blocks queries that it is unable to evaluate properly. If you enable this option, the failure mode is open. This approach favors availability over security. DNS Firewall allows queries to proceed if it is unable to properly evaluate them. Valid values: `ENABLED`, `DISABLED`.
     * 
     */
    @Export(name="firewallFailOpen", type=String.class, parameters={})
    private Output<String> firewallFailOpen;

    /**
     * @return Determines how Route 53 Resolver handles queries during failures, for example when all traffic that is sent to DNS Firewall fails to receive a reply. By default, fail open is disabled, which means the failure mode is closed. This approach favors security over availability. DNS Firewall blocks queries that it is unable to evaluate properly. If you enable this option, the failure mode is open. This approach favors availability over security. DNS Firewall allows queries to proceed if it is unable to properly evaluate them. Valid values: `ENABLED`, `DISABLED`.
     * 
     */
    public Output<String> getFirewallFailOpen() {
        return this.firewallFailOpen;
    }
    /**
     * The AWS account ID of the owner of the VPC that this firewall configuration applies to.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return The AWS account ID of the owner of the VPC that this firewall configuration applies to.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * The ID of the VPC that the configuration is for.
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return The ID of the VPC that the configuration is for.
     * 
     */
    public Output<String> getResourceId() {
        return this.resourceId;
    }

    public interface BuilderApplicator {
        public void apply(ResolverFirewallConfigArgs.Builder a);
    }
    private static io.pulumi.aws.route53.ResolverFirewallConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.route53.ResolverFirewallConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ResolverFirewallConfig(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResolverFirewallConfig(String name) {
        this(name, ResolverFirewallConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResolverFirewallConfig(String name, ResolverFirewallConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverFirewallConfig(String name, ResolverFirewallConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverFirewallConfig:ResolverFirewallConfig", name, args == null ? ResolverFirewallConfigArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ResolverFirewallConfig(String name, Output<String> id, @Nullable ResolverFirewallConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverFirewallConfig:ResolverFirewallConfig", name, state, makeResourceOptions(options, id));
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
    public static ResolverFirewallConfig get(String name, Output<String> id, @Nullable ResolverFirewallConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResolverFirewallConfig(name, id, state, options);
    }
}
