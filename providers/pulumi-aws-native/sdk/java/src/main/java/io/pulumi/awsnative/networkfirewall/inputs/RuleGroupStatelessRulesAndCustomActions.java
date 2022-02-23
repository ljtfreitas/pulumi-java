// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupCustomAction;
import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupStatelessRule;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupStatelessRulesAndCustomActions extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupStatelessRulesAndCustomActions Empty = new RuleGroupStatelessRulesAndCustomActions();

    @InputImport(name="customActions")
        private final @Nullable List<RuleGroupCustomAction> customActions;

    public List<RuleGroupCustomAction> getCustomActions() {
        return this.customActions == null ? List.of() : this.customActions;
    }

    @InputImport(name="statelessRules", required=true)
        private final List<RuleGroupStatelessRule> statelessRules;

    public List<RuleGroupStatelessRule> getStatelessRules() {
        return this.statelessRules;
    }

    public RuleGroupStatelessRulesAndCustomActions(
        @Nullable List<RuleGroupCustomAction> customActions,
        List<RuleGroupStatelessRule> statelessRules) {
        this.customActions = customActions;
        this.statelessRules = Objects.requireNonNull(statelessRules, "expected parameter 'statelessRules' to be non-null");
    }

    private RuleGroupStatelessRulesAndCustomActions() {
        this.customActions = List.of();
        this.statelessRules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupStatelessRulesAndCustomActions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RuleGroupCustomAction> customActions;
        private List<RuleGroupStatelessRule> statelessRules;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupStatelessRulesAndCustomActions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customActions = defaults.customActions;
    	      this.statelessRules = defaults.statelessRules;
        }

        public Builder setCustomActions(@Nullable List<RuleGroupCustomAction> customActions) {
            this.customActions = customActions;
            return this;
        }

        public Builder setStatelessRules(List<RuleGroupStatelessRule> statelessRules) {
            this.statelessRules = Objects.requireNonNull(statelessRules);
            return this;
        }
        public RuleGroupStatelessRulesAndCustomActions build() {
            return new RuleGroupStatelessRulesAndCustomActions(customActions, statelessRules);
        }
    }
}
