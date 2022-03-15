// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicelinker.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The authentication info when authType is servicePrincipal certificate
 * 
 */
public final class ServicePrincipalCertificateAuthInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServicePrincipalCertificateAuthInfoResponse Empty = new ServicePrincipalCertificateAuthInfoResponse();

    /**
     * The authentication type.
     * Expected value is 'servicePrincipalCertificate'.
     * 
     */
    @Import(name="authType", required=true)
      private final String authType;

    public String getAuthType() {
        return this.authType;
    }

    /**
     * ServicePrincipal certificate for servicePrincipal auth.
     * 
     */
    @Import(name="certificate", required=true)
      private final String certificate;

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * Application clientId for servicePrincipal auth.
     * 
     */
    @Import(name="clientId", required=true)
      private final String clientId;

    public String getClientId() {
        return this.clientId;
    }

    /**
     * Principal Id for servicePrincipal auth.
     * 
     */
    @Import(name="principalId", required=true)
      private final String principalId;

    public String getPrincipalId() {
        return this.principalId;
    }

    public ServicePrincipalCertificateAuthInfoResponse(
        String authType,
        String certificate,
        String clientId,
        String principalId) {
        this.authType = Objects.requireNonNull(authType, "expected parameter 'authType' to be non-null");
        this.certificate = Objects.requireNonNull(certificate, "expected parameter 'certificate' to be non-null");
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
    }

    private ServicePrincipalCertificateAuthInfoResponse() {
        this.authType = null;
        this.certificate = null;
        this.clientId = null;
        this.principalId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePrincipalCertificateAuthInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authType;
        private String certificate;
        private String clientId;
        private String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePrincipalCertificateAuthInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authType = defaults.authType;
    	      this.certificate = defaults.certificate;
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder authType(String authType) {
            this.authType = Objects.requireNonNull(authType);
            return this;
        }

        public Builder certificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public ServicePrincipalCertificateAuthInfoResponse build() {
            return new ServicePrincipalCertificateAuthInfoResponse(authType, certificate, clientId, principalId);
        }
    }
}
