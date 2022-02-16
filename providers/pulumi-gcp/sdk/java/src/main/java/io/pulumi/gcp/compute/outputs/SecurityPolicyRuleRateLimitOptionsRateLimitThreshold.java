// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class SecurityPolicyRuleRateLimitOptionsRateLimitThreshold {
    private final Integer count;
    private final Integer intervalSec;

    @OutputCustomType.Constructor({"count","intervalSec"})
    private SecurityPolicyRuleRateLimitOptionsRateLimitThreshold(
        Integer count,
        Integer intervalSec) {
        this.count = Objects.requireNonNull(count);
        this.intervalSec = Objects.requireNonNull(intervalSec);
    }

    public Integer getCount() {
        return this.count;
    }
    public Integer getIntervalSec() {
        return this.intervalSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRateLimitOptionsRateLimitThreshold defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private Integer intervalSec;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRateLimitOptionsRateLimitThreshold defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.intervalSec = defaults.intervalSec;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setIntervalSec(Integer intervalSec) {
            this.intervalSec = Objects.requireNonNull(intervalSec);
            return this;
        }

        public SecurityPolicyRuleRateLimitOptionsRateLimitThreshold build() {
            return new SecurityPolicyRuleRateLimitOptionsRateLimitThreshold(count, intervalSec);
        }
    }
}