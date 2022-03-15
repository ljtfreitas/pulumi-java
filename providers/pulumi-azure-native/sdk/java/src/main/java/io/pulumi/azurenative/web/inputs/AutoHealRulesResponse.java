// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.AutoHealActionsResponse;
import io.pulumi.azurenative.web.inputs.AutoHealTriggersResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Rules that can be defined for auto-heal.
 * 
 */
public final class AutoHealRulesResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoHealRulesResponse Empty = new AutoHealRulesResponse();

    /**
     * Actions to be executed when a rule is triggered.
     * 
     */
    @Import(name="actions")
      private final @Nullable AutoHealActionsResponse actions;

    public Optional<AutoHealActionsResponse> getActions() {
        return this.actions == null ? Optional.empty() : Optional.ofNullable(this.actions);
    }

    /**
     * Conditions that describe when to execute the auto-heal actions.
     * 
     */
    @Import(name="triggers")
      private final @Nullable AutoHealTriggersResponse triggers;

    public Optional<AutoHealTriggersResponse> getTriggers() {
        return this.triggers == null ? Optional.empty() : Optional.ofNullable(this.triggers);
    }

    public AutoHealRulesResponse(
        @Nullable AutoHealActionsResponse actions,
        @Nullable AutoHealTriggersResponse triggers) {
        this.actions = actions;
        this.triggers = triggers;
    }

    private AutoHealRulesResponse() {
        this.actions = null;
        this.triggers = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoHealRulesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoHealActionsResponse actions;
        private @Nullable AutoHealTriggersResponse triggers;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoHealRulesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.triggers = defaults.triggers;
        }

        public Builder actions(@Nullable AutoHealActionsResponse actions) {
            this.actions = actions;
            return this;
        }

        public Builder triggers(@Nullable AutoHealTriggersResponse triggers) {
            this.triggers = triggers;
            return this;
        }
        public AutoHealRulesResponse build() {
            return new AutoHealRulesResponse(actions, triggers);
        }
    }
}
