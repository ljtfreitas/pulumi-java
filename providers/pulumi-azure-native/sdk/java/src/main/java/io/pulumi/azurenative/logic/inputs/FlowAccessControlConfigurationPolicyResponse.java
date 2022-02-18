// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.IpAddressRangeResponse;
import io.pulumi.azurenative.logic.inputs.OpenAuthenticationAccessPoliciesResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The access control configuration policy.
 * 
 */
public final class FlowAccessControlConfigurationPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final FlowAccessControlConfigurationPolicyResponse Empty = new FlowAccessControlConfigurationPolicyResponse();

    /**
     * The allowed caller IP address ranges.
     * 
     */
    @InputImport(name="allowedCallerIpAddresses")
    private final @Nullable List<IpAddressRangeResponse> allowedCallerIpAddresses;

    public List<IpAddressRangeResponse> getAllowedCallerIpAddresses() {
        return this.allowedCallerIpAddresses == null ? List.of() : this.allowedCallerIpAddresses;
    }

    /**
     * The authentication policies for workflow.
     * 
     */
    @InputImport(name="openAuthenticationPolicies")
    private final @Nullable OpenAuthenticationAccessPoliciesResponse openAuthenticationPolicies;

    public Optional<OpenAuthenticationAccessPoliciesResponse> getOpenAuthenticationPolicies() {
        return this.openAuthenticationPolicies == null ? Optional.empty() : Optional.ofNullable(this.openAuthenticationPolicies);
    }

    public FlowAccessControlConfigurationPolicyResponse(
        @Nullable List<IpAddressRangeResponse> allowedCallerIpAddresses,
        @Nullable OpenAuthenticationAccessPoliciesResponse openAuthenticationPolicies) {
        this.allowedCallerIpAddresses = allowedCallerIpAddresses;
        this.openAuthenticationPolicies = openAuthenticationPolicies;
    }

    private FlowAccessControlConfigurationPolicyResponse() {
        this.allowedCallerIpAddresses = List.of();
        this.openAuthenticationPolicies = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowAccessControlConfigurationPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<IpAddressRangeResponse> allowedCallerIpAddresses;
        private @Nullable OpenAuthenticationAccessPoliciesResponse openAuthenticationPolicies;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowAccessControlConfigurationPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedCallerIpAddresses = defaults.allowedCallerIpAddresses;
    	      this.openAuthenticationPolicies = defaults.openAuthenticationPolicies;
        }

        public Builder setAllowedCallerIpAddresses(@Nullable List<IpAddressRangeResponse> allowedCallerIpAddresses) {
            this.allowedCallerIpAddresses = allowedCallerIpAddresses;
            return this;
        }

        public Builder setOpenAuthenticationPolicies(@Nullable OpenAuthenticationAccessPoliciesResponse openAuthenticationPolicies) {
            this.openAuthenticationPolicies = openAuthenticationPolicies;
            return this;
        }

        public FlowAccessControlConfigurationPolicyResponse build() {
            return new FlowAccessControlConfigurationPolicyResponse(allowedCallerIpAddresses, openAuthenticationPolicies);
        }
    }
}
