// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.azurenative.apimanagement.outputs.CertificateInformationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HostnameConfigurationResponse {
    private final @Nullable CertificateInformationResponse certificate;
    private final @Nullable String certificatePassword;
    private final @Nullable Boolean defaultSslBinding;
    private final @Nullable String encodedCertificate;
    private final String hostName;
    private final @Nullable String identityClientId;
    private final @Nullable String keyVaultId;
    private final @Nullable Boolean negotiateClientCertificate;
    private final String type;

    @OutputCustomType.Constructor({"certificate","certificatePassword","defaultSslBinding","encodedCertificate","hostName","identityClientId","keyVaultId","negotiateClientCertificate","type"})
    private HostnameConfigurationResponse(
        @Nullable CertificateInformationResponse certificate,
        @Nullable String certificatePassword,
        @Nullable Boolean defaultSslBinding,
        @Nullable String encodedCertificate,
        String hostName,
        @Nullable String identityClientId,
        @Nullable String keyVaultId,
        @Nullable Boolean negotiateClientCertificate,
        String type) {
        this.certificate = certificate;
        this.certificatePassword = certificatePassword;
        this.defaultSslBinding = defaultSslBinding;
        this.encodedCertificate = encodedCertificate;
        this.hostName = Objects.requireNonNull(hostName);
        this.identityClientId = identityClientId;
        this.keyVaultId = keyVaultId;
        this.negotiateClientCertificate = negotiateClientCertificate;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<CertificateInformationResponse> getCertificate() {
        return Optional.ofNullable(this.certificate);
    }
    public Optional<String> getCertificatePassword() {
        return Optional.ofNullable(this.certificatePassword);
    }
    public Optional<Boolean> getDefaultSslBinding() {
        return Optional.ofNullable(this.defaultSslBinding);
    }
    public Optional<String> getEncodedCertificate() {
        return Optional.ofNullable(this.encodedCertificate);
    }
    public String getHostName() {
        return this.hostName;
    }
    public Optional<String> getIdentityClientId() {
        return Optional.ofNullable(this.identityClientId);
    }
    public Optional<String> getKeyVaultId() {
        return Optional.ofNullable(this.keyVaultId);
    }
    public Optional<Boolean> getNegotiateClientCertificate() {
        return Optional.ofNullable(this.negotiateClientCertificate);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostnameConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CertificateInformationResponse certificate;
        private @Nullable String certificatePassword;
        private @Nullable Boolean defaultSslBinding;
        private @Nullable String encodedCertificate;
        private String hostName;
        private @Nullable String identityClientId;
        private @Nullable String keyVaultId;
        private @Nullable Boolean negotiateClientCertificate;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(HostnameConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.certificatePassword = defaults.certificatePassword;
    	      this.defaultSslBinding = defaults.defaultSslBinding;
    	      this.encodedCertificate = defaults.encodedCertificate;
    	      this.hostName = defaults.hostName;
    	      this.identityClientId = defaults.identityClientId;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.negotiateClientCertificate = defaults.negotiateClientCertificate;
    	      this.type = defaults.type;
        }

        public Builder setCertificate(@Nullable CertificateInformationResponse certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder setCertificatePassword(@Nullable String certificatePassword) {
            this.certificatePassword = certificatePassword;
            return this;
        }

        public Builder setDefaultSslBinding(@Nullable Boolean defaultSslBinding) {
            this.defaultSslBinding = defaultSslBinding;
            return this;
        }

        public Builder setEncodedCertificate(@Nullable String encodedCertificate) {
            this.encodedCertificate = encodedCertificate;
            return this;
        }

        public Builder setHostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder setIdentityClientId(@Nullable String identityClientId) {
            this.identityClientId = identityClientId;
            return this;
        }

        public Builder setKeyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }

        public Builder setNegotiateClientCertificate(@Nullable Boolean negotiateClientCertificate) {
            this.negotiateClientCertificate = negotiateClientCertificate;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public HostnameConfigurationResponse build() {
            return new HostnameConfigurationResponse(certificate, certificatePassword, defaultSslBinding, encodedCertificate, hostName, identityClientId, keyVaultId, negotiateClientCertificate, type);
        }
    }
}