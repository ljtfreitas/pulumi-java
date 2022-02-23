// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.DiskEncryptionInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure VM managed disk input details.
 * 
 */
public final class A2AVmManagedDiskInputDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final A2AVmManagedDiskInputDetailsArgs Empty = new A2AVmManagedDiskInputDetailsArgs();

    /**
     * The recovery disk encryption information (for one / single pass flows).
     * 
     */
    @InputImport(name="diskEncryptionInfo")
        private final @Nullable Input<DiskEncryptionInfoArgs> diskEncryptionInfo;

    public Input<DiskEncryptionInfoArgs> getDiskEncryptionInfo() {
        return this.diskEncryptionInfo == null ? Input.empty() : this.diskEncryptionInfo;
    }

    /**
     * The disk Id.
     * 
     */
    @InputImport(name="diskId")
        private final @Nullable Input<String> diskId;

    public Input<String> getDiskId() {
        return this.diskId == null ? Input.empty() : this.diskId;
    }

    /**
     * The primary staging storage account Arm Id.
     * 
     */
    @InputImport(name="primaryStagingAzureStorageAccountId")
        private final @Nullable Input<String> primaryStagingAzureStorageAccountId;

    public Input<String> getPrimaryStagingAzureStorageAccountId() {
        return this.primaryStagingAzureStorageAccountId == null ? Input.empty() : this.primaryStagingAzureStorageAccountId;
    }

    /**
     * The recovery disk encryption set Id.
     * 
     */
    @InputImport(name="recoveryDiskEncryptionSetId")
        private final @Nullable Input<String> recoveryDiskEncryptionSetId;

    public Input<String> getRecoveryDiskEncryptionSetId() {
        return this.recoveryDiskEncryptionSetId == null ? Input.empty() : this.recoveryDiskEncryptionSetId;
    }

    /**
     * The replica disk type. Its an optional value and will be same as source disk type if not user provided.
     * 
     */
    @InputImport(name="recoveryReplicaDiskAccountType")
        private final @Nullable Input<String> recoveryReplicaDiskAccountType;

    public Input<String> getRecoveryReplicaDiskAccountType() {
        return this.recoveryReplicaDiskAccountType == null ? Input.empty() : this.recoveryReplicaDiskAccountType;
    }

    /**
     * The target resource group Arm Id.
     * 
     */
    @InputImport(name="recoveryResourceGroupId")
        private final @Nullable Input<String> recoveryResourceGroupId;

    public Input<String> getRecoveryResourceGroupId() {
        return this.recoveryResourceGroupId == null ? Input.empty() : this.recoveryResourceGroupId;
    }

    /**
     * The target disk type after failover. Its an optional value and will be same as source disk type if not user provided.
     * 
     */
    @InputImport(name="recoveryTargetDiskAccountType")
        private final @Nullable Input<String> recoveryTargetDiskAccountType;

    public Input<String> getRecoveryTargetDiskAccountType() {
        return this.recoveryTargetDiskAccountType == null ? Input.empty() : this.recoveryTargetDiskAccountType;
    }

    public A2AVmManagedDiskInputDetailsArgs(
        @Nullable Input<DiskEncryptionInfoArgs> diskEncryptionInfo,
        @Nullable Input<String> diskId,
        @Nullable Input<String> primaryStagingAzureStorageAccountId,
        @Nullable Input<String> recoveryDiskEncryptionSetId,
        @Nullable Input<String> recoveryReplicaDiskAccountType,
        @Nullable Input<String> recoveryResourceGroupId,
        @Nullable Input<String> recoveryTargetDiskAccountType) {
        this.diskEncryptionInfo = diskEncryptionInfo;
        this.diskId = diskId;
        this.primaryStagingAzureStorageAccountId = primaryStagingAzureStorageAccountId;
        this.recoveryDiskEncryptionSetId = recoveryDiskEncryptionSetId;
        this.recoveryReplicaDiskAccountType = recoveryReplicaDiskAccountType;
        this.recoveryResourceGroupId = recoveryResourceGroupId;
        this.recoveryTargetDiskAccountType = recoveryTargetDiskAccountType;
    }

    private A2AVmManagedDiskInputDetailsArgs() {
        this.diskEncryptionInfo = Input.empty();
        this.diskId = Input.empty();
        this.primaryStagingAzureStorageAccountId = Input.empty();
        this.recoveryDiskEncryptionSetId = Input.empty();
        this.recoveryReplicaDiskAccountType = Input.empty();
        this.recoveryResourceGroupId = Input.empty();
        this.recoveryTargetDiskAccountType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(A2AVmManagedDiskInputDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DiskEncryptionInfoArgs> diskEncryptionInfo;
        private @Nullable Input<String> diskId;
        private @Nullable Input<String> primaryStagingAzureStorageAccountId;
        private @Nullable Input<String> recoveryDiskEncryptionSetId;
        private @Nullable Input<String> recoveryReplicaDiskAccountType;
        private @Nullable Input<String> recoveryResourceGroupId;
        private @Nullable Input<String> recoveryTargetDiskAccountType;

        public Builder() {
    	      // Empty
        }

        public Builder(A2AVmManagedDiskInputDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionInfo = defaults.diskEncryptionInfo;
    	      this.diskId = defaults.diskId;
    	      this.primaryStagingAzureStorageAccountId = defaults.primaryStagingAzureStorageAccountId;
    	      this.recoveryDiskEncryptionSetId = defaults.recoveryDiskEncryptionSetId;
    	      this.recoveryReplicaDiskAccountType = defaults.recoveryReplicaDiskAccountType;
    	      this.recoveryResourceGroupId = defaults.recoveryResourceGroupId;
    	      this.recoveryTargetDiskAccountType = defaults.recoveryTargetDiskAccountType;
        }

        public Builder setDiskEncryptionInfo(@Nullable Input<DiskEncryptionInfoArgs> diskEncryptionInfo) {
            this.diskEncryptionInfo = diskEncryptionInfo;
            return this;
        }

        public Builder setDiskEncryptionInfo(@Nullable DiskEncryptionInfoArgs diskEncryptionInfo) {
            this.diskEncryptionInfo = Input.ofNullable(diskEncryptionInfo);
            return this;
        }

        public Builder setDiskId(@Nullable Input<String> diskId) {
            this.diskId = diskId;
            return this;
        }

        public Builder setDiskId(@Nullable String diskId) {
            this.diskId = Input.ofNullable(diskId);
            return this;
        }

        public Builder setPrimaryStagingAzureStorageAccountId(@Nullable Input<String> primaryStagingAzureStorageAccountId) {
            this.primaryStagingAzureStorageAccountId = primaryStagingAzureStorageAccountId;
            return this;
        }

        public Builder setPrimaryStagingAzureStorageAccountId(@Nullable String primaryStagingAzureStorageAccountId) {
            this.primaryStagingAzureStorageAccountId = Input.ofNullable(primaryStagingAzureStorageAccountId);
            return this;
        }

        public Builder setRecoveryDiskEncryptionSetId(@Nullable Input<String> recoveryDiskEncryptionSetId) {
            this.recoveryDiskEncryptionSetId = recoveryDiskEncryptionSetId;
            return this;
        }

        public Builder setRecoveryDiskEncryptionSetId(@Nullable String recoveryDiskEncryptionSetId) {
            this.recoveryDiskEncryptionSetId = Input.ofNullable(recoveryDiskEncryptionSetId);
            return this;
        }

        public Builder setRecoveryReplicaDiskAccountType(@Nullable Input<String> recoveryReplicaDiskAccountType) {
            this.recoveryReplicaDiskAccountType = recoveryReplicaDiskAccountType;
            return this;
        }

        public Builder setRecoveryReplicaDiskAccountType(@Nullable String recoveryReplicaDiskAccountType) {
            this.recoveryReplicaDiskAccountType = Input.ofNullable(recoveryReplicaDiskAccountType);
            return this;
        }

        public Builder setRecoveryResourceGroupId(@Nullable Input<String> recoveryResourceGroupId) {
            this.recoveryResourceGroupId = recoveryResourceGroupId;
            return this;
        }

        public Builder setRecoveryResourceGroupId(@Nullable String recoveryResourceGroupId) {
            this.recoveryResourceGroupId = Input.ofNullable(recoveryResourceGroupId);
            return this;
        }

        public Builder setRecoveryTargetDiskAccountType(@Nullable Input<String> recoveryTargetDiskAccountType) {
            this.recoveryTargetDiskAccountType = recoveryTargetDiskAccountType;
            return this;
        }

        public Builder setRecoveryTargetDiskAccountType(@Nullable String recoveryTargetDiskAccountType) {
            this.recoveryTargetDiskAccountType = Input.ofNullable(recoveryTargetDiskAccountType);
            return this;
        }
        public A2AVmManagedDiskInputDetailsArgs build() {
            return new A2AVmManagedDiskInputDetailsArgs(diskEncryptionInfo, diskId, primaryStagingAzureStorageAccountId, recoveryDiskEncryptionSetId, recoveryReplicaDiskAccountType, recoveryResourceGroupId, recoveryTargetDiskAccountType);
        }
    }
}
