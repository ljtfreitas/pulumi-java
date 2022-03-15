// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DiskDiskEncryptionKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskDiskEncryptionKeyArgs Empty = new DiskDiskEncryptionKeyArgs();

    /**
     * The self link of the encryption key used to encrypt the disk. Also called KmsKeyName
     * in the cloud console. Your project's Compute Engine System service account
     * (`service-{{PROJECT_NUMBER}}@compute-system.iam.gserviceaccount.com`) must have
     * `roles/cloudkms.cryptoKeyEncrypterDecrypter` to use this feature.
     * See https://cloud.google.com/compute/docs/disks/customer-managed-encryption#encrypt_a_new_persistent_disk_with_your_own_keys
     * 
     */
    @Import(name="kmsKeySelfLink")
      private final @Nullable Output<String> kmsKeySelfLink;

    public Output<String> getKmsKeySelfLink() {
        return this.kmsKeySelfLink == null ? Output.empty() : this.kmsKeySelfLink;
    }

    /**
     * The service account used for the encryption request for the given KMS key.
     * If absent, the Compute Engine Service Agent service account is used.
     * 
     */
    @Import(name="kmsKeyServiceAccount")
      private final @Nullable Output<String> kmsKeyServiceAccount;

    public Output<String> getKmsKeyServiceAccount() {
        return this.kmsKeyServiceAccount == null ? Output.empty() : this.kmsKeyServiceAccount;
    }

    /**
     * Specifies a 256-bit customer-supplied encryption key, encoded in
     * RFC 4648 base64 to either encrypt or decrypt this resource.
     * 
     */
    @Import(name="rawKey")
      private final @Nullable Output<String> rawKey;

    public Output<String> getRawKey() {
        return this.rawKey == null ? Output.empty() : this.rawKey;
    }

    /**
     * - 
     * The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied
     * encryption key that protects this resource.
     * 
     */
    @Import(name="sha256")
      private final @Nullable Output<String> sha256;

    public Output<String> getSha256() {
        return this.sha256 == null ? Output.empty() : this.sha256;
    }

    public DiskDiskEncryptionKeyArgs(
        @Nullable Output<String> kmsKeySelfLink,
        @Nullable Output<String> kmsKeyServiceAccount,
        @Nullable Output<String> rawKey,
        @Nullable Output<String> sha256) {
        this.kmsKeySelfLink = kmsKeySelfLink;
        this.kmsKeyServiceAccount = kmsKeyServiceAccount;
        this.rawKey = rawKey;
        this.sha256 = sha256;
    }

    private DiskDiskEncryptionKeyArgs() {
        this.kmsKeySelfLink = Output.empty();
        this.kmsKeyServiceAccount = Output.empty();
        this.rawKey = Output.empty();
        this.sha256 = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskDiskEncryptionKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kmsKeySelfLink;
        private @Nullable Output<String> kmsKeyServiceAccount;
        private @Nullable Output<String> rawKey;
        private @Nullable Output<String> sha256;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskDiskEncryptionKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeySelfLink = defaults.kmsKeySelfLink;
    	      this.kmsKeyServiceAccount = defaults.kmsKeyServiceAccount;
    	      this.rawKey = defaults.rawKey;
    	      this.sha256 = defaults.sha256;
        }

        public Builder kmsKeySelfLink(@Nullable Output<String> kmsKeySelfLink) {
            this.kmsKeySelfLink = kmsKeySelfLink;
            return this;
        }

        public Builder kmsKeySelfLink(@Nullable String kmsKeySelfLink) {
            this.kmsKeySelfLink = Output.ofNullable(kmsKeySelfLink);
            return this;
        }

        public Builder kmsKeyServiceAccount(@Nullable Output<String> kmsKeyServiceAccount) {
            this.kmsKeyServiceAccount = kmsKeyServiceAccount;
            return this;
        }

        public Builder kmsKeyServiceAccount(@Nullable String kmsKeyServiceAccount) {
            this.kmsKeyServiceAccount = Output.ofNullable(kmsKeyServiceAccount);
            return this;
        }

        public Builder rawKey(@Nullable Output<String> rawKey) {
            this.rawKey = rawKey;
            return this;
        }

        public Builder rawKey(@Nullable String rawKey) {
            this.rawKey = Output.ofNullable(rawKey);
            return this;
        }

        public Builder sha256(@Nullable Output<String> sha256) {
            this.sha256 = sha256;
            return this;
        }

        public Builder sha256(@Nullable String sha256) {
            this.sha256 = Output.ofNullable(sha256);
            return this;
        }
        public DiskDiskEncryptionKeyArgs build() {
            return new DiskDiskEncryptionKeyArgs(kmsKeySelfLink, kmsKeyServiceAccount, rawKey, sha256);
        }
    }
}
