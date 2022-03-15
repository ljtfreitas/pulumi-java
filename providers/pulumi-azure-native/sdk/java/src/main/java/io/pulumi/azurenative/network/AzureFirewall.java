// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.AzureFirewallArgs;
import io.pulumi.azurenative.network.outputs.AzureFirewallApplicationRuleCollectionResponse;
import io.pulumi.azurenative.network.outputs.AzureFirewallIPConfigurationResponse;
import io.pulumi.azurenative.network.outputs.AzureFirewallIpGroupsResponse;
import io.pulumi.azurenative.network.outputs.AzureFirewallNatRuleCollectionResponse;
import io.pulumi.azurenative.network.outputs.AzureFirewallNetworkRuleCollectionResponse;
import io.pulumi.azurenative.network.outputs.AzureFirewallSkuResponse;
import io.pulumi.azurenative.network.outputs.HubIPAddressesResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Azure Firewall resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:AzureFirewall azurefirewall /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/azureFirewalls/azurefirewall 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:AzureFirewall")
public class AzureFirewall extends io.pulumi.resources.CustomResource {
    /**
     * The additional properties used to further config this azure firewall.
     * 
     */
    @Export(name="additionalProperties", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> additionalProperties;

    /**
     * @return The additional properties used to further config this azure firewall.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getAdditionalProperties() {
        return this.additionalProperties;
    }
    /**
     * Collection of application rule collections used by Azure Firewall.
     * 
     */
    @Export(name="applicationRuleCollections", type=List.class, parameters={AzureFirewallApplicationRuleCollectionResponse.class})
    private Output</* @Nullable */ List<AzureFirewallApplicationRuleCollectionResponse>> applicationRuleCollections;

    /**
     * @return Collection of application rule collections used by Azure Firewall.
     * 
     */
    public Output</* @Nullable */ List<AzureFirewallApplicationRuleCollectionResponse>> getApplicationRuleCollections() {
        return this.applicationRuleCollections;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The firewallPolicy associated with this azure firewall.
     * 
     */
    @Export(name="firewallPolicy", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> firewallPolicy;

    /**
     * @return The firewallPolicy associated with this azure firewall.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getFirewallPolicy() {
        return this.firewallPolicy;
    }
    /**
     * IP addresses associated with AzureFirewall.
     * 
     */
    @Export(name="hubIPAddresses", type=HubIPAddressesResponse.class, parameters={})
    private Output</* @Nullable */ HubIPAddressesResponse> hubIPAddresses;

    /**
     * @return IP addresses associated with AzureFirewall.
     * 
     */
    public Output</* @Nullable */ HubIPAddressesResponse> getHubIPAddresses() {
        return this.hubIPAddresses;
    }
    /**
     * IP configuration of the Azure Firewall resource.
     * 
     */
    @Export(name="ipConfigurations", type=List.class, parameters={AzureFirewallIPConfigurationResponse.class})
    private Output</* @Nullable */ List<AzureFirewallIPConfigurationResponse>> ipConfigurations;

    /**
     * @return IP configuration of the Azure Firewall resource.
     * 
     */
    public Output</* @Nullable */ List<AzureFirewallIPConfigurationResponse>> getIpConfigurations() {
        return this.ipConfigurations;
    }
    /**
     * IpGroups associated with AzureFirewall.
     * 
     */
    @Export(name="ipGroups", type=List.class, parameters={AzureFirewallIpGroupsResponse.class})
    private Output<List<AzureFirewallIpGroupsResponse>> ipGroups;

    /**
     * @return IpGroups associated with AzureFirewall.
     * 
     */
    public Output<List<AzureFirewallIpGroupsResponse>> getIpGroups() {
        return this.ipGroups;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * IP configuration of the Azure Firewall used for management traffic.
     * 
     */
    @Export(name="managementIpConfiguration", type=AzureFirewallIPConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ AzureFirewallIPConfigurationResponse> managementIpConfiguration;

    /**
     * @return IP configuration of the Azure Firewall used for management traffic.
     * 
     */
    public Output</* @Nullable */ AzureFirewallIPConfigurationResponse> getManagementIpConfiguration() {
        return this.managementIpConfiguration;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Collection of NAT rule collections used by Azure Firewall.
     * 
     */
    @Export(name="natRuleCollections", type=List.class, parameters={AzureFirewallNatRuleCollectionResponse.class})
    private Output</* @Nullable */ List<AzureFirewallNatRuleCollectionResponse>> natRuleCollections;

    /**
     * @return Collection of NAT rule collections used by Azure Firewall.
     * 
     */
    public Output</* @Nullable */ List<AzureFirewallNatRuleCollectionResponse>> getNatRuleCollections() {
        return this.natRuleCollections;
    }
    /**
     * Collection of network rule collections used by Azure Firewall.
     * 
     */
    @Export(name="networkRuleCollections", type=List.class, parameters={AzureFirewallNetworkRuleCollectionResponse.class})
    private Output</* @Nullable */ List<AzureFirewallNetworkRuleCollectionResponse>> networkRuleCollections;

    /**
     * @return Collection of network rule collections used by Azure Firewall.
     * 
     */
    public Output</* @Nullable */ List<AzureFirewallNetworkRuleCollectionResponse>> getNetworkRuleCollections() {
        return this.networkRuleCollections;
    }
    /**
     * The provisioning state of the Azure firewall resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the Azure firewall resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The Azure Firewall Resource SKU.
     * 
     */
    @Export(name="sku", type=AzureFirewallSkuResponse.class, parameters={})
    private Output</* @Nullable */ AzureFirewallSkuResponse> sku;

    /**
     * @return The Azure Firewall Resource SKU.
     * 
     */
    public Output</* @Nullable */ AzureFirewallSkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The operation mode for Threat Intelligence.
     * 
     */
    @Export(name="threatIntelMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> threatIntelMode;

    /**
     * @return The operation mode for Threat Intelligence.
     * 
     */
    public Output</* @Nullable */ String> getThreatIntelMode() {
        return this.threatIntelMode;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The virtualHub to which the firewall belongs.
     * 
     */
    @Export(name="virtualHub", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> virtualHub;

    /**
     * @return The virtualHub to which the firewall belongs.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getVirtualHub() {
        return this.virtualHub;
    }
    /**
     * A list of availability zones denoting where the resource needs to come from.
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return A list of availability zones denoting where the resource needs to come from.
     * 
     */
    public Output</* @Nullable */ List<String>> getZones() {
        return this.zones;
    }

    public interface BuilderApplicator {
        public void apply(AzureFirewallArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.AzureFirewallArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.AzureFirewallArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AzureFirewall(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AzureFirewall(String name) {
        this(name, AzureFirewallArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AzureFirewall(String name, AzureFirewallArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AzureFirewall(String name, AzureFirewallArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:AzureFirewall", name, args == null ? AzureFirewallArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private AzureFirewall(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:AzureFirewall", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:network/v20180401:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20180601:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20180701:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20180801:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20181001:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20181101:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20181201:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190201:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190401:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190601:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190701:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190801:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190901:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20191101:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20191201:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200301:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200401:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200501:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200601:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200701:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200801:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20201101:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210201:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210301:AzureFirewall").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210501:AzureFirewall").build())
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
    public static AzureFirewall get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AzureFirewall(name, id, options);
    }
}
