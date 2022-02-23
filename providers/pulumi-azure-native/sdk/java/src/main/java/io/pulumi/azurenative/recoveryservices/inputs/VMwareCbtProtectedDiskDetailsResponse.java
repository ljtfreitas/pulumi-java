// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VMwareCbt protected disk details.
 * 
 */
public final class VMwareCbtProtectedDiskDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VMwareCbtProtectedDiskDetailsResponse Empty = new VMwareCbtProtectedDiskDetailsResponse();

    /**
     * The disk capacity in bytes.
     * 
     */
    @InputImport(name="capacityInBytes", required=true)
        private final Double capacityInBytes;

    public Double getCapacityInBytes() {
        return this.capacityInBytes;
    }

    /**
     * The disk id.
     * 
     */
    @InputImport(name="diskId", required=true)
        private final String diskId;

    public String getDiskId() {
        return this.diskId;
    }

    /**
     * The disk name.
     * 
     */
    @InputImport(name="diskName", required=true)
        private final String diskName;

    public String getDiskName() {
        return this.diskName;
    }

    /**
     * The disk path.
     * 
     */
    @InputImport(name="diskPath", required=true)
        private final String diskPath;

    public String getDiskPath() {
        return this.diskPath;
    }

    /**
     * The disk type.
     * 
     */
    @InputImport(name="diskType")
        private final @Nullable String diskType;

    public Optional<String> getDiskType() {
        return this.diskType == null ? Optional.empty() : Optional.ofNullable(this.diskType);
    }

    /**
     * A value indicating whether the disk is the OS disk.
     * 
     */
    @InputImport(name="isOSDisk", required=true)
        private final String isOSDisk;

    public String getIsOSDisk() {
        return this.isOSDisk;
    }

    /**
     * The log storage account ARM Id.
     * 
     */
    @InputImport(name="logStorageAccountId", required=true)
        private final String logStorageAccountId;

    public String getLogStorageAccountId() {
        return this.logStorageAccountId;
    }

    /**
     * The key vault secret name of the log storage account.
     * 
     */
    @InputImport(name="logStorageAccountSasSecretName", required=true)
        private final String logStorageAccountSasSecretName;

    public String getLogStorageAccountSasSecretName() {
        return this.logStorageAccountSasSecretName;
    }

    /**
     * The ARM Id of the seed managed disk.
     * 
     */
    @InputImport(name="seedManagedDiskId", required=true)
        private final String seedManagedDiskId;

    public String getSeedManagedDiskId() {
        return this.seedManagedDiskId;
    }

    /**
     * The ARM Id of the target managed disk.
     * 
     */
    @InputImport(name="targetManagedDiskId", required=true)
        private final String targetManagedDiskId;

    public String getTargetManagedDiskId() {
        return this.targetManagedDiskId;
    }

    public VMwareCbtProtectedDiskDetailsResponse(
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
        this.capacityInBytes = Objects.requireNonNull(capacityInBytes, "expected parameter 'capacityInBytes' to be non-null");
        this.diskId = Objects.requireNonNull(diskId, "expected parameter 'diskId' to be non-null");
        this.diskName = Objects.requireNonNull(diskName, "expected parameter 'diskName' to be non-null");
        this.diskPath = Objects.requireNonNull(diskPath, "expected parameter 'diskPath' to be non-null");
        this.diskType = diskType;
        this.isOSDisk = Objects.requireNonNull(isOSDisk, "expected parameter 'isOSDisk' to be non-null");
        this.logStorageAccountId = Objects.requireNonNull(logStorageAccountId, "expected parameter 'logStorageAccountId' to be non-null");
        this.logStorageAccountSasSecretName = Objects.requireNonNull(logStorageAccountSasSecretName, "expected parameter 'logStorageAccountSasSecretName' to be non-null");
        this.seedManagedDiskId = Objects.requireNonNull(seedManagedDiskId, "expected parameter 'seedManagedDiskId' to be non-null");
        this.targetManagedDiskId = Objects.requireNonNull(targetManagedDiskId, "expected parameter 'targetManagedDiskId' to be non-null");
    }

    private VMwareCbtProtectedDiskDetailsResponse() {
        this.capacityInBytes = null;
        this.diskId = null;
        this.diskName = null;
        this.diskPath = null;
        this.diskType = null;
        this.isOSDisk = null;
        this.logStorageAccountId = null;
        this.logStorageAccountSasSecretName = null;
        this.seedManagedDiskId = null;
        this.targetManagedDiskId = null;
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
