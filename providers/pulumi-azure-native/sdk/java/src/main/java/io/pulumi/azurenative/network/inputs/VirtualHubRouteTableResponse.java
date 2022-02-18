// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.VirtualHubRouteResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VirtualHub route table.
 * 
 */
public final class VirtualHubRouteTableResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualHubRouteTableResponse Empty = new VirtualHubRouteTableResponse();

    /**
     * List of all routes.
     * 
     */
    @InputImport(name="routes")
    private final @Nullable List<VirtualHubRouteResponse> routes;

    public List<VirtualHubRouteResponse> getRoutes() {
        return this.routes == null ? List.of() : this.routes;
    }

    public VirtualHubRouteTableResponse(@Nullable List<VirtualHubRouteResponse> routes) {
        this.routes = routes;
    }

    private VirtualHubRouteTableResponse() {
        this.routes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualHubRouteTableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<VirtualHubRouteResponse> routes;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualHubRouteTableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.routes = defaults.routes;
        }

        public Builder setRoutes(@Nullable List<VirtualHubRouteResponse> routes) {
            this.routes = routes;
            return this;
        }

        public VirtualHubRouteTableResponse build() {
            return new VirtualHubRouteTableResponse(routes);
        }
    }
}
