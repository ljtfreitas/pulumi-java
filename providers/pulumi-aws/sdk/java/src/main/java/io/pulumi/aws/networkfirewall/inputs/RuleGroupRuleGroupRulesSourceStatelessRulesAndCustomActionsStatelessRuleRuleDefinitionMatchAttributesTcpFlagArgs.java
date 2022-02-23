// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
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
    @InputImport(name="flags", required=true)
    private final Input<List<String>> flags;

    public Input<List<String>> getFlags() {
        return this.flags;
    }

    /**
     * Set of flags to consider in the inspection. To inspect all flags, leave this empty.
     * Valid values: `FIN`, `SYN`, `RST`, `PSH`, `ACK`, `URG`, `ECE`, `CWR`.
     * 
     */
    @InputImport(name="masks")
    private final @Nullable Input<List<String>> masks;

    public Input<List<String>> getMasks() {
        return this.masks == null ? Input.empty() : this.masks;
    }

    public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs(
        Input<List<String>> flags,
        @Nullable Input<List<String>> masks) {
        this.flags = Objects.requireNonNull(flags, "expected parameter 'flags' to be non-null");
        this.masks = masks;
    }

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs() {
        this.flags = Input.empty();
        this.masks = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> flags;
        private @Nullable Input<List<String>> masks;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flags = defaults.flags;
    	      this.masks = defaults.masks;
        }

        public Builder setFlags(Input<List<String>> flags) {
            this.flags = Objects.requireNonNull(flags);
            return this;
        }

        public Builder setFlags(List<String> flags) {
            this.flags = Input.of(Objects.requireNonNull(flags));
            return this;
        }

        public Builder setMasks(@Nullable Input<List<String>> masks) {
            this.masks = masks;
            return this;
        }

        public Builder setMasks(@Nullable List<String> masks) {
            this.masks = Input.ofNullable(masks);
            return this;
        }
        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs build() {
            return new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs(flags, masks);
        }
    }
}
