// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationSecurityPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOrganizationSecurityPolicyArgs Empty = new GetOrganizationSecurityPolicyArgs();

    @InputImport(name="securityPolicy", required=true)
      private final String securityPolicy;

    public String getSecurityPolicy() {
        return this.securityPolicy;
    }

    public GetOrganizationSecurityPolicyArgs(String securityPolicy) {
        this.securityPolicy = Objects.requireNonNull(securityPolicy, "expected parameter 'securityPolicy' to be non-null");
    }

    private GetOrganizationSecurityPolicyArgs() {
        this.securityPolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationSecurityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String securityPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationSecurityPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityPolicy = defaults.securityPolicy;
        }

        public Builder setSecurityPolicy(String securityPolicy) {
            this.securityPolicy = Objects.requireNonNull(securityPolicy);
            return this;
        }
        public GetOrganizationSecurityPolicyArgs build() {
            return new GetOrganizationSecurityPolicyArgs(securityPolicy);
        }
    }
}
