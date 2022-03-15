// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.AzureFirewallApplicationRuleCollectionResponse;
import io.pulumi.azurenative.network.outputs.AzureFirewallIPConfigurationResponse;
import io.pulumi.azurenative.network.outputs.AzureFirewallIpGroupsResponse;
import io.pulumi.azurenative.network.outputs.AzureFirewallNatRuleCollectionResponse;
import io.pulumi.azurenative.network.outputs.AzureFirewallNetworkRuleCollectionResponse;
import io.pulumi.azurenative.network.outputs.AzureFirewallSkuResponse;
import io.pulumi.azurenative.network.outputs.HubIPAddressesResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAzureFirewallResult {
    /**
     * The additional properties used to further config this azure firewall.
     * 
     */
    private final @Nullable Map<String,String> additionalProperties;
    /**
     * Collection of application rule collections used by Azure Firewall.
     * 
     */
    private final @Nullable List<AzureFirewallApplicationRuleCollectionResponse> applicationRuleCollections;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * The firewallPolicy associated with this azure firewall.
     * 
     */
    private final @Nullable SubResourceResponse firewallPolicy;
    /**
     * IP addresses associated with AzureFirewall.
     * 
     */
    private final @Nullable HubIPAddressesResponse hubIPAddresses;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * IP configuration of the Azure Firewall resource.
     * 
     */
    private final @Nullable List<AzureFirewallIPConfigurationResponse> ipConfigurations;
    /**
     * IpGroups associated with AzureFirewall.
     * 
     */
    private final List<AzureFirewallIpGroupsResponse> ipGroups;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * IP configuration of the Azure Firewall used for management traffic.
     * 
     */
    private final @Nullable AzureFirewallIPConfigurationResponse managementIpConfiguration;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Collection of NAT rule collections used by Azure Firewall.
     * 
     */
    private final @Nullable List<AzureFirewallNatRuleCollectionResponse> natRuleCollections;
    /**
     * Collection of network rule collections used by Azure Firewall.
     * 
     */
    private final @Nullable List<AzureFirewallNetworkRuleCollectionResponse> networkRuleCollections;
    /**
     * The provisioning state of the Azure firewall resource.
     * 
     */
    private final String provisioningState;
    /**
     * The Azure Firewall Resource SKU.
     * 
     */
    private final @Nullable AzureFirewallSkuResponse sku;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The operation mode for Threat Intelligence.
     * 
     */
    private final @Nullable String threatIntelMode;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * The virtualHub to which the firewall belongs.
     * 
     */
    private final @Nullable SubResourceResponse virtualHub;
    /**
     * A list of availability zones denoting where the resource needs to come from.
     * 
     */
    private final @Nullable List<String> zones;

    @CustomType.Constructor
    private GetAzureFirewallResult(
        @CustomType.Parameter("additionalProperties") @Nullable Map<String,String> additionalProperties,
        @CustomType.Parameter("applicationRuleCollections") @Nullable List<AzureFirewallApplicationRuleCollectionResponse> applicationRuleCollections,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("firewallPolicy") @Nullable SubResourceResponse firewallPolicy,
        @CustomType.Parameter("hubIPAddresses") @Nullable HubIPAddressesResponse hubIPAddresses,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("ipConfigurations") @Nullable List<AzureFirewallIPConfigurationResponse> ipConfigurations,
        @CustomType.Parameter("ipGroups") List<AzureFirewallIpGroupsResponse> ipGroups,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("managementIpConfiguration") @Nullable AzureFirewallIPConfigurationResponse managementIpConfiguration,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("natRuleCollections") @Nullable List<AzureFirewallNatRuleCollectionResponse> natRuleCollections,
        @CustomType.Parameter("networkRuleCollections") @Nullable List<AzureFirewallNetworkRuleCollectionResponse> networkRuleCollections,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("sku") @Nullable AzureFirewallSkuResponse sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("threatIntelMode") @Nullable String threatIntelMode,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("virtualHub") @Nullable SubResourceResponse virtualHub,
        @CustomType.Parameter("zones") @Nullable List<String> zones) {
        this.additionalProperties = additionalProperties;
        this.applicationRuleCollections = applicationRuleCollections;
        this.etag = etag;
        this.firewallPolicy = firewallPolicy;
        this.hubIPAddresses = hubIPAddresses;
        this.id = id;
        this.ipConfigurations = ipConfigurations;
        this.ipGroups = ipGroups;
        this.location = location;
        this.managementIpConfiguration = managementIpConfiguration;
        this.name = name;
        this.natRuleCollections = natRuleCollections;
        this.networkRuleCollections = networkRuleCollections;
        this.provisioningState = provisioningState;
        this.sku = sku;
        this.tags = tags;
        this.threatIntelMode = threatIntelMode;
        this.type = type;
        this.virtualHub = virtualHub;
        this.zones = zones;
    }

    /**
     * The additional properties used to further config this azure firewall.
     * 
    */
    public Map<String,String> getAdditionalProperties() {
        return this.additionalProperties == null ? Map.of() : this.additionalProperties;
    }
    /**
     * Collection of application rule collections used by Azure Firewall.
     * 
    */
    public List<AzureFirewallApplicationRuleCollectionResponse> getApplicationRuleCollections() {
        return this.applicationRuleCollections == null ? List.of() : this.applicationRuleCollections;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The firewallPolicy associated with this azure firewall.
     * 
    */
    public Optional<SubResourceResponse> getFirewallPolicy() {
        return Optional.ofNullable(this.firewallPolicy);
    }
    /**
     * IP addresses associated with AzureFirewall.
     * 
    */
    public Optional<HubIPAddressesResponse> getHubIPAddresses() {
        return Optional.ofNullable(this.hubIPAddresses);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * IP configuration of the Azure Firewall resource.
     * 
    */
    public List<AzureFirewallIPConfigurationResponse> getIpConfigurations() {
        return this.ipConfigurations == null ? List.of() : this.ipConfigurations;
    }
    /**
     * IpGroups associated with AzureFirewall.
     * 
    */
    public List<AzureFirewallIpGroupsResponse> getIpGroups() {
        return this.ipGroups;
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * IP configuration of the Azure Firewall used for management traffic.
     * 
    */
    public Optional<AzureFirewallIPConfigurationResponse> getManagementIpConfiguration() {
        return Optional.ofNullable(this.managementIpConfiguration);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Collection of NAT rule collections used by Azure Firewall.
     * 
    */
    public List<AzureFirewallNatRuleCollectionResponse> getNatRuleCollections() {
        return this.natRuleCollections == null ? List.of() : this.natRuleCollections;
    }
    /**
     * Collection of network rule collections used by Azure Firewall.
     * 
    */
    public List<AzureFirewallNetworkRuleCollectionResponse> getNetworkRuleCollections() {
        return this.networkRuleCollections == null ? List.of() : this.networkRuleCollections;
    }
    /**
     * The provisioning state of the Azure firewall resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The Azure Firewall Resource SKU.
     * 
    */
    public Optional<AzureFirewallSkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The operation mode for Threat Intelligence.
     * 
    */
    public Optional<String> getThreatIntelMode() {
        return Optional.ofNullable(this.threatIntelMode);
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The virtualHub to which the firewall belongs.
     * 
    */
    public Optional<SubResourceResponse> getVirtualHub() {
        return Optional.ofNullable(this.virtualHub);
    }
    /**
     * A list of availability zones denoting where the resource needs to come from.
     * 
    */
    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAzureFirewallResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> additionalProperties;
        private @Nullable List<AzureFirewallApplicationRuleCollectionResponse> applicationRuleCollections;
        private String etag;
        private @Nullable SubResourceResponse firewallPolicy;
        private @Nullable HubIPAddressesResponse hubIPAddresses;
        private @Nullable String id;
        private @Nullable List<AzureFirewallIPConfigurationResponse> ipConfigurations;
        private List<AzureFirewallIpGroupsResponse> ipGroups;
        private @Nullable String location;
        private @Nullable AzureFirewallIPConfigurationResponse managementIpConfiguration;
        private String name;
        private @Nullable List<AzureFirewallNatRuleCollectionResponse> natRuleCollections;
        private @Nullable List<AzureFirewallNetworkRuleCollectionResponse> networkRuleCollections;
        private String provisioningState;
        private @Nullable AzureFirewallSkuResponse sku;
        private @Nullable Map<String,String> tags;
        private @Nullable String threatIntelMode;
        private String type;
        private @Nullable SubResourceResponse virtualHub;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAzureFirewallResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalProperties = defaults.additionalProperties;
    	      this.applicationRuleCollections = defaults.applicationRuleCollections;
    	      this.etag = defaults.etag;
    	      this.firewallPolicy = defaults.firewallPolicy;
    	      this.hubIPAddresses = defaults.hubIPAddresses;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.ipGroups = defaults.ipGroups;
    	      this.location = defaults.location;
    	      this.managementIpConfiguration = defaults.managementIpConfiguration;
    	      this.name = defaults.name;
    	      this.natRuleCollections = defaults.natRuleCollections;
    	      this.networkRuleCollections = defaults.networkRuleCollections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.threatIntelMode = defaults.threatIntelMode;
    	      this.type = defaults.type;
    	      this.virtualHub = defaults.virtualHub;
    	      this.zones = defaults.zones;
        }

        public Builder additionalProperties(@Nullable Map<String,String> additionalProperties) {
            this.additionalProperties = additionalProperties;
            return this;
        }

        public Builder applicationRuleCollections(@Nullable List<AzureFirewallApplicationRuleCollectionResponse> applicationRuleCollections) {
            this.applicationRuleCollections = applicationRuleCollections;
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder firewallPolicy(@Nullable SubResourceResponse firewallPolicy) {
            this.firewallPolicy = firewallPolicy;
            return this;
        }

        public Builder hubIPAddresses(@Nullable HubIPAddressesResponse hubIPAddresses) {
            this.hubIPAddresses = hubIPAddresses;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder ipConfigurations(@Nullable List<AzureFirewallIPConfigurationResponse> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }

        public Builder ipGroups(List<AzureFirewallIpGroupsResponse> ipGroups) {
            this.ipGroups = Objects.requireNonNull(ipGroups);
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder managementIpConfiguration(@Nullable AzureFirewallIPConfigurationResponse managementIpConfiguration) {
            this.managementIpConfiguration = managementIpConfiguration;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder natRuleCollections(@Nullable List<AzureFirewallNatRuleCollectionResponse> natRuleCollections) {
            this.natRuleCollections = natRuleCollections;
            return this;
        }

        public Builder networkRuleCollections(@Nullable List<AzureFirewallNetworkRuleCollectionResponse> networkRuleCollections) {
            this.networkRuleCollections = networkRuleCollections;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder sku(@Nullable AzureFirewallSkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder threatIntelMode(@Nullable String threatIntelMode) {
            this.threatIntelMode = threatIntelMode;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder virtualHub(@Nullable SubResourceResponse virtualHub) {
            this.virtualHub = virtualHub;
            return this;
        }

        public Builder zones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public GetAzureFirewallResult build() {
            return new GetAzureFirewallResult(additionalProperties, applicationRuleCollections, etag, firewallPolicy, hubIPAddresses, id, ipConfigurations, ipGroups, location, managementIpConfiguration, name, natRuleCollections, networkRuleCollections, provisioningState, sku, tags, threatIntelMode, type, virtualHub, zones);
        }
    }
}
