// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.AsymmetricEncryptedSecretResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecretResponse Empty = new SecretResponse();

    @InputImport(name="encryptedSecret")
    private final @Nullable AsymmetricEncryptedSecretResponse encryptedSecret;

    public Optional<AsymmetricEncryptedSecretResponse> getEncryptedSecret() {
        return this.encryptedSecret == null ? Optional.empty() : Optional.ofNullable(this.encryptedSecret);
    }

    @InputImport(name="keyVaultId")
    private final @Nullable String keyVaultId;

    public Optional<String> getKeyVaultId() {
        return this.keyVaultId == null ? Optional.empty() : Optional.ofNullable(this.keyVaultId);
    }

    public SecretResponse(
        @Nullable AsymmetricEncryptedSecretResponse encryptedSecret,
        @Nullable String keyVaultId) {
        this.encryptedSecret = encryptedSecret;
        this.keyVaultId = keyVaultId;
    }

    private SecretResponse() {
        this.encryptedSecret = null;
        this.keyVaultId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AsymmetricEncryptedSecretResponse encryptedSecret;
        private @Nullable String keyVaultId;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptedSecret = defaults.encryptedSecret;
    	      this.keyVaultId = defaults.keyVaultId;
        }

        public Builder setEncryptedSecret(@Nullable AsymmetricEncryptedSecretResponse encryptedSecret) {
            this.encryptedSecret = encryptedSecret;
            return this;
        }

        public Builder setKeyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }

        public SecretResponse build() {
            return new SecretResponse(encryptedSecret, keyVaultId);
        }
    }
}