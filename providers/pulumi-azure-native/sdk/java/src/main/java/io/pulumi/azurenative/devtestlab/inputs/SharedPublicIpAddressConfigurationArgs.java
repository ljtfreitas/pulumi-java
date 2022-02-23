// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.inputs.InboundNatRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of a virtual machine that determine how it is connected to a load balancer.
 * 
 */
public final class SharedPublicIpAddressConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SharedPublicIpAddressConfigurationArgs Empty = new SharedPublicIpAddressConfigurationArgs();

    /**
     * The incoming NAT rules
     * 
     */
    @InputImport(name="inboundNatRules")
        private final @Nullable Input<List<InboundNatRuleArgs>> inboundNatRules;

    public Input<List<InboundNatRuleArgs>> getInboundNatRules() {
        return this.inboundNatRules == null ? Input.empty() : this.inboundNatRules;
    }

    public SharedPublicIpAddressConfigurationArgs(@Nullable Input<List<InboundNatRuleArgs>> inboundNatRules) {
        this.inboundNatRules = inboundNatRules;
    }

    private SharedPublicIpAddressConfigurationArgs() {
        this.inboundNatRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharedPublicIpAddressConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<InboundNatRuleArgs>> inboundNatRules;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedPublicIpAddressConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inboundNatRules = defaults.inboundNatRules;
        }

        public Builder setInboundNatRules(@Nullable Input<List<InboundNatRuleArgs>> inboundNatRules) {
            this.inboundNatRules = inboundNatRules;
            return this;
        }

        public Builder setInboundNatRules(@Nullable List<InboundNatRuleArgs> inboundNatRules) {
            this.inboundNatRules = Input.ofNullable(inboundNatRules);
            return this;
        }
        public SharedPublicIpAddressConfigurationArgs build() {
            return new SharedPublicIpAddressConfigurationArgs(inboundNatRules);
        }
    }
}
