// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class ComputeResourceResponse {
    private final Double memoryInGB;
    private final Integer processorCount;

    @OutputCustomType.Constructor({"memoryInGB","processorCount"})
    private ComputeResourceResponse(
        Double memoryInGB,
        Integer processorCount) {
        this.memoryInGB = Objects.requireNonNull(memoryInGB);
        this.processorCount = Objects.requireNonNull(processorCount);
    }

    public Double getMemoryInGB() {
        return this.memoryInGB;
    }
    public Integer getProcessorCount() {
        return this.processorCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double memoryInGB;
        private Integer processorCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memoryInGB = defaults.memoryInGB;
    	      this.processorCount = defaults.processorCount;
        }

        public Builder setMemoryInGB(Double memoryInGB) {
            this.memoryInGB = Objects.requireNonNull(memoryInGB);
            return this;
        }

        public Builder setProcessorCount(Integer processorCount) {
            this.processorCount = Objects.requireNonNull(processorCount);
            return this;
        }

        public ComputeResourceResponse build() {
            return new ComputeResourceResponse(memoryInGB, processorCount);
        }
    }
}