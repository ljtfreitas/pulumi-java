// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.CapacityReservationUtilizationResponse;
import io.pulumi.azurenative.compute.inputs.InstanceViewStatusResponse;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The instance view of a capacity reservation that provides as snapshot of the runtime properties of the capacity reservation that is managed by the platform and can change outside of control plane operations.
 * 
 */
public final class CapacityReservationInstanceViewResponse extends io.pulumi.resources.InvokeArgs {

    public static final CapacityReservationInstanceViewResponse Empty = new CapacityReservationInstanceViewResponse();

    /**
     * The resource status information.
     * 
     */
    @Import(name="statuses")
      private final @Nullable List<InstanceViewStatusResponse> statuses;

    public List<InstanceViewStatusResponse> getStatuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }

    /**
     * Unutilized capacity of the capacity reservation.
     * 
     */
    @Import(name="utilizationInfo")
      private final @Nullable CapacityReservationUtilizationResponse utilizationInfo;

    public Optional<CapacityReservationUtilizationResponse> getUtilizationInfo() {
        return this.utilizationInfo == null ? Optional.empty() : Optional.ofNullable(this.utilizationInfo);
    }

    public CapacityReservationInstanceViewResponse(
        @Nullable List<InstanceViewStatusResponse> statuses,
        @Nullable CapacityReservationUtilizationResponse utilizationInfo) {
        this.statuses = statuses;
        this.utilizationInfo = utilizationInfo;
    }

    private CapacityReservationInstanceViewResponse() {
        this.statuses = List.of();
        this.utilizationInfo = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityReservationInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<InstanceViewStatusResponse> statuses;
        private @Nullable CapacityReservationUtilizationResponse utilizationInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityReservationInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statuses = defaults.statuses;
    	      this.utilizationInfo = defaults.utilizationInfo;
        }

        public Builder statuses(@Nullable List<InstanceViewStatusResponse> statuses) {
            this.statuses = statuses;
            return this;
        }

        public Builder utilizationInfo(@Nullable CapacityReservationUtilizationResponse utilizationInfo) {
            this.utilizationInfo = utilizationInfo;
            return this;
        }
        public CapacityReservationInstanceViewResponse build() {
            return new CapacityReservationInstanceViewResponse(statuses, utilizationInfo);
        }
    }
}
