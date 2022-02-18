// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.ExpressRouteCircuitPeeringIdArgs;
import io.pulumi.azurenative.network.inputs.RoutingConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExpressRouteConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExpressRouteConnectionArgs Empty = new ExpressRouteConnectionArgs();

    /**
     * Authorization key to establish the connection.
     * 
     */
    @InputImport(name="authorizationKey")
    private final @Nullable Input<String> authorizationKey;

    public Input<String> getAuthorizationKey() {
        return this.authorizationKey == null ? Input.empty() : this.authorizationKey;
    }

    /**
     * The name of the connection subresource.
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
     * The ExpressRoute circuit peering.
     * 
     */
    @InputImport(name="expressRouteCircuitPeering", required=true)
    private final Input<ExpressRouteCircuitPeeringIdArgs> expressRouteCircuitPeering;

    public Input<ExpressRouteCircuitPeeringIdArgs> getExpressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering;
    }

    /**
     * Enable FastPath to vWan Firewall hub.
     * 
     */
    @InputImport(name="expressRouteGatewayBypass")
    private final @Nullable Input<Boolean> expressRouteGatewayBypass;

    public Input<Boolean> getExpressRouteGatewayBypass() {
        return this.expressRouteGatewayBypass == null ? Input.empty() : this.expressRouteGatewayBypass;
    }

    /**
     * The name of the ExpressRoute gateway.
     * 
     */
    @InputImport(name="expressRouteGatewayName", required=true)
    private final Input<String> expressRouteGatewayName;

    public Input<String> getExpressRouteGatewayName() {
        return this.expressRouteGatewayName;
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
     * The name of the resource.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
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
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    @InputImport(name="routingConfiguration")
    private final @Nullable Input<RoutingConfigurationArgs> routingConfiguration;

    public Input<RoutingConfigurationArgs> getRoutingConfiguration() {
        return this.routingConfiguration == null ? Input.empty() : this.routingConfiguration;
    }

    /**
     * The routing weight associated to the connection.
     * 
     */
    @InputImport(name="routingWeight")
    private final @Nullable Input<Integer> routingWeight;

    public Input<Integer> getRoutingWeight() {
        return this.routingWeight == null ? Input.empty() : this.routingWeight;
    }

    public ExpressRouteConnectionArgs(
        @Nullable Input<String> authorizationKey,
        @Nullable Input<String> connectionName,
        @Nullable Input<Boolean> enableInternetSecurity,
        Input<ExpressRouteCircuitPeeringIdArgs> expressRouteCircuitPeering,
        @Nullable Input<Boolean> expressRouteGatewayBypass,
        Input<String> expressRouteGatewayName,
        @Nullable Input<String> id,
        Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<RoutingConfigurationArgs> routingConfiguration,
        @Nullable Input<Integer> routingWeight) {
        this.authorizationKey = authorizationKey;
        this.connectionName = connectionName;
        this.enableInternetSecurity = enableInternetSecurity;
        this.expressRouteCircuitPeering = Objects.requireNonNull(expressRouteCircuitPeering, "expected parameter 'expressRouteCircuitPeering' to be non-null");
        this.expressRouteGatewayBypass = expressRouteGatewayBypass;
        this.expressRouteGatewayName = Objects.requireNonNull(expressRouteGatewayName, "expected parameter 'expressRouteGatewayName' to be non-null");
        this.id = id;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routingConfiguration = routingConfiguration;
        this.routingWeight = routingWeight;
    }

    private ExpressRouteConnectionArgs() {
        this.authorizationKey = Input.empty();
        this.connectionName = Input.empty();
        this.enableInternetSecurity = Input.empty();
        this.expressRouteCircuitPeering = Input.empty();
        this.expressRouteGatewayBypass = Input.empty();
        this.expressRouteGatewayName = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.routingConfiguration = Input.empty();
        this.routingWeight = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authorizationKey;
        private @Nullable Input<String> connectionName;
        private @Nullable Input<Boolean> enableInternetSecurity;
        private Input<ExpressRouteCircuitPeeringIdArgs> expressRouteCircuitPeering;
        private @Nullable Input<Boolean> expressRouteGatewayBypass;
        private Input<String> expressRouteGatewayName;
        private @Nullable Input<String> id;
        private Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<RoutingConfigurationArgs> routingConfiguration;
        private @Nullable Input<Integer> routingWeight;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationKey = defaults.authorizationKey;
    	      this.connectionName = defaults.connectionName;
    	      this.enableInternetSecurity = defaults.enableInternetSecurity;
    	      this.expressRouteCircuitPeering = defaults.expressRouteCircuitPeering;
    	      this.expressRouteGatewayBypass = defaults.expressRouteGatewayBypass;
    	      this.expressRouteGatewayName = defaults.expressRouteGatewayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routingConfiguration = defaults.routingConfiguration;
    	      this.routingWeight = defaults.routingWeight;
        }

        public Builder setAuthorizationKey(@Nullable Input<String> authorizationKey) {
            this.authorizationKey = authorizationKey;
            return this;
        }

        public Builder setAuthorizationKey(@Nullable String authorizationKey) {
            this.authorizationKey = Input.ofNullable(authorizationKey);
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

        public Builder setExpressRouteCircuitPeering(Input<ExpressRouteCircuitPeeringIdArgs> expressRouteCircuitPeering) {
            this.expressRouteCircuitPeering = Objects.requireNonNull(expressRouteCircuitPeering);
            return this;
        }

        public Builder setExpressRouteCircuitPeering(ExpressRouteCircuitPeeringIdArgs expressRouteCircuitPeering) {
            this.expressRouteCircuitPeering = Input.of(Objects.requireNonNull(expressRouteCircuitPeering));
            return this;
        }

        public Builder setExpressRouteGatewayBypass(@Nullable Input<Boolean> expressRouteGatewayBypass) {
            this.expressRouteGatewayBypass = expressRouteGatewayBypass;
            return this;
        }

        public Builder setExpressRouteGatewayBypass(@Nullable Boolean expressRouteGatewayBypass) {
            this.expressRouteGatewayBypass = Input.ofNullable(expressRouteGatewayBypass);
            return this;
        }

        public Builder setExpressRouteGatewayName(Input<String> expressRouteGatewayName) {
            this.expressRouteGatewayName = Objects.requireNonNull(expressRouteGatewayName);
            return this;
        }

        public Builder setExpressRouteGatewayName(String expressRouteGatewayName) {
            this.expressRouteGatewayName = Input.of(Objects.requireNonNull(expressRouteGatewayName));
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

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
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

        public ExpressRouteConnectionArgs build() {
            return new ExpressRouteConnectionArgs(authorizationKey, connectionName, enableInternetSecurity, expressRouteCircuitPeering, expressRouteGatewayBypass, expressRouteGatewayName, id, name, resourceGroupName, routingConfiguration, routingWeight);
        }
    }
}
