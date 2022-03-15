// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.aws.s3.outputs.InventoryDestinationBucketEncryptionSseKms;
import io.pulumi.aws.s3.outputs.InventoryDestinationBucketEncryptionSseS3;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InventoryDestinationBucketEncryption {
    /**
     * Specifies to use server-side encryption with AWS KMS-managed keys to encrypt the inventory file (documented below).
     * 
     */
    private final @Nullable InventoryDestinationBucketEncryptionSseKms sseKms;
    /**
     * Specifies to use server-side encryption with Amazon S3-managed keys (SSE-S3) to encrypt the inventory file.
     * 
     */
    private final @Nullable InventoryDestinationBucketEncryptionSseS3 sseS3;

    @CustomType.Constructor
    private InventoryDestinationBucketEncryption(
        @CustomType.Parameter("sseKms") @Nullable InventoryDestinationBucketEncryptionSseKms sseKms,
        @CustomType.Parameter("sseS3") @Nullable InventoryDestinationBucketEncryptionSseS3 sseS3) {
        this.sseKms = sseKms;
        this.sseS3 = sseS3;
    }

    /**
     * Specifies to use server-side encryption with AWS KMS-managed keys to encrypt the inventory file (documented below).
     * 
    */
    public Optional<InventoryDestinationBucketEncryptionSseKms> getSseKms() {
        return Optional.ofNullable(this.sseKms);
    }
    /**
     * Specifies to use server-side encryption with Amazon S3-managed keys (SSE-S3) to encrypt the inventory file.
     * 
    */
    public Optional<InventoryDestinationBucketEncryptionSseS3> getSseS3() {
        return Optional.ofNullable(this.sseS3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryDestinationBucketEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable InventoryDestinationBucketEncryptionSseKms sseKms;
        private @Nullable InventoryDestinationBucketEncryptionSseS3 sseS3;

        public Builder() {
    	      // Empty
        }

        public Builder(InventoryDestinationBucketEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sseKms = defaults.sseKms;
    	      this.sseS3 = defaults.sseS3;
        }

        public Builder sseKms(@Nullable InventoryDestinationBucketEncryptionSseKms sseKms) {
            this.sseKms = sseKms;
            return this;
        }

        public Builder sseS3(@Nullable InventoryDestinationBucketEncryptionSseS3 sseS3) {
            this.sseS3 = sseS3;
            return this;
        }
        public InventoryDestinationBucketEncryption build() {
            return new InventoryDestinationBucketEncryption(sseKms, sseS3);
        }
    }
}
