// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.FirewallPolicyRuleMatchLayer4ConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyRuleMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleMatchArgs Empty = new FirewallPolicyRuleMatchArgs();

    /**
     * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 256.
     * 
     */
    @Import(name="destIpRanges")
      private final @Nullable Output<List<String>> destIpRanges;

    public Output<List<String>> getDestIpRanges() {
        return this.destIpRanges == null ? Output.empty() : this.destIpRanges;
    }

    /**
     * Pairs of IP protocols and ports that the rule should match. Structure is documented below.
     * 
     */
    @Import(name="layer4Configs", required=true)
      private final Output<List<FirewallPolicyRuleMatchLayer4ConfigArgs>> layer4Configs;

    public Output<List<FirewallPolicyRuleMatchLayer4ConfigArgs>> getLayer4Configs() {
        return this.layer4Configs;
    }

    /**
     * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 256.
     * 
     */
    @Import(name="srcIpRanges")
      private final @Nullable Output<List<String>> srcIpRanges;

    public Output<List<String>> getSrcIpRanges() {
        return this.srcIpRanges == null ? Output.empty() : this.srcIpRanges;
    }

    public FirewallPolicyRuleMatchArgs(
        @Nullable Output<List<String>> destIpRanges,
        Output<List<FirewallPolicyRuleMatchLayer4ConfigArgs>> layer4Configs,
        @Nullable Output<List<String>> srcIpRanges) {
        this.destIpRanges = destIpRanges;
        this.layer4Configs = Objects.requireNonNull(layer4Configs, "expected parameter 'layer4Configs' to be non-null");
        this.srcIpRanges = srcIpRanges;
    }

    private FirewallPolicyRuleMatchArgs() {
        this.destIpRanges = Output.empty();
        this.layer4Configs = Output.empty();
        this.srcIpRanges = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> destIpRanges;
        private Output<List<FirewallPolicyRuleMatchLayer4ConfigArgs>> layer4Configs;
        private @Nullable Output<List<String>> srcIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIpRanges = defaults.destIpRanges;
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

        public Builder layer4Configs(Output<List<FirewallPolicyRuleMatchLayer4ConfigArgs>> layer4Configs) {
            this.layer4Configs = Objects.requireNonNull(layer4Configs);
            return this;
        }

        public Builder layer4Configs(List<FirewallPolicyRuleMatchLayer4ConfigArgs> layer4Configs) {
            this.layer4Configs = Output.of(Objects.requireNonNull(layer4Configs));
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
        public FirewallPolicyRuleMatchArgs build() {
            return new FirewallPolicyRuleMatchArgs(destIpRanges, layer4Configs, srcIpRanges);
        }
    }
}
