// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.LaunchTemplateBlockDeviceMappingEbsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LaunchTemplateBlockDeviceMappingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchTemplateBlockDeviceMappingGetArgs Empty = new LaunchTemplateBlockDeviceMappingGetArgs();

    /**
     * The name of the device to mount.
     * 
     */
    @InputImport(name="deviceName")
    private final @Nullable Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName == null ? Input.empty() : this.deviceName;
    }

    /**
     * Configure EBS volume properties.
     * 
     */
    @InputImport(name="ebs")
    private final @Nullable Input<LaunchTemplateBlockDeviceMappingEbsGetArgs> ebs;

    public Input<LaunchTemplateBlockDeviceMappingEbsGetArgs> getEbs() {
        return this.ebs == null ? Input.empty() : this.ebs;
    }

    /**
     * Suppresses the specified device included in the AMI's block device mapping.
     * 
     */
    @InputImport(name="noDevice")
    private final @Nullable Input<String> noDevice;

    public Input<String> getNoDevice() {
        return this.noDevice == null ? Input.empty() : this.noDevice;
    }

    /**
     * The [Instance Store Device
     * Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
     * (e.g., `"ephemeral0"`).
     * 
     */
    @InputImport(name="virtualName")
    private final @Nullable Input<String> virtualName;

    public Input<String> getVirtualName() {
        return this.virtualName == null ? Input.empty() : this.virtualName;
    }

    public LaunchTemplateBlockDeviceMappingGetArgs(
        @Nullable Input<String> deviceName,
        @Nullable Input<LaunchTemplateBlockDeviceMappingEbsGetArgs> ebs,
        @Nullable Input<String> noDevice,
        @Nullable Input<String> virtualName) {
        this.deviceName = deviceName;
        this.ebs = ebs;
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    private LaunchTemplateBlockDeviceMappingGetArgs() {
        this.deviceName = Input.empty();
        this.ebs = Input.empty();
        this.noDevice = Input.empty();
        this.virtualName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateBlockDeviceMappingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deviceName;
        private @Nullable Input<LaunchTemplateBlockDeviceMappingEbsGetArgs> ebs;
        private @Nullable Input<String> noDevice;
        private @Nullable Input<String> virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateBlockDeviceMappingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder setDeviceName(@Nullable Input<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = Input.ofNullable(deviceName);
            return this;
        }

        public Builder setEbs(@Nullable Input<LaunchTemplateBlockDeviceMappingEbsGetArgs> ebs) {
            this.ebs = ebs;
            return this;
        }

        public Builder setEbs(@Nullable LaunchTemplateBlockDeviceMappingEbsGetArgs ebs) {
            this.ebs = Input.ofNullable(ebs);
            return this;
        }

        public Builder setNoDevice(@Nullable Input<String> noDevice) {
            this.noDevice = noDevice;
            return this;
        }

        public Builder setNoDevice(@Nullable String noDevice) {
            this.noDevice = Input.ofNullable(noDevice);
            return this;
        }

        public Builder setVirtualName(@Nullable Input<String> virtualName) {
            this.virtualName = virtualName;
            return this;
        }

        public Builder setVirtualName(@Nullable String virtualName) {
            this.virtualName = Input.ofNullable(virtualName);
            return this;
        }
        public LaunchTemplateBlockDeviceMappingGetArgs build() {
            return new LaunchTemplateBlockDeviceMappingGetArgs(deviceName, ebs, noDevice, virtualName);
        }
    }
}
