// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketLifecycleRuleTransitionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleTransitionGetArgs Empty = new BucketLifecycleRuleTransitionGetArgs();

    /**
     * Specifies the date after which you want the corresponding action to take effect.
     * 
     */
    @Import(name="date")
      private final @Nullable Output<String> date;

    public Output<String> getDate() {
        return this.date == null ? Output.empty() : this.date;
    }

    /**
     * Specifies the number of days after object creation when the specific rule action takes effect.
     * 
     */
    @Import(name="days")
      private final @Nullable Output<Integer> days;

    public Output<Integer> getDays() {
        return this.days == null ? Output.empty() : this.days;
    }

    /**
     * Specifies the Amazon S3 [storage class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_Transition.html#AmazonS3-Type-Transition-StorageClass) to which you want the object to transition.
     * 
     */
    @Import(name="storageClass", required=true)
      private final Output<String> storageClass;

    public Output<String> getStorageClass() {
        return this.storageClass;
    }

    public BucketLifecycleRuleTransitionGetArgs(
        @Nullable Output<String> date,
        @Nullable Output<Integer> days,
        Output<String> storageClass) {
        this.date = date;
        this.days = days;
        this.storageClass = Objects.requireNonNull(storageClass, "expected parameter 'storageClass' to be non-null");
    }

    private BucketLifecycleRuleTransitionGetArgs() {
        this.date = Output.empty();
        this.days = Output.empty();
        this.storageClass = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleTransitionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> date;
        private @Nullable Output<Integer> days;
        private Output<String> storageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleTransitionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.date = defaults.date;
    	      this.days = defaults.days;
    	      this.storageClass = defaults.storageClass;
        }

        public Builder date(@Nullable Output<String> date) {
            this.date = date;
            return this;
        }

        public Builder date(@Nullable String date) {
            this.date = Output.ofNullable(date);
            return this;
        }

        public Builder days(@Nullable Output<Integer> days) {
            this.days = days;
            return this;
        }

        public Builder days(@Nullable Integer days) {
            this.days = Output.ofNullable(days);
            return this;
        }

        public Builder storageClass(Output<String> storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }

        public Builder storageClass(String storageClass) {
            this.storageClass = Output.of(Objects.requireNonNull(storageClass));
            return this;
        }
        public BucketLifecycleRuleTransitionGetArgs build() {
            return new BucketLifecycleRuleTransitionGetArgs(date, days, storageClass);
        }
    }
}
