// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.apps_v1.outputs.DeploymentStrategy;
import io.pulumi.kubernetes.core_v1.outputs.PodTemplateSpec;
import io.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeploymentSpec {
    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    private final @Nullable Integer minReadySeconds;
    /**
     * Indicates that the deployment is paused.
     * 
     */
    private final @Nullable Boolean paused;
    /**
     * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
     * 
     */
    private final @Nullable Integer progressDeadlineSeconds;
    /**
     * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
     * 
     */
    private final @Nullable Integer replicas;
    /**
     * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
     * 
     */
    private final @Nullable Integer revisionHistoryLimit;
    /**
     * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. It must match the pod template's labels.
     * 
     */
    private final LabelSelector selector;
    /**
     * The deployment strategy to use to replace existing pods with new ones.
     * 
     */
    private final @Nullable DeploymentStrategy strategy;
    /**
     * Template describes the pods that will be created.
     * 
     */
    private final PodTemplateSpec template;

    @OutputCustomType.Constructor({"minReadySeconds","paused","progressDeadlineSeconds","replicas","revisionHistoryLimit","selector","strategy","template"})
    private DeploymentSpec(
        @Nullable Integer minReadySeconds,
        @Nullable Boolean paused,
        @Nullable Integer progressDeadlineSeconds,
        @Nullable Integer replicas,
        @Nullable Integer revisionHistoryLimit,
        LabelSelector selector,
        @Nullable DeploymentStrategy strategy,
        PodTemplateSpec template) {
        this.minReadySeconds = minReadySeconds;
        this.paused = paused;
        this.progressDeadlineSeconds = progressDeadlineSeconds;
        this.replicas = replicas;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = Objects.requireNonNull(selector);
        this.strategy = strategy;
        this.template = Objects.requireNonNull(template);
    }

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    public Optional<Integer> getMinReadySeconds() {
        return Optional.ofNullable(this.minReadySeconds);
    }
    /**
     * Indicates that the deployment is paused.
     * 
     */
    public Optional<Boolean> getPaused() {
        return Optional.ofNullable(this.paused);
    }
    /**
     * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
     * 
     */
    public Optional<Integer> getProgressDeadlineSeconds() {
        return Optional.ofNullable(this.progressDeadlineSeconds);
    }
    /**
     * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
     * 
     */
    public Optional<Integer> getReplicas() {
        return Optional.ofNullable(this.replicas);
    }
    /**
     * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
     * 
     */
    public Optional<Integer> getRevisionHistoryLimit() {
        return Optional.ofNullable(this.revisionHistoryLimit);
    }
    /**
     * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. It must match the pod template's labels.
     * 
     */
    public LabelSelector getSelector() {
        return this.selector;
    }
    /**
     * The deployment strategy to use to replace existing pods with new ones.
     * 
     */
    public Optional<DeploymentStrategy> getStrategy() {
        return Optional.ofNullable(this.strategy);
    }
    /**
     * Template describes the pods that will be created.
     * 
     */
    public PodTemplateSpec getTemplate() {
        return this.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer minReadySeconds;
        private @Nullable Boolean paused;
        private @Nullable Integer progressDeadlineSeconds;
        private @Nullable Integer replicas;
        private @Nullable Integer revisionHistoryLimit;
        private LabelSelector selector;
        private @Nullable DeploymentStrategy strategy;
        private PodTemplateSpec template;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReadySeconds = defaults.minReadySeconds;
    	      this.paused = defaults.paused;
    	      this.progressDeadlineSeconds = defaults.progressDeadlineSeconds;
    	      this.replicas = defaults.replicas;
    	      this.revisionHistoryLimit = defaults.revisionHistoryLimit;
    	      this.selector = defaults.selector;
    	      this.strategy = defaults.strategy;
    	      this.template = defaults.template;
        }

        public Builder setMinReadySeconds(@Nullable Integer minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        public Builder setPaused(@Nullable Boolean paused) {
            this.paused = paused;
            return this;
        }

        public Builder setProgressDeadlineSeconds(@Nullable Integer progressDeadlineSeconds) {
            this.progressDeadlineSeconds = progressDeadlineSeconds;
            return this;
        }

        public Builder setReplicas(@Nullable Integer replicas) {
            this.replicas = replicas;
            return this;
        }

        public Builder setRevisionHistoryLimit(@Nullable Integer revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        public Builder setSelector(LabelSelector selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }

        public Builder setStrategy(@Nullable DeploymentStrategy strategy) {
            this.strategy = strategy;
            return this;
        }

        public Builder setTemplate(PodTemplateSpec template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }
        public DeploymentSpec build() {
            return new DeploymentSpec(minReadySeconds, paused, progressDeadlineSeconds, replicas, revisionHistoryLimit, selector, strategy, template);
        }
    }
}
