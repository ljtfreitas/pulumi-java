// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.DayOfWeek;
import io.pulumi.azurenative.recoveryservices.enums.ScheduleRunType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Simple policy schedule.
 * 
 */
public final class SimpleSchedulePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SimpleSchedulePolicyArgs Empty = new SimpleSchedulePolicyArgs();

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'SimpleSchedulePolicy'.
     * 
     */
    @InputImport(name="schedulePolicyType", required=true)
    private final Input<String> schedulePolicyType;

    public Input<String> getSchedulePolicyType() {
        return this.schedulePolicyType;
    }

    /**
     * List of days of week this schedule has to be run.
     * 
     */
    @InputImport(name="scheduleRunDays")
    private final @Nullable Input<List<DayOfWeek>> scheduleRunDays;

    public Input<List<DayOfWeek>> getScheduleRunDays() {
        return this.scheduleRunDays == null ? Input.empty() : this.scheduleRunDays;
    }

    /**
     * Frequency of the schedule operation of this policy.
     * 
     */
    @InputImport(name="scheduleRunFrequency")
    private final @Nullable Input<Either<String,ScheduleRunType>> scheduleRunFrequency;

    public Input<Either<String,ScheduleRunType>> getScheduleRunFrequency() {
        return this.scheduleRunFrequency == null ? Input.empty() : this.scheduleRunFrequency;
    }

    /**
     * List of times of day this schedule has to be run.
     * 
     */
    @InputImport(name="scheduleRunTimes")
    private final @Nullable Input<List<String>> scheduleRunTimes;

    public Input<List<String>> getScheduleRunTimes() {
        return this.scheduleRunTimes == null ? Input.empty() : this.scheduleRunTimes;
    }

    /**
     * At every number weeks this schedule has to be run.
     * 
     */
    @InputImport(name="scheduleWeeklyFrequency")
    private final @Nullable Input<Integer> scheduleWeeklyFrequency;

    public Input<Integer> getScheduleWeeklyFrequency() {
        return this.scheduleWeeklyFrequency == null ? Input.empty() : this.scheduleWeeklyFrequency;
    }

    public SimpleSchedulePolicyArgs(
        Input<String> schedulePolicyType,
        @Nullable Input<List<DayOfWeek>> scheduleRunDays,
        @Nullable Input<Either<String,ScheduleRunType>> scheduleRunFrequency,
        @Nullable Input<List<String>> scheduleRunTimes,
        @Nullable Input<Integer> scheduleWeeklyFrequency) {
        this.schedulePolicyType = Objects.requireNonNull(schedulePolicyType, "expected parameter 'schedulePolicyType' to be non-null");
        this.scheduleRunDays = scheduleRunDays;
        this.scheduleRunFrequency = scheduleRunFrequency;
        this.scheduleRunTimes = scheduleRunTimes;
        this.scheduleWeeklyFrequency = scheduleWeeklyFrequency;
    }

    private SimpleSchedulePolicyArgs() {
        this.schedulePolicyType = Input.empty();
        this.scheduleRunDays = Input.empty();
        this.scheduleRunFrequency = Input.empty();
        this.scheduleRunTimes = Input.empty();
        this.scheduleWeeklyFrequency = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SimpleSchedulePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> schedulePolicyType;
        private @Nullable Input<List<DayOfWeek>> scheduleRunDays;
        private @Nullable Input<Either<String,ScheduleRunType>> scheduleRunFrequency;
        private @Nullable Input<List<String>> scheduleRunTimes;
        private @Nullable Input<Integer> scheduleWeeklyFrequency;

        public Builder() {
    	      // Empty
        }

        public Builder(SimpleSchedulePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedulePolicyType = defaults.schedulePolicyType;
    	      this.scheduleRunDays = defaults.scheduleRunDays;
    	      this.scheduleRunFrequency = defaults.scheduleRunFrequency;
    	      this.scheduleRunTimes = defaults.scheduleRunTimes;
    	      this.scheduleWeeklyFrequency = defaults.scheduleWeeklyFrequency;
        }

        public Builder setSchedulePolicyType(Input<String> schedulePolicyType) {
            this.schedulePolicyType = Objects.requireNonNull(schedulePolicyType);
            return this;
        }

        public Builder setSchedulePolicyType(String schedulePolicyType) {
            this.schedulePolicyType = Input.of(Objects.requireNonNull(schedulePolicyType));
            return this;
        }

        public Builder setScheduleRunDays(@Nullable Input<List<DayOfWeek>> scheduleRunDays) {
            this.scheduleRunDays = scheduleRunDays;
            return this;
        }

        public Builder setScheduleRunDays(@Nullable List<DayOfWeek> scheduleRunDays) {
            this.scheduleRunDays = Input.ofNullable(scheduleRunDays);
            return this;
        }

        public Builder setScheduleRunFrequency(@Nullable Input<Either<String,ScheduleRunType>> scheduleRunFrequency) {
            this.scheduleRunFrequency = scheduleRunFrequency;
            return this;
        }

        public Builder setScheduleRunFrequency(@Nullable Either<String,ScheduleRunType> scheduleRunFrequency) {
            this.scheduleRunFrequency = Input.ofNullable(scheduleRunFrequency);
            return this;
        }

        public Builder setScheduleRunTimes(@Nullable Input<List<String>> scheduleRunTimes) {
            this.scheduleRunTimes = scheduleRunTimes;
            return this;
        }

        public Builder setScheduleRunTimes(@Nullable List<String> scheduleRunTimes) {
            this.scheduleRunTimes = Input.ofNullable(scheduleRunTimes);
            return this;
        }

        public Builder setScheduleWeeklyFrequency(@Nullable Input<Integer> scheduleWeeklyFrequency) {
            this.scheduleWeeklyFrequency = scheduleWeeklyFrequency;
            return this;
        }

        public Builder setScheduleWeeklyFrequency(@Nullable Integer scheduleWeeklyFrequency) {
            this.scheduleWeeklyFrequency = Input.ofNullable(scheduleWeeklyFrequency);
            return this;
        }

        public SimpleSchedulePolicyArgs build() {
            return new SimpleSchedulePolicyArgs(schedulePolicyType, scheduleRunDays, scheduleRunFrequency, scheduleRunTimes, scheduleWeeklyFrequency);
        }
    }
}
