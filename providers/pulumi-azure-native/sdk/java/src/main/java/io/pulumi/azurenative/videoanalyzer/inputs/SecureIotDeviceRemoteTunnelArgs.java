// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A remote tunnel securely established using IoT Hub device information.
 * 
 */
public final class SecureIotDeviceRemoteTunnelArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecureIotDeviceRemoteTunnelArgs Empty = new SecureIotDeviceRemoteTunnelArgs();

    /**
     * The IoT device id to use when establishing the remote tunnel. This string is case-sensitive.
     * 
     */
    @InputImport(name="deviceId", required=true)
    private final Input<String> deviceId;

    public Input<String> getDeviceId() {
        return this.deviceId;
    }

    /**
     * Name of the IoT Hub.
     * 
     */
    @InputImport(name="iotHubName", required=true)
    private final Input<String> iotHubName;

    public Input<String> getIotHubName() {
        return this.iotHubName;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.SecureIotDeviceRemoteTunnel'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public SecureIotDeviceRemoteTunnelArgs(
        Input<String> deviceId,
        Input<String> iotHubName,
        Input<String> type) {
        this.deviceId = Objects.requireNonNull(deviceId, "expected parameter 'deviceId' to be non-null");
        this.iotHubName = Objects.requireNonNull(iotHubName, "expected parameter 'iotHubName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SecureIotDeviceRemoteTunnelArgs() {
        this.deviceId = Input.empty();
        this.iotHubName = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecureIotDeviceRemoteTunnelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> deviceId;
        private Input<String> iotHubName;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecureIotDeviceRemoteTunnelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceId = defaults.deviceId;
    	      this.iotHubName = defaults.iotHubName;
    	      this.type = defaults.type;
        }

        public Builder setDeviceId(Input<String> deviceId) {
            this.deviceId = Objects.requireNonNull(deviceId);
            return this;
        }

        public Builder setDeviceId(String deviceId) {
            this.deviceId = Input.of(Objects.requireNonNull(deviceId));
            return this;
        }

        public Builder setIotHubName(Input<String> iotHubName) {
            this.iotHubName = Objects.requireNonNull(iotHubName);
            return this;
        }

        public Builder setIotHubName(String iotHubName) {
            this.iotHubName = Input.of(Objects.requireNonNull(iotHubName));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public SecureIotDeviceRemoteTunnelArgs build() {
            return new SecureIotDeviceRemoteTunnelArgs(deviceId, iotHubName, type);
        }
    }
}
