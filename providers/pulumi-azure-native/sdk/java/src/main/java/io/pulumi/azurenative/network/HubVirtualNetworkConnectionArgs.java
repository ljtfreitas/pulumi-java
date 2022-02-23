// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.RoutingConfigurationArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HubVirtualNetworkConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final HubVirtualNetworkConnectionArgs Empty = new HubVirtualNetworkConnectionArgs();

    /**
     * Deprecated: VirtualHub to RemoteVnet transit to enabled or not.
     * 
     */
    @InputImport(name="allowHubToRemoteVnetTransit")
        private final @Nullable Input<Boolean> allowHubToRemoteVnetTransit;

    public Input<Boolean> getAllowHubToRemoteVnetTransit() {
        return this.allowHubToRemoteVnetTransit == null ? Input.empty() : this.allowHubToRemoteVnetTransit;
    }

    /**
     * Deprecated: Allow RemoteVnet to use Virtual Hub's gateways.
     * 
     */
    @InputImport(name="allowRemoteVnetToUseHubVnetGateways")
        private final @Nullable Input<Boolean> allowRemoteVnetToUseHubVnetGateways;

    public Input<Boolean> getAllowRemoteVnetToUseHubVnetGateways() {
        return this.allowRemoteVnetToUseHubVnetGateways == null ? Input.empty() : this.allowRemoteVnetToUseHubVnetGateways;
    }

    /**
     * The name of the HubVirtualNetworkConnection.
     * 
     */
    @InputImport(name="connectionName")
        private final @Nullable Input<String> connectionName;

    public Input<String> getConnectionName() {
        return this.connectionName == null ? Input.empty() : this.connectionName;
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
     * Resource ID.
     * 
     */
    @InputImport(name="id")
        private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
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
     * Reference to the remote virtual network.
     * 
     */
    @InputImport(name="remoteVirtualNetwork")
        private final @Nullable Input<SubResourceArgs> remoteVirtualNetwork;

    public Input<SubResourceArgs> getRemoteVirtualNetwork() {
        return this.remoteVirtualNetwork == null ? Input.empty() : this.remoteVirtualNetwork;
    }

    /**
     * The resource group name of the HubVirtualNetworkConnection.
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
     * The name of the VirtualHub.
     * 
     */
    @InputImport(name="virtualHubName", required=true)
        private final Input<String> virtualHubName;

    public Input<String> getVirtualHubName() {
        return this.virtualHubName;
    }

    public HubVirtualNetworkConnectionArgs(
        @Nullable Input<Boolean> allowHubToRemoteVnetTransit,
        @Nullable Input<Boolean> allowRemoteVnetToUseHubVnetGateways,
        @Nullable Input<String> connectionName,
        @Nullable Input<Boolean> enableInternetSecurity,
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<SubResourceArgs> remoteVirtualNetwork,
        Input<String> resourceGroupName,
        @Nullable Input<RoutingConfigurationArgs> routingConfiguration,
        Input<String> virtualHubName) {
        this.allowHubToRemoteVnetTransit = allowHubToRemoteVnetTransit;
        this.allowRemoteVnetToUseHubVnetGateways = allowRemoteVnetToUseHubVnetGateways;
        this.connectionName = connectionName;
        this.enableInternetSecurity = enableInternetSecurity;
        this.id = id;
        this.name = name;
        this.remoteVirtualNetwork = remoteVirtualNetwork;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routingConfiguration = routingConfiguration;
        this.virtualHubName = Objects.requireNonNull(virtualHubName, "expected parameter 'virtualHubName' to be non-null");
    }

    private HubVirtualNetworkConnectionArgs() {
        this.allowHubToRemoteVnetTransit = Input.empty();
        this.allowRemoteVnetToUseHubVnetGateways = Input.empty();
        this.connectionName = Input.empty();
        this.enableInternetSecurity = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.remoteVirtualNetwork = Input.empty();
        this.resourceGroupName = Input.empty();
        this.routingConfiguration = Input.empty();
        this.virtualHubName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HubVirtualNetworkConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowHubToRemoteVnetTransit;
        private @Nullable Input<Boolean> allowRemoteVnetToUseHubVnetGateways;
        private @Nullable Input<String> connectionName;
        private @Nullable Input<Boolean> enableInternetSecurity;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<SubResourceArgs> remoteVirtualNetwork;
        private Input<String> resourceGroupName;
        private @Nullable Input<RoutingConfigurationArgs> routingConfiguration;
        private Input<String> virtualHubName;

        public Builder() {
    	      // Empty
        }

        public Builder(HubVirtualNetworkConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowHubToRemoteVnetTransit = defaults.allowHubToRemoteVnetTransit;
    	      this.allowRemoteVnetToUseHubVnetGateways = defaults.allowRemoteVnetToUseHubVnetGateways;
    	      this.connectionName = defaults.connectionName;
    	      this.enableInternetSecurity = defaults.enableInternetSecurity;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.remoteVirtualNetwork = defaults.remoteVirtualNetwork;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routingConfiguration = defaults.routingConfiguration;
    	      this.virtualHubName = defaults.virtualHubName;
        }

        public Builder setAllowHubToRemoteVnetTransit(@Nullable Input<Boolean> allowHubToRemoteVnetTransit) {
            this.allowHubToRemoteVnetTransit = allowHubToRemoteVnetTransit;
            return this;
        }

        public Builder setAllowHubToRemoteVnetTransit(@Nullable Boolean allowHubToRemoteVnetTransit) {
            this.allowHubToRemoteVnetTransit = Input.ofNullable(allowHubToRemoteVnetTransit);
            return this;
        }

        public Builder setAllowRemoteVnetToUseHubVnetGateways(@Nullable Input<Boolean> allowRemoteVnetToUseHubVnetGateways) {
            this.allowRemoteVnetToUseHubVnetGateways = allowRemoteVnetToUseHubVnetGateways;
            return this;
        }

        public Builder setAllowRemoteVnetToUseHubVnetGateways(@Nullable Boolean allowRemoteVnetToUseHubVnetGateways) {
            this.allowRemoteVnetToUseHubVnetGateways = Input.ofNullable(allowRemoteVnetToUseHubVnetGateways);
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

        public Builder setEnableInternetSecurity(@Nullable Input<Boolean> enableInternetSecurity) {
            this.enableInternetSecurity = enableInternetSecurity;
            return this;
        }

        public Builder setEnableInternetSecurity(@Nullable Boolean enableInternetSecurity) {
            this.enableInternetSecurity = Input.ofNullable(enableInternetSecurity);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRemoteVirtualNetwork(@Nullable Input<SubResourceArgs> remoteVirtualNetwork) {
            this.remoteVirtualNetwork = remoteVirtualNetwork;
            return this;
        }

        public Builder setRemoteVirtualNetwork(@Nullable SubResourceArgs remoteVirtualNetwork) {
            this.remoteVirtualNetwork = Input.ofNullable(remoteVirtualNetwork);
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

        public Builder setVirtualHubName(Input<String> virtualHubName) {
            this.virtualHubName = Objects.requireNonNull(virtualHubName);
            return this;
        }

        public Builder setVirtualHubName(String virtualHubName) {
            this.virtualHubName = Input.of(Objects.requireNonNull(virtualHubName));
            return this;
        }
        public HubVirtualNetworkConnectionArgs build() {
            return new HubVirtualNetworkConnectionArgs(allowHubToRemoteVnetTransit, allowRemoteVnetToUseHubVnetGateways, connectionName, enableInternetSecurity, id, name, remoteVirtualNetwork, resourceGroupName, routingConfiguration, virtualHubName);
        }
    }
}
