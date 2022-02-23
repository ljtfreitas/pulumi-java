// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final BucketPolicyState Empty = new BucketPolicyState();

    /**
     * The name of the bucket to which to apply the policy.
     * 
     */
    @InputImport(name="bucket")
    private final @Nullable Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket == null ? Input.empty() : this.bucket;
    }

    /**
     * The text of the policy. Although this is a bucket policy rather than an IAM policy, the `aws.iam.getPolicyDocument` data source may be used, so long as it specifies a principal. Note: Bucket policies are limited to 20 KB in size.
     * 
     */
    @InputImport(name="policy")
    private final @Nullable Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    public BucketPolicyState(
        @Nullable Input<String> bucket,
        @Nullable Input<String> policy) {
        this.bucket = bucket;
        this.policy = policy;
    }

    private BucketPolicyState() {
        this.bucket = Input.empty();
        this.policy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucket;
        private @Nullable Input<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.policy = defaults.policy;
        }

        public Builder setBucket(@Nullable Input<String> bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder setBucket(@Nullable String bucket) {
            this.bucket = Input.ofNullable(bucket);
            return this;
        }

        public Builder setPolicy(@Nullable Input<String> policy) {
            this.policy = policy;
            return this;
        }
        public BucketPolicyState build() {
            return new BucketPolicyState(bucket, policy);
        }
    }
}
