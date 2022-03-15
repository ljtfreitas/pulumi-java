// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MysqlLayerEbsVolumeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MysqlLayerEbsVolumeGetArgs Empty = new MysqlLayerEbsVolumeGetArgs();

    @Import(name="encrypted")
      private final @Nullable Output<Boolean> encrypted;

    public Output<Boolean> getEncrypted() {
        return this.encrypted == null ? Output.empty() : this.encrypted;
    }

    /**
     * For PIOPS volumes, the IOPS per disk.
     * 
     */
    @Import(name="iops")
      private final @Nullable Output<Integer> iops;

    public Output<Integer> getIops() {
        return this.iops == null ? Output.empty() : this.iops;
    }

    /**
     * The path to mount the EBS volume on the layer's instances.
     * 
     */
    @Import(name="mountPoint", required=true)
      private final Output<String> mountPoint;

    public Output<String> getMountPoint() {
        return this.mountPoint;
    }

    /**
     * The number of disks to use for the EBS volume.
     * 
     */
    @Import(name="numberOfDisks", required=true)
      private final Output<Integer> numberOfDisks;

    public Output<Integer> getNumberOfDisks() {
        return this.numberOfDisks;
    }

    /**
     * The RAID level to use for the volume.
     * 
     */
    @Import(name="raidLevel")
      private final @Nullable Output<String> raidLevel;

    public Output<String> getRaidLevel() {
        return this.raidLevel == null ? Output.empty() : this.raidLevel;
    }

    /**
     * The size of the volume in gigabytes.
     * 
     */
    @Import(name="size", required=true)
      private final Output<Integer> size;

    public Output<Integer> getSize() {
        return this.size;
    }

    /**
     * The type of volume to create. This may be `standard` (the default), `io1` or `gp2`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public MysqlLayerEbsVolumeGetArgs(
        @Nullable Output<Boolean> encrypted,
        @Nullable Output<Integer> iops,
        Output<String> mountPoint,
        Output<Integer> numberOfDisks,
        @Nullable Output<String> raidLevel,
        Output<Integer> size,
        @Nullable Output<String> type) {
        this.encrypted = encrypted;
        this.iops = iops;
        this.mountPoint = Objects.requireNonNull(mountPoint, "expected parameter 'mountPoint' to be non-null");
        this.numberOfDisks = Objects.requireNonNull(numberOfDisks, "expected parameter 'numberOfDisks' to be non-null");
        this.raidLevel = raidLevel;
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
        this.type = type;
    }

    private MysqlLayerEbsVolumeGetArgs() {
        this.encrypted = Output.empty();
        this.iops = Output.empty();
        this.mountPoint = Output.empty();
        this.numberOfDisks = Output.empty();
        this.raidLevel = Output.empty();
        this.size = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlLayerEbsVolumeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> encrypted;
        private @Nullable Output<Integer> iops;
        private Output<String> mountPoint;
        private Output<Integer> numberOfDisks;
        private @Nullable Output<String> raidLevel;
        private Output<Integer> size;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlLayerEbsVolumeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.mountPoint = defaults.mountPoint;
    	      this.numberOfDisks = defaults.numberOfDisks;
    	      this.raidLevel = defaults.raidLevel;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = Output.ofNullable(encrypted);
            return this;
        }

        public Builder iops(@Nullable Output<Integer> iops) {
            this.iops = iops;
            return this;
        }

        public Builder iops(@Nullable Integer iops) {
            this.iops = Output.ofNullable(iops);
            return this;
        }

        public Builder mountPoint(Output<String> mountPoint) {
            this.mountPoint = Objects.requireNonNull(mountPoint);
            return this;
        }

        public Builder mountPoint(String mountPoint) {
            this.mountPoint = Output.of(Objects.requireNonNull(mountPoint));
            return this;
        }

        public Builder numberOfDisks(Output<Integer> numberOfDisks) {
            this.numberOfDisks = Objects.requireNonNull(numberOfDisks);
            return this;
        }

        public Builder numberOfDisks(Integer numberOfDisks) {
            this.numberOfDisks = Output.of(Objects.requireNonNull(numberOfDisks));
            return this;
        }

        public Builder raidLevel(@Nullable Output<String> raidLevel) {
            this.raidLevel = raidLevel;
            return this;
        }

        public Builder raidLevel(@Nullable String raidLevel) {
            this.raidLevel = Output.ofNullable(raidLevel);
            return this;
        }

        public Builder size(Output<Integer> size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder size(Integer size) {
            this.size = Output.of(Objects.requireNonNull(size));
            return this;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public MysqlLayerEbsVolumeGetArgs build() {
            return new MysqlLayerEbsVolumeGetArgs(encrypted, iops, mountPoint, numberOfDisks, raidLevel, size, type);
        }
    }
}
