// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyAlertStrategyNotificationRateLimitGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertPolicyAlertStrategyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertPolicyAlertStrategyGetArgs Empty = new AlertPolicyAlertStrategyGetArgs();

    /**
     * If an alert policy that was active has no data for this long, any open incidents will close.
     * 
     */
    @Import(name="autoClose")
      private final @Nullable Output<String> autoClose;

    public Output<String> getAutoClose() {
        return this.autoClose == null ? Output.empty() : this.autoClose;
    }

    /**
     * Required for alert policies with a LogMatch condition.
     * This limit is not implemented for alert policies that are not log-based.
     * Structure is documented below.
     * 
     */
    @Import(name="notificationRateLimit")
      private final @Nullable Output<AlertPolicyAlertStrategyNotificationRateLimitGetArgs> notificationRateLimit;

    public Output<AlertPolicyAlertStrategyNotificationRateLimitGetArgs> getNotificationRateLimit() {
        return this.notificationRateLimit == null ? Output.empty() : this.notificationRateLimit;
    }

    public AlertPolicyAlertStrategyGetArgs(
        @Nullable Output<String> autoClose,
        @Nullable Output<AlertPolicyAlertStrategyNotificationRateLimitGetArgs> notificationRateLimit) {
        this.autoClose = autoClose;
        this.notificationRateLimit = notificationRateLimit;
    }

    private AlertPolicyAlertStrategyGetArgs() {
        this.autoClose = Output.empty();
        this.notificationRateLimit = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyAlertStrategyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> autoClose;
        private @Nullable Output<AlertPolicyAlertStrategyNotificationRateLimitGetArgs> notificationRateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyAlertStrategyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoClose = defaults.autoClose;
    	      this.notificationRateLimit = defaults.notificationRateLimit;
        }

        public Builder autoClose(@Nullable Output<String> autoClose) {
            this.autoClose = autoClose;
            return this;
        }

        public Builder autoClose(@Nullable String autoClose) {
            this.autoClose = Output.ofNullable(autoClose);
            return this;
        }

        public Builder notificationRateLimit(@Nullable Output<AlertPolicyAlertStrategyNotificationRateLimitGetArgs> notificationRateLimit) {
            this.notificationRateLimit = notificationRateLimit;
            return this;
        }

        public Builder notificationRateLimit(@Nullable AlertPolicyAlertStrategyNotificationRateLimitGetArgs notificationRateLimit) {
            this.notificationRateLimit = Output.ofNullable(notificationRateLimit);
            return this;
        }
        public AlertPolicyAlertStrategyGetArgs build() {
            return new AlertPolicyAlertStrategyGetArgs(autoClose, notificationRateLimit);
        }
    }
}
