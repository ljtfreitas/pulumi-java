// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ExpressRouteCircuitPeeringState;
import io.pulumi.azurenative.network.inputs.ExpressRouteCircuitPeeringConfigArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains IPv6 peering config.
 * 
 */
public final class Ipv6ExpressRouteCircuitPeeringConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final Ipv6ExpressRouteCircuitPeeringConfigArgs Empty = new Ipv6ExpressRouteCircuitPeeringConfigArgs();

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
     * The secondary address prefix.
     * 
     */
    @InputImport(name="secondaryPeerAddressPrefix")
    private final @Nullable Input<String> secondaryPeerAddressPrefix;

    public Input<String> getSecondaryPeerAddressPrefix() {
        return this.secondaryPeerAddressPrefix == null ? Input.empty() : this.secondaryPeerAddressPrefix;
    }

    /**
     * The state of peering.
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<Either<String,ExpressRouteCircuitPeeringState>> state;

    public Input<Either<String,ExpressRouteCircuitPeeringState>> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public Ipv6ExpressRouteCircuitPeeringConfigArgs(
        @Nullable Input<ExpressRouteCircuitPeeringConfigArgs> microsoftPeeringConfig,
        @Nullable Input<String> primaryPeerAddressPrefix,
        @Nullable Input<SubResourceArgs> routeFilter,
        @Nullable Input<String> secondaryPeerAddressPrefix,
        @Nullable Input<Either<String,ExpressRouteCircuitPeeringState>> state) {
        this.microsoftPeeringConfig = microsoftPeeringConfig;
        this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
        this.routeFilter = routeFilter;
        this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
        this.state = state;
    }

    private Ipv6ExpressRouteCircuitPeeringConfigArgs() {
        this.microsoftPeeringConfig = Input.empty();
        this.primaryPeerAddressPrefix = Input.empty();
        this.routeFilter = Input.empty();
        this.secondaryPeerAddressPrefix = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Ipv6ExpressRouteCircuitPeeringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ExpressRouteCircuitPeeringConfigArgs> microsoftPeeringConfig;
        private @Nullable Input<String> primaryPeerAddressPrefix;
        private @Nullable Input<SubResourceArgs> routeFilter;
        private @Nullable Input<String> secondaryPeerAddressPrefix;
        private @Nullable Input<Either<String,ExpressRouteCircuitPeeringState>> state;

        public Builder() {
    	      // Empty
        }

        public Builder(Ipv6ExpressRouteCircuitPeeringConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.microsoftPeeringConfig = defaults.microsoftPeeringConfig;
    	      this.primaryPeerAddressPrefix = defaults.primaryPeerAddressPrefix;
    	      this.routeFilter = defaults.routeFilter;
    	      this.secondaryPeerAddressPrefix = defaults.secondaryPeerAddressPrefix;
    	      this.state = defaults.state;
        }

        public Builder setMicrosoftPeeringConfig(@Nullable Input<ExpressRouteCircuitPeeringConfigArgs> microsoftPeeringConfig) {
            this.microsoftPeeringConfig = microsoftPeeringConfig;
            return this;
        }

        public Builder setMicrosoftPeeringConfig(@Nullable ExpressRouteCircuitPeeringConfigArgs microsoftPeeringConfig) {
            this.microsoftPeeringConfig = Input.ofNullable(microsoftPeeringConfig);
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

        public Builder setSecondaryPeerAddressPrefix(@Nullable Input<String> secondaryPeerAddressPrefix) {
            this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
            return this;
        }

        public Builder setSecondaryPeerAddressPrefix(@Nullable String secondaryPeerAddressPrefix) {
            this.secondaryPeerAddressPrefix = Input.ofNullable(secondaryPeerAddressPrefix);
            return this;
        }

        public Builder setState(@Nullable Input<Either<String,ExpressRouteCircuitPeeringState>> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable Either<String,ExpressRouteCircuitPeeringState> state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Ipv6ExpressRouteCircuitPeeringConfigArgs build() {
            return new Ipv6ExpressRouteCircuitPeeringConfigArgs(microsoftPeeringConfig, primaryPeerAddressPrefix, routeFilter, secondaryPeerAddressPrefix, state);
        }
    }
}
