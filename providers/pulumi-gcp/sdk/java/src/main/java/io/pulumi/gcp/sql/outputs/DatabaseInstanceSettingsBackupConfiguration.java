// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.sql.outputs.DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettings;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatabaseInstanceSettingsBackupConfiguration {
    private final @Nullable DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettings backupRetentionSettings;
    private final @Nullable Boolean binaryLogEnabled;
    private final @Nullable Boolean enabled;
    private final @Nullable String location;
    private final @Nullable Boolean pointInTimeRecoveryEnabled;
    private final @Nullable String startTime;
    private final @Nullable Integer transactionLogRetentionDays;

    @OutputCustomType.Constructor({"backupRetentionSettings","binaryLogEnabled","enabled","location","pointInTimeRecoveryEnabled","startTime","transactionLogRetentionDays"})
    private DatabaseInstanceSettingsBackupConfiguration(
        @Nullable DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettings backupRetentionSettings,
        @Nullable Boolean binaryLogEnabled,
        @Nullable Boolean enabled,
        @Nullable String location,
        @Nullable Boolean pointInTimeRecoveryEnabled,
        @Nullable String startTime,
        @Nullable Integer transactionLogRetentionDays) {
        this.backupRetentionSettings = backupRetentionSettings;
        this.binaryLogEnabled = binaryLogEnabled;
        this.enabled = enabled;
        this.location = location;
        this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
        this.startTime = startTime;
        this.transactionLogRetentionDays = transactionLogRetentionDays;
    }

    public Optional<DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettings> getBackupRetentionSettings() {
        return Optional.ofNullable(this.backupRetentionSettings);
    }
    public Optional<Boolean> getBinaryLogEnabled() {
        return Optional.ofNullable(this.binaryLogEnabled);
    }
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public Optional<Boolean> getPointInTimeRecoveryEnabled() {
        return Optional.ofNullable(this.pointInTimeRecoveryEnabled);
    }
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }
    public Optional<Integer> getTransactionLogRetentionDays() {
        return Optional.ofNullable(this.transactionLogRetentionDays);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceSettingsBackupConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettings backupRetentionSettings;
        private @Nullable Boolean binaryLogEnabled;
        private @Nullable Boolean enabled;
        private @Nullable String location;
        private @Nullable Boolean pointInTimeRecoveryEnabled;
        private @Nullable String startTime;
        private @Nullable Integer transactionLogRetentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceSettingsBackupConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupRetentionSettings = defaults.backupRetentionSettings;
    	      this.binaryLogEnabled = defaults.binaryLogEnabled;
    	      this.enabled = defaults.enabled;
    	      this.location = defaults.location;
    	      this.pointInTimeRecoveryEnabled = defaults.pointInTimeRecoveryEnabled;
    	      this.startTime = defaults.startTime;
    	      this.transactionLogRetentionDays = defaults.transactionLogRetentionDays;
        }

        public Builder setBackupRetentionSettings(@Nullable DatabaseInstanceSettingsBackupConfigurationBackupRetentionSettings backupRetentionSettings) {
            this.backupRetentionSettings = backupRetentionSettings;
            return this;
        }

        public Builder setBinaryLogEnabled(@Nullable Boolean binaryLogEnabled) {
            this.binaryLogEnabled = binaryLogEnabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setPointInTimeRecoveryEnabled(@Nullable Boolean pointInTimeRecoveryEnabled) {
            this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setTransactionLogRetentionDays(@Nullable Integer transactionLogRetentionDays) {
            this.transactionLogRetentionDays = transactionLogRetentionDays;
            return this;
        }

        public DatabaseInstanceSettingsBackupConfiguration build() {
            return new DatabaseInstanceSettingsBackupConfiguration(backupRetentionSettings, binaryLogEnabled, enabled, location, pointInTimeRecoveryEnabled, startTime, transactionLogRetentionDays);
        }
    }
}