// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserAssignedIdentityResponse {
    /**
     * Client App Id associated with this identity.
     * 
     */
    private final @Nullable String clientId;
    /**
     * Azure Active Directory principal ID associated with this Identity.
     * 
     */
    private final @Nullable String principalId;

    @CustomType.Constructor
    private UserAssignedIdentityResponse(
        @CustomType.Parameter("clientId") @Nullable String clientId,
        @CustomType.Parameter("principalId") @Nullable String principalId) {
        this.clientId = clientId;
        this.principalId = principalId;
    }

    /**
     * Client App Id associated with this identity.
     * 
    */
    public Optional<String> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * Azure Active Directory principal ID associated with this Identity.
     * 
    */
    public Optional<String> getPrincipalId() {
        return Optional.ofNullable(this.principalId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAssignedIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAssignedIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder principalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }
        public UserAssignedIdentityResponse build() {
            return new UserAssignedIdentityResponse(clientId, principalId);
        }
    }
}
