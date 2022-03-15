// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.awsnative.networkfirewall.enums.RuleGroupStatefulRuleAction;
import io.pulumi.awsnative.networkfirewall.outputs.RuleGroupHeader;
import io.pulumi.awsnative.networkfirewall.outputs.RuleGroupRuleOption;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RuleGroupStatefulRule {
    private final RuleGroupStatefulRuleAction action;
    private final RuleGroupHeader header;
    private final List<RuleGroupRuleOption> ruleOptions;

    @CustomType.Constructor
    private RuleGroupStatefulRule(
        @CustomType.Parameter("action") RuleGroupStatefulRuleAction action,
        @CustomType.Parameter("header") RuleGroupHeader header,
        @CustomType.Parameter("ruleOptions") List<RuleGroupRuleOption> ruleOptions) {
        this.action = action;
        this.header = header;
        this.ruleOptions = ruleOptions;
    }

    public RuleGroupStatefulRuleAction getAction() {
        return this.action;
    }
    public RuleGroupHeader getHeader() {
        return this.header;
    }
    public List<RuleGroupRuleOption> getRuleOptions() {
        return this.ruleOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupStatefulRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupStatefulRuleAction action;
        private RuleGroupHeader header;
        private List<RuleGroupRuleOption> ruleOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupStatefulRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.header = defaults.header;
    	      this.ruleOptions = defaults.ruleOptions;
        }

        public Builder action(RuleGroupStatefulRuleAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder header(RuleGroupHeader header) {
            this.header = Objects.requireNonNull(header);
            return this;
        }

        public Builder ruleOptions(List<RuleGroupRuleOption> ruleOptions) {
            this.ruleOptions = Objects.requireNonNull(ruleOptions);
            return this;
        }
        public RuleGroupStatefulRule build() {
            return new RuleGroupStatefulRule(action, header, ruleOptions);
        }
    }
}
