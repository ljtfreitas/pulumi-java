// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoverycontrol;

import io.pulumi.aws.route53recoverycontrol.inputs.SafetyRuleRuleConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SafetyRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SafetyRuleArgs Empty = new SafetyRuleArgs();

    /**
     * Routing controls that are part of transactions that are evaluated to determine if a request to change a routing control state is allowed.
     * 
     */
    @InputImport(name="assertedControls")
    private final @Nullable Input<List<String>> assertedControls;

    public Input<List<String>> getAssertedControls() {
        return this.assertedControls == null ? Input.empty() : this.assertedControls;
    }

    /**
     * ARN of the control panel in which this safety rule will reside.
     * 
     */
    @InputImport(name="controlPanelArn", required=true)
    private final Input<String> controlPanelArn;

    public Input<String> getControlPanelArn() {
        return this.controlPanelArn;
    }

    /**
     * Gating controls for the new gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
     * 
     */
    @InputImport(name="gatingControls")
    private final @Nullable Input<List<String>> gatingControls;

    public Input<List<String>> getGatingControls() {
        return this.gatingControls == null ? Input.empty() : this.gatingControls;
    }

    /**
     * Name describing the safety rule.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Configuration block for safety rule criteria. See below.
     * 
     */
    @InputImport(name="ruleConfig", required=true)
    private final Input<SafetyRuleRuleConfigArgs> ruleConfig;

    public Input<SafetyRuleRuleConfigArgs> getRuleConfig() {
        return this.ruleConfig;
    }

    /**
     * Routing controls that can only be set or unset if the specified `rule_config` evaluates to true for the specified `gating_controls`.
     * 
     */
    @InputImport(name="targetControls")
    private final @Nullable Input<List<String>> targetControls;

    public Input<List<String>> getTargetControls() {
        return this.targetControls == null ? Input.empty() : this.targetControls;
    }

    /**
     * Evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail.
     * 
     */
    @InputImport(name="waitPeriodMs", required=true)
    private final Input<Integer> waitPeriodMs;

    public Input<Integer> getWaitPeriodMs() {
        return this.waitPeriodMs;
    }

    public SafetyRuleArgs(
        @Nullable Input<List<String>> assertedControls,
        Input<String> controlPanelArn,
        @Nullable Input<List<String>> gatingControls,
        @Nullable Input<String> name,
        Input<SafetyRuleRuleConfigArgs> ruleConfig,
        @Nullable Input<List<String>> targetControls,
        Input<Integer> waitPeriodMs) {
        this.assertedControls = assertedControls;
        this.controlPanelArn = Objects.requireNonNull(controlPanelArn, "expected parameter 'controlPanelArn' to be non-null");
        this.gatingControls = gatingControls;
        this.name = name;
        this.ruleConfig = Objects.requireNonNull(ruleConfig, "expected parameter 'ruleConfig' to be non-null");
        this.targetControls = targetControls;
        this.waitPeriodMs = Objects.requireNonNull(waitPeriodMs, "expected parameter 'waitPeriodMs' to be non-null");
    }

    private SafetyRuleArgs() {
        this.assertedControls = Input.empty();
        this.controlPanelArn = Input.empty();
        this.gatingControls = Input.empty();
        this.name = Input.empty();
        this.ruleConfig = Input.empty();
        this.targetControls = Input.empty();
        this.waitPeriodMs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SafetyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> assertedControls;
        private Input<String> controlPanelArn;
        private @Nullable Input<List<String>> gatingControls;
        private @Nullable Input<String> name;
        private Input<SafetyRuleRuleConfigArgs> ruleConfig;
        private @Nullable Input<List<String>> targetControls;
        private Input<Integer> waitPeriodMs;

        public Builder() {
    	      // Empty
        }

        public Builder(SafetyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assertedControls = defaults.assertedControls;
    	      this.controlPanelArn = defaults.controlPanelArn;
    	      this.gatingControls = defaults.gatingControls;
    	      this.name = defaults.name;
    	      this.ruleConfig = defaults.ruleConfig;
    	      this.targetControls = defaults.targetControls;
    	      this.waitPeriodMs = defaults.waitPeriodMs;
        }

        public Builder setAssertedControls(@Nullable Input<List<String>> assertedControls) {
            this.assertedControls = assertedControls;
            return this;
        }

        public Builder setAssertedControls(@Nullable List<String> assertedControls) {
            this.assertedControls = Input.ofNullable(assertedControls);
            return this;
        }

        public Builder setControlPanelArn(Input<String> controlPanelArn) {
            this.controlPanelArn = Objects.requireNonNull(controlPanelArn);
            return this;
        }

        public Builder setControlPanelArn(String controlPanelArn) {
            this.controlPanelArn = Input.of(Objects.requireNonNull(controlPanelArn));
            return this;
        }

        public Builder setGatingControls(@Nullable Input<List<String>> gatingControls) {
            this.gatingControls = gatingControls;
            return this;
        }

        public Builder setGatingControls(@Nullable List<String> gatingControls) {
            this.gatingControls = Input.ofNullable(gatingControls);
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

        public Builder setRuleConfig(Input<SafetyRuleRuleConfigArgs> ruleConfig) {
            this.ruleConfig = Objects.requireNonNull(ruleConfig);
            return this;
        }

        public Builder setRuleConfig(SafetyRuleRuleConfigArgs ruleConfig) {
            this.ruleConfig = Input.of(Objects.requireNonNull(ruleConfig));
            return this;
        }

        public Builder setTargetControls(@Nullable Input<List<String>> targetControls) {
            this.targetControls = targetControls;
            return this;
        }

        public Builder setTargetControls(@Nullable List<String> targetControls) {
            this.targetControls = Input.ofNullable(targetControls);
            return this;
        }

        public Builder setWaitPeriodMs(Input<Integer> waitPeriodMs) {
            this.waitPeriodMs = Objects.requireNonNull(waitPeriodMs);
            return this;
        }

        public Builder setWaitPeriodMs(Integer waitPeriodMs) {
            this.waitPeriodMs = Input.of(Objects.requireNonNull(waitPeriodMs));
            return this;
        }
        public SafetyRuleArgs build() {
            return new SafetyRuleArgs(assertedControls, controlPanelArn, gatingControls, name, ruleConfig, targetControls, waitPeriodMs);
        }
    }
}
