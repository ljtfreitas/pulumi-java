// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.alpha.outputs.BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicyResponse;
import com.pulumi.googlenative.compute.alpha.outputs.BackendServiceLocalityLoadBalancingPolicyConfigPolicyResponse;
import java.util.Objects;

@CustomType
public final class BackendServiceLocalityLoadBalancingPolicyConfigResponse {
    private final BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicyResponse customPolicy;
    private final BackendServiceLocalityLoadBalancingPolicyConfigPolicyResponse policy;

    @CustomType.Constructor
    private BackendServiceLocalityLoadBalancingPolicyConfigResponse(
        @CustomType.Parameter("customPolicy") BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicyResponse customPolicy,
        @CustomType.Parameter("policy") BackendServiceLocalityLoadBalancingPolicyConfigPolicyResponse policy) {
        this.customPolicy = customPolicy;
        this.policy = policy;
    }

    public BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicyResponse customPolicy() {
        return this.customPolicy;
    }
    public BackendServiceLocalityLoadBalancingPolicyConfigPolicyResponse policy() {
        return this.policy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceLocalityLoadBalancingPolicyConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicyResponse customPolicy;
        private BackendServiceLocalityLoadBalancingPolicyConfigPolicyResponse policy;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceLocalityLoadBalancingPolicyConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customPolicy = defaults.customPolicy;
    	      this.policy = defaults.policy;
        }

        public Builder customPolicy(BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicyResponse customPolicy) {
            this.customPolicy = Objects.requireNonNull(customPolicy);
            return this;
        }
        public Builder policy(BackendServiceLocalityLoadBalancingPolicyConfigPolicyResponse policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }        public BackendServiceLocalityLoadBalancingPolicyConfigResponse build() {
            return new BackendServiceLocalityLoadBalancingPolicyConfigResponse(customPolicy, policy);
        }
    }
}
