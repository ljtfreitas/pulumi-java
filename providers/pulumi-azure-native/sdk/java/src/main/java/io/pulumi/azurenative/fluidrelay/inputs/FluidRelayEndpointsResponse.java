// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.fluidrelay.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The Fluid Relay endpoints for this server
 * 
 */
public final class FluidRelayEndpointsResponse extends io.pulumi.resources.InvokeArgs {

    public static final FluidRelayEndpointsResponse Empty = new FluidRelayEndpointsResponse();

    /**
     * The Fluid Relay Orderer endpoints.
     * 
     */
    @InputImport(name="ordererEndpoints", required=true)
        private final List<String> ordererEndpoints;

    public List<String> getOrdererEndpoints() {
        return this.ordererEndpoints;
    }

    /**
     * The Fluid Relay storage endpoints.
     * 
     */
    @InputImport(name="storageEndpoints", required=true)
        private final List<String> storageEndpoints;

    public List<String> getStorageEndpoints() {
        return this.storageEndpoints;
    }

    public FluidRelayEndpointsResponse(
        List<String> ordererEndpoints,
        List<String> storageEndpoints) {
        this.ordererEndpoints = Objects.requireNonNull(ordererEndpoints, "expected parameter 'ordererEndpoints' to be non-null");
        this.storageEndpoints = Objects.requireNonNull(storageEndpoints, "expected parameter 'storageEndpoints' to be non-null");
    }

    private FluidRelayEndpointsResponse() {
        this.ordererEndpoints = List.of();
        this.storageEndpoints = List.of();
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
