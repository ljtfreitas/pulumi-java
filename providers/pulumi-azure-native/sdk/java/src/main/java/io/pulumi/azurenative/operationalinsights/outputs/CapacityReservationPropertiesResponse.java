// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CapacityReservationPropertiesResponse {
    /**
     * The last time Sku was updated.
     * 
     */
    private final String lastSkuUpdate;
    /**
     * Minimum CapacityReservation value in GB.
     * 
     */
    private final Double minCapacity;

    @OutputCustomType.Constructor({"lastSkuUpdate","minCapacity"})
    private CapacityReservationPropertiesResponse(
        String lastSkuUpdate,
        Double minCapacity) {
        this.lastSkuUpdate = Objects.requireNonNull(lastSkuUpdate);
        this.minCapacity = Objects.requireNonNull(minCapacity);
    }

    /**
     * The last time Sku was updated.
     * 
     */
    public String getLastSkuUpdate() {
        return this.lastSkuUpdate;
    }
    /**
     * Minimum CapacityReservation value in GB.
     * 
     */
    public Double getMinCapacity() {
        return this.minCapacity;
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
