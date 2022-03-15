// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLaunchConfigurationEphemeralBlockDevice {
    /**
     * The Name of the device.
     * 
     */
    private final String deviceName;
    /**
     * The Virtual Name of the device.
     * 
     */
    private final String virtualName;

    @CustomType.Constructor
    private GetLaunchConfigurationEphemeralBlockDevice(
        @CustomType.Parameter("deviceName") String deviceName,
        @CustomType.Parameter("virtualName") String virtualName) {
        this.deviceName = deviceName;
        this.virtualName = virtualName;
    }

    /**
     * The Name of the device.
     * 
    */
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * The Virtual Name of the device.
     * 
    */
    public String getVirtualName() {
        return this.virtualName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchConfigurationEphemeralBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchConfigurationEphemeralBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder virtualName(String virtualName) {
            this.virtualName = Objects.requireNonNull(virtualName);
            return this;
        }
        public GetLaunchConfigurationEphemeralBlockDevice build() {
            return new GetLaunchConfigurationEphemeralBlockDevice(deviceName, virtualName);
        }
    }
}
