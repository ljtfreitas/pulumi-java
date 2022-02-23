// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The parameters used to create a new firewall rule while creating a new Data Lake Analytics account.
 * 
 */
public final class CreateFirewallRuleWithAccountParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final CreateFirewallRuleWithAccountParametersArgs Empty = new CreateFirewallRuleWithAccountParametersArgs();

    /**
     * The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    @InputImport(name="endIpAddress", required=true)
        private final Input<String> endIpAddress;

    public Input<String> getEndIpAddress() {
        return this.endIpAddress;
    }

    /**
     * The unique name of the firewall rule to create.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    @InputImport(name="startIpAddress", required=true)
        private final Input<String> startIpAddress;

    public Input<String> getStartIpAddress() {
        return this.startIpAddress;
    }

    public CreateFirewallRuleWithAccountParametersArgs(
        Input<String> endIpAddress,
        Input<String> name,
        Input<String> startIpAddress) {
        this.endIpAddress = Objects.requireNonNull(endIpAddress, "expected parameter 'endIpAddress' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.startIpAddress = Objects.requireNonNull(startIpAddress, "expected parameter 'startIpAddress' to be non-null");
    }

    private CreateFirewallRuleWithAccountParametersArgs() {
        this.endIpAddress = Input.empty();
        this.name = Input.empty();
        this.startIpAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreateFirewallRuleWithAccountParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> endIpAddress;
        private Input<String> name;
        private Input<String> startIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(CreateFirewallRuleWithAccountParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIpAddress = defaults.endIpAddress;
    	      this.name = defaults.name;
    	      this.startIpAddress = defaults.startIpAddress;
        }

        public Builder setEndIpAddress(Input<String> endIpAddress) {
            this.endIpAddress = Objects.requireNonNull(endIpAddress);
            return this;
        }

        public Builder setEndIpAddress(String endIpAddress) {
            this.endIpAddress = Input.of(Objects.requireNonNull(endIpAddress));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setStartIpAddress(Input<String> startIpAddress) {
            this.startIpAddress = Objects.requireNonNull(startIpAddress);
            return this;
        }

        public Builder setStartIpAddress(String startIpAddress) {
            this.startIpAddress = Input.of(Objects.requireNonNull(startIpAddress));
            return this;
        }
        public CreateFirewallRuleWithAccountParametersArgs build() {
            return new CreateFirewallRuleWithAccountParametersArgs(endIpAddress, name, startIpAddress);
        }
    }
}
