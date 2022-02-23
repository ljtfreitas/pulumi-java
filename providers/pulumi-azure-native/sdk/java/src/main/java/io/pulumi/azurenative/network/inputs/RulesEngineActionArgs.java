// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ForwardingConfigurationArgs;
import io.pulumi.azurenative.network.inputs.HeaderActionArgs;
import io.pulumi.azurenative.network.inputs.RedirectConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * One or more actions that will execute, modifying the request and/or response.
 * 
 */
public final class RulesEngineActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RulesEngineActionArgs Empty = new RulesEngineActionArgs();

    /**
     * A list of header actions to apply from the request from AFD to the origin.
     * 
     */
    @InputImport(name="requestHeaderActions")
        private final @Nullable Input<List<HeaderActionArgs>> requestHeaderActions;

    public Input<List<HeaderActionArgs>> getRequestHeaderActions() {
        return this.requestHeaderActions == null ? Input.empty() : this.requestHeaderActions;
    }

    /**
     * A list of header actions to apply from the response from AFD to the client.
     * 
     */
    @InputImport(name="responseHeaderActions")
        private final @Nullable Input<List<HeaderActionArgs>> responseHeaderActions;

    public Input<List<HeaderActionArgs>> getResponseHeaderActions() {
        return this.responseHeaderActions == null ? Input.empty() : this.responseHeaderActions;
    }

    /**
     * Override the route configuration.
     * 
     */
    @InputImport(name="routeConfigurationOverride")
        private final @Nullable Input<Either<ForwardingConfigurationArgs,RedirectConfigurationArgs>> routeConfigurationOverride;

    public Input<Either<ForwardingConfigurationArgs,RedirectConfigurationArgs>> getRouteConfigurationOverride() {
        return this.routeConfigurationOverride == null ? Input.empty() : this.routeConfigurationOverride;
    }

    public RulesEngineActionArgs(
        @Nullable Input<List<HeaderActionArgs>> requestHeaderActions,
        @Nullable Input<List<HeaderActionArgs>> responseHeaderActions,
        @Nullable Input<Either<ForwardingConfigurationArgs,RedirectConfigurationArgs>> routeConfigurationOverride) {
        this.requestHeaderActions = requestHeaderActions;
        this.responseHeaderActions = responseHeaderActions;
        this.routeConfigurationOverride = routeConfigurationOverride;
    }

    private RulesEngineActionArgs() {
        this.requestHeaderActions = Input.empty();
        this.responseHeaderActions = Input.empty();
        this.routeConfigurationOverride = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesEngineActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<HeaderActionArgs>> requestHeaderActions;
        private @Nullable Input<List<HeaderActionArgs>> responseHeaderActions;
        private @Nullable Input<Either<ForwardingConfigurationArgs,RedirectConfigurationArgs>> routeConfigurationOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesEngineActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeaderActions = defaults.requestHeaderActions;
    	      this.responseHeaderActions = defaults.responseHeaderActions;
    	      this.routeConfigurationOverride = defaults.routeConfigurationOverride;
        }

        public Builder setRequestHeaderActions(@Nullable Input<List<HeaderActionArgs>> requestHeaderActions) {
            this.requestHeaderActions = requestHeaderActions;
            return this;
        }

        public Builder setRequestHeaderActions(@Nullable List<HeaderActionArgs> requestHeaderActions) {
            this.requestHeaderActions = Input.ofNullable(requestHeaderActions);
            return this;
        }

        public Builder setResponseHeaderActions(@Nullable Input<List<HeaderActionArgs>> responseHeaderActions) {
            this.responseHeaderActions = responseHeaderActions;
            return this;
        }

        public Builder setResponseHeaderActions(@Nullable List<HeaderActionArgs> responseHeaderActions) {
            this.responseHeaderActions = Input.ofNullable(responseHeaderActions);
            return this;
        }

        public Builder setRouteConfigurationOverride(@Nullable Input<Either<ForwardingConfigurationArgs,RedirectConfigurationArgs>> routeConfigurationOverride) {
            this.routeConfigurationOverride = routeConfigurationOverride;
            return this;
        }

        public Builder setRouteConfigurationOverride(@Nullable Either<ForwardingConfigurationArgs,RedirectConfigurationArgs> routeConfigurationOverride) {
            this.routeConfigurationOverride = Input.ofNullable(routeConfigurationOverride);
            return this;
        }
        public RulesEngineActionArgs build() {
            return new RulesEngineActionArgs(requestHeaderActions, responseHeaderActions, routeConfigurationOverride);
        }
    }
}
