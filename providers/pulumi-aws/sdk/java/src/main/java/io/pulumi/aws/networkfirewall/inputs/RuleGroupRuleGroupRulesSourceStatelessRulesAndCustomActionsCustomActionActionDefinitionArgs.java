// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs Empty = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs();

    /**
     * A configuration block describing the stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the matching packet. You can pair this custom action with any of the standard stateless rule actions. See Publish Metric Action below for details.
     * 
     */
    @InputImport(name="publishMetricAction", required=true)
    private final Input<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionArgs> publishMetricAction;

    public Input<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionArgs> getPublishMetricAction() {
        return this.publishMetricAction;
    }

    public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs(Input<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionArgs> publishMetricAction) {
        this.publishMetricAction = Objects.requireNonNull(publishMetricAction, "expected parameter 'publishMetricAction' to be non-null");
    }

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs() {
        this.publishMetricAction = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionArgs> publishMetricAction;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishMetricAction = defaults.publishMetricAction;
        }

        public Builder setPublishMetricAction(Input<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionArgs> publishMetricAction) {
            this.publishMetricAction = Objects.requireNonNull(publishMetricAction);
            return this;
        }

        public Builder setPublishMetricAction(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionArgs publishMetricAction) {
            this.publishMetricAction = Input.of(Objects.requireNonNull(publishMetricAction));
            return this;
        }
        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs build() {
            return new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionArgs(publishMetricAction);
        }
    }
}
