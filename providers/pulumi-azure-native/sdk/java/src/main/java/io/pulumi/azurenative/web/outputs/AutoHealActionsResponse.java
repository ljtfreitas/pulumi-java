// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.AutoHealCustomActionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutoHealActionsResponse {
    /**
     * Predefined action to be taken.
     * 
     */
    private final @Nullable String actionType;
    /**
     * Custom action to be taken.
     * 
     */
    private final @Nullable AutoHealCustomActionResponse customAction;
    /**
     * Minimum time the process must execute
     * before taking the action
     * 
     */
    private final @Nullable String minProcessExecutionTime;

    @OutputCustomType.Constructor({"actionType","customAction","minProcessExecutionTime"})
    private AutoHealActionsResponse(
        @Nullable String actionType,
        @Nullable AutoHealCustomActionResponse customAction,
        @Nullable String minProcessExecutionTime) {
        this.actionType = actionType;
        this.customAction = customAction;
        this.minProcessExecutionTime = minProcessExecutionTime;
    }

    /**
     * Predefined action to be taken.
     * 
     */
    public Optional<String> getActionType() {
        return Optional.ofNullable(this.actionType);
    }
    /**
     * Custom action to be taken.
     * 
     */
    public Optional<AutoHealCustomActionResponse> getCustomAction() {
        return Optional.ofNullable(this.customAction);
    }
    /**
     * Minimum time the process must execute
     * before taking the action
     * 
     */
    public Optional<String> getMinProcessExecutionTime() {
        return Optional.ofNullable(this.minProcessExecutionTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoHealActionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionType;
        private @Nullable AutoHealCustomActionResponse customAction;
        private @Nullable String minProcessExecutionTime;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoHealActionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.customAction = defaults.customAction;
    	      this.minProcessExecutionTime = defaults.minProcessExecutionTime;
        }

        public Builder setActionType(@Nullable String actionType) {
            this.actionType = actionType;
            return this;
        }

        public Builder setCustomAction(@Nullable AutoHealCustomActionResponse customAction) {
            this.customAction = customAction;
            return this;
        }

        public Builder setMinProcessExecutionTime(@Nullable String minProcessExecutionTime) {
            this.minProcessExecutionTime = minProcessExecutionTime;
            return this;
        }

        public AutoHealActionsResponse build() {
            return new AutoHealActionsResponse(actionType, customAction, minProcessExecutionTime);
        }
    }
}
