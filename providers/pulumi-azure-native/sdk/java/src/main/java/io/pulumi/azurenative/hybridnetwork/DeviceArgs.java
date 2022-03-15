// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork;

import io.pulumi.azurenative.hybridnetwork.enums.DeviceType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceArgs Empty = new DeviceArgs();

    /**
     * Resource name for the device resource.
     * 
     */
    @Import(name="deviceName")
      private final @Nullable Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName == null ? Output.empty() : this.deviceName;
    }

    /**
     * The type of the device.
     * 
     */
    @Import(name="deviceType", required=true)
      private final Output<Either<String,DeviceType>> deviceType;

    public Output<Either<String,DeviceType>> getDeviceType() {
        return this.deviceType;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public DeviceArgs(
        @Nullable Output<String> deviceName,
        Output<Either<String,DeviceType>> deviceType,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.deviceName = deviceName;
        this.deviceType = Objects.requireNonNull(deviceType, "expected parameter 'deviceType' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private DeviceArgs() {
        this.deviceName = Output.empty();
        this.deviceType = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deviceName;
        private Output<Either<String,DeviceType>> deviceType;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.deviceType = defaults.deviceType;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder deviceName(@Nullable Output<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = Output.ofNullable(deviceName);
            return this;
        }

        public Builder deviceType(Output<Either<String,DeviceType>> deviceType) {
            this.deviceType = Objects.requireNonNull(deviceType);
            return this;
        }

        public Builder deviceType(Either<String,DeviceType> deviceType) {
            this.deviceType = Output.of(Objects.requireNonNull(deviceType));
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public DeviceArgs build() {
            return new DeviceArgs(deviceName, deviceType, location, resourceGroupName, tags);
        }
    }
}
