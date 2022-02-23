// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="autoClose")
        private final @Nullable Input<String> autoClose;

    public Input<String> getAutoClose() {
        return this.autoClose == null ? Input.empty() : this.autoClose;
    }

    /**
     * Required for alert policies with a LogMatch condition.
     * This limit is not implemented for alert policies that are not log-based.
     * Structure is documented below.
     * 
     */
    @InputImport(name="notificationRateLimit")
        private final @Nullable Input<AlertPolicyAlertStrategyNotificationRateLimitGetArgs> notificationRateLimit;

    public Input<AlertPolicyAlertStrategyNotificationRateLimitGetArgs> getNotificationRateLimit() {
        return this.notificationRateLimit == null ? Input.empty() : this.notificationRateLimit;
    }

    public AlertPolicyAlertStrategyGetArgs(
        @Nullable Input<String> autoClose,
        @Nullable Input<AlertPolicyAlertStrategyNotificationRateLimitGetArgs> notificationRateLimit) {
        this.autoClose = autoClose;
        this.notificationRateLimit = notificationRateLimit;
    }

    private AlertPolicyAlertStrategyGetArgs() {
        this.autoClose = Input.empty();
        this.notificationRateLimit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyAlertStrategyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> autoClose;
        private @Nullable Input<AlertPolicyAlertStrategyNotificationRateLimitGetArgs> notificationRateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyAlertStrategyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoClose = defaults.autoClose;
    	      this.notificationRateLimit = defaults.notificationRateLimit;
        }

        public Builder setAutoClose(@Nullable Input<String> autoClose) {
            this.autoClose = autoClose;
            return this;
        }

        public Builder setAutoClose(@Nullable String autoClose) {
            this.autoClose = Input.ofNullable(autoClose);
            return this;
        }

        public Builder setNotificationRateLimit(@Nullable Input<AlertPolicyAlertStrategyNotificationRateLimitGetArgs> notificationRateLimit) {
            this.notificationRateLimit = notificationRateLimit;
            return this;
        }

        public Builder setNotificationRateLimit(@Nullable AlertPolicyAlertStrategyNotificationRateLimitGetArgs notificationRateLimit) {
            this.notificationRateLimit = Input.ofNullable(notificationRateLimit);
            return this;
        }
        public AlertPolicyAlertStrategyGetArgs build() {
            return new AlertPolicyAlertStrategyGetArgs(autoClose, notificationRateLimit);
        }
    }
}
