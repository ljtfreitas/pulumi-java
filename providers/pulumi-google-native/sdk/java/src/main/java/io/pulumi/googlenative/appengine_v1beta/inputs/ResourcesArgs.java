// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.appengine_v1beta.inputs.VolumeArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Machine resources for a version.
 * 
 */
public final class ResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcesArgs Empty = new ResourcesArgs();

    /**
     * Number of CPU cores needed.
     * 
     */
    @Import(name="cpu")
      private final @Nullable Output<Double> cpu;

    public Output<Double> getCpu() {
        return this.cpu == null ? Output.empty() : this.cpu;
    }

    /**
     * Disk size (GB) needed.
     * 
     */
    @Import(name="diskGb")
      private final @Nullable Output<Double> diskGb;

    public Output<Double> getDiskGb() {
        return this.diskGb == null ? Output.empty() : this.diskGb;
    }

    /**
     * The name of the encryption key that is stored in Google Cloud KMS. Only should be used by Cloud Composer to encrypt the vm disk
     * 
     */
    @Import(name="kmsKeyReference")
      private final @Nullable Output<String> kmsKeyReference;

    public Output<String> getKmsKeyReference() {
        return this.kmsKeyReference == null ? Output.empty() : this.kmsKeyReference;
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
     * User specified volumes.
     * 
     */
    @Import(name="volumes")
      private final @Nullable Output<List<VolumeArgs>> volumes;

    public Output<List<VolumeArgs>> getVolumes() {
        return this.volumes == null ? Output.empty() : this.volumes;
    }

    public ResourcesArgs(
        @Nullable Output<Double> cpu,
        @Nullable Output<Double> diskGb,
        @Nullable Output<String> kmsKeyReference,
        @Nullable Output<Double> memoryGb,
        @Nullable Output<List<VolumeArgs>> volumes) {
        this.cpu = cpu;
        this.diskGb = diskGb;
        this.kmsKeyReference = kmsKeyReference;
        this.memoryGb = memoryGb;
        this.volumes = volumes;
    }

    private ResourcesArgs() {
        this.cpu = Output.empty();
        this.diskGb = Output.empty();
        this.kmsKeyReference = Output.empty();
        this.memoryGb = Output.empty();
        this.volumes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> cpu;
        private @Nullable Output<Double> diskGb;
        private @Nullable Output<String> kmsKeyReference;
        private @Nullable Output<Double> memoryGb;
        private @Nullable Output<List<VolumeArgs>> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.diskGb = defaults.diskGb;
    	      this.kmsKeyReference = defaults.kmsKeyReference;
    	      this.memoryGb = defaults.memoryGb;
    	      this.volumes = defaults.volumes;
        }

        public Builder cpu(@Nullable Output<Double> cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder cpu(@Nullable Double cpu) {
            this.cpu = Output.ofNullable(cpu);
            return this;
        }

        public Builder diskGb(@Nullable Output<Double> diskGb) {
            this.diskGb = diskGb;
            return this;
        }

        public Builder diskGb(@Nullable Double diskGb) {
            this.diskGb = Output.ofNullable(diskGb);
            return this;
        }

        public Builder kmsKeyReference(@Nullable Output<String> kmsKeyReference) {
            this.kmsKeyReference = kmsKeyReference;
            return this;
        }

        public Builder kmsKeyReference(@Nullable String kmsKeyReference) {
            this.kmsKeyReference = Output.ofNullable(kmsKeyReference);
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

        public Builder volumes(@Nullable Output<List<VolumeArgs>> volumes) {
            this.volumes = volumes;
            return this;
        }

        public Builder volumes(@Nullable List<VolumeArgs> volumes) {
            this.volumes = Output.ofNullable(volumes);
            return this;
        }
        public ResourcesArgs build() {
            return new ResourcesArgs(cpu, diskGb, kmsKeyReference, memoryGb, volumes);
        }
    }
}
