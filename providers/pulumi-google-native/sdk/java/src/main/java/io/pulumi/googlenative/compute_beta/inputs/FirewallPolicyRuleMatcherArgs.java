// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.FirewallPolicyRuleMatcherLayer4ConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a match condition that incoming traffic is evaluated against. Exactly one field must be specified.
 * 
 */
public final class FirewallPolicyRuleMatcherArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleMatcherArgs Empty = new FirewallPolicyRuleMatcherArgs();

    /**
     * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
     * 
     */
    @InputImport(name="destIpRanges")
      private final @Nullable Input<List<String>> destIpRanges;

    public Input<List<String>> getDestIpRanges() {
        return this.destIpRanges == null ? Input.empty() : this.destIpRanges;
    }

    /**
     * Pairs of IP protocols and ports that the rule should match.
     * 
     */
    @InputImport(name="layer4Configs")
      private final @Nullable Input<List<FirewallPolicyRuleMatcherLayer4ConfigArgs>> layer4Configs;

    public Input<List<FirewallPolicyRuleMatcherLayer4ConfigArgs>> getLayer4Configs() {
        return this.layer4Configs == null ? Input.empty() : this.layer4Configs;
    }

    /**
     * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
     * 
     */
    @InputImport(name="srcIpRanges")
      private final @Nullable Input<List<String>> srcIpRanges;

    public Input<List<String>> getSrcIpRanges() {
        return this.srcIpRanges == null ? Input.empty() : this.srcIpRanges;
    }

    public FirewallPolicyRuleMatcherArgs(
        @Nullable Input<List<String>> destIpRanges,
        @Nullable Input<List<FirewallPolicyRuleMatcherLayer4ConfigArgs>> layer4Configs,
        @Nullable Input<List<String>> srcIpRanges) {
        this.destIpRanges = destIpRanges;
        this.layer4Configs = layer4Configs;
        this.srcIpRanges = srcIpRanges;
    }

    private FirewallPolicyRuleMatcherArgs() {
        this.destIpRanges = Input.empty();
        this.layer4Configs = Input.empty();
        this.srcIpRanges = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> destIpRanges;
        private @Nullable Input<List<FirewallPolicyRuleMatcherLayer4ConfigArgs>> layer4Configs;
        private @Nullable Input<List<String>> srcIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleMatcherArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIpRanges = defaults.destIpRanges;
    	      this.layer4Configs = defaults.layer4Configs;
    	      this.srcIpRanges = defaults.srcIpRanges;
        }

        public Builder setDestIpRanges(@Nullable Input<List<String>> destIpRanges) {
            this.destIpRanges = destIpRanges;
            return this;
        }

        public Builder setDestIpRanges(@Nullable List<String> destIpRanges) {
            this.destIpRanges = Input.ofNullable(destIpRanges);
            return this;
        }

        public Builder setLayer4Configs(@Nullable Input<List<FirewallPolicyRuleMatcherLayer4ConfigArgs>> layer4Configs) {
            this.layer4Configs = layer4Configs;
            return this;
        }

        public Builder setLayer4Configs(@Nullable List<FirewallPolicyRuleMatcherLayer4ConfigArgs> layer4Configs) {
            this.layer4Configs = Input.ofNullable(layer4Configs);
            return this;
        }

        public Builder setSrcIpRanges(@Nullable Input<List<String>> srcIpRanges) {
            this.srcIpRanges = srcIpRanges;
            return this;
        }

        public Builder setSrcIpRanges(@Nullable List<String> srcIpRanges) {
            this.srcIpRanges = Input.ofNullable(srcIpRanges);
            return this;
        }
        public FirewallPolicyRuleMatcherArgs build() {
            return new FirewallPolicyRuleMatcherArgs(destIpRanges, layer4Configs, srcIpRanges);
        }
    }
}
