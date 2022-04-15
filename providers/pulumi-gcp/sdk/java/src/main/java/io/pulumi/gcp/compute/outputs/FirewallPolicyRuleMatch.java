// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.compute.outputs.FirewallPolicyRuleMatchLayer4Config;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FirewallPolicyRuleMatch {
    /**
     * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 256.
     * 
     */
    private final @Nullable List<String> destIpRanges;
    /**
     * Pairs of IP protocols and ports that the rule should match. Structure is documented below.
     * 
     */
    private final List<FirewallPolicyRuleMatchLayer4Config> layer4Configs;
    /**
     * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 256.
     * 
     */
    private final @Nullable List<String> srcIpRanges;

    @CustomType.Constructor
    private FirewallPolicyRuleMatch(
        @CustomType.Parameter("destIpRanges") @Nullable List<String> destIpRanges,
        @CustomType.Parameter("layer4Configs") List<FirewallPolicyRuleMatchLayer4Config> layer4Configs,
        @CustomType.Parameter("srcIpRanges") @Nullable List<String> srcIpRanges) {
        this.destIpRanges = destIpRanges;
        this.layer4Configs = layer4Configs;
        this.srcIpRanges = srcIpRanges;
    }

    /**
     * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 256.
     * 
    */
    public List<String> destIpRanges() {
        return this.destIpRanges == null ? List.of() : this.destIpRanges;
    }
    /**
     * Pairs of IP protocols and ports that the rule should match. Structure is documented below.
     * 
    */
    public List<FirewallPolicyRuleMatchLayer4Config> layer4Configs() {
        return this.layer4Configs;
    }
    /**
     * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 256.
     * 
    */
    public List<String> srcIpRanges() {
        return this.srcIpRanges == null ? List.of() : this.srcIpRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> destIpRanges;
        private List<FirewallPolicyRuleMatchLayer4Config> layer4Configs;
        private @Nullable List<String> srcIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIpRanges = defaults.destIpRanges;
    	      this.layer4Configs = defaults.layer4Configs;
    	      this.srcIpRanges = defaults.srcIpRanges;
        }

        public Builder destIpRanges(@Nullable List<String> destIpRanges) {
            this.destIpRanges = destIpRanges;
            return this;
        }
        public Builder destIpRanges(String... destIpRanges) {
            return destIpRanges(List.of(destIpRanges));
        }
        public Builder layer4Configs(List<FirewallPolicyRuleMatchLayer4Config> layer4Configs) {
            this.layer4Configs = Objects.requireNonNull(layer4Configs);
            return this;
        }
        public Builder layer4Configs(FirewallPolicyRuleMatchLayer4Config... layer4Configs) {
            return layer4Configs(List.of(layer4Configs));
        }
        public Builder srcIpRanges(@Nullable List<String> srcIpRanges) {
            this.srcIpRanges = srcIpRanges;
            return this;
        }
        public Builder srcIpRanges(String... srcIpRanges) {
            return srcIpRanges(List.of(srcIpRanges));
        }        public FirewallPolicyRuleMatch build() {
            return new FirewallPolicyRuleMatch(destIpRanges, layer4Configs, srcIpRanges);
        }
    }
}
