// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionResourcesVolumeArgs;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionResourcesArgs Empty = new FlexibleAppVersionResourcesArgs();

    /**
     * Number of CPU cores needed.
     * 
     */
    @Import(name="cpu")
      private final @Nullable Output<Integer> cpu;

    public Output<Integer> getCpu() {
        return this.cpu == null ? Output.empty() : this.cpu;
    }

    /**
     * Disk size (GB) needed.
     * 
     */
    @Import(name="diskGb")
      private final @Nullable Output<Integer> diskGb;

    public Output<Integer> getDiskGb() {
        return this.diskGb == null ? Output.empty() : this.diskGb;
    }

    /**
     * Memory (GB) needed.
     * 
     */
    @Import(name="memoryGb")
      private final @Nullable Output<Double> memoryGb;

    public Output<Double> getMemoryGb() {
        return this.memoryGb == null ? Output.empty() : this.memoryGb;
    }

    /**
     * List of ports, or port pairs, to forward from the virtual machine to the application container.
     * Structure is documented below.
     * 
     */
    @Import(name="volumes")
      private final @Nullable Output<List<FlexibleAppVersionResourcesVolumeArgs>> volumes;

    public Output<List<FlexibleAppVersionResourcesVolumeArgs>> getVolumes() {
        return this.volumes == null ? Output.empty() : this.volumes;
    }

    public FlexibleAppVersionResourcesArgs(
        @Nullable Output<Integer> cpu,
        @Nullable Output<Integer> diskGb,
        @Nullable Output<Double> memoryGb,
        @Nullable Output<List<FlexibleAppVersionResourcesVolumeArgs>> volumes) {
        this.cpu = cpu;
        this.diskGb = diskGb;
        this.memoryGb = memoryGb;
        this.volumes = volumes;
    }

    private FlexibleAppVersionResourcesArgs() {
        this.cpu = Output.empty();
        this.diskGb = Output.empty();
        this.memoryGb = Output.empty();
        this.volumes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> cpu;
        private @Nullable Output<Integer> diskGb;
        private @Nullable Output<Double> memoryGb;
        private @Nullable Output<List<FlexibleAppVersionResourcesVolumeArgs>> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.diskGb = defaults.diskGb;
    	      this.memoryGb = defaults.memoryGb;
    	      this.volumes = defaults.volumes;
        }

        public Builder cpu(@Nullable Output<Integer> cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder cpu(@Nullable Integer cpu) {
            this.cpu = Output.ofNullable(cpu);
            return this;
        }

        public Builder diskGb(@Nullable Output<Integer> diskGb) {
            this.diskGb = diskGb;
            return this;
        }

        public Builder diskGb(@Nullable Integer diskGb) {
            this.diskGb = Output.ofNullable(diskGb);
            return this;
        }

        public Builder memoryGb(@Nullable Output<Double> memoryGb) {
            this.memoryGb = memoryGb;
            return this;
        }

        public Builder memoryGb(@Nullable Double memoryGb) {
            this.memoryGb = Output.ofNullable(memoryGb);
            return this;
        }

        public Builder volumes(@Nullable Output<List<FlexibleAppVersionResourcesVolumeArgs>> volumes) {
            this.volumes = volumes;
            return this;
        }

        public Builder volumes(@Nullable List<FlexibleAppVersionResourcesVolumeArgs> volumes) {
            this.volumes = Output.ofNullable(volumes);
            return this;
        }
        public FlexibleAppVersionResourcesArgs build() {
            return new FlexibleAppVersionResourcesArgs(cpu, diskGb, memoryGb, volumes);
        }
    }
}
