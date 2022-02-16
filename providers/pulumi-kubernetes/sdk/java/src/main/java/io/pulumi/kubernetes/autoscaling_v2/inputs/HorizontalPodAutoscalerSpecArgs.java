// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.autoscaling_v2.inputs.CrossVersionObjectReferenceArgs;
import io.pulumi.kubernetes.autoscaling_v2.inputs.HorizontalPodAutoscalerBehaviorArgs;
import io.pulumi.kubernetes.autoscaling_v2.inputs.MetricSpecArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HorizontalPodAutoscalerSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final HorizontalPodAutoscalerSpecArgs Empty = new HorizontalPodAutoscalerSpecArgs();

    @InputImport(name="behavior")
    private final @Nullable Input<HorizontalPodAutoscalerBehaviorArgs> behavior;

    public Input<HorizontalPodAutoscalerBehaviorArgs> getBehavior() {
        return this.behavior == null ? Input.empty() : this.behavior;
    }

    @InputImport(name="maxReplicas", required=true)
    private final Input<Integer> maxReplicas;

    public Input<Integer> getMaxReplicas() {
        return this.maxReplicas;
    }

    @InputImport(name="metrics")
    private final @Nullable Input<List<MetricSpecArgs>> metrics;

    public Input<List<MetricSpecArgs>> getMetrics() {
        return this.metrics == null ? Input.empty() : this.metrics;
    }

    @InputImport(name="minReplicas")
    private final @Nullable Input<Integer> minReplicas;

    public Input<Integer> getMinReplicas() {
        return this.minReplicas == null ? Input.empty() : this.minReplicas;
    }

    @InputImport(name="scaleTargetRef", required=true)
    private final Input<CrossVersionObjectReferenceArgs> scaleTargetRef;

    public Input<CrossVersionObjectReferenceArgs> getScaleTargetRef() {
        return this.scaleTargetRef;
    }

    public HorizontalPodAutoscalerSpecArgs(
        @Nullable Input<HorizontalPodAutoscalerBehaviorArgs> behavior,
        Input<Integer> maxReplicas,
        @Nullable Input<List<MetricSpecArgs>> metrics,
        @Nullable Input<Integer> minReplicas,
        Input<CrossVersionObjectReferenceArgs> scaleTargetRef) {
        this.behavior = behavior;
        this.maxReplicas = Objects.requireNonNull(maxReplicas, "expected parameter 'maxReplicas' to be non-null");
        this.metrics = metrics;
        this.minReplicas = minReplicas;
        this.scaleTargetRef = Objects.requireNonNull(scaleTargetRef, "expected parameter 'scaleTargetRef' to be non-null");
    }

    private HorizontalPodAutoscalerSpecArgs() {
        this.behavior = Input.empty();
        this.maxReplicas = Input.empty();
        this.metrics = Input.empty();
        this.minReplicas = Input.empty();
        this.scaleTargetRef = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<HorizontalPodAutoscalerBehaviorArgs> behavior;
        private Input<Integer> maxReplicas;
        private @Nullable Input<List<MetricSpecArgs>> metrics;
        private @Nullable Input<Integer> minReplicas;
        private Input<CrossVersionObjectReferenceArgs> scaleTargetRef;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.behavior = defaults.behavior;
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.metrics = defaults.metrics;
    	      this.minReplicas = defaults.minReplicas;
    	      this.scaleTargetRef = defaults.scaleTargetRef;
        }

        public Builder setBehavior(@Nullable Input<HorizontalPodAutoscalerBehaviorArgs> behavior) {
            this.behavior = behavior;
            return this;
        }

        public Builder setBehavior(@Nullable HorizontalPodAutoscalerBehaviorArgs behavior) {
            this.behavior = Input.ofNullable(behavior);
            return this;
        }

        public Builder setMaxReplicas(Input<Integer> maxReplicas) {
            this.maxReplicas = Objects.requireNonNull(maxReplicas);
            return this;
        }

        public Builder setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = Input.of(Objects.requireNonNull(maxReplicas));
            return this;
        }

        public Builder setMetrics(@Nullable Input<List<MetricSpecArgs>> metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder setMetrics(@Nullable List<MetricSpecArgs> metrics) {
            this.metrics = Input.ofNullable(metrics);
            return this;
        }

        public Builder setMinReplicas(@Nullable Input<Integer> minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }

        public Builder setMinReplicas(@Nullable Integer minReplicas) {
            this.minReplicas = Input.ofNullable(minReplicas);
            return this;
        }

        public Builder setScaleTargetRef(Input<CrossVersionObjectReferenceArgs> scaleTargetRef) {
            this.scaleTargetRef = Objects.requireNonNull(scaleTargetRef);
            return this;
        }

        public Builder setScaleTargetRef(CrossVersionObjectReferenceArgs scaleTargetRef) {
            this.scaleTargetRef = Input.of(Objects.requireNonNull(scaleTargetRef));
            return this;
        }

        public HorizontalPodAutoscalerSpecArgs build() {
            return new HorizontalPodAutoscalerSpecArgs(behavior, maxReplicas, metrics, minReplicas, scaleTargetRef);
        }
    }
}