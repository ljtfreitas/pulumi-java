// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class BucketReplicationConfigRuleDestinationMetricsEventThreshold {
    /**
     * Time in minutes. Valid values: `15`.
     * 
     */
    private final Integer minutes;

    @CustomType.Constructor
    private BucketReplicationConfigRuleDestinationMetricsEventThreshold(@CustomType.Parameter("minutes") Integer minutes) {
        this.minutes = minutes;
    }

    /**
     * Time in minutes. Valid values: `15`.
     * 
    */
    public Integer getMinutes() {
        return this.minutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleDestinationMetricsEventThreshold defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer minutes;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleDestinationMetricsEventThreshold defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minutes = defaults.minutes;
        }

        public Builder minutes(Integer minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }
        public BucketReplicationConfigRuleDestinationMetricsEventThreshold build() {
            return new BucketReplicationConfigRuleDestinationMetricsEventThreshold(minutes);
        }
    }
}
