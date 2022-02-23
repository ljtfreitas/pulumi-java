// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The workspace provider authorization.
 * 
 */
public final class WorkspaceProviderAuthorizationResponse extends io.pulumi.resources.InvokeArgs {

    public static final WorkspaceProviderAuthorizationResponse Empty = new WorkspaceProviderAuthorizationResponse();

    /**
     * The provider's principal identifier. This is the identity that the provider will use to call ARM to manage the workspace resources.
     * 
     */
    @InputImport(name="principalId", required=true)
        private final String principalId;

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * The provider's role definition identifier. This role will define all the permissions that the provider must have on the workspace's container resource group. This role definition cannot have permission to delete the resource group.
     * 
     */
    @InputImport(name="roleDefinitionId", required=true)
        private final String roleDefinitionId;

    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }

    public WorkspaceProviderAuthorizationResponse(
        String principalId,
        String roleDefinitionId) {
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId, "expected parameter 'roleDefinitionId' to be non-null");
    }

    private WorkspaceProviderAuthorizationResponse() {
        this.principalId = null;
        this.roleDefinitionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceProviderAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String roleDefinitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceProviderAuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setRoleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }
        public WorkspaceProviderAuthorizationResponse build() {
            return new WorkspaceProviderAuthorizationResponse(principalId, roleDefinitionId);
        }
    }
}
