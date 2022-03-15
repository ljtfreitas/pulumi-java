// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration for encrypting secret payloads using customer-managed encryption keys (CMEK).
 * 
 */
public final class CustomerManagedEncryptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final CustomerManagedEncryptionResponse Empty = new CustomerManagedEncryptionResponse();

    /**
     * The resource name of the Cloud KMS CryptoKey used to encrypt secret payloads. For secrets using the UserManaged replication policy type, Cloud KMS CryptoKeys must reside in the same location as the replica location. For secrets using the Automatic replication policy type, Cloud KMS CryptoKeys must reside in `global`. The expected format is `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`.
     * 
     */
    @Import(name="kmsKeyName", required=true)
      private final String kmsKeyName;

    public String getKmsKeyName() {
        return this.kmsKeyName;
    }

    public CustomerManagedEncryptionResponse(String kmsKeyName) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
    }

    private CustomerManagedEncryptionResponse() {
        this.kmsKeyName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerManagedEncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerManagedEncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        public CustomerManagedEncryptionResponse build() {
            return new CustomerManagedEncryptionResponse(kmsKeyName);
        }
    }
}
