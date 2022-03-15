// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketPublicAccessBlockState extends io.pulumi.resources.ResourceArgs {

    public static final BucketPublicAccessBlockState Empty = new BucketPublicAccessBlockState();

    /**
     * Whether Amazon S3 should block public ACLs for this bucket. Defaults to `false`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
     * * PUT Bucket acl and PUT Object acl calls will fail if the specified ACL allows public access.
     * * PUT Object calls will fail if the request includes an object ACL.
     * 
     */
    @Import(name="blockPublicAcls")
      private final @Nullable Output<Boolean> blockPublicAcls;

    public Output<Boolean> getBlockPublicAcls() {
        return this.blockPublicAcls == null ? Output.empty() : this.blockPublicAcls;
    }

    /**
     * Whether Amazon S3 should block public bucket policies for this bucket. Defaults to `false`. Enabling this setting does not affect the existing bucket policy. When set to `true` causes Amazon S3 to:
     * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
     * 
     */
    @Import(name="blockPublicPolicy")
      private final @Nullable Output<Boolean> blockPublicPolicy;

    public Output<Boolean> getBlockPublicPolicy() {
        return this.blockPublicPolicy == null ? Output.empty() : this.blockPublicPolicy;
    }

    /**
     * S3 Bucket to which this Public Access Block configuration should be applied.
     * 
     */
    @Import(name="bucket")
      private final @Nullable Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket == null ? Output.empty() : this.bucket;
    }

    /**
     * Whether Amazon S3 should ignore public ACLs for this bucket. Defaults to `false`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
     * * Ignore public ACLs on this bucket and any objects that it contains.
     * 
     */
    @Import(name="ignorePublicAcls")
      private final @Nullable Output<Boolean> ignorePublicAcls;

    public Output<Boolean> getIgnorePublicAcls() {
        return this.ignorePublicAcls == null ? Output.empty() : this.ignorePublicAcls;
    }

    /**
     * Whether Amazon S3 should restrict public bucket policies for this bucket. Defaults to `false`. Enabling this setting does not affect the previously stored bucket policy, except that public and cross-account access within the public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
     * * Only the bucket owner and AWS Services can access this buckets if it has a public policy.
     * 
     */
    @Import(name="restrictPublicBuckets")
      private final @Nullable Output<Boolean> restrictPublicBuckets;

    public Output<Boolean> getRestrictPublicBuckets() {
        return this.restrictPublicBuckets == null ? Output.empty() : this.restrictPublicBuckets;
    }

    public BucketPublicAccessBlockState(
        @Nullable Output<Boolean> blockPublicAcls,
        @Nullable Output<Boolean> blockPublicPolicy,
        @Nullable Output<String> bucket,
        @Nullable Output<Boolean> ignorePublicAcls,
        @Nullable Output<Boolean> restrictPublicBuckets) {
        this.blockPublicAcls = blockPublicAcls;
        this.blockPublicPolicy = blockPublicPolicy;
        this.bucket = bucket;
        this.ignorePublicAcls = ignorePublicAcls;
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    private BucketPublicAccessBlockState() {
        this.blockPublicAcls = Output.empty();
        this.blockPublicPolicy = Output.empty();
        this.bucket = Output.empty();
        this.ignorePublicAcls = Output.empty();
        this.restrictPublicBuckets = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketPublicAccessBlockState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> blockPublicAcls;
        private @Nullable Output<Boolean> blockPublicPolicy;
        private @Nullable Output<String> bucket;
        private @Nullable Output<Boolean> ignorePublicAcls;
        private @Nullable Output<Boolean> restrictPublicBuckets;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketPublicAccessBlockState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockPublicAcls = defaults.blockPublicAcls;
    	      this.blockPublicPolicy = defaults.blockPublicPolicy;
    	      this.bucket = defaults.bucket;
    	      this.ignorePublicAcls = defaults.ignorePublicAcls;
    	      this.restrictPublicBuckets = defaults.restrictPublicBuckets;
        }

        public Builder blockPublicAcls(@Nullable Output<Boolean> blockPublicAcls) {
            this.blockPublicAcls = blockPublicAcls;
            return this;
        }

        public Builder blockPublicAcls(@Nullable Boolean blockPublicAcls) {
            this.blockPublicAcls = Output.ofNullable(blockPublicAcls);
            return this;
        }

        public Builder blockPublicPolicy(@Nullable Output<Boolean> blockPublicPolicy) {
            this.blockPublicPolicy = blockPublicPolicy;
            return this;
        }

        public Builder blockPublicPolicy(@Nullable Boolean blockPublicPolicy) {
            this.blockPublicPolicy = Output.ofNullable(blockPublicPolicy);
            return this;
        }

        public Builder bucket(@Nullable Output<String> bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder bucket(@Nullable String bucket) {
            this.bucket = Output.ofNullable(bucket);
            return this;
        }

        public Builder ignorePublicAcls(@Nullable Output<Boolean> ignorePublicAcls) {
            this.ignorePublicAcls = ignorePublicAcls;
            return this;
        }

        public Builder ignorePublicAcls(@Nullable Boolean ignorePublicAcls) {
            this.ignorePublicAcls = Output.ofNullable(ignorePublicAcls);
            return this;
        }

        public Builder restrictPublicBuckets(@Nullable Output<Boolean> restrictPublicBuckets) {
            this.restrictPublicBuckets = restrictPublicBuckets;
            return this;
        }

        public Builder restrictPublicBuckets(@Nullable Boolean restrictPublicBuckets) {
            this.restrictPublicBuckets = Output.ofNullable(restrictPublicBuckets);
            return this;
        }
        public BucketPublicAccessBlockState build() {
            return new BucketPublicAccessBlockState(blockPublicAcls, blockPublicPolicy, bucket, ignorePublicAcls, restrictPublicBuckets);
        }
    }
}
