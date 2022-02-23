// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.NetworkInsightsAnalysisPortRange;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInsightsAnalysisAnalysisAclRule extends io.pulumi.resources.InvokeArgs {

    public static final NetworkInsightsAnalysisAnalysisAclRule Empty = new NetworkInsightsAnalysisAnalysisAclRule();

    @InputImport(name="cidr")
        private final @Nullable String cidr;

    public Optional<String> getCidr() {
        return this.cidr == null ? Optional.empty() : Optional.ofNullable(this.cidr);
    }

    @InputImport(name="egress")
        private final @Nullable Boolean egress;

    public Optional<Boolean> getEgress() {
        return this.egress == null ? Optional.empty() : Optional.ofNullable(this.egress);
    }

    @InputImport(name="portRange")
        private final @Nullable NetworkInsightsAnalysisPortRange portRange;

    public Optional<NetworkInsightsAnalysisPortRange> getPortRange() {
        return this.portRange == null ? Optional.empty() : Optional.ofNullable(this.portRange);
    }

    @InputImport(name="protocol")
        private final @Nullable String protocol;

    public Optional<String> getProtocol() {
        return this.protocol == null ? Optional.empty() : Optional.ofNullable(this.protocol);
    }

    @InputImport(name="ruleAction")
        private final @Nullable String ruleAction;

    public Optional<String> getRuleAction() {
        return this.ruleAction == null ? Optional.empty() : Optional.ofNullable(this.ruleAction);
    }

    @InputImport(name="ruleNumber")
        private final @Nullable Integer ruleNumber;

    public Optional<Integer> getRuleNumber() {
        return this.ruleNumber == null ? Optional.empty() : Optional.ofNullable(this.ruleNumber);
    }

    public NetworkInsightsAnalysisAnalysisAclRule(
        @Nullable String cidr,
        @Nullable Boolean egress,
        @Nullable NetworkInsightsAnalysisPortRange portRange,
        @Nullable String protocol,
        @Nullable String ruleAction,
        @Nullable Integer ruleNumber) {
        this.cidr = cidr;
        this.egress = egress;
        this.portRange = portRange;
        this.protocol = protocol;
        this.ruleAction = ruleAction;
        this.ruleNumber = ruleNumber;
    }

    private NetworkInsightsAnalysisAnalysisAclRule() {
        this.cidr = null;
        this.egress = null;
        this.portRange = null;
        this.protocol = null;
        this.ruleAction = null;
        this.ruleNumber = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisAnalysisAclRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cidr;
        private @Nullable Boolean egress;
        private @Nullable NetworkInsightsAnalysisPortRange portRange;
        private @Nullable String protocol;
        private @Nullable String ruleAction;
        private @Nullable Integer ruleNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAnalysisAnalysisAclRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.egress = defaults.egress;
    	      this.portRange = defaults.portRange;
    	      this.protocol = defaults.protocol;
    	      this.ruleAction = defaults.ruleAction;
    	      this.ruleNumber = defaults.ruleNumber;
        }

        public Builder setCidr(@Nullable String cidr) {
            this.cidr = cidr;
            return this;
        }

        public Builder setEgress(@Nullable Boolean egress) {
            this.egress = egress;
            return this;
        }

        public Builder setPortRange(@Nullable NetworkInsightsAnalysisPortRange portRange) {
            this.portRange = portRange;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setRuleAction(@Nullable String ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }

        public Builder setRuleNumber(@Nullable Integer ruleNumber) {
            this.ruleNumber = ruleNumber;
            return this;
        }
        public NetworkInsightsAnalysisAnalysisAclRule build() {
            return new NetworkInsightsAnalysisAnalysisAclRule(cidr, egress, portRange, protocol, ruleAction, ruleNumber);
        }
    }
}
