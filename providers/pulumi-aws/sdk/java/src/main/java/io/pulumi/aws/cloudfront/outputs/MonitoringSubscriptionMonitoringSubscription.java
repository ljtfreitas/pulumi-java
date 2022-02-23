// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class MonitoringSubscriptionMonitoringSubscription {
    /**
     * A subscription configuration for additional CloudWatch metrics. See below.
     * 
     */
    private final MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig realtimeMetricsSubscriptionConfig;

    @OutputCustomType.Constructor({"realtimeMetricsSubscriptionConfig"})
    private MonitoringSubscriptionMonitoringSubscription(MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig realtimeMetricsSubscriptionConfig) {
        this.realtimeMetricsSubscriptionConfig = Objects.requireNonNull(realtimeMetricsSubscriptionConfig);
    }

    /**
     * A subscription configuration for additional CloudWatch metrics. See below.
     * 
     */
    public MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig getRealtimeMetricsSubscriptionConfig() {
        return this.realtimeMetricsSubscriptionConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringSubscriptionMonitoringSubscription defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig realtimeMetricsSubscriptionConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringSubscriptionMonitoringSubscription defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.realtimeMetricsSubscriptionConfig = defaults.realtimeMetricsSubscriptionConfig;
        }

        public Builder setRealtimeMetricsSubscriptionConfig(MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfig realtimeMetricsSubscriptionConfig) {
            this.realtimeMetricsSubscriptionConfig = Objects.requireNonNull(realtimeMetricsSubscriptionConfig);
            return this;
        }
        public MonitoringSubscriptionMonitoringSubscription build() {
            return new MonitoringSubscriptionMonitoringSubscription(realtimeMetricsSubscriptionConfig);
        }
    }
}
