// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs Empty = new MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs();

    /**
     * A flag that indicates whether additional CloudWatch metrics are enabled for a given CloudFront distribution. Valid values are `Enabled` and `Disabled`. See below.
     * 
     */
    @InputImport(name="realtimeMetricsSubscriptionStatus", required=true)
    private final Input<String> realtimeMetricsSubscriptionStatus;

    public Input<String> getRealtimeMetricsSubscriptionStatus() {
        return this.realtimeMetricsSubscriptionStatus;
    }

    public MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs(Input<String> realtimeMetricsSubscriptionStatus) {
        this.realtimeMetricsSubscriptionStatus = Objects.requireNonNull(realtimeMetricsSubscriptionStatus, "expected parameter 'realtimeMetricsSubscriptionStatus' to be non-null");
    }

    private MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs() {
        this.realtimeMetricsSubscriptionStatus = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> realtimeMetricsSubscriptionStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.realtimeMetricsSubscriptionStatus = defaults.realtimeMetricsSubscriptionStatus;
        }

        public Builder setRealtimeMetricsSubscriptionStatus(Input<String> realtimeMetricsSubscriptionStatus) {
            this.realtimeMetricsSubscriptionStatus = Objects.requireNonNull(realtimeMetricsSubscriptionStatus);
            return this;
        }

        public Builder setRealtimeMetricsSubscriptionStatus(String realtimeMetricsSubscriptionStatus) {
            this.realtimeMetricsSubscriptionStatus = Input.of(Objects.requireNonNull(realtimeMetricsSubscriptionStatus));
            return this;
        }
        public MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs build() {
            return new MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigGetArgs(realtimeMetricsSubscriptionStatus);
        }
    }
}
