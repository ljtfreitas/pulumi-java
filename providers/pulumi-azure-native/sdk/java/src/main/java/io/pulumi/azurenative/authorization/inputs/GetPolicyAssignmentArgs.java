// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPolicyAssignmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPolicyAssignmentArgs Empty = new GetPolicyAssignmentArgs();

    /**
     * The name of the policy assignment to get.
     * 
     */
    @InputImport(name="policyAssignmentName", required=true)
        private final String policyAssignmentName;

    public String getPolicyAssignmentName() {
        return this.policyAssignmentName;
    }

    /**
     * The scope of the policy assignment. Valid scopes are: management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format: '/subscriptions/{subscriptionId}'), resource group (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or resource (format: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'
     * 
     */
    @InputImport(name="scope", required=true)
        private final String scope;

    public String getScope() {
        return this.scope;
    }

    public GetPolicyAssignmentArgs(
        String policyAssignmentName,
        String scope) {
        this.policyAssignmentName = Objects.requireNonNull(policyAssignmentName, "expected parameter 'policyAssignmentName' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private GetPolicyAssignmentArgs() {
        this.policyAssignmentName = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String policyAssignmentName;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyAssignmentName = defaults.policyAssignmentName;
    	      this.scope = defaults.scope;
        }

        public Builder setPolicyAssignmentName(String policyAssignmentName) {
            this.policyAssignmentName = Objects.requireNonNull(policyAssignmentName);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public GetPolicyAssignmentArgs build() {
            return new GetPolicyAssignmentArgs(policyAssignmentName, scope);
        }
    }
}
