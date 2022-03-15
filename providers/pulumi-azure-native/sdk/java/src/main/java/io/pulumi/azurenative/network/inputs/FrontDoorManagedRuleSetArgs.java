// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ManagedRuleSetActionType;
import io.pulumi.azurenative.network.inputs.FrontDoorManagedRuleGroupOverrideArgs;
import io.pulumi.azurenative.network.inputs.ManagedRuleExclusionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines a managed rule set.
 * 
 */
public final class FrontDoorManagedRuleSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FrontDoorManagedRuleSetArgs Empty = new FrontDoorManagedRuleSetArgs();

    /**
     * Describes the exclusions that are applied to all rules in the set.
     * 
     */
    @Import(name="exclusions")
      private final @Nullable Output<List<ManagedRuleExclusionArgs>> exclusions;

    public Output<List<ManagedRuleExclusionArgs>> getExclusions() {
        return this.exclusions == null ? Output.empty() : this.exclusions;
    }

    /**
     * Defines the rule group overrides to apply to the rule set.
     * 
     */
    @Import(name="ruleGroupOverrides")
      private final @Nullable Output<List<FrontDoorManagedRuleGroupOverrideArgs>> ruleGroupOverrides;

    public Output<List<FrontDoorManagedRuleGroupOverrideArgs>> getRuleGroupOverrides() {
        return this.ruleGroupOverrides == null ? Output.empty() : this.ruleGroupOverrides;
    }

    /**
     * Defines the action to take when a managed rule set score threshold is met.
     * 
     */
    @Import(name="ruleSetAction")
      private final @Nullable Output<Either<String,ManagedRuleSetActionType>> ruleSetAction;

    public Output<Either<String,ManagedRuleSetActionType>> getRuleSetAction() {
        return this.ruleSetAction == null ? Output.empty() : this.ruleSetAction;
    }

    /**
     * Defines the rule set type to use.
     * 
     */
    @Import(name="ruleSetType", required=true)
      private final Output<String> ruleSetType;

    public Output<String> getRuleSetType() {
        return this.ruleSetType;
    }

    /**
     * Defines the version of the rule set to use.
     * 
     */
    @Import(name="ruleSetVersion", required=true)
      private final Output<String> ruleSetVersion;

    public Output<String> getRuleSetVersion() {
        return this.ruleSetVersion;
    }

    public FrontDoorManagedRuleSetArgs(
        @Nullable Output<List<ManagedRuleExclusionArgs>> exclusions,
        @Nullable Output<List<FrontDoorManagedRuleGroupOverrideArgs>> ruleGroupOverrides,
        @Nullable Output<Either<String,ManagedRuleSetActionType>> ruleSetAction,
        Output<String> ruleSetType,
        Output<String> ruleSetVersion) {
        this.exclusions = exclusions;
        this.ruleGroupOverrides = ruleGroupOverrides;
        this.ruleSetAction = ruleSetAction;
        this.ruleSetType = Objects.requireNonNull(ruleSetType, "expected parameter 'ruleSetType' to be non-null");
        this.ruleSetVersion = Objects.requireNonNull(ruleSetVersion, "expected parameter 'ruleSetVersion' to be non-null");
    }

    private FrontDoorManagedRuleSetArgs() {
        this.exclusions = Output.empty();
        this.ruleGroupOverrides = Output.empty();
        this.ruleSetAction = Output.empty();
        this.ruleSetType = Output.empty();
        this.ruleSetVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontDoorManagedRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ManagedRuleExclusionArgs>> exclusions;
        private @Nullable Output<List<FrontDoorManagedRuleGroupOverrideArgs>> ruleGroupOverrides;
        private @Nullable Output<Either<String,ManagedRuleSetActionType>> ruleSetAction;
        private Output<String> ruleSetType;
        private Output<String> ruleSetVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontDoorManagedRuleSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclusions = defaults.exclusions;
    	      this.ruleGroupOverrides = defaults.ruleGroupOverrides;
    	      this.ruleSetAction = defaults.ruleSetAction;
    	      this.ruleSetType = defaults.ruleSetType;
    	      this.ruleSetVersion = defaults.ruleSetVersion;
        }

        public Builder exclusions(@Nullable Output<List<ManagedRuleExclusionArgs>> exclusions) {
            this.exclusions = exclusions;
            return this;
        }

        public Builder exclusions(@Nullable List<ManagedRuleExclusionArgs> exclusions) {
            this.exclusions = Output.ofNullable(exclusions);
            return this;
        }

        public Builder ruleGroupOverrides(@Nullable Output<List<FrontDoorManagedRuleGroupOverrideArgs>> ruleGroupOverrides) {
            this.ruleGroupOverrides = ruleGroupOverrides;
            return this;
        }

        public Builder ruleGroupOverrides(@Nullable List<FrontDoorManagedRuleGroupOverrideArgs> ruleGroupOverrides) {
            this.ruleGroupOverrides = Output.ofNullable(ruleGroupOverrides);
            return this;
        }

        public Builder ruleSetAction(@Nullable Output<Either<String,ManagedRuleSetActionType>> ruleSetAction) {
            this.ruleSetAction = ruleSetAction;
            return this;
        }

        public Builder ruleSetAction(@Nullable Either<String,ManagedRuleSetActionType> ruleSetAction) {
            this.ruleSetAction = Output.ofNullable(ruleSetAction);
            return this;
        }

        public Builder ruleSetType(Output<String> ruleSetType) {
            this.ruleSetType = Objects.requireNonNull(ruleSetType);
            return this;
        }

        public Builder ruleSetType(String ruleSetType) {
            this.ruleSetType = Output.of(Objects.requireNonNull(ruleSetType));
            return this;
        }

        public Builder ruleSetVersion(Output<String> ruleSetVersion) {
            this.ruleSetVersion = Objects.requireNonNull(ruleSetVersion);
            return this;
        }

        public Builder ruleSetVersion(String ruleSetVersion) {
            this.ruleSetVersion = Output.of(Objects.requireNonNull(ruleSetVersion));
            return this;
        }
        public FrontDoorManagedRuleSetArgs build() {
            return new FrontDoorManagedRuleSetArgs(exclusions, ruleGroupOverrides, ruleSetAction, ruleSetType, ruleSetVersion);
        }
    }
}
