// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.orgpolicy_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOrganizationPolicyArgs Empty = new GetOrganizationPolicyArgs();

    @InputImport(name="organizationId", required=true)
      private final String organizationId;

    public String getOrganizationId() {
        return this.organizationId;
    }

    @InputImport(name="policyId", required=true)
      private final String policyId;

    public String getPolicyId() {
        return this.policyId;
    }

    public GetOrganizationPolicyArgs(
        String organizationId,
        String policyId) {
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.policyId = Objects.requireNonNull(policyId, "expected parameter 'policyId' to be non-null");
    }

    private GetOrganizationPolicyArgs() {
        this.organizationId = null;
        this.policyId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String organizationId;
        private String policyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.organizationId = defaults.organizationId;
    	      this.policyId = defaults.policyId;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder setPolicyId(String policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }
        public GetOrganizationPolicyArgs build() {
            return new GetOrganizationPolicyArgs(organizationId, policyId);
        }
    }
}
