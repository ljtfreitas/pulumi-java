// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.storage_v1.outputs.BucketLifecycleRuleItemActionResponse;
import io.pulumi.googlenative.storage_v1.outputs.BucketLifecycleRuleItemConditionResponse;
import java.util.Objects;

@OutputCustomType
public final class BucketLifecycleRuleItemResponse {
    /**
     * The action to take.
     * 
     */
    private final BucketLifecycleRuleItemActionResponse action;
    /**
     * The condition(s) under which the action will be taken.
     * 
     */
    private final BucketLifecycleRuleItemConditionResponse condition;

    @OutputCustomType.Constructor({"action","condition"})
    private BucketLifecycleRuleItemResponse(
        BucketLifecycleRuleItemActionResponse action,
        BucketLifecycleRuleItemConditionResponse condition) {
        this.action = Objects.requireNonNull(action);
        this.condition = Objects.requireNonNull(condition);
    }

    /**
     * The action to take.
     * 
     */
    public BucketLifecycleRuleItemActionResponse getAction() {
        return this.action;
    }
    /**
     * The condition(s) under which the action will be taken.
     * 
     */
    public BucketLifecycleRuleItemConditionResponse getCondition() {
        return this.condition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketLifecycleRuleItemActionResponse action;
        private BucketLifecycleRuleItemConditionResponse condition;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.condition = defaults.condition;
        }

        public Builder setAction(BucketLifecycleRuleItemActionResponse action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setCondition(BucketLifecycleRuleItemConditionResponse condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public BucketLifecycleRuleItemResponse build() {
            return new BucketLifecycleRuleItemResponse(action, condition);
        }
    }
}
