// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs;
import io.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceGetArgs;
import io.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessCustomActionGetArgs;
import io.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessRuleGroupReferenceGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyFirewallPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyFirewallPolicyGetArgs Empty = new FirewallPolicyFirewallPolicyGetArgs();

    /**
     * Set of actions to take on a packet if it does not match any stateful rules in the policy. This can only be specified if the policy has a `stateful_engine_options` block with a `rule_order` value of `STRICT_ORDER`. You can specify one of either or neither values of `aws:drop_strict` or `aws:drop_established`, as well as any combination of `aws:alert_strict` and `aws:alert_established`.
     * 
     */
    @InputImport(name="statefulDefaultActions")
    private final @Nullable Input<List<String>> statefulDefaultActions;

    public Input<List<String>> getStatefulDefaultActions() {
        return this.statefulDefaultActions == null ? Input.empty() : this.statefulDefaultActions;
    }

    /**
     * A configuration block that defines options on how the policy handles stateful rules. See Stateful Engine Options below for details.
     * 
     */
    @InputImport(name="statefulEngineOptions")
    private final @Nullable Input<FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs> statefulEngineOptions;

    public Input<FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs> getStatefulEngineOptions() {
        return this.statefulEngineOptions == null ? Input.empty() : this.statefulEngineOptions;
    }

    /**
     * Set of configuration blocks containing references to the stateful rule groups that are used in the policy. See Stateful Rule Group Reference below for details.
     * 
     */
    @InputImport(name="statefulRuleGroupReferences")
    private final @Nullable Input<List<FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceGetArgs>> statefulRuleGroupReferences;

    public Input<List<FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceGetArgs>> getStatefulRuleGroupReferences() {
        return this.statefulRuleGroupReferences == null ? Input.empty() : this.statefulRuleGroupReferences;
    }

    /**
     * Set of configuration blocks describing the custom action definitions that are available for use in the firewall policy's `stateless_default_actions`. See Stateless Custom Action below for details.
     * 
     */
    @InputImport(name="statelessCustomActions")
    private final @Nullable Input<List<FirewallPolicyFirewallPolicyStatelessCustomActionGetArgs>> statelessCustomActions;

    public Input<List<FirewallPolicyFirewallPolicyStatelessCustomActionGetArgs>> getStatelessCustomActions() {
        return this.statelessCustomActions == null ? Input.empty() : this.statelessCustomActions;
    }

    /**
     * Set of actions to take on a packet if it does not match any of the stateless rules in the policy. You must specify one of the standard actions including: `aws:drop`, `aws:pass`, or `aws:forward_to_sfe`.
     * In addition, you can specify custom actions that are compatible with your standard action choice. If you want non-matching packets to be forwarded for stateful inspection, specify `aws:forward_to_sfe`.
     * 
     */
    @InputImport(name="statelessDefaultActions", required=true)
    private final Input<List<String>> statelessDefaultActions;

    public Input<List<String>> getStatelessDefaultActions() {
        return this.statelessDefaultActions;
    }

    /**
     * Set of actions to take on a fragmented packet if it does not match any of the stateless rules in the policy. You must specify one of the standard actions including: `aws:drop`, `aws:pass`, or `aws:forward_to_sfe`.
     * In addition, you can specify custom actions that are compatible with your standard action choice. If you want non-matching packets to be forwarded for stateful inspection, specify `aws:forward_to_sfe`.
     * 
     */
    @InputImport(name="statelessFragmentDefaultActions", required=true)
    private final Input<List<String>> statelessFragmentDefaultActions;

    public Input<List<String>> getStatelessFragmentDefaultActions() {
        return this.statelessFragmentDefaultActions;
    }

    /**
     * Set of configuration blocks containing references to the stateless rule groups that are used in the policy. See Stateless Rule Group Reference below for details.
     * 
     */
    @InputImport(name="statelessRuleGroupReferences")
    private final @Nullable Input<List<FirewallPolicyFirewallPolicyStatelessRuleGroupReferenceGetArgs>> statelessRuleGroupReferences;

    public Input<List<FirewallPolicyFirewallPolicyStatelessRuleGroupReferenceGetArgs>> getStatelessRuleGroupReferences() {
        return this.statelessRuleGroupReferences == null ? Input.empty() : this.statelessRuleGroupReferences;
    }

    public FirewallPolicyFirewallPolicyGetArgs(
        @Nullable Input<List<String>> statefulDefaultActions,
        @Nullable Input<FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs> statefulEngineOptions,
        @Nullable Input<List<FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceGetArgs>> statefulRuleGroupReferences,
        @Nullable Input<List<FirewallPolicyFirewallPolicyStatelessCustomActionGetArgs>> statelessCustomActions,
        Input<List<String>> statelessDefaultActions,
        Input<List<String>> statelessFragmentDefaultActions,
        @Nullable Input<List<FirewallPolicyFirewallPolicyStatelessRuleGroupReferenceGetArgs>> statelessRuleGroupReferences) {
        this.statefulDefaultActions = statefulDefaultActions;
        this.statefulEngineOptions = statefulEngineOptions;
        this.statefulRuleGroupReferences = statefulRuleGroupReferences;
        this.statelessCustomActions = statelessCustomActions;
        this.statelessDefaultActions = Objects.requireNonNull(statelessDefaultActions, "expected parameter 'statelessDefaultActions' to be non-null");
        this.statelessFragmentDefaultActions = Objects.requireNonNull(statelessFragmentDefaultActions, "expected parameter 'statelessFragmentDefaultActions' to be non-null");
        this.statelessRuleGroupReferences = statelessRuleGroupReferences;
    }

    private FirewallPolicyFirewallPolicyGetArgs() {
        this.statefulDefaultActions = Input.empty();
        this.statefulEngineOptions = Input.empty();
        this.statefulRuleGroupReferences = Input.empty();
        this.statelessCustomActions = Input.empty();
        this.statelessDefaultActions = Input.empty();
        this.statelessFragmentDefaultActions = Input.empty();
        this.statelessRuleGroupReferences = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFirewallPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> statefulDefaultActions;
        private @Nullable Input<FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs> statefulEngineOptions;
        private @Nullable Input<List<FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceGetArgs>> statefulRuleGroupReferences;
        private @Nullable Input<List<FirewallPolicyFirewallPolicyStatelessCustomActionGetArgs>> statelessCustomActions;
        private Input<List<String>> statelessDefaultActions;
        private Input<List<String>> statelessFragmentDefaultActions;
        private @Nullable Input<List<FirewallPolicyFirewallPolicyStatelessRuleGroupReferenceGetArgs>> statelessRuleGroupReferences;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFirewallPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statefulDefaultActions = defaults.statefulDefaultActions;
    	      this.statefulEngineOptions = defaults.statefulEngineOptions;
    	      this.statefulRuleGroupReferences = defaults.statefulRuleGroupReferences;
    	      this.statelessCustomActions = defaults.statelessCustomActions;
    	      this.statelessDefaultActions = defaults.statelessDefaultActions;
    	      this.statelessFragmentDefaultActions = defaults.statelessFragmentDefaultActions;
    	      this.statelessRuleGroupReferences = defaults.statelessRuleGroupReferences;
        }

        public Builder setStatefulDefaultActions(@Nullable Input<List<String>> statefulDefaultActions) {
            this.statefulDefaultActions = statefulDefaultActions;
            return this;
        }

        public Builder setStatefulDefaultActions(@Nullable List<String> statefulDefaultActions) {
            this.statefulDefaultActions = Input.ofNullable(statefulDefaultActions);
            return this;
        }

        public Builder setStatefulEngineOptions(@Nullable Input<FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs> statefulEngineOptions) {
            this.statefulEngineOptions = statefulEngineOptions;
            return this;
        }

        public Builder setStatefulEngineOptions(@Nullable FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs statefulEngineOptions) {
            this.statefulEngineOptions = Input.ofNullable(statefulEngineOptions);
            return this;
        }

        public Builder setStatefulRuleGroupReferences(@Nullable Input<List<FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceGetArgs>> statefulRuleGroupReferences) {
            this.statefulRuleGroupReferences = statefulRuleGroupReferences;
            return this;
        }

        public Builder setStatefulRuleGroupReferences(@Nullable List<FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceGetArgs> statefulRuleGroupReferences) {
            this.statefulRuleGroupReferences = Input.ofNullable(statefulRuleGroupReferences);
            return this;
        }

        public Builder setStatelessCustomActions(@Nullable Input<List<FirewallPolicyFirewallPolicyStatelessCustomActionGetArgs>> statelessCustomActions) {
            this.statelessCustomActions = statelessCustomActions;
            return this;
        }

        public Builder setStatelessCustomActions(@Nullable List<FirewallPolicyFirewallPolicyStatelessCustomActionGetArgs> statelessCustomActions) {
            this.statelessCustomActions = Input.ofNullable(statelessCustomActions);
            return this;
        }

        public Builder setStatelessDefaultActions(Input<List<String>> statelessDefaultActions) {
            this.statelessDefaultActions = Objects.requireNonNull(statelessDefaultActions);
            return this;
        }

        public Builder setStatelessDefaultActions(List<String> statelessDefaultActions) {
            this.statelessDefaultActions = Input.of(Objects.requireNonNull(statelessDefaultActions));
            return this;
        }

        public Builder setStatelessFragmentDefaultActions(Input<List<String>> statelessFragmentDefaultActions) {
            this.statelessFragmentDefaultActions = Objects.requireNonNull(statelessFragmentDefaultActions);
            return this;
        }

        public Builder setStatelessFragmentDefaultActions(List<String> statelessFragmentDefaultActions) {
            this.statelessFragmentDefaultActions = Input.of(Objects.requireNonNull(statelessFragmentDefaultActions));
            return this;
        }

        public Builder setStatelessRuleGroupReferences(@Nullable Input<List<FirewallPolicyFirewallPolicyStatelessRuleGroupReferenceGetArgs>> statelessRuleGroupReferences) {
            this.statelessRuleGroupReferences = statelessRuleGroupReferences;
            return this;
        }

        public Builder setStatelessRuleGroupReferences(@Nullable List<FirewallPolicyFirewallPolicyStatelessRuleGroupReferenceGetArgs> statelessRuleGroupReferences) {
            this.statelessRuleGroupReferences = Input.ofNullable(statelessRuleGroupReferences);
            return this;
        }
        public FirewallPolicyFirewallPolicyGetArgs build() {
            return new FirewallPolicyFirewallPolicyGetArgs(statefulDefaultActions, statefulEngineOptions, statefulRuleGroupReferences, statelessCustomActions, statelessDefaultActions, statelessFragmentDefaultActions, statelessRuleGroupReferences);
        }
    }
}