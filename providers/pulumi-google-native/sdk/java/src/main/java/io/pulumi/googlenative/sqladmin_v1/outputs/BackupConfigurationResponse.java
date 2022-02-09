// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.sqladmin_v1.outputs.BackupRetentionSettingsResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BackupConfigurationResponse {
    private final BackupRetentionSettingsResponse backupRetentionSettings;
    private final Boolean binaryLogEnabled;
    private final Boolean enabled;
    private final String kind;
    private final String location;
    private final Boolean pointInTimeRecoveryEnabled;
    private final Boolean replicationLogArchivingEnabled;
    private final String startTime;
    private final Integer transactionLogRetentionDays;

    @OutputCustomType.Constructor({"backupRetentionSettings","binaryLogEnabled","enabled","kind","location","pointInTimeRecoveryEnabled","replicationLogArchivingEnabled","startTime","transactionLogRetentionDays"})
    private BackupConfigurationResponse(
        BackupRetentionSettingsResponse backupRetentionSettings,
        Boolean binaryLogEnabled,
        Boolean enabled,
        String kind,
        String location,
        Boolean pointInTimeRecoveryEnabled,
        Boolean replicationLogArchivingEnabled,
        String startTime,
        Integer transactionLogRetentionDays) {
        this.backupRetentionSettings = Objects.requireNonNull(backupRetentionSettings);
        this.binaryLogEnabled = Objects.requireNonNull(binaryLogEnabled);
        this.enabled = Objects.requireNonNull(enabled);
        this.kind = Objects.requireNonNull(kind);
        this.location = Objects.requireNonNull(location);
        this.pointInTimeRecoveryEnabled = Objects.requireNonNull(pointInTimeRecoveryEnabled);
        this.replicationLogArchivingEnabled = Objects.requireNonNull(replicationLogArchivingEnabled);
        this.startTime = Objects.requireNonNull(startTime);
        this.transactionLogRetentionDays = Objects.requireNonNull(transactionLogRetentionDays);
    }

    public BackupRetentionSettingsResponse getBackupRetentionSettings() {
        return this.backupRetentionSettings;
    }
    public Boolean getBinaryLogEnabled() {
        return this.binaryLogEnabled;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }
    public String getKind() {
        return this.kind;
    }
    public String getLocation() {
        return this.location;
    }
    public Boolean getPointInTimeRecoveryEnabled() {
        return this.pointInTimeRecoveryEnabled;
    }
    public Boolean getReplicationLogArchivingEnabled() {
        return this.replicationLogArchivingEnabled;
    }
    public String getStartTime() {
        return this.startTime;
    }
    public Integer getTransactionLogRetentionDays() {
        return this.transactionLogRetentionDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupRetentionSettingsResponse backupRetentionSettings;
        private Boolean binaryLogEnabled;
        private Boolean enabled;
        private String kind;
        private String location;
        private Boolean pointInTimeRecoveryEnabled;
        private Boolean replicationLogArchivingEnabled;
        private String startTime;
        private Integer transactionLogRetentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupRetentionSettings = defaults.backupRetentionSettings;
    	      this.binaryLogEnabled = defaults.binaryLogEnabled;
    	      this.enabled = defaults.enabled;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.pointInTimeRecoveryEnabled = defaults.pointInTimeRecoveryEnabled;
    	      this.replicationLogArchivingEnabled = defaults.replicationLogArchivingEnabled;
    	      this.startTime = defaults.startTime;
    	      this.transactionLogRetentionDays = defaults.transactionLogRetentionDays;
        }

        public Builder setBackupRetentionSettings(BackupRetentionSettingsResponse backupRetentionSettings) {
            this.backupRetentionSettings = Objects.requireNonNull(backupRetentionSettings);
            return this;
        }

        public Builder setBinaryLogEnabled(Boolean binaryLogEnabled) {
            this.binaryLogEnabled = Objects.requireNonNull(binaryLogEnabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setPointInTimeRecoveryEnabled(Boolean pointInTimeRecoveryEnabled) {
            this.pointInTimeRecoveryEnabled = Objects.requireNonNull(pointInTimeRecoveryEnabled);
            return this;
        }

        public Builder setReplicationLogArchivingEnabled(Boolean replicationLogArchivingEnabled) {
            this.replicationLogArchivingEnabled = Objects.requireNonNull(replicationLogArchivingEnabled);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setTransactionLogRetentionDays(Integer transactionLogRetentionDays) {
            this.transactionLogRetentionDays = Objects.requireNonNull(transactionLogRetentionDays);
            return this;
        }

        public BackupConfigurationResponse build() {
            return new BackupConfigurationResponse(backupRetentionSettings, binaryLogEnabled, enabled, kind, location, pointInTimeRecoveryEnabled, replicationLogArchivingEnabled, startTime, transactionLogRetentionDays);
        }
    }
}