// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.AutoHealActionType;
import io.pulumi.azurenative.web.inputs.AutoHealCustomActionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Actions which to take by the auto-heal module when a rule is triggered.
 * 
 */
public final class AutoHealActionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoHealActionsArgs Empty = new AutoHealActionsArgs();

    /**
     * Predefined action to be taken.
     * 
     */
    @InputImport(name="actionType")
        private final @Nullable Input<AutoHealActionType> actionType;

    public Input<AutoHealActionType> getActionType() {
        return this.actionType == null ? Input.empty() : this.actionType;
    }

    /**
     * Custom action to be taken.
     * 
     */
    @InputImport(name="customAction")
        private final @Nullable Input<AutoHealCustomActionArgs> customAction;

    public Input<AutoHealCustomActionArgs> getCustomAction() {
        return this.customAction == null ? Input.empty() : this.customAction;
    }

    /**
     * Minimum time the process must execute
     * before taking the action
     * 
     */
    @InputImport(name="minProcessExecutionTime")
        private final @Nullable Input<String> minProcessExecutionTime;

    public Input<String> getMinProcessExecutionTime() {
        return this.minProcessExecutionTime == null ? Input.empty() : this.minProcessExecutionTime;
    }

    public AutoHealActionsArgs(
        @Nullable Input<AutoHealActionType> actionType,
        @Nullable Input<AutoHealCustomActionArgs> customAction,
        @Nullable Input<String> minProcessExecutionTime) {
        this.actionType = actionType;
        this.customAction = customAction;
        this.minProcessExecutionTime = minProcessExecutionTime;
    }

    private AutoHealActionsArgs() {
        this.actionType = Input.empty();
        this.customAction = Input.empty();
        this.minProcessExecutionTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoHealActionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AutoHealActionType> actionType;
        private @Nullable Input<AutoHealCustomActionArgs> customAction;
        private @Nullable Input<String> minProcessExecutionTime;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoHealActionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.customAction = defaults.customAction;
    	      this.minProcessExecutionTime = defaults.minProcessExecutionTime;
        }

        public Builder setActionType(@Nullable Input<AutoHealActionType> actionType) {
            this.actionType = actionType;
            return this;
        }

        public Builder setActionType(@Nullable AutoHealActionType actionType) {
            this.actionType = Input.ofNullable(actionType);
            return this;
        }

        public Builder setCustomAction(@Nullable Input<AutoHealCustomActionArgs> customAction) {
            this.customAction = customAction;
            return this;
        }

        public Builder setCustomAction(@Nullable AutoHealCustomActionArgs customAction) {
            this.customAction = Input.ofNullable(customAction);
            return this;
        }

        public Builder setMinProcessExecutionTime(@Nullable Input<String> minProcessExecutionTime) {
            this.minProcessExecutionTime = minProcessExecutionTime;
            return this;
        }

        public Builder setMinProcessExecutionTime(@Nullable String minProcessExecutionTime) {
            this.minProcessExecutionTime = Input.ofNullable(minProcessExecutionTime);
            return this;
        }
        public AutoHealActionsArgs build() {
            return new AutoHealActionsArgs(actionType, customAction, minProcessExecutionTime);
        }
    }
}
