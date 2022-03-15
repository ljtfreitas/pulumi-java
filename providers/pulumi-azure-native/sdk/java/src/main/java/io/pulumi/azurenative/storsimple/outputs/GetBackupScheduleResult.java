// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.outputs;

import io.pulumi.azurenative.storsimple.outputs.ScheduleRecurrenceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBackupScheduleResult {
    /**
     * The type of backup which needs to be taken.
     * 
     */
    private final String backupType;
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    private final @Nullable String kind;
    /**
     * The last successful backup run which was triggered for the schedule.
     * 
     */
    private final String lastSuccessfulRun;
    /**
     * The name of the object.
     * 
     */
    private final String name;
    /**
     * The number of backups to be retained.
     * 
     */
    private final Double retentionCount;
    /**
     * The schedule recurrence.
     * 
     */
    private final ScheduleRecurrenceResponse scheduleRecurrence;
    /**
     * The schedule status.
     * 
     */
    private final String scheduleStatus;
    /**
     * The start time of the schedule.
     * 
     */
    private final String startTime;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetBackupScheduleResult(
        @CustomType.Parameter("backupType") String backupType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("lastSuccessfulRun") String lastSuccessfulRun,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("retentionCount") Double retentionCount,
        @CustomType.Parameter("scheduleRecurrence") ScheduleRecurrenceResponse scheduleRecurrence,
        @CustomType.Parameter("scheduleStatus") String scheduleStatus,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("type") String type) {
        this.backupType = backupType;
        this.id = id;
        this.kind = kind;
        this.lastSuccessfulRun = lastSuccessfulRun;
        this.name = name;
        this.retentionCount = retentionCount;
        this.scheduleRecurrence = scheduleRecurrence;
        this.scheduleStatus = scheduleStatus;
        this.startTime = startTime;
        this.type = type;
    }

    /**
     * The type of backup which needs to be taken.
     * 
    */
    public String getBackupType() {
        return this.backupType;
    }
    /**
     * The path ID that uniquely identifies the object.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * The last successful backup run which was triggered for the schedule.
     * 
    */
    public String getLastSuccessfulRun() {
        return this.lastSuccessfulRun;
    }
    /**
     * The name of the object.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The number of backups to be retained.
     * 
    */
    public Double getRetentionCount() {
        return this.retentionCount;
    }
    /**
     * The schedule recurrence.
     * 
    */
    public ScheduleRecurrenceResponse getScheduleRecurrence() {
        return this.scheduleRecurrence;
    }
    /**
     * The schedule status.
     * 
    */
    public String getScheduleStatus() {
        return this.scheduleStatus;
    }
    /**
     * The start time of the schedule.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * The hierarchical type of the object.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupScheduleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupType;
        private String id;
        private @Nullable String kind;
        private String lastSuccessfulRun;
        private String name;
        private Double retentionCount;
        private ScheduleRecurrenceResponse scheduleRecurrence;
        private String scheduleStatus;
        private String startTime;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupScheduleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupType = defaults.backupType;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.lastSuccessfulRun = defaults.lastSuccessfulRun;
    	      this.name = defaults.name;
    	      this.retentionCount = defaults.retentionCount;
    	      this.scheduleRecurrence = defaults.scheduleRecurrence;
    	      this.scheduleStatus = defaults.scheduleStatus;
    	      this.startTime = defaults.startTime;
    	      this.type = defaults.type;
        }

        public Builder backupType(String backupType) {
            this.backupType = Objects.requireNonNull(backupType);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder lastSuccessfulRun(String lastSuccessfulRun) {
            this.lastSuccessfulRun = Objects.requireNonNull(lastSuccessfulRun);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder retentionCount(Double retentionCount) {
            this.retentionCount = Objects.requireNonNull(retentionCount);
            return this;
        }

        public Builder scheduleRecurrence(ScheduleRecurrenceResponse scheduleRecurrence) {
            this.scheduleRecurrence = Objects.requireNonNull(scheduleRecurrence);
            return this;
        }

        public Builder scheduleStatus(String scheduleStatus) {
            this.scheduleStatus = Objects.requireNonNull(scheduleStatus);
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetBackupScheduleResult build() {
            return new GetBackupScheduleResult(backupType, id, kind, lastSuccessfulRun, name, retentionCount, scheduleRecurrence, scheduleStatus, startTime, type);
        }
    }
}
