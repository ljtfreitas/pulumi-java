// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.BasicAuthResponse;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.ServiceAccountResponse;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class CredentialResponse {
    /**
     * Basic Auth Credential, only used by TypeProvider.
     * 
     */
    private final BasicAuthResponse basicAuth;
    /**
     * Service Account Credential, only used by Deployment.
     * 
     */
    private final ServiceAccountResponse serviceAccount;
    /**
     * Specify to use the project default credential, only supported by Deployment.
     * 
     */
    private final Boolean useProjectDefault;

    @OutputCustomType.Constructor({"basicAuth","serviceAccount","useProjectDefault"})
    private CredentialResponse(
        BasicAuthResponse basicAuth,
        ServiceAccountResponse serviceAccount,
        Boolean useProjectDefault) {
        this.basicAuth = Objects.requireNonNull(basicAuth);
        this.serviceAccount = Objects.requireNonNull(serviceAccount);
        this.useProjectDefault = Objects.requireNonNull(useProjectDefault);
    }

    /**
     * Basic Auth Credential, only used by TypeProvider.
     * 
     */
    public BasicAuthResponse getBasicAuth() {
        return this.basicAuth;
    }
    /**
     * Service Account Credential, only used by Deployment.
     * 
     */
    public ServiceAccountResponse getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Specify to use the project default credential, only supported by Deployment.
     * 
     */
    public Boolean getUseProjectDefault() {
        return this.useProjectDefault;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicAuthResponse basicAuth;
        private ServiceAccountResponse serviceAccount;
        private Boolean useProjectDefault;

        public Builder() {
    	      // Empty
        }

        public Builder(CredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicAuth = defaults.basicAuth;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.useProjectDefault = defaults.useProjectDefault;
        }

        public Builder setBasicAuth(BasicAuthResponse basicAuth) {
            this.basicAuth = Objects.requireNonNull(basicAuth);
            return this;
        }

        public Builder setServiceAccount(ServiceAccountResponse serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setUseProjectDefault(Boolean useProjectDefault) {
            this.useProjectDefault = Objects.requireNonNull(useProjectDefault);
            return this;
        }
        public CredentialResponse build() {
            return new CredentialResponse(basicAuth, serviceAccount, useProjectDefault);
        }
    }
}
