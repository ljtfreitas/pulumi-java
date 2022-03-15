// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Certificate resource payload.
 * 
 */
public final class CertificatePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificatePropertiesArgs Empty = new CertificatePropertiesArgs();

    /**
     * The certificate version of key vault.
     * 
     */
    @Import(name="certVersion")
      private final @Nullable Output<String> certVersion;

    public Output<String> getCertVersion() {
        return this.certVersion == null ? Output.empty() : this.certVersion;
    }

    /**
     * The certificate name of key vault.
     * 
     */
    @Import(name="keyVaultCertName", required=true)
      private final Output<String> keyVaultCertName;

    public Output<String> getKeyVaultCertName() {
        return this.keyVaultCertName;
    }

    /**
     * The vault uri of user key vault.
     * 
     */
    @Import(name="vaultUri", required=true)
      private final Output<String> vaultUri;

    public Output<String> getVaultUri() {
        return this.vaultUri;
    }

    public CertificatePropertiesArgs(
        @Nullable Output<String> certVersion,
        Output<String> keyVaultCertName,
        Output<String> vaultUri) {
        this.certVersion = certVersion;
        this.keyVaultCertName = Objects.requireNonNull(keyVaultCertName, "expected parameter 'keyVaultCertName' to be non-null");
        this.vaultUri = Objects.requireNonNull(vaultUri, "expected parameter 'vaultUri' to be non-null");
    }

    private CertificatePropertiesArgs() {
        this.certVersion = Output.empty();
        this.keyVaultCertName = Output.empty();
        this.vaultUri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificatePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certVersion;
        private Output<String> keyVaultCertName;
        private Output<String> vaultUri;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificatePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certVersion = defaults.certVersion;
    	      this.keyVaultCertName = defaults.keyVaultCertName;
    	      this.vaultUri = defaults.vaultUri;
        }

        public Builder certVersion(@Nullable Output<String> certVersion) {
            this.certVersion = certVersion;
            return this;
        }

        public Builder certVersion(@Nullable String certVersion) {
            this.certVersion = Output.ofNullable(certVersion);
            return this;
        }

        public Builder keyVaultCertName(Output<String> keyVaultCertName) {
            this.keyVaultCertName = Objects.requireNonNull(keyVaultCertName);
            return this;
        }

        public Builder keyVaultCertName(String keyVaultCertName) {
            this.keyVaultCertName = Output.of(Objects.requireNonNull(keyVaultCertName));
            return this;
        }

        public Builder vaultUri(Output<String> vaultUri) {
            this.vaultUri = Objects.requireNonNull(vaultUri);
            return this;
        }

        public Builder vaultUri(String vaultUri) {
            this.vaultUri = Output.of(Objects.requireNonNull(vaultUri));
            return this;
        }
        public CertificatePropertiesArgs build() {
            return new CertificatePropertiesArgs(certVersion, keyVaultCertName, vaultUri);
        }
    }
}
