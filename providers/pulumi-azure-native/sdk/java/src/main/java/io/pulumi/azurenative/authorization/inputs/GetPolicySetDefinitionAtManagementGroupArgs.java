// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPolicySetDefinitionAtManagementGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPolicySetDefinitionAtManagementGroupArgs Empty = new GetPolicySetDefinitionAtManagementGroupArgs();

    /**
     * The ID of the management group.
     * 
     */
    @Import(name="managementGroupId", required=true)
      private final String managementGroupId;

    public String getManagementGroupId() {
        return this.managementGroupId;
    }

    /**
     * The name of the policy set definition to get.
     * 
     */
    @Import(name="policySetDefinitionName", required=true)
      private final String policySetDefinitionName;

    public String getPolicySetDefinitionName() {
        return this.policySetDefinitionName;
    }

    public GetPolicySetDefinitionAtManagementGroupArgs(
        String managementGroupId,
        String policySetDefinitionName) {
        this.managementGroupId = Objects.requireNonNull(managementGroupId, "expected parameter 'managementGroupId' to be non-null");
        this.policySetDefinitionName = Objects.requireNonNull(policySetDefinitionName, "expected parameter 'policySetDefinitionName' to be non-null");
    }

    private GetPolicySetDefinitionAtManagementGroupArgs() {
        this.managementGroupId = null;
        this.policySetDefinitionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicySetDefinitionAtManagementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String managementGroupId;
        private String policySetDefinitionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicySetDefinitionAtManagementGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managementGroupId = defaults.managementGroupId;
    	      this.policySetDefinitionName = defaults.policySetDefinitionName;
        }

        public Builder managementGroupId(String managementGroupId) {
            this.managementGroupId = Objects.requireNonNull(managementGroupId);
            return this;
        }

        public Builder policySetDefinitionName(String policySetDefinitionName) {
            this.policySetDefinitionName = Objects.requireNonNull(policySetDefinitionName);
            return this;
        }
        public GetPolicySetDefinitionAtManagementGroupArgs build() {
            return new GetPolicySetDefinitionAtManagementGroupArgs(managementGroupId, policySetDefinitionName);
        }
    }
}
