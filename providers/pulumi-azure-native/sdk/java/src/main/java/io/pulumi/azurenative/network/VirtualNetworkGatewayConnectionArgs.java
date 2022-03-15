// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.VirtualNetworkGatewayConnectionMode;
import io.pulumi.azurenative.network.enums.VirtualNetworkGatewayConnectionProtocol;
import io.pulumi.azurenative.network.enums.VirtualNetworkGatewayConnectionType;
import io.pulumi.azurenative.network.inputs.IpsecPolicyArgs;
import io.pulumi.azurenative.network.inputs.LocalNetworkGatewayArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.azurenative.network.inputs.TrafficSelectorPolicyArgs;
import io.pulumi.azurenative.network.inputs.VirtualNetworkGatewayArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNetworkGatewayConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkGatewayConnectionArgs Empty = new VirtualNetworkGatewayConnectionArgs();

    /**
     * The authorizationKey.
     * 
     */
    @Import(name="authorizationKey")
      private final @Nullable Output<String> authorizationKey;

    public Output<String> getAuthorizationKey() {
        return this.authorizationKey == null ? Output.empty() : this.authorizationKey;
    }

    /**
     * The connection mode for this connection.
     * 
     */
    @Import(name="connectionMode")
      private final @Nullable Output<Either<String,VirtualNetworkGatewayConnectionMode>> connectionMode;

    public Output<Either<String,VirtualNetworkGatewayConnectionMode>> getConnectionMode() {
        return this.connectionMode == null ? Output.empty() : this.connectionMode;
    }

    /**
     * Connection protocol used for this connection.
     * 
     */
    @Import(name="connectionProtocol")
      private final @Nullable Output<Either<String,VirtualNetworkGatewayConnectionProtocol>> connectionProtocol;

    public Output<Either<String,VirtualNetworkGatewayConnectionProtocol>> getConnectionProtocol() {
        return this.connectionProtocol == null ? Output.empty() : this.connectionProtocol;
    }

    /**
     * Gateway connection type.
     * 
     */
    @Import(name="connectionType", required=true)
      private final Output<Either<String,VirtualNetworkGatewayConnectionType>> connectionType;

    public Output<Either<String,VirtualNetworkGatewayConnectionType>> getConnectionType() {
        return this.connectionType;
    }

    /**
     * The dead peer detection timeout of this connection in seconds.
     * 
     */
    @Import(name="dpdTimeoutSeconds")
      private final @Nullable Output<Integer> dpdTimeoutSeconds;

    public Output<Integer> getDpdTimeoutSeconds() {
        return this.dpdTimeoutSeconds == null ? Output.empty() : this.dpdTimeoutSeconds;
    }

    /**
     * EnableBgp flag.
     * 
     */
    @Import(name="enableBgp")
      private final @Nullable Output<Boolean> enableBgp;

    public Output<Boolean> getEnableBgp() {
        return this.enableBgp == null ? Output.empty() : this.enableBgp;
    }

    /**
     * Bypass ExpressRoute Gateway for data forwarding.
     * 
     */
    @Import(name="expressRouteGatewayBypass")
      private final @Nullable Output<Boolean> expressRouteGatewayBypass;

    public Output<Boolean> getExpressRouteGatewayBypass() {
        return this.expressRouteGatewayBypass == null ? Output.empty() : this.expressRouteGatewayBypass;
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
     * The IPSec Policies to be considered by this connection.
     * 
     */
    @Import(name="ipsecPolicies")
      private final @Nullable Output<List<IpsecPolicyArgs>> ipsecPolicies;

    public Output<List<IpsecPolicyArgs>> getIpsecPolicies() {
        return this.ipsecPolicies == null ? Output.empty() : this.ipsecPolicies;
    }

    /**
     * The reference to local network gateway resource.
     * 
     */
    @Import(name="localNetworkGateway2")
      private final @Nullable Output<LocalNetworkGatewayArgs> localNetworkGateway2;

    public Output<LocalNetworkGatewayArgs> getLocalNetworkGateway2() {
        return this.localNetworkGateway2 == null ? Output.empty() : this.localNetworkGateway2;
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
     * The reference to peerings resource.
     * 
     */
    @Import(name="peer")
      private final @Nullable Output<SubResourceArgs> peer;

    public Output<SubResourceArgs> getPeer() {
        return this.peer == null ? Output.empty() : this.peer;
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
     * The routing weight.
     * 
     */
    @Import(name="routingWeight")
      private final @Nullable Output<Integer> routingWeight;

    public Output<Integer> getRoutingWeight() {
        return this.routingWeight == null ? Output.empty() : this.routingWeight;
    }

    /**
     * The IPSec shared key.
     * 
     */
    @Import(name="sharedKey")
      private final @Nullable Output<String> sharedKey;

    public Output<String> getSharedKey() {
        return this.sharedKey == null ? Output.empty() : this.sharedKey;
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
     * The Traffic Selector Policies to be considered by this connection.
     * 
     */
    @Import(name="trafficSelectorPolicies")
      private final @Nullable Output<List<TrafficSelectorPolicyArgs>> trafficSelectorPolicies;

    public Output<List<TrafficSelectorPolicyArgs>> getTrafficSelectorPolicies() {
        return this.trafficSelectorPolicies == null ? Output.empty() : this.trafficSelectorPolicies;
    }

    /**
     * Use private local Azure IP for the connection.
     * 
     */
    @Import(name="useLocalAzureIpAddress")
      private final @Nullable Output<Boolean> useLocalAzureIpAddress;

    public Output<Boolean> getUseLocalAzureIpAddress() {
        return this.useLocalAzureIpAddress == null ? Output.empty() : this.useLocalAzureIpAddress;
    }

    /**
     * Enable policy-based traffic selectors.
     * 
     */
    @Import(name="usePolicyBasedTrafficSelectors")
      private final @Nullable Output<Boolean> usePolicyBasedTrafficSelectors;

    public Output<Boolean> getUsePolicyBasedTrafficSelectors() {
        return this.usePolicyBasedTrafficSelectors == null ? Output.empty() : this.usePolicyBasedTrafficSelectors;
    }

    /**
     * The reference to virtual network gateway resource.
     * 
     */
    @Import(name="virtualNetworkGateway1", required=true)
      private final Output<VirtualNetworkGatewayArgs> virtualNetworkGateway1;

    public Output<VirtualNetworkGatewayArgs> getVirtualNetworkGateway1() {
        return this.virtualNetworkGateway1;
    }

    /**
     * The reference to virtual network gateway resource.
     * 
     */
    @Import(name="virtualNetworkGateway2")
      private final @Nullable Output<VirtualNetworkGatewayArgs> virtualNetworkGateway2;

    public Output<VirtualNetworkGatewayArgs> getVirtualNetworkGateway2() {
        return this.virtualNetworkGateway2 == null ? Output.empty() : this.virtualNetworkGateway2;
    }

    /**
     * The name of the virtual network gateway connection.
     * 
     */
    @Import(name="virtualNetworkGatewayConnectionName")
      private final @Nullable Output<String> virtualNetworkGatewayConnectionName;

    public Output<String> getVirtualNetworkGatewayConnectionName() {
        return this.virtualNetworkGatewayConnectionName == null ? Output.empty() : this.virtualNetworkGatewayConnectionName;
    }

    public VirtualNetworkGatewayConnectionArgs(
        @Nullable Output<String> authorizationKey,
        @Nullable Output<Either<String,VirtualNetworkGatewayConnectionMode>> connectionMode,
        @Nullable Output<Either<String,VirtualNetworkGatewayConnectionProtocol>> connectionProtocol,
        Output<Either<String,VirtualNetworkGatewayConnectionType>> connectionType,
        @Nullable Output<Integer> dpdTimeoutSeconds,
        @Nullable Output<Boolean> enableBgp,
        @Nullable Output<Boolean> expressRouteGatewayBypass,
        @Nullable Output<String> id,
        @Nullable Output<List<IpsecPolicyArgs>> ipsecPolicies,
        @Nullable Output<LocalNetworkGatewayArgs> localNetworkGateway2,
        @Nullable Output<String> location,
        @Nullable Output<SubResourceArgs> peer,
        Output<String> resourceGroupName,
        @Nullable Output<Integer> routingWeight,
        @Nullable Output<String> sharedKey,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<TrafficSelectorPolicyArgs>> trafficSelectorPolicies,
        @Nullable Output<Boolean> useLocalAzureIpAddress,
        @Nullable Output<Boolean> usePolicyBasedTrafficSelectors,
        Output<VirtualNetworkGatewayArgs> virtualNetworkGateway1,
        @Nullable Output<VirtualNetworkGatewayArgs> virtualNetworkGateway2,
        @Nullable Output<String> virtualNetworkGatewayConnectionName) {
        this.authorizationKey = authorizationKey;
        this.connectionMode = connectionMode;
        this.connectionProtocol = connectionProtocol;
        this.connectionType = Objects.requireNonNull(connectionType, "expected parameter 'connectionType' to be non-null");
        this.dpdTimeoutSeconds = dpdTimeoutSeconds;
        this.enableBgp = enableBgp;
        this.expressRouteGatewayBypass = expressRouteGatewayBypass;
        this.id = id;
        this.ipsecPolicies = ipsecPolicies;
        this.localNetworkGateway2 = localNetworkGateway2;
        this.location = location;
        this.peer = peer;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routingWeight = routingWeight;
        this.sharedKey = sharedKey;
        this.tags = tags;
        this.trafficSelectorPolicies = trafficSelectorPolicies;
        this.useLocalAzureIpAddress = useLocalAzureIpAddress;
        this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
        this.virtualNetworkGateway1 = Objects.requireNonNull(virtualNetworkGateway1, "expected parameter 'virtualNetworkGateway1' to be non-null");
        this.virtualNetworkGateway2 = virtualNetworkGateway2;
        this.virtualNetworkGatewayConnectionName = virtualNetworkGatewayConnectionName;
    }

    private VirtualNetworkGatewayConnectionArgs() {
        this.authorizationKey = Output.empty();
        this.connectionMode = Output.empty();
        this.connectionProtocol = Output.empty();
        this.connectionType = Output.empty();
        this.dpdTimeoutSeconds = Output.empty();
        this.enableBgp = Output.empty();
        this.expressRouteGatewayBypass = Output.empty();
        this.id = Output.empty();
        this.ipsecPolicies = Output.empty();
        this.localNetworkGateway2 = Output.empty();
        this.location = Output.empty();
        this.peer = Output.empty();
        this.resourceGroupName = Output.empty();
        this.routingWeight = Output.empty();
        this.sharedKey = Output.empty();
        this.tags = Output.empty();
        this.trafficSelectorPolicies = Output.empty();
        this.useLocalAzureIpAddress = Output.empty();
        this.usePolicyBasedTrafficSelectors = Output.empty();
        this.virtualNetworkGateway1 = Output.empty();
        this.virtualNetworkGateway2 = Output.empty();
        this.virtualNetworkGatewayConnectionName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkGatewayConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authorizationKey;
        private @Nullable Output<Either<String,VirtualNetworkGatewayConnectionMode>> connectionMode;
        private @Nullable Output<Either<String,VirtualNetworkGatewayConnectionProtocol>> connectionProtocol;
        private Output<Either<String,VirtualNetworkGatewayConnectionType>> connectionType;
        private @Nullable Output<Integer> dpdTimeoutSeconds;
        private @Nullable Output<Boolean> enableBgp;
        private @Nullable Output<Boolean> expressRouteGatewayBypass;
        private @Nullable Output<String> id;
        private @Nullable Output<List<IpsecPolicyArgs>> ipsecPolicies;
        private @Nullable Output<LocalNetworkGatewayArgs> localNetworkGateway2;
        private @Nullable Output<String> location;
        private @Nullable Output<SubResourceArgs> peer;
        private Output<String> resourceGroupName;
        private @Nullable Output<Integer> routingWeight;
        private @Nullable Output<String> sharedKey;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<TrafficSelectorPolicyArgs>> trafficSelectorPolicies;
        private @Nullable Output<Boolean> useLocalAzureIpAddress;
        private @Nullable Output<Boolean> usePolicyBasedTrafficSelectors;
        private Output<VirtualNetworkGatewayArgs> virtualNetworkGateway1;
        private @Nullable Output<VirtualNetworkGatewayArgs> virtualNetworkGateway2;
        private @Nullable Output<String> virtualNetworkGatewayConnectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkGatewayConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationKey = defaults.authorizationKey;
    	      this.connectionMode = defaults.connectionMode;
    	      this.connectionProtocol = defaults.connectionProtocol;
    	      this.connectionType = defaults.connectionType;
    	      this.dpdTimeoutSeconds = defaults.dpdTimeoutSeconds;
    	      this.enableBgp = defaults.enableBgp;
    	      this.expressRouteGatewayBypass = defaults.expressRouteGatewayBypass;
    	      this.id = defaults.id;
    	      this.ipsecPolicies = defaults.ipsecPolicies;
    	      this.localNetworkGateway2 = defaults.localNetworkGateway2;
    	      this.location = defaults.location;
    	      this.peer = defaults.peer;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routingWeight = defaults.routingWeight;
    	      this.sharedKey = defaults.sharedKey;
    	      this.tags = defaults.tags;
    	      this.trafficSelectorPolicies = defaults.trafficSelectorPolicies;
    	      this.useLocalAzureIpAddress = defaults.useLocalAzureIpAddress;
    	      this.usePolicyBasedTrafficSelectors = defaults.usePolicyBasedTrafficSelectors;
    	      this.virtualNetworkGateway1 = defaults.virtualNetworkGateway1;
    	      this.virtualNetworkGateway2 = defaults.virtualNetworkGateway2;
    	      this.virtualNetworkGatewayConnectionName = defaults.virtualNetworkGatewayConnectionName;
        }

        public Builder authorizationKey(@Nullable Output<String> authorizationKey) {
            this.authorizationKey = authorizationKey;
            return this;
        }

        public Builder authorizationKey(@Nullable String authorizationKey) {
            this.authorizationKey = Output.ofNullable(authorizationKey);
            return this;
        }

        public Builder connectionMode(@Nullable Output<Either<String,VirtualNetworkGatewayConnectionMode>> connectionMode) {
            this.connectionMode = connectionMode;
            return this;
        }

        public Builder connectionMode(@Nullable Either<String,VirtualNetworkGatewayConnectionMode> connectionMode) {
            this.connectionMode = Output.ofNullable(connectionMode);
            return this;
        }

        public Builder connectionProtocol(@Nullable Output<Either<String,VirtualNetworkGatewayConnectionProtocol>> connectionProtocol) {
            this.connectionProtocol = connectionProtocol;
            return this;
        }

        public Builder connectionProtocol(@Nullable Either<String,VirtualNetworkGatewayConnectionProtocol> connectionProtocol) {
            this.connectionProtocol = Output.ofNullable(connectionProtocol);
            return this;
        }

        public Builder connectionType(Output<Either<String,VirtualNetworkGatewayConnectionType>> connectionType) {
            this.connectionType = Objects.requireNonNull(connectionType);
            return this;
        }

        public Builder connectionType(Either<String,VirtualNetworkGatewayConnectionType> connectionType) {
            this.connectionType = Output.of(Objects.requireNonNull(connectionType));
            return this;
        }

        public Builder dpdTimeoutSeconds(@Nullable Output<Integer> dpdTimeoutSeconds) {
            this.dpdTimeoutSeconds = dpdTimeoutSeconds;
            return this;
        }

        public Builder dpdTimeoutSeconds(@Nullable Integer dpdTimeoutSeconds) {
            this.dpdTimeoutSeconds = Output.ofNullable(dpdTimeoutSeconds);
            return this;
        }

        public Builder enableBgp(@Nullable Output<Boolean> enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }

        public Builder enableBgp(@Nullable Boolean enableBgp) {
            this.enableBgp = Output.ofNullable(enableBgp);
            return this;
        }

        public Builder expressRouteGatewayBypass(@Nullable Output<Boolean> expressRouteGatewayBypass) {
            this.expressRouteGatewayBypass = expressRouteGatewayBypass;
            return this;
        }

        public Builder expressRouteGatewayBypass(@Nullable Boolean expressRouteGatewayBypass) {
            this.expressRouteGatewayBypass = Output.ofNullable(expressRouteGatewayBypass);
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

        public Builder ipsecPolicies(@Nullable Output<List<IpsecPolicyArgs>> ipsecPolicies) {
            this.ipsecPolicies = ipsecPolicies;
            return this;
        }

        public Builder ipsecPolicies(@Nullable List<IpsecPolicyArgs> ipsecPolicies) {
            this.ipsecPolicies = Output.ofNullable(ipsecPolicies);
            return this;
        }

        public Builder localNetworkGateway2(@Nullable Output<LocalNetworkGatewayArgs> localNetworkGateway2) {
            this.localNetworkGateway2 = localNetworkGateway2;
            return this;
        }

        public Builder localNetworkGateway2(@Nullable LocalNetworkGatewayArgs localNetworkGateway2) {
            this.localNetworkGateway2 = Output.ofNullable(localNetworkGateway2);
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

        public Builder peer(@Nullable Output<SubResourceArgs> peer) {
            this.peer = peer;
            return this;
        }

        public Builder peer(@Nullable SubResourceArgs peer) {
            this.peer = Output.ofNullable(peer);
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

        public Builder routingWeight(@Nullable Output<Integer> routingWeight) {
            this.routingWeight = routingWeight;
            return this;
        }

        public Builder routingWeight(@Nullable Integer routingWeight) {
            this.routingWeight = Output.ofNullable(routingWeight);
            return this;
        }

        public Builder sharedKey(@Nullable Output<String> sharedKey) {
            this.sharedKey = sharedKey;
            return this;
        }

        public Builder sharedKey(@Nullable String sharedKey) {
            this.sharedKey = Output.ofNullable(sharedKey);
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

        public Builder trafficSelectorPolicies(@Nullable Output<List<TrafficSelectorPolicyArgs>> trafficSelectorPolicies) {
            this.trafficSelectorPolicies = trafficSelectorPolicies;
            return this;
        }

        public Builder trafficSelectorPolicies(@Nullable List<TrafficSelectorPolicyArgs> trafficSelectorPolicies) {
            this.trafficSelectorPolicies = Output.ofNullable(trafficSelectorPolicies);
            return this;
        }

        public Builder useLocalAzureIpAddress(@Nullable Output<Boolean> useLocalAzureIpAddress) {
            this.useLocalAzureIpAddress = useLocalAzureIpAddress;
            return this;
        }

        public Builder useLocalAzureIpAddress(@Nullable Boolean useLocalAzureIpAddress) {
            this.useLocalAzureIpAddress = Output.ofNullable(useLocalAzureIpAddress);
            return this;
        }

        public Builder usePolicyBasedTrafficSelectors(@Nullable Output<Boolean> usePolicyBasedTrafficSelectors) {
            this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
            return this;
        }

        public Builder usePolicyBasedTrafficSelectors(@Nullable Boolean usePolicyBasedTrafficSelectors) {
            this.usePolicyBasedTrafficSelectors = Output.ofNullable(usePolicyBasedTrafficSelectors);
            return this;
        }

        public Builder virtualNetworkGateway1(Output<VirtualNetworkGatewayArgs> virtualNetworkGateway1) {
            this.virtualNetworkGateway1 = Objects.requireNonNull(virtualNetworkGateway1);
            return this;
        }

        public Builder virtualNetworkGateway1(VirtualNetworkGatewayArgs virtualNetworkGateway1) {
            this.virtualNetworkGateway1 = Output.of(Objects.requireNonNull(virtualNetworkGateway1));
            return this;
        }

        public Builder virtualNetworkGateway2(@Nullable Output<VirtualNetworkGatewayArgs> virtualNetworkGateway2) {
            this.virtualNetworkGateway2 = virtualNetworkGateway2;
            return this;
        }

        public Builder virtualNetworkGateway2(@Nullable VirtualNetworkGatewayArgs virtualNetworkGateway2) {
            this.virtualNetworkGateway2 = Output.ofNullable(virtualNetworkGateway2);
            return this;
        }

        public Builder virtualNetworkGatewayConnectionName(@Nullable Output<String> virtualNetworkGatewayConnectionName) {
            this.virtualNetworkGatewayConnectionName = virtualNetworkGatewayConnectionName;
            return this;
        }

        public Builder virtualNetworkGatewayConnectionName(@Nullable String virtualNetworkGatewayConnectionName) {
            this.virtualNetworkGatewayConnectionName = Output.ofNullable(virtualNetworkGatewayConnectionName);
            return this;
        }
        public VirtualNetworkGatewayConnectionArgs build() {
            return new VirtualNetworkGatewayConnectionArgs(authorizationKey, connectionMode, connectionProtocol, connectionType, dpdTimeoutSeconds, enableBgp, expressRouteGatewayBypass, id, ipsecPolicies, localNetworkGateway2, location, peer, resourceGroupName, routingWeight, sharedKey, tags, trafficSelectorPolicies, useLocalAzureIpAddress, usePolicyBasedTrafficSelectors, virtualNetworkGateway1, virtualNetworkGateway2, virtualNetworkGatewayConnectionName);
        }
    }
}
