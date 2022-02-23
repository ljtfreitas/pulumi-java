// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs Empty = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs();

    /**
     * Set of actions to take on a packet that matches one of the stateless rule definition's `match_attributes`. For every rule you must specify 1 standard action, and you can add custom actions. Standard actions include: `aws:pass`, `aws:drop`, `aws:forward_to_sfe`.
     * 
     */
    @InputImport(name="actions", required=true)
    private final Input<List<String>> actions;

    public Input<List<String>> getActions() {
        return this.actions;
    }

    /**
     * A configuration block containing criteria for AWS Network Firewall to use to inspect an individual packet in stateless rule inspection. See Match Attributes below for details.
     * 
     */
    @InputImport(name="matchAttributes", required=true)
    private final Input<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs> matchAttributes;

    public Input<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs> getMatchAttributes() {
        return this.matchAttributes;
    }

    public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs(
        Input<List<String>> actions,
        Input<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs> matchAttributes) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.matchAttributes = Objects.requireNonNull(matchAttributes, "expected parameter 'matchAttributes' to be non-null");
    }

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs() {
        this.actions = Input.empty();
        this.matchAttributes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> actions;
        private Input<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs> matchAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.matchAttributes = defaults.matchAttributes;
        }

        public Builder setActions(Input<List<String>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setActions(List<String> actions) {
            this.actions = Input.of(Objects.requireNonNull(actions));
            return this;
        }

        public Builder setMatchAttributes(Input<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs> matchAttributes) {
            this.matchAttributes = Objects.requireNonNull(matchAttributes);
            return this;
        }

        public Builder setMatchAttributes(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs matchAttributes) {
            this.matchAttributes = Input.of(Objects.requireNonNull(matchAttributes));
            return this;
        }
        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs build() {
            return new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionArgs(actions, matchAttributes);
        }
    }
}
