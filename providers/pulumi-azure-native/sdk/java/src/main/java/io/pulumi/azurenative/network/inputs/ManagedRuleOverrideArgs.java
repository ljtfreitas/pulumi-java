// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ManagedRuleEnabledState;
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
     * Identifier for the managed rule.
     * 
     */
    @Import(name="ruleId", required=true)
      private final Output<String> ruleId;

    public Output<String> getRuleId() {
        return this.ruleId;
    }

    /**
     * The state of the managed rule. Defaults to Disabled if not specified.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<Either<String,ManagedRuleEnabledState>> state;

    public Output<Either<String,ManagedRuleEnabledState>> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    public ManagedRuleOverrideArgs(
        Output<String> ruleId,
        @Nullable Output<Either<String,ManagedRuleEnabledState>> state) {
        this.ruleId = Objects.requireNonNull(ruleId, "expected parameter 'ruleId' to be non-null");
        this.state = state;
    }

    private ManagedRuleOverrideArgs() {
        this.ruleId = Output.empty();
        this.state = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> ruleId;
        private @Nullable Output<Either<String,ManagedRuleEnabledState>> state;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleOverrideArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleId = defaults.ruleId;
    	      this.state = defaults.state;
        }

        public Builder ruleId(Output<String> ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }

        public Builder ruleId(String ruleId) {
            this.ruleId = Output.of(Objects.requireNonNull(ruleId));
            return this;
        }

        public Builder state(@Nullable Output<Either<String,ManagedRuleEnabledState>> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable Either<String,ManagedRuleEnabledState> state) {
            this.state = Output.ofNullable(state);
            return this;
        }
        public ManagedRuleOverrideArgs build() {
            return new ManagedRuleOverrideArgs(ruleId, state);
        }
    }
}
