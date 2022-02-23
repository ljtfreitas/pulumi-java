// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicelinker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The authentication info when authType is servicePrincipal secret
 * 
 */
public final class ServicePrincipalSecretAuthInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePrincipalSecretAuthInfoArgs Empty = new ServicePrincipalSecretAuthInfoArgs();

    /**
     * The authentication type.
     * Expected value is 'servicePrincipalSecret'.
     * 
     */
    @InputImport(name="authType", required=true)
        private final Input<String> authType;

    public Input<String> getAuthType() {
        return this.authType;
    }

    /**
     * ServicePrincipal application clientId for servicePrincipal auth.
     * 
     */
    @InputImport(name="clientId", required=true)
        private final Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId;
    }

    /**
     * Principal Id for servicePrincipal auth.
     * 
     */
    @InputImport(name="principalId", required=true)
        private final Input<String> principalId;

    public Input<String> getPrincipalId() {
        return this.principalId;
    }

    /**
     * Secret for servicePrincipal auth.
     * 
     */
    @InputImport(name="secret", required=true)
        private final Input<String> secret;

    public Input<String> getSecret() {
        return this.secret;
    }

    public ServicePrincipalSecretAuthInfoArgs(
        Input<String> authType,
        Input<String> clientId,
        Input<String> principalId,
        Input<String> secret) {
        this.authType = Objects.requireNonNull(authType, "expected parameter 'authType' to be non-null");
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
    }

    private ServicePrincipalSecretAuthInfoArgs() {
        this.authType = Input.empty();
        this.clientId = Input.empty();
        this.principalId = Input.empty();
        this.secret = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePrincipalSecretAuthInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> authType;
        private Input<String> clientId;
        private Input<String> principalId;
        private Input<String> secret;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePrincipalSecretAuthInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authType = defaults.authType;
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
    	      this.secret = defaults.secret;
        }

        public Builder setAuthType(Input<String> authType) {
            this.authType = Objects.requireNonNull(authType);
            return this;
        }

        public Builder setAuthType(String authType) {
            this.authType = Input.of(Objects.requireNonNull(authType));
            return this;
        }

        public Builder setClientId(Input<String> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Input.of(Objects.requireNonNull(clientId));
            return this;
        }

        public Builder setPrincipalId(Input<String> principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Input.of(Objects.requireNonNull(principalId));
            return this;
        }

        public Builder setSecret(Input<String> secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }

        public Builder setSecret(String secret) {
            this.secret = Input.of(Objects.requireNonNull(secret));
            return this;
        }
        public ServicePrincipalSecretAuthInfoArgs build() {
            return new ServicePrincipalSecretAuthInfoArgs(authType, clientId, principalId, secret);
        }
    }
}
