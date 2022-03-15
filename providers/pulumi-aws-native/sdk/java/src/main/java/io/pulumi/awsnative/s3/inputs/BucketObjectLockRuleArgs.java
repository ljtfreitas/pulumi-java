// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketDefaultRetentionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Object Lock rule in place for the specified object.
 * 
 */
public final class BucketObjectLockRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketObjectLockRuleArgs Empty = new BucketObjectLockRuleArgs();

    @Import(name="defaultRetention")
      private final @Nullable Output<BucketDefaultRetentionArgs> defaultRetention;

    public Output<BucketDefaultRetentionArgs> getDefaultRetention() {
        return this.defaultRetention == null ? Output.empty() : this.defaultRetention;
    }

    public BucketObjectLockRuleArgs(@Nullable Output<BucketDefaultRetentionArgs> defaultRetention) {
        this.defaultRetention = defaultRetention;
    }

    private BucketObjectLockRuleArgs() {
        this.defaultRetention = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketObjectLockRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BucketDefaultRetentionArgs> defaultRetention;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketObjectLockRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRetention = defaults.defaultRetention;
        }

        public Builder defaultRetention(@Nullable Output<BucketDefaultRetentionArgs> defaultRetention) {
            this.defaultRetention = defaultRetention;
            return this;
        }

        public Builder defaultRetention(@Nullable BucketDefaultRetentionArgs defaultRetention) {
            this.defaultRetention = Output.ofNullable(defaultRetention);
            return this;
        }
        public BucketObjectLockRuleArgs build() {
            return new BucketObjectLockRuleArgs(defaultRetention);
        }
    }
}
