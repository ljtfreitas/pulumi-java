// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.VirtualNetworkGatewayConnectionProtocol;
import io.pulumi.azurenative.network.inputs.IpsecPolicyArgs;
import io.pulumi.azurenative.network.inputs.RoutingConfigurationArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.azurenative.network.inputs.TrafficSelectorPolicyArgs;
import io.pulumi.azurenative.network.inputs.VpnSiteLinkConnectionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpnConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnConnectionArgs Empty = new VpnConnectionArgs();

    /**
     * Expected bandwidth in MBPS.
     * 
     */
    @InputImport(name="connectionBandwidth")
        private final @Nullable Input<Integer> connectionBandwidth;

    public Input<Integer> getConnectionBandwidth() {
        return this.connectionBandwidth == null ? Input.empty() : this.connectionBandwidth;
    }

    /**
     * The name of the connection.
     * 
     */
    @InputImport(name="connectionName")
        private final @Nullable Input<String> connectionName;

    public Input<String> getConnectionName() {
        return this.connectionName == null ? Input.empty() : this.connectionName;
    }

    /**
     * DPD timeout in seconds for vpn connection.
     * 
     */
    @InputImport(name="dpdTimeoutSeconds")
        private final @Nullable Input<Integer> dpdTimeoutSeconds;

    public Input<Integer> getDpdTimeoutSeconds() {
        return this.dpdTimeoutSeconds == null ? Input.empty() : this.dpdTimeoutSeconds;
    }

    /**
     * EnableBgp flag.
     * 
     */
    @InputImport(name="enableBgp")
        private final @Nullable Input<Boolean> enableBgp;

    public Input<Boolean> getEnableBgp() {
        return this.enableBgp == null ? Input.empty() : this.enableBgp;
    }

    /**
     * Enable internet security.
     * 
     */
    @InputImport(name="enableInternetSecurity")
        private final @Nullable Input<Boolean> enableInternetSecurity;

    public Input<Boolean> getEnableInternetSecurity() {
        return this.enableInternetSecurity == null ? Input.empty() : this.enableInternetSecurity;
    }

    /**
     * EnableBgp flag.
     * 
     */
    @InputImport(name="enableRateLimiting")
        private final @Nullable Input<Boolean> enableRateLimiting;

    public Input<Boolean> getEnableRateLimiting() {
        return this.enableRateLimiting == null ? Input.empty() : this.enableRateLimiting;
    }

    /**
     * The name of the gateway.
     * 
     */
    @InputImport(name="gatewayName", required=true)
        private final Input<String> gatewayName;

    public Input<String> getGatewayName() {
        return this.gatewayName;
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
     * The IPSec Policies to be considered by this connection.
     * 
     */
    @InputImport(name="ipsecPolicies")
        private final @Nullable Input<List<IpsecPolicyArgs>> ipsecPolicies;

    public Input<List<IpsecPolicyArgs>> getIpsecPolicies() {
        return this.ipsecPolicies == null ? Input.empty() : this.ipsecPolicies;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Id of the connected vpn site.
     * 
     */
    @InputImport(name="remoteVpnSite")
        private final @Nullable Input<SubResourceArgs> remoteVpnSite;

    public Input<SubResourceArgs> getRemoteVpnSite() {
        return this.remoteVpnSite == null ? Input.empty() : this.remoteVpnSite;
    }

    /**
     * The resource group name of the VpnGateway.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    @InputImport(name="routingConfiguration")
        private final @Nullable Input<RoutingConfigurationArgs> routingConfiguration;

    public Input<RoutingConfigurationArgs> getRoutingConfiguration() {
        return this.routingConfiguration == null ? Input.empty() : this.routingConfiguration;
    }

    /**
     * Routing weight for vpn connection.
     * 
     */
    @InputImport(name="routingWeight")
        private final @Nullable Input<Integer> routingWeight;

    public Input<Integer> getRoutingWeight() {
        return this.routingWeight == null ? Input.empty() : this.routingWeight;
    }

    /**
     * SharedKey for the vpn connection.
     * 
     */
    @InputImport(name="sharedKey")
        private final @Nullable Input<String> sharedKey;

    public Input<String> getSharedKey() {
        return this.sharedKey == null ? Input.empty() : this.sharedKey;
    }

    /**
     * The Traffic Selector Policies to be considered by this connection.
     * 
     */
    @InputImport(name="trafficSelectorPolicies")
        private final @Nullable Input<List<TrafficSelectorPolicyArgs>> trafficSelectorPolicies;

    public Input<List<TrafficSelectorPolicyArgs>> getTrafficSelectorPolicies() {
        return this.trafficSelectorPolicies == null ? Input.empty() : this.trafficSelectorPolicies;
    }

    /**
     * Use local azure ip to initiate connection.
     * 
     */
    @InputImport(name="useLocalAzureIpAddress")
        private final @Nullable Input<Boolean> useLocalAzureIpAddress;

    public Input<Boolean> getUseLocalAzureIpAddress() {
        return this.useLocalAzureIpAddress == null ? Input.empty() : this.useLocalAzureIpAddress;
    }

    /**
     * Enable policy-based traffic selectors.
     * 
     */
    @InputImport(name="usePolicyBasedTrafficSelectors")
        private final @Nullable Input<Boolean> usePolicyBasedTrafficSelectors;

    public Input<Boolean> getUsePolicyBasedTrafficSelectors() {
        return this.usePolicyBasedTrafficSelectors == null ? Input.empty() : this.usePolicyBasedTrafficSelectors;
    }

    /**
     * Connection protocol used for this connection.
     * 
     */
    @InputImport(name="vpnConnectionProtocolType")
        private final @Nullable Input<Either<String,VirtualNetworkGatewayConnectionProtocol>> vpnConnectionProtocolType;

    public Input<Either<String,VirtualNetworkGatewayConnectionProtocol>> getVpnConnectionProtocolType() {
        return this.vpnConnectionProtocolType == null ? Input.empty() : this.vpnConnectionProtocolType;
    }

    /**
     * List of all vpn site link connections to the gateway.
     * 
     */
    @InputImport(name="vpnLinkConnections")
        private final @Nullable Input<List<VpnSiteLinkConnectionArgs>> vpnLinkConnections;

    public Input<List<VpnSiteLinkConnectionArgs>> getVpnLinkConnections() {
        return this.vpnLinkConnections == null ? Input.empty() : this.vpnLinkConnections;
    }

    public VpnConnectionArgs(
        @Nullable Input<Integer> connectionBandwidth,
        @Nullable Input<String> connectionName,
        @Nullable Input<Integer> dpdTimeoutSeconds,
        @Nullable Input<Boolean> enableBgp,
        @Nullable Input<Boolean> enableInternetSecurity,
        @Nullable Input<Boolean> enableRateLimiting,
        Input<String> gatewayName,
        @Nullable Input<String> id,
        @Nullable Input<List<IpsecPolicyArgs>> ipsecPolicies,
        @Nullable Input<String> name,
        @Nullable Input<SubResourceArgs> remoteVpnSite,
        Input<String> resourceGroupName,
        @Nullable Input<RoutingConfigurationArgs> routingConfiguration,
        @Nullable Input<Integer> routingWeight,
        @Nullable Input<String> sharedKey,
        @Nullable Input<List<TrafficSelectorPolicyArgs>> trafficSelectorPolicies,
        @Nullable Input<Boolean> useLocalAzureIpAddress,
        @Nullable Input<Boolean> usePolicyBasedTrafficSelectors,
        @Nullable Input<Either<String,VirtualNetworkGatewayConnectionProtocol>> vpnConnectionProtocolType,
        @Nullable Input<List<VpnSiteLinkConnectionArgs>> vpnLinkConnections) {
        this.connectionBandwidth = connectionBandwidth;
        this.connectionName = connectionName;
        this.dpdTimeoutSeconds = dpdTimeoutSeconds;
        this.enableBgp = enableBgp;
        this.enableInternetSecurity = enableInternetSecurity;
        this.enableRateLimiting = enableRateLimiting;
        this.gatewayName = Objects.requireNonNull(gatewayName, "expected parameter 'gatewayName' to be non-null");
        this.id = id;
        this.ipsecPolicies = ipsecPolicies;
        this.name = name;
        this.remoteVpnSite = remoteVpnSite;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routingConfiguration = routingConfiguration;
        this.routingWeight = routingWeight;
        this.sharedKey = sharedKey;
        this.trafficSelectorPolicies = trafficSelectorPolicies;
        this.useLocalAzureIpAddress = useLocalAzureIpAddress;
        this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
        this.vpnConnectionProtocolType = vpnConnectionProtocolType;
        this.vpnLinkConnections = vpnLinkConnections;
    }

    private VpnConnectionArgs() {
        this.connectionBandwidth = Input.empty();
        this.connectionName = Input.empty();
        this.dpdTimeoutSeconds = Input.empty();
        this.enableBgp = Input.empty();
        this.enableInternetSecurity = Input.empty();
        this.enableRateLimiting = Input.empty();
        this.gatewayName = Input.empty();
        this.id = Input.empty();
        this.ipsecPolicies = Input.empty();
        this.name = Input.empty();
        this.remoteVpnSite = Input.empty();
        this.resourceGroupName = Input.empty();
        this.routingConfiguration = Input.empty();
        this.routingWeight = Input.empty();
        this.sharedKey = Input.empty();
        this.trafficSelectorPolicies = Input.empty();
        this.useLocalAzureIpAddress = Input.empty();
        this.usePolicyBasedTrafficSelectors = Input.empty();
        this.vpnConnectionProtocolType = Input.empty();
        this.vpnLinkConnections = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> connectionBandwidth;
        private @Nullable Input<String> connectionName;
        private @Nullable Input<Integer> dpdTimeoutSeconds;
        private @Nullable Input<Boolean> enableBgp;
        private @Nullable Input<Boolean> enableInternetSecurity;
        private @Nullable Input<Boolean> enableRateLimiting;
        private Input<String> gatewayName;
        private @Nullable Input<String> id;
        private @Nullable Input<List<IpsecPolicyArgs>> ipsecPolicies;
        private @Nullable Input<String> name;
        private @Nullable Input<SubResourceArgs> remoteVpnSite;
        private Input<String> resourceGroupName;
        private @Nullable Input<RoutingConfigurationArgs> routingConfiguration;
        private @Nullable Input<Integer> routingWeight;
        private @Nullable Input<String> sharedKey;
        private @Nullable Input<List<TrafficSelectorPolicyArgs>> trafficSelectorPolicies;
        private @Nullable Input<Boolean> useLocalAzureIpAddress;
        private @Nullable Input<Boolean> usePolicyBasedTrafficSelectors;
        private @Nullable Input<Either<String,VirtualNetworkGatewayConnectionProtocol>> vpnConnectionProtocolType;
        private @Nullable Input<List<VpnSiteLinkConnectionArgs>> vpnLinkConnections;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionBandwidth = defaults.connectionBandwidth;
    	      this.connectionName = defaults.connectionName;
    	      this.dpdTimeoutSeconds = defaults.dpdTimeoutSeconds;
    	      this.enableBgp = defaults.enableBgp;
    	      this.enableInternetSecurity = defaults.enableInternetSecurity;
    	      this.enableRateLimiting = defaults.enableRateLimiting;
    	      this.gatewayName = defaults.gatewayName;
    	      this.id = defaults.id;
    	      this.ipsecPolicies = defaults.ipsecPolicies;
    	      this.name = defaults.name;
    	      this.remoteVpnSite = defaults.remoteVpnSite;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routingConfiguration = defaults.routingConfiguration;
    	      this.routingWeight = defaults.routingWeight;
    	      this.sharedKey = defaults.sharedKey;
    	      this.trafficSelectorPolicies = defaults.trafficSelectorPolicies;
    	      this.useLocalAzureIpAddress = defaults.useLocalAzureIpAddress;
    	      this.usePolicyBasedTrafficSelectors = defaults.usePolicyBasedTrafficSelectors;
    	      this.vpnConnectionProtocolType = defaults.vpnConnectionProtocolType;
    	      this.vpnLinkConnections = defaults.vpnLinkConnections;
        }

        public Builder setConnectionBandwidth(@Nullable Input<Integer> connectionBandwidth) {
            this.connectionBandwidth = connectionBandwidth;
            return this;
        }

        public Builder setConnectionBandwidth(@Nullable Integer connectionBandwidth) {
            this.connectionBandwidth = Input.ofNullable(connectionBandwidth);
            return this;
        }

        public Builder setConnectionName(@Nullable Input<String> connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        public Builder setConnectionName(@Nullable String connectionName) {
            this.connectionName = Input.ofNullable(connectionName);
            return this;
        }

        public Builder setDpdTimeoutSeconds(@Nullable Input<Integer> dpdTimeoutSeconds) {
            this.dpdTimeoutSeconds = dpdTimeoutSeconds;
            return this;
        }

        public Builder setDpdTimeoutSeconds(@Nullable Integer dpdTimeoutSeconds) {
            this.dpdTimeoutSeconds = Input.ofNullable(dpdTimeoutSeconds);
            return this;
        }

        public Builder setEnableBgp(@Nullable Input<Boolean> enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }

        public Builder setEnableBgp(@Nullable Boolean enableBgp) {
            this.enableBgp = Input.ofNullable(enableBgp);
            return this;
        }

        public Builder setEnableInternetSecurity(@Nullable Input<Boolean> enableInternetSecurity) {
            this.enableInternetSecurity = enableInternetSecurity;
            return this;
        }

        public Builder setEnableInternetSecurity(@Nullable Boolean enableInternetSecurity) {
            this.enableInternetSecurity = Input.ofNullable(enableInternetSecurity);
            return this;
        }

        public Builder setEnableRateLimiting(@Nullable Input<Boolean> enableRateLimiting) {
            this.enableRateLimiting = enableRateLimiting;
            return this;
        }

        public Builder setEnableRateLimiting(@Nullable Boolean enableRateLimiting) {
            this.enableRateLimiting = Input.ofNullable(enableRateLimiting);
            return this;
        }

        public Builder setGatewayName(Input<String> gatewayName) {
            this.gatewayName = Objects.requireNonNull(gatewayName);
            return this;
        }

        public Builder setGatewayName(String gatewayName) {
            this.gatewayName = Input.of(Objects.requireNonNull(gatewayName));
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

        public Builder setIpsecPolicies(@Nullable Input<List<IpsecPolicyArgs>> ipsecPolicies) {
            this.ipsecPolicies = ipsecPolicies;
            return this;
        }

        public Builder setIpsecPolicies(@Nullable List<IpsecPolicyArgs> ipsecPolicies) {
            this.ipsecPolicies = Input.ofNullable(ipsecPolicies);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRemoteVpnSite(@Nullable Input<SubResourceArgs> remoteVpnSite) {
            this.remoteVpnSite = remoteVpnSite;
            return this;
        }

        public Builder setRemoteVpnSite(@Nullable SubResourceArgs remoteVpnSite) {
            this.remoteVpnSite = Input.ofNullable(remoteVpnSite);
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

        public Builder setRoutingConfiguration(@Nullable Input<RoutingConfigurationArgs> routingConfiguration) {
            this.routingConfiguration = routingConfiguration;
            return this;
        }

        public Builder setRoutingConfiguration(@Nullable RoutingConfigurationArgs routingConfiguration) {
            this.routingConfiguration = Input.ofNullable(routingConfiguration);
            return this;
        }

        public Builder setRoutingWeight(@Nullable Input<Integer> routingWeight) {
            this.routingWeight = routingWeight;
            return this;
        }

        public Builder setRoutingWeight(@Nullable Integer routingWeight) {
            this.routingWeight = Input.ofNullable(routingWeight);
            return this;
        }

        public Builder setSharedKey(@Nullable Input<String> sharedKey) {
            this.sharedKey = sharedKey;
            return this;
        }

        public Builder setSharedKey(@Nullable String sharedKey) {
            this.sharedKey = Input.ofNullable(sharedKey);
            return this;
        }

        public Builder setTrafficSelectorPolicies(@Nullable Input<List<TrafficSelectorPolicyArgs>> trafficSelectorPolicies) {
            this.trafficSelectorPolicies = trafficSelectorPolicies;
            return this;
        }

        public Builder setTrafficSelectorPolicies(@Nullable List<TrafficSelectorPolicyArgs> trafficSelectorPolicies) {
            this.trafficSelectorPolicies = Input.ofNullable(trafficSelectorPolicies);
            return this;
        }

        public Builder setUseLocalAzureIpAddress(@Nullable Input<Boolean> useLocalAzureIpAddress) {
            this.useLocalAzureIpAddress = useLocalAzureIpAddress;
            return this;
        }

        public Builder setUseLocalAzureIpAddress(@Nullable Boolean useLocalAzureIpAddress) {
            this.useLocalAzureIpAddress = Input.ofNullable(useLocalAzureIpAddress);
            return this;
        }

        public Builder setUsePolicyBasedTrafficSelectors(@Nullable Input<Boolean> usePolicyBasedTrafficSelectors) {
            this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
            return this;
        }

        public Builder setUsePolicyBasedTrafficSelectors(@Nullable Boolean usePolicyBasedTrafficSelectors) {
            this.usePolicyBasedTrafficSelectors = Input.ofNullable(usePolicyBasedTrafficSelectors);
            return this;
        }

        public Builder setVpnConnectionProtocolType(@Nullable Input<Either<String,VirtualNetworkGatewayConnectionProtocol>> vpnConnectionProtocolType) {
            this.vpnConnectionProtocolType = vpnConnectionProtocolType;
            return this;
        }

        public Builder setVpnConnectionProtocolType(@Nullable Either<String,VirtualNetworkGatewayConnectionProtocol> vpnConnectionProtocolType) {
            this.vpnConnectionProtocolType = Input.ofNullable(vpnConnectionProtocolType);
            return this;
        }

        public Builder setVpnLinkConnections(@Nullable Input<List<VpnSiteLinkConnectionArgs>> vpnLinkConnections) {
            this.vpnLinkConnections = vpnLinkConnections;
            return this;
        }

        public Builder setVpnLinkConnections(@Nullable List<VpnSiteLinkConnectionArgs> vpnLinkConnections) {
            this.vpnLinkConnections = Input.ofNullable(vpnLinkConnections);
            return this;
        }
        public VpnConnectionArgs build() {
            return new VpnConnectionArgs(connectionBandwidth, connectionName, dpdTimeoutSeconds, enableBgp, enableInternetSecurity, enableRateLimiting, gatewayName, id, ipsecPolicies, name, remoteVpnSite, resourceGroupName, routingConfiguration, routingWeight, sharedKey, trafficSelectorPolicies, useLocalAzureIpAddress, usePolicyBasedTrafficSelectors, vpnConnectionProtocolType, vpnLinkConnections);
        }
    }
}
