// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managedservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AuthorizationResponse {
    /**
     * The delegatedRoleDefinitionIds field is required when the roleDefinitionId refers to the User Access Administrator Role. It is the list of role definition ids which define all the permissions that the user in the authorization can assign to other security groups/service principals/users.
     * 
     */
    private final @Nullable List<String> delegatedRoleDefinitionIds;
    /**
     * Principal Id of the security group/service principal/user that would be assigned permissions to the projected subscription
     * 
     */
    private final String principalId;
    /**
     * Display name of the principal Id.
     * 
     */
    private final @Nullable String principalIdDisplayName;
    /**
     * The role definition identifier. This role will define all the permissions that the security group/service principal/user must have on the projected subscription. This role cannot be an owner role.
     * 
     */
    private final String roleDefinitionId;

    @CustomType.Constructor
    private AuthorizationResponse(
        @CustomType.Parameter("delegatedRoleDefinitionIds") @Nullable List<String> delegatedRoleDefinitionIds,
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("principalIdDisplayName") @Nullable String principalIdDisplayName,
        @CustomType.Parameter("roleDefinitionId") String roleDefinitionId) {
        this.delegatedRoleDefinitionIds = delegatedRoleDefinitionIds;
        this.principalId = principalId;
        this.principalIdDisplayName = principalIdDisplayName;
        this.roleDefinitionId = roleDefinitionId;
    }

    /**
     * The delegatedRoleDefinitionIds field is required when the roleDefinitionId refers to the User Access Administrator Role. It is the list of role definition ids which define all the permissions that the user in the authorization can assign to other security groups/service principals/users.
     * 
    */
    public List<String> getDelegatedRoleDefinitionIds() {
        return this.delegatedRoleDefinitionIds == null ? List.of() : this.delegatedRoleDefinitionIds;
    }
    /**
     * Principal Id of the security group/service principal/user that would be assigned permissions to the projected subscription
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * Display name of the principal Id.
     * 
    */
    public Optional<String> getPrincipalIdDisplayName() {
        return Optional.ofNullable(this.principalIdDisplayName);
    }
    /**
     * The role definition identifier. This role will define all the permissions that the security group/service principal/user must have on the projected subscription. This role cannot be an owner role.
     * 
    */
    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> delegatedRoleDefinitionIds;
        private String principalId;
        private @Nullable String principalIdDisplayName;
        private String roleDefinitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegatedRoleDefinitionIds = defaults.delegatedRoleDefinitionIds;
    	      this.principalId = defaults.principalId;
    	      this.principalIdDisplayName = defaults.principalIdDisplayName;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
        }

        public Builder delegatedRoleDefinitionIds(@Nullable List<String> delegatedRoleDefinitionIds) {
            this.delegatedRoleDefinitionIds = delegatedRoleDefinitionIds;
            return this;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder principalIdDisplayName(@Nullable String principalIdDisplayName) {
            this.principalIdDisplayName = principalIdDisplayName;
            return this;
        }

        public Builder roleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }
        public AuthorizationResponse build() {
            return new AuthorizationResponse(delegatedRoleDefinitionIds, principalId, principalIdDisplayName, roleDefinitionId);
        }
    }
}
