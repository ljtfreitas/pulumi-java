// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The resource requirements for the container (cpu and memory).
 * 
 */
public final class ContainerResourceRequirementsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerResourceRequirementsResponse Empty = new ContainerResourceRequirementsResponse();

    /**
     * The minimum amount of CPU cores to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
     */
    @InputImport(name="cpu")
    private final @Nullable Double cpu;

    public Optional<Double> getCpu() {
        return this.cpu == null ? Optional.empty() : Optional.ofNullable(this.cpu);
    }

    /**
     * The maximum amount of CPU cores allowed to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
     */
    @InputImport(name="cpuLimit")
    private final @Nullable Double cpuLimit;

    public Optional<Double> getCpuLimit() {
        return this.cpuLimit == null ? Optional.empty() : Optional.ofNullable(this.cpuLimit);
    }

    /**
     * The number of FPGA PCIE devices exposed to the container. Must be multiple of 2.
     * 
     */
    @InputImport(name="fpga")
    private final @Nullable Integer fpga;

    public Optional<Integer> getFpga() {
        return this.fpga == null ? Optional.empty() : Optional.ofNullable(this.fpga);
    }

    /**
     * The number of GPU cores in the container.
     * 
     */
    @InputImport(name="gpu")
    private final @Nullable Integer gpu;

    public Optional<Integer> getGpu() {
        return this.gpu == null ? Optional.empty() : Optional.ofNullable(this.gpu);
    }

    /**
     * The minimum amount of memory (in GB) to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
     */
    @InputImport(name="memoryInGB")
    private final @Nullable Double memoryInGB;

    public Optional<Double> getMemoryInGB() {
        return this.memoryInGB == null ? Optional.empty() : Optional.ofNullable(this.memoryInGB);
    }

    /**
     * The maximum amount of memory (in GB) allowed to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
     */
    @InputImport(name="memoryInGBLimit")
    private final @Nullable Double memoryInGBLimit;

    public Optional<Double> getMemoryInGBLimit() {
        return this.memoryInGBLimit == null ? Optional.empty() : Optional.ofNullable(this.memoryInGBLimit);
    }

    public ContainerResourceRequirementsResponse(
        @Nullable Double cpu,
        @Nullable Double cpuLimit,
        @Nullable Integer fpga,
        @Nullable Integer gpu,
        @Nullable Double memoryInGB,
        @Nullable Double memoryInGBLimit) {
        this.cpu = cpu;
        this.cpuLimit = cpuLimit;
        this.fpga = fpga;
        this.gpu = gpu;
        this.memoryInGB = memoryInGB;
        this.memoryInGBLimit = memoryInGBLimit;
    }

    private ContainerResourceRequirementsResponse() {
        this.cpu = null;
        this.cpuLimit = null;
        this.fpga = null;
        this.gpu = null;
        this.memoryInGB = null;
        this.memoryInGBLimit = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResourceRequirementsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double cpu;
        private @Nullable Double cpuLimit;
        private @Nullable Integer fpga;
        private @Nullable Integer gpu;
        private @Nullable Double memoryInGB;
        private @Nullable Double memoryInGBLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResourceRequirementsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.cpuLimit = defaults.cpuLimit;
    	      this.fpga = defaults.fpga;
    	      this.gpu = defaults.gpu;
    	      this.memoryInGB = defaults.memoryInGB;
    	      this.memoryInGBLimit = defaults.memoryInGBLimit;
        }

        public Builder setCpu(@Nullable Double cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setCpuLimit(@Nullable Double cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }

        public Builder setFpga(@Nullable Integer fpga) {
            this.fpga = fpga;
            return this;
        }

        public Builder setGpu(@Nullable Integer gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setMemoryInGB(@Nullable Double memoryInGB) {
            this.memoryInGB = memoryInGB;
            return this;
        }

        public Builder setMemoryInGBLimit(@Nullable Double memoryInGBLimit) {
            this.memoryInGBLimit = memoryInGBLimit;
            return this;
        }

        public ContainerResourceRequirementsResponse build() {
            return new ContainerResourceRequirementsResponse(cpu, cpuLimit, fpga, gpu, memoryInGB, memoryInGBLimit);
        }
    }
}
