// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.CredentialReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The role based access control (RBAC) authorization type integration runtime.
 * 
 */
public final class LinkedIntegrationRuntimeRbacAuthorizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkedIntegrationRuntimeRbacAuthorizationArgs Empty = new LinkedIntegrationRuntimeRbacAuthorizationArgs();

    /**
     * The authorization type for integration runtime sharing.
     * Expected value is 'RBAC'.
     * 
     */
    @InputImport(name="authorizationType", required=true)
    private final Input<String> authorizationType;

    public Input<String> getAuthorizationType() {
        return this.authorizationType;
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @InputImport(name="credential")
    private final @Nullable Input<CredentialReferenceArgs> credential;

    public Input<CredentialReferenceArgs> getCredential() {
        return this.credential == null ? Input.empty() : this.credential;
    }

    /**
     * The resource identifier of the integration runtime to be shared.
     * 
     */
    @InputImport(name="resourceId", required=true)
    private final Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId;
    }

    public LinkedIntegrationRuntimeRbacAuthorizationArgs(
        Input<String> authorizationType,
        @Nullable Input<CredentialReferenceArgs> credential,
        Input<String> resourceId) {
        this.authorizationType = Objects.requireNonNull(authorizationType, "expected parameter 'authorizationType' to be non-null");
        this.credential = credential;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
    }

    private LinkedIntegrationRuntimeRbacAuthorizationArgs() {
        this.authorizationType = Input.empty();
        this.credential = Input.empty();
        this.resourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedIntegrationRuntimeRbacAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> authorizationType;
        private @Nullable Input<CredentialReferenceArgs> credential;
        private Input<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedIntegrationRuntimeRbacAuthorizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationType = defaults.authorizationType;
    	      this.credential = defaults.credential;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setAuthorizationType(Input<String> authorizationType) {
            this.authorizationType = Objects.requireNonNull(authorizationType);
            return this;
        }

        public Builder setAuthorizationType(String authorizationType) {
            this.authorizationType = Input.of(Objects.requireNonNull(authorizationType));
            return this;
        }

        public Builder setCredential(@Nullable Input<CredentialReferenceArgs> credential) {
            this.credential = credential;
            return this;
        }

        public Builder setCredential(@Nullable CredentialReferenceArgs credential) {
            this.credential = Input.ofNullable(credential);
            return this;
        }

        public Builder setResourceId(Input<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Input.of(Objects.requireNonNull(resourceId));
            return this;
        }

        public LinkedIntegrationRuntimeRbacAuthorizationArgs build() {
            return new LinkedIntegrationRuntimeRbacAuthorizationArgs(authorizationType, credential, resourceId);
        }
    }
}
