// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The SKU (tier) of a workspace.
 * 
 */
public final class WorkspaceSkuResponse extends io.pulumi.resources.InvokeArgs {

    public static final WorkspaceSkuResponse Empty = new WorkspaceSkuResponse();

    /**
     * The capacity reservation level for this workspace, when CapacityReservation sku is selected.
     * 
     */
    @InputImport(name="capacityReservationLevel")
        private final @Nullable Integer capacityReservationLevel;

    public Optional<Integer> getCapacityReservationLevel() {
        return this.capacityReservationLevel == null ? Optional.empty() : Optional.ofNullable(this.capacityReservationLevel);
    }

    /**
     * The last time when the sku was updated.
     * 
     */
    @InputImport(name="lastSkuUpdate", required=true)
        private final String lastSkuUpdate;

    public String getLastSkuUpdate() {
        return this.lastSkuUpdate;
    }

    /**
     * The name of the SKU.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    public WorkspaceSkuResponse(
        @Nullable Integer capacityReservationLevel,
        String lastSkuUpdate,
        String name) {
        this.capacityReservationLevel = capacityReservationLevel;
        this.lastSkuUpdate = Objects.requireNonNull(lastSkuUpdate, "expected parameter 'lastSkuUpdate' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private WorkspaceSkuResponse() {
        this.capacityReservationLevel = null;
        this.lastSkuUpdate = null;
        this.name = null;
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
