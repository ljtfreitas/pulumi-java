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
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="basePolicy")
      private final @Nullable Output<SubResourceArgs> basePolicy;

    public Output<SubResourceArgs> getBasePolicy() {
        return this.basePolicy == null ? Output.empty() : this.basePolicy;
    }

    /**
     * DNS Proxy Settings definition.
     * 
     */
    @Import(name="dnsSettings")
      private final @Nullable Output<DnsSettingsArgs> dnsSettings;

    public Output<DnsSettingsArgs> getDnsSettings() {
        return this.dnsSettings == null ? Output.empty() : this.dnsSettings;
    }

    /**
     * The name of the Firewall Policy.
     * 
     */
    @Import(name="firewallPolicyName")
      private final @Nullable Output<String> firewallPolicyName;

    public Output<String> getFirewallPolicyName() {
        return this.firewallPolicyName == null ? Output.empty() : this.firewallPolicyName;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The identity of the firewall policy.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ManagedServiceIdentityArgs> identity;

    public Output<ManagedServiceIdentityArgs> getIdentity() {
        return this.identity == null ? Output.empty() : this.identity;
    }

    /**
     * Insights on Firewall Policy.
     * 
     */
    @Import(name="insights")
      private final @Nullable Output<FirewallPolicyInsightsArgs> insights;

    public Output<FirewallPolicyInsightsArgs> getInsights() {
        return this.insights == null ? Output.empty() : this.insights;
    }

    /**
     * The configuration for Intrusion detection.
     * 
     */
    @Import(name="intrusionDetection")
      private final @Nullable Output<FirewallPolicyIntrusionDetectionArgs> intrusionDetection;

    public Output<FirewallPolicyIntrusionDetectionArgs> getIntrusionDetection() {
        return this.intrusionDetection == null ? Output.empty() : this.intrusionDetection;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Firewall Policy SKU.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<FirewallPolicySkuArgs> sku;

    public Output<FirewallPolicySkuArgs> getSku() {
        return this.sku == null ? Output.empty() : this.sku;
    }

    /**
     * The private IP addresses/IP ranges to which traffic will not be SNAT.
     * 
     */
    @Import(name="snat")
      private final @Nullable Output<FirewallPolicySNATArgs> snat;

    public Output<FirewallPolicySNATArgs> getSnat() {
        return this.snat == null ? Output.empty() : this.snat;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The operation mode for Threat Intelligence.
     * 
     */
    @Import(name="threatIntelMode")
      private final @Nullable Output<Either<String,AzureFirewallThreatIntelMode>> threatIntelMode;

    public Output<Either<String,AzureFirewallThreatIntelMode>> getThreatIntelMode() {
        return this.threatIntelMode == null ? Output.empty() : this.threatIntelMode;
    }

    /**
     * ThreatIntel Whitelist for Firewall Policy.
     * 
     */
    @Import(name="threatIntelWhitelist")
      private final @Nullable Output<FirewallPolicyThreatIntelWhitelistArgs> threatIntelWhitelist;

    public Output<FirewallPolicyThreatIntelWhitelistArgs> getThreatIntelWhitelist() {
        return this.threatIntelWhitelist == null ? Output.empty() : this.threatIntelWhitelist;
    }

    /**
     * TLS Configuration definition.
     * 
     */
    @Import(name="transportSecurity")
      private final @Nullable Output<FirewallPolicyTransportSecurityArgs> transportSecurity;

    public Output<FirewallPolicyTransportSecurityArgs> getTransportSecurity() {
        return this.transportSecurity == null ? Output.empty() : this.transportSecurity;
    }

    public FirewallPolicyArgs(
        @Nullable Output<SubResourceArgs> basePolicy,
        @Nullable Output<DnsSettingsArgs> dnsSettings,
        @Nullable Output<String> firewallPolicyName,
        @Nullable Output<String> id,
        @Nullable Output<ManagedServiceIdentityArgs> identity,
        @Nullable Output<FirewallPolicyInsightsArgs> insights,
        @Nullable Output<FirewallPolicyIntrusionDetectionArgs> intrusionDetection,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<FirewallPolicySkuArgs> sku,
        @Nullable Output<FirewallPolicySNATArgs> snat,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Either<String,AzureFirewallThreatIntelMode>> threatIntelMode,
        @Nullable Output<FirewallPolicyThreatIntelWhitelistArgs> threatIntelWhitelist,
        @Nullable Output<FirewallPolicyTransportSecurityArgs> transportSecurity) {
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
        this.basePolicy = Output.empty();
        this.dnsSettings = Output.empty();
        this.firewallPolicyName = Output.empty();
        this.id = Output.empty();
        this.identity = Output.empty();
        this.insights = Output.empty();
        this.intrusionDetection = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sku = Output.empty();
        this.snat = Output.empty();
        this.tags = Output.empty();
        this.threatIntelMode = Output.empty();
        this.threatIntelWhitelist = Output.empty();
        this.transportSecurity = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SubResourceArgs> basePolicy;
        private @Nullable Output<DnsSettingsArgs> dnsSettings;
        private @Nullable Output<String> firewallPolicyName;
        private @Nullable Output<String> id;
        private @Nullable Output<ManagedServiceIdentityArgs> identity;
        private @Nullable Output<FirewallPolicyInsightsArgs> insights;
        private @Nullable Output<FirewallPolicyIntrusionDetectionArgs> intrusionDetection;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<FirewallPolicySkuArgs> sku;
        private @Nullable Output<FirewallPolicySNATArgs> snat;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Either<String,AzureFirewallThreatIntelMode>> threatIntelMode;
        private @Nullable Output<FirewallPolicyThreatIntelWhitelistArgs> threatIntelWhitelist;
        private @Nullable Output<FirewallPolicyTransportSecurityArgs> transportSecurity;

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

        public Builder basePolicy(@Nullable Output<SubResourceArgs> basePolicy) {
            this.basePolicy = basePolicy;
            return this;
        }

        public Builder basePolicy(@Nullable SubResourceArgs basePolicy) {
            this.basePolicy = Output.ofNullable(basePolicy);
            return this;
        }

        public Builder dnsSettings(@Nullable Output<DnsSettingsArgs> dnsSettings) {
            this.dnsSettings = dnsSettings;
            return this;
        }

        public Builder dnsSettings(@Nullable DnsSettingsArgs dnsSettings) {
            this.dnsSettings = Output.ofNullable(dnsSettings);
            return this;
        }

        public Builder firewallPolicyName(@Nullable Output<String> firewallPolicyName) {
            this.firewallPolicyName = firewallPolicyName;
            return this;
        }

        public Builder firewallPolicyName(@Nullable String firewallPolicyName) {
            this.firewallPolicyName = Output.ofNullable(firewallPolicyName);
            return this;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }

        public Builder identity(@Nullable Output<ManagedServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder identity(@Nullable ManagedServiceIdentityArgs identity) {
            this.identity = Output.ofNullable(identity);
            return this;
        }

        public Builder insights(@Nullable Output<FirewallPolicyInsightsArgs> insights) {
            this.insights = insights;
            return this;
        }

        public Builder insights(@Nullable FirewallPolicyInsightsArgs insights) {
            this.insights = Output.ofNullable(insights);
            return this;
        }

        public Builder intrusionDetection(@Nullable Output<FirewallPolicyIntrusionDetectionArgs> intrusionDetection) {
            this.intrusionDetection = intrusionDetection;
            return this;
        }

        public Builder intrusionDetection(@Nullable FirewallPolicyIntrusionDetectionArgs intrusionDetection) {
            this.intrusionDetection = Output.ofNullable(intrusionDetection);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder sku(@Nullable Output<FirewallPolicySkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder sku(@Nullable FirewallPolicySkuArgs sku) {
            this.sku = Output.ofNullable(sku);
            return this;
        }

        public Builder snat(@Nullable Output<FirewallPolicySNATArgs> snat) {
            this.snat = snat;
            return this;
        }

        public Builder snat(@Nullable FirewallPolicySNATArgs snat) {
            this.snat = Output.ofNullable(snat);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder threatIntelMode(@Nullable Output<Either<String,AzureFirewallThreatIntelMode>> threatIntelMode) {
            this.threatIntelMode = threatIntelMode;
            return this;
        }

        public Builder threatIntelMode(@Nullable Either<String,AzureFirewallThreatIntelMode> threatIntelMode) {
            this.threatIntelMode = Output.ofNullable(threatIntelMode);
            return this;
        }

        public Builder threatIntelWhitelist(@Nullable Output<FirewallPolicyThreatIntelWhitelistArgs> threatIntelWhitelist) {
            this.threatIntelWhitelist = threatIntelWhitelist;
            return this;
        }

        public Builder threatIntelWhitelist(@Nullable FirewallPolicyThreatIntelWhitelistArgs threatIntelWhitelist) {
            this.threatIntelWhitelist = Output.ofNullable(threatIntelWhitelist);
            return this;
        }

        public Builder transportSecurity(@Nullable Output<FirewallPolicyTransportSecurityArgs> transportSecurity) {
            this.transportSecurity = transportSecurity;
            return this;
        }

        public Builder transportSecurity(@Nullable FirewallPolicyTransportSecurityArgs transportSecurity) {
            this.transportSecurity = Output.ofNullable(transportSecurity);
            return this;
        }
        public FirewallPolicyArgs build() {
            return new FirewallPolicyArgs(basePolicy, dnsSettings, firewallPolicyName, id, identity, insights, intrusionDetection, location, resourceGroupName, sku, snat, tags, threatIntelMode, threatIntelWhitelist, transportSecurity);
        }
    }
}
