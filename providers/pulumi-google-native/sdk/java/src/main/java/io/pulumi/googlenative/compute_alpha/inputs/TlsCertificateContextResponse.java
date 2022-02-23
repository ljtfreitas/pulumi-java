// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.SdsConfigResponse;
import io.pulumi.googlenative.compute_alpha.inputs.TlsCertificatePathsResponse;
import java.lang.String;
import java.util.Objects;


/**
 * [Deprecated] Defines the mechanism to obtain the client or server certificate. Defines the mechanism to obtain the client or server certificate.
 * 
 */
public final class TlsCertificateContextResponse extends io.pulumi.resources.InvokeArgs {

    public static final TlsCertificateContextResponse Empty = new TlsCertificateContextResponse();

    /**
     * Specifies the certificate and private key paths. This field is applicable only if tlsCertificateSource is set to USE_PATH.
     * 
     */
    @InputImport(name="certificatePaths", required=true)
      private final TlsCertificatePathsResponse certificatePaths;

    public TlsCertificatePathsResponse getCertificatePaths() {
        return this.certificatePaths;
    }

    /**
     * Defines how TLS certificates are obtained.
     * 
     */
    @InputImport(name="certificateSource", required=true)
      private final String certificateSource;

    public String getCertificateSource() {
        return this.certificateSource;
    }

    /**
     * Specifies the config to retrieve certificates through SDS. This field is applicable only if tlsCertificateSource is set to USE_SDS.
     * 
     */
    @InputImport(name="sdsConfig", required=true)
      private final SdsConfigResponse sdsConfig;

    public SdsConfigResponse getSdsConfig() {
        return this.sdsConfig;
    }

    public TlsCertificateContextResponse(
        TlsCertificatePathsResponse certificatePaths,
        String certificateSource,
        SdsConfigResponse sdsConfig) {
        this.certificatePaths = Objects.requireNonNull(certificatePaths, "expected parameter 'certificatePaths' to be non-null");
        this.certificateSource = Objects.requireNonNull(certificateSource, "expected parameter 'certificateSource' to be non-null");
        this.sdsConfig = Objects.requireNonNull(sdsConfig, "expected parameter 'sdsConfig' to be non-null");
    }

    private TlsCertificateContextResponse() {
        this.certificatePaths = null;
        this.certificateSource = null;
        this.sdsConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsCertificateContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsCertificatePathsResponse certificatePaths;
        private String certificateSource;
        private SdsConfigResponse sdsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsCertificateContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificatePaths = defaults.certificatePaths;
    	      this.certificateSource = defaults.certificateSource;
    	      this.sdsConfig = defaults.sdsConfig;
        }

        public Builder setCertificatePaths(TlsCertificatePathsResponse certificatePaths) {
            this.certificatePaths = Objects.requireNonNull(certificatePaths);
            return this;
        }

        public Builder setCertificateSource(String certificateSource) {
            this.certificateSource = Objects.requireNonNull(certificateSource);
            return this;
        }

        public Builder setSdsConfig(SdsConfigResponse sdsConfig) {
            this.sdsConfig = Objects.requireNonNull(sdsConfig);
            return this;
        }
        public TlsCertificateContextResponse build() {
            return new TlsCertificateContextResponse(certificatePaths, certificateSource, sdsConfig);
        }
    }
}
