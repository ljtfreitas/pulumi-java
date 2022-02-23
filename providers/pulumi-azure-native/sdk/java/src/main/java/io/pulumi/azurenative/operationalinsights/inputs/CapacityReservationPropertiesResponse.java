// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * The Capacity Reservation properties.
 * 
 */
public final class CapacityReservationPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final CapacityReservationPropertiesResponse Empty = new CapacityReservationPropertiesResponse();

    /**
     * The last time Sku was updated.
     * 
     */
    @InputImport(name="lastSkuUpdate", required=true)
        private final String lastSkuUpdate;

    public String getLastSkuUpdate() {
        return this.lastSkuUpdate;
    }

    /**
     * Minimum CapacityReservation value in GB.
     * 
     */
    @InputImport(name="minCapacity", required=true)
        private final Double minCapacity;

    public Double getMinCapacity() {
        return this.minCapacity;
    }

    public CapacityReservationPropertiesResponse(
        String lastSkuUpdate,
        Double minCapacity) {
        this.lastSkuUpdate = Objects.requireNonNull(lastSkuUpdate, "expected parameter 'lastSkuUpdate' to be non-null");
        this.minCapacity = Objects.requireNonNull(minCapacity, "expected parameter 'minCapacity' to be non-null");
    }

    private CapacityReservationPropertiesResponse() {
        this.lastSkuUpdate = null;
        this.minCapacity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityReservationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastSkuUpdate;
        private Double minCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityReservationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastSkuUpdate = defaults.lastSkuUpdate;
    	      this.minCapacity = defaults.minCapacity;
        }

        public Builder setLastSkuUpdate(String lastSkuUpdate) {
            this.lastSkuUpdate = Objects.requireNonNull(lastSkuUpdate);
            return this;
        }

        public Builder setMinCapacity(Double minCapacity) {
            this.minCapacity = Objects.requireNonNull(minCapacity);
            return this;
        }
        public CapacityReservationPropertiesResponse build() {
            return new CapacityReservationPropertiesResponse(lastSkuUpdate, minCapacity);
        }
    }
}
