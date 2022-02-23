// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appautoscaling.inputs;

import io.pulumi.aws.appautoscaling.inputs.ScheduledActionScalableTargetActionGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduledActionState extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledActionState Empty = new ScheduledActionState();

    /**
     * The Amazon Resource Name (ARN) of the scheduled action.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The date and time for the scheduled action to end in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
     * 
     */
    @InputImport(name="endTime")
    private final @Nullable Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime == null ? Input.empty() : this.endTime;
    }

    /**
     * The name of the scheduled action.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The identifier of the resource associated with the scheduled action. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ResourceId)
     * 
     */
    @InputImport(name="resourceId")
    private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    /**
     * The scalable dimension. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ScalableDimension) Example: ecs:service:DesiredCount
     * 
     */
    @InputImport(name="scalableDimension")
    private final @Nullable Input<String> scalableDimension;

    public Input<String> getScalableDimension() {
        return this.scalableDimension == null ? Input.empty() : this.scalableDimension;
    }

    /**
     * The new minimum and maximum capacity. You can set both values or just one. See below
     * 
     */
    @InputImport(name="scalableTargetAction")
    private final @Nullable Input<ScheduledActionScalableTargetActionGetArgs> scalableTargetAction;

    public Input<ScheduledActionScalableTargetActionGetArgs> getScalableTargetAction() {
        return this.scalableTargetAction == null ? Input.empty() : this.scalableTargetAction;
    }

    /**
     * The schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). Times for at expressions and cron expressions are evaluated using the time zone configured in `timezone`. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-Schedule)
     * 
     */
    @InputImport(name="schedule")
    private final @Nullable Input<String> schedule;

    public Input<String> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    /**
     * The namespace of the AWS service. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ServiceNamespace) Example: ecs
     * 
     */
    @InputImport(name="serviceNamespace")
    private final @Nullable Input<String> serviceNamespace;

    public Input<String> getServiceNamespace() {
        return this.serviceNamespace == null ? Input.empty() : this.serviceNamespace;
    }

    /**
     * The date and time for the scheduled action to start in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * The time zone used when setting a scheduled action by using an at or cron expression. Does not affect timezone for `start_time` and `end_time`. Valid values are the [canonical names of the IANA time zones supported by Joda-Time](https://www.joda.org/joda-time/timezones.html), such as `Etc/GMT+9` or `Pacific/Tahiti`. Default is `UTC`.
     * 
     */
    @InputImport(name="timezone")
    private final @Nullable Input<String> timezone;

    public Input<String> getTimezone() {
        return this.timezone == null ? Input.empty() : this.timezone;
    }

    public ScheduledActionState(
        @Nullable Input<String> arn,
        @Nullable Input<String> endTime,
        @Nullable Input<String> name,
        @Nullable Input<String> resourceId,
        @Nullable Input<String> scalableDimension,
        @Nullable Input<ScheduledActionScalableTargetActionGetArgs> scalableTargetAction,
        @Nullable Input<String> schedule,
        @Nullable Input<String> serviceNamespace,
        @Nullable Input<String> startTime,
        @Nullable Input<String> timezone) {
        this.arn = arn;
        this.endTime = endTime;
        this.name = name;
        this.resourceId = resourceId;
        this.scalableDimension = scalableDimension;
        this.scalableTargetAction = scalableTargetAction;
        this.schedule = schedule;
        this.serviceNamespace = serviceNamespace;
        this.startTime = startTime;
        this.timezone = timezone;
    }

    private ScheduledActionState() {
        this.arn = Input.empty();
        this.endTime = Input.empty();
        this.name = Input.empty();
        this.resourceId = Input.empty();
        this.scalableDimension = Input.empty();
        this.scalableTargetAction = Input.empty();
        this.schedule = Input.empty();
        this.serviceNamespace = Input.empty();
        this.startTime = Input.empty();
        this.timezone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> endTime;
        private @Nullable Input<String> name;
        private @Nullable Input<String> resourceId;
        private @Nullable Input<String> scalableDimension;
        private @Nullable Input<ScheduledActionScalableTargetActionGetArgs> scalableTargetAction;
        private @Nullable Input<String> schedule;
        private @Nullable Input<String> serviceNamespace;
        private @Nullable Input<String> startTime;
        private @Nullable Input<String> timezone;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.endTime = defaults.endTime;
    	      this.name = defaults.name;
    	      this.resourceId = defaults.resourceId;
    	      this.scalableDimension = defaults.scalableDimension;
    	      this.scalableTargetAction = defaults.scalableTargetAction;
    	      this.schedule = defaults.schedule;
    	      this.serviceNamespace = defaults.serviceNamespace;
    	      this.startTime = defaults.startTime;
    	      this.timezone = defaults.timezone;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setEndTime(@Nullable Input<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = Input.ofNullable(endTime);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public Builder setScalableDimension(@Nullable Input<String> scalableDimension) {
            this.scalableDimension = scalableDimension;
            return this;
        }

        public Builder setScalableDimension(@Nullable String scalableDimension) {
            this.scalableDimension = Input.ofNullable(scalableDimension);
            return this;
        }

        public Builder setScalableTargetAction(@Nullable Input<ScheduledActionScalableTargetActionGetArgs> scalableTargetAction) {
            this.scalableTargetAction = scalableTargetAction;
            return this;
        }

        public Builder setScalableTargetAction(@Nullable ScheduledActionScalableTargetActionGetArgs scalableTargetAction) {
            this.scalableTargetAction = Input.ofNullable(scalableTargetAction);
            return this;
        }

        public Builder setSchedule(@Nullable Input<String> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setSchedule(@Nullable String schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public Builder setServiceNamespace(@Nullable Input<String> serviceNamespace) {
            this.serviceNamespace = serviceNamespace;
            return this;
        }

        public Builder setServiceNamespace(@Nullable String serviceNamespace) {
            this.serviceNamespace = Input.ofNullable(serviceNamespace);
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

        public Builder setTimezone(@Nullable Input<String> timezone) {
            this.timezone = timezone;
            return this;
        }

        public Builder setTimezone(@Nullable String timezone) {
            this.timezone = Input.ofNullable(timezone);
            return this;
        }
        public ScheduledActionState build() {
            return new ScheduledActionState(arn, endTime, name, resourceId, scalableDimension, scalableTargetAction, schedule, serviceNamespace, startTime, timezone);
        }
    }
}
