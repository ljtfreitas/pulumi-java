// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UserAssignedIdentityPropertyResponse {
    /**
     * Get the client id for the user assigned identity
     * 
     */
    private final String clientId;
    /**
     * Get the principal id for the user assigned identity
     * 
     */
    private final String principalId;

    @CustomType.Constructor
    private UserAssignedIdentityPropertyResponse(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("principalId") String principalId) {
        this.clientId = clientId;
        this.principalId = principalId;
    }

    /**
     * Get the client id for the user assigned identity
     * 
    */
    public String getClientId() {
        return this.clientId;
    }
    /**
     * Get the principal id for the user assigned identity
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAssignedIdentityPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAssignedIdentityPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public UserAssignedIdentityPropertyResponse build() {
            return new UserAssignedIdentityPropertyResponse(clientId, principalId);
        }
    }
}
