// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UserAssignedManagedIdentityResponse {
    /**
     * The client ID.
     * 
     */
    private final String clientId;
    /**
     * The principal ID.
     * 
     */
    private final String principalId;

    @CustomType.Constructor
    private UserAssignedManagedIdentityResponse(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("principalId") String principalId) {
        this.clientId = clientId;
        this.principalId = principalId;
    }

    /**
     * The client ID.
     * 
    */
    public String getClientId() {
        return this.clientId;
    }
    /**
     * The principal ID.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAssignedManagedIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAssignedManagedIdentityResponse defaults) {
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
        public UserAssignedManagedIdentityResponse build() {
            return new UserAssignedManagedIdentityResponse(clientId, principalId);
        }
    }
}
