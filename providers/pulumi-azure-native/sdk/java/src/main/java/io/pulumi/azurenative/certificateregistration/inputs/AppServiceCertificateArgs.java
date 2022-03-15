// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.certificateregistration.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Key Vault container for a certificate that is purchased through Azure.
 * 
 */
public final class AppServiceCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppServiceCertificateArgs Empty = new AppServiceCertificateArgs();

    /**
     * Key Vault resource Id.
     * 
     */
    @Import(name="keyVaultId")
      private final @Nullable Output<String> keyVaultId;

    public Output<String> getKeyVaultId() {
        return this.keyVaultId == null ? Output.empty() : this.keyVaultId;
    }

    /**
     * Key Vault secret name.
     * 
     */
    @Import(name="keyVaultSecretName")
      private final @Nullable Output<String> keyVaultSecretName;

    public Output<String> getKeyVaultSecretName() {
        return this.keyVaultSecretName == null ? Output.empty() : this.keyVaultSecretName;
    }

    public AppServiceCertificateArgs(
        @Nullable Output<String> keyVaultId,
        @Nullable Output<String> keyVaultSecretName) {
        this.keyVaultId = keyVaultId;
        this.keyVaultSecretName = keyVaultSecretName;
    }

    private AppServiceCertificateArgs() {
        this.keyVaultId = Output.empty();
        this.keyVaultSecretName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppServiceCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyVaultId;
        private @Nullable Output<String> keyVaultSecretName;

        public Builder() {
    	      // Empty
        }

        public Builder(AppServiceCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.keyVaultSecretName = defaults.keyVaultSecretName;
        }

        public Builder keyVaultId(@Nullable Output<String> keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }

        public Builder keyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = Output.ofNullable(keyVaultId);
            return this;
        }

        public Builder keyVaultSecretName(@Nullable Output<String> keyVaultSecretName) {
            this.keyVaultSecretName = keyVaultSecretName;
            return this;
        }

        public Builder keyVaultSecretName(@Nullable String keyVaultSecretName) {
            this.keyVaultSecretName = Output.ofNullable(keyVaultSecretName);
            return this;
        }
        public AppServiceCertificateArgs build() {
            return new AppServiceCertificateArgs(keyVaultId, keyVaultSecretName);
        }
    }
}
