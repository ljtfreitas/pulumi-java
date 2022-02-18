// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VMwareCbtProtectedDiskDetailsResponse {
    /**
     * The disk capacity in bytes.
     * 
     */
    private final Double capacityInBytes;
    /**
     * The disk id.
     * 
     */
    private final String diskId;
    /**
     * The disk name.
     * 
     */
    private final String diskName;
    /**
     * The disk path.
     * 
     */
    private final String diskPath;
    /**
     * The disk type.
     * 
     */
    private final @Nullable String diskType;
    /**
     * A value indicating whether the disk is the OS disk.
     * 
     */
    private final String isOSDisk;
    /**
     * The log storage account ARM Id.
     * 
     */
    private final String logStorageAccountId;
    /**
     * The key vault secret name of the log storage account.
     * 
     */
    private final String logStorageAccountSasSecretName;
    /**
     * The ARM Id of the seed managed disk.
     * 
     */
    private final String seedManagedDiskId;
    /**
     * The ARM Id of the target managed disk.
     * 
     */
    private final String targetManagedDiskId;

    @OutputCustomType.Constructor({"capacityInBytes","diskId","diskName","diskPath","diskType","isOSDisk","logStorageAccountId","logStorageAccountSasSecretName","seedManagedDiskId","targetManagedDiskId"})
    private VMwareCbtProtectedDiskDetailsResponse(
        Double capacityInBytes,
        String diskId,
        String diskName,
        String diskPath,
        @Nullable String diskType,
        String isOSDisk,
        String logStorageAccountId,
        String logStorageAccountSasSecretName,
        String seedManagedDiskId,
        String targetManagedDiskId) {
        this.capacityInBytes = Objects.requireNonNull(capacityInBytes);
        this.diskId = Objects.requireNonNull(diskId);
        this.diskName = Objects.requireNonNull(diskName);
        this.diskPath = Objects.requireNonNull(diskPath);
        this.diskType = diskType;
        this.isOSDisk = Objects.requireNonNull(isOSDisk);
        this.logStorageAccountId = Objects.requireNonNull(logStorageAccountId);
        this.logStorageAccountSasSecretName = Objects.requireNonNull(logStorageAccountSasSecretName);
        this.seedManagedDiskId = Objects.requireNonNull(seedManagedDiskId);
        this.targetManagedDiskId = Objects.requireNonNull(targetManagedDiskId);
    }

    /**
     * The disk capacity in bytes.
     * 
     */
    public Double getCapacityInBytes() {
        return this.capacityInBytes;
    }
    /**
     * The disk id.
     * 
     */
    public String getDiskId() {
        return this.diskId;
    }
    /**
     * The disk name.
     * 
     */
    public String getDiskName() {
        return this.diskName;
    }
    /**
     * The disk path.
     * 
     */
    public String getDiskPath() {
        return this.diskPath;
    }
    /**
     * The disk type.
     * 
     */
    public Optional<String> getDiskType() {
        return Optional.ofNullable(this.diskType);
    }
    /**
     * A value indicating whether the disk is the OS disk.
     * 
     */
    public String getIsOSDisk() {
        return this.isOSDisk;
    }
    /**
     * The log storage account ARM Id.
     * 
     */
    public String getLogStorageAccountId() {
        return this.logStorageAccountId;
    }
    /**
     * The key vault secret name of the log storage account.
     * 
     */
    public String getLogStorageAccountSasSecretName() {
        return this.logStorageAccountSasSecretName;
    }
    /**
     * The ARM Id of the seed managed disk.
     * 
     */
    public String getSeedManagedDiskId() {
        return this.seedManagedDiskId;
    }
    /**
     * The ARM Id of the target managed disk.
     * 
     */
    public String getTargetManagedDiskId() {
        return this.targetManagedDiskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareCbtProtectedDiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double capacityInBytes;
        private String diskId;
        private String diskName;
        private String diskPath;
        private @Nullable String diskType;
        private String isOSDisk;
        private String logStorageAccountId;
        private String logStorageAccountSasSecretName;
        private String seedManagedDiskId;
        private String targetManagedDiskId;

        public Builder() {
    	      // Empty
        }

        public Builder(VMwareCbtProtectedDiskDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityInBytes = defaults.capacityInBytes;
    	      this.diskId = defaults.diskId;
    	      this.diskName = defaults.diskName;
    	      this.diskPath = defaults.diskPath;
    	      this.diskType = defaults.diskType;
    	      this.isOSDisk = defaults.isOSDisk;
    	      this.logStorageAccountId = defaults.logStorageAccountId;
    	      this.logStorageAccountSasSecretName = defaults.logStorageAccountSasSecretName;
    	      this.seedManagedDiskId = defaults.seedManagedDiskId;
    	      this.targetManagedDiskId = defaults.targetManagedDiskId;
        }

        public Builder setCapacityInBytes(Double capacityInBytes) {
            this.capacityInBytes = Objects.requireNonNull(capacityInBytes);
            return this;
        }

        public Builder setDiskId(String diskId) {
            this.diskId = Objects.requireNonNull(diskId);
            return this;
        }

        public Builder setDiskName(String diskName) {
            this.diskName = Objects.requireNonNull(diskName);
            return this;
        }

        public Builder setDiskPath(String diskPath) {
            this.diskPath = Objects.requireNonNull(diskPath);
            return this;
        }

        public Builder setDiskType(@Nullable String diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder setIsOSDisk(String isOSDisk) {
            this.isOSDisk = Objects.requireNonNull(isOSDisk);
            return this;
        }

        public Builder setLogStorageAccountId(String logStorageAccountId) {
            this.logStorageAccountId = Objects.requireNonNull(logStorageAccountId);
            return this;
        }

        public Builder setLogStorageAccountSasSecretName(String logStorageAccountSasSecretName) {
            this.logStorageAccountSasSecretName = Objects.requireNonNull(logStorageAccountSasSecretName);
            return this;
        }

        public Builder setSeedManagedDiskId(String seedManagedDiskId) {
            this.seedManagedDiskId = Objects.requireNonNull(seedManagedDiskId);
            return this;
        }

        public Builder setTargetManagedDiskId(String targetManagedDiskId) {
            this.targetManagedDiskId = Objects.requireNonNull(targetManagedDiskId);
            return this;
        }

        public VMwareCbtProtectedDiskDetailsResponse build() {
            return new VMwareCbtProtectedDiskDetailsResponse(capacityInBytes, diskId, diskName, diskPath, diskType, isOSDisk, logStorageAccountId, logStorageAccountSasSecretName, seedManagedDiskId, targetManagedDiskId);
        }
    }
}
