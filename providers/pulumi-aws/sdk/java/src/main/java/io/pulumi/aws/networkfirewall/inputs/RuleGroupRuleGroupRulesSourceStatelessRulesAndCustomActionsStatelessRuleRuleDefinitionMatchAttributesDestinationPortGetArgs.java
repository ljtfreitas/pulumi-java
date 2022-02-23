// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs Empty = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs();

    /**
     * The lower limit of the port range. This must be less than or equal to the `to_port`.
     * 
     */
    @InputImport(name="fromPort", required=true)
    private final Input<Integer> fromPort;

    public Input<Integer> getFromPort() {
        return this.fromPort;
    }

    /**
     * The upper limit of the port range. This must be greater than or equal to the `from_port`.
     * 
     */
    @InputImport(name="toPort")
    private final @Nullable Input<Integer> toPort;

    public Input<Integer> getToPort() {
        return this.toPort == null ? Input.empty() : this.toPort;
    }

    public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs(
        Input<Integer> fromPort,
        @Nullable Input<Integer> toPort) {
        this.fromPort = Objects.requireNonNull(fromPort, "expected parameter 'fromPort' to be non-null");
        this.toPort = toPort;
    }

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs() {
        this.fromPort = Input.empty();
        this.toPort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> fromPort;
        private @Nullable Input<Integer> toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.toPort = defaults.toPort;
        }

        public Builder setFromPort(Input<Integer> fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }

        public Builder setFromPort(Integer fromPort) {
            this.fromPort = Input.of(Objects.requireNonNull(fromPort));
            return this;
        }

        public Builder setToPort(@Nullable Input<Integer> toPort) {
            this.toPort = toPort;
            return this;
        }

        public Builder setToPort(@Nullable Integer toPort) {
            this.toPort = Input.ofNullable(toPort);
            return this;
        }
        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs build() {
            return new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs(fromPort, toPort);
        }
    }
}
