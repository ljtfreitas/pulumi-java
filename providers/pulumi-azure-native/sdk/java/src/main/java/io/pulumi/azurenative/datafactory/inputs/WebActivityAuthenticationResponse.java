// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.CredentialReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Web activity authentication properties.
 * 
 */
public final class WebActivityAuthenticationResponse extends io.pulumi.resources.InvokeArgs {

    public static final WebActivityAuthenticationResponse Empty = new WebActivityAuthenticationResponse();

    /**
     * The credential reference containing authentication information.
     * 
     */
    @InputImport(name="credential")
        private final @Nullable CredentialReferenceResponse credential;

    public Optional<CredentialReferenceResponse> getCredential() {
        return this.credential == null ? Optional.empty() : Optional.ofNullable(this.credential);
    }

    /**
     * Password for the PFX file or basic authentication / Secret when used for ServicePrincipal
     * 
     */
    @InputImport(name="password")
        private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPassword() {
        return this.password == null ? null : this.password;
    }

    /**
     * Base64-encoded contents of a PFX file or Certificate when used for ServicePrincipal
     * 
     */
    @InputImport(name="pfx")
        private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> pfx;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPfx() {
        return this.pfx == null ? null : this.pfx;
    }

    /**
     * Resource for which Azure Auth token will be requested when using MSI Authentication. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="resource")
        private final @Nullable Object resource;

    public Optional<Object> getResource() {
        return this.resource == null ? Optional.empty() : Optional.ofNullable(this.resource);
    }

    /**
     * Web activity authentication (Basic/ClientCertificate/MSI/ServicePrincipal)
     * 
     */
    @InputImport(name="type")
        private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * TenantId for which Azure Auth token will be requested when using ServicePrincipal Authentication. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="userTenant")
        private final @Nullable Object userTenant;

    public Optional<Object> getUserTenant() {
        return this.userTenant == null ? Optional.empty() : Optional.ofNullable(this.userTenant);
    }

    /**
     * Web activity authentication user name for basic authentication or ClientID when used for ServicePrincipal. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="username")
        private final @Nullable Object username;

    public Optional<Object> getUsername() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public WebActivityAuthenticationResponse(
        @Nullable CredentialReferenceResponse credential,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> pfx,
        @Nullable Object resource,
        @Nullable String type,
        @Nullable Object userTenant,
        @Nullable Object username) {
        this.credential = credential;
        this.password = password;
        this.pfx = pfx;
        this.resource = resource;
        this.type = type;
        this.userTenant = userTenant;
        this.username = username;
    }

    private WebActivityAuthenticationResponse() {
        this.credential = null;
        this.password = null;
        this.pfx = null;
        this.resource = null;
        this.type = null;
        this.userTenant = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebActivityAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CredentialReferenceResponse credential;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> pfx;
        private @Nullable Object resource;
        private @Nullable String type;
        private @Nullable Object userTenant;
        private @Nullable Object username;

        public Builder() {
    	      // Empty
        }

        public Builder(WebActivityAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credential = defaults.credential;
    	      this.password = defaults.password;
    	      this.pfx = defaults.pfx;
    	      this.resource = defaults.resource;
    	      this.type = defaults.type;
    	      this.userTenant = defaults.userTenant;
    	      this.username = defaults.username;
        }

        public Builder setCredential(@Nullable CredentialReferenceResponse credential) {
            this.credential = credential;
            return this;
        }

        public Builder setPassword(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }

        public Builder setPfx(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> pfx) {
            this.pfx = pfx;
            return this;
        }

        public Builder setResource(@Nullable Object resource) {
            this.resource = resource;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setUserTenant(@Nullable Object userTenant) {
            this.userTenant = userTenant;
            return this;
        }

        public Builder setUsername(@Nullable Object username) {
            this.username = username;
            return this;
        }
        public WebActivityAuthenticationResponse build() {
            return new WebActivityAuthenticationResponse(credential, password, pfx, resource, type, userTenant, username);
        }
    }
}
