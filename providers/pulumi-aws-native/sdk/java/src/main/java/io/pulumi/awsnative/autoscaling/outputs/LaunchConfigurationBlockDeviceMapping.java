// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.autoscaling.outputs;

import io.pulumi.awsnative.autoscaling.outputs.LaunchConfigurationBlockDevice;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LaunchConfigurationBlockDeviceMapping {
    /**
     * The device name exposed to the EC2 instance (for example, /dev/sdh or xvdh).
     * 
     */
    private final String deviceName;
    /**
     * Parameters used to automatically set up EBS volumes when an instance is launched.
     * 
     */
    private final @Nullable LaunchConfigurationBlockDevice ebs;
    /**
     * Setting this value to true suppresses the specified device included in the block device mapping of the AMI.
     * 
     */
    private final @Nullable Boolean noDevice;
    /**
     * The name of the virtual device.
     * 
     */
    private final @Nullable String virtualName;

    @OutputCustomType.Constructor({"deviceName","ebs","noDevice","virtualName"})
    private LaunchConfigurationBlockDeviceMapping(
        String deviceName,
        @Nullable LaunchConfigurationBlockDevice ebs,
        @Nullable Boolean noDevice,
        @Nullable String virtualName) {
        this.deviceName = Objects.requireNonNull(deviceName);
        this.ebs = ebs;
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    /**
     * The device name exposed to the EC2 instance (for example, /dev/sdh or xvdh).
     * 
     */
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Parameters used to automatically set up EBS volumes when an instance is launched.
     * 
     */
    public Optional<LaunchConfigurationBlockDevice> getEbs() {
        return Optional.ofNullable(this.ebs);
    }
    /**
     * Setting this value to true suppresses the specified device included in the block device mapping of the AMI.
     * 
     */
    public Optional<Boolean> getNoDevice() {
        return Optional.ofNullable(this.noDevice);
    }
    /**
     * The name of the virtual device.
     * 
     */
    public Optional<String> getVirtualName() {
        return Optional.ofNullable(this.virtualName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchConfigurationBlockDeviceMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private @Nullable LaunchConfigurationBlockDevice ebs;
        private @Nullable Boolean noDevice;
        private @Nullable String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchConfigurationBlockDeviceMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setEbs(@Nullable LaunchConfigurationBlockDevice ebs) {
            this.ebs = ebs;
            return this;
        }

        public Builder setNoDevice(@Nullable Boolean noDevice) {
            this.noDevice = noDevice;
            return this;
        }

        public Builder setVirtualName(@Nullable String virtualName) {
            this.virtualName = virtualName;
            return this;
        }
        public LaunchConfigurationBlockDeviceMapping build() {
            return new LaunchConfigurationBlockDeviceMapping(deviceName, ebs, noDevice, virtualName);
        }
    }
}
