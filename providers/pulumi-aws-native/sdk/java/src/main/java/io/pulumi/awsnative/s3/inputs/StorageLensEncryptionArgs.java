// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import java.util.Objects;


/**
 * Configures the server-side encryption for Amazon S3 Storage Lens report files with either S3-managed keys (SSE-S3) or KMS-managed keys (SSE-KMS).
 * 
 */
public final class StorageLensEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageLensEncryptionArgs Empty = new StorageLensEncryptionArgs();

    public StorageLensEncryptionArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public StorageLensEncryptionArgs build() {
            return new StorageLensEncryptionArgs();
        }
    }
}
