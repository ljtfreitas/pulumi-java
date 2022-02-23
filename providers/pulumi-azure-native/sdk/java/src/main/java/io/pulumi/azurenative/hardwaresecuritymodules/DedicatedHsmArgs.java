// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hardwaresecuritymodules;

import io.pulumi.azurenative.hardwaresecuritymodules.inputs.NetworkProfileArgs;
import io.pulumi.azurenative.hardwaresecuritymodules.inputs.SkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DedicatedHsmArgs extends io.pulumi.resources.ResourceArgs {

    public static final DedicatedHsmArgs Empty = new DedicatedHsmArgs();

    /**
     * The supported Azure location where the dedicated HSM should be created.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Name of the dedicated Hsm
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specifies the network interfaces of the dedicated hsm.
     * 
     */
    @InputImport(name="networkProfile")
        private final @Nullable Input<NetworkProfileArgs> networkProfile;

    public Input<NetworkProfileArgs> getNetworkProfile() {
        return this.networkProfile == null ? Input.empty() : this.networkProfile;
    }

    /**
     * The name of the Resource Group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * SKU details
     * 
     */
    @InputImport(name="sku", required=true)
        private final Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku;
    }

    /**
     * This field will be used when RP does not support Availability zones.
     * 
     */
    @InputImport(name="stampId")
        private final @Nullable Input<String> stampId;

    public Input<String> getStampId() {
        return this.stampId == null ? Input.empty() : this.stampId;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The Dedicated Hsm zones.
     * 
     */
    @InputImport(name="zones")
        private final @Nullable Input<List<String>> zones;

    public Input<List<String>> getZones() {
        return this.zones == null ? Input.empty() : this.zones;
    }

    public DedicatedHsmArgs(
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<NetworkProfileArgs> networkProfile,
        Input<String> resourceGroupName,
        Input<SkuArgs> sku,
        @Nullable Input<String> stampId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<String>> zones) {
        this.location = location;
        this.name = name;
        this.networkProfile = networkProfile;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.stampId = stampId;
        this.tags = tags;
        this.zones = zones;
    }

    private DedicatedHsmArgs() {
        this.location = Input.empty();
        this.name = Input.empty();
        this.networkProfile = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.stampId = Input.empty();
        this.tags = Input.empty();
        this.zones = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DedicatedHsmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<NetworkProfileArgs> networkProfile;
        private Input<String> resourceGroupName;
        private Input<SkuArgs> sku;
        private @Nullable Input<String> stampId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(DedicatedHsmArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkProfile = defaults.networkProfile;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.stampId = defaults.stampId;
    	      this.tags = defaults.tags;
    	      this.zones = defaults.zones;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setNetworkProfile(@Nullable Input<NetworkProfileArgs> networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder setNetworkProfile(@Nullable NetworkProfileArgs networkProfile) {
            this.networkProfile = Input.ofNullable(networkProfile);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSku(Input<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSku(SkuArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
            return this;
        }

        public Builder setStampId(@Nullable Input<String> stampId) {
            this.stampId = stampId;
            return this;
        }

        public Builder setStampId(@Nullable String stampId) {
            this.stampId = Input.ofNullable(stampId);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setZones(@Nullable Input<List<String>> zones) {
            this.zones = zones;
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = Input.ofNullable(zones);
            return this;
        }
        public DedicatedHsmArgs build() {
            return new DedicatedHsmArgs(location, name, networkProfile, resourceGroupName, sku, stampId, tags, zones);
        }
    }
}
