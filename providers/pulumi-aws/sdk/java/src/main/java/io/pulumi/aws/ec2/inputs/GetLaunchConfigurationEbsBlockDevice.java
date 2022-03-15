// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetLaunchConfigurationEbsBlockDevice extends io.pulumi.resources.InvokeArgs {

    public static final GetLaunchConfigurationEbsBlockDevice Empty = new GetLaunchConfigurationEbsBlockDevice();

    /**
     * Whether the EBS Volume will be deleted on instance termination.
     * 
     */
    @Import(name="deleteOnTermination", required=true)
      private final Boolean deleteOnTermination;

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * The Name of the device.
     * 
     */
    @Import(name="deviceName", required=true)
      private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * Whether the volume is Encrypted.
     * 
     */
    @Import(name="encrypted", required=true)
      private final Boolean encrypted;

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * The provisioned IOPs of the volume.
     * 
     */
    @Import(name="iops", required=true)
      private final Integer iops;

    public Integer getIops() {
        return this.iops;
    }

    /**
     * Whether the device in the block device mapping of the AMI is suppressed.
     * 
     */
    @Import(name="noDevice", required=true)
      private final Boolean noDevice;

    public Boolean getNoDevice() {
        return this.noDevice;
    }

    /**
     * The Snapshot ID of the mount.
     * 
     */
    @Import(name="snapshotId", required=true)
      private final String snapshotId;

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * The Throughput of the volume.
     * 
     */
    @Import(name="throughput", required=true)
      private final Boolean throughput;

    public Boolean getThroughput() {
        return this.throughput;
    }

    /**
     * The Size of the volume.
     * 
     */
    @Import(name="volumeSize", required=true)
      private final Integer volumeSize;

    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * The Type of the volume.
     * 
     */
    @Import(name="volumeType", required=true)
      private final String volumeType;

    public String getVolumeType() {
        return this.volumeType;
    }

    public GetLaunchConfigurationEbsBlockDevice(
        Boolean deleteOnTermination,
        String deviceName,
        Boolean encrypted,
        Integer iops,
        Boolean noDevice,
        String snapshotId,
        Boolean throughput,
        Integer volumeSize,
        String volumeType) {
        this.deleteOnTermination = Objects.requireNonNull(deleteOnTermination, "expected parameter 'deleteOnTermination' to be non-null");
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.encrypted = Objects.requireNonNull(encrypted, "expected parameter 'encrypted' to be non-null");
        this.iops = Objects.requireNonNull(iops, "expected parameter 'iops' to be non-null");
        this.noDevice = Objects.requireNonNull(noDevice, "expected parameter 'noDevice' to be non-null");
        this.snapshotId = Objects.requireNonNull(snapshotId, "expected parameter 'snapshotId' to be non-null");
        this.throughput = Objects.requireNonNull(throughput, "expected parameter 'throughput' to be non-null");
        this.volumeSize = Objects.requireNonNull(volumeSize, "expected parameter 'volumeSize' to be non-null");
        this.volumeType = Objects.requireNonNull(volumeType, "expected parameter 'volumeType' to be non-null");
    }

    private GetLaunchConfigurationEbsBlockDevice() {
        this.deleteOnTermination = null;
        this.deviceName = null;
        this.encrypted = null;
        this.iops = null;
        this.noDevice = null;
        this.snapshotId = null;
        this.throughput = null;
        this.volumeSize = null;
        this.volumeType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchConfigurationEbsBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean deleteOnTermination;
        private String deviceName;
        private Boolean encrypted;
        private Integer iops;
        private Boolean noDevice;
        private String snapshotId;
        private Boolean throughput;
        private Integer volumeSize;
        private String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchConfigurationEbsBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceName = defaults.deviceName;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.noDevice = defaults.noDevice;
    	      this.snapshotId = defaults.snapshotId;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder deleteOnTermination(Boolean deleteOnTermination) {
            this.deleteOnTermination = Objects.requireNonNull(deleteOnTermination);
            return this;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder encrypted(Boolean encrypted) {
            this.encrypted = Objects.requireNonNull(encrypted);
            return this;
        }

        public Builder iops(Integer iops) {
            this.iops = Objects.requireNonNull(iops);
            return this;
        }

        public Builder noDevice(Boolean noDevice) {
            this.noDevice = Objects.requireNonNull(noDevice);
            return this;
        }

        public Builder snapshotId(String snapshotId) {
            this.snapshotId = Objects.requireNonNull(snapshotId);
            return this;
        }

        public Builder throughput(Boolean throughput) {
            this.throughput = Objects.requireNonNull(throughput);
            return this;
        }

        public Builder volumeSize(Integer volumeSize) {
            this.volumeSize = Objects.requireNonNull(volumeSize);
            return this;
        }

        public Builder volumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }
        public GetLaunchConfigurationEbsBlockDevice build() {
            return new GetLaunchConfigurationEbsBlockDevice(deleteOnTermination, deviceName, encrypted, iops, noDevice, snapshotId, throughput, volumeSize, volumeType);
        }
    }
}
