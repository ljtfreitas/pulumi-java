// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KubernetesRoleComputeResponse {
    /**
     * Memory in bytes
     * 
     */
    private final Double memoryInBytes;
    /**
     * Processor count
     * 
     */
    private final Integer processorCount;
    /**
     * VM profile
     * 
     */
    private final String vmProfile;

    @OutputCustomType.Constructor({"memoryInBytes","processorCount","vmProfile"})
    private KubernetesRoleComputeResponse(
        Double memoryInBytes,
        Integer processorCount,
        String vmProfile) {
        this.memoryInBytes = Objects.requireNonNull(memoryInBytes);
        this.processorCount = Objects.requireNonNull(processorCount);
        this.vmProfile = Objects.requireNonNull(vmProfile);
    }

    /**
     * Memory in bytes
     * 
     */
    public Double getMemoryInBytes() {
        return this.memoryInBytes;
    }
    /**
     * Processor count
     * 
     */
    public Integer getProcessorCount() {
        return this.processorCount;
    }
    /**
     * VM profile
     * 
     */
    public String getVmProfile() {
        return this.vmProfile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesRoleComputeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double memoryInBytes;
        private Integer processorCount;
        private String vmProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesRoleComputeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memoryInBytes = defaults.memoryInBytes;
    	      this.processorCount = defaults.processorCount;
    	      this.vmProfile = defaults.vmProfile;
        }

        public Builder setMemoryInBytes(Double memoryInBytes) {
            this.memoryInBytes = Objects.requireNonNull(memoryInBytes);
            return this;
        }

        public Builder setProcessorCount(Integer processorCount) {
            this.processorCount = Objects.requireNonNull(processorCount);
            return this;
        }

        public Builder setVmProfile(String vmProfile) {
            this.vmProfile = Objects.requireNonNull(vmProfile);
            return this;
        }
        public KubernetesRoleComputeResponse build() {
            return new KubernetesRoleComputeResponse(memoryInBytes, processorCount, vmProfile);
        }
    }
}
