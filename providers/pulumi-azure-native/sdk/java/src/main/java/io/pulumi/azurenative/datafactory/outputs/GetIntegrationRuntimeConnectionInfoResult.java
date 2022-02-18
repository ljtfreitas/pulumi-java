// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetIntegrationRuntimeConnectionInfoResult {
    /**
     * The on-premises integration runtime host URL.
     * 
     */
    private final String hostServiceUri;
    /**
     * The integration runtime SSL certificate thumbprint. Click-Once application uses it to do server validation.
     * 
     */
    private final String identityCertThumbprint;
    /**
     * Whether the identity certificate is expired.
     * 
     */
    private final Boolean isIdentityCertExprired;
    /**
     * The public key for encrypting a credential when transferring the credential to the integration runtime.
     * 
     */
    private final String publicKey;
    /**
     * The token generated in service. Callers use this token to authenticate to integration runtime.
     * 
     */
    private final String serviceToken;
    /**
     * The integration runtime version.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"hostServiceUri","identityCertThumbprint","isIdentityCertExprired","publicKey","serviceToken","version"})
    private GetIntegrationRuntimeConnectionInfoResult(
        String hostServiceUri,
        String identityCertThumbprint,
        Boolean isIdentityCertExprired,
        String publicKey,
        String serviceToken,
        String version) {
        this.hostServiceUri = Objects.requireNonNull(hostServiceUri);
        this.identityCertThumbprint = Objects.requireNonNull(identityCertThumbprint);
        this.isIdentityCertExprired = Objects.requireNonNull(isIdentityCertExprired);
        this.publicKey = Objects.requireNonNull(publicKey);
        this.serviceToken = Objects.requireNonNull(serviceToken);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * The on-premises integration runtime host URL.
     * 
     */
    public String getHostServiceUri() {
        return this.hostServiceUri;
    }
    /**
     * The integration runtime SSL certificate thumbprint. Click-Once application uses it to do server validation.
     * 
     */
    public String getIdentityCertThumbprint() {
        return this.identityCertThumbprint;
    }
    /**
     * Whether the identity certificate is expired.
     * 
     */
    public Boolean getIsIdentityCertExprired() {
        return this.isIdentityCertExprired;
    }
    /**
     * The public key for encrypting a credential when transferring the credential to the integration runtime.
     * 
     */
    public String getPublicKey() {
        return this.publicKey;
    }
    /**
     * The token generated in service. Callers use this token to authenticate to integration runtime.
     * 
     */
    public String getServiceToken() {
        return this.serviceToken;
    }
    /**
     * The integration runtime version.
     * 
     */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationRuntimeConnectionInfoResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostServiceUri;
        private String identityCertThumbprint;
        private Boolean isIdentityCertExprired;
        private String publicKey;
        private String serviceToken;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationRuntimeConnectionInfoResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostServiceUri = defaults.hostServiceUri;
    	      this.identityCertThumbprint = defaults.identityCertThumbprint;
    	      this.isIdentityCertExprired = defaults.isIdentityCertExprired;
    	      this.publicKey = defaults.publicKey;
    	      this.serviceToken = defaults.serviceToken;
    	      this.version = defaults.version;
        }

        public Builder setHostServiceUri(String hostServiceUri) {
            this.hostServiceUri = Objects.requireNonNull(hostServiceUri);
            return this;
        }

        public Builder setIdentityCertThumbprint(String identityCertThumbprint) {
            this.identityCertThumbprint = Objects.requireNonNull(identityCertThumbprint);
            return this;
        }

        public Builder setIsIdentityCertExprired(Boolean isIdentityCertExprired) {
            this.isIdentityCertExprired = Objects.requireNonNull(isIdentityCertExprired);
            return this;
        }

        public Builder setPublicKey(String publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }

        public Builder setServiceToken(String serviceToken) {
            this.serviceToken = Objects.requireNonNull(serviceToken);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public GetIntegrationRuntimeConnectionInfoResult build() {
            return new GetIntegrationRuntimeConnectionInfoResult(hostServiceUri, identityCertThumbprint, isIdentityCertExprired, publicKey, serviceToken, version);
        }
    }
}
