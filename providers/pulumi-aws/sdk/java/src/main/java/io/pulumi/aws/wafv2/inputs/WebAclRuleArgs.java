// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleActionArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleOverrideActionArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleRuleLabelArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleVisibilityConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleArgs Empty = new WebAclRuleArgs();

    /**
     * The action that AWS WAF should take on a web request when it matches the rule's statement. This is used only for rules whose **statements do not reference a rule group**. See Action below for details.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<WebAclRuleActionArgs> action;

    public Output<WebAclRuleActionArgs> getAction() {
        return this.action == null ? Output.empty() : this.action;
    }

    /**
     * A friendly name of the rule.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The override action to apply to the rules in a rule group. Used only for rule **statements that reference a rule group**, like `rule_group_reference_statement` and `managed_rule_group_statement`. See Override Action below for details.
     * 
     */
    @Import(name="overrideAction")
      private final @Nullable Output<WebAclRuleOverrideActionArgs> overrideAction;

    public Output<WebAclRuleOverrideActionArgs> getOverrideAction() {
        return this.overrideAction == null ? Output.empty() : this.overrideAction;
    }

    /**
     * If you define more than one Rule in a WebACL, AWS WAF evaluates each request against the `rules` in order based on the value of `priority`. AWS WAF processes rules with lower priority first.
     * 
     */
    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority;
    }

    /**
     * Labels to apply to web requests that match the rule match statement. See Rule Label below for details.
     * 
     */
    @Import(name="ruleLabels")
      private final @Nullable Output<List<WebAclRuleRuleLabelArgs>> ruleLabels;

    public Output<List<WebAclRuleRuleLabelArgs>> getRuleLabels() {
        return this.ruleLabels == null ? Output.empty() : this.ruleLabels;
    }

    /**
     * The AWS WAF processing statement for the rule, for example `byte_match_statement` or `geo_match_statement`. See Statement below for details.
     * 
     */
    @Import(name="statement", required=true)
      private final Output<WebAclRuleStatementArgs> statement;

    public Output<WebAclRuleStatementArgs> getStatement() {
        return this.statement;
    }

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    @Import(name="visibilityConfig", required=true)
      private final Output<WebAclRuleVisibilityConfigArgs> visibilityConfig;

    public Output<WebAclRuleVisibilityConfigArgs> getVisibilityConfig() {
        return this.visibilityConfig;
    }

    public WebAclRuleArgs(
        @Nullable Output<WebAclRuleActionArgs> action,
        Output<String> name,
        @Nullable Output<WebAclRuleOverrideActionArgs> overrideAction,
        Output<Integer> priority,
        @Nullable Output<List<WebAclRuleRuleLabelArgs>> ruleLabels,
        Output<WebAclRuleStatementArgs> statement,
        Output<WebAclRuleVisibilityConfigArgs> visibilityConfig) {
        this.action = action;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.overrideAction = overrideAction;
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.ruleLabels = ruleLabels;
        this.statement = Objects.requireNonNull(statement, "expected parameter 'statement' to be non-null");
        this.visibilityConfig = Objects.requireNonNull(visibilityConfig, "expected parameter 'visibilityConfig' to be non-null");
    }

    private WebAclRuleArgs() {
        this.action = Output.empty();
        this.name = Output.empty();
        this.overrideAction = Output.empty();
        this.priority = Output.empty();
        this.ruleLabels = Output.empty();
        this.statement = Output.empty();
        this.visibilityConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleActionArgs> action;
        private Output<String> name;
        private @Nullable Output<WebAclRuleOverrideActionArgs> overrideAction;
        private Output<Integer> priority;
        private @Nullable Output<List<WebAclRuleRuleLabelArgs>> ruleLabels;
        private Output<WebAclRuleStatementArgs> statement;
        private Output<WebAclRuleVisibilityConfigArgs> visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.overrideAction = defaults.overrideAction;
    	      this.priority = defaults.priority;
    	      this.ruleLabels = defaults.ruleLabels;
    	      this.statement = defaults.statement;
    	      this.visibilityConfig = defaults.visibilityConfig;
        }

        public Builder action(@Nullable Output<WebAclRuleActionArgs> action) {
            this.action = action;
            return this;
        }

        public Builder action(@Nullable WebAclRuleActionArgs action) {
            this.action = Output.ofNullable(action);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder overrideAction(@Nullable Output<WebAclRuleOverrideActionArgs> overrideAction) {
            this.overrideAction = overrideAction;
            return this;
        }

        public Builder overrideAction(@Nullable WebAclRuleOverrideActionArgs overrideAction) {
            this.overrideAction = Output.ofNullable(overrideAction);
            return this;
        }

        public Builder priority(Output<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder priority(Integer priority) {
            this.priority = Output.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder ruleLabels(@Nullable Output<List<WebAclRuleRuleLabelArgs>> ruleLabels) {
            this.ruleLabels = ruleLabels;
            return this;
        }

        public Builder ruleLabels(@Nullable List<WebAclRuleRuleLabelArgs> ruleLabels) {
            this.ruleLabels = Output.ofNullable(ruleLabels);
            return this;
        }

        public Builder statement(Output<WebAclRuleStatementArgs> statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }

        public Builder statement(WebAclRuleStatementArgs statement) {
            this.statement = Output.of(Objects.requireNonNull(statement));
            return this;
        }

        public Builder visibilityConfig(Output<WebAclRuleVisibilityConfigArgs> visibilityConfig) {
            this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
            return this;
        }

        public Builder visibilityConfig(WebAclRuleVisibilityConfigArgs visibilityConfig) {
            this.visibilityConfig = Output.of(Objects.requireNonNull(visibilityConfig));
            return this;
        }
        public WebAclRuleArgs build() {
            return new WebAclRuleArgs(action, name, overrideAction, priority, ruleLabels, statement, visibilityConfig);
        }
    }
}
