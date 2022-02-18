// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.azurenative.videoanalyzer.inputs.PemCertificateListArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.SecureIotDeviceRemoteTunnelArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.TlsValidationOptionsArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.UsernamePasswordCredentialsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * TLS endpoint describes an endpoint that the pipeline can connect to over TLS transport (data is encrypted in transit).
 * 
 */
public final class TlsEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final TlsEndpointArgs Empty = new TlsEndpointArgs();

    /**
     * Credentials to be presented to the endpoint.
     * 
     */
    @InputImport(name="credentials", required=true)
    private final Input<UsernamePasswordCredentialsArgs> credentials;

    public Input<UsernamePasswordCredentialsArgs> getCredentials() {
        return this.credentials;
    }

    /**
     * List of trusted certificate authorities when authenticating a TLS connection. A null list designates that Azure Video Analyzer's list of trusted authorities should be used.
     * 
     */
    @InputImport(name="trustedCertificates")
    private final @Nullable Input<PemCertificateListArgs> trustedCertificates;

    public Input<PemCertificateListArgs> getTrustedCertificates() {
        return this.trustedCertificates == null ? Input.empty() : this.trustedCertificates;
    }

    /**
     * Describes the tunnel through which Video Analyzer can connect to the endpoint URL. This is an optional property, typically used when the endpoint is behind a firewall.
     * 
     */
    @InputImport(name="tunnel")
    private final @Nullable Input<SecureIotDeviceRemoteTunnelArgs> tunnel;

    public Input<SecureIotDeviceRemoteTunnelArgs> getTunnel() {
        return this.tunnel == null ? Input.empty() : this.tunnel;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.TlsEndpoint'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * The endpoint URL for Video Analyzer to connect to.
     * 
     */
    @InputImport(name="url", required=true)
    private final Input<String> url;

    public Input<String> getUrl() {
        return this.url;
    }

    /**
     * Validation options to use when authenticating a TLS connection. By default, strict validation is used.
     * 
     */
    @InputImport(name="validationOptions")
    private final @Nullable Input<TlsValidationOptionsArgs> validationOptions;

    public Input<TlsValidationOptionsArgs> getValidationOptions() {
        return this.validationOptions == null ? Input.empty() : this.validationOptions;
    }

    public TlsEndpointArgs(
        Input<UsernamePasswordCredentialsArgs> credentials,
        @Nullable Input<PemCertificateListArgs> trustedCertificates,
        @Nullable Input<SecureIotDeviceRemoteTunnelArgs> tunnel,
        Input<String> type,
        Input<String> url,
        @Nullable Input<TlsValidationOptionsArgs> validationOptions) {
        this.credentials = Objects.requireNonNull(credentials, "expected parameter 'credentials' to be non-null");
        this.trustedCertificates = trustedCertificates;
        this.tunnel = tunnel;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.validationOptions = validationOptions;
    }

    private TlsEndpointArgs() {
        this.credentials = Input.empty();
        this.trustedCertificates = Input.empty();
        this.tunnel = Input.empty();
        this.type = Input.empty();
        this.url = Input.empty();
        this.validationOptions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<UsernamePasswordCredentialsArgs> credentials;
        private @Nullable Input<PemCertificateListArgs> trustedCertificates;
        private @Nullable Input<SecureIotDeviceRemoteTunnelArgs> tunnel;
        private Input<String> type;
        private Input<String> url;
        private @Nullable Input<TlsValidationOptionsArgs> validationOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.trustedCertificates = defaults.trustedCertificates;
    	      this.tunnel = defaults.tunnel;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.validationOptions = defaults.validationOptions;
        }

        public Builder setCredentials(Input<UsernamePasswordCredentialsArgs> credentials) {
            this.credentials = Objects.requireNonNull(credentials);
            return this;
        }

        public Builder setCredentials(UsernamePasswordCredentialsArgs credentials) {
            this.credentials = Input.of(Objects.requireNonNull(credentials));
            return this;
        }

        public Builder setTrustedCertificates(@Nullable Input<PemCertificateListArgs> trustedCertificates) {
            this.trustedCertificates = trustedCertificates;
            return this;
        }

        public Builder setTrustedCertificates(@Nullable PemCertificateListArgs trustedCertificates) {
            this.trustedCertificates = Input.ofNullable(trustedCertificates);
            return this;
        }

        public Builder setTunnel(@Nullable Input<SecureIotDeviceRemoteTunnelArgs> tunnel) {
            this.tunnel = tunnel;
            return this;
        }

        public Builder setTunnel(@Nullable SecureIotDeviceRemoteTunnelArgs tunnel) {
            this.tunnel = Input.ofNullable(tunnel);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUrl(Input<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Input.of(Objects.requireNonNull(url));
            return this;
        }

        public Builder setValidationOptions(@Nullable Input<TlsValidationOptionsArgs> validationOptions) {
            this.validationOptions = validationOptions;
            return this;
        }

        public Builder setValidationOptions(@Nullable TlsValidationOptionsArgs validationOptions) {
            this.validationOptions = Input.ofNullable(validationOptions);
            return this;
        }

        public TlsEndpointArgs build() {
            return new TlsEndpointArgs(credentials, trustedCertificates, tunnel, type, url, validationOptions);
        }
    }
}
