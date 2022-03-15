// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRoleManagementPolicyAssignmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRoleManagementPolicyAssignmentArgs Empty = new GetRoleManagementPolicyAssignmentArgs();

    /**
     * The name of format {guid_guid} the role management policy assignment to get.
     * 
     */
    @Import(name="roleManagementPolicyAssignmentName", required=true)
      private final String roleManagementPolicyAssignmentName;

    public String getRoleManagementPolicyAssignmentName() {
        return this.roleManagementPolicyAssignmentName;
    }

    /**
     * The scope of the role management policy.
     * 
     */
    @Import(name="scope", required=true)
      private final String scope;

    public String getScope() {
        return this.scope;
    }

    public GetRoleManagementPolicyAssignmentArgs(
        String roleManagementPolicyAssignmentName,
        String scope) {
        this.roleManagementPolicyAssignmentName = Objects.requireNonNull(roleManagementPolicyAssignmentName, "expected parameter 'roleManagementPolicyAssignmentName' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private GetRoleManagementPolicyAssignmentArgs() {
        this.roleManagementPolicyAssignmentName = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleManagementPolicyAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String roleManagementPolicyAssignmentName;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoleManagementPolicyAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleManagementPolicyAssignmentName = defaults.roleManagementPolicyAssignmentName;
    	      this.scope = defaults.scope;
        }

        public Builder roleManagementPolicyAssignmentName(String roleManagementPolicyAssignmentName) {
            this.roleManagementPolicyAssignmentName = Objects.requireNonNull(roleManagementPolicyAssignmentName);
            return this;
        }

        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public GetRoleManagementPolicyAssignmentArgs build() {
            return new GetRoleManagementPolicyAssignmentArgs(roleManagementPolicyAssignmentName, scope);
        }
    }
}
