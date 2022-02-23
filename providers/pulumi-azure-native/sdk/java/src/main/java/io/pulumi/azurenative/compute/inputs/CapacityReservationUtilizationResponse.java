// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.SubResourceReadOnlyResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


/**
 * Represents the capacity reservation utilization in terms of resources allocated.
 * 
 */
public final class CapacityReservationUtilizationResponse extends io.pulumi.resources.InvokeArgs {

    public static final CapacityReservationUtilizationResponse Empty = new CapacityReservationUtilizationResponse();

    /**
     * A list of all virtual machines resource ids allocated against the capacity reservation.
     * 
     */
    @InputImport(name="virtualMachinesAllocated", required=true)
        private final List<SubResourceReadOnlyResponse> virtualMachinesAllocated;

    public List<SubResourceReadOnlyResponse> getVirtualMachinesAllocated() {
        return this.virtualMachinesAllocated;
    }

    public CapacityReservationUtilizationResponse(List<SubResourceReadOnlyResponse> virtualMachinesAllocated) {
        this.virtualMachinesAllocated = Objects.requireNonNull(virtualMachinesAllocated, "expected parameter 'virtualMachinesAllocated' to be non-null");
    }

    private CapacityReservationUtilizationResponse() {
        this.virtualMachinesAllocated = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityReservationUtilizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SubResourceReadOnlyResponse> virtualMachinesAllocated;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityReservationUtilizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualMachinesAllocated = defaults.virtualMachinesAllocated;
        }

        public Builder setVirtualMachinesAllocated(List<SubResourceReadOnlyResponse> virtualMachinesAllocated) {
            this.virtualMachinesAllocated = Objects.requireNonNull(virtualMachinesAllocated);
            return this;
        }
        public CapacityReservationUtilizationResponse build() {
            return new CapacityReservationUtilizationResponse(virtualMachinesAllocated);
        }
    }
}
