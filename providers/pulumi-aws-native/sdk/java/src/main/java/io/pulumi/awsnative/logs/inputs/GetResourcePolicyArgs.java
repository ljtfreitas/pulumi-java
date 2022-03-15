// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.logs.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResourcePolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetResourcePolicyArgs Empty = new GetResourcePolicyArgs();

    /**
     * A name for resource policy
     * 
     */
    @Import(name="policyName", required=true)
      private final String policyName;

    public String getPolicyName() {
        return this.policyName;
    }

    public GetResourcePolicyArgs(String policyName) {
        this.policyName = Objects.requireNonNull(policyName, "expected parameter 'policyName' to be non-null");
    }

    private GetResourcePolicyArgs() {
        this.policyName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String policyName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyName = defaults.policyName;
        }

        public Builder policyName(String policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }
        public GetResourcePolicyArgs build() {
            return new GetResourcePolicyArgs(policyName);
        }
    }
}
