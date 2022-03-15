// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.ActionType;
import io.pulumi.azurenative.cdn.enums.ManagedRuleEnabledState;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines a managed rule group override setting.
 * 
 */
public final class ManagedRuleOverrideArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedRuleOverrideArgs Empty = new ManagedRuleOverrideArgs();

    /**
     * Describes the override action to be applied when rule matches.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<Either<String,ActionType>> action;

    public Output<Either<String,ActionType>> getAction() {
        return this.action == null ? Output.empty() : this.action;
    }

    /**
     * Describes if the managed rule is in enabled or disabled state. Defaults to Disabled if not specified.
     * 
     */
    @Import(name="enabledState")
      private final @Nullable Output<Either<String,ManagedRuleEnabledState>> enabledState;

    public Output<Either<String,ManagedRuleEnabledState>> getEnabledState() {
        return this.enabledState == null ? Output.empty() : this.enabledState;
    }

    /**
     * Identifier for the managed rule.
     * 
     */
    @Import(name="ruleId", required=true)
      private final Output<String> ruleId;

    public Output<String> getRuleId() {
        return this.ruleId;
    }

    public ManagedRuleOverrideArgs(
        @Nullable Output<Either<String,ActionType>> action,
        @Nullable Output<Either<String,ManagedRuleEnabledState>> enabledState,
        Output<String> ruleId) {
        this.action = action;
        this.enabledState = enabledState;
        this.ruleId = Objects.requireNonNull(ruleId, "expected parameter 'ruleId' to be non-null");
    }

    private ManagedRuleOverrideArgs() {
        this.action = Output.empty();
        this.enabledState = Output.empty();
        this.ruleId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,ActionType>> action;
        private @Nullable Output<Either<String,ManagedRuleEnabledState>> enabledState;
        private Output<String> ruleId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleOverrideArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.enabledState = defaults.enabledState;
    	      this.ruleId = defaults.ruleId;
        }

        public Builder action(@Nullable Output<Either<String,ActionType>> action) {
            this.action = action;
            return this;
        }

        public Builder action(@Nullable Either<String,ActionType> action) {
            this.action = Output.ofNullable(action);
            return this;
        }

        public Builder enabledState(@Nullable Output<Either<String,ManagedRuleEnabledState>> enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder enabledState(@Nullable Either<String,ManagedRuleEnabledState> enabledState) {
            this.enabledState = Output.ofNullable(enabledState);
            return this;
        }

        public Builder ruleId(Output<String> ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }

        public Builder ruleId(String ruleId) {
            this.ruleId = Output.of(Objects.requireNonNull(ruleId));
            return this;
        }
        public ManagedRuleOverrideArgs build() {
            return new ManagedRuleOverrideArgs(action, enabledState, ruleId);
        }
    }
}
