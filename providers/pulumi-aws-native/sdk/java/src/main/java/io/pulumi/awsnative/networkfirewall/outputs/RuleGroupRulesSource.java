// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.awsnative.networkfirewall.outputs.RuleGroupRulesSourceList;
import io.pulumi.awsnative.networkfirewall.outputs.RuleGroupStatefulRule;
import io.pulumi.awsnative.networkfirewall.outputs.RuleGroupStatelessRulesAndCustomActions;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupRulesSource {
    private final @Nullable RuleGroupRulesSourceList rulesSourceList;
    private final @Nullable String rulesString;
    private final @Nullable List<RuleGroupStatefulRule> statefulRules;
    private final @Nullable RuleGroupStatelessRulesAndCustomActions statelessRulesAndCustomActions;

    @OutputCustomType.Constructor
    private RuleGroupRulesSource(
        @OutputCustomType.Parameter("rulesSourceList") @Nullable RuleGroupRulesSourceList rulesSourceList,
        @OutputCustomType.Parameter("rulesString") @Nullable String rulesString,
        @OutputCustomType.Parameter("statefulRules") @Nullable List<RuleGroupStatefulRule> statefulRules,
        @OutputCustomType.Parameter("statelessRulesAndCustomActions") @Nullable RuleGroupStatelessRulesAndCustomActions statelessRulesAndCustomActions) {
        this.rulesSourceList = rulesSourceList;
        this.rulesString = rulesString;
        this.statefulRules = statefulRules;
        this.statelessRulesAndCustomActions = statelessRulesAndCustomActions;
    }

    public Optional<RuleGroupRulesSourceList> getRulesSourceList() {
        return Optional.ofNullable(this.rulesSourceList);
    }
    public Optional<String> getRulesString() {
        return Optional.ofNullable(this.rulesString);
    }
    public List<RuleGroupStatefulRule> getStatefulRules() {
        return this.statefulRules == null ? List.of() : this.statefulRules;
    }
    public Optional<RuleGroupStatelessRulesAndCustomActions> getStatelessRulesAndCustomActions() {
        return Optional.ofNullable(this.statelessRulesAndCustomActions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRulesSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRulesSourceList rulesSourceList;
        private @Nullable String rulesString;
        private @Nullable List<RuleGroupStatefulRule> statefulRules;
        private @Nullable RuleGroupStatelessRulesAndCustomActions statelessRulesAndCustomActions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRulesSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rulesSourceList = defaults.rulesSourceList;
    	      this.rulesString = defaults.rulesString;
    	      this.statefulRules = defaults.statefulRules;
    	      this.statelessRulesAndCustomActions = defaults.statelessRulesAndCustomActions;
        }

        public Builder setRulesSourceList(@Nullable RuleGroupRulesSourceList rulesSourceList) {
            this.rulesSourceList = rulesSourceList;
            return this;
        }

        public Builder setRulesString(@Nullable String rulesString) {
            this.rulesString = rulesString;
            return this;
        }

        public Builder setStatefulRules(@Nullable List<RuleGroupStatefulRule> statefulRules) {
            this.statefulRules = statefulRules;
            return this;
        }

        public Builder setStatelessRulesAndCustomActions(@Nullable RuleGroupStatelessRulesAndCustomActions statelessRulesAndCustomActions) {
            this.statelessRulesAndCustomActions = statelessRulesAndCustomActions;
            return this;
        }
        public RuleGroupRulesSource build() {
            return new RuleGroupRulesSource(rulesSourceList, rulesString, statefulRules, statelessRulesAndCustomActions);
        }
    }
}
