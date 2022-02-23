// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Storage Profile properties of a server
 * 
 */
public final class StorageProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageProfileResponse Empty = new StorageProfileResponse();

    /**
     * Backup retention days for the server.
     * 
     */
    @InputImport(name="backupRetentionDays")
        private final @Nullable Integer backupRetentionDays;

    public Optional<Integer> getBackupRetentionDays() {
        return this.backupRetentionDays == null ? Optional.empty() : Optional.ofNullable(this.backupRetentionDays);
    }

    /**
     * Enable Geo-redundant or not for server backup.
     * 
     */
    @InputImport(name="geoRedundantBackup")
        private final @Nullable String geoRedundantBackup;

    public Optional<String> getGeoRedundantBackup() {
        return this.geoRedundantBackup == null ? Optional.empty() : Optional.ofNullable(this.geoRedundantBackup);
    }

    /**
     * Enable Storage Auto Grow.
     * 
     */
    @InputImport(name="storageAutogrow")
        private final @Nullable String storageAutogrow;

    public Optional<String> getStorageAutogrow() {
        return this.storageAutogrow == null ? Optional.empty() : Optional.ofNullable(this.storageAutogrow);
    }

    /**
     * Max storage allowed for a server.
     * 
     */
    @InputImport(name="storageMB")
        private final @Nullable Integer storageMB;

    public Optional<Integer> getStorageMB() {
        return this.storageMB == null ? Optional.empty() : Optional.ofNullable(this.storageMB);
    }

    public StorageProfileResponse(
        @Nullable Integer backupRetentionDays,
        @Nullable String geoRedundantBackup,
        @Nullable String storageAutogrow,
        @Nullable Integer storageMB) {
        this.backupRetentionDays = backupRetentionDays;
        this.geoRedundantBackup = geoRedundantBackup;
        this.storageAutogrow = storageAutogrow;
        this.storageMB = storageMB;
    }

    private StorageProfileResponse() {
        this.backupRetentionDays = null;
        this.geoRedundantBackup = null;
        this.storageAutogrow = null;
        this.storageMB = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer backupRetentionDays;
        private @Nullable String geoRedundantBackup;
        private @Nullable String storageAutogrow;
        private @Nullable Integer storageMB;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupRetentionDays = defaults.backupRetentionDays;
    	      this.geoRedundantBackup = defaults.geoRedundantBackup;
    	      this.storageAutogrow = defaults.storageAutogrow;
    	      this.storageMB = defaults.storageMB;
        }

        public Builder setBackupRetentionDays(@Nullable Integer backupRetentionDays) {
            this.backupRetentionDays = backupRetentionDays;
            return this;
        }

        public Builder setGeoRedundantBackup(@Nullable String geoRedundantBackup) {
            this.geoRedundantBackup = geoRedundantBackup;
            return this;
        }

        public Builder setStorageAutogrow(@Nullable String storageAutogrow) {
            this.storageAutogrow = storageAutogrow;
            return this;
        }

        public Builder setStorageMB(@Nullable Integer storageMB) {
            this.storageMB = storageMB;
            return this;
        }
        public StorageProfileResponse build() {
            return new StorageProfileResponse(backupRetentionDays, geoRedundantBackup, storageAutogrow, storageMB);
        }
    }
}
