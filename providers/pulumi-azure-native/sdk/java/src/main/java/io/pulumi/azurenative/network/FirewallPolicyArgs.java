// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.AzureFirewallThreatIntelMode;
import io.pulumi.azurenative.network.inputs.DnsSettingsArgs;
import io.pulumi.azurenative.network.inputs.FirewallPolicyInsightsArgs;
import io.pulumi.azurenative.network.inputs.FirewallPolicyIntrusionDetectionArgs;
import io.pulumi.azurenative.network.inputs.FirewallPolicySNATArgs;
import io.pulumi.azurenative.network.inputs.FirewallPolicySkuArgs;
import io.pulumi.azurenative.network.inputs.FirewallPolicyThreatIntelWhitelistArgs;
import io.pulumi.azurenative.network.inputs.FirewallPolicyTransportSecurityArgs;
import io.pulumi.azurenative.network.inputs.ManagedServiceIdentityArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyArgs Empty = new FirewallPolicyArgs();

    /**
     * The parent firewall policy from which rules are inherited.
     * 
     */
    @InputImport(name="basePolicy")
        private final @Nullable Input<SubResourceArgs> basePolicy;

    public Input<SubResourceArgs> getBasePolicy() {
        return this.basePolicy == null ? Input.empty() : this.basePolicy;
    }

    /**
     * DNS Proxy Settings definition.
     * 
     */
    @InputImport(name="dnsSettings")
        private final @Nullable Input<DnsSettingsArgs> dnsSettings;

    public Input<DnsSettingsArgs> getDnsSettings() {
        return this.dnsSettings == null ? Input.empty() : this.dnsSettings;
    }

    /**
     * The name of the Firewall Policy.
     * 
     */
    @InputImport(name="firewallPolicyName")
        private final @Nullable Input<String> firewallPolicyName;

    public Input<String> getFirewallPolicyName() {
        return this.firewallPolicyName == null ? Input.empty() : this.firewallPolicyName;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
        private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The identity of the firewall policy.
     * 
     */
    @InputImport(name="identity")
        private final @Nullable Input<ManagedServiceIdentityArgs> identity;

    public Input<ManagedServiceIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * Insights on Firewall Policy.
     * 
     */
    @InputImport(name="insights")
        private final @Nullable Input<FirewallPolicyInsightsArgs> insights;

    public Input<FirewallPolicyInsightsArgs> getInsights() {
        return this.insights == null ? Input.empty() : this.insights;
    }

    /**
     * The configuration for Intrusion detection.
     * 
     */
    @InputImport(name="intrusionDetection")
        private final @Nullable Input<FirewallPolicyIntrusionDetectionArgs> intrusionDetection;

    public Input<FirewallPolicyIntrusionDetectionArgs> getIntrusionDetection() {
        return this.intrusionDetection == null ? Input.empty() : this.intrusionDetection;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Firewall Policy SKU.
     * 
     */
    @InputImport(name="sku")
        private final @Nullable Input<FirewallPolicySkuArgs> sku;

    public Input<FirewallPolicySkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * The private IP addresses/IP ranges to which traffic will not be SNAT.
     * 
     */
    @InputImport(name="snat")
        private final @Nullable Input<FirewallPolicySNATArgs> snat;

    public Input<FirewallPolicySNATArgs> getSnat() {
        return this.snat == null ? Input.empty() : this.snat;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The operation mode for Threat Intelligence.
     * 
     */
    @InputImport(name="threatIntelMode")
        private final @Nullable Input<Either<String,AzureFirewallThreatIntelMode>> threatIntelMode;

    public Input<Either<String,AzureFirewallThreatIntelMode>> getThreatIntelMode() {
        return this.threatIntelMode == null ? Input.empty() : this.threatIntelMode;
    }

    /**
     * ThreatIntel Whitelist for Firewall Policy.
     * 
     */
    @InputImport(name="threatIntelWhitelist")
        private final @Nullable Input<FirewallPolicyThreatIntelWhitelistArgs> threatIntelWhitelist;

    public Input<FirewallPolicyThreatIntelWhitelistArgs> getThreatIntelWhitelist() {
        return this.threatIntelWhitelist == null ? Input.empty() : this.threatIntelWhitelist;
    }

    /**
     * TLS Configuration definition.
     * 
     */
    @InputImport(name="transportSecurity")
        private final @Nullable Input<FirewallPolicyTransportSecurityArgs> transportSecurity;

    public Input<FirewallPolicyTransportSecurityArgs> getTransportSecurity() {
        return this.transportSecurity == null ? Input.empty() : this.transportSecurity;
    }

    public FirewallPolicyArgs(
        @Nullable Input<SubResourceArgs> basePolicy,
        @Nullable Input<DnsSettingsArgs> dnsSettings,
        @Nullable Input<String> firewallPolicyName,
        @Nullable Input<String> id,
        @Nullable Input<ManagedServiceIdentityArgs> identity,
        @Nullable Input<FirewallPolicyInsightsArgs> insights,
        @Nullable Input<FirewallPolicyIntrusionDetectionArgs> intrusionDetection,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<FirewallPolicySkuArgs> sku,
        @Nullable Input<FirewallPolicySNATArgs> snat,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Either<String,AzureFirewallThreatIntelMode>> threatIntelMode,
        @Nullable Input<FirewallPolicyThreatIntelWhitelistArgs> threatIntelWhitelist,
        @Nullable Input<FirewallPolicyTransportSecurityArgs> transportSecurity) {
        this.basePolicy = basePolicy;
        this.dnsSettings = dnsSettings;
        this.firewallPolicyName = firewallPolicyName;
        this.id = id;
        this.identity = identity;
        this.insights = insights;
        this.intrusionDetection = intrusionDetection;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.snat = snat;
        this.tags = tags;
        this.threatIntelMode = threatIntelMode;
        this.threatIntelWhitelist = threatIntelWhitelist;
        this.transportSecurity = transportSecurity;
    }

    private FirewallPolicyArgs() {
        this.basePolicy = Input.empty();
        this.dnsSettings = Input.empty();
        this.firewallPolicyName = Input.empty();
        this.id = Input.empty();
        this.identity = Input.empty();
        this.insights = Input.empty();
        this.intrusionDetection = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.snat = Input.empty();
        this.tags = Input.empty();
        this.threatIntelMode = Input.empty();
        this.threatIntelWhitelist = Input.empty();
        this.transportSecurity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SubResourceArgs> basePolicy;
        private @Nullable Input<DnsSettingsArgs> dnsSettings;
        private @Nullable Input<String> firewallPolicyName;
        private @Nullable Input<String> id;
        private @Nullable Input<ManagedServiceIdentityArgs> identity;
        private @Nullable Input<FirewallPolicyInsightsArgs> insights;
        private @Nullable Input<FirewallPolicyIntrusionDetectionArgs> intrusionDetection;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<FirewallPolicySkuArgs> sku;
        private @Nullable Input<FirewallPolicySNATArgs> snat;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Either<String,AzureFirewallThreatIntelMode>> threatIntelMode;
        private @Nullable Input<FirewallPolicyThreatIntelWhitelistArgs> threatIntelWhitelist;
        private @Nullable Input<FirewallPolicyTransportSecurityArgs> transportSecurity;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basePolicy = defaults.basePolicy;
    	      this.dnsSettings = defaults.dnsSettings;
    	      this.firewallPolicyName = defaults.firewallPolicyName;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.insights = defaults.insights;
    	      this.intrusionDetection = defaults.intrusionDetection;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.snat = defaults.snat;
    	      this.tags = defaults.tags;
    	      this.threatIntelMode = defaults.threatIntelMode;
    	      this.threatIntelWhitelist = defaults.threatIntelWhitelist;
    	      this.transportSecurity = defaults.transportSecurity;
        }

        public Builder setBasePolicy(@Nullable Input<SubResourceArgs> basePolicy) {
            this.basePolicy = basePolicy;
            return this;
        }

        public Builder setBasePolicy(@Nullable SubResourceArgs basePolicy) {
            this.basePolicy = Input.ofNullable(basePolicy);
            return this;
        }

        public Builder setDnsSettings(@Nullable Input<DnsSettingsArgs> dnsSettings) {
            this.dnsSettings = dnsSettings;
            return this;
        }

        public Builder setDnsSettings(@Nullable DnsSettingsArgs dnsSettings) {
            this.dnsSettings = Input.ofNullable(dnsSettings);
            return this;
        }

        public Builder setFirewallPolicyName(@Nullable Input<String> firewallPolicyName) {
            this.firewallPolicyName = firewallPolicyName;
            return this;
        }

        public Builder setFirewallPolicyName(@Nullable String firewallPolicyName) {
            this.firewallPolicyName = Input.ofNullable(firewallPolicyName);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setIdentity(@Nullable Input<ManagedServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ManagedServiceIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setInsights(@Nullable Input<FirewallPolicyInsightsArgs> insights) {
            this.insights = insights;
            return this;
        }

        public Builder setInsights(@Nullable FirewallPolicyInsightsArgs insights) {
            this.insights = Input.ofNullable(insights);
            return this;
        }

        public Builder setIntrusionDetection(@Nullable Input<FirewallPolicyIntrusionDetectionArgs> intrusionDetection) {
            this.intrusionDetection = intrusionDetection;
            return this;
        }

        public Builder setIntrusionDetection(@Nullable FirewallPolicyIntrusionDetectionArgs intrusionDetection) {
            this.intrusionDetection = Input.ofNullable(intrusionDetection);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSku(@Nullable Input<FirewallPolicySkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable FirewallPolicySkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setSnat(@Nullable Input<FirewallPolicySNATArgs> snat) {
            this.snat = snat;
            return this;
        }

        public Builder setSnat(@Nullable FirewallPolicySNATArgs snat) {
            this.snat = Input.ofNullable(snat);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setThreatIntelMode(@Nullable Input<Either<String,AzureFirewallThreatIntelMode>> threatIntelMode) {
            this.threatIntelMode = threatIntelMode;
            return this;
        }

        public Builder setThreatIntelMode(@Nullable Either<String,AzureFirewallThreatIntelMode> threatIntelMode) {
            this.threatIntelMode = Input.ofNullable(threatIntelMode);
            return this;
        }

        public Builder setThreatIntelWhitelist(@Nullable Input<FirewallPolicyThreatIntelWhitelistArgs> threatIntelWhitelist) {
            this.threatIntelWhitelist = threatIntelWhitelist;
            return this;
        }

        public Builder setThreatIntelWhitelist(@Nullable FirewallPolicyThreatIntelWhitelistArgs threatIntelWhitelist) {
            this.threatIntelWhitelist = Input.ofNullable(threatIntelWhitelist);
            return this;
        }

        public Builder setTransportSecurity(@Nullable Input<FirewallPolicyTransportSecurityArgs> transportSecurity) {
            this.transportSecurity = transportSecurity;
            return this;
        }

        public Builder setTransportSecurity(@Nullable FirewallPolicyTransportSecurityArgs transportSecurity) {
            this.transportSecurity = Input.ofNullable(transportSecurity);
            return this;
        }
        public FirewallPolicyArgs build() {
            return new FirewallPolicyArgs(basePolicy, dnsSettings, firewallPolicyName, id, identity, insights, intrusionDetection, location, resourceGroupName, sku, snat, tags, threatIntelMode, threatIntelWhitelist, transportSecurity);
        }
    }
}
