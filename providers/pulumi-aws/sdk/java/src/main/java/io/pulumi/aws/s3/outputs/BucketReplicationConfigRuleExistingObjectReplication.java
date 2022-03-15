// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BucketReplicationConfigRuleExistingObjectReplication {
    /**
     * Whether the existing objects should be replicated. Either `"Enabled"` or `"Disabled"`.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private BucketReplicationConfigRuleExistingObjectReplication(@CustomType.Parameter("status") String status) {
        this.status = status;
    }

    /**
     * Whether the existing objects should be replicated. Either `"Enabled"` or `"Disabled"`.
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleExistingObjectReplication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleExistingObjectReplication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public BucketReplicationConfigRuleExistingObjectReplication build() {
            return new BucketReplicationConfigRuleExistingObjectReplication(status);
        }
    }
}
