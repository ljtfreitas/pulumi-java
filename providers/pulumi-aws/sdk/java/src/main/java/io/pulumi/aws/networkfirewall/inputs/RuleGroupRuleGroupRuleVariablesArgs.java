// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesIpSetArgs;
import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesPortSetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleGroupRuleVariablesArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRuleVariablesArgs Empty = new RuleGroupRuleGroupRuleVariablesArgs();

    /**
     * Set of configuration blocks that define IP address information. See IP Sets below for details.
     * 
     */
    @Import(name="ipSets")
      private final @Nullable Output<List<RuleGroupRuleGroupRuleVariablesIpSetArgs>> ipSets;

    public Output<List<RuleGroupRuleGroupRuleVariablesIpSetArgs>> getIpSets() {
        return this.ipSets == null ? Output.empty() : this.ipSets;
    }

    /**
     * Set of configuration blocks that define port range information. See Port Sets below for details.
     * 
     */
    @Import(name="portSets")
      private final @Nullable Output<List<RuleGroupRuleGroupRuleVariablesPortSetArgs>> portSets;

    public Output<List<RuleGroupRuleGroupRuleVariablesPortSetArgs>> getPortSets() {
        return this.portSets == null ? Output.empty() : this.portSets;
    }

    public RuleGroupRuleGroupRuleVariablesArgs(
        @Nullable Output<List<RuleGroupRuleGroupRuleVariablesIpSetArgs>> ipSets,
        @Nullable Output<List<RuleGroupRuleGroupRuleVariablesPortSetArgs>> portSets) {
        this.ipSets = ipSets;
        this.portSets = portSets;
    }

    private RuleGroupRuleGroupRuleVariablesArgs() {
        this.ipSets = Output.empty();
        this.portSets = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRuleVariablesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<RuleGroupRuleGroupRuleVariablesIpSetArgs>> ipSets;
        private @Nullable Output<List<RuleGroupRuleGroupRuleVariablesPortSetArgs>> portSets;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRuleVariablesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipSets = defaults.ipSets;
    	      this.portSets = defaults.portSets;
        }

        public Builder ipSets(@Nullable Output<List<RuleGroupRuleGroupRuleVariablesIpSetArgs>> ipSets) {
            this.ipSets = ipSets;
            return this;
        }

        public Builder ipSets(@Nullable List<RuleGroupRuleGroupRuleVariablesIpSetArgs> ipSets) {
            this.ipSets = Output.ofNullable(ipSets);
            return this;
        }

        public Builder portSets(@Nullable Output<List<RuleGroupRuleGroupRuleVariablesPortSetArgs>> portSets) {
            this.portSets = portSets;
            return this;
        }

        public Builder portSets(@Nullable List<RuleGroupRuleGroupRuleVariablesPortSetArgs> portSets) {
            this.portSets = Output.ofNullable(portSets);
            return this;
        }
        public RuleGroupRuleGroupRuleVariablesArgs build() {
            return new RuleGroupRuleGroupRuleVariablesArgs(ipSets, portSets);
        }
    }
}
