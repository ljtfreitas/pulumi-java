// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.iot.enums.ScheduledAuditDayOfWeek;
import io.pulumi.awsnative.iot.enums.ScheduledAuditFrequency;
import io.pulumi.awsnative.iot.inputs.ScheduledAuditTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduledAuditArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledAuditArgs Empty = new ScheduledAuditArgs();

    /**
     * The day of the month on which the scheduled audit takes place. Can be 1 through 31 or LAST. This field is required if the frequency parameter is set to MONTHLY.
     * 
     */
    @InputImport(name="dayOfMonth")
        private final @Nullable Input<String> dayOfMonth;

    public Input<String> getDayOfMonth() {
        return this.dayOfMonth == null ? Input.empty() : this.dayOfMonth;
    }

    /**
     * The day of the week on which the scheduled audit takes place. Can be one of SUN, MON, TUE,WED, THU, FRI, or SAT. This field is required if the frequency parameter is set to WEEKLY or BIWEEKLY.
     * 
     */
    @InputImport(name="dayOfWeek")
        private final @Nullable Input<ScheduledAuditDayOfWeek> dayOfWeek;

    public Input<ScheduledAuditDayOfWeek> getDayOfWeek() {
        return this.dayOfWeek == null ? Input.empty() : this.dayOfWeek;
    }

    /**
     * How often the scheduled audit takes place. Can be one of DAILY, WEEKLY, BIWEEKLY, or MONTHLY.
     * 
     */
    @InputImport(name="frequency", required=true)
        private final Input<ScheduledAuditFrequency> frequency;

    public Input<ScheduledAuditFrequency> getFrequency() {
        return this.frequency;
    }

    /**
     * The name you want to give to the scheduled audit.
     * 
     */
    @InputImport(name="scheduledAuditName")
        private final @Nullable Input<String> scheduledAuditName;

    public Input<String> getScheduledAuditName() {
        return this.scheduledAuditName == null ? Input.empty() : this.scheduledAuditName;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<List<ScheduledAuditTagArgs>> tags;

    public Input<List<ScheduledAuditTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Which checks are performed during the scheduled audit. Checks must be enabled for your account.
     * 
     */
    @InputImport(name="targetCheckNames", required=true)
        private final Input<List<String>> targetCheckNames;

    public Input<List<String>> getTargetCheckNames() {
        return this.targetCheckNames;
    }

    public ScheduledAuditArgs(
        @Nullable Input<String> dayOfMonth,
        @Nullable Input<ScheduledAuditDayOfWeek> dayOfWeek,
        Input<ScheduledAuditFrequency> frequency,
        @Nullable Input<String> scheduledAuditName,
        @Nullable Input<List<ScheduledAuditTagArgs>> tags,
        Input<List<String>> targetCheckNames) {
        this.dayOfMonth = dayOfMonth;
        this.dayOfWeek = dayOfWeek;
        this.frequency = Objects.requireNonNull(frequency, "expected parameter 'frequency' to be non-null");
        this.scheduledAuditName = scheduledAuditName;
        this.tags = tags;
        this.targetCheckNames = Objects.requireNonNull(targetCheckNames, "expected parameter 'targetCheckNames' to be non-null");
    }

    private ScheduledAuditArgs() {
        this.dayOfMonth = Input.empty();
        this.dayOfWeek = Input.empty();
        this.frequency = Input.empty();
        this.scheduledAuditName = Input.empty();
        this.tags = Input.empty();
        this.targetCheckNames = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledAuditArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dayOfMonth;
        private @Nullable Input<ScheduledAuditDayOfWeek> dayOfWeek;
        private Input<ScheduledAuditFrequency> frequency;
        private @Nullable Input<String> scheduledAuditName;
        private @Nullable Input<List<ScheduledAuditTagArgs>> tags;
        private Input<List<String>> targetCheckNames;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledAuditArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfMonth = defaults.dayOfMonth;
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.frequency = defaults.frequency;
    	      this.scheduledAuditName = defaults.scheduledAuditName;
    	      this.tags = defaults.tags;
    	      this.targetCheckNames = defaults.targetCheckNames;
        }

        public Builder setDayOfMonth(@Nullable Input<String> dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
            return this;
        }

        public Builder setDayOfMonth(@Nullable String dayOfMonth) {
            this.dayOfMonth = Input.ofNullable(dayOfMonth);
            return this;
        }

        public Builder setDayOfWeek(@Nullable Input<ScheduledAuditDayOfWeek> dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }

        public Builder setDayOfWeek(@Nullable ScheduledAuditDayOfWeek dayOfWeek) {
            this.dayOfWeek = Input.ofNullable(dayOfWeek);
            return this;
        }

        public Builder setFrequency(Input<ScheduledAuditFrequency> frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }

        public Builder setFrequency(ScheduledAuditFrequency frequency) {
            this.frequency = Input.of(Objects.requireNonNull(frequency));
            return this;
        }

        public Builder setScheduledAuditName(@Nullable Input<String> scheduledAuditName) {
            this.scheduledAuditName = scheduledAuditName;
            return this;
        }

        public Builder setScheduledAuditName(@Nullable String scheduledAuditName) {
            this.scheduledAuditName = Input.ofNullable(scheduledAuditName);
            return this;
        }

        public Builder setTags(@Nullable Input<List<ScheduledAuditTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ScheduledAuditTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTargetCheckNames(Input<List<String>> targetCheckNames) {
            this.targetCheckNames = Objects.requireNonNull(targetCheckNames);
            return this;
        }

        public Builder setTargetCheckNames(List<String> targetCheckNames) {
            this.targetCheckNames = Input.of(Objects.requireNonNull(targetCheckNames));
            return this;
        }
        public ScheduledAuditArgs build() {
            return new ScheduledAuditArgs(dayOfMonth, dayOfWeek, frequency, scheduledAuditName, tags, targetCheckNames);
        }
    }
}
