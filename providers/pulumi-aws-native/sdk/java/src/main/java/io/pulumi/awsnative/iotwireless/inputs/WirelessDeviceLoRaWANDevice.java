// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.awsnative.iotwireless.inputs.WirelessDeviceAbpV10x;
import io.pulumi.awsnative.iotwireless.inputs.WirelessDeviceAbpV11;
import io.pulumi.awsnative.iotwireless.inputs.WirelessDeviceOtaaV10x;
import io.pulumi.awsnative.iotwireless.inputs.WirelessDeviceOtaaV11;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WirelessDeviceLoRaWANDevice extends io.pulumi.resources.InvokeArgs {

    public static final WirelessDeviceLoRaWANDevice Empty = new WirelessDeviceLoRaWANDevice();

    @Import(name="abpV10x")
      private final @Nullable WirelessDeviceAbpV10x abpV10x;

    public Optional<WirelessDeviceAbpV10x> getAbpV10x() {
        return this.abpV10x == null ? Optional.empty() : Optional.ofNullable(this.abpV10x);
    }

    @Import(name="abpV11")
      private final @Nullable WirelessDeviceAbpV11 abpV11;

    public Optional<WirelessDeviceAbpV11> getAbpV11() {
        return this.abpV11 == null ? Optional.empty() : Optional.ofNullable(this.abpV11);
    }

    @Import(name="devEui")
      private final @Nullable String devEui;

    public Optional<String> getDevEui() {
        return this.devEui == null ? Optional.empty() : Optional.ofNullable(this.devEui);
    }

    @Import(name="deviceProfileId")
      private final @Nullable String deviceProfileId;

    public Optional<String> getDeviceProfileId() {
        return this.deviceProfileId == null ? Optional.empty() : Optional.ofNullable(this.deviceProfileId);
    }

    @Import(name="otaaV10x")
      private final @Nullable WirelessDeviceOtaaV10x otaaV10x;

    public Optional<WirelessDeviceOtaaV10x> getOtaaV10x() {
        return this.otaaV10x == null ? Optional.empty() : Optional.ofNullable(this.otaaV10x);
    }

    @Import(name="otaaV11")
      private final @Nullable WirelessDeviceOtaaV11 otaaV11;

    public Optional<WirelessDeviceOtaaV11> getOtaaV11() {
        return this.otaaV11 == null ? Optional.empty() : Optional.ofNullable(this.otaaV11);
    }

    @Import(name="serviceProfileId")
      private final @Nullable String serviceProfileId;

    public Optional<String> getServiceProfileId() {
        return this.serviceProfileId == null ? Optional.empty() : Optional.ofNullable(this.serviceProfileId);
    }

    public WirelessDeviceLoRaWANDevice(
        @Nullable WirelessDeviceAbpV10x abpV10x,
        @Nullable WirelessDeviceAbpV11 abpV11,
        @Nullable String devEui,
        @Nullable String deviceProfileId,
        @Nullable WirelessDeviceOtaaV10x otaaV10x,
        @Nullable WirelessDeviceOtaaV11 otaaV11,
        @Nullable String serviceProfileId) {
        this.abpV10x = abpV10x;
        this.abpV11 = abpV11;
        this.devEui = devEui;
        this.deviceProfileId = deviceProfileId;
        this.otaaV10x = otaaV10x;
        this.otaaV11 = otaaV11;
        this.serviceProfileId = serviceProfileId;
    }

    private WirelessDeviceLoRaWANDevice() {
        this.abpV10x = null;
        this.abpV11 = null;
        this.devEui = null;
        this.deviceProfileId = null;
        this.otaaV10x = null;
        this.otaaV11 = null;
        this.serviceProfileId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessDeviceLoRaWANDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WirelessDeviceAbpV10x abpV10x;
        private @Nullable WirelessDeviceAbpV11 abpV11;
        private @Nullable String devEui;
        private @Nullable String deviceProfileId;
        private @Nullable WirelessDeviceOtaaV10x otaaV10x;
        private @Nullable WirelessDeviceOtaaV11 otaaV11;
        private @Nullable String serviceProfileId;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessDeviceLoRaWANDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abpV10x = defaults.abpV10x;
    	      this.abpV11 = defaults.abpV11;
    	      this.devEui = defaults.devEui;
    	      this.deviceProfileId = defaults.deviceProfileId;
    	      this.otaaV10x = defaults.otaaV10x;
    	      this.otaaV11 = defaults.otaaV11;
    	      this.serviceProfileId = defaults.serviceProfileId;
        }

        public Builder abpV10x(@Nullable WirelessDeviceAbpV10x abpV10x) {
            this.abpV10x = abpV10x;
            return this;
        }

        public Builder abpV11(@Nullable WirelessDeviceAbpV11 abpV11) {
            this.abpV11 = abpV11;
            return this;
        }

        public Builder devEui(@Nullable String devEui) {
            this.devEui = devEui;
            return this;
        }

        public Builder deviceProfileId(@Nullable String deviceProfileId) {
            this.deviceProfileId = deviceProfileId;
            return this;
        }

        public Builder otaaV10x(@Nullable WirelessDeviceOtaaV10x otaaV10x) {
            this.otaaV10x = otaaV10x;
            return this;
        }

        public Builder otaaV11(@Nullable WirelessDeviceOtaaV11 otaaV11) {
            this.otaaV11 = otaaV11;
            return this;
        }

        public Builder serviceProfileId(@Nullable String serviceProfileId) {
            this.serviceProfileId = serviceProfileId;
            return this;
        }
        public WirelessDeviceLoRaWANDevice build() {
            return new WirelessDeviceLoRaWANDevice(abpV10x, abpV11, devEui, deviceProfileId, otaaV10x, otaaV11, serviceProfileId);
        }
    }
}
