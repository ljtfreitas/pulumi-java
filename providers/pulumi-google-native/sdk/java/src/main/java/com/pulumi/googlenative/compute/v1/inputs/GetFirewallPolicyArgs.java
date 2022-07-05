// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallPolicyArgs Empty = new GetFirewallPolicyArgs();

    @Import(name="firewallPolicy", required=true)
    private Output<String> firewallPolicy;

    public Output<String> firewallPolicy() {
        return this.firewallPolicy;
    }

    private GetFirewallPolicyArgs() {}

    private GetFirewallPolicyArgs(GetFirewallPolicyArgs $) {
        this.firewallPolicy = $.firewallPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallPolicyArgs $;

        public Builder() {
            $ = new GetFirewallPolicyArgs();
        }

        public Builder(GetFirewallPolicyArgs defaults) {
            $ = new GetFirewallPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder firewallPolicy(Output<String> firewallPolicy) {
            $.firewallPolicy = firewallPolicy;
            return this;
        }

        public Builder firewallPolicy(String firewallPolicy) {
            return firewallPolicy(Output.of(firewallPolicy));
        }

        public GetFirewallPolicyArgs build() {
            $.firewallPolicy = Objects.requireNonNull($.firewallPolicy, "expected parameter 'firewallPolicy' to be non-null");
            return $;
        }
    }

}
