// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.azurenative.devtestlab.outputs.DayDetailsResponse;
import io.pulumi.azurenative.devtestlab.outputs.HourDetailsResponse;
import io.pulumi.azurenative.devtestlab.outputs.NotificationSettingsResponse;
import io.pulumi.azurenative.devtestlab.outputs.WeekDetailsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScheduleCreationParameterResponse {
    /**
     * If the schedule will occur once each day of the week, specify the daily recurrence.
     * 
     */
    private final @Nullable DayDetailsResponse dailyRecurrence;
    /**
     * If the schedule will occur multiple times a day, specify the hourly recurrence.
     * 
     */
    private final @Nullable HourDetailsResponse hourlyRecurrence;
    /**
     * The location of the new virtual machine or environment
     * 
     */
    private final String location;
    /**
     * The name of the virtual machine or environment
     * 
     */
    private final @Nullable String name;
    /**
     * Notification settings.
     * 
     */
    private final @Nullable NotificationSettingsResponse notificationSettings;
    /**
     * The status of the schedule (i.e. Enabled, Disabled)
     * 
     */
    private final @Nullable String status;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The resource ID to which the schedule belongs
     * 
     */
    private final @Nullable String targetResourceId;
    /**
     * The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     * 
     */
    private final @Nullable String taskType;
    /**
     * The time zone ID (e.g. Pacific Standard time).
     * 
     */
    private final @Nullable String timeZoneId;
    /**
     * If the schedule will occur only some days of the week, specify the weekly recurrence.
     * 
     */
    private final @Nullable WeekDetailsResponse weeklyRecurrence;

    @CustomType.Constructor
    private ScheduleCreationParameterResponse(
        @CustomType.Parameter("dailyRecurrence") @Nullable DayDetailsResponse dailyRecurrence,
        @CustomType.Parameter("hourlyRecurrence") @Nullable HourDetailsResponse hourlyRecurrence,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("notificationSettings") @Nullable NotificationSettingsResponse notificationSettings,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("targetResourceId") @Nullable String targetResourceId,
        @CustomType.Parameter("taskType") @Nullable String taskType,
        @CustomType.Parameter("timeZoneId") @Nullable String timeZoneId,
        @CustomType.Parameter("weeklyRecurrence") @Nullable WeekDetailsResponse weeklyRecurrence) {
        this.dailyRecurrence = dailyRecurrence;
        this.hourlyRecurrence = hourlyRecurrence;
        this.location = location;
        this.name = name;
        this.notificationSettings = notificationSettings;
        this.status = status;
        this.tags = tags;
        this.targetResourceId = targetResourceId;
        this.taskType = taskType;
        this.timeZoneId = timeZoneId;
        this.weeklyRecurrence = weeklyRecurrence;
    }

    /**
     * If the schedule will occur once each day of the week, specify the daily recurrence.
     * 
    */
    public Optional<DayDetailsResponse> getDailyRecurrence() {
        return Optional.ofNullable(this.dailyRecurrence);
    }
    /**
     * If the schedule will occur multiple times a day, specify the hourly recurrence.
     * 
    */
    public Optional<HourDetailsResponse> getHourlyRecurrence() {
        return Optional.ofNullable(this.hourlyRecurrence);
    }
    /**
     * The location of the new virtual machine or environment
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the virtual machine or environment
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Notification settings.
     * 
    */
    public Optional<NotificationSettingsResponse> getNotificationSettings() {
        return Optional.ofNullable(this.notificationSettings);
    }
    /**
     * The status of the schedule (i.e. Enabled, Disabled)
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * The tags of the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The resource ID to which the schedule belongs
     * 
    */
    public Optional<String> getTargetResourceId() {
        return Optional.ofNullable(this.targetResourceId);
    }
    /**
     * The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     * 
    */
    public Optional<String> getTaskType() {
        return Optional.ofNullable(this.taskType);
    }
    /**
     * The time zone ID (e.g. Pacific Standard time).
     * 
    */
    public Optional<String> getTimeZoneId() {
        return Optional.ofNullable(this.timeZoneId);
    }
    /**
     * If the schedule will occur only some days of the week, specify the weekly recurrence.
     * 
    */
    public Optional<WeekDetailsResponse> getWeeklyRecurrence() {
        return Optional.ofNullable(this.weeklyRecurrence);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleCreationParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DayDetailsResponse dailyRecurrence;
        private @Nullable HourDetailsResponse hourlyRecurrence;
        private String location;
        private @Nullable String name;
        private @Nullable NotificationSettingsResponse notificationSettings;
        private @Nullable String status;
        private @Nullable Map<String,String> tags;
        private @Nullable String targetResourceId;
        private @Nullable String taskType;
        private @Nullable String timeZoneId;
        private @Nullable WeekDetailsResponse weeklyRecurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleCreationParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyRecurrence = defaults.dailyRecurrence;
    	      this.hourlyRecurrence = defaults.hourlyRecurrence;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.notificationSettings = defaults.notificationSettings;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.targetResourceId = defaults.targetResourceId;
    	      this.taskType = defaults.taskType;
    	      this.timeZoneId = defaults.timeZoneId;
    	      this.weeklyRecurrence = defaults.weeklyRecurrence;
        }

        public Builder dailyRecurrence(@Nullable DayDetailsResponse dailyRecurrence) {
            this.dailyRecurrence = dailyRecurrence;
            return this;
        }

        public Builder hourlyRecurrence(@Nullable HourDetailsResponse hourlyRecurrence) {
            this.hourlyRecurrence = hourlyRecurrence;
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder notificationSettings(@Nullable NotificationSettingsResponse notificationSettings) {
            this.notificationSettings = notificationSettings;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder targetResourceId(@Nullable String targetResourceId) {
            this.targetResourceId = targetResourceId;
            return this;
        }

        public Builder taskType(@Nullable String taskType) {
            this.taskType = taskType;
            return this;
        }

        public Builder timeZoneId(@Nullable String timeZoneId) {
            this.timeZoneId = timeZoneId;
            return this;
        }

        public Builder weeklyRecurrence(@Nullable WeekDetailsResponse weeklyRecurrence) {
            this.weeklyRecurrence = weeklyRecurrence;
            return this;
        }
        public ScheduleCreationParameterResponse build() {
            return new ScheduleCreationParameterResponse(dailyRecurrence, hourlyRecurrence, location, name, notificationSettings, status, tags, targetResourceId, taskType, timeZoneId, weeklyRecurrence);
        }
    }
}
