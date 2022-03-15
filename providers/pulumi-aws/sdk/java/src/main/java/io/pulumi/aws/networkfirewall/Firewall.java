// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.networkfirewall.FirewallArgs;
import io.pulumi.aws.networkfirewall.inputs.FirewallState;
import io.pulumi.aws.networkfirewall.outputs.FirewallFirewallStatus;
import io.pulumi.aws.networkfirewall.outputs.FirewallSubnetMapping;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AWS Network Firewall Firewall Resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Network Firewall Firewalls can be imported using their `ARN`.
 * 
 * ```sh
 *  $ pulumi import aws:networkfirewall/firewall:Firewall example arn:aws:network-firewall:us-west-1:123456789012:firewall/example
 * ```
 * 
 */
@ResourceType(type="aws:networkfirewall/firewall:Firewall")
public class Firewall extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) that identifies the firewall.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) that identifies the firewall.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A boolean flag indicating whether it is possible to delete the firewall. Defaults to `false`.
     * 
     */
    @Export(name="deleteProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deleteProtection;

    /**
     * @return A boolean flag indicating whether it is possible to delete the firewall. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getDeleteProtection() {
        return this.deleteProtection;
    }
    /**
     * A friendly description of the firewall.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A friendly description of the firewall.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The Amazon Resource Name (ARN) of the VPC Firewall policy.
     * 
     */
    @Export(name="firewallPolicyArn", type=String.class, parameters={})
    private Output<String> firewallPolicyArn;

    /**
     * @return The Amazon Resource Name (ARN) of the VPC Firewall policy.
     * 
     */
    public Output<String> getFirewallPolicyArn() {
        return this.firewallPolicyArn;
    }
    /**
     * A boolean flag indicating whether it is possible to change the associated firewall policy. Defaults to `false`.
     * 
     */
    @Export(name="firewallPolicyChangeProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> firewallPolicyChangeProtection;

    /**
     * @return A boolean flag indicating whether it is possible to change the associated firewall policy. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getFirewallPolicyChangeProtection() {
        return this.firewallPolicyChangeProtection;
    }
    /**
     * Nested list of information about the current status of the firewall.
     * 
     */
    @Export(name="firewallStatuses", type=List.class, parameters={FirewallFirewallStatus.class})
    private Output<List<FirewallFirewallStatus>> firewallStatuses;

    /**
     * @return Nested list of information about the current status of the firewall.
     * 
     */
    public Output<List<FirewallFirewallStatus>> getFirewallStatuses() {
        return this.firewallStatuses;
    }
    /**
     * A friendly name of the firewall.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A friendly name of the firewall.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A boolean flag indicating whether it is possible to change the associated subnet(s). Defaults to `false`.
     * 
     */
    @Export(name="subnetChangeProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> subnetChangeProtection;

    /**
     * @return A boolean flag indicating whether it is possible to change the associated subnet(s). Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getSubnetChangeProtection() {
        return this.subnetChangeProtection;
    }
    /**
     * Set of configuration blocks describing the public subnets. Each subnet must belong to a different Availability Zone in the VPC. AWS Network Firewall creates a firewall endpoint in each subnet. See Subnet Mapping below for details.
     * 
     */
    @Export(name="subnetMappings", type=List.class, parameters={FirewallSubnetMapping.class})
    private Output<List<FirewallSubnetMapping>> subnetMappings;

    /**
     * @return Set of configuration blocks describing the public subnets. Each subnet must belong to a different Availability Zone in the VPC. AWS Network Firewall creates a firewall endpoint in each subnet. See Subnet Mapping below for details.
     * 
     */
    public Output<List<FirewallSubnetMapping>> getSubnetMappings() {
        return this.subnetMappings;
    }
    /**
     * Map of resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * A string token used when updating a firewall.
     * 
     */
    @Export(name="updateToken", type=String.class, parameters={})
    private Output<String> updateToken;

    /**
     * @return A string token used when updating a firewall.
     * 
     */
    public Output<String> getUpdateToken() {
        return this.updateToken;
    }
    /**
     * The unique identifier of the VPC where AWS Network Firewall should create the firewall.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The unique identifier of the VPC where AWS Network Firewall should create the firewall.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public interface BuilderApplicator {
        public void apply(FirewallArgs.Builder a);
    }
    private static io.pulumi.aws.networkfirewall.FirewallArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.networkfirewall.FirewallArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Firewall(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Firewall(String name) {
        this(name, FirewallArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Firewall(String name, FirewallArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Firewall(String name, FirewallArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkfirewall/firewall:Firewall", name, args == null ? FirewallArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Firewall(String name, Output<String> id, @Nullable FirewallState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkfirewall/firewall:Firewall", name, state, makeResourceOptions(options, id));
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
    public static Firewall get(String name, Output<String> id, @Nullable FirewallState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Firewall(name, id, state, options);
    }
}
