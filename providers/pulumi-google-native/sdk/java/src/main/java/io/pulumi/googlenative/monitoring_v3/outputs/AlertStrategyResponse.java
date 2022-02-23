// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.monitoring_v3.outputs.NotificationRateLimitResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AlertStrategyResponse {
    /**
     * If an alert policy that was active has no data for this long, any open incidents will close
     * 
     */
    private final String autoClose;
    /**
     * Required for alert policies with a LogMatch condition.This limit is not implemented for alert policies that are not log-based.
     * 
     */
    private final NotificationRateLimitResponse notificationRateLimit;

    @OutputCustomType.Constructor({"autoClose","notificationRateLimit"})
    private AlertStrategyResponse(
        String autoClose,
        NotificationRateLimitResponse notificationRateLimit) {
        this.autoClose = Objects.requireNonNull(autoClose);
        this.notificationRateLimit = Objects.requireNonNull(notificationRateLimit);
    }

    /**
     * If an alert policy that was active has no data for this long, any open incidents will close
     * 
     */
    public String getAutoClose() {
        return this.autoClose;
    }
    /**
     * Required for alert policies with a LogMatch condition.This limit is not implemented for alert policies that are not log-based.
     * 
     */
    public NotificationRateLimitResponse getNotificationRateLimit() {
        return this.notificationRateLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertStrategyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoClose;
        private NotificationRateLimitResponse notificationRateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertStrategyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoClose = defaults.autoClose;
    	      this.notificationRateLimit = defaults.notificationRateLimit;
        }

        public Builder setAutoClose(String autoClose) {
            this.autoClose = Objects.requireNonNull(autoClose);
            return this;
        }

        public Builder setNotificationRateLimit(NotificationRateLimitResponse notificationRateLimit) {
            this.notificationRateLimit = Objects.requireNonNull(notificationRateLimit);
            return this;
        }
        public AlertStrategyResponse build() {
            return new AlertStrategyResponse(autoClose, notificationRateLimit);
        }
    }
}
