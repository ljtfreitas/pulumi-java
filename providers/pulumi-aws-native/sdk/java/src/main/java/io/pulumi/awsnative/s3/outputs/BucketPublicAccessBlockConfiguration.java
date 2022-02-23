// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketPublicAccessBlockConfiguration {
    /**
     * Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket and objects in this bucket. Setting this element to TRUE causes the following behavior:
     * - PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
     *  - PUT Object calls fail if the request includes a public ACL.
     *    Enabling this setting doesn't affect existing policies or ACLs.
     * 
     */
    private final @Nullable Boolean blockPublicAcls;
    /**
     * Specifies whether Amazon S3 should block public bucket policies for this bucket. Setting this element to TRUE causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows public access.
     * Enabling this setting doesn't affect existing bucket policies.
     * 
     */
    private final @Nullable Boolean blockPublicPolicy;
    /**
     * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket. Setting this element to TRUE causes Amazon S3 to ignore all public ACLs on this bucket and objects in this bucket.
     * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set.
     * 
     */
    private final @Nullable Boolean ignorePublicAcls;
    /**
     * Specifies whether Amazon S3 should restrict public bucket policies for this bucket. Setting this element to TRUE restricts access to this bucket to only AWS services and authorized users within this account if the bucket has a public policy.
     * Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
     * 
     */
    private final @Nullable Boolean restrictPublicBuckets;

    @OutputCustomType.Constructor({"blockPublicAcls","blockPublicPolicy","ignorePublicAcls","restrictPublicBuckets"})
    private BucketPublicAccessBlockConfiguration(
        @Nullable Boolean blockPublicAcls,
        @Nullable Boolean blockPublicPolicy,
        @Nullable Boolean ignorePublicAcls,
        @Nullable Boolean restrictPublicBuckets) {
        this.blockPublicAcls = blockPublicAcls;
        this.blockPublicPolicy = blockPublicPolicy;
        this.ignorePublicAcls = ignorePublicAcls;
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    /**
     * Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket and objects in this bucket. Setting this element to TRUE causes the following behavior:
     * - PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
     *  - PUT Object calls fail if the request includes a public ACL.
     *    Enabling this setting doesn't affect existing policies or ACLs.
     * 
     */
    public Optional<Boolean> getBlockPublicAcls() {
        return Optional.ofNullable(this.blockPublicAcls);
    }
    /**
     * Specifies whether Amazon S3 should block public bucket policies for this bucket. Setting this element to TRUE causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows public access.
     * Enabling this setting doesn't affect existing bucket policies.
     * 
     */
    public Optional<Boolean> getBlockPublicPolicy() {
        return Optional.ofNullable(this.blockPublicPolicy);
    }
    /**
     * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket. Setting this element to TRUE causes Amazon S3 to ignore all public ACLs on this bucket and objects in this bucket.
     * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set.
     * 
     */
    public Optional<Boolean> getIgnorePublicAcls() {
        return Optional.ofNullable(this.ignorePublicAcls);
    }
    /**
     * Specifies whether Amazon S3 should restrict public bucket policies for this bucket. Setting this element to TRUE restricts access to this bucket to only AWS services and authorized users within this account if the bucket has a public policy.
     * Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
     * 
     */
    public Optional<Boolean> getRestrictPublicBuckets() {
        return Optional.ofNullable(this.restrictPublicBuckets);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketPublicAccessBlockConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean blockPublicAcls;
        private @Nullable Boolean blockPublicPolicy;
        private @Nullable Boolean ignorePublicAcls;
        private @Nullable Boolean restrictPublicBuckets;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketPublicAccessBlockConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockPublicAcls = defaults.blockPublicAcls;
    	      this.blockPublicPolicy = defaults.blockPublicPolicy;
    	      this.ignorePublicAcls = defaults.ignorePublicAcls;
    	      this.restrictPublicBuckets = defaults.restrictPublicBuckets;
        }

        public Builder setBlockPublicAcls(@Nullable Boolean blockPublicAcls) {
            this.blockPublicAcls = blockPublicAcls;
            return this;
        }

        public Builder setBlockPublicPolicy(@Nullable Boolean blockPublicPolicy) {
            this.blockPublicPolicy = blockPublicPolicy;
            return this;
        }

        public Builder setIgnorePublicAcls(@Nullable Boolean ignorePublicAcls) {
            this.ignorePublicAcls = ignorePublicAcls;
            return this;
        }

        public Builder setRestrictPublicBuckets(@Nullable Boolean restrictPublicBuckets) {
            this.restrictPublicBuckets = restrictPublicBuckets;
            return this;
        }
        public BucketPublicAccessBlockConfiguration build() {
            return new BucketPublicAccessBlockConfiguration(blockPublicAcls, blockPublicPolicy, ignorePublicAcls, restrictPublicBuckets);
        }
    }
}
