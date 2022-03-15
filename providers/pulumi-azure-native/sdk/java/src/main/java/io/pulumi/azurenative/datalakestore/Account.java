// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datalakestore.AccountArgs;
import io.pulumi.azurenative.datalakestore.outputs.EncryptionConfigResponse;
import io.pulumi.azurenative.datalakestore.outputs.EncryptionIdentityResponse;
import io.pulumi.azurenative.datalakestore.outputs.FirewallRuleResponse;
import io.pulumi.azurenative.datalakestore.outputs.TrustedIdProviderResponse;
import io.pulumi.azurenative.datalakestore.outputs.VirtualNetworkRuleResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Data Lake Store account information.
 * API Version: 2016-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datalakestore:Account contosoadla 34adfa4f-cedf-4dc0-ba29-b6d1a69ab345 
 * ```
 * 
 */
@ResourceType(type="azure-native:datalakestore:Account")
public class Account extends io.pulumi.resources.CustomResource {
    /**
     * The unique identifier associated with this Data Lake Store account.
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return The unique identifier associated with this Data Lake Store account.
     * 
     */
    public Output<String> getAccountId() {
        return this.accountId;
    }
    /**
     * The account creation time.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The account creation time.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * The commitment tier in use for the current month.
     * 
     */
    @Export(name="currentTier", type=String.class, parameters={})
    private Output<String> currentTier;

    /**
     * @return The commitment tier in use for the current month.
     * 
     */
    public Output<String> getCurrentTier() {
        return this.currentTier;
    }
    /**
     * The default owner group for all new folders and files created in the Data Lake Store account.
     * 
     */
    @Export(name="defaultGroup", type=String.class, parameters={})
    private Output<String> defaultGroup;

    /**
     * @return The default owner group for all new folders and files created in the Data Lake Store account.
     * 
     */
    public Output<String> getDefaultGroup() {
        return this.defaultGroup;
    }
    /**
     * The Key Vault encryption configuration.
     * 
     */
    @Export(name="encryptionConfig", type=EncryptionConfigResponse.class, parameters={})
    private Output<EncryptionConfigResponse> encryptionConfig;

    /**
     * @return The Key Vault encryption configuration.
     * 
     */
    public Output<EncryptionConfigResponse> getEncryptionConfig() {
        return this.encryptionConfig;
    }
    /**
     * The current state of encryption provisioning for this Data Lake Store account.
     * 
     */
    @Export(name="encryptionProvisioningState", type=String.class, parameters={})
    private Output<String> encryptionProvisioningState;

    /**
     * @return The current state of encryption provisioning for this Data Lake Store account.
     * 
     */
    public Output<String> getEncryptionProvisioningState() {
        return this.encryptionProvisioningState;
    }
    /**
     * The current state of encryption for this Data Lake Store account.
     * 
     */
    @Export(name="encryptionState", type=String.class, parameters={})
    private Output<String> encryptionState;

    /**
     * @return The current state of encryption for this Data Lake Store account.
     * 
     */
    public Output<String> getEncryptionState() {
        return this.encryptionState;
    }
    /**
     * The full CName endpoint for this account.
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return The full CName endpoint for this account.
     * 
     */
    public Output<String> getEndpoint() {
        return this.endpoint;
    }
    /**
     * The current state of allowing or disallowing IPs originating within Azure through the firewall. If the firewall is disabled, this is not enforced.
     * 
     */
    @Export(name="firewallAllowAzureIps", type=String.class, parameters={})
    private Output<String> firewallAllowAzureIps;

    /**
     * @return The current state of allowing or disallowing IPs originating within Azure through the firewall. If the firewall is disabled, this is not enforced.
     * 
     */
    public Output<String> getFirewallAllowAzureIps() {
        return this.firewallAllowAzureIps;
    }
    /**
     * The list of firewall rules associated with this Data Lake Store account.
     * 
     */
    @Export(name="firewallRules", type=List.class, parameters={FirewallRuleResponse.class})
    private Output<List<FirewallRuleResponse>> firewallRules;

    /**
     * @return The list of firewall rules associated with this Data Lake Store account.
     * 
     */
    public Output<List<FirewallRuleResponse>> getFirewallRules() {
        return this.firewallRules;
    }
    /**
     * The current state of the IP address firewall for this Data Lake Store account.
     * 
     */
    @Export(name="firewallState", type=String.class, parameters={})
    private Output<String> firewallState;

    /**
     * @return The current state of the IP address firewall for this Data Lake Store account.
     * 
     */
    public Output<String> getFirewallState() {
        return this.firewallState;
    }
    /**
     * The Key Vault encryption identity, if any.
     * 
     */
    @Export(name="identity", type=EncryptionIdentityResponse.class, parameters={})
    private Output<EncryptionIdentityResponse> identity;

    /**
     * @return The Key Vault encryption identity, if any.
     * 
     */
    public Output<EncryptionIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * The account last modified time.
     * 
     */
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    /**
     * @return The account last modified time.
     * 
     */
    public Output<String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The commitment tier to use for next month.
     * 
     */
    @Export(name="newTier", type=String.class, parameters={})
    private Output<String> newTier;

    /**
     * @return The commitment tier to use for next month.
     * 
     */
    public Output<String> getNewTier() {
        return this.newTier;
    }
    /**
     * The provisioning status of the Data Lake Store account.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning status of the Data Lake Store account.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The state of the Data Lake Store account.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the Data Lake Store account.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Output<Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The current state of the trusted identity provider feature for this Data Lake Store account.
     * 
     */
    @Export(name="trustedIdProviderState", type=String.class, parameters={})
    private Output<String> trustedIdProviderState;

    /**
     * @return The current state of the trusted identity provider feature for this Data Lake Store account.
     * 
     */
    public Output<String> getTrustedIdProviderState() {
        return this.trustedIdProviderState;
    }
    /**
     * The list of trusted identity providers associated with this Data Lake Store account.
     * 
     */
    @Export(name="trustedIdProviders", type=List.class, parameters={TrustedIdProviderResponse.class})
    private Output<List<TrustedIdProviderResponse>> trustedIdProviders;

    /**
     * @return The list of trusted identity providers associated with this Data Lake Store account.
     * 
     */
    public Output<List<TrustedIdProviderResponse>> getTrustedIdProviders() {
        return this.trustedIdProviders;
    }
    /**
     * The resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The list of virtual network rules associated with this Data Lake Store account.
     * 
     */
    @Export(name="virtualNetworkRules", type=List.class, parameters={VirtualNetworkRuleResponse.class})
    private Output<List<VirtualNetworkRuleResponse>> virtualNetworkRules;

    /**
     * @return The list of virtual network rules associated with this Data Lake Store account.
     * 
     */
    public Output<List<VirtualNetworkRuleResponse>> getVirtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    public interface BuilderApplicator {
        public void apply(AccountArgs.Builder a);
    }
    private static io.pulumi.azurenative.datalakestore.AccountArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.datalakestore.AccountArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Account(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Account(String name) {
        this(name, AccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Account(String name, AccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Account(String name, AccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datalakestore:Account", name, args == null ? AccountArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Account(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datalakestore:Account", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:datalakestore/v20161101:Account").build())
            ))
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
    public static Account get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, options);
    }
}
