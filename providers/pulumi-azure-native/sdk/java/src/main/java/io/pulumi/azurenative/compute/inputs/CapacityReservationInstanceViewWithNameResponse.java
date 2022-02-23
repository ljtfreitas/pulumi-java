// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.CapacityReservationUtilizationResponse;
import io.pulumi.azurenative.compute.inputs.InstanceViewStatusResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The instance view of a capacity reservation that includes the name of the capacity reservation. It is used for the response to the instance view of a capacity reservation group.
 * 
 */
public final class CapacityReservationInstanceViewWithNameResponse extends io.pulumi.resources.InvokeArgs {

    public static final CapacityReservationInstanceViewWithNameResponse Empty = new CapacityReservationInstanceViewWithNameResponse();

    /**
     * The name of the capacity reservation.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The resource status information.
     * 
     */
    @InputImport(name="statuses")
        private final @Nullable List<InstanceViewStatusResponse> statuses;

    public List<InstanceViewStatusResponse> getStatuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }

    /**
     * Unutilized capacity of the capacity reservation.
     * 
     */
    @InputImport(name="utilizationInfo")
        private final @Nullable CapacityReservationUtilizationResponse utilizationInfo;

    public Optional<CapacityReservationUtilizationResponse> getUtilizationInfo() {
        return this.utilizationInfo == null ? Optional.empty() : Optional.ofNullable(this.utilizationInfo);
    }

    public CapacityReservationInstanceViewWithNameResponse(
        String name,
        @Nullable List<InstanceViewStatusResponse> statuses,
        @Nullable CapacityReservationUtilizationResponse utilizationInfo) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.statuses = statuses;
        this.utilizationInfo = utilizationInfo;
    }

    private CapacityReservationInstanceViewWithNameResponse() {
        this.name = null;
        this.statuses = List.of();
        this.utilizationInfo = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityReservationInstanceViewWithNameResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable List<InstanceViewStatusResponse> statuses;
        private @Nullable CapacityReservationUtilizationResponse utilizationInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityReservationInstanceViewWithNameResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.statuses = defaults.statuses;
    	      this.utilizationInfo = defaults.utilizationInfo;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStatuses(@Nullable List<InstanceViewStatusResponse> statuses) {
            this.statuses = statuses;
            return this;
        }

        public Builder setUtilizationInfo(@Nullable CapacityReservationUtilizationResponse utilizationInfo) {
            this.utilizationInfo = utilizationInfo;
            return this;
        }
        public CapacityReservationInstanceViewWithNameResponse build() {
            return new CapacityReservationInstanceViewWithNameResponse(name, statuses, utilizationInfo);
        }
    }
}
