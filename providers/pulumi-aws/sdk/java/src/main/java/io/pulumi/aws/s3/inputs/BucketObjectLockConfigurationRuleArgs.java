// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleDefaultRetentionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class BucketObjectLockConfigurationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketObjectLockConfigurationRuleArgs Empty = new BucketObjectLockConfigurationRuleArgs();

    /**
     * The default retention period that you want to apply to new objects placed in this bucket.
     * 
     */
    @InputImport(name="defaultRetention", required=true)
    private final Input<BucketObjectLockConfigurationRuleDefaultRetentionArgs> defaultRetention;

    public Input<BucketObjectLockConfigurationRuleDefaultRetentionArgs> getDefaultRetention() {
        return this.defaultRetention;
    }

    public BucketObjectLockConfigurationRuleArgs(Input<BucketObjectLockConfigurationRuleDefaultRetentionArgs> defaultRetention) {
        this.defaultRetention = Objects.requireNonNull(defaultRetention, "expected parameter 'defaultRetention' to be non-null");
    }

    private BucketObjectLockConfigurationRuleArgs() {
        this.defaultRetention = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketObjectLockConfigurationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<BucketObjectLockConfigurationRuleDefaultRetentionArgs> defaultRetention;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketObjectLockConfigurationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRetention = defaults.defaultRetention;
        }

        public Builder setDefaultRetention(Input<BucketObjectLockConfigurationRuleDefaultRetentionArgs> defaultRetention) {
            this.defaultRetention = Objects.requireNonNull(defaultRetention);
            return this;
        }

        public Builder setDefaultRetention(BucketObjectLockConfigurationRuleDefaultRetentionArgs defaultRetention) {
            this.defaultRetention = Input.of(Objects.requireNonNull(defaultRetention));
            return this;
        }
        public BucketObjectLockConfigurationRuleArgs build() {
            return new BucketObjectLockConfigurationRuleArgs(defaultRetention);
        }
    }
}
