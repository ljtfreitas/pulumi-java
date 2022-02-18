// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.inputs.GpuResourceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The resource limits.
 * 
 */
public final class ResourceLimitsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceLimitsResponse Empty = new ResourceLimitsResponse();

    /**
     * The CPU limit of this container instance.
     * 
     */
    @InputImport(name="cpu")
    private final @Nullable Double cpu;

    public Optional<Double> getCpu() {
        return this.cpu == null ? Optional.empty() : Optional.ofNullable(this.cpu);
    }

    /**
     * The GPU limit of this container instance.
     * 
     */
    @InputImport(name="gpu")
    private final @Nullable GpuResourceResponse gpu;

    public Optional<GpuResourceResponse> getGpu() {
        return this.gpu == null ? Optional.empty() : Optional.ofNullable(this.gpu);
    }

    /**
     * The memory limit in GB of this container instance.
     * 
     */
    @InputImport(name="memoryInGB")
    private final @Nullable Double memoryInGB;

    public Optional<Double> getMemoryInGB() {
        return this.memoryInGB == null ? Optional.empty() : Optional.ofNullable(this.memoryInGB);
    }

    public ResourceLimitsResponse(
        @Nullable Double cpu,
        @Nullable GpuResourceResponse gpu,
        @Nullable Double memoryInGB) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.memoryInGB = memoryInGB;
    }

    private ResourceLimitsResponse() {
        this.cpu = null;
        this.gpu = null;
        this.memoryInGB = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceLimitsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double cpu;
        private @Nullable GpuResourceResponse gpu;
        private @Nullable Double memoryInGB;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceLimitsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.gpu = defaults.gpu;
    	      this.memoryInGB = defaults.memoryInGB;
        }

        public Builder setCpu(@Nullable Double cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setGpu(@Nullable GpuResourceResponse gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setMemoryInGB(@Nullable Double memoryInGB) {
            this.memoryInGB = memoryInGB;
            return this;
        }

        public ResourceLimitsResponse build() {
            return new ResourceLimitsResponse(cpu, gpu, memoryInGB);
        }
    }
}
