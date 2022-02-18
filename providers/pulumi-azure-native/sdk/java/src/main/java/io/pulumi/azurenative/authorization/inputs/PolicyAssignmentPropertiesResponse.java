// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.azurenative.authorization.inputs.PolicyAssignmentPropertiesResponsePolicy;
import io.pulumi.azurenative.authorization.inputs.PolicyAssignmentPropertiesResponseRoleDefinition;
import io.pulumi.azurenative.authorization.inputs.PolicyAssignmentPropertiesResponseScope;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyAssignmentPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final PolicyAssignmentPropertiesResponse Empty = new PolicyAssignmentPropertiesResponse();

    /**
     * Details of the policy
     * 
     */
    @InputImport(name="policy")
    private final @Nullable PolicyAssignmentPropertiesResponsePolicy policy;

    public Optional<PolicyAssignmentPropertiesResponsePolicy> getPolicy() {
        return this.policy == null ? Optional.empty() : Optional.ofNullable(this.policy);
    }

    /**
     * Details of role definition
     * 
     */
    @InputImport(name="roleDefinition")
    private final @Nullable PolicyAssignmentPropertiesResponseRoleDefinition roleDefinition;

    public Optional<PolicyAssignmentPropertiesResponseRoleDefinition> getRoleDefinition() {
        return this.roleDefinition == null ? Optional.empty() : Optional.ofNullable(this.roleDefinition);
    }

    /**
     * Details of the resource scope
     * 
     */
    @InputImport(name="scope")
    private final @Nullable PolicyAssignmentPropertiesResponseScope scope;

    public Optional<PolicyAssignmentPropertiesResponseScope> getScope() {
        return this.scope == null ? Optional.empty() : Optional.ofNullable(this.scope);
    }

    public PolicyAssignmentPropertiesResponse(
        @Nullable PolicyAssignmentPropertiesResponsePolicy policy,
        @Nullable PolicyAssignmentPropertiesResponseRoleDefinition roleDefinition,
        @Nullable PolicyAssignmentPropertiesResponseScope scope) {
        this.policy = policy;
        this.roleDefinition = roleDefinition;
        this.scope = scope;
    }

    private PolicyAssignmentPropertiesResponse() {
        this.policy = null;
        this.roleDefinition = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAssignmentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PolicyAssignmentPropertiesResponsePolicy policy;
        private @Nullable PolicyAssignmentPropertiesResponseRoleDefinition roleDefinition;
        private @Nullable PolicyAssignmentPropertiesResponseScope scope;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAssignmentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.roleDefinition = defaults.roleDefinition;
    	      this.scope = defaults.scope;
        }

        public Builder setPolicy(@Nullable PolicyAssignmentPropertiesResponsePolicy policy) {
            this.policy = policy;
            return this;
        }

        public Builder setRoleDefinition(@Nullable PolicyAssignmentPropertiesResponseRoleDefinition roleDefinition) {
            this.roleDefinition = roleDefinition;
            return this;
        }

        public Builder setScope(@Nullable PolicyAssignmentPropertiesResponseScope scope) {
            this.scope = scope;
            return this;
        }

        public PolicyAssignmentPropertiesResponse build() {
            return new PolicyAssignmentPropertiesResponse(policy, roleDefinition, scope);
        }
    }
}
