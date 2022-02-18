// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.DiskAccountType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * InMageRcm disk input.
 * 
 */
public final class InMageRcmDisksDefaultInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final InMageRcmDisksDefaultInputArgs Empty = new InMageRcmDisksDefaultInputArgs();

    /**
     * The disk encryption set ARM Id.
     * 
     */
    @InputImport(name="diskEncryptionSetId")
    private final @Nullable Input<String> diskEncryptionSetId;

    public Input<String> getDiskEncryptionSetId() {
        return this.diskEncryptionSetId == null ? Input.empty() : this.diskEncryptionSetId;
    }

    /**
     * The disk type.
     * 
     */
    @InputImport(name="diskType")
    private final @Nullable Input<Either<String,DiskAccountType>> diskType;

    public Input<Either<String,DiskAccountType>> getDiskType() {
        return this.diskType == null ? Input.empty() : this.diskType;
    }

    /**
     * The log storage account ARM Id.
     * 
     */
    @InputImport(name="logStorageAccountId")
    private final @Nullable Input<String> logStorageAccountId;

    public Input<String> getLogStorageAccountId() {
        return this.logStorageAccountId == null ? Input.empty() : this.logStorageAccountId;
    }

    public InMageRcmDisksDefaultInputArgs(
        @Nullable Input<String> diskEncryptionSetId,
        @Nullable Input<Either<String,DiskAccountType>> diskType,
        @Nullable Input<String> logStorageAccountId) {
        this.diskEncryptionSetId = diskEncryptionSetId;
        this.diskType = diskType;
        this.logStorageAccountId = logStorageAccountId;
    }

    private InMageRcmDisksDefaultInputArgs() {
        this.diskEncryptionSetId = Input.empty();
        this.diskType = Input.empty();
        this.logStorageAccountId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageRcmDisksDefaultInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> diskEncryptionSetId;
        private @Nullable Input<Either<String,DiskAccountType>> diskType;
        private @Nullable Input<String> logStorageAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageRcmDisksDefaultInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionSetId = defaults.diskEncryptionSetId;
    	      this.diskType = defaults.diskType;
    	      this.logStorageAccountId = defaults.logStorageAccountId;
        }

        public Builder setDiskEncryptionSetId(@Nullable Input<String> diskEncryptionSetId) {
            this.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }

        public Builder setDiskEncryptionSetId(@Nullable String diskEncryptionSetId) {
            this.diskEncryptionSetId = Input.ofNullable(diskEncryptionSetId);
            return this;
        }

        public Builder setDiskType(@Nullable Input<Either<String,DiskAccountType>> diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder setDiskType(@Nullable Either<String,DiskAccountType> diskType) {
            this.diskType = Input.ofNullable(diskType);
            return this;
        }

        public Builder setLogStorageAccountId(@Nullable Input<String> logStorageAccountId) {
            this.logStorageAccountId = logStorageAccountId;
            return this;
        }

        public Builder setLogStorageAccountId(@Nullable String logStorageAccountId) {
            this.logStorageAccountId = Input.ofNullable(logStorageAccountId);
            return this;
        }

        public InMageRcmDisksDefaultInputArgs build() {
            return new InMageRcmDisksDefaultInputArgs(diskEncryptionSetId, diskType, logStorageAccountId);
        }
    }
}
