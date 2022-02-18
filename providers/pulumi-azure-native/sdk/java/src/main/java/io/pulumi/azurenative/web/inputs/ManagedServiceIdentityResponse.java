// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ManagedServiceIdentityResponseUserAssignedIdentities;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed service identity.
 * 
 */
public final class ManagedServiceIdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedServiceIdentityResponse Empty = new ManagedServiceIdentityResponse();

    /**
     * Principal Id of managed service identity.
     * 
     */
    @InputImport(name="principalId", required=true)
    private final String principalId;

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * Tenant of managed service identity.
     * 
     */
    @InputImport(name="tenantId", required=true)
    private final String tenantId;

    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * Type of managed service identity.
     * 
     */
    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * The list of user assigned identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}
     * 
     */
    @InputImport(name="userAssignedIdentities")
    private final @Nullable Map<String,ManagedServiceIdentityResponseUserAssignedIdentities> userAssignedIdentities;

    public Map<String,ManagedServiceIdentityResponseUserAssignedIdentities> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public ManagedServiceIdentityResponse(
        String principalId,
        String tenantId,
        @Nullable String type,
        @Nullable Map<String,ManagedServiceIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private ManagedServiceIdentityResponse() {
        this.principalId = null;
        this.tenantId = null;
        this.type = null;
        this.userAssignedIdentities = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedServiceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private @Nullable String type;
        private @Nullable Map<String,ManagedServiceIdentityResponseUserAssignedIdentities> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedServiceIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Map<String,ManagedServiceIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public ManagedServiceIdentityResponse build() {
            return new ManagedServiceIdentityResponse(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
