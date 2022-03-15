// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs Empty = new SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs();

    /**
     * Number of HTTP(S) requests for calculating the threshold.
     * 
     */
    @Import(name="count", required=true)
      private final Output<Integer> count;

    public Output<Integer> getCount() {
        return this.count;
    }

    /**
     * Interval over which the threshold is computed.
     * 
     */
    @Import(name="intervalSec", required=true)
      private final Output<Integer> intervalSec;

    public Output<Integer> getIntervalSec() {
        return this.intervalSec;
    }

    public SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs(
        Output<Integer> count,
        Output<Integer> intervalSec) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.intervalSec = Objects.requireNonNull(intervalSec, "expected parameter 'intervalSec' to be non-null");
    }

    private SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs() {
        this.count = Output.empty();
        this.intervalSec = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> count;
        private Output<Integer> intervalSec;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.intervalSec = defaults.intervalSec;
        }

        public Builder count(Output<Integer> count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder count(Integer count) {
            this.count = Output.of(Objects.requireNonNull(count));
            return this;
        }

        public Builder intervalSec(Output<Integer> intervalSec) {
            this.intervalSec = Objects.requireNonNull(intervalSec);
            return this;
        }

        public Builder intervalSec(Integer intervalSec) {
            this.intervalSec = Output.of(Objects.requireNonNull(intervalSec));
            return this;
        }
        public SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs build() {
            return new SecurityPolicyRuleRateLimitOptionsBanThresholdGetArgs(count, intervalSec);
        }
    }
}
