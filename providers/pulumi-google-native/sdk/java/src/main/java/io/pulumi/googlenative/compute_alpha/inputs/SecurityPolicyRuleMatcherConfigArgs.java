// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyRuleMatcherConfigDestinationPortArgs;
import io.pulumi.googlenative.compute_alpha.inputs.SecurityPolicyRuleMatcherConfigLayer4ConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyRuleMatcherConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleMatcherConfigArgs Empty = new SecurityPolicyRuleMatcherConfigArgs();

    /**
     * CIDR IP address range. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    @Import(name="destIpRanges")
      private final @Nullable Output<List<String>> destIpRanges;

    public Output<List<String>> getDestIpRanges() {
        return this.destIpRanges == null ? Output.empty() : this.destIpRanges;
    }

    /**
     * Pairs of IP protocols and ports that the rule should match. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    @Import(name="destPorts")
      private final @Nullable Output<List<SecurityPolicyRuleMatcherConfigDestinationPortArgs>> destPorts;

    public Output<List<SecurityPolicyRuleMatcherConfigDestinationPortArgs>> getDestPorts() {
        return this.destPorts == null ? Output.empty() : this.destPorts;
    }

    /**
     * Pairs of IP protocols and ports that the rule should match. This field may only be specified when versioned_expr is set to FIREWALL.
     * 
     */
    @Import(name="layer4Configs")
      private final @Nullable Output<List<SecurityPolicyRuleMatcherConfigLayer4ConfigArgs>> layer4Configs;

    public Output<List<SecurityPolicyRuleMatcherConfigLayer4ConfigArgs>> getLayer4Configs() {
        return this.layer4Configs == null ? Output.empty() : this.layer4Configs;
    }

    /**
     * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
     * 
     */
    @Import(name="srcIpRanges")
      private final @Nullable Output<List<String>> srcIpRanges;

    public Output<List<String>> getSrcIpRanges() {
        return this.srcIpRanges == null ? Output.empty() : this.srcIpRanges;
    }

    public SecurityPolicyRuleMatcherConfigArgs(
        @Nullable Output<List<String>> destIpRanges,
        @Nullable Output<List<SecurityPolicyRuleMatcherConfigDestinationPortArgs>> destPorts,
        @Nullable Output<List<SecurityPolicyRuleMatcherConfigLayer4ConfigArgs>> layer4Configs,
        @Nullable Output<List<String>> srcIpRanges) {
        this.destIpRanges = destIpRanges;
        this.destPorts = destPorts;
        this.layer4Configs = layer4Configs;
        this.srcIpRanges = srcIpRanges;
    }

    private SecurityPolicyRuleMatcherConfigArgs() {
        this.destIpRanges = Output.empty();
        this.destPorts = Output.empty();
        this.layer4Configs = Output.empty();
        this.srcIpRanges = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleMatcherConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> destIpRanges;
        private @Nullable Output<List<SecurityPolicyRuleMatcherConfigDestinationPortArgs>> destPorts;
        private @Nullable Output<List<SecurityPolicyRuleMatcherConfigLayer4ConfigArgs>> layer4Configs;
        private @Nullable Output<List<String>> srcIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleMatcherConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIpRanges = defaults.destIpRanges;
    	      this.destPorts = defaults.destPorts;
    	      this.layer4Configs = defaults.layer4Configs;
    	      this.srcIpRanges = defaults.srcIpRanges;
        }

        public Builder destIpRanges(@Nullable Output<List<String>> destIpRanges) {
            this.destIpRanges = destIpRanges;
            return this;
        }

        public Builder destIpRanges(@Nullable List<String> destIpRanges) {
            this.destIpRanges = Output.ofNullable(destIpRanges);
            return this;
        }

        public Builder destPorts(@Nullable Output<List<SecurityPolicyRuleMatcherConfigDestinationPortArgs>> destPorts) {
            this.destPorts = destPorts;
            return this;
        }

        public Builder destPorts(@Nullable List<SecurityPolicyRuleMatcherConfigDestinationPortArgs> destPorts) {
            this.destPorts = Output.ofNullable(destPorts);
            return this;
        }

        public Builder layer4Configs(@Nullable Output<List<SecurityPolicyRuleMatcherConfigLayer4ConfigArgs>> layer4Configs) {
            this.layer4Configs = layer4Configs;
            return this;
        }

        public Builder layer4Configs(@Nullable List<SecurityPolicyRuleMatcherConfigLayer4ConfigArgs> layer4Configs) {
            this.layer4Configs = Output.ofNullable(layer4Configs);
            return this;
        }

        public Builder srcIpRanges(@Nullable Output<List<String>> srcIpRanges) {
            this.srcIpRanges = srcIpRanges;
            return this;
        }

        public Builder srcIpRanges(@Nullable List<String> srcIpRanges) {
            this.srcIpRanges = Output.ofNullable(srcIpRanges);
            return this;
        }
        public SecurityPolicyRuleMatcherConfigArgs build() {
            return new SecurityPolicyRuleMatcherConfigArgs(destIpRanges, destPorts, layer4Configs, srcIpRanges);
        }
    }
}
