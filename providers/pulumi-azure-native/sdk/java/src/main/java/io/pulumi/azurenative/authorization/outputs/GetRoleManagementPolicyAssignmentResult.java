// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.azurenative.authorization.outputs.PolicyAssignmentPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRoleManagementPolicyAssignmentResult {
    /**
     * The role management policy Id.
     * 
     */
    private final String id;
    /**
     * The role management policy name.
     * 
     */
    private final String name;
    /**
     * Additional properties of scope, role definition and policy
     * 
     */
    private final PolicyAssignmentPropertiesResponse policyAssignmentProperties;
    /**
     * The policy id role management policy assignment.
     * 
     */
    private final @Nullable String policyId;
    /**
     * The role definition of management policy assignment.
     * 
     */
    private final @Nullable String roleDefinitionId;
    /**
     * The role management policy scope.
     * 
     */
    private final @Nullable String scope;
    /**
     * The role management policy type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","policyAssignmentProperties","policyId","roleDefinitionId","scope","type"})
    private GetRoleManagementPolicyAssignmentResult(
        String id,
        String name,
        PolicyAssignmentPropertiesResponse policyAssignmentProperties,
        @Nullable String policyId,
        @Nullable String roleDefinitionId,
        @Nullable String scope,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.policyAssignmentProperties = Objects.requireNonNull(policyAssignmentProperties);
        this.policyId = policyId;
        this.roleDefinitionId = roleDefinitionId;
        this.scope = scope;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The role management policy Id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The role management policy name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Additional properties of scope, role definition and policy
     * 
     */
    public PolicyAssignmentPropertiesResponse getPolicyAssignmentProperties() {
        return this.policyAssignmentProperties;
    }
    /**
     * The policy id role management policy assignment.
     * 
     */
    public Optional<String> getPolicyId() {
        return Optional.ofNullable(this.policyId);
    }
    /**
     * The role definition of management policy assignment.
     * 
     */
    public Optional<String> getRoleDefinitionId() {
        return Optional.ofNullable(this.roleDefinitionId);
    }
    /**
     * The role management policy scope.
     * 
     */
    public Optional<String> getScope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * The role management policy type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleManagementPolicyAssignmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private PolicyAssignmentPropertiesResponse policyAssignmentProperties;
        private @Nullable String policyId;
        private @Nullable String roleDefinitionId;
        private @Nullable String scope;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoleManagementPolicyAssignmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.policyAssignmentProperties = defaults.policyAssignmentProperties;
    	      this.policyId = defaults.policyId;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
    	      this.scope = defaults.scope;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPolicyAssignmentProperties(PolicyAssignmentPropertiesResponse policyAssignmentProperties) {
            this.policyAssignmentProperties = Objects.requireNonNull(policyAssignmentProperties);
            return this;
        }

        public Builder setPolicyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder setRoleDefinitionId(@Nullable String roleDefinitionId) {
            this.roleDefinitionId = roleDefinitionId;
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetRoleManagementPolicyAssignmentResult build() {
            return new GetRoleManagementPolicyAssignmentResult(id, name, policyAssignmentProperties, policyId, roleDefinitionId, scope, type);
        }
    }
}
