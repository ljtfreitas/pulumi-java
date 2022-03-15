// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketLifecycleRuleNoncurrentVersionExpirationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleNoncurrentVersionExpirationGetArgs Empty = new BucketLifecycleRuleNoncurrentVersionExpirationGetArgs();

    /**
     * Specifies the number of days noncurrent object versions expire.
     * 
     */
    @Import(name="days")
      private final @Nullable Output<Integer> days;

    public Output<Integer> getDays() {
        return this.days == null ? Output.empty() : this.days;
    }

    public BucketLifecycleRuleNoncurrentVersionExpirationGetArgs(@Nullable Output<Integer> days) {
        this.days = days;
    }

    private BucketLifecycleRuleNoncurrentVersionExpirationGetArgs() {
        this.days = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleNoncurrentVersionExpirationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> days;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleNoncurrentVersionExpirationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
        }

        public Builder days(@Nullable Output<Integer> days) {
            this.days = days;
            return this;
        }

        public Builder days(@Nullable Integer days) {
            this.days = Output.ofNullable(days);
            return this;
        }
        public BucketLifecycleRuleNoncurrentVersionExpirationGetArgs build() {
            return new BucketLifecycleRuleNoncurrentVersionExpirationGetArgs(days);
        }
    }
}
