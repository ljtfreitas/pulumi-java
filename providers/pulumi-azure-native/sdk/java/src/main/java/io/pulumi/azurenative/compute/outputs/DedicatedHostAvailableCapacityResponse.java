// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.DedicatedHostAllocatableVMResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DedicatedHostAvailableCapacityResponse {
    private final @Nullable List<DedicatedHostAllocatableVMResponse> allocatableVMs;

    @OutputCustomType.Constructor({"allocatableVMs"})
    private DedicatedHostAvailableCapacityResponse(@Nullable List<DedicatedHostAllocatableVMResponse> allocatableVMs) {
        this.allocatableVMs = allocatableVMs;
    }

    public List<DedicatedHostAllocatableVMResponse> getAllocatableVMs() {
        return this.allocatableVMs == null ? List.of() : this.allocatableVMs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DedicatedHostAvailableCapacityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DedicatedHostAllocatableVMResponse> allocatableVMs;

        public Builder() {
    	      // Empty
        }

        public Builder(DedicatedHostAvailableCapacityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatableVMs = defaults.allocatableVMs;
        }

        public Builder setAllocatableVMs(@Nullable List<DedicatedHostAllocatableVMResponse> allocatableVMs) {
            this.allocatableVMs = allocatableVMs;
            return this;
        }

        public DedicatedHostAvailableCapacityResponse build() {
            return new DedicatedHostAvailableCapacityResponse(allocatableVMs);
        }
    }
}