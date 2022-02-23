// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless;

import io.pulumi.awsnative.iotwireless.inputs.DeviceProfileLoRaWANDeviceProfileArgs;
import io.pulumi.awsnative.iotwireless.inputs.DeviceProfileTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceProfileArgs Empty = new DeviceProfileArgs();

    /**
     * LoRaWANDeviceProfile supports all LoRa specific attributes for service profile for CreateDeviceProfile operation
     * 
     */
    @InputImport(name="loRaWAN")
        private final @Nullable Input<DeviceProfileLoRaWANDeviceProfileArgs> loRaWAN;

    public Input<DeviceProfileLoRaWANDeviceProfileArgs> getLoRaWAN() {
        return this.loRaWAN == null ? Input.empty() : this.loRaWAN;
    }

    /**
     * Name of service profile
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of key-value pairs that contain metadata for the device profile.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<List<DeviceProfileTagArgs>> tags;

    public Input<List<DeviceProfileTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DeviceProfileArgs(
        @Nullable Input<DeviceProfileLoRaWANDeviceProfileArgs> loRaWAN,
        @Nullable Input<String> name,
        @Nullable Input<List<DeviceProfileTagArgs>> tags) {
        this.loRaWAN = loRaWAN;
        this.name = name;
        this.tags = tags;
    }

    private DeviceProfileArgs() {
        this.loRaWAN = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DeviceProfileLoRaWANDeviceProfileArgs> loRaWAN;
        private @Nullable Input<String> name;
        private @Nullable Input<List<DeviceProfileTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loRaWAN = defaults.loRaWAN;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setLoRaWAN(@Nullable Input<DeviceProfileLoRaWANDeviceProfileArgs> loRaWAN) {
            this.loRaWAN = loRaWAN;
            return this;
        }

        public Builder setLoRaWAN(@Nullable DeviceProfileLoRaWANDeviceProfileArgs loRaWAN) {
            this.loRaWAN = Input.ofNullable(loRaWAN);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTags(@Nullable Input<List<DeviceProfileTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<DeviceProfileTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public DeviceProfileArgs build() {
            return new DeviceProfileArgs(loRaWAN, name, tags);
        }
    }
}
