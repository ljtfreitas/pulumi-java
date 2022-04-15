// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="autoClose")
      private final @Nullable Output<String> autoClose;

    public Output<String> autoClose() {
        return this.autoClose == null ? Codegen.empty() : this.autoClose;
    }

    /**
     * Required for alert policies with a LogMatch condition.
     * This limit is not implemented for alert policies that are not log-based.
     * Structure is documented below.
     * 
     */
    @Import(name="notificationRateLimit")
      private final @Nullable Output<AlertPolicyAlertStrategyNotificationRateLimitArgs> notificationRateLimit;

    public Output<AlertPolicyAlertStrategyNotificationRateLimitArgs> notificationRateLimit() {
        return this.notificationRateLimit == null ? Codegen.empty() : this.notificationRateLimit;
    }

    public AlertPolicyAlertStrategyArgs(
        @Nullable Output<String> autoClose,
        @Nullable Output<AlertPolicyAlertStrategyNotificationRateLimitArgs> notificationRateLimit) {
        this.autoClose = autoClose;
        this.notificationRateLimit = notificationRateLimit;
    }

    private AlertPolicyAlertStrategyArgs() {
        this.autoClose = Codegen.empty();
        this.notificationRateLimit = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyAlertStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> autoClose;
        private @Nullable Output<AlertPolicyAlertStrategyNotificationRateLimitArgs> notificationRateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyAlertStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoClose = defaults.autoClose;
    	      this.notificationRateLimit = defaults.notificationRateLimit;
        }

        public Builder autoClose(@Nullable Output<String> autoClose) {
            this.autoClose = autoClose;
            return this;
        }
        public Builder autoClose(@Nullable String autoClose) {
            this.autoClose = Codegen.ofNullable(autoClose);
            return this;
        }
        public Builder notificationRateLimit(@Nullable Output<AlertPolicyAlertStrategyNotificationRateLimitArgs> notificationRateLimit) {
            this.notificationRateLimit = notificationRateLimit;
            return this;
        }
        public Builder notificationRateLimit(@Nullable AlertPolicyAlertStrategyNotificationRateLimitArgs notificationRateLimit) {
            this.notificationRateLimit = Codegen.ofNullable(notificationRateLimit);
            return this;
        }        public AlertPolicyAlertStrategyArgs build() {
            return new AlertPolicyAlertStrategyArgs(autoClose, notificationRateLimit);
        }
    }
}
