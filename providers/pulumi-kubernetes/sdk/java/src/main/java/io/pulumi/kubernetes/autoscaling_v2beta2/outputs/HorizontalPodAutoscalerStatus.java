// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.autoscaling_v2beta2.outputs.HorizontalPodAutoscalerCondition;
import io.pulumi.kubernetes.autoscaling_v2beta2.outputs.MetricStatus;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HorizontalPodAutoscalerStatus {
    /**
     * conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.
     * 
     */
    private final @Nullable List<HorizontalPodAutoscalerCondition> conditions;
    /**
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * 
     */
    private final @Nullable List<MetricStatus> currentMetrics;
    /**
     * currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.
     * 
     */
    private final Integer currentReplicas;
    /**
     * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.
     * 
     */
    private final Integer desiredReplicas;
    /**
     * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.
     * 
     */
    private final @Nullable String lastScaleTime;
    /**
     * observedGeneration is the most recent generation observed by this autoscaler.
     * 
     */
    private final @Nullable Integer observedGeneration;

    @OutputCustomType.Constructor({"conditions","currentMetrics","currentReplicas","desiredReplicas","lastScaleTime","observedGeneration"})
    private HorizontalPodAutoscalerStatus(
        @Nullable List<HorizontalPodAutoscalerCondition> conditions,
        @Nullable List<MetricStatus> currentMetrics,
        Integer currentReplicas,
        Integer desiredReplicas,
        @Nullable String lastScaleTime,
        @Nullable Integer observedGeneration) {
        this.conditions = conditions;
        this.currentMetrics = currentMetrics;
        this.currentReplicas = Objects.requireNonNull(currentReplicas);
        this.desiredReplicas = Objects.requireNonNull(desiredReplicas);
        this.lastScaleTime = lastScaleTime;
        this.observedGeneration = observedGeneration;
    }

    /**
     * conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.
     * 
     */
    public List<HorizontalPodAutoscalerCondition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * 
     */
    public List<MetricStatus> getCurrentMetrics() {
        return this.currentMetrics == null ? List.of() : this.currentMetrics;
    }
    /**
     * currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.
     * 
     */
    public Integer getCurrentReplicas() {
        return this.currentReplicas;
    }
    /**
     * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.
     * 
     */
    public Integer getDesiredReplicas() {
        return this.desiredReplicas;
    }
    /**
     * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.
     * 
     */
    public Optional<String> getLastScaleTime() {
        return Optional.ofNullable(this.lastScaleTime);
    }
    /**
     * observedGeneration is the most recent generation observed by this autoscaler.
     * 
     */
    public Optional<Integer> getObservedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<HorizontalPodAutoscalerCondition> conditions;
        private @Nullable List<MetricStatus> currentMetrics;
        private Integer currentReplicas;
        private Integer desiredReplicas;
        private @Nullable String lastScaleTime;
        private @Nullable Integer observedGeneration;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.currentMetrics = defaults.currentMetrics;
    	      this.currentReplicas = defaults.currentReplicas;
    	      this.desiredReplicas = defaults.desiredReplicas;
    	      this.lastScaleTime = defaults.lastScaleTime;
    	      this.observedGeneration = defaults.observedGeneration;
        }

        public Builder setConditions(@Nullable List<HorizontalPodAutoscalerCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setCurrentMetrics(@Nullable List<MetricStatus> currentMetrics) {
            this.currentMetrics = currentMetrics;
            return this;
        }

        public Builder setCurrentReplicas(Integer currentReplicas) {
            this.currentReplicas = Objects.requireNonNull(currentReplicas);
            return this;
        }

        public Builder setDesiredReplicas(Integer desiredReplicas) {
            this.desiredReplicas = Objects.requireNonNull(desiredReplicas);
            return this;
        }

        public Builder setLastScaleTime(@Nullable String lastScaleTime) {
            this.lastScaleTime = lastScaleTime;
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }
        public HorizontalPodAutoscalerStatus build() {
            return new HorizontalPodAutoscalerStatus(conditions, currentMetrics, currentReplicas, desiredReplicas, lastScaleTime, observedGeneration);
        }
    }
}
