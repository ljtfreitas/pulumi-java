// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.inputs;

import io.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleActionForwardStickinessArgs;
import io.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleActionForwardTargetGroupArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleActionForwardArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionForwardArgs Empty = new ListenerRuleActionForwardArgs();

    /**
     * The target group stickiness for the rule.
     * 
     */
    @InputImport(name="stickiness")
    private final @Nullable Input<ListenerRuleActionForwardStickinessArgs> stickiness;

    public Input<ListenerRuleActionForwardStickinessArgs> getStickiness() {
        return this.stickiness == null ? Input.empty() : this.stickiness;
    }

    /**
     * One or more target groups block.
     * 
     */
    @InputImport(name="targetGroups", required=true)
    private final Input<List<ListenerRuleActionForwardTargetGroupArgs>> targetGroups;

    public Input<List<ListenerRuleActionForwardTargetGroupArgs>> getTargetGroups() {
        return this.targetGroups;
    }

    public ListenerRuleActionForwardArgs(
        @Nullable Input<ListenerRuleActionForwardStickinessArgs> stickiness,
        Input<List<ListenerRuleActionForwardTargetGroupArgs>> targetGroups) {
        this.stickiness = stickiness;
        this.targetGroups = Objects.requireNonNull(targetGroups, "expected parameter 'targetGroups' to be non-null");
    }

    private ListenerRuleActionForwardArgs() {
        this.stickiness = Input.empty();
        this.targetGroups = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionForwardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ListenerRuleActionForwardStickinessArgs> stickiness;
        private Input<List<ListenerRuleActionForwardTargetGroupArgs>> targetGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionForwardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stickiness = defaults.stickiness;
    	      this.targetGroups = defaults.targetGroups;
        }

        public Builder setStickiness(@Nullable Input<ListenerRuleActionForwardStickinessArgs> stickiness) {
            this.stickiness = stickiness;
            return this;
        }

        public Builder setStickiness(@Nullable ListenerRuleActionForwardStickinessArgs stickiness) {
            this.stickiness = Input.ofNullable(stickiness);
            return this;
        }

        public Builder setTargetGroups(Input<List<ListenerRuleActionForwardTargetGroupArgs>> targetGroups) {
            this.targetGroups = Objects.requireNonNull(targetGroups);
            return this;
        }

        public Builder setTargetGroups(List<ListenerRuleActionForwardTargetGroupArgs> targetGroups) {
            this.targetGroups = Input.of(Objects.requireNonNull(targetGroups));
            return this;
        }
        public ListenerRuleActionForwardArgs build() {
            return new ListenerRuleActionForwardArgs(stickiness, targetGroups);
        }
    }
}
