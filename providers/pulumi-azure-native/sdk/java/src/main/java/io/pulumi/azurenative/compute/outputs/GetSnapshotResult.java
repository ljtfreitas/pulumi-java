// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.CreationDataResponse;
import io.pulumi.azurenative.compute.outputs.EncryptionResponse;
import io.pulumi.azurenative.compute.outputs.EncryptionSettingsCollectionResponse;
import io.pulumi.azurenative.compute.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.compute.outputs.PurchasePlanResponse;
import io.pulumi.azurenative.compute.outputs.SnapshotSkuResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSnapshotResult {
    /**
     * Disk source information. CreationData information cannot be changed after the disk has been created.
     * 
     */
    private final CreationDataResponse creationData;
    /**
     * ARM id of the DiskAccess resource for using private endpoints on disks.
     * 
     */
    private final @Nullable String diskAccessId;
    /**
     * The size of the disk in bytes. This field is read only.
     * 
     */
    private final Double diskSizeBytes;
    /**
     * If creationData.createOption is Empty, this field is mandatory and it indicates the size of the disk to create. If this field is present for updates or creation with other options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's size.
     * 
     */
    private final @Nullable Integer diskSizeGB;
    /**
     * The state of the snapshot.
     * 
     */
    private final String diskState;
    /**
     * Encryption property can be used to encrypt data at rest with customer managed keys or platform managed keys.
     * 
     */
    private final @Nullable EncryptionResponse encryption;
    /**
     * Encryption settings collection used be Azure Disk Encryption, can contain multiple encryption settings per disk or snapshot.
     * 
     */
    private final @Nullable EncryptionSettingsCollectionResponse encryptionSettingsCollection;
    /**
     * The extended location where the snapshot will be created. Extended location cannot be changed.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     * 
     */
    private final @Nullable String hyperVGeneration;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Whether a snapshot is incremental. Incremental snapshots on the same disk occupy less space than full snapshots and can be diffed.
     * 
     */
    private final @Nullable Boolean incremental;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Unused. Always Null.
     * 
     */
    private final String managedBy;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Policy for accessing the disk via network.
     * 
     */
    private final @Nullable String networkAccessPolicy;
    /**
     * The Operating System type.
     * 
     */
    private final @Nullable String osType;
    /**
     * The disk provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * Purchase plan information for the image from which the source disk for the snapshot was originally created.
     * 
     */
    private final @Nullable PurchasePlanResponse purchasePlan;
    /**
     * The snapshots sku name. Can be Standard_LRS, Premium_LRS, or Standard_ZRS. This is an optional parameter for incremental snapshot and the default behavior is the SKU will be set to the same sku as the previous snapshot
     * 
     */
    private final @Nullable SnapshotSkuResponse sku;
    /**
     * Indicates the OS on a snapshot supports hibernation.
     * 
     */
    private final @Nullable Boolean supportsHibernation;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The time when the snapshot was created.
     * 
     */
    private final String timeCreated;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * Unique Guid identifying the resource.
     * 
     */
    private final String uniqueId;

    @CustomType.Constructor
    private GetSnapshotResult(
        @CustomType.Parameter("creationData") CreationDataResponse creationData,
        @CustomType.Parameter("diskAccessId") @Nullable String diskAccessId,
        @CustomType.Parameter("diskSizeBytes") Double diskSizeBytes,
        @CustomType.Parameter("diskSizeGB") @Nullable Integer diskSizeGB,
        @CustomType.Parameter("diskState") String diskState,
        @CustomType.Parameter("encryption") @Nullable EncryptionResponse encryption,
        @CustomType.Parameter("encryptionSettingsCollection") @Nullable EncryptionSettingsCollectionResponse encryptionSettingsCollection,
        @CustomType.Parameter("extendedLocation") @Nullable ExtendedLocationResponse extendedLocation,
        @CustomType.Parameter("hyperVGeneration") @Nullable String hyperVGeneration,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("incremental") @Nullable Boolean incremental,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("managedBy") String managedBy,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkAccessPolicy") @Nullable String networkAccessPolicy,
        @CustomType.Parameter("osType") @Nullable String osType,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("purchasePlan") @Nullable PurchasePlanResponse purchasePlan,
        @CustomType.Parameter("sku") @Nullable SnapshotSkuResponse sku,
        @CustomType.Parameter("supportsHibernation") @Nullable Boolean supportsHibernation,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("uniqueId") String uniqueId) {
        this.creationData = creationData;
        this.diskAccessId = diskAccessId;
        this.diskSizeBytes = diskSizeBytes;
        this.diskSizeGB = diskSizeGB;
        this.diskState = diskState;
        this.encryption = encryption;
        this.encryptionSettingsCollection = encryptionSettingsCollection;
        this.extendedLocation = extendedLocation;
        this.hyperVGeneration = hyperVGeneration;
        this.id = id;
        this.incremental = incremental;
        this.location = location;
        this.managedBy = managedBy;
        this.name = name;
        this.networkAccessPolicy = networkAccessPolicy;
        this.osType = osType;
        this.provisioningState = provisioningState;
        this.purchasePlan = purchasePlan;
        this.sku = sku;
        this.supportsHibernation = supportsHibernation;
        this.tags = tags;
        this.timeCreated = timeCreated;
        this.type = type;
        this.uniqueId = uniqueId;
    }

    /**
     * Disk source information. CreationData information cannot be changed after the disk has been created.
     * 
    */
    public CreationDataResponse getCreationData() {
        return this.creationData;
    }
    /**
     * ARM id of the DiskAccess resource for using private endpoints on disks.
     * 
    */
    public Optional<String> getDiskAccessId() {
        return Optional.ofNullable(this.diskAccessId);
    }
    /**
     * The size of the disk in bytes. This field is read only.
     * 
    */
    public Double getDiskSizeBytes() {
        return this.diskSizeBytes;
    }
    /**
     * If creationData.createOption is Empty, this field is mandatory and it indicates the size of the disk to create. If this field is present for updates or creation with other options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's size.
     * 
    */
    public Optional<Integer> getDiskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }
    /**
     * The state of the snapshot.
     * 
    */
    public String getDiskState() {
        return this.diskState;
    }
    /**
     * Encryption property can be used to encrypt data at rest with customer managed keys or platform managed keys.
     * 
    */
    public Optional<EncryptionResponse> getEncryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * Encryption settings collection used be Azure Disk Encryption, can contain multiple encryption settings per disk or snapshot.
     * 
    */
    public Optional<EncryptionSettingsCollectionResponse> getEncryptionSettingsCollection() {
        return Optional.ofNullable(this.encryptionSettingsCollection);
    }
    /**
     * The extended location where the snapshot will be created. Extended location cannot be changed.
     * 
    */
    public Optional<ExtendedLocationResponse> getExtendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     * 
    */
    public Optional<String> getHyperVGeneration() {
        return Optional.ofNullable(this.hyperVGeneration);
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Whether a snapshot is incremental. Incremental snapshots on the same disk occupy less space than full snapshots and can be diffed.
     * 
    */
    public Optional<Boolean> getIncremental() {
        return Optional.ofNullable(this.incremental);
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Unused. Always Null.
     * 
    */
    public String getManagedBy() {
        return this.managedBy;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Policy for accessing the disk via network.
     * 
    */
    public Optional<String> getNetworkAccessPolicy() {
        return Optional.ofNullable(this.networkAccessPolicy);
    }
    /**
     * The Operating System type.
     * 
    */
    public Optional<String> getOsType() {
        return Optional.ofNullable(this.osType);
    }
    /**
     * The disk provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Purchase plan information for the image from which the source disk for the snapshot was originally created.
     * 
    */
    public Optional<PurchasePlanResponse> getPurchasePlan() {
        return Optional.ofNullable(this.purchasePlan);
    }
    /**
     * The snapshots sku name. Can be Standard_LRS, Premium_LRS, or Standard_ZRS. This is an optional parameter for incremental snapshot and the default behavior is the SKU will be set to the same sku as the previous snapshot
     * 
    */
    public Optional<SnapshotSkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Indicates the OS on a snapshot supports hibernation.
     * 
    */
    public Optional<Boolean> getSupportsHibernation() {
        return Optional.ofNullable(this.supportsHibernation);
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The time when the snapshot was created.
     * 
    */
    public String getTimeCreated() {
        return this.timeCreated;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Unique Guid identifying the resource.
     * 
    */
    public String getUniqueId() {
        return this.uniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CreationDataResponse creationData;
        private @Nullable String diskAccessId;
        private Double diskSizeBytes;
        private @Nullable Integer diskSizeGB;
        private String diskState;
        private @Nullable EncryptionResponse encryption;
        private @Nullable EncryptionSettingsCollectionResponse encryptionSettingsCollection;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private @Nullable String hyperVGeneration;
        private String id;
        private @Nullable Boolean incremental;
        private String location;
        private String managedBy;
        private String name;
        private @Nullable String networkAccessPolicy;
        private @Nullable String osType;
        private String provisioningState;
        private @Nullable PurchasePlanResponse purchasePlan;
        private @Nullable SnapshotSkuResponse sku;
        private @Nullable Boolean supportsHibernation;
        private @Nullable Map<String,String> tags;
        private String timeCreated;
        private String type;
        private String uniqueId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationData = defaults.creationData;
    	      this.diskAccessId = defaults.diskAccessId;
    	      this.diskSizeBytes = defaults.diskSizeBytes;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.diskState = defaults.diskState;
    	      this.encryption = defaults.encryption;
    	      this.encryptionSettingsCollection = defaults.encryptionSettingsCollection;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.hyperVGeneration = defaults.hyperVGeneration;
    	      this.id = defaults.id;
    	      this.incremental = defaults.incremental;
    	      this.location = defaults.location;
    	      this.managedBy = defaults.managedBy;
    	      this.name = defaults.name;
    	      this.networkAccessPolicy = defaults.networkAccessPolicy;
    	      this.osType = defaults.osType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.purchasePlan = defaults.purchasePlan;
    	      this.sku = defaults.sku;
    	      this.supportsHibernation = defaults.supportsHibernation;
    	      this.tags = defaults.tags;
    	      this.timeCreated = defaults.timeCreated;
    	      this.type = defaults.type;
    	      this.uniqueId = defaults.uniqueId;
        }

        public Builder creationData(CreationDataResponse creationData) {
            this.creationData = Objects.requireNonNull(creationData);
            return this;
        }

        public Builder diskAccessId(@Nullable String diskAccessId) {
            this.diskAccessId = diskAccessId;
            return this;
        }

        public Builder diskSizeBytes(Double diskSizeBytes) {
            this.diskSizeBytes = Objects.requireNonNull(diskSizeBytes);
            return this;
        }

        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder diskState(String diskState) {
            this.diskState = Objects.requireNonNull(diskState);
            return this;
        }

        public Builder encryption(@Nullable EncryptionResponse encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder encryptionSettingsCollection(@Nullable EncryptionSettingsCollectionResponse encryptionSettingsCollection) {
            this.encryptionSettingsCollection = encryptionSettingsCollection;
            return this;
        }

        public Builder extendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder hyperVGeneration(@Nullable String hyperVGeneration) {
            this.hyperVGeneration = hyperVGeneration;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder incremental(@Nullable Boolean incremental) {
            this.incremental = incremental;
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder managedBy(String managedBy) {
            this.managedBy = Objects.requireNonNull(managedBy);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder networkAccessPolicy(@Nullable String networkAccessPolicy) {
            this.networkAccessPolicy = networkAccessPolicy;
            return this;
        }

        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder purchasePlan(@Nullable PurchasePlanResponse purchasePlan) {
            this.purchasePlan = purchasePlan;
            return this;
        }

        public Builder sku(@Nullable SnapshotSkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder supportsHibernation(@Nullable Boolean supportsHibernation) {
            this.supportsHibernation = supportsHibernation;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder uniqueId(String uniqueId) {
            this.uniqueId = Objects.requireNonNull(uniqueId);
            return this;
        }
        public GetSnapshotResult build() {
            return new GetSnapshotResult(creationData, diskAccessId, diskSizeBytes, diskSizeGB, diskState, encryption, encryptionSettingsCollection, extendedLocation, hyperVGeneration, id, incremental, location, managedBy, name, networkAccessPolicy, osType, provisioningState, purchasePlan, sku, supportsHibernation, tags, timeCreated, type, uniqueId);
        }
    }
}
