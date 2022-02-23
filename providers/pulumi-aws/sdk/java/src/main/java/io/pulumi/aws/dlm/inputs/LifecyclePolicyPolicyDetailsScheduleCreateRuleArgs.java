// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dlm.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs Empty = new LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs();

    /**
     * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     * 
     */
    @InputImport(name="interval", required=true)
    private final Input<Integer> interval;

    public Input<Integer> getInterval() {
        return this.interval;
    }

    /**
     * The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
     * 
     */
    @InputImport(name="intervalUnit")
    private final @Nullable Input<String> intervalUnit;

    public Input<String> getIntervalUnit() {
        return this.intervalUnit == null ? Input.empty() : this.intervalUnit;
    }

    /**
     * A list of times in 24 hour clock format that sets when the lifecycle policy should be evaluated. Max of 1.
     * 
     */
    @InputImport(name="times")
    private final @Nullable Input<String> times;

    public Input<String> getTimes() {
        return this.times == null ? Input.empty() : this.times;
    }

    public LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs(
        Input<Integer> interval,
        @Nullable Input<String> intervalUnit,
        @Nullable Input<String> times) {
        this.interval = Objects.requireNonNull(interval, "expected parameter 'interval' to be non-null");
        this.intervalUnit = intervalUnit;
        this.times = times;
    }

    private LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs() {
        this.interval = Input.empty();
        this.intervalUnit = Input.empty();
        this.times = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> interval;
        private @Nullable Input<String> intervalUnit;
        private @Nullable Input<String> times;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interval = defaults.interval;
    	      this.intervalUnit = defaults.intervalUnit;
    	      this.times = defaults.times;
        }

        public Builder setInterval(Input<Integer> interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }

        public Builder setInterval(Integer interval) {
            this.interval = Input.of(Objects.requireNonNull(interval));
            return this;
        }

        public Builder setIntervalUnit(@Nullable Input<String> intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }

        public Builder setIntervalUnit(@Nullable String intervalUnit) {
            this.intervalUnit = Input.ofNullable(intervalUnit);
            return this;
        }

        public Builder setTimes(@Nullable Input<String> times) {
            this.times = times;
            return this;
        }

        public Builder setTimes(@Nullable String times) {
            this.times = Input.ofNullable(times);
            return this;
        }
        public LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs build() {
            return new LifecyclePolicyPolicyDetailsScheduleCreateRuleArgs(interval, intervalUnit, times);
        }
    }
}
