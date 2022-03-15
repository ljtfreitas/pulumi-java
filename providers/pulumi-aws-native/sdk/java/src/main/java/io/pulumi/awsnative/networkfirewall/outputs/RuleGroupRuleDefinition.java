// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.awsnative.networkfirewall.outputs.RuleGroupMatchAttributes;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleDefinition {
    private final List<String> actions;
    private final RuleGroupMatchAttributes matchAttributes;

    @CustomType.Constructor
    private RuleGroupRuleDefinition(
        @CustomType.Parameter("actions") List<String> actions,
        @CustomType.Parameter("matchAttributes") RuleGroupMatchAttributes matchAttributes) {
        this.actions = actions;
        this.matchAttributes = matchAttributes;
    }

    public List<String> getActions() {
        return this.actions;
    }
    public RuleGroupMatchAttributes getMatchAttributes() {
        return this.matchAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> actions;
        private RuleGroupMatchAttributes matchAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.matchAttributes = defaults.matchAttributes;
        }

        public Builder actions(List<String> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder matchAttributes(RuleGroupMatchAttributes matchAttributes) {
            this.matchAttributes = Objects.requireNonNull(matchAttributes);
            return this;
        }
        public RuleGroupRuleDefinition build() {
            return new RuleGroupRuleDefinition(actions, matchAttributes);
        }
    }
}
