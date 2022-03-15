// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.inputs;

import io.pulumi.aws.elasticloadbalancingv2.inputs.ListenerRuleActionForwardStickinessGetArgs;
import io.pulumi.aws.elasticloadbalancingv2.inputs.ListenerRuleActionForwardTargetGroupGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleActionForwardGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionForwardGetArgs Empty = new ListenerRuleActionForwardGetArgs();

    /**
     * The target group stickiness for the rule.
     * 
     */
    @Import(name="stickiness")
      private final @Nullable Output<ListenerRuleActionForwardStickinessGetArgs> stickiness;

    public Output<ListenerRuleActionForwardStickinessGetArgs> getStickiness() {
        return this.stickiness == null ? Output.empty() : this.stickiness;
    }

    /**
     * One or more target groups block.
     * 
     */
    @Import(name="targetGroups", required=true)
      private final Output<List<ListenerRuleActionForwardTargetGroupGetArgs>> targetGroups;

    public Output<List<ListenerRuleActionForwardTargetGroupGetArgs>> getTargetGroups() {
        return this.targetGroups;
    }

    public ListenerRuleActionForwardGetArgs(
        @Nullable Output<ListenerRuleActionForwardStickinessGetArgs> stickiness,
        Output<List<ListenerRuleActionForwardTargetGroupGetArgs>> targetGroups) {
        this.stickiness = stickiness;
        this.targetGroups = Objects.requireNonNull(targetGroups, "expected parameter 'targetGroups' to be non-null");
    }

    private ListenerRuleActionForwardGetArgs() {
        this.stickiness = Output.empty();
        this.targetGroups = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionForwardGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ListenerRuleActionForwardStickinessGetArgs> stickiness;
        private Output<List<ListenerRuleActionForwardTargetGroupGetArgs>> targetGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionForwardGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stickiness = defaults.stickiness;
    	      this.targetGroups = defaults.targetGroups;
        }

        public Builder stickiness(@Nullable Output<ListenerRuleActionForwardStickinessGetArgs> stickiness) {
            this.stickiness = stickiness;
            return this;
        }

        public Builder stickiness(@Nullable ListenerRuleActionForwardStickinessGetArgs stickiness) {
            this.stickiness = Output.ofNullable(stickiness);
            return this;
        }

        public Builder targetGroups(Output<List<ListenerRuleActionForwardTargetGroupGetArgs>> targetGroups) {
            this.targetGroups = Objects.requireNonNull(targetGroups);
            return this;
        }

        public Builder targetGroups(List<ListenerRuleActionForwardTargetGroupGetArgs> targetGroups) {
            this.targetGroups = Output.of(Objects.requireNonNull(targetGroups));
            return this;
        }
        public ListenerRuleActionForwardGetArgs build() {
            return new ListenerRuleActionForwardGetArgs(stickiness, targetGroups);
        }
    }
}
