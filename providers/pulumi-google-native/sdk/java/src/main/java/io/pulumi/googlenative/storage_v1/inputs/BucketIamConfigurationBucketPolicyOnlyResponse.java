// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * The bucket's uniform bucket-level access configuration. The feature was formerly known as Bucket Policy Only. For backward compatibility, this field will be populated with identical information as the uniformBucketLevelAccess field. We recommend using the uniformBucketLevelAccess field to enable and disable the feature.
 * 
 */
public final class BucketIamConfigurationBucketPolicyOnlyResponse extends io.pulumi.resources.InvokeArgs {

    public static final BucketIamConfigurationBucketPolicyOnlyResponse Empty = new BucketIamConfigurationBucketPolicyOnlyResponse();

    /**
     * If set, access is controlled only by bucket-level or above IAM policies.
     * 
     */
    @InputImport(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * The deadline for changing iamConfiguration.bucketPolicyOnly.enabled from true to false in RFC 3339 format. iamConfiguration.bucketPolicyOnly.enabled may be changed from true to false until the locked time, after which the field is immutable.
     * 
     */
    @InputImport(name="lockedTime", required=true)
      private final String lockedTime;

    public String getLockedTime() {
        return this.lockedTime;
    }

    public BucketIamConfigurationBucketPolicyOnlyResponse(
        Boolean enabled,
        String lockedTime) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.lockedTime = Objects.requireNonNull(lockedTime, "expected parameter 'lockedTime' to be non-null");
    }

    private BucketIamConfigurationBucketPolicyOnlyResponse() {
        this.enabled = null;
        this.lockedTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIamConfigurationBucketPolicyOnlyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String lockedTime;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIamConfigurationBucketPolicyOnlyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.lockedTime = defaults.lockedTime;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setLockedTime(String lockedTime) {
            this.lockedTime = Objects.requireNonNull(lockedTime);
            return this;
        }
        public BucketIamConfigurationBucketPolicyOnlyResponse build() {
            return new BucketIamConfigurationBucketPolicyOnlyResponse(enabled, lockedTime);
        }
    }
}
