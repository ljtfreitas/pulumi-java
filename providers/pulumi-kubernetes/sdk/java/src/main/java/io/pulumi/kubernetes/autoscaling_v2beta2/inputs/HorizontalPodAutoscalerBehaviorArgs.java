// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.HPAScalingRulesArgs;
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
    @InputImport(name="scaleDown")
        private final @Nullable Input<HPAScalingRulesArgs> scaleDown;

    public Input<HPAScalingRulesArgs> getScaleDown() {
        return this.scaleDown == null ? Input.empty() : this.scaleDown;
    }

    /**
     * scaleUp is scaling policy for scaling Up. If not set, the default value is the higher of:
     *   * increase no more than 4 pods per 60 seconds
     *   * double the number of pods per 60 seconds
     *     No stabilization is used.
     * 
     */
    @InputImport(name="scaleUp")
        private final @Nullable Input<HPAScalingRulesArgs> scaleUp;

    public Input<HPAScalingRulesArgs> getScaleUp() {
        return this.scaleUp == null ? Input.empty() : this.scaleUp;
    }

    public HorizontalPodAutoscalerBehaviorArgs(
        @Nullable Input<HPAScalingRulesArgs> scaleDown,
        @Nullable Input<HPAScalingRulesArgs> scaleUp) {
        this.scaleDown = scaleDown;
        this.scaleUp = scaleUp;
    }

    private HorizontalPodAutoscalerBehaviorArgs() {
        this.scaleDown = Input.empty();
        this.scaleUp = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerBehaviorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<HPAScalingRulesArgs> scaleDown;
        private @Nullable Input<HPAScalingRulesArgs> scaleUp;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerBehaviorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scaleDown = defaults.scaleDown;
    	      this.scaleUp = defaults.scaleUp;
        }

        public Builder setScaleDown(@Nullable Input<HPAScalingRulesArgs> scaleDown) {
            this.scaleDown = scaleDown;
            return this;
        }

        public Builder setScaleDown(@Nullable HPAScalingRulesArgs scaleDown) {
            this.scaleDown = Input.ofNullable(scaleDown);
            return this;
        }

        public Builder setScaleUp(@Nullable Input<HPAScalingRulesArgs> scaleUp) {
            this.scaleUp = scaleUp;
            return this;
        }

        public Builder setScaleUp(@Nullable HPAScalingRulesArgs scaleUp) {
            this.scaleUp = Input.ofNullable(scaleUp);
            return this;
        }
        public HorizontalPodAutoscalerBehaviorArgs build() {
            return new HorizontalPodAutoscalerBehaviorArgs(scaleDown, scaleUp);
        }
    }
}
