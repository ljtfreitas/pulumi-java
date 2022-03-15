// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.azurenative.appplatform.outputs.GatewayApiRouteResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayRouteConfigPropertiesResponse {
    /**
     * The resource Id of the Azure Spring Cloud app, required unless route defines `uri`.
     * 
     */
    private final @Nullable String appResourceId;
    /**
     * State of the Spring Cloud Gateway route config.
     * 
     */
    private final String provisioningState;
    /**
     * Array of API routes, each route contains properties such as `title`, `uri`, `ssoEnabled`, `predicates`, `filters`.
     * 
     */
    private final @Nullable List<GatewayApiRouteResponse> routes;

    @CustomType.Constructor
    private GatewayRouteConfigPropertiesResponse(
        @CustomType.Parameter("appResourceId") @Nullable String appResourceId,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("routes") @Nullable List<GatewayApiRouteResponse> routes) {
        this.appResourceId = appResourceId;
        this.provisioningState = provisioningState;
        this.routes = routes;
    }

    /**
     * The resource Id of the Azure Spring Cloud app, required unless route defines `uri`.
     * 
    */
    public Optional<String> getAppResourceId() {
        return Optional.ofNullable(this.appResourceId);
    }
    /**
     * State of the Spring Cloud Gateway route config.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Array of API routes, each route contains properties such as `title`, `uri`, `ssoEnabled`, `predicates`, `filters`.
     * 
    */
    public List<GatewayApiRouteResponse> getRoutes() {
        return this.routes == null ? List.of() : this.routes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteConfigPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appResourceId;
        private String provisioningState;
        private @Nullable List<GatewayApiRouteResponse> routes;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteConfigPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appResourceId = defaults.appResourceId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.routes = defaults.routes;
        }

        public Builder appResourceId(@Nullable String appResourceId) {
            this.appResourceId = appResourceId;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder routes(@Nullable List<GatewayApiRouteResponse> routes) {
            this.routes = routes;
            return this;
        }
        public GatewayRouteConfigPropertiesResponse build() {
            return new GatewayRouteConfigPropertiesResponse(appResourceId, provisioningState, routes);
        }
    }
}
