// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.azure.storage.inputs.AccountQueuePropertiesCorsRuleArgs;
import com.pulumi.azure.storage.inputs.AccountQueuePropertiesHourMetricsArgs;
import com.pulumi.azure.storage.inputs.AccountQueuePropertiesLoggingArgs;
import com.pulumi.azure.storage.inputs.AccountQueuePropertiesMinuteMetricsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountQueuePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountQueuePropertiesArgs Empty = new AccountQueuePropertiesArgs();

    /**
     * A `cors_rule` block as defined above.
     * 
     */
    @Import(name="corsRules")
    private @Nullable Output<List<AccountQueuePropertiesCorsRuleArgs>> corsRules;

    /**
     * @return A `cors_rule` block as defined above.
     * 
     */
    public Optional<Output<List<AccountQueuePropertiesCorsRuleArgs>>> corsRules() {
        return Optional.ofNullable(this.corsRules);
    }

    /**
     * A `hour_metrics` block as defined below.
     * 
     */
    @Import(name="hourMetrics")
    private @Nullable Output<AccountQueuePropertiesHourMetricsArgs> hourMetrics;

    /**
     * @return A `hour_metrics` block as defined below.
     * 
     */
    public Optional<Output<AccountQueuePropertiesHourMetricsArgs>> hourMetrics() {
        return Optional.ofNullable(this.hourMetrics);
    }

    /**
     * A `logging` block as defined below.
     * 
     */
    @Import(name="logging")
    private @Nullable Output<AccountQueuePropertiesLoggingArgs> logging;

    /**
     * @return A `logging` block as defined below.
     * 
     */
    public Optional<Output<AccountQueuePropertiesLoggingArgs>> logging() {
        return Optional.ofNullable(this.logging);
    }

    /**
     * A `minute_metrics` block as defined below.
     * 
     */
    @Import(name="minuteMetrics")
    private @Nullable Output<AccountQueuePropertiesMinuteMetricsArgs> minuteMetrics;

    /**
     * @return A `minute_metrics` block as defined below.
     * 
     */
    public Optional<Output<AccountQueuePropertiesMinuteMetricsArgs>> minuteMetrics() {
        return Optional.ofNullable(this.minuteMetrics);
    }

    private AccountQueuePropertiesArgs() {}

    private AccountQueuePropertiesArgs(AccountQueuePropertiesArgs $) {
        this.corsRules = $.corsRules;
        this.hourMetrics = $.hourMetrics;
        this.logging = $.logging;
        this.minuteMetrics = $.minuteMetrics;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountQueuePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountQueuePropertiesArgs $;

        public Builder() {
            $ = new AccountQueuePropertiesArgs();
        }

        public Builder(AccountQueuePropertiesArgs defaults) {
            $ = new AccountQueuePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param corsRules A `cors_rule` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder corsRules(@Nullable Output<List<AccountQueuePropertiesCorsRuleArgs>> corsRules) {
            $.corsRules = corsRules;
            return this;
        }

        /**
         * @param corsRules A `cors_rule` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder corsRules(List<AccountQueuePropertiesCorsRuleArgs> corsRules) {
            return corsRules(Output.of(corsRules));
        }

        /**
         * @param corsRules A `cors_rule` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder corsRules(AccountQueuePropertiesCorsRuleArgs... corsRules) {
            return corsRules(List.of(corsRules));
        }

        /**
         * @param hourMetrics A `hour_metrics` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder hourMetrics(@Nullable Output<AccountQueuePropertiesHourMetricsArgs> hourMetrics) {
            $.hourMetrics = hourMetrics;
            return this;
        }

        /**
         * @param hourMetrics A `hour_metrics` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder hourMetrics(AccountQueuePropertiesHourMetricsArgs hourMetrics) {
            return hourMetrics(Output.of(hourMetrics));
        }

        /**
         * @param logging A `logging` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder logging(@Nullable Output<AccountQueuePropertiesLoggingArgs> logging) {
            $.logging = logging;
            return this;
        }

        /**
         * @param logging A `logging` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder logging(AccountQueuePropertiesLoggingArgs logging) {
            return logging(Output.of(logging));
        }

        /**
         * @param minuteMetrics A `minute_metrics` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder minuteMetrics(@Nullable Output<AccountQueuePropertiesMinuteMetricsArgs> minuteMetrics) {
            $.minuteMetrics = minuteMetrics;
            return this;
        }

        /**
         * @param minuteMetrics A `minute_metrics` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder minuteMetrics(AccountQueuePropertiesMinuteMetricsArgs minuteMetrics) {
            return minuteMetrics(Output.of(minuteMetrics));
        }

        public AccountQueuePropertiesArgs build() {
            return $;
        }
    }

}
