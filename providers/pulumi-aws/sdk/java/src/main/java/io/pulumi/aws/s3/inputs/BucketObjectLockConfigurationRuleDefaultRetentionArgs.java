// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketObjectLockConfigurationRuleDefaultRetentionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketObjectLockConfigurationRuleDefaultRetentionArgs Empty = new BucketObjectLockConfigurationRuleDefaultRetentionArgs();

    /**
     * The number of days that you want to specify for the default retention period.
     * 
     */
    @InputImport(name="days")
    private final @Nullable Input<Integer> days;

    public Input<Integer> getDays() {
        return this.days == null ? Input.empty() : this.days;
    }

    /**
     * The default Object Lock retention mode you want to apply to new objects placed in this bucket. Valid values are `GOVERNANCE` and `COMPLIANCE`.
     * 
     */
    @InputImport(name="mode", required=true)
    private final Input<String> mode;

    public Input<String> getMode() {
        return this.mode;
    }

    /**
     * The number of years that you want to specify for the default retention period.
     * 
     */
    @InputImport(name="years")
    private final @Nullable Input<Integer> years;

    public Input<Integer> getYears() {
        return this.years == null ? Input.empty() : this.years;
    }

    public BucketObjectLockConfigurationRuleDefaultRetentionArgs(
        @Nullable Input<Integer> days,
        Input<String> mode,
        @Nullable Input<Integer> years) {
        this.days = days;
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.years = years;
    }

    private BucketObjectLockConfigurationRuleDefaultRetentionArgs() {
        this.days = Input.empty();
        this.mode = Input.empty();
        this.years = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketObjectLockConfigurationRuleDefaultRetentionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> days;
        private Input<String> mode;
        private @Nullable Input<Integer> years;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketObjectLockConfigurationRuleDefaultRetentionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.mode = defaults.mode;
    	      this.years = defaults.years;
        }

        public Builder setDays(@Nullable Input<Integer> days) {
            this.days = days;
            return this;
        }

        public Builder setDays(@Nullable Integer days) {
            this.days = Input.ofNullable(days);
            return this;
        }

        public Builder setMode(Input<String> mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = Input.of(Objects.requireNonNull(mode));
            return this;
        }

        public Builder setYears(@Nullable Input<Integer> years) {
            this.years = years;
            return this;
        }

        public Builder setYears(@Nullable Integer years) {
            this.years = Input.ofNullable(years);
            return this;
        }
        public BucketObjectLockConfigurationRuleDefaultRetentionArgs build() {
            return new BucketObjectLockConfigurationRuleDefaultRetentionArgs(days, mode, years);
        }
    }
}
