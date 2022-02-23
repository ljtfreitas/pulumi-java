// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.azurenative.sqlvirtualmachine.enums.DiskConfigurationType;
import io.pulumi.azurenative.sqlvirtualmachine.enums.StorageWorkloadType;
import io.pulumi.azurenative.sqlvirtualmachine.inputs.SQLStorageSettingsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="diskConfigurationType")
        private final @Nullable Input<Either<String,DiskConfigurationType>> diskConfigurationType;

    public Input<Either<String,DiskConfigurationType>> getDiskConfigurationType() {
        return this.diskConfigurationType == null ? Input.empty() : this.diskConfigurationType;
    }

    /**
     * SQL Server Data Storage Settings.
     * 
     */
    @InputImport(name="sqlDataSettings")
        private final @Nullable Input<SQLStorageSettingsArgs> sqlDataSettings;

    public Input<SQLStorageSettingsArgs> getSqlDataSettings() {
        return this.sqlDataSettings == null ? Input.empty() : this.sqlDataSettings;
    }

    /**
     * SQL Server Log Storage Settings.
     * 
     */
    @InputImport(name="sqlLogSettings")
        private final @Nullable Input<SQLStorageSettingsArgs> sqlLogSettings;

    public Input<SQLStorageSettingsArgs> getSqlLogSettings() {
        return this.sqlLogSettings == null ? Input.empty() : this.sqlLogSettings;
    }

    /**
     * SQL Server TempDb Storage Settings.
     * 
     */
    @InputImport(name="sqlTempDbSettings")
        private final @Nullable Input<SQLStorageSettingsArgs> sqlTempDbSettings;

    public Input<SQLStorageSettingsArgs> getSqlTempDbSettings() {
        return this.sqlTempDbSettings == null ? Input.empty() : this.sqlTempDbSettings;
    }

    /**
     * Storage workload type.
     * 
     */
    @InputImport(name="storageWorkloadType")
        private final @Nullable Input<Either<String,StorageWorkloadType>> storageWorkloadType;

    public Input<Either<String,StorageWorkloadType>> getStorageWorkloadType() {
        return this.storageWorkloadType == null ? Input.empty() : this.storageWorkloadType;
    }

    public StorageConfigurationSettingsArgs(
        @Nullable Input<Either<String,DiskConfigurationType>> diskConfigurationType,
        @Nullable Input<SQLStorageSettingsArgs> sqlDataSettings,
        @Nullable Input<SQLStorageSettingsArgs> sqlLogSettings,
        @Nullable Input<SQLStorageSettingsArgs> sqlTempDbSettings,
        @Nullable Input<Either<String,StorageWorkloadType>> storageWorkloadType) {
        this.diskConfigurationType = diskConfigurationType;
        this.sqlDataSettings = sqlDataSettings;
        this.sqlLogSettings = sqlLogSettings;
        this.sqlTempDbSettings = sqlTempDbSettings;
        this.storageWorkloadType = storageWorkloadType;
    }

    private StorageConfigurationSettingsArgs() {
        this.diskConfigurationType = Input.empty();
        this.sqlDataSettings = Input.empty();
        this.sqlLogSettings = Input.empty();
        this.sqlTempDbSettings = Input.empty();
        this.storageWorkloadType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageConfigurationSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,DiskConfigurationType>> diskConfigurationType;
        private @Nullable Input<SQLStorageSettingsArgs> sqlDataSettings;
        private @Nullable Input<SQLStorageSettingsArgs> sqlLogSettings;
        private @Nullable Input<SQLStorageSettingsArgs> sqlTempDbSettings;
        private @Nullable Input<Either<String,StorageWorkloadType>> storageWorkloadType;

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

        public Builder setDiskConfigurationType(@Nullable Input<Either<String,DiskConfigurationType>> diskConfigurationType) {
            this.diskConfigurationType = diskConfigurationType;
            return this;
        }

        public Builder setDiskConfigurationType(@Nullable Either<String,DiskConfigurationType> diskConfigurationType) {
            this.diskConfigurationType = Input.ofNullable(diskConfigurationType);
            return this;
        }

        public Builder setSqlDataSettings(@Nullable Input<SQLStorageSettingsArgs> sqlDataSettings) {
            this.sqlDataSettings = sqlDataSettings;
            return this;
        }

        public Builder setSqlDataSettings(@Nullable SQLStorageSettingsArgs sqlDataSettings) {
            this.sqlDataSettings = Input.ofNullable(sqlDataSettings);
            return this;
        }

        public Builder setSqlLogSettings(@Nullable Input<SQLStorageSettingsArgs> sqlLogSettings) {
            this.sqlLogSettings = sqlLogSettings;
            return this;
        }

        public Builder setSqlLogSettings(@Nullable SQLStorageSettingsArgs sqlLogSettings) {
            this.sqlLogSettings = Input.ofNullable(sqlLogSettings);
            return this;
        }

        public Builder setSqlTempDbSettings(@Nullable Input<SQLStorageSettingsArgs> sqlTempDbSettings) {
            this.sqlTempDbSettings = sqlTempDbSettings;
            return this;
        }

        public Builder setSqlTempDbSettings(@Nullable SQLStorageSettingsArgs sqlTempDbSettings) {
            this.sqlTempDbSettings = Input.ofNullable(sqlTempDbSettings);
            return this;
        }

        public Builder setStorageWorkloadType(@Nullable Input<Either<String,StorageWorkloadType>> storageWorkloadType) {
            this.storageWorkloadType = storageWorkloadType;
            return this;
        }

        public Builder setStorageWorkloadType(@Nullable Either<String,StorageWorkloadType> storageWorkloadType) {
            this.storageWorkloadType = Input.ofNullable(storageWorkloadType);
            return this;
        }
        public StorageConfigurationSettingsArgs build() {
            return new StorageConfigurationSettingsArgs(diskConfigurationType, sqlDataSettings, sqlLogSettings, sqlTempDbSettings, storageWorkloadType);
        }
    }
}
