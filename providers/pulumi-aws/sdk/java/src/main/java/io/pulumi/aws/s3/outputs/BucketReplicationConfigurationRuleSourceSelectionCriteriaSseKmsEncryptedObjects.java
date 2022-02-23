// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects {
    /**
     * Boolean which indicates if this criteria is enabled.
     * 
     */
    private final Boolean enabled;

    @OutputCustomType.Constructor({"enabled"})
    private BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects(Boolean enabled) {
        this.enabled = Objects.requireNonNull(enabled);
    }

    /**
     * Boolean which indicates if this criteria is enabled.
     * 
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects build() {
            return new BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects(enabled);
        }
    }
}
