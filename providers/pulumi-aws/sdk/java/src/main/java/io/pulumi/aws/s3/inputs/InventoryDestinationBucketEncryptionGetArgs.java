// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionSseKmsGetArgs;
import io.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionSseS3GetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InventoryDestinationBucketEncryptionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InventoryDestinationBucketEncryptionGetArgs Empty = new InventoryDestinationBucketEncryptionGetArgs();

    /**
     * Specifies to use server-side encryption with AWS KMS-managed keys to encrypt the inventory file (documented below).
     * 
     */
    @InputImport(name="sseKms")
    private final @Nullable Input<InventoryDestinationBucketEncryptionSseKmsGetArgs> sseKms;

    public Input<InventoryDestinationBucketEncryptionSseKmsGetArgs> getSseKms() {
        return this.sseKms == null ? Input.empty() : this.sseKms;
    }

    /**
     * Specifies to use server-side encryption with Amazon S3-managed keys (SSE-S3) to encrypt the inventory file.
     * 
     */
    @InputImport(name="sseS3")
    private final @Nullable Input<InventoryDestinationBucketEncryptionSseS3GetArgs> sseS3;

    public Input<InventoryDestinationBucketEncryptionSseS3GetArgs> getSseS3() {
        return this.sseS3 == null ? Input.empty() : this.sseS3;
    }

    public InventoryDestinationBucketEncryptionGetArgs(
        @Nullable Input<InventoryDestinationBucketEncryptionSseKmsGetArgs> sseKms,
        @Nullable Input<InventoryDestinationBucketEncryptionSseS3GetArgs> sseS3) {
        this.sseKms = sseKms;
        this.sseS3 = sseS3;
    }

    private InventoryDestinationBucketEncryptionGetArgs() {
        this.sseKms = Input.empty();
        this.sseS3 = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryDestinationBucketEncryptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<InventoryDestinationBucketEncryptionSseKmsGetArgs> sseKms;
        private @Nullable Input<InventoryDestinationBucketEncryptionSseS3GetArgs> sseS3;

        public Builder() {
    	      // Empty
        }

        public Builder(InventoryDestinationBucketEncryptionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sseKms = defaults.sseKms;
    	      this.sseS3 = defaults.sseS3;
        }

        public Builder setSseKms(@Nullable Input<InventoryDestinationBucketEncryptionSseKmsGetArgs> sseKms) {
            this.sseKms = sseKms;
            return this;
        }

        public Builder setSseKms(@Nullable InventoryDestinationBucketEncryptionSseKmsGetArgs sseKms) {
            this.sseKms = Input.ofNullable(sseKms);
            return this;
        }

        public Builder setSseS3(@Nullable Input<InventoryDestinationBucketEncryptionSseS3GetArgs> sseS3) {
            this.sseS3 = sseS3;
            return this;
        }

        public Builder setSseS3(@Nullable InventoryDestinationBucketEncryptionSseS3GetArgs sseS3) {
            this.sseS3 = Input.ofNullable(sseS3);
            return this;
        }
        public InventoryDestinationBucketEncryptionGetArgs build() {
            return new InventoryDestinationBucketEncryptionGetArgs(sseKms, sseS3);
        }
    }
}
