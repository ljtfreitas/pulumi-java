// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.IpAddressRangeArgs;
import io.pulumi.azurenative.logic.inputs.OpenAuthenticationAccessPoliciesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The access control configuration policy.
 * 
 */
public final class FlowAccessControlConfigurationPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowAccessControlConfigurationPolicyArgs Empty = new FlowAccessControlConfigurationPolicyArgs();

    /**
     * The allowed caller IP address ranges.
     * 
     */
    @InputImport(name="allowedCallerIpAddresses")
        private final @Nullable Input<List<IpAddressRangeArgs>> allowedCallerIpAddresses;

    public Input<List<IpAddressRangeArgs>> getAllowedCallerIpAddresses() {
        return this.allowedCallerIpAddresses == null ? Input.empty() : this.allowedCallerIpAddresses;
    }

    /**
     * The authentication policies for workflow.
     * 
     */
    @InputImport(name="openAuthenticationPolicies")
        private final @Nullable Input<OpenAuthenticationAccessPoliciesArgs> openAuthenticationPolicies;

    public Input<OpenAuthenticationAccessPoliciesArgs> getOpenAuthenticationPolicies() {
        return this.openAuthenticationPolicies == null ? Input.empty() : this.openAuthenticationPolicies;
    }

    public FlowAccessControlConfigurationPolicyArgs(
        @Nullable Input<List<IpAddressRangeArgs>> allowedCallerIpAddresses,
        @Nullable Input<OpenAuthenticationAccessPoliciesArgs> openAuthenticationPolicies) {
        this.allowedCallerIpAddresses = allowedCallerIpAddresses;
        this.openAuthenticationPolicies = openAuthenticationPolicies;
    }

    private FlowAccessControlConfigurationPolicyArgs() {
        this.allowedCallerIpAddresses = Input.empty();
        this.openAuthenticationPolicies = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowAccessControlConfigurationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<IpAddressRangeArgs>> allowedCallerIpAddresses;
        private @Nullable Input<OpenAuthenticationAccessPoliciesArgs> openAuthenticationPolicies;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowAccessControlConfigurationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedCallerIpAddresses = defaults.allowedCallerIpAddresses;
    	      this.openAuthenticationPolicies = defaults.openAuthenticationPolicies;
        }

        public Builder setAllowedCallerIpAddresses(@Nullable Input<List<IpAddressRangeArgs>> allowedCallerIpAddresses) {
            this.allowedCallerIpAddresses = allowedCallerIpAddresses;
            return this;
        }

        public Builder setAllowedCallerIpAddresses(@Nullable List<IpAddressRangeArgs> allowedCallerIpAddresses) {
            this.allowedCallerIpAddresses = Input.ofNullable(allowedCallerIpAddresses);
            return this;
        }

        public Builder setOpenAuthenticationPolicies(@Nullable Input<OpenAuthenticationAccessPoliciesArgs> openAuthenticationPolicies) {
            this.openAuthenticationPolicies = openAuthenticationPolicies;
            return this;
        }

        public Builder setOpenAuthenticationPolicies(@Nullable OpenAuthenticationAccessPoliciesArgs openAuthenticationPolicies) {
            this.openAuthenticationPolicies = Input.ofNullable(openAuthenticationPolicies);
            return this;
        }
        public FlowAccessControlConfigurationPolicyArgs build() {
            return new FlowAccessControlConfigurationPolicyArgs(allowedCallerIpAddresses, openAuthenticationPolicies);
        }
    }
}
