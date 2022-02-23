// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.aws.elasticsearch.inputs.DomainAutoTuneOptionsMaintenanceScheduleDurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DomainAutoTuneOptionsMaintenanceScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainAutoTuneOptionsMaintenanceScheduleArgs Empty = new DomainAutoTuneOptionsMaintenanceScheduleArgs();

    /**
     * A cron expression specifying the recurrence pattern for an Auto-Tune maintenance schedule.
     * 
     */
    @InputImport(name="cronExpressionForRecurrence", required=true)
    private final Input<String> cronExpressionForRecurrence;

    public Input<String> getCronExpressionForRecurrence() {
        return this.cronExpressionForRecurrence;
    }

    /**
     * Configuration block for the duration of the Auto-Tune maintenance window. Detailed below.
     * 
     */
    @InputImport(name="duration", required=true)
    private final Input<DomainAutoTuneOptionsMaintenanceScheduleDurationArgs> duration;

    public Input<DomainAutoTuneOptionsMaintenanceScheduleDurationArgs> getDuration() {
        return this.duration;
    }

    /**
     * Date and time at which to start the Auto-Tune maintenance schedule in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @InputImport(name="startAt", required=true)
    private final Input<String> startAt;

    public Input<String> getStartAt() {
        return this.startAt;
    }

    public DomainAutoTuneOptionsMaintenanceScheduleArgs(
        Input<String> cronExpressionForRecurrence,
        Input<DomainAutoTuneOptionsMaintenanceScheduleDurationArgs> duration,
        Input<String> startAt) {
        this.cronExpressionForRecurrence = Objects.requireNonNull(cronExpressionForRecurrence, "expected parameter 'cronExpressionForRecurrence' to be non-null");
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.startAt = Objects.requireNonNull(startAt, "expected parameter 'startAt' to be non-null");
    }

    private DomainAutoTuneOptionsMaintenanceScheduleArgs() {
        this.cronExpressionForRecurrence = Input.empty();
        this.duration = Input.empty();
        this.startAt = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainAutoTuneOptionsMaintenanceScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cronExpressionForRecurrence;
        private Input<DomainAutoTuneOptionsMaintenanceScheduleDurationArgs> duration;
        private Input<String> startAt;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainAutoTuneOptionsMaintenanceScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cronExpressionForRecurrence = defaults.cronExpressionForRecurrence;
    	      this.duration = defaults.duration;
    	      this.startAt = defaults.startAt;
        }

        public Builder setCronExpressionForRecurrence(Input<String> cronExpressionForRecurrence) {
            this.cronExpressionForRecurrence = Objects.requireNonNull(cronExpressionForRecurrence);
            return this;
        }

        public Builder setCronExpressionForRecurrence(String cronExpressionForRecurrence) {
            this.cronExpressionForRecurrence = Input.of(Objects.requireNonNull(cronExpressionForRecurrence));
            return this;
        }

        public Builder setDuration(Input<DomainAutoTuneOptionsMaintenanceScheduleDurationArgs> duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setDuration(DomainAutoTuneOptionsMaintenanceScheduleDurationArgs duration) {
            this.duration = Input.of(Objects.requireNonNull(duration));
            return this;
        }

        public Builder setStartAt(Input<String> startAt) {
            this.startAt = Objects.requireNonNull(startAt);
            return this;
        }

        public Builder setStartAt(String startAt) {
            this.startAt = Input.of(Objects.requireNonNull(startAt));
            return this;
        }
        public DomainAutoTuneOptionsMaintenanceScheduleArgs build() {
            return new DomainAutoTuneOptionsMaintenanceScheduleArgs(cronExpressionForRecurrence, duration, startAt);
        }
    }
}
