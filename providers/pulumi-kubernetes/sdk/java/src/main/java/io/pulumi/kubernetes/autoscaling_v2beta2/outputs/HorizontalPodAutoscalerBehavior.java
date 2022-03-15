// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.autoscaling_v2beta2.outputs.HPAScalingRules;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HorizontalPodAutoscalerBehavior {
    /**
     * scaleDown is scaling policy for scaling Down. If not set, the default value is to allow to scale down to minReplicas pods, with a 300 second stabilization window (i.e., the highest recommendation for the last 300sec is used).
     * 
     */
    private final @Nullable HPAScalingRules scaleDown;
    /**
     * scaleUp is scaling policy for scaling Up. If not set, the default value is the higher of:
     *   * increase no more than 4 pods per 60 seconds
     *   * double the number of pods per 60 seconds
     *     No stabilization is used.
     * 
     */
    private final @Nullable HPAScalingRules scaleUp;

    @CustomType.Constructor
    private HorizontalPodAutoscalerBehavior(
        @CustomType.Parameter("scaleDown") @Nullable HPAScalingRules scaleDown,
        @CustomType.Parameter("scaleUp") @Nullable HPAScalingRules scaleUp) {
        this.scaleDown = scaleDown;
        this.scaleUp = scaleUp;
    }

    /**
     * scaleDown is scaling policy for scaling Down. If not set, the default value is to allow to scale down to minReplicas pods, with a 300 second stabilization window (i.e., the highest recommendation for the last 300sec is used).
     * 
    */
    public Optional<HPAScalingRules> getScaleDown() {
        return Optional.ofNullable(this.scaleDown);
    }
    /**
     * scaleUp is scaling policy for scaling Up. If not set, the default value is the higher of:
     *   * increase no more than 4 pods per 60 seconds
     *   * double the number of pods per 60 seconds
     *     No stabilization is used.
     * 
    */
    public Optional<HPAScalingRules> getScaleUp() {
        return Optional.ofNullable(this.scaleUp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerBehavior defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable HPAScalingRules scaleDown;
        private @Nullable HPAScalingRules scaleUp;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerBehavior defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scaleDown = defaults.scaleDown;
    	      this.scaleUp = defaults.scaleUp;
        }

        public Builder scaleDown(@Nullable HPAScalingRules scaleDown) {
            this.scaleDown = scaleDown;
            return this;
        }

        public Builder scaleUp(@Nullable HPAScalingRules scaleUp) {
            this.scaleUp = scaleUp;
            return this;
        }
        public HorizontalPodAutoscalerBehavior build() {
            return new HorizontalPodAutoscalerBehavior(scaleDown, scaleUp);
        }
    }
}
