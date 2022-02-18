// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.outputs;

import io.pulumi.azurenative.storsimple.outputs.AsymmetricEncryptedSecretResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVolumeContainerResult {
    /**
     * The bandwidth-rate set on the volume container.
     * 
     */
    private final @Nullable Integer bandWidthRateInMbps;
    /**
     * The ID of the bandwidth setting associated with the volume container.
     * 
     */
    private final @Nullable String bandwidthSettingId;
    /**
     * The key used to encrypt data in the volume container. It is required when property 'EncryptionStatus' is "Enabled".
     * 
     */
    private final @Nullable AsymmetricEncryptedSecretResponse encryptionKey;
    /**
     * The flag to denote whether encryption is enabled or not.
     * 
     */
    private final String encryptionStatus;
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    private final @Nullable String kind;
    /**
     * The name of the object.
     * 
     */
    private final String name;
    /**
     * The owner ship status of the volume container. Only when the status is "NotOwned", the delete operation on the volume container is permitted.
     * 
     */
    private final String ownerShipStatus;
    /**
     * The path ID of storage account associated with the volume container.
     * 
     */
    private final String storageAccountCredentialId;
    /**
     * The total cloud storage for the volume container.
     * 
     */
    private final Double totalCloudStorageUsageInBytes;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;
    /**
     * The number of volumes in the volume Container.
     * 
     */
    private final Integer volumeCount;

    @OutputCustomType.Constructor({"bandWidthRateInMbps","bandwidthSettingId","encryptionKey","encryptionStatus","id","kind","name","ownerShipStatus","storageAccountCredentialId","totalCloudStorageUsageInBytes","type","volumeCount"})
    private GetVolumeContainerResult(
        @Nullable Integer bandWidthRateInMbps,
        @Nullable String bandwidthSettingId,
        @Nullable AsymmetricEncryptedSecretResponse encryptionKey,
        String encryptionStatus,
        String id,
        @Nullable String kind,
        String name,
        String ownerShipStatus,
        String storageAccountCredentialId,
        Double totalCloudStorageUsageInBytes,
        String type,
        Integer volumeCount) {
        this.bandWidthRateInMbps = bandWidthRateInMbps;
        this.bandwidthSettingId = bandwidthSettingId;
        this.encryptionKey = encryptionKey;
        this.encryptionStatus = Objects.requireNonNull(encryptionStatus);
        this.id = Objects.requireNonNull(id);
        this.kind = kind;
        this.name = Objects.requireNonNull(name);
        this.ownerShipStatus = Objects.requireNonNull(ownerShipStatus);
        this.storageAccountCredentialId = Objects.requireNonNull(storageAccountCredentialId);
        this.totalCloudStorageUsageInBytes = Objects.requireNonNull(totalCloudStorageUsageInBytes);
        this.type = Objects.requireNonNull(type);
        this.volumeCount = Objects.requireNonNull(volumeCount);
    }

    /**
     * The bandwidth-rate set on the volume container.
     * 
     */
    public Optional<Integer> getBandWidthRateInMbps() {
        return Optional.ofNullable(this.bandWidthRateInMbps);
    }
    /**
     * The ID of the bandwidth setting associated with the volume container.
     * 
     */
    public Optional<String> getBandwidthSettingId() {
        return Optional.ofNullable(this.bandwidthSettingId);
    }
    /**
     * The key used to encrypt data in the volume container. It is required when property 'EncryptionStatus' is "Enabled".
     * 
     */
    public Optional<AsymmetricEncryptedSecretResponse> getEncryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }
    /**
     * The flag to denote whether encryption is enabled or not.
     * 
     */
    public String getEncryptionStatus() {
        return this.encryptionStatus;
    }
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * The name of the object.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The owner ship status of the volume container. Only when the status is "NotOwned", the delete operation on the volume container is permitted.
     * 
     */
    public String getOwnerShipStatus() {
        return this.ownerShipStatus;
    }
    /**
     * The path ID of storage account associated with the volume container.
     * 
     */
    public String getStorageAccountCredentialId() {
        return this.storageAccountCredentialId;
    }
    /**
     * The total cloud storage for the volume container.
     * 
     */
    public Double getTotalCloudStorageUsageInBytes() {
        return this.totalCloudStorageUsageInBytes;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The number of volumes in the volume Container.
     * 
     */
    public Integer getVolumeCount() {
        return this.volumeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumeContainerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bandWidthRateInMbps;
        private @Nullable String bandwidthSettingId;
        private @Nullable AsymmetricEncryptedSecretResponse encryptionKey;
        private String encryptionStatus;
        private String id;
        private @Nullable String kind;
        private String name;
        private String ownerShipStatus;
        private String storageAccountCredentialId;
        private Double totalCloudStorageUsageInBytes;
        private String type;
        private Integer volumeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVolumeContainerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandWidthRateInMbps = defaults.bandWidthRateInMbps;
    	      this.bandwidthSettingId = defaults.bandwidthSettingId;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.encryptionStatus = defaults.encryptionStatus;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.ownerShipStatus = defaults.ownerShipStatus;
    	      this.storageAccountCredentialId = defaults.storageAccountCredentialId;
    	      this.totalCloudStorageUsageInBytes = defaults.totalCloudStorageUsageInBytes;
    	      this.type = defaults.type;
    	      this.volumeCount = defaults.volumeCount;
        }

        public Builder setBandWidthRateInMbps(@Nullable Integer bandWidthRateInMbps) {
            this.bandWidthRateInMbps = bandWidthRateInMbps;
            return this;
        }

        public Builder setBandwidthSettingId(@Nullable String bandwidthSettingId) {
            this.bandwidthSettingId = bandwidthSettingId;
            return this;
        }

        public Builder setEncryptionKey(@Nullable AsymmetricEncryptedSecretResponse encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        public Builder setEncryptionStatus(String encryptionStatus) {
            this.encryptionStatus = Objects.requireNonNull(encryptionStatus);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOwnerShipStatus(String ownerShipStatus) {
            this.ownerShipStatus = Objects.requireNonNull(ownerShipStatus);
            return this;
        }

        public Builder setStorageAccountCredentialId(String storageAccountCredentialId) {
            this.storageAccountCredentialId = Objects.requireNonNull(storageAccountCredentialId);
            return this;
        }

        public Builder setTotalCloudStorageUsageInBytes(Double totalCloudStorageUsageInBytes) {
            this.totalCloudStorageUsageInBytes = Objects.requireNonNull(totalCloudStorageUsageInBytes);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVolumeCount(Integer volumeCount) {
            this.volumeCount = Objects.requireNonNull(volumeCount);
            return this;
        }

        public GetVolumeContainerResult build() {
            return new GetVolumeContainerResult(bandWidthRateInMbps, bandwidthSettingId, encryptionKey, encryptionStatus, id, kind, name, ownerShipStatus, storageAccountCredentialId, totalCloudStorageUsageInBytes, type, volumeCount);
        }
    }
}
