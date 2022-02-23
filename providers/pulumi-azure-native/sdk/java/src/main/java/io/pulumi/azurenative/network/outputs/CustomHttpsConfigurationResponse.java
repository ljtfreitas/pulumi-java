// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.KeyVaultCertificateSourceParametersResponseVault;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomHttpsConfigurationResponse {
    /**
     * Defines the source of the SSL certificate
     * 
     */
    private final String certificateSource;
    /**
     * Defines the type of the certificate used for secure connections to a frontendEndpoint
     * 
     */
    private final @Nullable String certificateType;
    /**
     * The minimum TLS version required from the clients to establish an SSL handshake with Front Door.
     * 
     */
    private final String minimumTlsVersion;
    /**
     * Defines the TLS extension protocol that is used for secure delivery
     * 
     */
    private final String protocolType;
    /**
     * The name of the Key Vault secret representing the full certificate PFX
     * 
     */
    private final @Nullable String secretName;
    /**
     * The version of the Key Vault secret representing the full certificate PFX
     * 
     */
    private final @Nullable String secretVersion;
    /**
     * The Key Vault containing the SSL certificate
     * 
     */
    private final @Nullable KeyVaultCertificateSourceParametersResponseVault vault;

    @OutputCustomType.Constructor({"certificateSource","certificateType","minimumTlsVersion","protocolType","secretName","secretVersion","vault"})
    private CustomHttpsConfigurationResponse(
        String certificateSource,
        @Nullable String certificateType,
        String minimumTlsVersion,
        String protocolType,
        @Nullable String secretName,
        @Nullable String secretVersion,
        @Nullable KeyVaultCertificateSourceParametersResponseVault vault) {
        this.certificateSource = Objects.requireNonNull(certificateSource);
        this.certificateType = certificateType;
        this.minimumTlsVersion = Objects.requireNonNull(minimumTlsVersion);
        this.protocolType = Objects.requireNonNull(protocolType);
        this.secretName = secretName;
        this.secretVersion = secretVersion;
        this.vault = vault;
    }

    /**
     * Defines the source of the SSL certificate
     * 
     */
    public String getCertificateSource() {
        return this.certificateSource;
    }
    /**
     * Defines the type of the certificate used for secure connections to a frontendEndpoint
     * 
     */
    public Optional<String> getCertificateType() {
        return Optional.ofNullable(this.certificateType);
    }
    /**
     * The minimum TLS version required from the clients to establish an SSL handshake with Front Door.
     * 
     */
    public String getMinimumTlsVersion() {
        return this.minimumTlsVersion;
    }
    /**
     * Defines the TLS extension protocol that is used for secure delivery
     * 
     */
    public String getProtocolType() {
        return this.protocolType;
    }
    /**
     * The name of the Key Vault secret representing the full certificate PFX
     * 
     */
    public Optional<String> getSecretName() {
        return Optional.ofNullable(this.secretName);
    }
    /**
     * The version of the Key Vault secret representing the full certificate PFX
     * 
     */
    public Optional<String> getSecretVersion() {
        return Optional.ofNullable(this.secretVersion);
    }
    /**
     * The Key Vault containing the SSL certificate
     * 
     */
    public Optional<KeyVaultCertificateSourceParametersResponseVault> getVault() {
        return Optional.ofNullable(this.vault);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomHttpsConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateSource;
        private @Nullable String certificateType;
        private String minimumTlsVersion;
        private String protocolType;
        private @Nullable String secretName;
        private @Nullable String secretVersion;
        private @Nullable KeyVaultCertificateSourceParametersResponseVault vault;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomHttpsConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateSource = defaults.certificateSource;
    	      this.certificateType = defaults.certificateType;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.protocolType = defaults.protocolType;
    	      this.secretName = defaults.secretName;
    	      this.secretVersion = defaults.secretVersion;
    	      this.vault = defaults.vault;
        }

        public Builder setCertificateSource(String certificateSource) {
            this.certificateSource = Objects.requireNonNull(certificateSource);
            return this;
        }

        public Builder setCertificateType(@Nullable String certificateType) {
            this.certificateType = certificateType;
            return this;
        }

        public Builder setMinimumTlsVersion(String minimumTlsVersion) {
            this.minimumTlsVersion = Objects.requireNonNull(minimumTlsVersion);
            return this;
        }

        public Builder setProtocolType(String protocolType) {
            this.protocolType = Objects.requireNonNull(protocolType);
            return this;
        }

        public Builder setSecretName(@Nullable String secretName) {
            this.secretName = secretName;
            return this;
        }

        public Builder setSecretVersion(@Nullable String secretVersion) {
            this.secretVersion = secretVersion;
            return this;
        }

        public Builder setVault(@Nullable KeyVaultCertificateSourceParametersResponseVault vault) {
            this.vault = vault;
            return this;
        }
        public CustomHttpsConfigurationResponse build() {
            return new CustomHttpsConfigurationResponse(certificateSource, certificateType, minimumTlsVersion, protocolType, secretName, secretVersion, vault);
        }
    }
}
