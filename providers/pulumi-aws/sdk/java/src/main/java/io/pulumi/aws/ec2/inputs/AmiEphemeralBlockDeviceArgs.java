// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AmiEphemeralBlockDeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AmiEphemeralBlockDeviceArgs Empty = new AmiEphemeralBlockDeviceArgs();

    /**
     * The path at which the device is exposed to created instances.
     * 
     */
    @InputImport(name="deviceName", required=true)
    private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * A name for the ephemeral device, of the form "ephemeralN" where
     * *N* is a volume number starting from zero.
     * 
     */
    @InputImport(name="virtualName", required=true)
    private final Input<String> virtualName;

    public Input<String> getVirtualName() {
        return this.virtualName;
    }

    public AmiEphemeralBlockDeviceArgs(
        Input<String> deviceName,
        Input<String> virtualName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.virtualName = Objects.requireNonNull(virtualName, "expected parameter 'virtualName' to be non-null");
    }

    private AmiEphemeralBlockDeviceArgs() {
        this.deviceName = Input.empty();
        this.virtualName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmiEphemeralBlockDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> deviceName;
        private Input<String> virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(AmiEphemeralBlockDeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder setDeviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder setVirtualName(Input<String> virtualName) {
            this.virtualName = Objects.requireNonNull(virtualName);
            return this;
        }

        public Builder setVirtualName(String virtualName) {
            this.virtualName = Input.of(Objects.requireNonNull(virtualName));
            return this;
        }
        public AmiEphemeralBlockDeviceArgs build() {
            return new AmiEphemeralBlockDeviceArgs(deviceName, virtualName);
        }
    }
}
