// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceArgs Empty = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceArgs();

    /**
     * An IP address or a block of IP addresses in CIDR notation. AWS Network Firewall supports all address ranges for IPv4.
     * 
     */
    @InputImport(name="addressDefinition", required=true)
    private final Input<String> addressDefinition;

    public Input<String> getAddressDefinition() {
        return this.addressDefinition;
    }

    public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceArgs(Input<String> addressDefinition) {
        this.addressDefinition = Objects.requireNonNull(addressDefinition, "expected parameter 'addressDefinition' to be non-null");
    }

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceArgs() {
        this.addressDefinition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> addressDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressDefinition = defaults.addressDefinition;
        }

        public Builder setAddressDefinition(Input<String> addressDefinition) {
            this.addressDefinition = Objects.requireNonNull(addressDefinition);
            return this;
        }

        public Builder setAddressDefinition(String addressDefinition) {
            this.addressDefinition = Input.of(Objects.requireNonNull(addressDefinition));
            return this;
        }
        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceArgs build() {
            return new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceArgs(addressDefinition);
        }
    }
}
