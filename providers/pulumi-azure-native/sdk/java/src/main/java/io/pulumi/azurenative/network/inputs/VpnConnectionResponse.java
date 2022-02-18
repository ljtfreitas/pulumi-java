// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.IpsecPolicyResponse;
import io.pulumi.azurenative.network.inputs.RoutingConfigurationResponse;
import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.azurenative.network.inputs.TrafficSelectorPolicyResponse;
import io.pulumi.azurenative.network.inputs.VpnSiteLinkConnectionResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VpnConnection Resource.
 * 
 */
public final class VpnConnectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final VpnConnectionResponse Empty = new VpnConnectionResponse();

    /**
     * Expected bandwidth in MBPS.
     * 
     */
    @InputImport(name="connectionBandwidth")
    private final @Nullable Integer connectionBandwidth;

    public Optional<Integer> getConnectionBandwidth() {
        return this.connectionBandwidth == null ? Optional.empty() : Optional.ofNullable(this.connectionBandwidth);
    }

    /**
     * The connection status.
     * 
     */
    @InputImport(name="connectionStatus", required=true)
    private final String connectionStatus;

    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * DPD timeout in seconds for vpn connection.
     * 
     */
    @InputImport(name="dpdTimeoutSeconds")
    private final @Nullable Integer dpdTimeoutSeconds;

    public Optional<Integer> getDpdTimeoutSeconds() {
        return this.dpdTimeoutSeconds == null ? Optional.empty() : Optional.ofNullable(this.dpdTimeoutSeconds);
    }

    /**
     * Egress bytes transferred.
     * 
     */
    @InputImport(name="egressBytesTransferred", required=true)
    private final Double egressBytesTransferred;

    public Double getEgressBytesTransferred() {
        return this.egressBytesTransferred;
    }

    /**
     * EnableBgp flag.
     * 
     */
    @InputImport(name="enableBgp")
    private final @Nullable Boolean enableBgp;

    public Optional<Boolean> getEnableBgp() {
        return this.enableBgp == null ? Optional.empty() : Optional.ofNullable(this.enableBgp);
    }

    /**
     * Enable internet security.
     * 
     */
    @InputImport(name="enableInternetSecurity")
    private final @Nullable Boolean enableInternetSecurity;

    public Optional<Boolean> getEnableInternetSecurity() {
        return this.enableInternetSecurity == null ? Optional.empty() : Optional.ofNullable(this.enableInternetSecurity);
    }

    /**
     * EnableBgp flag.
     * 
     */
    @InputImport(name="enableRateLimiting")
    private final @Nullable Boolean enableRateLimiting;

    public Optional<Boolean> getEnableRateLimiting() {
        return this.enableRateLimiting == null ? Optional.empty() : Optional.ofNullable(this.enableRateLimiting);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Ingress bytes transferred.
     * 
     */
    @InputImport(name="ingressBytesTransferred", required=true)
    private final Double ingressBytesTransferred;

    public Double getIngressBytesTransferred() {
        return this.ingressBytesTransferred;
    }

    /**
     * The IPSec Policies to be considered by this connection.
     * 
     */
    @InputImport(name="ipsecPolicies")
    private final @Nullable List<IpsecPolicyResponse> ipsecPolicies;

    public List<IpsecPolicyResponse> getIpsecPolicies() {
        return this.ipsecPolicies == null ? List.of() : this.ipsecPolicies;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the VPN connection resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Id of the connected vpn site.
     * 
     */
    @InputImport(name="remoteVpnSite")
    private final @Nullable SubResourceResponse remoteVpnSite;

    public Optional<SubResourceResponse> getRemoteVpnSite() {
        return this.remoteVpnSite == null ? Optional.empty() : Optional.ofNullable(this.remoteVpnSite);
    }

    /**
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    @InputImport(name="routingConfiguration")
    private final @Nullable RoutingConfigurationResponse routingConfiguration;

    public Optional<RoutingConfigurationResponse> getRoutingConfiguration() {
        return this.routingConfiguration == null ? Optional.empty() : Optional.ofNullable(this.routingConfiguration);
    }

    /**
     * Routing weight for vpn connection.
     * 
     */
    @InputImport(name="routingWeight")
    private final @Nullable Integer routingWeight;

    public Optional<Integer> getRoutingWeight() {
        return this.routingWeight == null ? Optional.empty() : Optional.ofNullable(this.routingWeight);
    }

    /**
     * SharedKey for the vpn connection.
     * 
     */
    @InputImport(name="sharedKey")
    private final @Nullable String sharedKey;

    public Optional<String> getSharedKey() {
        return this.sharedKey == null ? Optional.empty() : Optional.ofNullable(this.sharedKey);
    }

    /**
     * The Traffic Selector Policies to be considered by this connection.
     * 
     */
    @InputImport(name="trafficSelectorPolicies")
    private final @Nullable List<TrafficSelectorPolicyResponse> trafficSelectorPolicies;

    public List<TrafficSelectorPolicyResponse> getTrafficSelectorPolicies() {
        return this.trafficSelectorPolicies == null ? List.of() : this.trafficSelectorPolicies;
    }

    /**
     * Use local azure ip to initiate connection.
     * 
     */
    @InputImport(name="useLocalAzureIpAddress")
    private final @Nullable Boolean useLocalAzureIpAddress;

    public Optional<Boolean> getUseLocalAzureIpAddress() {
        return this.useLocalAzureIpAddress == null ? Optional.empty() : Optional.ofNullable(this.useLocalAzureIpAddress);
    }

    /**
     * Enable policy-based traffic selectors.
     * 
     */
    @InputImport(name="usePolicyBasedTrafficSelectors")
    private final @Nullable Boolean usePolicyBasedTrafficSelectors;

    public Optional<Boolean> getUsePolicyBasedTrafficSelectors() {
        return this.usePolicyBasedTrafficSelectors == null ? Optional.empty() : Optional.ofNullable(this.usePolicyBasedTrafficSelectors);
    }

    /**
     * Connection protocol used for this connection.
     * 
     */
    @InputImport(name="vpnConnectionProtocolType")
    private final @Nullable String vpnConnectionProtocolType;

    public Optional<String> getVpnConnectionProtocolType() {
        return this.vpnConnectionProtocolType == null ? Optional.empty() : Optional.ofNullable(this.vpnConnectionProtocolType);
    }

    /**
     * List of all vpn site link connections to the gateway.
     * 
     */
    @InputImport(name="vpnLinkConnections")
    private final @Nullable List<VpnSiteLinkConnectionResponse> vpnLinkConnections;

    public List<VpnSiteLinkConnectionResponse> getVpnLinkConnections() {
        return this.vpnLinkConnections == null ? List.of() : this.vpnLinkConnections;
    }

    public VpnConnectionResponse(
        @Nullable Integer connectionBandwidth,
        String connectionStatus,
        @Nullable Integer dpdTimeoutSeconds,
        Double egressBytesTransferred,
        @Nullable Boolean enableBgp,
        @Nullable Boolean enableInternetSecurity,
        @Nullable Boolean enableRateLimiting,
        String etag,
        @Nullable String id,
        Double ingressBytesTransferred,
        @Nullable List<IpsecPolicyResponse> ipsecPolicies,
        @Nullable String name,
        String provisioningState,
        @Nullable SubResourceResponse remoteVpnSite,
        @Nullable RoutingConfigurationResponse routingConfiguration,
        @Nullable Integer routingWeight,
        @Nullable String sharedKey,
        @Nullable List<TrafficSelectorPolicyResponse> trafficSelectorPolicies,
        @Nullable Boolean useLocalAzureIpAddress,
        @Nullable Boolean usePolicyBasedTrafficSelectors,
        @Nullable String vpnConnectionProtocolType,
        @Nullable List<VpnSiteLinkConnectionResponse> vpnLinkConnections) {
        this.connectionBandwidth = connectionBandwidth;
        this.connectionStatus = Objects.requireNonNull(connectionStatus, "expected parameter 'connectionStatus' to be non-null");
        this.dpdTimeoutSeconds = dpdTimeoutSeconds;
        this.egressBytesTransferred = Objects.requireNonNull(egressBytesTransferred, "expected parameter 'egressBytesTransferred' to be non-null");
        this.enableBgp = enableBgp;
        this.enableInternetSecurity = enableInternetSecurity;
        this.enableRateLimiting = enableRateLimiting;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.ingressBytesTransferred = Objects.requireNonNull(ingressBytesTransferred, "expected parameter 'ingressBytesTransferred' to be non-null");
        this.ipsecPolicies = ipsecPolicies;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.remoteVpnSite = remoteVpnSite;
        this.routingConfiguration = routingConfiguration;
        this.routingWeight = routingWeight;
        this.sharedKey = sharedKey;
        this.trafficSelectorPolicies = trafficSelectorPolicies;
        this.useLocalAzureIpAddress = useLocalAzureIpAddress;
        this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
        this.vpnConnectionProtocolType = vpnConnectionProtocolType;
        this.vpnLinkConnections = vpnLinkConnections;
    }

    private VpnConnectionResponse() {
        this.connectionBandwidth = null;
        this.connectionStatus = null;
        this.dpdTimeoutSeconds = null;
        this.egressBytesTransferred = null;
        this.enableBgp = null;
        this.enableInternetSecurity = null;
        this.enableRateLimiting = null;
        this.etag = null;
        this.id = null;
        this.ingressBytesTransferred = null;
        this.ipsecPolicies = List.of();
        this.name = null;
        this.provisioningState = null;
        this.remoteVpnSite = null;
        this.routingConfiguration = null;
        this.routingWeight = null;
        this.sharedKey = null;
        this.trafficSelectorPolicies = List.of();
        this.useLocalAzureIpAddress = null;
        this.usePolicyBasedTrafficSelectors = null;
        this.vpnConnectionProtocolType = null;
        this.vpnLinkConnections = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer connectionBandwidth;
        private String connectionStatus;
        private @Nullable Integer dpdTimeoutSeconds;
        private Double egressBytesTransferred;
        private @Nullable Boolean enableBgp;
        private @Nullable Boolean enableInternetSecurity;
        private @Nullable Boolean enableRateLimiting;
        private String etag;
        private @Nullable String id;
        private Double ingressBytesTransferred;
        private @Nullable List<IpsecPolicyResponse> ipsecPolicies;
        private @Nullable String name;
        private String provisioningState;
        private @Nullable SubResourceResponse remoteVpnSite;
        private @Nullable RoutingConfigurationResponse routingConfiguration;
        private @Nullable Integer routingWeight;
        private @Nullable String sharedKey;
        private @Nullable List<TrafficSelectorPolicyResponse> trafficSelectorPolicies;
        private @Nullable Boolean useLocalAzureIpAddress;
        private @Nullable Boolean usePolicyBasedTrafficSelectors;
        private @Nullable String vpnConnectionProtocolType;
        private @Nullable List<VpnSiteLinkConnectionResponse> vpnLinkConnections;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionBandwidth = defaults.connectionBandwidth;
    	      this.connectionStatus = defaults.connectionStatus;
    	      this.dpdTimeoutSeconds = defaults.dpdTimeoutSeconds;
    	      this.egressBytesTransferred = defaults.egressBytesTransferred;
    	      this.enableBgp = defaults.enableBgp;
    	      this.enableInternetSecurity = defaults.enableInternetSecurity;
    	      this.enableRateLimiting = defaults.enableRateLimiting;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.ingressBytesTransferred = defaults.ingressBytesTransferred;
    	      this.ipsecPolicies = defaults.ipsecPolicies;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.remoteVpnSite = defaults.remoteVpnSite;
    	      this.routingConfiguration = defaults.routingConfiguration;
    	      this.routingWeight = defaults.routingWeight;
    	      this.sharedKey = defaults.sharedKey;
    	      this.trafficSelectorPolicies = defaults.trafficSelectorPolicies;
    	      this.useLocalAzureIpAddress = defaults.useLocalAzureIpAddress;
    	      this.usePolicyBasedTrafficSelectors = defaults.usePolicyBasedTrafficSelectors;
    	      this.vpnConnectionProtocolType = defaults.vpnConnectionProtocolType;
    	      this.vpnLinkConnections = defaults.vpnLinkConnections;
        }

        public Builder setConnectionBandwidth(@Nullable Integer connectionBandwidth) {
            this.connectionBandwidth = connectionBandwidth;
            return this;
        }

        public Builder setConnectionStatus(String connectionStatus) {
            this.connectionStatus = Objects.requireNonNull(connectionStatus);
            return this;
        }

        public Builder setDpdTimeoutSeconds(@Nullable Integer dpdTimeoutSeconds) {
            this.dpdTimeoutSeconds = dpdTimeoutSeconds;
            return this;
        }

        public Builder setEgressBytesTransferred(Double egressBytesTransferred) {
            this.egressBytesTransferred = Objects.requireNonNull(egressBytesTransferred);
            return this;
        }

        public Builder setEnableBgp(@Nullable Boolean enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }

        public Builder setEnableInternetSecurity(@Nullable Boolean enableInternetSecurity) {
            this.enableInternetSecurity = enableInternetSecurity;
            return this;
        }

        public Builder setEnableRateLimiting(@Nullable Boolean enableRateLimiting) {
            this.enableRateLimiting = enableRateLimiting;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIngressBytesTransferred(Double ingressBytesTransferred) {
            this.ingressBytesTransferred = Objects.requireNonNull(ingressBytesTransferred);
            return this;
        }

        public Builder setIpsecPolicies(@Nullable List<IpsecPolicyResponse> ipsecPolicies) {
            this.ipsecPolicies = ipsecPolicies;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRemoteVpnSite(@Nullable SubResourceResponse remoteVpnSite) {
            this.remoteVpnSite = remoteVpnSite;
            return this;
        }

        public Builder setRoutingConfiguration(@Nullable RoutingConfigurationResponse routingConfiguration) {
            this.routingConfiguration = routingConfiguration;
            return this;
        }

        public Builder setRoutingWeight(@Nullable Integer routingWeight) {
            this.routingWeight = routingWeight;
            return this;
        }

        public Builder setSharedKey(@Nullable String sharedKey) {
            this.sharedKey = sharedKey;
            return this;
        }

        public Builder setTrafficSelectorPolicies(@Nullable List<TrafficSelectorPolicyResponse> trafficSelectorPolicies) {
            this.trafficSelectorPolicies = trafficSelectorPolicies;
            return this;
        }

        public Builder setUseLocalAzureIpAddress(@Nullable Boolean useLocalAzureIpAddress) {
            this.useLocalAzureIpAddress = useLocalAzureIpAddress;
            return this;
        }

        public Builder setUsePolicyBasedTrafficSelectors(@Nullable Boolean usePolicyBasedTrafficSelectors) {
            this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
            return this;
        }

        public Builder setVpnConnectionProtocolType(@Nullable String vpnConnectionProtocolType) {
            this.vpnConnectionProtocolType = vpnConnectionProtocolType;
            return this;
        }

        public Builder setVpnLinkConnections(@Nullable List<VpnSiteLinkConnectionResponse> vpnLinkConnections) {
            this.vpnLinkConnections = vpnLinkConnections;
            return this;
        }

        public VpnConnectionResponse build() {
            return new VpnConnectionResponse(connectionBandwidth, connectionStatus, dpdTimeoutSeconds, egressBytesTransferred, enableBgp, enableInternetSecurity, enableRateLimiting, etag, id, ingressBytesTransferred, ipsecPolicies, name, provisioningState, remoteVpnSite, routingConfiguration, routingWeight, sharedKey, trafficSelectorPolicies, useLocalAzureIpAddress, usePolicyBasedTrafficSelectors, vpnConnectionProtocolType, vpnLinkConnections);
        }
    }
}
