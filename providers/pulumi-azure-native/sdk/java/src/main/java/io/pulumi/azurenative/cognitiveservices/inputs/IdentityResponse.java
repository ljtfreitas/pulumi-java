// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.azurenative.cognitiveservices.inputs.UserAssignedIdentityResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed service identity.
 * 
 */
public final class IdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final IdentityResponse Empty = new IdentityResponse();

    /**
     * Principal Id of managed service identity.
     * 
     */
    @Import(name="principalId", required=true)
      private final String principalId;

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * Tenant of managed service identity.
     * 
     */
    @Import(name="tenantId", required=true)
      private final String tenantId;

    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * Type of managed service identity.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * The list of user assigned identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}
     * 
     */
    @Import(name="userAssignedIdentities")
      private final @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities;

    public Map<String,UserAssignedIdentityResponse> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public IdentityResponse(
        String principalId,
        String tenantId,
        @Nullable String type,
        @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities) {
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private IdentityResponse() {
        this.principalId = null;
        this.tenantId = null;
        this.type = null;
        this.userAssignedIdentities = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private @Nullable String type;
        private @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder userAssignedIdentities(@Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }
        public IdentityResponse build() {
            return new IdentityResponse(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
