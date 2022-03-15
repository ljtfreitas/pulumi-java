// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.azurenative.sqlvirtualmachine.enums.DiskConfigurationType;
import io.pulumi.azurenative.sqlvirtualmachine.enums.StorageWorkloadType;
import io.pulumi.azurenative.sqlvirtualmachine.inputs.SQLStorageSettingsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Storage Configurations for SQL Data, Log and TempDb.
 * 
 */
public final class StorageConfigurationSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageConfigurationSettingsArgs Empty = new StorageConfigurationSettingsArgs();

    /**
     * Disk configuration to apply to SQL Server.
     * 
     */
    @Import(name="diskConfigurationType")
      private final @Nullable Output<Either<String,DiskConfigurationType>> diskConfigurationType;

    public Output<Either<String,DiskConfigurationType>> getDiskConfigurationType() {
        return this.diskConfigurationType == null ? Output.empty() : this.diskConfigurationType;
    }

    /**
     * SQL Server Data Storage Settings.
     * 
     */
    @Import(name="sqlDataSettings")
      private final @Nullable Output<SQLStorageSettingsArgs> sqlDataSettings;

    public Output<SQLStorageSettingsArgs> getSqlDataSettings() {
        return this.sqlDataSettings == null ? Output.empty() : this.sqlDataSettings;
    }

    /**
     * SQL Server Log Storage Settings.
     * 
     */
    @Import(name="sqlLogSettings")
      private final @Nullable Output<SQLStorageSettingsArgs> sqlLogSettings;

    public Output<SQLStorageSettingsArgs> getSqlLogSettings() {
        return this.sqlLogSettings == null ? Output.empty() : this.sqlLogSettings;
    }

    /**
     * SQL Server TempDb Storage Settings.
     * 
     */
    @Import(name="sqlTempDbSettings")
      private final @Nullable Output<SQLStorageSettingsArgs> sqlTempDbSettings;

    public Output<SQLStorageSettingsArgs> getSqlTempDbSettings() {
        return this.sqlTempDbSettings == null ? Output.empty() : this.sqlTempDbSettings;
    }

    /**
     * Storage workload type.
     * 
     */
    @Import(name="storageWorkloadType")
      private final @Nullable Output<Either<String,StorageWorkloadType>> storageWorkloadType;

    public Output<Either<String,StorageWorkloadType>> getStorageWorkloadType() {
        return this.storageWorkloadType == null ? Output.empty() : this.storageWorkloadType;
    }

    public StorageConfigurationSettingsArgs(
        @Nullable Output<Either<String,DiskConfigurationType>> diskConfigurationType,
        @Nullable Output<SQLStorageSettingsArgs> sqlDataSettings,
        @Nullable Output<SQLStorageSettingsArgs> sqlLogSettings,
        @Nullable Output<SQLStorageSettingsArgs> sqlTempDbSettings,
        @Nullable Output<Either<String,StorageWorkloadType>> storageWorkloadType) {
        this.diskConfigurationType = diskConfigurationType;
        this.sqlDataSettings = sqlDataSettings;
        this.sqlLogSettings = sqlLogSettings;
        this.sqlTempDbSettings = sqlTempDbSettings;
        this.storageWorkloadType = storageWorkloadType;
    }

    private StorageConfigurationSettingsArgs() {
        this.diskConfigurationType = Output.empty();
        this.sqlDataSettings = Output.empty();
        this.sqlLogSettings = Output.empty();
        this.sqlTempDbSettings = Output.empty();
        this.storageWorkloadType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageConfigurationSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,DiskConfigurationType>> diskConfigurationType;
        private @Nullable Output<SQLStorageSettingsArgs> sqlDataSettings;
        private @Nullable Output<SQLStorageSettingsArgs> sqlLogSettings;
        private @Nullable Output<SQLStorageSettingsArgs> sqlTempDbSettings;
        private @Nullable Output<Either<String,StorageWorkloadType>> storageWorkloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageConfigurationSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskConfigurationType = defaults.diskConfigurationType;
    	      this.sqlDataSettings = defaults.sqlDataSettings;
    	      this.sqlLogSettings = defaults.sqlLogSettings;
    	      this.sqlTempDbSettings = defaults.sqlTempDbSettings;
    	      this.storageWorkloadType = defaults.storageWorkloadType;
        }

        public Builder diskConfigurationType(@Nullable Output<Either<String,DiskConfigurationType>> diskConfigurationType) {
            this.diskConfigurationType = diskConfigurationType;
            return this;
        }

        public Builder diskConfigurationType(@Nullable Either<String,DiskConfigurationType> diskConfigurationType) {
            this.diskConfigurationType = Output.ofNullable(diskConfigurationType);
            return this;
        }

        public Builder sqlDataSettings(@Nullable Output<SQLStorageSettingsArgs> sqlDataSettings) {
            this.sqlDataSettings = sqlDataSettings;
            return this;
        }

        public Builder sqlDataSettings(@Nullable SQLStorageSettingsArgs sqlDataSettings) {
            this.sqlDataSettings = Output.ofNullable(sqlDataSettings);
            return this;
        }

        public Builder sqlLogSettings(@Nullable Output<SQLStorageSettingsArgs> sqlLogSettings) {
            this.sqlLogSettings = sqlLogSettings;
            return this;
        }

        public Builder sqlLogSettings(@Nullable SQLStorageSettingsArgs sqlLogSettings) {
            this.sqlLogSettings = Output.ofNullable(sqlLogSettings);
            return this;
        }

        public Builder sqlTempDbSettings(@Nullable Output<SQLStorageSettingsArgs> sqlTempDbSettings) {
            this.sqlTempDbSettings = sqlTempDbSettings;
            return this;
        }

        public Builder sqlTempDbSettings(@Nullable SQLStorageSettingsArgs sqlTempDbSettings) {
            this.sqlTempDbSettings = Output.ofNullable(sqlTempDbSettings);
            return this;
        }

        public Builder storageWorkloadType(@Nullable Output<Either<String,StorageWorkloadType>> storageWorkloadType) {
            this.storageWorkloadType = storageWorkloadType;
            return this;
        }

        public Builder storageWorkloadType(@Nullable Either<String,StorageWorkloadType> storageWorkloadType) {
            this.storageWorkloadType = Output.ofNullable(storageWorkloadType);
            return this;
        }
        public StorageConfigurationSettingsArgs build() {
            return new StorageConfigurationSettingsArgs(diskConfigurationType, sqlDataSettings, sqlLogSettings, sqlTempDbSettings, storageWorkloadType);
        }
    }
}
