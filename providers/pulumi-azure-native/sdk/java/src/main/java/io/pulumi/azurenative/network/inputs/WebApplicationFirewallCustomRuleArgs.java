// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.WebApplicationFirewallAction;
import io.pulumi.azurenative.network.enums.WebApplicationFirewallRuleType;
import io.pulumi.azurenative.network.inputs.MatchConditionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines contents of a web application rule.
 * 
 */
public final class WebApplicationFirewallCustomRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebApplicationFirewallCustomRuleArgs Empty = new WebApplicationFirewallCustomRuleArgs();

    /**
     * Type of Actions.
     * 
     */
    @InputImport(name="action", required=true)
    private final Input<Either<String,WebApplicationFirewallAction>> action;

    public Input<Either<String,WebApplicationFirewallAction>> getAction() {
        return this.action;
    }

    /**
     * List of match conditions.
     * 
     */
    @InputImport(name="matchConditions", required=true)
    private final Input<List<MatchConditionArgs>> matchConditions;

    public Input<List<MatchConditionArgs>> getMatchConditions() {
        return this.matchConditions;
    }

    /**
     * The name of the resource that is unique within a policy. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Priority of the rule. Rules with a lower value will be evaluated before rules with a higher value.
     * 
     */
    @InputImport(name="priority", required=true)
    private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    /**
     * The rule type.
     * 
     */
    @InputImport(name="ruleType", required=true)
    private final Input<Either<String,WebApplicationFirewallRuleType>> ruleType;

    public Input<Either<String,WebApplicationFirewallRuleType>> getRuleType() {
        return this.ruleType;
    }

    public WebApplicationFirewallCustomRuleArgs(
        Input<Either<String,WebApplicationFirewallAction>> action,
        Input<List<MatchConditionArgs>> matchConditions,
        @Nullable Input<String> name,
        Input<Integer> priority,
        Input<Either<String,WebApplicationFirewallRuleType>> ruleType) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.matchConditions = Objects.requireNonNull(matchConditions, "expected parameter 'matchConditions' to be non-null");
        this.name = name;
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.ruleType = Objects.requireNonNull(ruleType, "expected parameter 'ruleType' to be non-null");
    }

    private WebApplicationFirewallCustomRuleArgs() {
        this.action = Input.empty();
        this.matchConditions = Input.empty();
        this.name = Input.empty();
        this.priority = Input.empty();
        this.ruleType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebApplicationFirewallCustomRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,WebApplicationFirewallAction>> action;
        private Input<List<MatchConditionArgs>> matchConditions;
        private @Nullable Input<String> name;
        private Input<Integer> priority;
        private Input<Either<String,WebApplicationFirewallRuleType>> ruleType;

        public Builder() {
    	      // Empty
        }

        public Builder(WebApplicationFirewallCustomRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.matchConditions = defaults.matchConditions;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleType = defaults.ruleType;
        }

        public Builder setAction(Input<Either<String,WebApplicationFirewallAction>> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(Either<String,WebApplicationFirewallAction> action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder setMatchConditions(Input<List<MatchConditionArgs>> matchConditions) {
            this.matchConditions = Objects.requireNonNull(matchConditions);
            return this;
        }

        public Builder setMatchConditions(List<MatchConditionArgs> matchConditions) {
            this.matchConditions = Input.of(Objects.requireNonNull(matchConditions));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPriority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder setRuleType(Input<Either<String,WebApplicationFirewallRuleType>> ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }

        public Builder setRuleType(Either<String,WebApplicationFirewallRuleType> ruleType) {
            this.ruleType = Input.of(Objects.requireNonNull(ruleType));
            return this;
        }

        public WebApplicationFirewallCustomRuleArgs build() {
            return new WebApplicationFirewallCustomRuleArgs(action, matchConditions, name, priority, ruleType);
        }
    }
}
