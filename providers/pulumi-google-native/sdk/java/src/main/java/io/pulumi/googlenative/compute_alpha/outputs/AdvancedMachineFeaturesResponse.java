// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class AdvancedMachineFeaturesResponse {
    /**
     * Whether to enable nested virtualization or not (default is false).
     * 
     */
    private final Boolean enableNestedVirtualization;
    /**
     * Whether to enable UEFI networking for instance creation.
     * 
     */
    private final Boolean enableUefiNetworking;
    /**
     * The number of vNUMA nodes.
     * 
     */
    private final Integer numaNodeCount;
    /**
     * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * 
     */
    private final Integer threadsPerCore;
    /**
     * The number of physical cores to expose to an instance. Multiply by the number of threads per core to compute the total number of virtual CPUs to expose to the instance. If unset, the number of cores is inferred from the instance's nominal CPU count and the underlying platform's SMT width.
     * 
     */
    private final Integer visibleCoreCount;

    @CustomType.Constructor
    private AdvancedMachineFeaturesResponse(
        @CustomType.Parameter("enableNestedVirtualization") Boolean enableNestedVirtualization,
        @CustomType.Parameter("enableUefiNetworking") Boolean enableUefiNetworking,
        @CustomType.Parameter("numaNodeCount") Integer numaNodeCount,
        @CustomType.Parameter("threadsPerCore") Integer threadsPerCore,
        @CustomType.Parameter("visibleCoreCount") Integer visibleCoreCount) {
        this.enableNestedVirtualization = enableNestedVirtualization;
        this.enableUefiNetworking = enableUefiNetworking;
        this.numaNodeCount = numaNodeCount;
        this.threadsPerCore = threadsPerCore;
        this.visibleCoreCount = visibleCoreCount;
    }

    /**
     * Whether to enable nested virtualization or not (default is false).
     * 
    */
    public Boolean getEnableNestedVirtualization() {
        return this.enableNestedVirtualization;
    }
    /**
     * Whether to enable UEFI networking for instance creation.
     * 
    */
    public Boolean getEnableUefiNetworking() {
        return this.enableUefiNetworking;
    }
    /**
     * The number of vNUMA nodes.
     * 
    */
    public Integer getNumaNodeCount() {
        return this.numaNodeCount;
    }
    /**
     * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * 
    */
    public Integer getThreadsPerCore() {
        return this.threadsPerCore;
    }
    /**
     * The number of physical cores to expose to an instance. Multiply by the number of threads per core to compute the total number of virtual CPUs to expose to the instance. If unset, the number of cores is inferred from the instance's nominal CPU count and the underlying platform's SMT width.
     * 
    */
    public Integer getVisibleCoreCount() {
        return this.visibleCoreCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedMachineFeaturesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableNestedVirtualization;
        private Boolean enableUefiNetworking;
        private Integer numaNodeCount;
        private Integer threadsPerCore;
        private Integer visibleCoreCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AdvancedMachineFeaturesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableNestedVirtualization = defaults.enableNestedVirtualization;
    	      this.enableUefiNetworking = defaults.enableUefiNetworking;
    	      this.numaNodeCount = defaults.numaNodeCount;
    	      this.threadsPerCore = defaults.threadsPerCore;
    	      this.visibleCoreCount = defaults.visibleCoreCount;
        }

        public Builder enableNestedVirtualization(Boolean enableNestedVirtualization) {
            this.enableNestedVirtualization = Objects.requireNonNull(enableNestedVirtualization);
            return this;
        }

        public Builder enableUefiNetworking(Boolean enableUefiNetworking) {
            this.enableUefiNetworking = Objects.requireNonNull(enableUefiNetworking);
            return this;
        }

        public Builder numaNodeCount(Integer numaNodeCount) {
            this.numaNodeCount = Objects.requireNonNull(numaNodeCount);
            return this;
        }

        public Builder threadsPerCore(Integer threadsPerCore) {
            this.threadsPerCore = Objects.requireNonNull(threadsPerCore);
            return this;
        }

        public Builder visibleCoreCount(Integer visibleCoreCount) {
            this.visibleCoreCount = Objects.requireNonNull(visibleCoreCount);
            return this;
        }
        public AdvancedMachineFeaturesResponse build() {
            return new AdvancedMachineFeaturesResponse(enableNestedVirtualization, enableUefiNetworking, numaNodeCount, threadsPerCore, visibleCoreCount);
        }
    }
}
