// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Any scheduled maintenancce for this instance.
 * 
 */
public final class SqlScheduledMaintenanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlScheduledMaintenanceArgs Empty = new SqlScheduledMaintenanceArgs();

    @InputImport(name="canDefer")
      private final @Nullable Input<Boolean> canDefer;

    public Input<Boolean> getCanDefer() {
        return this.canDefer == null ? Input.empty() : this.canDefer;
    }

    /**
     * If the scheduled maintenance can be rescheduled.
     * 
     */
    @InputImport(name="canReschedule")
      private final @Nullable Input<Boolean> canReschedule;

    public Input<Boolean> getCanReschedule() {
        return this.canReschedule == null ? Input.empty() : this.canReschedule;
    }

    /**
     * Maintenance cannot be rescheduled to start beyond this deadline.
     * 
     */
    @InputImport(name="scheduleDeadlineTime")
      private final @Nullable Input<String> scheduleDeadlineTime;

    public Input<String> getScheduleDeadlineTime() {
        return this.scheduleDeadlineTime == null ? Input.empty() : this.scheduleDeadlineTime;
    }

    /**
     * The start time of any upcoming scheduled maintenance for this instance.
     * 
     */
    @InputImport(name="startTime")
      private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    public SqlScheduledMaintenanceArgs(
        @Nullable Input<Boolean> canDefer,
        @Nullable Input<Boolean> canReschedule,
        @Nullable Input<String> scheduleDeadlineTime,
        @Nullable Input<String> startTime) {
        this.canDefer = canDefer;
        this.canReschedule = canReschedule;
        this.scheduleDeadlineTime = scheduleDeadlineTime;
        this.startTime = startTime;
    }

    private SqlScheduledMaintenanceArgs() {
        this.canDefer = Input.empty();
        this.canReschedule = Input.empty();
        this.scheduleDeadlineTime = Input.empty();
        this.startTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlScheduledMaintenanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> canDefer;
        private @Nullable Input<Boolean> canReschedule;
        private @Nullable Input<String> scheduleDeadlineTime;
        private @Nullable Input<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlScheduledMaintenanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canDefer = defaults.canDefer;
    	      this.canReschedule = defaults.canReschedule;
    	      this.scheduleDeadlineTime = defaults.scheduleDeadlineTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder setCanDefer(@Nullable Input<Boolean> canDefer) {
            this.canDefer = canDefer;
            return this;
        }

        public Builder setCanDefer(@Nullable Boolean canDefer) {
            this.canDefer = Input.ofNullable(canDefer);
            return this;
        }

        public Builder setCanReschedule(@Nullable Input<Boolean> canReschedule) {
            this.canReschedule = canReschedule;
            return this;
        }

        public Builder setCanReschedule(@Nullable Boolean canReschedule) {
            this.canReschedule = Input.ofNullable(canReschedule);
            return this;
        }

        public Builder setScheduleDeadlineTime(@Nullable Input<String> scheduleDeadlineTime) {
            this.scheduleDeadlineTime = scheduleDeadlineTime;
            return this;
        }

        public Builder setScheduleDeadlineTime(@Nullable String scheduleDeadlineTime) {
            this.scheduleDeadlineTime = Input.ofNullable(scheduleDeadlineTime);
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }
        public SqlScheduledMaintenanceArgs build() {
            return new SqlScheduledMaintenanceArgs(canDefer, canReschedule, scheduleDeadlineTime, startTime);
        }
    }
}
