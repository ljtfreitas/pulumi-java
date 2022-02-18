// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.inputs.SecureStringResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The key authorization type integration runtime.
 * 
 */
public final class LinkedIntegrationRuntimeKeyAuthorizationResponse extends io.pulumi.resources.InvokeArgs {

    public static final LinkedIntegrationRuntimeKeyAuthorizationResponse Empty = new LinkedIntegrationRuntimeKeyAuthorizationResponse();

    /**
     * The authorization type for integration runtime sharing.
     * Expected value is 'Key'.
     * 
     */
    @InputImport(name="authorizationType", required=true)
    private final String authorizationType;

    public String getAuthorizationType() {
        return this.authorizationType;
    }

    /**
     * The key used for authorization.
     * 
     */
    @InputImport(name="key", required=true)
    private final SecureStringResponse key;

    public SecureStringResponse getKey() {
        return this.key;
    }

    public LinkedIntegrationRuntimeKeyAuthorizationResponse(
        String authorizationType,
        SecureStringResponse key) {
        this.authorizationType = Objects.requireNonNull(authorizationType, "expected parameter 'authorizationType' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
    }

    private LinkedIntegrationRuntimeKeyAuthorizationResponse() {
        this.authorizationType = null;
        this.key = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedIntegrationRuntimeKeyAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationType;
        private SecureStringResponse key;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedIntegrationRuntimeKeyAuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationType = defaults.authorizationType;
    	      this.key = defaults.key;
        }

        public Builder setAuthorizationType(String authorizationType) {
            this.authorizationType = Objects.requireNonNull(authorizationType);
            return this;
        }

        public Builder setKey(SecureStringResponse key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public LinkedIntegrationRuntimeKeyAuthorizationResponse build() {
            return new LinkedIntegrationRuntimeKeyAuthorizationResponse(authorizationType, key);
        }
    }
}
