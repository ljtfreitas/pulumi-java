// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AcceleratorConfigResponse {
    /**
     * The number of the accelerator cards exposed to an instance.
     * 
     */
    private final String acceleratorCount;
    /**
     * The accelerator type resource name. List of supported accelerators [here](https://cloud.google.com/compute/docs/gpus)
     * 
     */
    private final String acceleratorType;
    /**
     * Size of partitions to create on the GPU. Valid values are described in the NVIDIA [mig user guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
     * 
     */
    private final String gpuPartitionSize;

    @CustomType.Constructor
    private AcceleratorConfigResponse(
        @CustomType.Parameter("acceleratorCount") String acceleratorCount,
        @CustomType.Parameter("acceleratorType") String acceleratorType,
        @CustomType.Parameter("gpuPartitionSize") String gpuPartitionSize) {
        this.acceleratorCount = acceleratorCount;
        this.acceleratorType = acceleratorType;
        this.gpuPartitionSize = gpuPartitionSize;
    }

    /**
     * The number of the accelerator cards exposed to an instance.
     * 
    */
    public String getAcceleratorCount() {
        return this.acceleratorCount;
    }
    /**
     * The accelerator type resource name. List of supported accelerators [here](https://cloud.google.com/compute/docs/gpus)
     * 
    */
    public String getAcceleratorType() {
        return this.acceleratorType;
    }
    /**
     * Size of partitions to create on the GPU. Valid values are described in the NVIDIA [mig user guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
     * 
    */
    public String getGpuPartitionSize() {
        return this.gpuPartitionSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcceleratorConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String acceleratorCount;
        private String acceleratorType;
        private String gpuPartitionSize;

        public Builder() {
    	      // Empty
        }

        public Builder(AcceleratorConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorType = defaults.acceleratorType;
    	      this.gpuPartitionSize = defaults.gpuPartitionSize;
        }

        public Builder acceleratorCount(String acceleratorCount) {
            this.acceleratorCount = Objects.requireNonNull(acceleratorCount);
            return this;
        }

        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }

        public Builder gpuPartitionSize(String gpuPartitionSize) {
            this.gpuPartitionSize = Objects.requireNonNull(gpuPartitionSize);
            return this;
        }
        public AcceleratorConfigResponse build() {
            return new AcceleratorConfigResponse(acceleratorCount, acceleratorType, gpuPartitionSize);
        }
    }
}
