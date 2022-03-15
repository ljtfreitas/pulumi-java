// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53.ResolverFirewallRuleGroupAssociationArgs;
import io.pulumi.aws.route53.inputs.ResolverFirewallRuleGroupAssociationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Route 53 Resolver DNS Firewall rule group association resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Route 53 Resolver DNS Firewall rule group associations can be imported using the Route 53 Resolver DNS Firewall rule group association ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53/resolverFirewallRuleGroupAssociation:ResolverFirewallRuleGroupAssociation example rslvr-frgassoc-0123456789abcdef
 * ```
 * 
 */
@ResourceType(type="aws:route53/resolverFirewallRuleGroupAssociation:ResolverFirewallRuleGroupAssociation")
public class ResolverFirewallRuleGroupAssociation extends io.pulumi.resources.CustomResource {
    /**
     * The ARN (Amazon Resource Name) of the firewall rule group association.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN (Amazon Resource Name) of the firewall rule group association.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The unique identifier of the firewall rule group.
     * 
     */
    @Export(name="firewallRuleGroupId", type=String.class, parameters={})
    private Output<String> firewallRuleGroupId;

    /**
     * @return The unique identifier of the firewall rule group.
     * 
     */
    public Output<String> getFirewallRuleGroupId() {
        return this.firewallRuleGroupId;
    }
    /**
     * If enabled, this setting disallows modification or removal of the association, to help prevent against accidentally altering DNS firewall protections. Valid values: `ENABLED`, `DISABLED`.
     * 
     */
    @Export(name="mutationProtection", type=String.class, parameters={})
    private Output<String> mutationProtection;

    /**
     * @return If enabled, this setting disallows modification or removal of the association, to help prevent against accidentally altering DNS firewall protections. Valid values: `ENABLED`, `DISABLED`.
     * 
     */
    public Output<String> getMutationProtection() {
        return this.mutationProtection;
    }
    /**
     * A name that lets you identify the rule group association, to manage and use it.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name that lets you identify the rule group association, to manage and use it.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The setting that determines the processing order of the rule group among the rule groups that you associate with the specified VPC. DNS Firewall filters VPC traffic starting from the rule group with the lowest numeric priority setting.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return The setting that determines the processing order of the rule group among the rule groups that you associate with the specified VPC. DNS Firewall filters VPC traffic starting from the rule group with the lowest numeric priority setting.
     * 
     */
    public Output<Integer> getPriority() {
        return this.priority;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The unique identifier of the VPC that you want to associate with the rule group.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The unique identifier of the VPC that you want to associate with the rule group.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public interface BuilderApplicator {
        public void apply(ResolverFirewallRuleGroupAssociationArgs.Builder a);
    }
    private static io.pulumi.aws.route53.ResolverFirewallRuleGroupAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.route53.ResolverFirewallRuleGroupAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ResolverFirewallRuleGroupAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResolverFirewallRuleGroupAssociation(String name) {
        this(name, ResolverFirewallRuleGroupAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResolverFirewallRuleGroupAssociation(String name, ResolverFirewallRuleGroupAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverFirewallRuleGroupAssociation(String name, ResolverFirewallRuleGroupAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverFirewallRuleGroupAssociation:ResolverFirewallRuleGroupAssociation", name, args == null ? ResolverFirewallRuleGroupAssociationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ResolverFirewallRuleGroupAssociation(String name, Output<String> id, @Nullable ResolverFirewallRuleGroupAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverFirewallRuleGroupAssociation:ResolverFirewallRuleGroupAssociation", name, state, makeResourceOptions(options, id));
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
    public static ResolverFirewallRuleGroupAssociation get(String name, Output<String> id, @Nullable ResolverFirewallRuleGroupAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResolverFirewallRuleGroupAssociation(name, id, state, options);
    }
}
