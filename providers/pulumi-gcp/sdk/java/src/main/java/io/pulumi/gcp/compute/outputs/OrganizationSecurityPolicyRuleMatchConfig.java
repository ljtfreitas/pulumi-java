// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.compute.outputs.OrganizationSecurityPolicyRuleMatchConfigLayer4Config;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class OrganizationSecurityPolicyRuleMatchConfig {
    /**
     * Destination IP address range in CIDR format. Required for
     * EGRESS rules.
     * 
     */
    private final @Nullable List<String> destIpRanges;
    /**
     * Pairs of IP protocols and ports that the rule should match.
     * Structure is documented below.
     * 
     */
    private final List<OrganizationSecurityPolicyRuleMatchConfigLayer4Config> layer4Configs;
    /**
     * Source IP address range in CIDR format. Required for
     * INGRESS rules.
     * 
     */
    private final @Nullable List<String> srcIpRanges;

    @CustomType.Constructor
    private OrganizationSecurityPolicyRuleMatchConfig(
        @CustomType.Parameter("destIpRanges") @Nullable List<String> destIpRanges,
        @CustomType.Parameter("layer4Configs") List<OrganizationSecurityPolicyRuleMatchConfigLayer4Config> layer4Configs,
        @CustomType.Parameter("srcIpRanges") @Nullable List<String> srcIpRanges) {
        this.destIpRanges = destIpRanges;
        this.layer4Configs = layer4Configs;
        this.srcIpRanges = srcIpRanges;
    }

    /**
     * Destination IP address range in CIDR format. Required for
     * EGRESS rules.
     * 
    */
    public List<String> getDestIpRanges() {
        return this.destIpRanges == null ? List.of() : this.destIpRanges;
    }
    /**
     * Pairs of IP protocols and ports that the rule should match.
     * Structure is documented below.
     * 
    */
    public List<OrganizationSecurityPolicyRuleMatchConfigLayer4Config> getLayer4Configs() {
        return this.layer4Configs;
    }
    /**
     * Source IP address range in CIDR format. Required for
     * INGRESS rules.
     * 
    */
    public List<String> getSrcIpRanges() {
        return this.srcIpRanges == null ? List.of() : this.srcIpRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationSecurityPolicyRuleMatchConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> destIpRanges;
        private List<OrganizationSecurityPolicyRuleMatchConfigLayer4Config> layer4Configs;
        private @Nullable List<String> srcIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationSecurityPolicyRuleMatchConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIpRanges = defaults.destIpRanges;
    	      this.layer4Configs = defaults.layer4Configs;
    	      this.srcIpRanges = defaults.srcIpRanges;
        }

        public Builder destIpRanges(@Nullable List<String> destIpRanges) {
            this.destIpRanges = destIpRanges;
            return this;
        }

        public Builder layer4Configs(List<OrganizationSecurityPolicyRuleMatchConfigLayer4Config> layer4Configs) {
            this.layer4Configs = Objects.requireNonNull(layer4Configs);
            return this;
        }

        public Builder srcIpRanges(@Nullable List<String> srcIpRanges) {
            this.srcIpRanges = srcIpRanges;
            return this;
        }
        public OrganizationSecurityPolicyRuleMatchConfig build() {
            return new OrganizationSecurityPolicyRuleMatchConfig(destIpRanges, layer4Configs, srcIpRanges);
        }
    }
}
