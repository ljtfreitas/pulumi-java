// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleActionForwardTargetGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionForwardTargetGroupArgs Empty = new ListenerRuleActionForwardTargetGroupArgs();

    /**
     * The Amazon Resource Name (ARN) of the target group.
     * 
     */
    @InputImport(name="arn", required=true)
    private final Input<String> arn;

    public Input<String> getArn() {
        return this.arn;
    }

    /**
     * The weight. The range is 0 to 999.
     * 
     */
    @InputImport(name="weight")
    private final @Nullable Input<Integer> weight;

    public Input<Integer> getWeight() {
        return this.weight == null ? Input.empty() : this.weight;
    }

    public ListenerRuleActionForwardTargetGroupArgs(
        Input<String> arn,
        @Nullable Input<Integer> weight) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.weight = weight;
    }

    private ListenerRuleActionForwardTargetGroupArgs() {
        this.arn = Input.empty();
        this.weight = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionForwardTargetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> arn;
        private @Nullable Input<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionForwardTargetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.weight = defaults.weight;
        }

        public Builder setArn(Input<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Input.of(Objects.requireNonNull(arn));
            return this;
        }

        public Builder setWeight(@Nullable Input<Integer> weight) {
            this.weight = weight;
            return this;
        }

        public Builder setWeight(@Nullable Integer weight) {
            this.weight = Input.ofNullable(weight);
            return this;
        }
        public ListenerRuleActionForwardTargetGroupArgs build() {
            return new ListenerRuleActionForwardTargetGroupArgs(arn, weight);
        }
    }
}
