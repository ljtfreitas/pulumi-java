// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.storage_v1.inputs.BucketLifecycleRuleItemArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The bucket's lifecycle configuration. See lifecycle management for more information.
 * 
 */
public final class BucketLifecycleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleArgs Empty = new BucketLifecycleArgs();

    /**
     * A lifecycle management rule, which is made of an action to take and the condition(s) under which the action will be taken.
     * 
     */
    @InputImport(name="rule")
      private final @Nullable Input<List<BucketLifecycleRuleItemArgs>> rule;

    public Input<List<BucketLifecycleRuleItemArgs>> getRule() {
        return this.rule == null ? Input.empty() : this.rule;
    }

    public BucketLifecycleArgs(@Nullable Input<List<BucketLifecycleRuleItemArgs>> rule) {
        this.rule = rule;
    }

    private BucketLifecycleArgs() {
        this.rule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<BucketLifecycleRuleItemArgs>> rule;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rule = defaults.rule;
        }

        public Builder setRule(@Nullable Input<List<BucketLifecycleRuleItemArgs>> rule) {
            this.rule = rule;
            return this;
        }

        public Builder setRule(@Nullable List<BucketLifecycleRuleItemArgs> rule) {
            this.rule = Input.ofNullable(rule);
            return this;
        }
        public BucketLifecycleArgs build() {
            return new BucketLifecycleArgs(rule);
        }
    }
}
