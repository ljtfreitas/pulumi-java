// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dlm.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class LifecyclePolicyPolicyDetailsScheduleRetainRule {
    /**
     * How many snapshots to keep. Must be an integer between 1 and 1000.
     * 
     */
    private final Integer count;

    @OutputCustomType.Constructor({"count"})
    private LifecyclePolicyPolicyDetailsScheduleRetainRule(Integer count) {
        this.count = Objects.requireNonNull(count);
    }

    /**
     * How many snapshots to keep. Must be an integer between 1 and 1000.
     * 
     */
    public Integer getCount() {
        return this.count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyPolicyDetailsScheduleRetainRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecyclePolicyPolicyDetailsScheduleRetainRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public LifecyclePolicyPolicyDetailsScheduleRetainRule build() {
            return new LifecyclePolicyPolicyDetailsScheduleRetainRule(count);
        }
    }
}
