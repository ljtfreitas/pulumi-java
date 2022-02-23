// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dns.inputs.PolicyAlternativeNameServerConfigTargetNameServerGetArgs;
import java.util.List;
import java.util.Objects;


public final class PolicyAlternativeNameServerConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyAlternativeNameServerConfigGetArgs Empty = new PolicyAlternativeNameServerConfigGetArgs();

    /**
     * Sets an alternative name server for the associated networks. When specified,
     * all DNS queries are forwarded to a name server that you choose. Names such as .internal
     * are not available when an alternative name server is specified.
     * Structure is documented below.
     * 
     */
    @InputImport(name="targetNameServers", required=true)
        private final Input<List<PolicyAlternativeNameServerConfigTargetNameServerGetArgs>> targetNameServers;

    public Input<List<PolicyAlternativeNameServerConfigTargetNameServerGetArgs>> getTargetNameServers() {
        return this.targetNameServers;
    }

    public PolicyAlternativeNameServerConfigGetArgs(Input<List<PolicyAlternativeNameServerConfigTargetNameServerGetArgs>> targetNameServers) {
        this.targetNameServers = Objects.requireNonNull(targetNameServers, "expected parameter 'targetNameServers' to be non-null");
    }

    private PolicyAlternativeNameServerConfigGetArgs() {
        this.targetNameServers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAlternativeNameServerConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<PolicyAlternativeNameServerConfigTargetNameServerGetArgs>> targetNameServers;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAlternativeNameServerConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetNameServers = defaults.targetNameServers;
        }

        public Builder setTargetNameServers(Input<List<PolicyAlternativeNameServerConfigTargetNameServerGetArgs>> targetNameServers) {
            this.targetNameServers = Objects.requireNonNull(targetNameServers);
            return this;
        }

        public Builder setTargetNameServers(List<PolicyAlternativeNameServerConfigTargetNameServerGetArgs> targetNameServers) {
            this.targetNameServers = Input.of(Objects.requireNonNull(targetNameServers));
            return this;
        }
        public PolicyAlternativeNameServerConfigGetArgs build() {
            return new PolicyAlternativeNameServerConfigGetArgs(targetNameServers);
        }
    }
}
