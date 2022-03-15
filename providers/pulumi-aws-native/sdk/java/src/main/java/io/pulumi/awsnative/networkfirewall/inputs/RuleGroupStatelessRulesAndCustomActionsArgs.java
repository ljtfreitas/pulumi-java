// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupCustomActionArgs;
import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupStatelessRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupStatelessRulesAndCustomActionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupStatelessRulesAndCustomActionsArgs Empty = new RuleGroupStatelessRulesAndCustomActionsArgs();

    @Import(name="customActions")
      private final @Nullable Output<List<RuleGroupCustomActionArgs>> customActions;

    public Output<List<RuleGroupCustomActionArgs>> getCustomActions() {
        return this.customActions == null ? Output.empty() : this.customActions;
    }

    @Import(name="statelessRules", required=true)
      private final Output<List<RuleGroupStatelessRuleArgs>> statelessRules;

    public Output<List<RuleGroupStatelessRuleArgs>> getStatelessRules() {
        return this.statelessRules;
    }

    public RuleGroupStatelessRulesAndCustomActionsArgs(
        @Nullable Output<List<RuleGroupCustomActionArgs>> customActions,
        Output<List<RuleGroupStatelessRuleArgs>> statelessRules) {
        this.customActions = customActions;
        this.statelessRules = Objects.requireNonNull(statelessRules, "expected parameter 'statelessRules' to be non-null");
    }

    private RuleGroupStatelessRulesAndCustomActionsArgs() {
        this.customActions = Output.empty();
        this.statelessRules = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupStatelessRulesAndCustomActionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<RuleGroupCustomActionArgs>> customActions;
        private Output<List<RuleGroupStatelessRuleArgs>> statelessRules;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupStatelessRulesAndCustomActionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customActions = defaults.customActions;
    	      this.statelessRules = defaults.statelessRules;
        }

        public Builder customActions(@Nullable Output<List<RuleGroupCustomActionArgs>> customActions) {
            this.customActions = customActions;
            return this;
        }

        public Builder customActions(@Nullable List<RuleGroupCustomActionArgs> customActions) {
            this.customActions = Output.ofNullable(customActions);
            return this;
        }

        public Builder statelessRules(Output<List<RuleGroupStatelessRuleArgs>> statelessRules) {
            this.statelessRules = Objects.requireNonNull(statelessRules);
            return this;
        }

        public Builder statelessRules(List<RuleGroupStatelessRuleArgs> statelessRules) {
            this.statelessRules = Output.of(Objects.requireNonNull(statelessRules));
            return this;
        }
        public RuleGroupStatelessRulesAndCustomActionsArgs build() {
            return new RuleGroupStatelessRulesAndCustomActionsArgs(customActions, statelessRules);
        }
    }
}
