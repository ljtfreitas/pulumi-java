// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupCaptchaConfig;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupLabel;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupRuleAction;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupStatement;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupVisibilityConfig;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Rule of RuleGroup that contains condition and action.
 * 
 */
public final class RuleGroupRule extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupRule Empty = new RuleGroupRule();

    @InputImport(name="action")
        private final @Nullable RuleGroupRuleAction action;

    public Optional<RuleGroupRuleAction> getAction() {
        return this.action == null ? Optional.empty() : Optional.ofNullable(this.action);
    }

    @InputImport(name="captchaConfig")
        private final @Nullable RuleGroupCaptchaConfig captchaConfig;

    public Optional<RuleGroupCaptchaConfig> getCaptchaConfig() {
        return this.captchaConfig == null ? Optional.empty() : Optional.ofNullable(this.captchaConfig);
    }

    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="priority", required=true)
        private final Integer priority;

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Collection of Rule Labels.
     * 
     */
    @InputImport(name="ruleLabels")
        private final @Nullable List<RuleGroupLabel> ruleLabels;

    public List<RuleGroupLabel> getRuleLabels() {
        return this.ruleLabels == null ? List.of() : this.ruleLabels;
    }

    @InputImport(name="statement", required=true)
        private final RuleGroupStatement statement;

    public RuleGroupStatement getStatement() {
        return this.statement;
    }

    @InputImport(name="visibilityConfig", required=true)
        private final RuleGroupVisibilityConfig visibilityConfig;

    public RuleGroupVisibilityConfig getVisibilityConfig() {
        return this.visibilityConfig;
    }

    public RuleGroupRule(
        @Nullable RuleGroupRuleAction action,
        @Nullable RuleGroupCaptchaConfig captchaConfig,
        String name,
        Integer priority,
        @Nullable List<RuleGroupLabel> ruleLabels,
        RuleGroupStatement statement,
        RuleGroupVisibilityConfig visibilityConfig) {
        this.action = action;
        this.captchaConfig = captchaConfig;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.ruleLabels = ruleLabels;
        this.statement = Objects.requireNonNull(statement, "expected parameter 'statement' to be non-null");
        this.visibilityConfig = Objects.requireNonNull(visibilityConfig, "expected parameter 'visibilityConfig' to be non-null");
    }

    private RuleGroupRule() {
        this.action = null;
        this.captchaConfig = null;
        this.name = null;
        this.priority = null;
        this.ruleLabels = List.of();
        this.statement = null;
        this.visibilityConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleAction action;
        private @Nullable RuleGroupCaptchaConfig captchaConfig;
        private String name;
        private Integer priority;
        private @Nullable List<RuleGroupLabel> ruleLabels;
        private RuleGroupStatement statement;
        private RuleGroupVisibilityConfig visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.captchaConfig = defaults.captchaConfig;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleLabels = defaults.ruleLabels;
    	      this.statement = defaults.statement;
    	      this.visibilityConfig = defaults.visibilityConfig;
        }

        public Builder setAction(@Nullable RuleGroupRuleAction action) {
            this.action = action;
            return this;
        }

        public Builder setCaptchaConfig(@Nullable RuleGroupCaptchaConfig captchaConfig) {
            this.captchaConfig = captchaConfig;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRuleLabels(@Nullable List<RuleGroupLabel> ruleLabels) {
            this.ruleLabels = ruleLabels;
            return this;
        }

        public Builder setStatement(RuleGroupStatement statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }

        public Builder setVisibilityConfig(RuleGroupVisibilityConfig visibilityConfig) {
            this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
            return this;
        }
        public RuleGroupRule build() {
            return new RuleGroupRule(action, captchaConfig, name, priority, ruleLabels, statement, visibilityConfig);
        }
    }
}
