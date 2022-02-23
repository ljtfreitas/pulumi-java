// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.StaticRouteResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * List of routes that control routing from VirtualHub into a virtual network connection.
 * 
 */
public final class VnetRouteResponse extends io.pulumi.resources.InvokeArgs {

    public static final VnetRouteResponse Empty = new VnetRouteResponse();

    /**
     * List of all Static Routes.
     * 
     */
    @InputImport(name="staticRoutes")
        private final @Nullable List<StaticRouteResponse> staticRoutes;

    public List<StaticRouteResponse> getStaticRoutes() {
        return this.staticRoutes == null ? List.of() : this.staticRoutes;
    }

    public VnetRouteResponse(@Nullable List<StaticRouteResponse> staticRoutes) {
        this.staticRoutes = staticRoutes;
    }

    private VnetRouteResponse() {
        this.staticRoutes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VnetRouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<StaticRouteResponse> staticRoutes;

        public Builder() {
    	      // Empty
        }

        public Builder(VnetRouteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.staticRoutes = defaults.staticRoutes;
        }

        public Builder setStaticRoutes(@Nullable List<StaticRouteResponse> staticRoutes) {
            this.staticRoutes = staticRoutes;
            return this;
        }
        public VnetRouteResponse build() {
            return new VnetRouteResponse(staticRoutes);
        }
    }
}
