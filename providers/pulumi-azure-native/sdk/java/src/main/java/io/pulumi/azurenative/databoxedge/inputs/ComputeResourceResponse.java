// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;


/**
 * Compute infrastructure Resource
 * 
 */
public final class ComputeResourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComputeResourceResponse Empty = new ComputeResourceResponse();

    /**
     * Memory in GB
     * 
     */
    @Import(name="memoryInGB", required=true)
      private final Double memoryInGB;

    public Double getMemoryInGB() {
        return this.memoryInGB;
    }

    /**
     * Processor count
     * 
     */
    @Import(name="processorCount", required=true)
      private final Integer processorCount;

    public Integer getProcessorCount() {
        return this.processorCount;
    }

    public ComputeResourceResponse(
        Double memoryInGB,
        Integer processorCount) {
        this.memoryInGB = Objects.requireNonNull(memoryInGB, "expected parameter 'memoryInGB' to be non-null");
        this.processorCount = Objects.requireNonNull(processorCount, "expected parameter 'processorCount' to be non-null");
    }

    private ComputeResourceResponse() {
        this.memoryInGB = null;
        this.processorCount = null;
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

        public Builder memoryInGB(Double memoryInGB) {
            this.memoryInGB = Objects.requireNonNull(memoryInGB);
            return this;
        }

        public Builder processorCount(Integer processorCount) {
            this.processorCount = Objects.requireNonNull(processorCount);
            return this;
        }
        public ComputeResourceResponse build() {
            return new ComputeResourceResponse(memoryInGB, processorCount);
        }
    }
}
