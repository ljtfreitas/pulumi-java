// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.storage_v1.inputs.BucketIamConfigurationBucketPolicyOnlyResponse;
import io.pulumi.googlenative.storage_v1.inputs.BucketIamConfigurationUniformBucketLevelAccessResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The bucket's IAM configuration.
 * 
 */
public final class BucketIamConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final BucketIamConfigurationResponse Empty = new BucketIamConfigurationResponse();

    /**
     * The bucket's uniform bucket-level access configuration. The feature was formerly known as Bucket Policy Only. For backward compatibility, this field will be populated with identical information as the uniformBucketLevelAccess field. We recommend using the uniformBucketLevelAccess field to enable and disable the feature.
     * 
     */
    @InputImport(name="bucketPolicyOnly", required=true)
      private final BucketIamConfigurationBucketPolicyOnlyResponse bucketPolicyOnly;

    public BucketIamConfigurationBucketPolicyOnlyResponse getBucketPolicyOnly() {
        return this.bucketPolicyOnly;
    }

    /**
     * The bucket's Public Access Prevention configuration. Currently, 'inherited' and 'enforced' are supported.
     * 
     */
    @InputImport(name="publicAccessPrevention", required=true)
      private final String publicAccessPrevention;

    public String getPublicAccessPrevention() {
        return this.publicAccessPrevention;
    }

    /**
     * The bucket's uniform bucket-level access configuration.
     * 
     */
    @InputImport(name="uniformBucketLevelAccess", required=true)
      private final BucketIamConfigurationUniformBucketLevelAccessResponse uniformBucketLevelAccess;

    public BucketIamConfigurationUniformBucketLevelAccessResponse getUniformBucketLevelAccess() {
        return this.uniformBucketLevelAccess;
    }

    public BucketIamConfigurationResponse(
        BucketIamConfigurationBucketPolicyOnlyResponse bucketPolicyOnly,
        String publicAccessPrevention,
        BucketIamConfigurationUniformBucketLevelAccessResponse uniformBucketLevelAccess) {
        this.bucketPolicyOnly = Objects.requireNonNull(bucketPolicyOnly, "expected parameter 'bucketPolicyOnly' to be non-null");
        this.publicAccessPrevention = Objects.requireNonNull(publicAccessPrevention, "expected parameter 'publicAccessPrevention' to be non-null");
        this.uniformBucketLevelAccess = Objects.requireNonNull(uniformBucketLevelAccess, "expected parameter 'uniformBucketLevelAccess' to be non-null");
    }

    private BucketIamConfigurationResponse() {
        this.bucketPolicyOnly = null;
        this.publicAccessPrevention = null;
        this.uniformBucketLevelAccess = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIamConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketIamConfigurationBucketPolicyOnlyResponse bucketPolicyOnly;
        private String publicAccessPrevention;
        private BucketIamConfigurationUniformBucketLevelAccessResponse uniformBucketLevelAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIamConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketPolicyOnly = defaults.bucketPolicyOnly;
    	      this.publicAccessPrevention = defaults.publicAccessPrevention;
    	      this.uniformBucketLevelAccess = defaults.uniformBucketLevelAccess;
        }

        public Builder setBucketPolicyOnly(BucketIamConfigurationBucketPolicyOnlyResponse bucketPolicyOnly) {
            this.bucketPolicyOnly = Objects.requireNonNull(bucketPolicyOnly);
            return this;
        }

        public Builder setPublicAccessPrevention(String publicAccessPrevention) {
            this.publicAccessPrevention = Objects.requireNonNull(publicAccessPrevention);
            return this;
        }

        public Builder setUniformBucketLevelAccess(BucketIamConfigurationUniformBucketLevelAccessResponse uniformBucketLevelAccess) {
            this.uniformBucketLevelAccess = Objects.requireNonNull(uniformBucketLevelAccess);
            return this;
        }
        public BucketIamConfigurationResponse build() {
            return new BucketIamConfigurationResponse(bucketPolicyOnly, publicAccessPrevention, uniformBucketLevelAccess);
        }
    }
}
