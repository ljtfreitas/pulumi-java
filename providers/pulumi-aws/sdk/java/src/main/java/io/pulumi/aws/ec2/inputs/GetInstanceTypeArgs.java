// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetInstanceTypeFpga;
import io.pulumi.aws.ec2.inputs.GetInstanceTypeGpus;
import io.pulumi.aws.ec2.inputs.GetInstanceTypeInferenceAccelerator;
import io.pulumi.aws.ec2.inputs.GetInstanceTypeInstanceDisk;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceTypeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceTypeArgs Empty = new GetInstanceTypeArgs();

    /**
     * The default number of cores for the instance type.
     * 
     */
    @InputImport(name="defaultCores")
    private final @Nullable Integer defaultCores;

    public Optional<Integer> getDefaultCores() {
        return this.defaultCores == null ? Optional.empty() : Optional.ofNullable(this.defaultCores);
    }

    /**
     * The  default  number of threads per core for the instance type.
     * 
     */
    @InputImport(name="defaultThreadsPerCore")
    private final @Nullable Integer defaultThreadsPerCore;

    public Optional<Integer> getDefaultThreadsPerCore() {
        return this.defaultThreadsPerCore == null ? Optional.empty() : Optional.ofNullable(this.defaultThreadsPerCore);
    }

    /**
     * Describes the FPGA accelerator settings for the instance type.
     * * `fpgas.#.count` - The count of FPGA accelerators for the instance type.
     * * `fpgas.#.manufacturer` - The manufacturer of the FPGA accelerator.
     * * `fpgas.#.memory_size` - The size (in MiB) for the memory available to the FPGA accelerator.
     * * `fpgas.#.name` - The name of the FPGA accelerator.
     * 
     */
    @InputImport(name="fpgas")
    private final @Nullable List<GetInstanceTypeFpga> fpgas;

    public List<GetInstanceTypeFpga> getFpgas() {
        return this.fpgas == null ? List.of() : this.fpgas;
    }

    /**
     * Describes the GPU accelerators for the instance type.
     * * `gpus.#.count` - The number of GPUs for the instance type.
     * * `gpus.#.manufacturer` - The manufacturer of the GPU accelerator.
     * * `gpus.#.memory_size` - The size (in MiB) for the memory available to the GPU accelerator.
     * * `gpus.#.name` - The name of the GPU accelerator.
     * 
     */
    @InputImport(name="gpuses")
    private final @Nullable List<GetInstanceTypeGpus> gpuses;

    public List<GetInstanceTypeGpus> getGpuses() {
        return this.gpuses == null ? List.of() : this.gpuses;
    }

    /**
     * Indicates the hypervisor used for the instance type.
     * * `inference_accelerators` Describes the Inference accelerators for the instance type.
     * * `inference_accelerators.#.count` - The number of Inference accelerators for the instance type.
     * * `inference_accelerators.#.manufacturer` - The manufacturer of the Inference accelerator.
     * * `inference_accelerators.#.name` - The name of the Inference accelerator.
     * 
     */
    @InputImport(name="hypervisor")
    private final @Nullable String hypervisor;

    public Optional<String> getHypervisor() {
        return this.hypervisor == null ? Optional.empty() : Optional.ofNullable(this.hypervisor);
    }

    @InputImport(name="inferenceAccelerators")
    private final @Nullable List<GetInstanceTypeInferenceAccelerator> inferenceAccelerators;

    public List<GetInstanceTypeInferenceAccelerator> getInferenceAccelerators() {
        return this.inferenceAccelerators == null ? List.of() : this.inferenceAccelerators;
    }

    /**
     * Describes the disks for the instance type.
     * * `instance_disks.#.count` - The number of disks with this configuration.
     * * `instance_disks.#.size` - The size of the disk in GB.
     * * `instance_disks.#.type` - The type of disk.
     * 
     */
    @InputImport(name="instanceDisks")
    private final @Nullable List<GetInstanceTypeInstanceDisk> instanceDisks;

    public List<GetInstanceTypeInstanceDisk> getInstanceDisks() {
        return this.instanceDisks == null ? List.of() : this.instanceDisks;
    }

    /**
     * Instance
     * 
     */
    @InputImport(name="instanceType", required=true)
    private final String instanceType;

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * The maximum number of IPv6 addresses per network interface.
     * 
     */
    @InputImport(name="maximumIpv6AddressesPerInterface")
    private final @Nullable Integer maximumIpv6AddressesPerInterface;

    public Optional<Integer> getMaximumIpv6AddressesPerInterface() {
        return this.maximumIpv6AddressesPerInterface == null ? Optional.empty() : Optional.ofNullable(this.maximumIpv6AddressesPerInterface);
    }

    /**
     * The total memory of all FPGA accelerators for the instance type (in MiB).
     * 
     */
    @InputImport(name="totalFpgaMemory")
    private final @Nullable Integer totalFpgaMemory;

    public Optional<Integer> getTotalFpgaMemory() {
        return this.totalFpgaMemory == null ? Optional.empty() : Optional.ofNullable(this.totalFpgaMemory);
    }

    /**
     * The total size of the memory for the GPU accelerators for the instance type (in MiB).
     * 
     */
    @InputImport(name="totalGpuMemory")
    private final @Nullable Integer totalGpuMemory;

    public Optional<Integer> getTotalGpuMemory() {
        return this.totalGpuMemory == null ? Optional.empty() : Optional.ofNullable(this.totalGpuMemory);
    }

    /**
     * The total size of the instance disks, in GB.
     * 
     */
    @InputImport(name="totalInstanceStorage")
    private final @Nullable Integer totalInstanceStorage;

    public Optional<Integer> getTotalInstanceStorage() {
        return this.totalInstanceStorage == null ? Optional.empty() : Optional.ofNullable(this.totalInstanceStorage);
    }

    public GetInstanceTypeArgs(
        @Nullable Integer defaultCores,
        @Nullable Integer defaultThreadsPerCore,
        @Nullable List<GetInstanceTypeFpga> fpgas,
        @Nullable List<GetInstanceTypeGpus> gpuses,
        @Nullable String hypervisor,
        @Nullable List<GetInstanceTypeInferenceAccelerator> inferenceAccelerators,
        @Nullable List<GetInstanceTypeInstanceDisk> instanceDisks,
        String instanceType,
        @Nullable Integer maximumIpv6AddressesPerInterface,
        @Nullable Integer totalFpgaMemory,
        @Nullable Integer totalGpuMemory,
        @Nullable Integer totalInstanceStorage) {
        this.defaultCores = defaultCores;
        this.defaultThreadsPerCore = defaultThreadsPerCore;
        this.fpgas = fpgas;
        this.gpuses = gpuses;
        this.hypervisor = hypervisor;
        this.inferenceAccelerators = inferenceAccelerators;
        this.instanceDisks = instanceDisks;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.maximumIpv6AddressesPerInterface = maximumIpv6AddressesPerInterface;
        this.totalFpgaMemory = totalFpgaMemory;
        this.totalGpuMemory = totalGpuMemory;
        this.totalInstanceStorage = totalInstanceStorage;
    }

    private GetInstanceTypeArgs() {
        this.defaultCores = null;
        this.defaultThreadsPerCore = null;
        this.fpgas = List.of();
        this.gpuses = List.of();
        this.hypervisor = null;
        this.inferenceAccelerators = List.of();
        this.instanceDisks = List.of();
        this.instanceType = null;
        this.maximumIpv6AddressesPerInterface = null;
        this.totalFpgaMemory = null;
        this.totalGpuMemory = null;
        this.totalInstanceStorage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer defaultCores;
        private @Nullable Integer defaultThreadsPerCore;
        private @Nullable List<GetInstanceTypeFpga> fpgas;
        private @Nullable List<GetInstanceTypeGpus> gpuses;
        private @Nullable String hypervisor;
        private @Nullable List<GetInstanceTypeInferenceAccelerator> inferenceAccelerators;
        private @Nullable List<GetInstanceTypeInstanceDisk> instanceDisks;
        private String instanceType;
        private @Nullable Integer maximumIpv6AddressesPerInterface;
        private @Nullable Integer totalFpgaMemory;
        private @Nullable Integer totalGpuMemory;
        private @Nullable Integer totalInstanceStorage;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultCores = defaults.defaultCores;
    	      this.defaultThreadsPerCore = defaults.defaultThreadsPerCore;
    	      this.fpgas = defaults.fpgas;
    	      this.gpuses = defaults.gpuses;
    	      this.hypervisor = defaults.hypervisor;
    	      this.inferenceAccelerators = defaults.inferenceAccelerators;
    	      this.instanceDisks = defaults.instanceDisks;
    	      this.instanceType = defaults.instanceType;
    	      this.maximumIpv6AddressesPerInterface = defaults.maximumIpv6AddressesPerInterface;
    	      this.totalFpgaMemory = defaults.totalFpgaMemory;
    	      this.totalGpuMemory = defaults.totalGpuMemory;
    	      this.totalInstanceStorage = defaults.totalInstanceStorage;
        }

        public Builder setDefaultCores(@Nullable Integer defaultCores) {
            this.defaultCores = defaultCores;
            return this;
        }

        public Builder setDefaultThreadsPerCore(@Nullable Integer defaultThreadsPerCore) {
            this.defaultThreadsPerCore = defaultThreadsPerCore;
            return this;
        }

        public Builder setFpgas(@Nullable List<GetInstanceTypeFpga> fpgas) {
            this.fpgas = fpgas;
            return this;
        }

        public Builder setGpuses(@Nullable List<GetInstanceTypeGpus> gpuses) {
            this.gpuses = gpuses;
            return this;
        }

        public Builder setHypervisor(@Nullable String hypervisor) {
            this.hypervisor = hypervisor;
            return this;
        }

        public Builder setInferenceAccelerators(@Nullable List<GetInstanceTypeInferenceAccelerator> inferenceAccelerators) {
            this.inferenceAccelerators = inferenceAccelerators;
            return this;
        }

        public Builder setInstanceDisks(@Nullable List<GetInstanceTypeInstanceDisk> instanceDisks) {
            this.instanceDisks = instanceDisks;
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setMaximumIpv6AddressesPerInterface(@Nullable Integer maximumIpv6AddressesPerInterface) {
            this.maximumIpv6AddressesPerInterface = maximumIpv6AddressesPerInterface;
            return this;
        }

        public Builder setTotalFpgaMemory(@Nullable Integer totalFpgaMemory) {
            this.totalFpgaMemory = totalFpgaMemory;
            return this;
        }

        public Builder setTotalGpuMemory(@Nullable Integer totalGpuMemory) {
            this.totalGpuMemory = totalGpuMemory;
            return this;
        }

        public Builder setTotalInstanceStorage(@Nullable Integer totalInstanceStorage) {
            this.totalInstanceStorage = totalInstanceStorage;
            return this;
        }
        public GetInstanceTypeArgs build() {
            return new GetInstanceTypeArgs(defaultCores, defaultThreadsPerCore, fpgas, gpuses, hypervisor, inferenceAccelerators, instanceDisks, instanceType, maximumIpv6AddressesPerInterface, totalFpgaMemory, totalGpuMemory, totalInstanceStorage);
        }
    }
}
