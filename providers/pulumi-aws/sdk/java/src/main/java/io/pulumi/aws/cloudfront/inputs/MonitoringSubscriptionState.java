// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.MonitoringSubscriptionMonitoringSubscriptionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MonitoringSubscriptionState extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringSubscriptionState Empty = new MonitoringSubscriptionState();

    /**
     * The ID of the distribution that you are enabling metrics for.
     * 
     */
    @Import(name="distributionId")
      private final @Nullable Output<String> distributionId;

    public Output<String> getDistributionId() {
        return this.distributionId == null ? Output.empty() : this.distributionId;
    }

    /**
     * A monitoring subscription. This structure contains information about whether additional CloudWatch metrics are enabled for a given CloudFront distribution.
     * 
     */
    @Import(name="monitoringSubscription")
      private final @Nullable Output<MonitoringSubscriptionMonitoringSubscriptionGetArgs> monitoringSubscription;

    public Output<MonitoringSubscriptionMonitoringSubscriptionGetArgs> getMonitoringSubscription() {
        return this.monitoringSubscription == null ? Output.empty() : this.monitoringSubscription;
    }

    public MonitoringSubscriptionState(
        @Nullable Output<String> distributionId,
        @Nullable Output<MonitoringSubscriptionMonitoringSubscriptionGetArgs> monitoringSubscription) {
        this.distributionId = distributionId;
        this.monitoringSubscription = monitoringSubscription;
    }

    private MonitoringSubscriptionState() {
        this.distributionId = Output.empty();
        this.monitoringSubscription = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringSubscriptionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> distributionId;
        private @Nullable Output<MonitoringSubscriptionMonitoringSubscriptionGetArgs> monitoringSubscription;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringSubscriptionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionId = defaults.distributionId;
    	      this.monitoringSubscription = defaults.monitoringSubscription;
        }

        public Builder distributionId(@Nullable Output<String> distributionId) {
            this.distributionId = distributionId;
            return this;
        }

        public Builder distributionId(@Nullable String distributionId) {
            this.distributionId = Output.ofNullable(distributionId);
            return this;
        }

        public Builder monitoringSubscription(@Nullable Output<MonitoringSubscriptionMonitoringSubscriptionGetArgs> monitoringSubscription) {
            this.monitoringSubscription = monitoringSubscription;
            return this;
        }

        public Builder monitoringSubscription(@Nullable MonitoringSubscriptionMonitoringSubscriptionGetArgs monitoringSubscription) {
            this.monitoringSubscription = Output.ofNullable(monitoringSubscription);
            return this;
        }
        public MonitoringSubscriptionState build() {
            return new MonitoringSubscriptionState(distributionId, monitoringSubscription);
        }
    }
}
