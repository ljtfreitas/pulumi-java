// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="certVersion")
    private final @Nullable Input<String> certVersion;

    public Input<String> getCertVersion() {
        return this.certVersion == null ? Input.empty() : this.certVersion;
    }

    /**
     * The certificate name of key vault.
     * 
     */
    @InputImport(name="keyVaultCertName", required=true)
    private final Input<String> keyVaultCertName;

    public Input<String> getKeyVaultCertName() {
        return this.keyVaultCertName;
    }

    /**
     * The vault uri of user key vault.
     * 
     */
    @InputImport(name="vaultUri", required=true)
    private final Input<String> vaultUri;

    public Input<String> getVaultUri() {
        return this.vaultUri;
    }

    public CertificatePropertiesArgs(
        @Nullable Input<String> certVersion,
        Input<String> keyVaultCertName,
        Input<String> vaultUri) {
        this.certVersion = certVersion;
        this.keyVaultCertName = Objects.requireNonNull(keyVaultCertName, "expected parameter 'keyVaultCertName' to be non-null");
        this.vaultUri = Objects.requireNonNull(vaultUri, "expected parameter 'vaultUri' to be non-null");
    }

    private CertificatePropertiesArgs() {
        this.certVersion = Input.empty();
        this.keyVaultCertName = Input.empty();
        this.vaultUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificatePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certVersion;
        private Input<String> keyVaultCertName;
        private Input<String> vaultUri;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificatePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certVersion = defaults.certVersion;
    	      this.keyVaultCertName = defaults.keyVaultCertName;
    	      this.vaultUri = defaults.vaultUri;
        }

        public Builder setCertVersion(@Nullable Input<String> certVersion) {
            this.certVersion = certVersion;
            return this;
        }

        public Builder setCertVersion(@Nullable String certVersion) {
            this.certVersion = Input.ofNullable(certVersion);
            return this;
        }

        public Builder setKeyVaultCertName(Input<String> keyVaultCertName) {
            this.keyVaultCertName = Objects.requireNonNull(keyVaultCertName);
            return this;
        }

        public Builder setKeyVaultCertName(String keyVaultCertName) {
            this.keyVaultCertName = Input.of(Objects.requireNonNull(keyVaultCertName));
            return this;
        }

        public Builder setVaultUri(Input<String> vaultUri) {
            this.vaultUri = Objects.requireNonNull(vaultUri);
            return this;
        }

        public Builder setVaultUri(String vaultUri) {
            this.vaultUri = Input.of(Objects.requireNonNull(vaultUri));
            return this;
        }

        public CertificatePropertiesArgs build() {
            return new CertificatePropertiesArgs(certVersion, keyVaultCertName, vaultUri);
        }
    }
}
