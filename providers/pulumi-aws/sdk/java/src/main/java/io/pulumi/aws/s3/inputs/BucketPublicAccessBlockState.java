// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
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
    @InputImport(name="blockPublicAcls")
    private final @Nullable Input<Boolean> blockPublicAcls;

    public Input<Boolean> getBlockPublicAcls() {
        return this.blockPublicAcls == null ? Input.empty() : this.blockPublicAcls;
    }

    /**
     * Whether Amazon S3 should block public bucket policies for this bucket. Defaults to `false`. Enabling this setting does not affect the existing bucket policy. When set to `true` causes Amazon S3 to:
     * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
     * 
     */
    @InputImport(name="blockPublicPolicy")
    private final @Nullable Input<Boolean> blockPublicPolicy;

    public Input<Boolean> getBlockPublicPolicy() {
        return this.blockPublicPolicy == null ? Input.empty() : this.blockPublicPolicy;
    }

    /**
     * S3 Bucket to which this Public Access Block configuration should be applied.
     * 
     */
    @InputImport(name="bucket")
    private final @Nullable Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket == null ? Input.empty() : this.bucket;
    }

    /**
     * Whether Amazon S3 should ignore public ACLs for this bucket. Defaults to `false`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
     * * Ignore public ACLs on this bucket and any objects that it contains.
     * 
     */
    @InputImport(name="ignorePublicAcls")
    private final @Nullable Input<Boolean> ignorePublicAcls;

    public Input<Boolean> getIgnorePublicAcls() {
        return this.ignorePublicAcls == null ? Input.empty() : this.ignorePublicAcls;
    }

    /**
     * Whether Amazon S3 should restrict public bucket policies for this bucket. Defaults to `false`. Enabling this setting does not affect the previously stored bucket policy, except that public and cross-account access within the public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
     * * Only the bucket owner and AWS Services can access this buckets if it has a public policy.
     * 
     */
    @InputImport(name="restrictPublicBuckets")
    private final @Nullable Input<Boolean> restrictPublicBuckets;

    public Input<Boolean> getRestrictPublicBuckets() {
        return this.restrictPublicBuckets == null ? Input.empty() : this.restrictPublicBuckets;
    }

    public BucketPublicAccessBlockState(
        @Nullable Input<Boolean> blockPublicAcls,
        @Nullable Input<Boolean> blockPublicPolicy,
        @Nullable Input<String> bucket,
        @Nullable Input<Boolean> ignorePublicAcls,
        @Nullable Input<Boolean> restrictPublicBuckets) {
        this.blockPublicAcls = blockPublicAcls;
        this.blockPublicPolicy = blockPublicPolicy;
        this.bucket = bucket;
        this.ignorePublicAcls = ignorePublicAcls;
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    private BucketPublicAccessBlockState() {
        this.blockPublicAcls = Input.empty();
        this.blockPublicPolicy = Input.empty();
        this.bucket = Input.empty();
        this.ignorePublicAcls = Input.empty();
        this.restrictPublicBuckets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketPublicAccessBlockState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> blockPublicAcls;
        private @Nullable Input<Boolean> blockPublicPolicy;
        private @Nullable Input<String> bucket;
        private @Nullable Input<Boolean> ignorePublicAcls;
        private @Nullable Input<Boolean> restrictPublicBuckets;

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

        public Builder setBlockPublicAcls(@Nullable Input<Boolean> blockPublicAcls) {
            this.blockPublicAcls = blockPublicAcls;
            return this;
        }

        public Builder setBlockPublicAcls(@Nullable Boolean blockPublicAcls) {
            this.blockPublicAcls = Input.ofNullable(blockPublicAcls);
            return this;
        }

        public Builder setBlockPublicPolicy(@Nullable Input<Boolean> blockPublicPolicy) {
            this.blockPublicPolicy = blockPublicPolicy;
            return this;
        }

        public Builder setBlockPublicPolicy(@Nullable Boolean blockPublicPolicy) {
            this.blockPublicPolicy = Input.ofNullable(blockPublicPolicy);
            return this;
        }

        public Builder setBucket(@Nullable Input<String> bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder setBucket(@Nullable String bucket) {
            this.bucket = Input.ofNullable(bucket);
            return this;
        }

        public Builder setIgnorePublicAcls(@Nullable Input<Boolean> ignorePublicAcls) {
            this.ignorePublicAcls = ignorePublicAcls;
            return this;
        }

        public Builder setIgnorePublicAcls(@Nullable Boolean ignorePublicAcls) {
            this.ignorePublicAcls = Input.ofNullable(ignorePublicAcls);
            return this;
        }

        public Builder setRestrictPublicBuckets(@Nullable Input<Boolean> restrictPublicBuckets) {
            this.restrictPublicBuckets = restrictPublicBuckets;
            return this;
        }

        public Builder setRestrictPublicBuckets(@Nullable Boolean restrictPublicBuckets) {
            this.restrictPublicBuckets = Input.ofNullable(restrictPublicBuckets);
            return this;
        }
        public BucketPublicAccessBlockState build() {
            return new BucketPublicAccessBlockState(blockPublicAcls, blockPublicPolicy, bucket, ignorePublicAcls, restrictPublicBuckets);
        }
    }
}
