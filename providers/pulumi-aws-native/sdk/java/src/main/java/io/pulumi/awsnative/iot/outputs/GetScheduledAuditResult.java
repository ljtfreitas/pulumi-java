// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.enums.ScheduledAuditDayOfWeek;
import io.pulumi.awsnative.iot.enums.ScheduledAuditFrequency;
import io.pulumi.awsnative.iot.outputs.ScheduledAuditTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetScheduledAuditResult {
    /**
     * The day of the month on which the scheduled audit takes place. Can be 1 through 31 or LAST. This field is required if the frequency parameter is set to MONTHLY.
     * 
     */
    private final @Nullable String dayOfMonth;
    /**
     * The day of the week on which the scheduled audit takes place. Can be one of SUN, MON, TUE,WED, THU, FRI, or SAT. This field is required if the frequency parameter is set to WEEKLY or BIWEEKLY.
     * 
     */
    private final @Nullable ScheduledAuditDayOfWeek dayOfWeek;
    /**
     * How often the scheduled audit takes place. Can be one of DAILY, WEEKLY, BIWEEKLY, or MONTHLY.
     * 
     */
    private final @Nullable ScheduledAuditFrequency frequency;
    /**
     * The ARN (Amazon resource name) of the scheduled audit.
     * 
     */
    private final @Nullable String scheduledAuditArn;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<ScheduledAuditTag> tags;
    /**
     * Which checks are performed during the scheduled audit. Checks must be enabled for your account.
     * 
     */
    private final @Nullable List<String> targetCheckNames;

    @OutputCustomType.Constructor
    private GetScheduledAuditResult(
        @OutputCustomType.Parameter("dayOfMonth") @Nullable String dayOfMonth,
        @OutputCustomType.Parameter("dayOfWeek") @Nullable ScheduledAuditDayOfWeek dayOfWeek,
        @OutputCustomType.Parameter("frequency") @Nullable ScheduledAuditFrequency frequency,
        @OutputCustomType.Parameter("scheduledAuditArn") @Nullable String scheduledAuditArn,
        @OutputCustomType.Parameter("tags") @Nullable List<ScheduledAuditTag> tags,
        @OutputCustomType.Parameter("targetCheckNames") @Nullable List<String> targetCheckNames) {
        this.dayOfMonth = dayOfMonth;
        this.dayOfWeek = dayOfWeek;
        this.frequency = frequency;
        this.scheduledAuditArn = scheduledAuditArn;
        this.tags = tags;
        this.targetCheckNames = targetCheckNames;
    }

    /**
     * The day of the month on which the scheduled audit takes place. Can be 1 through 31 or LAST. This field is required if the frequency parameter is set to MONTHLY.
     * 
    */
    public Optional<String> getDayOfMonth() {
        return Optional.ofNullable(this.dayOfMonth);
    }
    /**
     * The day of the week on which the scheduled audit takes place. Can be one of SUN, MON, TUE,WED, THU, FRI, or SAT. This field is required if the frequency parameter is set to WEEKLY or BIWEEKLY.
     * 
    */
    public Optional<ScheduledAuditDayOfWeek> getDayOfWeek() {
        return Optional.ofNullable(this.dayOfWeek);
    }
    /**
     * How often the scheduled audit takes place. Can be one of DAILY, WEEKLY, BIWEEKLY, or MONTHLY.
     * 
    */
    public Optional<ScheduledAuditFrequency> getFrequency() {
        return Optional.ofNullable(this.frequency);
    }
    /**
     * The ARN (Amazon resource name) of the scheduled audit.
     * 
    */
    public Optional<String> getScheduledAuditArn() {
        return Optional.ofNullable(this.scheduledAuditArn);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<ScheduledAuditTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * Which checks are performed during the scheduled audit. Checks must be enabled for your account.
     * 
    */
    public List<String> getTargetCheckNames() {
        return this.targetCheckNames == null ? List.of() : this.targetCheckNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduledAuditResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dayOfMonth;
        private @Nullable ScheduledAuditDayOfWeek dayOfWeek;
        private @Nullable ScheduledAuditFrequency frequency;
        private @Nullable String scheduledAuditArn;
        private @Nullable List<ScheduledAuditTag> tags;
        private @Nullable List<String> targetCheckNames;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduledAuditResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfMonth = defaults.dayOfMonth;
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.frequency = defaults.frequency;
    	      this.scheduledAuditArn = defaults.scheduledAuditArn;
    	      this.tags = defaults.tags;
    	      this.targetCheckNames = defaults.targetCheckNames;
        }

        public Builder setDayOfMonth(@Nullable String dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
            return this;
        }

        public Builder setDayOfWeek(@Nullable ScheduledAuditDayOfWeek dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }

        public Builder setFrequency(@Nullable ScheduledAuditFrequency frequency) {
            this.frequency = frequency;
            return this;
        }

        public Builder setScheduledAuditArn(@Nullable String scheduledAuditArn) {
            this.scheduledAuditArn = scheduledAuditArn;
            return this;
        }

        public Builder setTags(@Nullable List<ScheduledAuditTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTargetCheckNames(@Nullable List<String> targetCheckNames) {
            this.targetCheckNames = targetCheckNames;
            return this;
        }
        public GetScheduledAuditResult build() {
            return new GetScheduledAuditResult(dayOfMonth, dayOfWeek, frequency, scheduledAuditArn, tags, targetCheckNames);
        }
    }
}
