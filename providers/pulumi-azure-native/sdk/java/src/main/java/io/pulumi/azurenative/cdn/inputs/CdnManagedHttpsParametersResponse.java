// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.CdnCertificateSourceParametersResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the certificate source parameters using CDN managed certificate for enabling SSL.
 * 
 */
public final class CdnManagedHttpsParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final CdnManagedHttpsParametersResponse Empty = new CdnManagedHttpsParametersResponse();

    /**
     * Defines the source of the SSL certificate.
     * Expected value is 'Cdn'.
     * 
     */
    @Import(name="certificateSource", required=true)
      private final String certificateSource;

    public String getCertificateSource() {
        return this.certificateSource;
    }

    /**
     * Defines the certificate source parameters using CDN managed certificate for enabling SSL.
     * 
     */
    @Import(name="certificateSourceParameters", required=true)
      private final CdnCertificateSourceParametersResponse certificateSourceParameters;

    public CdnCertificateSourceParametersResponse getCertificateSourceParameters() {
        return this.certificateSourceParameters;
    }

    /**
     * TLS protocol version that will be used for Https
     * 
     */
    @Import(name="minimumTlsVersion")
      private final @Nullable String minimumTlsVersion;

    public Optional<String> getMinimumTlsVersion() {
        return this.minimumTlsVersion == null ? Optional.empty() : Optional.ofNullable(this.minimumTlsVersion);
    }

    /**
     * Defines the TLS extension protocol that is used for secure delivery.
     * 
     */
    @Import(name="protocolType", required=true)
      private final String protocolType;

    public String getProtocolType() {
        return this.protocolType;
    }

    public CdnManagedHttpsParametersResponse(
        String certificateSource,
        CdnCertificateSourceParametersResponse certificateSourceParameters,
        @Nullable String minimumTlsVersion,
        String protocolType) {
        this.certificateSource = Objects.requireNonNull(certificateSource, "expected parameter 'certificateSource' to be non-null");
        this.certificateSourceParameters = Objects.requireNonNull(certificateSourceParameters, "expected parameter 'certificateSourceParameters' to be non-null");
        this.minimumTlsVersion = minimumTlsVersion;
        this.protocolType = Objects.requireNonNull(protocolType, "expected parameter 'protocolType' to be non-null");
    }

    private CdnManagedHttpsParametersResponse() {
        this.certificateSource = null;
        this.certificateSourceParameters = null;
        this.minimumTlsVersion = null;
        this.protocolType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CdnManagedHttpsParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateSource;
        private CdnCertificateSourceParametersResponse certificateSourceParameters;
        private @Nullable String minimumTlsVersion;
        private String protocolType;

        public Builder() {
    	      // Empty
        }

        public Builder(CdnManagedHttpsParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateSource = defaults.certificateSource;
    	      this.certificateSourceParameters = defaults.certificateSourceParameters;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.protocolType = defaults.protocolType;
        }

        public Builder certificateSource(String certificateSource) {
            this.certificateSource = Objects.requireNonNull(certificateSource);
            return this;
        }

        public Builder certificateSourceParameters(CdnCertificateSourceParametersResponse certificateSourceParameters) {
            this.certificateSourceParameters = Objects.requireNonNull(certificateSourceParameters);
            return this;
        }

        public Builder minimumTlsVersion(@Nullable String minimumTlsVersion) {
            this.minimumTlsVersion = minimumTlsVersion;
            return this;
        }

        public Builder protocolType(String protocolType) {
            this.protocolType = Objects.requireNonNull(protocolType);
            return this;
        }
        public CdnManagedHttpsParametersResponse build() {
            return new CdnManagedHttpsParametersResponse(certificateSource, certificateSourceParameters, minimumTlsVersion, protocolType);
        }
    }
}
