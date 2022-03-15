// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UserAssignedIdentityResponse {
    /**
     * The clientId(aka appId) of the user assigned identity.
     * 
     */
    private final String clientId;
    /**
     * The principal ID of the user assigned identity.
     * 
     */
    private final String principalId;
    /**
     * The tenant ID of the user assigned identity.
     * 
     */
    private final String tenantId;

    @CustomType.Constructor
    private UserAssignedIdentityResponse(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("tenantId") String tenantId) {
        this.clientId = clientId;
        this.principalId = principalId;
        this.tenantId = tenantId;
    }

    /**
     * The clientId(aka appId) of the user assigned identity.
     * 
    */
    public String getClientId() {
        return this.clientId;
    }
    /**
     * The principal ID of the user assigned identity.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The tenant ID of the user assigned identity.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAssignedIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String principalId;
        private String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAssignedIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public UserAssignedIdentityResponse build() {
            return new UserAssignedIdentityResponse(clientId, principalId, tenantId);
        }
    }
}
