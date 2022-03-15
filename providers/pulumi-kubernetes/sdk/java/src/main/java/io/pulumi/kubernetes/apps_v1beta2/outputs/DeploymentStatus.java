// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.apps_v1beta2.outputs.DeploymentCondition;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentStatus {
    /**
     * Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.
     * 
     */
    private final @Nullable Integer availableReplicas;
    /**
     * Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
     * 
     */
    private final @Nullable Integer collisionCount;
    /**
     * Represents the latest available observations of a deployment's current state.
     * 
     */
    private final @Nullable List<DeploymentCondition> conditions;
    /**
     * The generation observed by the deployment controller.
     * 
     */
    private final @Nullable Integer observedGeneration;
    /**
     * Total number of ready pods targeted by this deployment.
     * 
     */
    private final @Nullable Integer readyReplicas;
    /**
     * Total number of non-terminated pods targeted by this deployment (their labels match the selector).
     * 
     */
    private final @Nullable Integer replicas;
    /**
     * Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.
     * 
     */
    private final @Nullable Integer unavailableReplicas;
    /**
     * Total number of non-terminated pods targeted by this deployment that have the desired template spec.
     * 
     */
    private final @Nullable Integer updatedReplicas;

    @CustomType.Constructor
    private DeploymentStatus(
        @CustomType.Parameter("availableReplicas") @Nullable Integer availableReplicas,
        @CustomType.Parameter("collisionCount") @Nullable Integer collisionCount,
        @CustomType.Parameter("conditions") @Nullable List<DeploymentCondition> conditions,
        @CustomType.Parameter("observedGeneration") @Nullable Integer observedGeneration,
        @CustomType.Parameter("readyReplicas") @Nullable Integer readyReplicas,
        @CustomType.Parameter("replicas") @Nullable Integer replicas,
        @CustomType.Parameter("unavailableReplicas") @Nullable Integer unavailableReplicas,
        @CustomType.Parameter("updatedReplicas") @Nullable Integer updatedReplicas) {
        this.availableReplicas = availableReplicas;
        this.collisionCount = collisionCount;
        this.conditions = conditions;
        this.observedGeneration = observedGeneration;
        this.readyReplicas = readyReplicas;
        this.replicas = replicas;
        this.unavailableReplicas = unavailableReplicas;
        this.updatedReplicas = updatedReplicas;
    }

    /**
     * Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.
     * 
    */
    public Optional<Integer> getAvailableReplicas() {
        return Optional.ofNullable(this.availableReplicas);
    }
    /**
     * Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
     * 
    */
    public Optional<Integer> getCollisionCount() {
        return Optional.ofNullable(this.collisionCount);
    }
    /**
     * Represents the latest available observations of a deployment's current state.
     * 
    */
    public List<DeploymentCondition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * The generation observed by the deployment controller.
     * 
    */
    public Optional<Integer> getObservedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }
    /**
     * Total number of ready pods targeted by this deployment.
     * 
    */
    public Optional<Integer> getReadyReplicas() {
        return Optional.ofNullable(this.readyReplicas);
    }
    /**
     * Total number of non-terminated pods targeted by this deployment (their labels match the selector).
     * 
    */
    public Optional<Integer> getReplicas() {
        return Optional.ofNullable(this.replicas);
    }
    /**
     * Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.
     * 
    */
    public Optional<Integer> getUnavailableReplicas() {
        return Optional.ofNullable(this.unavailableReplicas);
    }
    /**
     * Total number of non-terminated pods targeted by this deployment that have the desired template spec.
     * 
    */
    public Optional<Integer> getUpdatedReplicas() {
        return Optional.ofNullable(this.updatedReplicas);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer availableReplicas;
        private @Nullable Integer collisionCount;
        private @Nullable List<DeploymentCondition> conditions;
        private @Nullable Integer observedGeneration;
        private @Nullable Integer readyReplicas;
        private @Nullable Integer replicas;
        private @Nullable Integer unavailableReplicas;
        private @Nullable Integer updatedReplicas;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableReplicas = defaults.availableReplicas;
    	      this.collisionCount = defaults.collisionCount;
    	      this.conditions = defaults.conditions;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.readyReplicas = defaults.readyReplicas;
    	      this.replicas = defaults.replicas;
    	      this.unavailableReplicas = defaults.unavailableReplicas;
    	      this.updatedReplicas = defaults.updatedReplicas;
        }

        public Builder availableReplicas(@Nullable Integer availableReplicas) {
            this.availableReplicas = availableReplicas;
            return this;
        }

        public Builder collisionCount(@Nullable Integer collisionCount) {
            this.collisionCount = collisionCount;
            return this;
        }

        public Builder conditions(@Nullable List<DeploymentCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder observedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder readyReplicas(@Nullable Integer readyReplicas) {
            this.readyReplicas = readyReplicas;
            return this;
        }

        public Builder replicas(@Nullable Integer replicas) {
            this.replicas = replicas;
            return this;
        }

        public Builder unavailableReplicas(@Nullable Integer unavailableReplicas) {
            this.unavailableReplicas = unavailableReplicas;
            return this;
        }

        public Builder updatedReplicas(@Nullable Integer updatedReplicas) {
            this.updatedReplicas = updatedReplicas;
            return this;
        }
        public DeploymentStatus build() {
            return new DeploymentStatus(availableReplicas, collisionCount, conditions, observedGeneration, readyReplicas, replicas, unavailableReplicas, updatedReplicas);
        }
    }
}
