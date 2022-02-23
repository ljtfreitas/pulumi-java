// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.FirewallPolicyRuleMatcherLayer4ConfigArgs;
import io.pulumi.googlenative.compute_alpha.inputs.FirewallPolicyRuleSecureTagArgs;
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
     * Address groups which should be matched against the traffic destination. Maximum number of destination address groups is 10.
     * 
     */
    @InputImport(name="destAddressGroups")
      private final @Nullable Input<List<String>> destAddressGroups;

    public Input<List<String>> getDestAddressGroups() {
        return this.destAddressGroups == null ? Input.empty() : this.destAddressGroups;
    }

    /**
     * Fully Qualified Domain Name (FQDN) which should be matched against traffic destination. Maximum number of destination fqdn allowed is 1000.
     * 
     */
    @InputImport(name="destFqdns")
      private final @Nullable Input<List<String>> destFqdns;

    public Input<List<String>> getDestFqdns() {
        return this.destFqdns == null ? Input.empty() : this.destFqdns;
    }

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
     * Region codes whose IP addresses will be used to match for destination of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex."US" Maximum number of dest region codes allowed is 5000.
     * 
     */
    @InputImport(name="destRegionCodes")
      private final @Nullable Input<List<String>> destRegionCodes;

    public Input<List<String>> getDestRegionCodes() {
        return this.destRegionCodes == null ? Input.empty() : this.destRegionCodes;
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
     * Address groups which should be matched against the traffic source. Maximum number of source address groups is 10.
     * 
     */
    @InputImport(name="srcAddressGroups")
      private final @Nullable Input<List<String>> srcAddressGroups;

    public Input<List<String>> getSrcAddressGroups() {
        return this.srcAddressGroups == null ? Input.empty() : this.srcAddressGroups;
    }

    /**
     * Fully Qualified Domain Name (FQDN) which should be matched against traffic source. Maximum number of source fqdn allowed is 1000.
     * 
     */
    @InputImport(name="srcFqdns")
      private final @Nullable Input<List<String>> srcFqdns;

    public Input<List<String>> getSrcFqdns() {
        return this.srcFqdns == null ? Input.empty() : this.srcFqdns;
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

    /**
     * Region codes whose IP addresses will be used to match for source of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex."US" Maximum number of source region codes allowed is 5000.
     * 
     */
    @InputImport(name="srcRegionCodes")
      private final @Nullable Input<List<String>> srcRegionCodes;

    public Input<List<String>> getSrcRegionCodes() {
        return this.srcRegionCodes == null ? Input.empty() : this.srcRegionCodes;
    }

    /**
     * List of secure tag values, which should be matched at the source of the traffic. For INGRESS rule, if all the srcSecureTag are INEFFECTIVE, and there is no srcIpRange, this rule will be ignored. Maximum number of source tag values allowed is 256.
     * 
     */
    @InputImport(name="srcSecureTags")
      private final @Nullable Input<List<FirewallPolicyRuleSecureTagArgs>> srcSecureTags;

    public Input<List<FirewallPolicyRuleSecureTagArgs>> getSrcSecureTags() {
        return this.srcSecureTags == null ? Input.empty() : this.srcSecureTags;
    }

    public FirewallPolicyRuleMatcherArgs(
        @Nullable Input<List<String>> destAddressGroups,
        @Nullable Input<List<String>> destFqdns,
        @Nullable Input<List<String>> destIpRanges,
        @Nullable Input<List<String>> destRegionCodes,
        @Nullable Input<List<FirewallPolicyRuleMatcherLayer4ConfigArgs>> layer4Configs,
        @Nullable Input<List<String>> srcAddressGroups,
        @Nullable Input<List<String>> srcFqdns,
        @Nullable Input<List<String>> srcIpRanges,
        @Nullable Input<List<String>> srcRegionCodes,
        @Nullable Input<List<FirewallPolicyRuleSecureTagArgs>> srcSecureTags) {
        this.destAddressGroups = destAddressGroups;
        this.destFqdns = destFqdns;
        this.destIpRanges = destIpRanges;
        this.destRegionCodes = destRegionCodes;
        this.layer4Configs = layer4Configs;
        this.srcAddressGroups = srcAddressGroups;
        this.srcFqdns = srcFqdns;
        this.srcIpRanges = srcIpRanges;
        this.srcRegionCodes = srcRegionCodes;
        this.srcSecureTags = srcSecureTags;
    }

    private FirewallPolicyRuleMatcherArgs() {
        this.destAddressGroups = Input.empty();
        this.destFqdns = Input.empty();
        this.destIpRanges = Input.empty();
        this.destRegionCodes = Input.empty();
        this.layer4Configs = Input.empty();
        this.srcAddressGroups = Input.empty();
        this.srcFqdns = Input.empty();
        this.srcIpRanges = Input.empty();
        this.srcRegionCodes = Input.empty();
        this.srcSecureTags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> destAddressGroups;
        private @Nullable Input<List<String>> destFqdns;
        private @Nullable Input<List<String>> destIpRanges;
        private @Nullable Input<List<String>> destRegionCodes;
        private @Nullable Input<List<FirewallPolicyRuleMatcherLayer4ConfigArgs>> layer4Configs;
        private @Nullable Input<List<String>> srcAddressGroups;
        private @Nullable Input<List<String>> srcFqdns;
        private @Nullable Input<List<String>> srcIpRanges;
        private @Nullable Input<List<String>> srcRegionCodes;
        private @Nullable Input<List<FirewallPolicyRuleSecureTagArgs>> srcSecureTags;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleMatcherArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destAddressGroups = defaults.destAddressGroups;
    	      this.destFqdns = defaults.destFqdns;
    	      this.destIpRanges = defaults.destIpRanges;
    	      this.destRegionCodes = defaults.destRegionCodes;
    	      this.layer4Configs = defaults.layer4Configs;
    	      this.srcAddressGroups = defaults.srcAddressGroups;
    	      this.srcFqdns = defaults.srcFqdns;
    	      this.srcIpRanges = defaults.srcIpRanges;
    	      this.srcRegionCodes = defaults.srcRegionCodes;
    	      this.srcSecureTags = defaults.srcSecureTags;
        }

        public Builder setDestAddressGroups(@Nullable Input<List<String>> destAddressGroups) {
            this.destAddressGroups = destAddressGroups;
            return this;
        }

        public Builder setDestAddressGroups(@Nullable List<String> destAddressGroups) {
            this.destAddressGroups = Input.ofNullable(destAddressGroups);
            return this;
        }

        public Builder setDestFqdns(@Nullable Input<List<String>> destFqdns) {
            this.destFqdns = destFqdns;
            return this;
        }

        public Builder setDestFqdns(@Nullable List<String> destFqdns) {
            this.destFqdns = Input.ofNullable(destFqdns);
            return this;
        }

        public Builder setDestIpRanges(@Nullable Input<List<String>> destIpRanges) {
            this.destIpRanges = destIpRanges;
            return this;
        }

        public Builder setDestIpRanges(@Nullable List<String> destIpRanges) {
            this.destIpRanges = Input.ofNullable(destIpRanges);
            return this;
        }

        public Builder setDestRegionCodes(@Nullable Input<List<String>> destRegionCodes) {
            this.destRegionCodes = destRegionCodes;
            return this;
        }

        public Builder setDestRegionCodes(@Nullable List<String> destRegionCodes) {
            this.destRegionCodes = Input.ofNullable(destRegionCodes);
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

        public Builder setSrcAddressGroups(@Nullable Input<List<String>> srcAddressGroups) {
            this.srcAddressGroups = srcAddressGroups;
            return this;
        }

        public Builder setSrcAddressGroups(@Nullable List<String> srcAddressGroups) {
            this.srcAddressGroups = Input.ofNullable(srcAddressGroups);
            return this;
        }

        public Builder setSrcFqdns(@Nullable Input<List<String>> srcFqdns) {
            this.srcFqdns = srcFqdns;
            return this;
        }

        public Builder setSrcFqdns(@Nullable List<String> srcFqdns) {
            this.srcFqdns = Input.ofNullable(srcFqdns);
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

        public Builder setSrcRegionCodes(@Nullable Input<List<String>> srcRegionCodes) {
            this.srcRegionCodes = srcRegionCodes;
            return this;
        }

        public Builder setSrcRegionCodes(@Nullable List<String> srcRegionCodes) {
            this.srcRegionCodes = Input.ofNullable(srcRegionCodes);
            return this;
        }

        public Builder setSrcSecureTags(@Nullable Input<List<FirewallPolicyRuleSecureTagArgs>> srcSecureTags) {
            this.srcSecureTags = srcSecureTags;
            return this;
        }

        public Builder setSrcSecureTags(@Nullable List<FirewallPolicyRuleSecureTagArgs> srcSecureTags) {
            this.srcSecureTags = Input.ofNullable(srcSecureTags);
            return this;
        }
        public FirewallPolicyRuleMatcherArgs build() {
            return new FirewallPolicyRuleMatcherArgs(destAddressGroups, destFqdns, destIpRanges, destRegionCodes, layer4Configs, srcAddressGroups, srcFqdns, srcIpRanges, srcRegionCodes, srcSecureTags);
        }
    }
}
