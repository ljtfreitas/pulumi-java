// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkspaceSkuResponse {
    /**
     * The capacity reservation level for this workspace, when CapacityReservation sku is selected.
     * 
     */
    private final @Nullable Integer capacityReservationLevel;
    /**
     * The last time when the sku was updated.
     * 
     */
    private final String lastSkuUpdate;
    /**
     * The name of the SKU.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"capacityReservationLevel","lastSkuUpdate","name"})
    private WorkspaceSkuResponse(
        @Nullable Integer capacityReservationLevel,
        String lastSkuUpdate,
        String name) {
        this.capacityReservationLevel = capacityReservationLevel;
        this.lastSkuUpdate = Objects.requireNonNull(lastSkuUpdate);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * The capacity reservation level for this workspace, when CapacityReservation sku is selected.
     * 
     */
    public Optional<Integer> getCapacityReservationLevel() {
        return Optional.ofNullable(this.capacityReservationLevel);
    }
    /**
     * The last time when the sku was updated.
     * 
     */
    public String getLastSkuUpdate() {
        return this.lastSkuUpdate;
    }
    /**
     * The name of the SKU.
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacityReservationLevel;
        private String lastSkuUpdate;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservationLevel = defaults.capacityReservationLevel;
    	      this.lastSkuUpdate = defaults.lastSkuUpdate;
    	      this.name = defaults.name;
        }

        public Builder setCapacityReservationLevel(@Nullable Integer capacityReservationLevel) {
            this.capacityReservationLevel = capacityReservationLevel;
            return this;
        }

        public Builder setLastSkuUpdate(String lastSkuUpdate) {
            this.lastSkuUpdate = Objects.requireNonNull(lastSkuUpdate);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public WorkspaceSkuResponse build() {
            return new WorkspaceSkuResponse(capacityReservationLevel, lastSkuUpdate, name);
        }
    }
}
