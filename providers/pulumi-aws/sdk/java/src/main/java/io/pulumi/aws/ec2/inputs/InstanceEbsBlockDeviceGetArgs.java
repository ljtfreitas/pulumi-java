// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceEbsBlockDeviceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceEbsBlockDeviceGetArgs Empty = new InstanceEbsBlockDeviceGetArgs();

    /**
     * Whether the volume should be destroyed on instance termination. Defaults to `true`.
     * 
     */
    @InputImport(name="deleteOnTermination")
    private final @Nullable Input<Boolean> deleteOnTermination;

    public Input<Boolean> getDeleteOnTermination() {
        return this.deleteOnTermination == null ? Input.empty() : this.deleteOnTermination;
    }

    /**
     * Name of the device to mount.
     * 
     */
    @InputImport(name="deviceName", required=true)
    private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * Enables [EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html) on the volume. Defaults to `false`. Cannot be used with `snapshot_id`. Must be configured to perform drift detection.
     * 
     */
    @InputImport(name="encrypted")
    private final @Nullable Input<Boolean> encrypted;

    public Input<Boolean> getEncrypted() {
        return this.encrypted == null ? Input.empty() : this.encrypted;
    }

    /**
     * Amount of provisioned [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html). Only valid for volume_type of `io1`, `io2` or `gp3`.
     * 
     */
    @InputImport(name="iops")
    private final @Nullable Input<Integer> iops;

    public Input<Integer> getIops() {
        return this.iops == null ? Input.empty() : this.iops;
    }

    /**
     * Amazon Resource Name (ARN) of the KMS Key to use when encrypting the volume. Must be configured to perform drift detection.
     * 
     */
    @InputImport(name="kmsKeyId")
    private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * Snapshot ID to mount.
     * 
     */
    @InputImport(name="snapshotId")
    private final @Nullable Input<String> snapshotId;

    public Input<String> getSnapshotId() {
        return this.snapshotId == null ? Input.empty() : this.snapshotId;
    }

    /**
     * A map of tags to assign to the device.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Throughput to provision for a volume in mebibytes per second (MiB/s). This is only valid for `volume_type` of `gp3`.
     * 
     */
    @InputImport(name="throughput")
    private final @Nullable Input<Integer> throughput;

    public Input<Integer> getThroughput() {
        return this.throughput == null ? Input.empty() : this.throughput;
    }

    /**
     * ID of the volume. For example, the ID can be accessed like this, `aws_instance.web.root_block_device.0.volume_id`.
     * 
     */
    @InputImport(name="volumeId")
    private final @Nullable Input<String> volumeId;

    public Input<String> getVolumeId() {
        return this.volumeId == null ? Input.empty() : this.volumeId;
    }

    /**
     * Size of the volume in gibibytes (GiB).
     * 
     */
    @InputImport(name="volumeSize")
    private final @Nullable Input<Integer> volumeSize;

    public Input<Integer> getVolumeSize() {
        return this.volumeSize == null ? Input.empty() : this.volumeSize;
    }

    /**
     * Type of volume. Valid values include `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1`, or `st1`. Defaults to `gp2`.
     * 
     */
    @InputImport(name="volumeType")
    private final @Nullable Input<String> volumeType;

    public Input<String> getVolumeType() {
        return this.volumeType == null ? Input.empty() : this.volumeType;
    }

    public InstanceEbsBlockDeviceGetArgs(
        @Nullable Input<Boolean> deleteOnTermination,
        Input<String> deviceName,
        @Nullable Input<Boolean> encrypted,
        @Nullable Input<Integer> iops,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<String> snapshotId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Integer> throughput,
        @Nullable Input<String> volumeId,
        @Nullable Input<Integer> volumeSize,
        @Nullable Input<String> volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.encrypted = encrypted;
        this.iops = iops;
        this.kmsKeyId = kmsKeyId;
        this.snapshotId = snapshotId;
        this.tags = tags;
        this.throughput = throughput;
        this.volumeId = volumeId;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    private InstanceEbsBlockDeviceGetArgs() {
        this.deleteOnTermination = Input.empty();
        this.deviceName = Input.empty();
        this.encrypted = Input.empty();
        this.iops = Input.empty();
        this.kmsKeyId = Input.empty();
        this.snapshotId = Input.empty();
        this.tags = Input.empty();
        this.throughput = Input.empty();
        this.volumeId = Input.empty();
        this.volumeSize = Input.empty();
        this.volumeType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceEbsBlockDeviceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> deleteOnTermination;
        private Input<String> deviceName;
        private @Nullable Input<Boolean> encrypted;
        private @Nullable Input<Integer> iops;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<String> snapshotId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Integer> throughput;
        private @Nullable Input<String> volumeId;
        private @Nullable Input<Integer> volumeSize;
        private @Nullable Input<String> volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceEbsBlockDeviceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceName = defaults.deviceName;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.snapshotId = defaults.snapshotId;
    	      this.tags = defaults.tags;
    	      this.throughput = defaults.throughput;
    	      this.volumeId = defaults.volumeId;
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

        public Builder setDeviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
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

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder setSnapshotId(@Nullable Input<String> snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        public Builder setSnapshotId(@Nullable String snapshotId) {
            this.snapshotId = Input.ofNullable(snapshotId);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
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

        public Builder setVolumeId(@Nullable Input<String> volumeId) {
            this.volumeId = volumeId;
            return this;
        }

        public Builder setVolumeId(@Nullable String volumeId) {
            this.volumeId = Input.ofNullable(volumeId);
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
        public InstanceEbsBlockDeviceGetArgs build() {
            return new InstanceEbsBlockDeviceGetArgs(deleteOnTermination, deviceName, encrypted, iops, kmsKeyId, snapshotId, tags, throughput, volumeId, volumeSize, volumeType);
        }
    }
}
