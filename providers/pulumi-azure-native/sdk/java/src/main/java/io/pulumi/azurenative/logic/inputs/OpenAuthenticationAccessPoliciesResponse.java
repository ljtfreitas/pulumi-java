// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.OpenAuthenticationAccessPolicyResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AuthenticationPolicy of type Open.
 * 
 */
public final class OpenAuthenticationAccessPoliciesResponse extends io.pulumi.resources.InvokeArgs {

    public static final OpenAuthenticationAccessPoliciesResponse Empty = new OpenAuthenticationAccessPoliciesResponse();

    /**
     * Open authentication policies.
     * 
     */
    @InputImport(name="policies")
    private final @Nullable Map<String,OpenAuthenticationAccessPolicyResponse> policies;

    public Map<String,OpenAuthenticationAccessPolicyResponse> getPolicies() {
        return this.policies == null ? Map.of() : this.policies;
    }

    public OpenAuthenticationAccessPoliciesResponse(@Nullable Map<String,OpenAuthenticationAccessPolicyResponse> policies) {
        this.policies = policies;
    }

    private OpenAuthenticationAccessPoliciesResponse() {
        this.policies = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenAuthenticationAccessPoliciesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,OpenAuthenticationAccessPolicyResponse> policies;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenAuthenticationAccessPoliciesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policies = defaults.policies;
        }

        public Builder setPolicies(@Nullable Map<String,OpenAuthenticationAccessPolicyResponse> policies) {
            this.policies = policies;
            return this;
        }

        public OpenAuthenticationAccessPoliciesResponse build() {
            return new OpenAuthenticationAccessPoliciesResponse(policies);
        }
    }
}
