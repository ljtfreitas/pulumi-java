// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.ActionGroupArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A list of Activity Log Alert rule actions.
 * 
 */
public final class ActionListArgs extends io.pulumi.resources.ResourceArgs {

    public static final ActionListArgs Empty = new ActionListArgs();

    /**
     * The list of the Action Groups.
     * 
     */
    @InputImport(name="actionGroups")
        private final @Nullable Input<List<ActionGroupArgs>> actionGroups;

    public Input<List<ActionGroupArgs>> getActionGroups() {
        return this.actionGroups == null ? Input.empty() : this.actionGroups;
    }

    public ActionListArgs(@Nullable Input<List<ActionGroupArgs>> actionGroups) {
        this.actionGroups = actionGroups;
    }

    private ActionListArgs() {
        this.actionGroups = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ActionGroupArgs>> actionGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ActionListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroups = defaults.actionGroups;
        }

        public Builder setActionGroups(@Nullable Input<List<ActionGroupArgs>> actionGroups) {
            this.actionGroups = actionGroups;
            return this;
        }

        public Builder setActionGroups(@Nullable List<ActionGroupArgs> actionGroups) {
            this.actionGroups = Input.ofNullable(actionGroups);
            return this;
        }
        public ActionListArgs build() {
            return new ActionListArgs(actionGroups);
        }
    }
}
