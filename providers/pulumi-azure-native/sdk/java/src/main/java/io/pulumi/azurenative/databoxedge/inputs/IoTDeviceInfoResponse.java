// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.AuthenticationResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Metadata of IoT device/IoT Edge device to be configured.
 * 
 */
public final class IoTDeviceInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final IoTDeviceInfoResponse Empty = new IoTDeviceInfoResponse();

    /**
     * Encrypted IoT device/IoT edge device connection string.
     * 
     */
    @InputImport(name="authentication")
        private final @Nullable AuthenticationResponse authentication;

    public Optional<AuthenticationResponse> getAuthentication() {
        return this.authentication == null ? Optional.empty() : Optional.ofNullable(this.authentication);
    }

    /**
     * ID of the IoT device/edge device.
     * 
     */
    @InputImport(name="deviceId", required=true)
        private final String deviceId;

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * Host name for the IoT hub associated to the device.
     * 
     */
    @InputImport(name="ioTHostHub", required=true)
        private final String ioTHostHub;

    public String getIoTHostHub() {
        return this.ioTHostHub;
    }

    /**
     * Id for the IoT hub associated to the device.
     * 
     */
    @InputImport(name="ioTHostHubId")
        private final @Nullable String ioTHostHubId;

    public Optional<String> getIoTHostHubId() {
        return this.ioTHostHubId == null ? Optional.empty() : Optional.ofNullable(this.ioTHostHubId);
    }

    public IoTDeviceInfoResponse(
        @Nullable AuthenticationResponse authentication,
        String deviceId,
        String ioTHostHub,
        @Nullable String ioTHostHubId) {
        this.authentication = authentication;
        this.deviceId = Objects.requireNonNull(deviceId, "expected parameter 'deviceId' to be non-null");
        this.ioTHostHub = Objects.requireNonNull(ioTHostHub, "expected parameter 'ioTHostHub' to be non-null");
        this.ioTHostHubId = ioTHostHubId;
    }

    private IoTDeviceInfoResponse() {
        this.authentication = null;
        this.deviceId = null;
        this.ioTHostHub = null;
        this.ioTHostHubId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IoTDeviceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AuthenticationResponse authentication;
        private String deviceId;
        private String ioTHostHub;
        private @Nullable String ioTHostHubId;

        public Builder() {
    	      // Empty
        }

        public Builder(IoTDeviceInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.deviceId = defaults.deviceId;
    	      this.ioTHostHub = defaults.ioTHostHub;
    	      this.ioTHostHubId = defaults.ioTHostHubId;
        }

        public Builder setAuthentication(@Nullable AuthenticationResponse authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder setDeviceId(String deviceId) {
            this.deviceId = Objects.requireNonNull(deviceId);
            return this;
        }

        public Builder setIoTHostHub(String ioTHostHub) {
            this.ioTHostHub = Objects.requireNonNull(ioTHostHub);
            return this;
        }

        public Builder setIoTHostHubId(@Nullable String ioTHostHubId) {
            this.ioTHostHubId = ioTHostHubId;
            return this;
        }
        public IoTDeviceInfoResponse build() {
            return new IoTDeviceInfoResponse(authentication, deviceId, ioTHostHub, ioTHostHubId);
        }
    }
}
