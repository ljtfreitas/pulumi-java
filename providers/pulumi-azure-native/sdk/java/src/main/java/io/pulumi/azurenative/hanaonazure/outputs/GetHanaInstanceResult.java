// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hanaonazure.outputs;

import io.pulumi.azurenative.hanaonazure.outputs.HardwareProfileResponse;
import io.pulumi.azurenative.hanaonazure.outputs.NetworkProfileResponse;
import io.pulumi.azurenative.hanaonazure.outputs.OSProfileResponse;
import io.pulumi.azurenative.hanaonazure.outputs.StorageProfileResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHanaInstanceResult {
    /**
     * Specifies the HANA instance unique ID.
     * 
     */
    private final String hanaInstanceId;
    /**
     * Specifies the hardware settings for the HANA instance.
     * 
     */
    private final @Nullable HardwareProfileResponse hardwareProfile;
    /**
     * Hardware revision of a HANA instance
     * 
     */
    private final String hwRevision;
    /**
     * Resource ID
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Specifies the network settings for the HANA instance.
     * 
     */
    private final @Nullable NetworkProfileResponse networkProfile;
    /**
     * Specifies the operating system settings for the HANA instance.
     * 
     */
    private final @Nullable OSProfileResponse osProfile;
    /**
     * ARM ID of another HanaInstance that will share a network with this HanaInstance
     * 
     */
    private final @Nullable String partnerNodeId;
    /**
     * Resource power state
     * 
     */
    private final String powerState;
    /**
     * State of provisioning of the HanaInstance
     * 
     */
    private final String provisioningState;
    /**
     * Resource proximity placement group
     * 
     */
    private final String proximityPlacementGroup;
    /**
     * Specifies the storage settings for the HANA instance disks.
     * 
     */
    private final @Nullable StorageProfileResponse storageProfile;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetHanaInstanceResult(
        @CustomType.Parameter("hanaInstanceId") String hanaInstanceId,
        @CustomType.Parameter("hardwareProfile") @Nullable HardwareProfileResponse hardwareProfile,
        @CustomType.Parameter("hwRevision") String hwRevision,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkProfile") @Nullable NetworkProfileResponse networkProfile,
        @CustomType.Parameter("osProfile") @Nullable OSProfileResponse osProfile,
        @CustomType.Parameter("partnerNodeId") @Nullable String partnerNodeId,
        @CustomType.Parameter("powerState") String powerState,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("proximityPlacementGroup") String proximityPlacementGroup,
        @CustomType.Parameter("storageProfile") @Nullable StorageProfileResponse storageProfile,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.hanaInstanceId = hanaInstanceId;
        this.hardwareProfile = hardwareProfile;
        this.hwRevision = hwRevision;
        this.id = id;
        this.location = location;
        this.name = name;
        this.networkProfile = networkProfile;
        this.osProfile = osProfile;
        this.partnerNodeId = partnerNodeId;
        this.powerState = powerState;
        this.provisioningState = provisioningState;
        this.proximityPlacementGroup = proximityPlacementGroup;
        this.storageProfile = storageProfile;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Specifies the HANA instance unique ID.
     * 
    */
    public String getHanaInstanceId() {
        return this.hanaInstanceId;
    }
    /**
     * Specifies the hardware settings for the HANA instance.
     * 
    */
    public Optional<HardwareProfileResponse> getHardwareProfile() {
        return Optional.ofNullable(this.hardwareProfile);
    }
    /**
     * Hardware revision of a HANA instance
     * 
    */
    public String getHwRevision() {
        return this.hwRevision;
    }
    /**
     * Resource ID
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Specifies the network settings for the HANA instance.
     * 
    */
    public Optional<NetworkProfileResponse> getNetworkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }
    /**
     * Specifies the operating system settings for the HANA instance.
     * 
    */
    public Optional<OSProfileResponse> getOsProfile() {
        return Optional.ofNullable(this.osProfile);
    }
    /**
     * ARM ID of another HanaInstance that will share a network with this HanaInstance
     * 
    */
    public Optional<String> getPartnerNodeId() {
        return Optional.ofNullable(this.partnerNodeId);
    }
    /**
     * Resource power state
     * 
    */
    public String getPowerState() {
        return this.powerState;
    }
    /**
     * State of provisioning of the HanaInstance
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource proximity placement group
     * 
    */
    public String getProximityPlacementGroup() {
        return this.proximityPlacementGroup;
    }
    /**
     * Specifies the storage settings for the HANA instance disks.
     * 
    */
    public Optional<StorageProfileResponse> getStorageProfile() {
        return Optional.ofNullable(this.storageProfile);
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHanaInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hanaInstanceId;
        private @Nullable HardwareProfileResponse hardwareProfile;
        private String hwRevision;
        private String id;
        private @Nullable String location;
        private String name;
        private @Nullable NetworkProfileResponse networkProfile;
        private @Nullable OSProfileResponse osProfile;
        private @Nullable String partnerNodeId;
        private String powerState;
        private String provisioningState;
        private String proximityPlacementGroup;
        private @Nullable StorageProfileResponse storageProfile;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHanaInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hanaInstanceId = defaults.hanaInstanceId;
    	      this.hardwareProfile = defaults.hardwareProfile;
    	      this.hwRevision = defaults.hwRevision;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkProfile = defaults.networkProfile;
    	      this.osProfile = defaults.osProfile;
    	      this.partnerNodeId = defaults.partnerNodeId;
    	      this.powerState = defaults.powerState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.proximityPlacementGroup = defaults.proximityPlacementGroup;
    	      this.storageProfile = defaults.storageProfile;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder hanaInstanceId(String hanaInstanceId) {
            this.hanaInstanceId = Objects.requireNonNull(hanaInstanceId);
            return this;
        }

        public Builder hardwareProfile(@Nullable HardwareProfileResponse hardwareProfile) {
            this.hardwareProfile = hardwareProfile;
            return this;
        }

        public Builder hwRevision(String hwRevision) {
            this.hwRevision = Objects.requireNonNull(hwRevision);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder networkProfile(@Nullable NetworkProfileResponse networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder osProfile(@Nullable OSProfileResponse osProfile) {
            this.osProfile = osProfile;
            return this;
        }

        public Builder partnerNodeId(@Nullable String partnerNodeId) {
            this.partnerNodeId = partnerNodeId;
            return this;
        }

        public Builder powerState(String powerState) {
            this.powerState = Objects.requireNonNull(powerState);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder proximityPlacementGroup(String proximityPlacementGroup) {
            this.proximityPlacementGroup = Objects.requireNonNull(proximityPlacementGroup);
            return this;
        }

        public Builder storageProfile(@Nullable StorageProfileResponse storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetHanaInstanceResult build() {
            return new GetHanaInstanceResult(hanaInstanceId, hardwareProfile, hwRevision, id, location, name, networkProfile, osProfile, partnerNodeId, powerState, provisioningState, proximityPlacementGroup, storageProfile, tags, type);
        }
    }
}
