// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ExpressRoutePeeringState;
import io.pulumi.azurenative.network.enums.ExpressRoutePeeringType;
import io.pulumi.azurenative.network.inputs.ExpressRouteCircuitConnectionArgs;
import io.pulumi.azurenative.network.inputs.ExpressRouteCircuitPeeringConfigArgs;
import io.pulumi.azurenative.network.inputs.ExpressRouteCircuitStatsArgs;
import io.pulumi.azurenative.network.inputs.Ipv6ExpressRouteCircuitPeeringConfigArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Peering in an ExpressRouteCircuit resource.
 * 
 */
public final class ExpressRouteCircuitPeeringArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExpressRouteCircuitPeeringArgs Empty = new ExpressRouteCircuitPeeringArgs();

    /**
     * The Azure ASN.
     * 
     */
    @InputImport(name="azureASN")
        private final @Nullable Input<Integer> azureASN;

    public Input<Integer> getAzureASN() {
        return this.azureASN == null ? Input.empty() : this.azureASN;
    }

    /**
     * The list of circuit connections associated with Azure Private Peering for this circuit.
     * 
     */
    @InputImport(name="connections")
        private final @Nullable Input<List<ExpressRouteCircuitConnectionArgs>> connections;

    public Input<List<ExpressRouteCircuitConnectionArgs>> getConnections() {
        return this.connections == null ? Input.empty() : this.connections;
    }

    /**
     * The GatewayManager Etag.
     * 
     */
    @InputImport(name="gatewayManagerEtag")
        private final @Nullable Input<String> gatewayManagerEtag;

    public Input<String> getGatewayManagerEtag() {
        return this.gatewayManagerEtag == null ? Input.empty() : this.gatewayManagerEtag;
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
     * The IPv6 peering configuration.
     * 
     */
    @InputImport(name="ipv6PeeringConfig")
        private final @Nullable Input<Ipv6ExpressRouteCircuitPeeringConfigArgs> ipv6PeeringConfig;

    public Input<Ipv6ExpressRouteCircuitPeeringConfigArgs> getIpv6PeeringConfig() {
        return this.ipv6PeeringConfig == null ? Input.empty() : this.ipv6PeeringConfig;
    }

    /**
     * The Microsoft peering configuration.
     * 
     */
    @InputImport(name="microsoftPeeringConfig")
        private final @Nullable Input<ExpressRouteCircuitPeeringConfigArgs> microsoftPeeringConfig;

    public Input<ExpressRouteCircuitPeeringConfigArgs> getMicrosoftPeeringConfig() {
        return this.microsoftPeeringConfig == null ? Input.empty() : this.microsoftPeeringConfig;
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
     * The peer ASN.
     * 
     */
    @InputImport(name="peerASN")
        private final @Nullable Input<Double> peerASN;

    public Input<Double> getPeerASN() {
        return this.peerASN == null ? Input.empty() : this.peerASN;
    }

    /**
     * The peering type.
     * 
     */
    @InputImport(name="peeringType")
        private final @Nullable Input<Either<String,ExpressRoutePeeringType>> peeringType;

    public Input<Either<String,ExpressRoutePeeringType>> getPeeringType() {
        return this.peeringType == null ? Input.empty() : this.peeringType;
    }

    /**
     * The primary port.
     * 
     */
    @InputImport(name="primaryAzurePort")
        private final @Nullable Input<String> primaryAzurePort;

    public Input<String> getPrimaryAzurePort() {
        return this.primaryAzurePort == null ? Input.empty() : this.primaryAzurePort;
    }

    /**
     * The primary address prefix.
     * 
     */
    @InputImport(name="primaryPeerAddressPrefix")
        private final @Nullable Input<String> primaryPeerAddressPrefix;

    public Input<String> getPrimaryPeerAddressPrefix() {
        return this.primaryPeerAddressPrefix == null ? Input.empty() : this.primaryPeerAddressPrefix;
    }

    /**
     * The reference to the RouteFilter resource.
     * 
     */
    @InputImport(name="routeFilter")
        private final @Nullable Input<SubResourceArgs> routeFilter;

    public Input<SubResourceArgs> getRouteFilter() {
        return this.routeFilter == null ? Input.empty() : this.routeFilter;
    }

    /**
     * The secondary port.
     * 
     */
    @InputImport(name="secondaryAzurePort")
        private final @Nullable Input<String> secondaryAzurePort;

    public Input<String> getSecondaryAzurePort() {
        return this.secondaryAzurePort == null ? Input.empty() : this.secondaryAzurePort;
    }

    /**
     * The secondary address prefix.
     * 
     */
    @InputImport(name="secondaryPeerAddressPrefix")
        private final @Nullable Input<String> secondaryPeerAddressPrefix;

    public Input<String> getSecondaryPeerAddressPrefix() {
        return this.secondaryPeerAddressPrefix == null ? Input.empty() : this.secondaryPeerAddressPrefix;
    }

    /**
     * The shared key.
     * 
     */
    @InputImport(name="sharedKey")
        private final @Nullable Input<String> sharedKey;

    public Input<String> getSharedKey() {
        return this.sharedKey == null ? Input.empty() : this.sharedKey;
    }

    /**
     * The peering state.
     * 
     */
    @InputImport(name="state")
        private final @Nullable Input<Either<String,ExpressRoutePeeringState>> state;

    public Input<Either<String,ExpressRoutePeeringState>> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * The peering stats of express route circuit.
     * 
     */
    @InputImport(name="stats")
        private final @Nullable Input<ExpressRouteCircuitStatsArgs> stats;

    public Input<ExpressRouteCircuitStatsArgs> getStats() {
        return this.stats == null ? Input.empty() : this.stats;
    }

    /**
     * The VLAN ID.
     * 
     */
    @InputImport(name="vlanId")
        private final @Nullable Input<Integer> vlanId;

    public Input<Integer> getVlanId() {
        return this.vlanId == null ? Input.empty() : this.vlanId;
    }

    public ExpressRouteCircuitPeeringArgs(
        @Nullable Input<Integer> azureASN,
        @Nullable Input<List<ExpressRouteCircuitConnectionArgs>> connections,
        @Nullable Input<String> gatewayManagerEtag,
        @Nullable Input<String> id,
        @Nullable Input<Ipv6ExpressRouteCircuitPeeringConfigArgs> ipv6PeeringConfig,
        @Nullable Input<ExpressRouteCircuitPeeringConfigArgs> microsoftPeeringConfig,
        @Nullable Input<String> name,
        @Nullable Input<Double> peerASN,
        @Nullable Input<Either<String,ExpressRoutePeeringType>> peeringType,
        @Nullable Input<String> primaryAzurePort,
        @Nullable Input<String> primaryPeerAddressPrefix,
        @Nullable Input<SubResourceArgs> routeFilter,
        @Nullable Input<String> secondaryAzurePort,
        @Nullable Input<String> secondaryPeerAddressPrefix,
        @Nullable Input<String> sharedKey,
        @Nullable Input<Either<String,ExpressRoutePeeringState>> state,
        @Nullable Input<ExpressRouteCircuitStatsArgs> stats,
        @Nullable Input<Integer> vlanId) {
        this.azureASN = azureASN;
        this.connections = connections;
        this.gatewayManagerEtag = gatewayManagerEtag;
        this.id = id;
        this.ipv6PeeringConfig = ipv6PeeringConfig;
        this.microsoftPeeringConfig = microsoftPeeringConfig;
        this.name = name;
        this.peerASN = peerASN;
        this.peeringType = peeringType;
        this.primaryAzurePort = primaryAzurePort;
        this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
        this.routeFilter = routeFilter;
        this.secondaryAzurePort = secondaryAzurePort;
        this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
        this.sharedKey = sharedKey;
        this.state = state;
        this.stats = stats;
        this.vlanId = vlanId;
    }

    private ExpressRouteCircuitPeeringArgs() {
        this.azureASN = Input.empty();
        this.connections = Input.empty();
        this.gatewayManagerEtag = Input.empty();
        this.id = Input.empty();
        this.ipv6PeeringConfig = Input.empty();
        this.microsoftPeeringConfig = Input.empty();
        this.name = Input.empty();
        this.peerASN = Input.empty();
        this.peeringType = Input.empty();
        this.primaryAzurePort = Input.empty();
        this.primaryPeerAddressPrefix = Input.empty();
        this.routeFilter = Input.empty();
        this.secondaryAzurePort = Input.empty();
        this.secondaryPeerAddressPrefix = Input.empty();
        this.sharedKey = Input.empty();
        this.state = Input.empty();
        this.stats = Input.empty();
        this.vlanId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> azureASN;
        private @Nullable Input<List<ExpressRouteCircuitConnectionArgs>> connections;
        private @Nullable Input<String> gatewayManagerEtag;
        private @Nullable Input<String> id;
        private @Nullable Input<Ipv6ExpressRouteCircuitPeeringConfigArgs> ipv6PeeringConfig;
        private @Nullable Input<ExpressRouteCircuitPeeringConfigArgs> microsoftPeeringConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<Double> peerASN;
        private @Nullable Input<Either<String,ExpressRoutePeeringType>> peeringType;
        private @Nullable Input<String> primaryAzurePort;
        private @Nullable Input<String> primaryPeerAddressPrefix;
        private @Nullable Input<SubResourceArgs> routeFilter;
        private @Nullable Input<String> secondaryAzurePort;
        private @Nullable Input<String> secondaryPeerAddressPrefix;
        private @Nullable Input<String> sharedKey;
        private @Nullable Input<Either<String,ExpressRoutePeeringState>> state;
        private @Nullable Input<ExpressRouteCircuitStatsArgs> stats;
        private @Nullable Input<Integer> vlanId;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitPeeringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureASN = defaults.azureASN;
    	      this.connections = defaults.connections;
    	      this.gatewayManagerEtag = defaults.gatewayManagerEtag;
    	      this.id = defaults.id;
    	      this.ipv6PeeringConfig = defaults.ipv6PeeringConfig;
    	      this.microsoftPeeringConfig = defaults.microsoftPeeringConfig;
    	      this.name = defaults.name;
    	      this.peerASN = defaults.peerASN;
    	      this.peeringType = defaults.peeringType;
    	      this.primaryAzurePort = defaults.primaryAzurePort;
    	      this.primaryPeerAddressPrefix = defaults.primaryPeerAddressPrefix;
    	      this.routeFilter = defaults.routeFilter;
    	      this.secondaryAzurePort = defaults.secondaryAzurePort;
    	      this.secondaryPeerAddressPrefix = defaults.secondaryPeerAddressPrefix;
    	      this.sharedKey = defaults.sharedKey;
    	      this.state = defaults.state;
    	      this.stats = defaults.stats;
    	      this.vlanId = defaults.vlanId;
        }

        public Builder setAzureASN(@Nullable Input<Integer> azureASN) {
            this.azureASN = azureASN;
            return this;
        }

        public Builder setAzureASN(@Nullable Integer azureASN) {
            this.azureASN = Input.ofNullable(azureASN);
            return this;
        }

        public Builder setConnections(@Nullable Input<List<ExpressRouteCircuitConnectionArgs>> connections) {
            this.connections = connections;
            return this;
        }

        public Builder setConnections(@Nullable List<ExpressRouteCircuitConnectionArgs> connections) {
            this.connections = Input.ofNullable(connections);
            return this;
        }

        public Builder setGatewayManagerEtag(@Nullable Input<String> gatewayManagerEtag) {
            this.gatewayManagerEtag = gatewayManagerEtag;
            return this;
        }

        public Builder setGatewayManagerEtag(@Nullable String gatewayManagerEtag) {
            this.gatewayManagerEtag = Input.ofNullable(gatewayManagerEtag);
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

        public Builder setIpv6PeeringConfig(@Nullable Input<Ipv6ExpressRouteCircuitPeeringConfigArgs> ipv6PeeringConfig) {
            this.ipv6PeeringConfig = ipv6PeeringConfig;
            return this;
        }

        public Builder setIpv6PeeringConfig(@Nullable Ipv6ExpressRouteCircuitPeeringConfigArgs ipv6PeeringConfig) {
            this.ipv6PeeringConfig = Input.ofNullable(ipv6PeeringConfig);
            return this;
        }

        public Builder setMicrosoftPeeringConfig(@Nullable Input<ExpressRouteCircuitPeeringConfigArgs> microsoftPeeringConfig) {
            this.microsoftPeeringConfig = microsoftPeeringConfig;
            return this;
        }

        public Builder setMicrosoftPeeringConfig(@Nullable ExpressRouteCircuitPeeringConfigArgs microsoftPeeringConfig) {
            this.microsoftPeeringConfig = Input.ofNullable(microsoftPeeringConfig);
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

        public Builder setPeerASN(@Nullable Input<Double> peerASN) {
            this.peerASN = peerASN;
            return this;
        }

        public Builder setPeerASN(@Nullable Double peerASN) {
            this.peerASN = Input.ofNullable(peerASN);
            return this;
        }

        public Builder setPeeringType(@Nullable Input<Either<String,ExpressRoutePeeringType>> peeringType) {
            this.peeringType = peeringType;
            return this;
        }

        public Builder setPeeringType(@Nullable Either<String,ExpressRoutePeeringType> peeringType) {
            this.peeringType = Input.ofNullable(peeringType);
            return this;
        }

        public Builder setPrimaryAzurePort(@Nullable Input<String> primaryAzurePort) {
            this.primaryAzurePort = primaryAzurePort;
            return this;
        }

        public Builder setPrimaryAzurePort(@Nullable String primaryAzurePort) {
            this.primaryAzurePort = Input.ofNullable(primaryAzurePort);
            return this;
        }

        public Builder setPrimaryPeerAddressPrefix(@Nullable Input<String> primaryPeerAddressPrefix) {
            this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
            return this;
        }

        public Builder setPrimaryPeerAddressPrefix(@Nullable String primaryPeerAddressPrefix) {
            this.primaryPeerAddressPrefix = Input.ofNullable(primaryPeerAddressPrefix);
            return this;
        }

        public Builder setRouteFilter(@Nullable Input<SubResourceArgs> routeFilter) {
            this.routeFilter = routeFilter;
            return this;
        }

        public Builder setRouteFilter(@Nullable SubResourceArgs routeFilter) {
            this.routeFilter = Input.ofNullable(routeFilter);
            return this;
        }

        public Builder setSecondaryAzurePort(@Nullable Input<String> secondaryAzurePort) {
            this.secondaryAzurePort = secondaryAzurePort;
            return this;
        }

        public Builder setSecondaryAzurePort(@Nullable String secondaryAzurePort) {
            this.secondaryAzurePort = Input.ofNullable(secondaryAzurePort);
            return this;
        }

        public Builder setSecondaryPeerAddressPrefix(@Nullable Input<String> secondaryPeerAddressPrefix) {
            this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
            return this;
        }

        public Builder setSecondaryPeerAddressPrefix(@Nullable String secondaryPeerAddressPrefix) {
            this.secondaryPeerAddressPrefix = Input.ofNullable(secondaryPeerAddressPrefix);
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

        public Builder setState(@Nullable Input<Either<String,ExpressRoutePeeringState>> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable Either<String,ExpressRoutePeeringState> state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setStats(@Nullable Input<ExpressRouteCircuitStatsArgs> stats) {
            this.stats = stats;
            return this;
        }

        public Builder setStats(@Nullable ExpressRouteCircuitStatsArgs stats) {
            this.stats = Input.ofNullable(stats);
            return this;
        }

        public Builder setVlanId(@Nullable Input<Integer> vlanId) {
            this.vlanId = vlanId;
            return this;
        }

        public Builder setVlanId(@Nullable Integer vlanId) {
            this.vlanId = Input.ofNullable(vlanId);
            return this;
        }
        public ExpressRouteCircuitPeeringArgs build() {
            return new ExpressRouteCircuitPeeringArgs(azureASN, connections, gatewayManagerEtag, id, ipv6PeeringConfig, microsoftPeeringConfig, name, peerASN, peeringType, primaryAzurePort, primaryPeerAddressPrefix, routeFilter, secondaryAzurePort, secondaryPeerAddressPrefix, sharedKey, state, stats, vlanId);
        }
    }
}
