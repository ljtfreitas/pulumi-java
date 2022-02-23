// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager;

import io.pulumi.awsnative.networkmanager.inputs.DeviceLocationArgs;
import io.pulumi.awsnative.networkmanager.inputs.DeviceTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceArgs Empty = new DeviceArgs();

    /**
     * The description of the device.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The ID of the global network.
     * 
     */
    @InputImport(name="globalNetworkId", required=true)
        private final Input<String> globalNetworkId;

    public Input<String> getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * The site location.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<DeviceLocationArgs> location;

    public Input<DeviceLocationArgs> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The device model
     * 
     */
    @InputImport(name="model")
        private final @Nullable Input<String> model;

    public Input<String> getModel() {
        return this.model == null ? Input.empty() : this.model;
    }

    /**
     * The device serial number.
     * 
     */
    @InputImport(name="serialNumber")
        private final @Nullable Input<String> serialNumber;

    public Input<String> getSerialNumber() {
        return this.serialNumber == null ? Input.empty() : this.serialNumber;
    }

    /**
     * The site ID.
     * 
     */
    @InputImport(name="siteId")
        private final @Nullable Input<String> siteId;

    public Input<String> getSiteId() {
        return this.siteId == null ? Input.empty() : this.siteId;
    }

    /**
     * The tags for the device.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<List<DeviceTagArgs>> tags;

    public Input<List<DeviceTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The device type.
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * The device vendor.
     * 
     */
    @InputImport(name="vendor")
        private final @Nullable Input<String> vendor;

    public Input<String> getVendor() {
        return this.vendor == null ? Input.empty() : this.vendor;
    }

    public DeviceArgs(
        @Nullable Input<String> description,
        Input<String> globalNetworkId,
        @Nullable Input<DeviceLocationArgs> location,
        @Nullable Input<String> model,
        @Nullable Input<String> serialNumber,
        @Nullable Input<String> siteId,
        @Nullable Input<List<DeviceTagArgs>> tags,
        @Nullable Input<String> type,
        @Nullable Input<String> vendor) {
        this.description = description;
        this.globalNetworkId = Objects.requireNonNull(globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
        this.location = location;
        this.model = model;
        this.serialNumber = serialNumber;
        this.siteId = siteId;
        this.tags = tags;
        this.type = type;
        this.vendor = vendor;
    }

    private DeviceArgs() {
        this.description = Input.empty();
        this.globalNetworkId = Input.empty();
        this.location = Input.empty();
        this.model = Input.empty();
        this.serialNumber = Input.empty();
        this.siteId = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
        this.vendor = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> globalNetworkId;
        private @Nullable Input<DeviceLocationArgs> location;
        private @Nullable Input<String> model;
        private @Nullable Input<String> serialNumber;
        private @Nullable Input<String> siteId;
        private @Nullable Input<List<DeviceTagArgs>> tags;
        private @Nullable Input<String> type;
        private @Nullable Input<String> vendor;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.globalNetworkId = defaults.globalNetworkId;
    	      this.location = defaults.location;
    	      this.model = defaults.model;
    	      this.serialNumber = defaults.serialNumber;
    	      this.siteId = defaults.siteId;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.vendor = defaults.vendor;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setGlobalNetworkId(Input<String> globalNetworkId) {
            this.globalNetworkId = Objects.requireNonNull(globalNetworkId);
            return this;
        }

        public Builder setGlobalNetworkId(String globalNetworkId) {
            this.globalNetworkId = Input.of(Objects.requireNonNull(globalNetworkId));
            return this;
        }

        public Builder setLocation(@Nullable Input<DeviceLocationArgs> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable DeviceLocationArgs location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setModel(@Nullable Input<String> model) {
            this.model = model;
            return this;
        }

        public Builder setModel(@Nullable String model) {
            this.model = Input.ofNullable(model);
            return this;
        }

        public Builder setSerialNumber(@Nullable Input<String> serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public Builder setSerialNumber(@Nullable String serialNumber) {
            this.serialNumber = Input.ofNullable(serialNumber);
            return this;
        }

        public Builder setSiteId(@Nullable Input<String> siteId) {
            this.siteId = siteId;
            return this;
        }

        public Builder setSiteId(@Nullable String siteId) {
            this.siteId = Input.ofNullable(siteId);
            return this;
        }

        public Builder setTags(@Nullable Input<List<DeviceTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<DeviceTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setVendor(@Nullable Input<String> vendor) {
            this.vendor = vendor;
            return this;
        }

        public Builder setVendor(@Nullable String vendor) {
            this.vendor = Input.ofNullable(vendor);
            return this;
        }
        public DeviceArgs build() {
            return new DeviceArgs(description, globalNetworkId, location, model, serialNumber, siteId, tags, type, vendor);
        }
    }
}
