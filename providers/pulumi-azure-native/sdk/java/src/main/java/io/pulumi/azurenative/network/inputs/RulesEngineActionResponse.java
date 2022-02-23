// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ForwardingConfigurationResponse;
import io.pulumi.azurenative.network.inputs.HeaderActionResponse;
import io.pulumi.azurenative.network.inputs.RedirectConfigurationResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * One or more actions that will execute, modifying the request and/or response.
 * 
 */
public final class RulesEngineActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final RulesEngineActionResponse Empty = new RulesEngineActionResponse();

    /**
     * A list of header actions to apply from the request from AFD to the origin.
     * 
     */
    @InputImport(name="requestHeaderActions")
        private final @Nullable List<HeaderActionResponse> requestHeaderActions;

    public List<HeaderActionResponse> getRequestHeaderActions() {
        return this.requestHeaderActions == null ? List.of() : this.requestHeaderActions;
    }

    /**
     * A list of header actions to apply from the response from AFD to the client.
     * 
     */
    @InputImport(name="responseHeaderActions")
        private final @Nullable List<HeaderActionResponse> responseHeaderActions;

    public List<HeaderActionResponse> getResponseHeaderActions() {
        return this.responseHeaderActions == null ? List.of() : this.responseHeaderActions;
    }

    /**
     * Override the route configuration.
     * 
     */
    @InputImport(name="routeConfigurationOverride")
        private final @Nullable Either<ForwardingConfigurationResponse,RedirectConfigurationResponse> routeConfigurationOverride;

    public Either<ForwardingConfigurationResponse,RedirectConfigurationResponse> getRouteConfigurationOverride() {
        return this.routeConfigurationOverride == null ? null : this.routeConfigurationOverride;
    }

    public RulesEngineActionResponse(
        @Nullable List<HeaderActionResponse> requestHeaderActions,
        @Nullable List<HeaderActionResponse> responseHeaderActions,
        @Nullable Either<ForwardingConfigurationResponse,RedirectConfigurationResponse> routeConfigurationOverride) {
        this.requestHeaderActions = requestHeaderActions;
        this.responseHeaderActions = responseHeaderActions;
        this.routeConfigurationOverride = routeConfigurationOverride;
    }

    private RulesEngineActionResponse() {
        this.requestHeaderActions = List.of();
        this.responseHeaderActions = List.of();
        this.routeConfigurationOverride = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesEngineActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<HeaderActionResponse> requestHeaderActions;
        private @Nullable List<HeaderActionResponse> responseHeaderActions;
        private @Nullable Either<ForwardingConfigurationResponse,RedirectConfigurationResponse> routeConfigurationOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesEngineActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeaderActions = defaults.requestHeaderActions;
    	      this.responseHeaderActions = defaults.responseHeaderActions;
    	      this.routeConfigurationOverride = defaults.routeConfigurationOverride;
        }

        public Builder setRequestHeaderActions(@Nullable List<HeaderActionResponse> requestHeaderActions) {
            this.requestHeaderActions = requestHeaderActions;
            return this;
        }

        public Builder setResponseHeaderActions(@Nullable List<HeaderActionResponse> responseHeaderActions) {
            this.responseHeaderActions = responseHeaderActions;
            return this;
        }

        public Builder setRouteConfigurationOverride(@Nullable Either<ForwardingConfigurationResponse,RedirectConfigurationResponse> routeConfigurationOverride) {
            this.routeConfigurationOverride = routeConfigurationOverride;
            return this;
        }
        public RulesEngineActionResponse build() {
            return new RulesEngineActionResponse(requestHeaderActions, responseHeaderActions, routeConfigurationOverride);
        }
    }
}
