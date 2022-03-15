// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration for encrypting secret payloads using customer-managed encryption keys (CMEK).
 * 
 */
public final class CustomerManagedEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomerManagedEncryptionArgs Empty = new CustomerManagedEncryptionArgs();

    /**
     * The resource name of the Cloud KMS CryptoKey used to encrypt secret payloads. For secrets using the UserManaged replication policy type, Cloud KMS CryptoKeys must reside in the same location as the replica location. For secrets using the Automatic replication policy type, Cloud KMS CryptoKeys must reside in `global`. The expected format is `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`.
     * 
     */
    @Import(name="kmsKeyName", required=true)
      private final Output<String> kmsKeyName;

    public Output<String> getKmsKeyName() {
        return this.kmsKeyName;
    }

    public CustomerManagedEncryptionArgs(Output<String> kmsKeyName) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
    }

    private CustomerManagedEncryptionArgs() {
        this.kmsKeyName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerManagedEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerManagedEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder kmsKeyName(Output<String> kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Output.of(Objects.requireNonNull(kmsKeyName));
            return this;
        }
        public CustomerManagedEncryptionArgs build() {
            return new CustomerManagedEncryptionArgs(kmsKeyName);
        }
    }
}
