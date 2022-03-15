// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.autoscaling_v2.inputs.HPAScalingRulesArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HorizontalPodAutoscalerBehavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively).
 * 
 */
public final class HorizontalPodAutoscalerBehaviorArgs extends io.pulumi.resources.ResourceArgs {

    public static final HorizontalPodAutoscalerBehaviorArgs Empty = new HorizontalPodAutoscalerBehaviorArgs();

    /**
     * scaleDown is scaling policy for scaling Down. If not set, the default value is to allow to scale down to minReplicas pods, with a 300 second stabilization window (i.e., the highest recommendation for the last 300sec is used).
     * 
     */
    @Import(name="scaleDown")
      private final @Nullable Output<HPAScalingRulesArgs> scaleDown;

    public Output<HPAScalingRulesArgs> getScaleDown() {
        return this.scaleDown == null ? Output.empty() : this.scaleDown;
    }

    /**
     * scaleUp is scaling policy for scaling Up. If not set, the default value is the higher of:
     *   * increase no more than 4 pods per 60 seconds
     *   * double the number of pods per 60 seconds
     *     No stabilization is used.
     * 
     */
    @Import(name="scaleUp")
      private final @Nullable Output<HPAScalingRulesArgs> scaleUp;

    public Output<HPAScalingRulesArgs> getScaleUp() {
        return this.scaleUp == null ? Output.empty() : this.scaleUp;
    }

    public HorizontalPodAutoscalerBehaviorArgs(
        @Nullable Output<HPAScalingRulesArgs> scaleDown,
        @Nullable Output<HPAScalingRulesArgs> scaleUp) {
        this.scaleDown = scaleDown;
        this.scaleUp = scaleUp;
    }

    private HorizontalPodAutoscalerBehaviorArgs() {
        this.scaleDown = Output.empty();
        this.scaleUp = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerBehaviorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<HPAScalingRulesArgs> scaleDown;
        private @Nullable Output<HPAScalingRulesArgs> scaleUp;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerBehaviorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scaleDown = defaults.scaleDown;
    	      this.scaleUp = defaults.scaleUp;
        }

        public Builder scaleDown(@Nullable Output<HPAScalingRulesArgs> scaleDown) {
            this.scaleDown = scaleDown;
            return this;
        }

        public Builder scaleDown(@Nullable HPAScalingRulesArgs scaleDown) {
            this.scaleDown = Output.ofNullable(scaleDown);
            return this;
        }

        public Builder scaleUp(@Nullable Output<HPAScalingRulesArgs> scaleUp) {
            this.scaleUp = scaleUp;
            return this;
        }

        public Builder scaleUp(@Nullable HPAScalingRulesArgs scaleUp) {
            this.scaleUp = Output.ofNullable(scaleUp);
            return this;
        }
        public HorizontalPodAutoscalerBehaviorArgs build() {
            return new HorizontalPodAutoscalerBehaviorArgs(scaleDown, scaleUp);
        }
    }
}
