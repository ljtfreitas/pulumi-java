// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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

    public Output<List<String>> destIpRanges() {
        return this.destIpRanges == null ? Codegen.empty() : this.destIpRanges;
    }

    /**
     * Pairs of IP protocols and ports that the rule should match. Structure is documented below.
     * 
     */
    @Import(name="layer4Configs", required=true)
      private final Output<List<FirewallPolicyRuleMatchLayer4ConfigArgs>> layer4Configs;

    public Output<List<FirewallPolicyRuleMatchLayer4ConfigArgs>> layer4Configs() {
        return this.layer4Configs;
    }

    /**
     * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 256.
     * 
     */
    @Import(name="srcIpRanges")
      private final @Nullable Output<List<String>> srcIpRanges;

    public Output<List<String>> srcIpRanges() {
        return this.srcIpRanges == null ? Codegen.empty() : this.srcIpRanges;
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
        this.destIpRanges = Codegen.empty();
        this.layer4Configs = Codegen.empty();
        this.srcIpRanges = Codegen.empty();
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
            this.destIpRanges = Codegen.ofNullable(destIpRanges);
            return this;
        }
        public Builder destIpRanges(String... destIpRanges) {
            return destIpRanges(List.of(destIpRanges));
        }
        public Builder layer4Configs(Output<List<FirewallPolicyRuleMatchLayer4ConfigArgs>> layer4Configs) {
            this.layer4Configs = Objects.requireNonNull(layer4Configs);
            return this;
        }
        public Builder layer4Configs(List<FirewallPolicyRuleMatchLayer4ConfigArgs> layer4Configs) {
            this.layer4Configs = Output.of(Objects.requireNonNull(layer4Configs));
            return this;
        }
        public Builder layer4Configs(FirewallPolicyRuleMatchLayer4ConfigArgs... layer4Configs) {
            return layer4Configs(List.of(layer4Configs));
        }
        public Builder srcIpRanges(@Nullable Output<List<String>> srcIpRanges) {
            this.srcIpRanges = srcIpRanges;
            return this;
        }
        public Builder srcIpRanges(@Nullable List<String> srcIpRanges) {
            this.srcIpRanges = Codegen.ofNullable(srcIpRanges);
            return this;
        }
        public Builder srcIpRanges(String... srcIpRanges) {
            return srcIpRanges(List.of(srcIpRanges));
        }        public FirewallPolicyRuleMatchArgs build() {
            return new FirewallPolicyRuleMatchArgs(destIpRanges, layer4Configs, srcIpRanges);
        }
    }
}
