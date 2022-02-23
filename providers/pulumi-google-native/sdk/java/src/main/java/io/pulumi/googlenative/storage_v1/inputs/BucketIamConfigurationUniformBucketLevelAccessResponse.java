// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * The bucket's uniform bucket-level access configuration.
 * 
 */
public final class BucketIamConfigurationUniformBucketLevelAccessResponse extends io.pulumi.resources.InvokeArgs {

    public static final BucketIamConfigurationUniformBucketLevelAccessResponse Empty = new BucketIamConfigurationUniformBucketLevelAccessResponse();

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
     * The deadline for changing iamConfiguration.uniformBucketLevelAccess.enabled from true to false in RFC 3339  format. iamConfiguration.uniformBucketLevelAccess.enabled may be changed from true to false until the locked time, after which the field is immutable.
     * 
     */
    @InputImport(name="lockedTime", required=true)
      private final String lockedTime;

    public String getLockedTime() {
        return this.lockedTime;
    }

    public BucketIamConfigurationUniformBucketLevelAccessResponse(
        Boolean enabled,
        String lockedTime) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.lockedTime = Objects.requireNonNull(lockedTime, "expected parameter 'lockedTime' to be non-null");
    }

    private BucketIamConfigurationUniformBucketLevelAccessResponse() {
        this.enabled = null;
        this.lockedTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIamConfigurationUniformBucketLevelAccessResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String lockedTime;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIamConfigurationUniformBucketLevelAccessResponse defaults) {
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
        public BucketIamConfigurationUniformBucketLevelAccessResponse build() {
            return new BucketIamConfigurationUniformBucketLevelAccessResponse(enabled, lockedTime);
        }
    }
}
