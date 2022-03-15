// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.outputs;

import io.pulumi.azurenative.kubernetesconfiguration.outputs.DependsOnDefinitionResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KustomizationDefinitionResponse {
    /**
     * Specifies other Kustomizations that this Kustomization depends on. This Kustomization will not reconcile until all dependencies have completed their reconciliation.
     * 
     */
    private final @Nullable List<DependsOnDefinitionResponse> dependsOn;
    /**
     * Enable/disable re-creating Kubernetes resources on the cluster when patching fails due to an immutable field change.
     * 
     */
    private final @Nullable Boolean force;
    /**
     * The path in the source reference to reconcile on the cluster.
     * 
     */
    private final @Nullable String path;
    /**
     * Enable/disable garbage collections of Kubernetes objects created by this Kustomization.
     * 
     */
    private final @Nullable Boolean prune;
    /**
     * The interval at which to re-reconcile the Kustomization on the cluster in the event of failure on reconciliation.
     * 
     */
    private final @Nullable Double retryIntervalInSeconds;
    /**
     * The interval at which to re-reconcile the Kustomization on the cluster.
     * 
     */
    private final @Nullable Double syncIntervalInSeconds;
    /**
     * The maximum time to attempt to reconcile the Kustomization on the cluster.
     * 
     */
    private final @Nullable Double timeoutInSeconds;
    /**
     * Specify whether to validate the Kubernetes objects referenced in the Kustomization before applying them to the cluster.
     * 
     */
    private final @Nullable String validation;

    @CustomType.Constructor
    private KustomizationDefinitionResponse(
        @CustomType.Parameter("dependsOn") @Nullable List<DependsOnDefinitionResponse> dependsOn,
        @CustomType.Parameter("force") @Nullable Boolean force,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("prune") @Nullable Boolean prune,
        @CustomType.Parameter("retryIntervalInSeconds") @Nullable Double retryIntervalInSeconds,
        @CustomType.Parameter("syncIntervalInSeconds") @Nullable Double syncIntervalInSeconds,
        @CustomType.Parameter("timeoutInSeconds") @Nullable Double timeoutInSeconds,
        @CustomType.Parameter("validation") @Nullable String validation) {
        this.dependsOn = dependsOn;
        this.force = force;
        this.path = path;
        this.prune = prune;
        this.retryIntervalInSeconds = retryIntervalInSeconds;
        this.syncIntervalInSeconds = syncIntervalInSeconds;
        this.timeoutInSeconds = timeoutInSeconds;
        this.validation = validation;
    }

    /**
     * Specifies other Kustomizations that this Kustomization depends on. This Kustomization will not reconcile until all dependencies have completed their reconciliation.
     * 
    */
    public List<DependsOnDefinitionResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Enable/disable re-creating Kubernetes resources on the cluster when patching fails due to an immutable field change.
     * 
    */
    public Optional<Boolean> getForce() {
        return Optional.ofNullable(this.force);
    }
    /**
     * The path in the source reference to reconcile on the cluster.
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * Enable/disable garbage collections of Kubernetes objects created by this Kustomization.
     * 
    */
    public Optional<Boolean> getPrune() {
        return Optional.ofNullable(this.prune);
    }
    /**
     * The interval at which to re-reconcile the Kustomization on the cluster in the event of failure on reconciliation.
     * 
    */
    public Optional<Double> getRetryIntervalInSeconds() {
        return Optional.ofNullable(this.retryIntervalInSeconds);
    }
    /**
     * The interval at which to re-reconcile the Kustomization on the cluster.
     * 
    */
    public Optional<Double> getSyncIntervalInSeconds() {
        return Optional.ofNullable(this.syncIntervalInSeconds);
    }
    /**
     * The maximum time to attempt to reconcile the Kustomization on the cluster.
     * 
    */
    public Optional<Double> getTimeoutInSeconds() {
        return Optional.ofNullable(this.timeoutInSeconds);
    }
    /**
     * Specify whether to validate the Kubernetes objects referenced in the Kustomization before applying them to the cluster.
     * 
    */
    public Optional<String> getValidation() {
        return Optional.ofNullable(this.validation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KustomizationDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DependsOnDefinitionResponse> dependsOn;
        private @Nullable Boolean force;
        private @Nullable String path;
        private @Nullable Boolean prune;
        private @Nullable Double retryIntervalInSeconds;
        private @Nullable Double syncIntervalInSeconds;
        private @Nullable Double timeoutInSeconds;
        private @Nullable String validation;

        public Builder() {
    	      // Empty
        }

        public Builder(KustomizationDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.force = defaults.force;
    	      this.path = defaults.path;
    	      this.prune = defaults.prune;
    	      this.retryIntervalInSeconds = defaults.retryIntervalInSeconds;
    	      this.syncIntervalInSeconds = defaults.syncIntervalInSeconds;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
    	      this.validation = defaults.validation;
        }

        public Builder dependsOn(@Nullable List<DependsOnDefinitionResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder force(@Nullable Boolean force) {
            this.force = force;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder prune(@Nullable Boolean prune) {
            this.prune = prune;
            return this;
        }

        public Builder retryIntervalInSeconds(@Nullable Double retryIntervalInSeconds) {
            this.retryIntervalInSeconds = retryIntervalInSeconds;
            return this;
        }

        public Builder syncIntervalInSeconds(@Nullable Double syncIntervalInSeconds) {
            this.syncIntervalInSeconds = syncIntervalInSeconds;
            return this;
        }

        public Builder timeoutInSeconds(@Nullable Double timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        public Builder validation(@Nullable String validation) {
            this.validation = validation;
            return this;
        }
        public KustomizationDefinitionResponse build() {
            return new KustomizationDefinitionResponse(dependsOn, force, path, prune, retryIntervalInSeconds, syncIntervalInSeconds, timeoutInSeconds, validation);
        }
    }
}
