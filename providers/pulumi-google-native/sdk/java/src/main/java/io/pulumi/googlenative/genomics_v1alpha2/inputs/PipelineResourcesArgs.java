// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.genomics_v1alpha2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.genomics_v1alpha2.inputs.DiskArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The system resources for the pipeline run.
 * 
 */
public final class PipelineResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineResourcesArgs Empty = new PipelineResourcesArgs();

    /**
     * Optional. The number of accelerators of the specified type to attach. By specifying this parameter, you will download and install the following third-party software onto your managed Compute Engine instances: NVIDIA® Tesla® drivers and NVIDIA® CUDA toolkit.
     * 
     */
    @Import(name="acceleratorCount")
      private final @Nullable Output<String> acceleratorCount;

    public Output<String> getAcceleratorCount() {
        return this.acceleratorCount == null ? Output.empty() : this.acceleratorCount;
    }

    /**
     * Optional. The Compute Engine defined accelerator type. By specifying this parameter, you will download and install the following third-party software onto your managed Compute Engine instances: NVIDIA® Tesla® drivers and NVIDIA® CUDA toolkit. Please see https://cloud.google.com/compute/docs/gpus/ for a list of available accelerator types.
     * 
     */
    @Import(name="acceleratorType")
      private final @Nullable Output<String> acceleratorType;

    public Output<String> getAcceleratorType() {
        return this.acceleratorType == null ? Output.empty() : this.acceleratorType;
    }

    /**
     * The size of the boot disk. Defaults to 10 (GB).
     * 
     */
    @Import(name="bootDiskSizeGb")
      private final @Nullable Output<Integer> bootDiskSizeGb;

    public Output<Integer> getBootDiskSizeGb() {
        return this.bootDiskSizeGb == null ? Output.empty() : this.bootDiskSizeGb;
    }

    /**
     * Disks to attach.
     * 
     */
    @Import(name="disks")
      private final @Nullable Output<List<DiskArgs>> disks;

    public Output<List<DiskArgs>> getDisks() {
        return this.disks == null ? Output.empty() : this.disks;
    }

    /**
     * The minimum number of cores to use. Defaults to 1.
     * 
     */
    @Import(name="minimumCpuCores")
      private final @Nullable Output<Integer> minimumCpuCores;

    public Output<Integer> getMinimumCpuCores() {
        return this.minimumCpuCores == null ? Output.empty() : this.minimumCpuCores;
    }

    /**
     * The minimum amount of RAM to use. Defaults to 3.75 (GB)
     * 
     */
    @Import(name="minimumRamGb")
      private final @Nullable Output<Double> minimumRamGb;

    public Output<Double> getMinimumRamGb() {
        return this.minimumRamGb == null ? Output.empty() : this.minimumRamGb;
    }

    /**
     * Whether to assign an external IP to the instance. This is an experimental feature that may go away. Defaults to false. Corresponds to `--no_address` flag for [gcloud compute instances create] (https://cloud.google.com/sdk/gcloud/reference/compute/instances/create). In order to use this, must be true for both create time and run time. Cannot be true at run time if false at create time. If you need to ssh into a private IP VM for debugging, you can ssh to a public VM and then ssh into the private VM's Internal IP. If noAddress is set, this pipeline run may only load docker images from Google Container Registry and not Docker Hub. Before using this, you must [configure access to Google services from internal IPs](https://cloud.google.com/compute/docs/configure-private-google-access#configuring_access_to_google_services_from_internal_ips).
     * 
     */
    @Import(name="noAddress")
      private final @Nullable Output<Boolean> noAddress;

    public Output<Boolean> getNoAddress() {
        return this.noAddress == null ? Output.empty() : this.noAddress;
    }

    /**
     * Whether to use preemptible VMs. Defaults to `false`. In order to use this, must be true for both create time and run time. Cannot be true at run time if false at create time.
     * 
     */
    @Import(name="preemptible")
      private final @Nullable Output<Boolean> preemptible;

    public Output<Boolean> getPreemptible() {
        return this.preemptible == null ? Output.empty() : this.preemptible;
    }

    /**
     * List of Google Compute Engine availability zones to which resource creation will restricted. If empty, any zone may be chosen.
     * 
     */
    @Import(name="zones")
      private final @Nullable Output<List<String>> zones;

    public Output<List<String>> getZones() {
        return this.zones == null ? Output.empty() : this.zones;
    }

    public PipelineResourcesArgs(
        @Nullable Output<String> acceleratorCount,
        @Nullable Output<String> acceleratorType,
        @Nullable Output<Integer> bootDiskSizeGb,
        @Nullable Output<List<DiskArgs>> disks,
        @Nullable Output<Integer> minimumCpuCores,
        @Nullable Output<Double> minimumRamGb,
        @Nullable Output<Boolean> noAddress,
        @Nullable Output<Boolean> preemptible,
        @Nullable Output<List<String>> zones) {
        this.acceleratorCount = acceleratorCount;
        this.acceleratorType = acceleratorType;
        this.bootDiskSizeGb = bootDiskSizeGb;
        this.disks = disks;
        this.minimumCpuCores = minimumCpuCores;
        this.minimumRamGb = minimumRamGb;
        this.noAddress = noAddress;
        this.preemptible = preemptible;
        this.zones = zones;
    }

    private PipelineResourcesArgs() {
        this.acceleratorCount = Output.empty();
        this.acceleratorType = Output.empty();
        this.bootDiskSizeGb = Output.empty();
        this.disks = Output.empty();
        this.minimumCpuCores = Output.empty();
        this.minimumRamGb = Output.empty();
        this.noAddress = Output.empty();
        this.preemptible = Output.empty();
        this.zones = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> acceleratorCount;
        private @Nullable Output<String> acceleratorType;
        private @Nullable Output<Integer> bootDiskSizeGb;
        private @Nullable Output<List<DiskArgs>> disks;
        private @Nullable Output<Integer> minimumCpuCores;
        private @Nullable Output<Double> minimumRamGb;
        private @Nullable Output<Boolean> noAddress;
        private @Nullable Output<Boolean> preemptible;
        private @Nullable Output<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorType = defaults.acceleratorType;
    	      this.bootDiskSizeGb = defaults.bootDiskSizeGb;
    	      this.disks = defaults.disks;
    	      this.minimumCpuCores = defaults.minimumCpuCores;
    	      this.minimumRamGb = defaults.minimumRamGb;
    	      this.noAddress = defaults.noAddress;
    	      this.preemptible = defaults.preemptible;
    	      this.zones = defaults.zones;
        }

        public Builder acceleratorCount(@Nullable Output<String> acceleratorCount) {
            this.acceleratorCount = acceleratorCount;
            return this;
        }

        public Builder acceleratorCount(@Nullable String acceleratorCount) {
            this.acceleratorCount = Output.ofNullable(acceleratorCount);
            return this;
        }

        public Builder acceleratorType(@Nullable Output<String> acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }

        public Builder acceleratorType(@Nullable String acceleratorType) {
            this.acceleratorType = Output.ofNullable(acceleratorType);
            return this;
        }

        public Builder bootDiskSizeGb(@Nullable Output<Integer> bootDiskSizeGb) {
            this.bootDiskSizeGb = bootDiskSizeGb;
            return this;
        }

        public Builder bootDiskSizeGb(@Nullable Integer bootDiskSizeGb) {
            this.bootDiskSizeGb = Output.ofNullable(bootDiskSizeGb);
            return this;
        }

        public Builder disks(@Nullable Output<List<DiskArgs>> disks) {
            this.disks = disks;
            return this;
        }

        public Builder disks(@Nullable List<DiskArgs> disks) {
            this.disks = Output.ofNullable(disks);
            return this;
        }

        public Builder minimumCpuCores(@Nullable Output<Integer> minimumCpuCores) {
            this.minimumCpuCores = minimumCpuCores;
            return this;
        }

        public Builder minimumCpuCores(@Nullable Integer minimumCpuCores) {
            this.minimumCpuCores = Output.ofNullable(minimumCpuCores);
            return this;
        }

        public Builder minimumRamGb(@Nullable Output<Double> minimumRamGb) {
            this.minimumRamGb = minimumRamGb;
            return this;
        }

        public Builder minimumRamGb(@Nullable Double minimumRamGb) {
            this.minimumRamGb = Output.ofNullable(minimumRamGb);
            return this;
        }

        public Builder noAddress(@Nullable Output<Boolean> noAddress) {
            this.noAddress = noAddress;
            return this;
        }

        public Builder noAddress(@Nullable Boolean noAddress) {
            this.noAddress = Output.ofNullable(noAddress);
            return this;
        }

        public Builder preemptible(@Nullable Output<Boolean> preemptible) {
            this.preemptible = preemptible;
            return this;
        }

        public Builder preemptible(@Nullable Boolean preemptible) {
            this.preemptible = Output.ofNullable(preemptible);
            return this;
        }

        public Builder zones(@Nullable Output<List<String>> zones) {
            this.zones = zones;
            return this;
        }

        public Builder zones(@Nullable List<String> zones) {
            this.zones = Output.ofNullable(zones);
            return this;
        }
        public PipelineResourcesArgs build() {
            return new PipelineResourcesArgs(acceleratorCount, acceleratorType, bootDiskSizeGb, disks, minimumCpuCores, minimumRamGb, noAddress, preemptible, zones);
        }
    }
}
