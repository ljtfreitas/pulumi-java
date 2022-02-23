// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BucketReplicationConfigRuleDestinationEncryptionConfiguration {
    /**
     * The ID (Key ARN or Alias ARN) of the customer managed AWS KMS key stored in AWS Key Management Service (KMS) for the destination bucket.
     * 
     */
    private final String replicaKmsKeyId;

    @OutputCustomType.Constructor({"replicaKmsKeyId"})
    private BucketReplicationConfigRuleDestinationEncryptionConfiguration(String replicaKmsKeyId) {
        this.replicaKmsKeyId = Objects.requireNonNull(replicaKmsKeyId);
    }

    /**
     * The ID (Key ARN or Alias ARN) of the customer managed AWS KMS key stored in AWS Key Management Service (KMS) for the destination bucket.
     * 
     */
    public String getReplicaKmsKeyId() {
        return this.replicaKmsKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleDestinationEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String replicaKmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleDestinationEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicaKmsKeyId = defaults.replicaKmsKeyId;
        }

        public Builder setReplicaKmsKeyId(String replicaKmsKeyId) {
            this.replicaKmsKeyId = Objects.requireNonNull(replicaKmsKeyId);
            return this;
        }
        public BucketReplicationConfigRuleDestinationEncryptionConfiguration build() {
            return new BucketReplicationConfigRuleDestinationEncryptionConfiguration(replicaKmsKeyId);
        }
    }
}
