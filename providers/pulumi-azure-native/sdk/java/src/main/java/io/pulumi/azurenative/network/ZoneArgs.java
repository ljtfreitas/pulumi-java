// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.ZoneType;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ZoneArgs extends io.pulumi.resources.ResourceArgs {

    public static final ZoneArgs Empty = new ZoneArgs();

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * A list of references to virtual networks that register hostnames in this DNS zone. This is a only when ZoneType is Private.
     * 
     */
    @Import(name="registrationVirtualNetworks")
      private final @Nullable Output<List<SubResourceArgs>> registrationVirtualNetworks;

    public Output<List<SubResourceArgs>> getRegistrationVirtualNetworks() {
        return this.registrationVirtualNetworks == null ? Output.empty() : this.registrationVirtualNetworks;
    }

    /**
     * A list of references to virtual networks that resolve records in this DNS zone. This is a only when ZoneType is Private.
     * 
     */
    @Import(name="resolutionVirtualNetworks")
      private final @Nullable Output<List<SubResourceArgs>> resolutionVirtualNetworks;

    public Output<List<SubResourceArgs>> getResolutionVirtualNetworks() {
        return this.resolutionVirtualNetworks == null ? Output.empty() : this.resolutionVirtualNetworks;
    }

    /**
     * The name of the resource group.
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

    /**
     * The name of the DNS zone (without a terminating dot).
     * 
     */
    @Import(name="zoneName")
      private final @Nullable Output<String> zoneName;

    public Output<String> getZoneName() {
        return this.zoneName == null ? Output.empty() : this.zoneName;
    }

    /**
     * The type of this DNS zone (Public or Private).
     * 
     */
    @Import(name="zoneType")
      private final @Nullable Output<ZoneType> zoneType;

    public Output<ZoneType> getZoneType() {
        return this.zoneType == null ? Output.empty() : this.zoneType;
    }

    public ZoneArgs(
        @Nullable Output<String> location,
        @Nullable Output<List<SubResourceArgs>> registrationVirtualNetworks,
        @Nullable Output<List<SubResourceArgs>> resolutionVirtualNetworks,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> zoneName,
        @Nullable Output<ZoneType> zoneType) {
        this.location = location;
        this.registrationVirtualNetworks = registrationVirtualNetworks;
        this.resolutionVirtualNetworks = resolutionVirtualNetworks;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.zoneName = zoneName;
        this.zoneType = zoneType == null ? Output.ofNullable(io.pulumi.azurenative.network.enums.ZoneType.Public) : zoneType;
    }

    private ZoneArgs() {
        this.location = Output.empty();
        this.registrationVirtualNetworks = Output.empty();
        this.resolutionVirtualNetworks = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
        this.zoneName = Output.empty();
        this.zoneType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private @Nullable Output<List<SubResourceArgs>> registrationVirtualNetworks;
        private @Nullable Output<List<SubResourceArgs>> resolutionVirtualNetworks;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> zoneName;
        private @Nullable Output<ZoneType> zoneType;

        public Builder() {
    	      // Empty
        }

        public Builder(ZoneArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.registrationVirtualNetworks = defaults.registrationVirtualNetworks;
    	      this.resolutionVirtualNetworks = defaults.resolutionVirtualNetworks;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.zoneName = defaults.zoneName;
    	      this.zoneType = defaults.zoneType;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder registrationVirtualNetworks(@Nullable Output<List<SubResourceArgs>> registrationVirtualNetworks) {
            this.registrationVirtualNetworks = registrationVirtualNetworks;
            return this;
        }

        public Builder registrationVirtualNetworks(@Nullable List<SubResourceArgs> registrationVirtualNetworks) {
            this.registrationVirtualNetworks = Output.ofNullable(registrationVirtualNetworks);
            return this;
        }

        public Builder resolutionVirtualNetworks(@Nullable Output<List<SubResourceArgs>> resolutionVirtualNetworks) {
            this.resolutionVirtualNetworks = resolutionVirtualNetworks;
            return this;
        }

        public Builder resolutionVirtualNetworks(@Nullable List<SubResourceArgs> resolutionVirtualNetworks) {
            this.resolutionVirtualNetworks = Output.ofNullable(resolutionVirtualNetworks);
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

        public Builder zoneName(@Nullable Output<String> zoneName) {
            this.zoneName = zoneName;
            return this;
        }

        public Builder zoneName(@Nullable String zoneName) {
            this.zoneName = Output.ofNullable(zoneName);
            return this;
        }

        public Builder zoneType(@Nullable Output<ZoneType> zoneType) {
            this.zoneType = zoneType;
            return this;
        }

        public Builder zoneType(@Nullable ZoneType zoneType) {
            this.zoneType = Output.ofNullable(zoneType);
            return this;
        }
        public ZoneArgs build() {
            return new ZoneArgs(location, registrationVirtualNetworks, resolutionVirtualNetworks, resourceGroupName, tags, zoneName, zoneType);
        }
    }
}
