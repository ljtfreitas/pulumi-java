// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyAlertStrategyNotificationRateLimitArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertPolicyAlertStrategyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertPolicyAlertStrategyArgs Empty = new AlertPolicyAlertStrategyArgs();

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
        private final @Nullable Input<AlertPolicyAlertStrategyNotificationRateLimitArgs> notificationRateLimit;

    public Input<AlertPolicyAlertStrategyNotificationRateLimitArgs> getNotificationRateLimit() {
        return this.notificationRateLimit == null ? Input.empty() : this.notificationRateLimit;
    }

    public AlertPolicyAlertStrategyArgs(
        @Nullable Input<String> autoClose,
        @Nullable Input<AlertPolicyAlertStrategyNotificationRateLimitArgs> notificationRateLimit) {
        this.autoClose = autoClose;
        this.notificationRateLimit = notificationRateLimit;
    }

    private AlertPolicyAlertStrategyArgs() {
        this.autoClose = Input.empty();
        this.notificationRateLimit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyAlertStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> autoClose;
        private @Nullable Input<AlertPolicyAlertStrategyNotificationRateLimitArgs> notificationRateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyAlertStrategyArgs defaults) {
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

        public Builder setNotificationRateLimit(@Nullable Input<AlertPolicyAlertStrategyNotificationRateLimitArgs> notificationRateLimit) {
            this.notificationRateLimit = notificationRateLimit;
            return this;
        }

        public Builder setNotificationRateLimit(@Nullable AlertPolicyAlertStrategyNotificationRateLimitArgs notificationRateLimit) {
            this.notificationRateLimit = Input.ofNullable(notificationRateLimit);
            return this;
        }
        public AlertPolicyAlertStrategyArgs build() {
            return new AlertPolicyAlertStrategyArgs(autoClose, notificationRateLimit);
        }
    }
}
