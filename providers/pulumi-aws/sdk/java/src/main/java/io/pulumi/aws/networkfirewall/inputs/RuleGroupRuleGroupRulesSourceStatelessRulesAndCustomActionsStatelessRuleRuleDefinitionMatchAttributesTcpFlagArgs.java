// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs Empty = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs();

    /**
     * Set of flags to look for in a packet. This setting can only specify values that are also specified in `masks`.
     * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
     * 
     */
    @Import(name="flags", required=true)
      private final Output<List<String>> flags;

    public Output<List<String>> getFlags() {
        return this.flags;
    }

    /**
     * Set of flags to consider in the inspection. To inspect all flags, leave this empty.
     * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
     * 
     */
    @Import(name="masks")
      private final @Nullable Output<List<String>> masks;

    public Output<List<String>> getMasks() {
        return this.masks == null ? Output.empty() : this.masks;
    }

    public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs(
        Output<List<String>> flags,
        @Nullable Output<List<String>> masks) {
        this.flags = Objects.requireNonNull(flags, "expected parameter 'flags' to be non-null");
        this.masks = masks;
    }

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs() {
        this.flags = Output.empty();
        this.masks = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> flags;
        private @Nullable Output<List<String>> masks;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flags = defaults.flags;
    	      this.masks = defaults.masks;
        }

        public Builder flags(Output<List<String>> flags) {
            this.flags = Objects.requireNonNull(flags);
            return this;
        }

        public Builder flags(List<String> flags) {
            this.flags = Output.of(Objects.requireNonNull(flags));
            return this;
        }

        public Builder masks(@Nullable Output<List<String>> masks) {
            this.masks = masks;
            return this;
        }

        public Builder masks(@Nullable List<String> masks) {
            this.masks = Output.ofNullable(masks);
            return this;
        }
        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs build() {
            return new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs(flags, masks);
        }
    }
}
