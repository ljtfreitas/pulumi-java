// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class CustomerEncryptionKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final CustomerEncryptionKeyResponse Empty = new CustomerEncryptionKeyResponse();

    /**
     * The name of the encryption key that is stored in Google Cloud KMS. For example: "kmsKeyName": "projects/kms_project_id/locations/region/keyRings/ key_region/cryptoKeys/key
     * 
     */
    @Import(name="kmsKeyName", required=true)
      private final String kmsKeyName;

    public String getKmsKeyName() {
        return this.kmsKeyName;
    }

    /**
     * The service account being used for the encryption request for the given KMS key. If absent, the Compute Engine default service account is used. For example: "kmsKeyServiceAccount": "name@project_id.iam.gserviceaccount.com/
     * 
     */
    @Import(name="kmsKeyServiceAccount", required=true)
      private final String kmsKeyServiceAccount;

    public String getKmsKeyServiceAccount() {
        return this.kmsKeyServiceAccount;
    }

    /**
     * Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648 base64 to either encrypt or decrypt this resource. You can provide either the rawKey or the rsaEncryptedKey. For example: "rawKey": "SGVsbG8gZnJvbSBHb29nbGUgQ2xvdWQgUGxhdGZvcm0="
     * 
     */
    @Import(name="rawKey", required=true)
      private final String rawKey;

    public String getRawKey() {
        return this.rawKey;
    }

    /**
     * Specifies an RFC 4648 base64 encoded, RSA-wrapped 2048-bit customer-supplied encryption key to either encrypt or decrypt this resource. You can provide either the rawKey or the rsaEncryptedKey. For example: "rsaEncryptedKey": "ieCx/NcW06PcT7Ep1X6LUTc/hLvUDYyzSZPPVCVPTVEohpeHASqC8uw5TzyO9U+Fka9JFH z0mBibXUInrC/jEk014kCK/NPjYgEMOyssZ4ZINPKxlUh2zn1bV+MCaTICrdmuSBTWlUUiFoD D6PYznLwh8ZNdaheCeZ8ewEXgFQ8V+sDroLaN3Xs3MDTXQEMMoNUXMCZEIpg9Vtp9x2oe==" The key must meet the following requirements before you can provide it to Compute Engine: 1. The key is wrapped using a RSA public key certificate provided by Google. 2. After being wrapped, the key must be encoded in RFC 4648 base64 encoding. Gets the RSA public key certificate provided by Google at: https://cloud-certs.storage.googleapis.com/google-cloud-csek-ingress.pem
     * 
     */
    @Import(name="rsaEncryptedKey", required=true)
      private final String rsaEncryptedKey;

    public String getRsaEncryptedKey() {
        return this.rsaEncryptedKey;
    }

    /**
     * [Output only] The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied encryption key that protects this resource.
     * 
     */
    @Import(name="sha256", required=true)
      private final String sha256;

    public String getSha256() {
        return this.sha256;
    }

    public CustomerEncryptionKeyResponse(
        String kmsKeyName,
        String kmsKeyServiceAccount,
        String rawKey,
        String rsaEncryptedKey,
        String sha256) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
        this.kmsKeyServiceAccount = Objects.requireNonNull(kmsKeyServiceAccount, "expected parameter 'kmsKeyServiceAccount' to be non-null");
        this.rawKey = Objects.requireNonNull(rawKey, "expected parameter 'rawKey' to be non-null");
        this.rsaEncryptedKey = Objects.requireNonNull(rsaEncryptedKey, "expected parameter 'rsaEncryptedKey' to be non-null");
        this.sha256 = Objects.requireNonNull(sha256, "expected parameter 'sha256' to be non-null");
    }

    private CustomerEncryptionKeyResponse() {
        this.kmsKeyName = null;
        this.kmsKeyServiceAccount = null;
        this.rawKey = null;
        this.rsaEncryptedKey = null;
        this.sha256 = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerEncryptionKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;
        private String kmsKeyServiceAccount;
        private String rawKey;
        private String rsaEncryptedKey;
        private String sha256;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerEncryptionKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.kmsKeyServiceAccount = defaults.kmsKeyServiceAccount;
    	      this.rawKey = defaults.rawKey;
    	      this.rsaEncryptedKey = defaults.rsaEncryptedKey;
    	      this.sha256 = defaults.sha256;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder kmsKeyServiceAccount(String kmsKeyServiceAccount) {
            this.kmsKeyServiceAccount = Objects.requireNonNull(kmsKeyServiceAccount);
            return this;
        }

        public Builder rawKey(String rawKey) {
            this.rawKey = Objects.requireNonNull(rawKey);
            return this;
        }

        public Builder rsaEncryptedKey(String rsaEncryptedKey) {
            this.rsaEncryptedKey = Objects.requireNonNull(rsaEncryptedKey);
            return this;
        }

        public Builder sha256(String sha256) {
            this.sha256 = Objects.requireNonNull(sha256);
            return this;
        }
        public CustomerEncryptionKeyResponse build() {
            return new CustomerEncryptionKeyResponse(kmsKeyName, kmsKeyServiceAccount, rawKey, rsaEncryptedKey, sha256);
        }
    }
}
