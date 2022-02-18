// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.fluidrelay.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class FluidRelayEndpointsResponse {
    /**
     * The Fluid Relay Orderer endpoints.
     * 
     */
    private final List<String> ordererEndpoints;
    /**
     * The Fluid Relay storage endpoints.
     * 
     */
    private final List<String> storageEndpoints;

    @OutputCustomType.Constructor({"ordererEndpoints","storageEndpoints"})
    private FluidRelayEndpointsResponse(
        List<String> ordererEndpoints,
        List<String> storageEndpoints) {
        this.ordererEndpoints = Objects.requireNonNull(ordererEndpoints);
        this.storageEndpoints = Objects.requireNonNull(storageEndpoints);
    }

    /**
     * The Fluid Relay Orderer endpoints.
     * 
     */
    public List<String> getOrdererEndpoints() {
        return this.ordererEndpoints;
    }
    /**
     * The Fluid Relay storage endpoints.
     * 
     */
    public List<String> getStorageEndpoints() {
        return this.storageEndpoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FluidRelayEndpointsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> ordererEndpoints;
        private List<String> storageEndpoints;

        public Builder() {
    	      // Empty
        }

        public Builder(FluidRelayEndpointsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ordererEndpoints = defaults.ordererEndpoints;
    	      this.storageEndpoints = defaults.storageEndpoints;
        }

        public Builder setOrdererEndpoints(List<String> ordererEndpoints) {
            this.ordererEndpoints = Objects.requireNonNull(ordererEndpoints);
            return this;
        }

        public Builder setStorageEndpoints(List<String> storageEndpoints) {
            this.storageEndpoints = Objects.requireNonNull(storageEndpoints);
            return this;
        }

        public FluidRelayEndpointsResponse build() {
            return new FluidRelayEndpointsResponse(ordererEndpoints, storageEndpoints);
        }
    }
}
