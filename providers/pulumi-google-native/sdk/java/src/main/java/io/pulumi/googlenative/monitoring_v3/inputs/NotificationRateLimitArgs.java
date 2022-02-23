// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Control over the rate of notifications sent to this alert policy's notification channels.
 * 
 */
public final class NotificationRateLimitArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationRateLimitArgs Empty = new NotificationRateLimitArgs();

    /**
     * Not more than one notification per period.
     * 
     */
    @InputImport(name="period")
      private final @Nullable Input<String> period;

    public Input<String> getPeriod() {
        return this.period == null ? Input.empty() : this.period;
    }

    public NotificationRateLimitArgs(@Nullable Input<String> period) {
        this.period = period;
    }

    private NotificationRateLimitArgs() {
        this.period = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRateLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> period;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationRateLimitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.period = defaults.period;
        }

        public Builder setPeriod(@Nullable Input<String> period) {
            this.period = period;
            return this;
        }

        public Builder setPeriod(@Nullable String period) {
            this.period = Input.ofNullable(period);
            return this;
        }
        public NotificationRateLimitArgs build() {
            return new NotificationRateLimitArgs(period);
        }
    }
}
