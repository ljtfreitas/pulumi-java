// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.sqladmin_v1beta4.outputs.BackupRetentionSettingsResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BackupConfigurationResponse {
    /**
     * Backup retention settings.
     * 
     */
    private final BackupRetentionSettingsResponse backupRetentionSettings;
    /**
     * (MySQL only) Whether binary log is enabled. If backup configuration is disabled, binarylog must be disabled as well.
     * 
     */
    private final Boolean binaryLogEnabled;
    /**
     * Whether this configuration is enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * This is always `sql#backupConfiguration`.
     * 
     */
    private final String kind;
    /**
     * Location of the backup
     * 
     */
    private final String location;
    /**
     * (Postgres only) Whether point in time recovery is enabled.
     * 
     */
    private final Boolean pointInTimeRecoveryEnabled;
    /**
     * Reserved for future use.
     * 
     */
    private final Boolean replicationLogArchivingEnabled;
    /**
     * Start time for the daily backup configuration in UTC timezone in the 24 hour format - `HH:MM`.
     * 
     */
    private final String startTime;
    /**
     * The number of days of transaction logs we retain for point in time restore, from 1-7.
     * 
     */
    private final Integer transactionLogRetentionDays;

    @CustomType.Constructor
    private BackupConfigurationResponse(
        @CustomType.Parameter("backupRetentionSettings") BackupRetentionSettingsResponse backupRetentionSettings,
        @CustomType.Parameter("binaryLogEnabled") Boolean binaryLogEnabled,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("pointInTimeRecoveryEnabled") Boolean pointInTimeRecoveryEnabled,
        @CustomType.Parameter("replicationLogArchivingEnabled") Boolean replicationLogArchivingEnabled,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("transactionLogRetentionDays") Integer transactionLogRetentionDays) {
        this.backupRetentionSettings = backupRetentionSettings;
        this.binaryLogEnabled = binaryLogEnabled;
        this.enabled = enabled;
        this.kind = kind;
        this.location = location;
        this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
        this.replicationLogArchivingEnabled = replicationLogArchivingEnabled;
        this.startTime = startTime;
        this.transactionLogRetentionDays = transactionLogRetentionDays;
    }

    /**
     * Backup retention settings.
     * 
    */
    public BackupRetentionSettingsResponse getBackupRetentionSettings() {
        return this.backupRetentionSettings;
    }
    /**
     * (MySQL only) Whether binary log is enabled. If backup configuration is disabled, binarylog must be disabled as well.
     * 
    */
    public Boolean getBinaryLogEnabled() {
        return this.binaryLogEnabled;
    }
    /**
     * Whether this configuration is enabled.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * This is always `sql#backupConfiguration`.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Location of the backup
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * (Postgres only) Whether point in time recovery is enabled.
     * 
    */
    public Boolean getPointInTimeRecoveryEnabled() {
        return this.pointInTimeRecoveryEnabled;
    }
    /**
     * Reserved for future use.
     * 
    */
    public Boolean getReplicationLogArchivingEnabled() {
        return this.replicationLogArchivingEnabled;
    }
    /**
     * Start time for the daily backup configuration in UTC timezone in the 24 hour format - `HH:MM`.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * The number of days of transaction logs we retain for point in time restore, from 1-7.
     * 
    */
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

        public Builder backupRetentionSettings(BackupRetentionSettingsResponse backupRetentionSettings) {
            this.backupRetentionSettings = Objects.requireNonNull(backupRetentionSettings);
            return this;
        }

        public Builder binaryLogEnabled(Boolean binaryLogEnabled) {
            this.binaryLogEnabled = Objects.requireNonNull(binaryLogEnabled);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder pointInTimeRecoveryEnabled(Boolean pointInTimeRecoveryEnabled) {
            this.pointInTimeRecoveryEnabled = Objects.requireNonNull(pointInTimeRecoveryEnabled);
            return this;
        }

        public Builder replicationLogArchivingEnabled(Boolean replicationLogArchivingEnabled) {
            this.replicationLogArchivingEnabled = Objects.requireNonNull(replicationLogArchivingEnabled);
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder transactionLogRetentionDays(Integer transactionLogRetentionDays) {
            this.transactionLogRetentionDays = Objects.requireNonNull(transactionLogRetentionDays);
            return this;
        }
        public BackupConfigurationResponse build() {
            return new BackupConfigurationResponse(backupRetentionSettings, binaryLogEnabled, enabled, kind, location, pointInTimeRecoveryEnabled, replicationLogArchivingEnabled, startTime, transactionLogRetentionDays);
        }
    }
}
