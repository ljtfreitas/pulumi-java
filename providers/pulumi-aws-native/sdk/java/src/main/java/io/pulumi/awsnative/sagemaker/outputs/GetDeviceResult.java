// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.Device;
import io.pulumi.awsnative.sagemaker.outputs.DeviceTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDeviceResult {
    /**
     * The Edge Device you want to register against a device fleet
     * 
     */
    private final @Nullable Device device;
    /**
     * Associate tags with the resource
     * 
     */
    private final @Nullable List<DeviceTag> tags;

    @OutputCustomType.Constructor({"device","tags"})
    private GetDeviceResult(
        @Nullable Device device,
        @Nullable List<DeviceTag> tags) {
        this.device = device;
        this.tags = tags;
    }

    /**
     * The Edge Device you want to register against a device fleet
     * 
     */
    public Optional<Device> getDevice() {
        return Optional.ofNullable(this.device);
    }
    /**
     * Associate tags with the resource
     * 
     */
    public List<DeviceTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Device device;
        private @Nullable List<DeviceTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeviceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.device = defaults.device;
    	      this.tags = defaults.tags;
        }

        public Builder setDevice(@Nullable Device device) {
            this.device = device;
            return this;
        }

        public Builder setTags(@Nullable List<DeviceTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetDeviceResult build() {
            return new GetDeviceResult(device, tags);
        }
    }
}
