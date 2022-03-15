// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MultiRegionAccessPointDetailsPublicAccessBlockArgs extends io.pulumi.resources.ResourceArgs {

    public static final MultiRegionAccessPointDetailsPublicAccessBlockArgs Empty = new MultiRegionAccessPointDetailsPublicAccessBlockArgs();

    /**
     * Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
     * * PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
     * * PUT Object calls fail if the request includes a public ACL.
     * * PUT Bucket calls fail if the request includes a public ACL.
     * 
     */
    @Import(name="blockPublicAcls")
      private final @Nullable Output<Boolean> blockPublicAcls;

    public Output<Boolean> getBlockPublicAcls() {
        return this.blockPublicAcls == null ? Output.empty() : this.blockPublicAcls;
    }

    /**
     * Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
     * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
     * 
     */
    @Import(name="blockPublicPolicy")
      private final @Nullable Output<Boolean> blockPublicPolicy;

    public Output<Boolean> getBlockPublicPolicy() {
        return this.blockPublicPolicy == null ? Output.empty() : this.blockPublicPolicy;
    }

    /**
     * Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
     * * Ignore all public ACLs on buckets in this account and any objects that they contain.
     * 
     */
    @Import(name="ignorePublicAcls")
      private final @Nullable Output<Boolean> ignorePublicAcls;

    public Output<Boolean> getIgnorePublicAcls() {
        return this.ignorePublicAcls == null ? Output.empty() : this.ignorePublicAcls;
    }

    /**
     * Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
     * * Only the bucket owner and AWS Services can access buckets with public policies.
     * 
     */
    @Import(name="restrictPublicBuckets")
      private final @Nullable Output<Boolean> restrictPublicBuckets;

    public Output<Boolean> getRestrictPublicBuckets() {
        return this.restrictPublicBuckets == null ? Output.empty() : this.restrictPublicBuckets;
    }

    public MultiRegionAccessPointDetailsPublicAccessBlockArgs(
        @Nullable Output<Boolean> blockPublicAcls,
        @Nullable Output<Boolean> blockPublicPolicy,
        @Nullable Output<Boolean> ignorePublicAcls,
        @Nullable Output<Boolean> restrictPublicBuckets) {
        this.blockPublicAcls = blockPublicAcls;
        this.blockPublicPolicy = blockPublicPolicy;
        this.ignorePublicAcls = ignorePublicAcls;
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    private MultiRegionAccessPointDetailsPublicAccessBlockArgs() {
        this.blockPublicAcls = Output.empty();
        this.blockPublicPolicy = Output.empty();
        this.ignorePublicAcls = Output.empty();
        this.restrictPublicBuckets = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiRegionAccessPointDetailsPublicAccessBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> blockPublicAcls;
        private @Nullable Output<Boolean> blockPublicPolicy;
        private @Nullable Output<Boolean> ignorePublicAcls;
        private @Nullable Output<Boolean> restrictPublicBuckets;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiRegionAccessPointDetailsPublicAccessBlockArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockPublicAcls = defaults.blockPublicAcls;
    	      this.blockPublicPolicy = defaults.blockPublicPolicy;
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
        public MultiRegionAccessPointDetailsPublicAccessBlockArgs build() {
            return new MultiRegionAccessPointDetailsPublicAccessBlockArgs(blockPublicAcls, blockPublicPolicy, ignorePublicAcls, restrictPublicBuckets);
        }
    }
}
