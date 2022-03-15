// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Disk Encryption Key Information (BitLocker Encryption Key (BEK) on Windows).
 * 
 */
public final class DiskEncryptionKeyInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskEncryptionKeyInfoArgs Empty = new DiskEncryptionKeyInfoArgs();

    /**
     * The KeyVault resource ARM Id for secret.
     * 
     */
    @Import(name="keyVaultResourceArmId")
      private final @Nullable Output<String> keyVaultResourceArmId;

    public Output<String> getKeyVaultResourceArmId() {
        return this.keyVaultResourceArmId == null ? Output.empty() : this.keyVaultResourceArmId;
    }

    /**
     * The secret URL / identifier.
     * 
     */
    @Import(name="secretIdentifier")
      private final @Nullable Output<String> secretIdentifier;

    public Output<String> getSecretIdentifier() {
        return this.secretIdentifier == null ? Output.empty() : this.secretIdentifier;
    }

    public DiskEncryptionKeyInfoArgs(
        @Nullable Output<String> keyVaultResourceArmId,
        @Nullable Output<String> secretIdentifier) {
        this.keyVaultResourceArmId = keyVaultResourceArmId;
        this.secretIdentifier = secretIdentifier;
    }

    private DiskEncryptionKeyInfoArgs() {
        this.keyVaultResourceArmId = Output.empty();
        this.secretIdentifier = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskEncryptionKeyInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyVaultResourceArmId;
        private @Nullable Output<String> secretIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskEncryptionKeyInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultResourceArmId = defaults.keyVaultResourceArmId;
    	      this.secretIdentifier = defaults.secretIdentifier;
        }

        public Builder keyVaultResourceArmId(@Nullable Output<String> keyVaultResourceArmId) {
            this.keyVaultResourceArmId = keyVaultResourceArmId;
            return this;
        }

        public Builder keyVaultResourceArmId(@Nullable String keyVaultResourceArmId) {
            this.keyVaultResourceArmId = Output.ofNullable(keyVaultResourceArmId);
            return this;
        }

        public Builder secretIdentifier(@Nullable Output<String> secretIdentifier) {
            this.secretIdentifier = secretIdentifier;
            return this;
        }

        public Builder secretIdentifier(@Nullable String secretIdentifier) {
            this.secretIdentifier = Output.ofNullable(secretIdentifier);
            return this;
        }
        public DiskEncryptionKeyInfoArgs build() {
            return new DiskEncryptionKeyInfoArgs(keyVaultResourceArmId, secretIdentifier);
        }
    }
}
