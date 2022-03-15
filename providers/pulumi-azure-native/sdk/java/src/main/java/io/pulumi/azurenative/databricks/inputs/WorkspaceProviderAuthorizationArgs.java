// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The workspace provider authorization.
 * 
 */
public final class WorkspaceProviderAuthorizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceProviderAuthorizationArgs Empty = new WorkspaceProviderAuthorizationArgs();

    /**
     * The provider's principal identifier. This is the identity that the provider will use to call ARM to manage the workspace resources.
     * 
     */
    @Import(name="principalId", required=true)
      private final Output<String> principalId;

    public Output<String> getPrincipalId() {
        return this.principalId;
    }

    /**
     * The provider's role definition identifier. This role will define all the permissions that the provider must have on the workspace's container resource group. This role definition cannot have permission to delete the resource group.
     * 
     */
    @Import(name="roleDefinitionId", required=true)
      private final Output<String> roleDefinitionId;

    public Output<String> getRoleDefinitionId() {
        return this.roleDefinitionId;
    }

    public WorkspaceProviderAuthorizationArgs(
        Output<String> principalId,
        Output<String> roleDefinitionId) {
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId, "expected parameter 'roleDefinitionId' to be non-null");
    }

    private WorkspaceProviderAuthorizationArgs() {
        this.principalId = Output.empty();
        this.roleDefinitionId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceProviderAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> principalId;
        private Output<String> roleDefinitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceProviderAuthorizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
        }

        public Builder principalId(Output<String> principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder principalId(String principalId) {
            this.principalId = Output.of(Objects.requireNonNull(principalId));
            return this;
        }

        public Builder roleDefinitionId(Output<String> roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }

        public Builder roleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Output.of(Objects.requireNonNull(roleDefinitionId));
            return this;
        }
        public WorkspaceProviderAuthorizationArgs build() {
            return new WorkspaceProviderAuthorizationArgs(principalId, roleDefinitionId);
        }
    }
}
