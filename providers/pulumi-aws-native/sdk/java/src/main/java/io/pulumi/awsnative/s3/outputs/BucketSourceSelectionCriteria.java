// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.outputs.BucketReplicaModifications;
import io.pulumi.awsnative.s3.outputs.BucketSseKmsEncryptedObjects;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketSourceSelectionCriteria {
    /**
     * A filter that you can specify for selection for modifications on replicas.
     * 
     */
    private final @Nullable BucketReplicaModifications replicaModifications;
    /**
     * A container for filter information for the selection of Amazon S3 objects encrypted with AWS KMS.
     * 
     */
    private final @Nullable BucketSseKmsEncryptedObjects sseKmsEncryptedObjects;

    @CustomType.Constructor
    private BucketSourceSelectionCriteria(
        @CustomType.Parameter("replicaModifications") @Nullable BucketReplicaModifications replicaModifications,
        @CustomType.Parameter("sseKmsEncryptedObjects") @Nullable BucketSseKmsEncryptedObjects sseKmsEncryptedObjects) {
        this.replicaModifications = replicaModifications;
        this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
    }

    /**
     * A filter that you can specify for selection for modifications on replicas.
     * 
    */
    public Optional<BucketReplicaModifications> getReplicaModifications() {
        return Optional.ofNullable(this.replicaModifications);
    }
    /**
     * A container for filter information for the selection of Amazon S3 objects encrypted with AWS KMS.
     * 
    */
    public Optional<BucketSseKmsEncryptedObjects> getSseKmsEncryptedObjects() {
        return Optional.ofNullable(this.sseKmsEncryptedObjects);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketSourceSelectionCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketReplicaModifications replicaModifications;
        private @Nullable BucketSseKmsEncryptedObjects sseKmsEncryptedObjects;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketSourceSelectionCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicaModifications = defaults.replicaModifications;
    	      this.sseKmsEncryptedObjects = defaults.sseKmsEncryptedObjects;
        }

        public Builder replicaModifications(@Nullable BucketReplicaModifications replicaModifications) {
            this.replicaModifications = replicaModifications;
            return this;
        }

        public Builder sseKmsEncryptedObjects(@Nullable BucketSseKmsEncryptedObjects sseKmsEncryptedObjects) {
            this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
            return this;
        }
        public BucketSourceSelectionCriteria build() {
            return new BucketSourceSelectionCriteria(replicaModifications, sseKmsEncryptedObjects);
        }
    }
}
