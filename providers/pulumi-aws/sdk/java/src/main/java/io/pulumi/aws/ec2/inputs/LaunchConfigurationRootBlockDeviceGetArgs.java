// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LaunchConfigurationRootBlockDeviceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchConfigurationRootBlockDeviceGetArgs Empty = new LaunchConfigurationRootBlockDeviceGetArgs();

    @InputImport(name="deleteOnTermination")
    private final @Nullable Input<Boolean> deleteOnTermination;

    public Input<Boolean> getDeleteOnTermination() {
        return this.deleteOnTermination == null ? Input.empty() : this.deleteOnTermination;
    }

    @InputImport(name="encrypted")
    private final @Nullable Input<Boolean> encrypted;

    public Input<Boolean> getEncrypted() {
        return this.encrypted == null ? Input.empty() : this.encrypted;
    }

    @InputImport(name="iops")
    private final @Nullable Input<Integer> iops;

    public Input<Integer> getIops() {
        return this.iops == null ? Input.empty() : this.iops;
    }

    @InputImport(name="throughput")
    private final @Nullable Input<Integer> throughput;

    public Input<Integer> getThroughput() {
        return this.throughput == null ? Input.empty() : this.throughput;
    }

    @InputImport(name="volumeSize")
    private final @Nullable Input<Integer> volumeSize;

    public Input<Integer> getVolumeSize() {
        return this.volumeSize == null ? Input.empty() : this.volumeSize;
    }

    @InputImport(name="volumeType")
    private final @Nullable Input<String> volumeType;

    public Input<String> getVolumeType() {
        return this.volumeType == null ? Input.empty() : this.volumeType;
    }

    public LaunchConfigurationRootBlockDeviceGetArgs(
        @Nullable Input<Boolean> deleteOnTermination,
        @Nullable Input<Boolean> encrypted,
        @Nullable Input<Integer> iops,
        @Nullable Input<Integer> throughput,
        @Nullable Input<Integer> volumeSize,
        @Nullable Input<String> volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.encrypted = encrypted;
        this.iops = iops;
        this.throughput = throughput;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    private LaunchConfigurationRootBlockDeviceGetArgs() {
        this.deleteOnTermination = Input.empty();
        this.encrypted = Input.empty();
        this.iops = Input.empty();
        this.throughput = Input.empty();
        this.volumeSize = Input.empty();
        this.volumeType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchConfigurationRootBlockDeviceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> deleteOnTermination;
        private @Nullable Input<Boolean> encrypted;
        private @Nullable Input<Integer> iops;
        private @Nullable Input<Integer> throughput;
        private @Nullable Input<Integer> volumeSize;
        private @Nullable Input<String> volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchConfigurationRootBlockDeviceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setDeleteOnTermination(@Nullable Input<Boolean> deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }

        public Builder setDeleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = Input.ofNullable(deleteOnTermination);
            return this;
        }

        public Builder setEncrypted(@Nullable Input<Boolean> encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        public Builder setEncrypted(@Nullable Boolean encrypted) {
            this.encrypted = Input.ofNullable(encrypted);
            return this;
        }

        public Builder setIops(@Nullable Input<Integer> iops) {
            this.iops = iops;
            return this;
        }

        public Builder setIops(@Nullable Integer iops) {
            this.iops = Input.ofNullable(iops);
            return this;
        }

        public Builder setThroughput(@Nullable Input<Integer> throughput) {
            this.throughput = throughput;
            return this;
        }

        public Builder setThroughput(@Nullable Integer throughput) {
            this.throughput = Input.ofNullable(throughput);
            return this;
        }

        public Builder setVolumeSize(@Nullable Input<Integer> volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }

        public Builder setVolumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = Input.ofNullable(volumeSize);
            return this;
        }

        public Builder setVolumeType(@Nullable Input<String> volumeType) {
            this.volumeType = volumeType;
            return this;
        }

        public Builder setVolumeType(@Nullable String volumeType) {
            this.volumeType = Input.ofNullable(volumeType);
            return this;
        }
        public LaunchConfigurationRootBlockDeviceGetArgs build() {
            return new LaunchConfigurationRootBlockDeviceGetArgs(deleteOnTermination, encrypted, iops, throughput, volumeSize, volumeType);
        }
    }
}
