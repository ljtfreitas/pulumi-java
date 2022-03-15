// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.storage.inputs.BucketLifecycleRuleActionGetArgs;
import io.pulumi.gcp.storage.inputs.BucketLifecycleRuleConditionGetArgs;
import java.util.Objects;


public final class BucketLifecycleRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleGetArgs Empty = new BucketLifecycleRuleGetArgs();

    /**
     * The Lifecycle Rule's action configuration. A single block of this type is supported. Structure is documented below.
     * 
     */
    @Import(name="action", required=true)
      private final Output<BucketLifecycleRuleActionGetArgs> action;

    public Output<BucketLifecycleRuleActionGetArgs> getAction() {
        return this.action;
    }

    /**
     * The Lifecycle Rule's condition configuration. A single block of this type is supported. Structure is documented below.
     * 
     */
    @Import(name="condition", required=true)
      private final Output<BucketLifecycleRuleConditionGetArgs> condition;

    public Output<BucketLifecycleRuleConditionGetArgs> getCondition() {
        return this.condition;
    }

    public BucketLifecycleRuleGetArgs(
        Output<BucketLifecycleRuleActionGetArgs> action,
        Output<BucketLifecycleRuleConditionGetArgs> condition) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.condition = Objects.requireNonNull(condition, "expected parameter 'condition' to be non-null");
    }

    private BucketLifecycleRuleGetArgs() {
        this.action = Output.empty();
        this.condition = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<BucketLifecycleRuleActionGetArgs> action;
        private Output<BucketLifecycleRuleConditionGetArgs> condition;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.condition = defaults.condition;
        }

        public Builder action(Output<BucketLifecycleRuleActionGetArgs> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder action(BucketLifecycleRuleActionGetArgs action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder condition(Output<BucketLifecycleRuleConditionGetArgs> condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }

        public Builder condition(BucketLifecycleRuleConditionGetArgs condition) {
            this.condition = Output.of(Objects.requireNonNull(condition));
            return this;
        }
        public BucketLifecycleRuleGetArgs build() {
            return new BucketLifecycleRuleGetArgs(action, condition);
        }
    }
}
