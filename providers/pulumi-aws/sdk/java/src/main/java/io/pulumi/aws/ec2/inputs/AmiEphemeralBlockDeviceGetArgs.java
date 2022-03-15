// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AmiEphemeralBlockDeviceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AmiEphemeralBlockDeviceGetArgs Empty = new AmiEphemeralBlockDeviceGetArgs();

    /**
     * The path at which the device is exposed to created instances.
     * 
     */
    @Import(name="deviceName", required=true)
      private final Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * A name for the ephemeral device, of the form "ephemeralN" where
     * *N* is a volume number starting from zero.
     * 
     */
    @Import(name="virtualName", required=true)
      private final Output<String> virtualName;

    public Output<String> getVirtualName() {
        return this.virtualName;
    }

    public AmiEphemeralBlockDeviceGetArgs(
        Output<String> deviceName,
        Output<String> virtualName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.virtualName = Objects.requireNonNull(virtualName, "expected parameter 'virtualName' to be non-null");
    }

    private AmiEphemeralBlockDeviceGetArgs() {
        this.deviceName = Output.empty();
        this.virtualName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmiEphemeralBlockDeviceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> deviceName;
        private Output<String> virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(AmiEphemeralBlockDeviceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(Output<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Output.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder virtualName(Output<String> virtualName) {
            this.virtualName = Objects.requireNonNull(virtualName);
            return this;
        }

        public Builder virtualName(String virtualName) {
            this.virtualName = Output.of(Objects.requireNonNull(virtualName));
            return this;
        }
        public AmiEphemeralBlockDeviceGetArgs build() {
            return new AmiEphemeralBlockDeviceGetArgs(deviceName, virtualName);
        }
    }
}
