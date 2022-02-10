// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.outputs;

import io.pulumi.azurenative.kubernetesconfiguration.outputs.DependsOnDefinitionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KustomizationDefinitionResponse {
    private final @Nullable List<DependsOnDefinitionResponse> dependsOn;
    private final @Nullable Boolean force;
    private final @Nullable String path;
    private final @Nullable Boolean prune;
    private final @Nullable Double retryIntervalInSeconds;
    private final @Nullable Double syncIntervalInSeconds;
    private final @Nullable Double timeoutInSeconds;
    private final @Nullable String validation;

    @OutputCustomType.Constructor({"dependsOn","force","path","prune","retryIntervalInSeconds","syncIntervalInSeconds","timeoutInSeconds","validation"})
    private KustomizationDefinitionResponse(
        @Nullable List<DependsOnDefinitionResponse> dependsOn,
        @Nullable Boolean force,
        @Nullable String path,
        @Nullable Boolean prune,
        @Nullable Double retryIntervalInSeconds,
        @Nullable Double syncIntervalInSeconds,
        @Nullable Double timeoutInSeconds,
        @Nullable String validation) {
        this.dependsOn = dependsOn;
        this.force = force;
        this.path = path;
        this.prune = prune;
        this.retryIntervalInSeconds = retryIntervalInSeconds;
        this.syncIntervalInSeconds = syncIntervalInSeconds;
        this.timeoutInSeconds = timeoutInSeconds;
        this.validation = validation;
    }

    public List<DependsOnDefinitionResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    public Optional<Boolean> getForce() {
        return Optional.ofNullable(this.force);
    }
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    public Optional<Boolean> getPrune() {
        return Optional.ofNullable(this.prune);
    }
    public Optional<Double> getRetryIntervalInSeconds() {
        return Optional.ofNullable(this.retryIntervalInSeconds);
    }
    public Optional<Double> getSyncIntervalInSeconds() {
        return Optional.ofNullable(this.syncIntervalInSeconds);
    }
    public Optional<Double> getTimeoutInSeconds() {
        return Optional.ofNullable(this.timeoutInSeconds);
    }
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

        public Builder setDependsOn(@Nullable List<DependsOnDefinitionResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setForce(@Nullable Boolean force) {
            this.force = force;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setPrune(@Nullable Boolean prune) {
            this.prune = prune;
            return this;
        }

        public Builder setRetryIntervalInSeconds(@Nullable Double retryIntervalInSeconds) {
            this.retryIntervalInSeconds = retryIntervalInSeconds;
            return this;
        }

        public Builder setSyncIntervalInSeconds(@Nullable Double syncIntervalInSeconds) {
            this.syncIntervalInSeconds = syncIntervalInSeconds;
            return this;
        }

        public Builder setTimeoutInSeconds(@Nullable Double timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        public Builder setValidation(@Nullable String validation) {
            this.validation = validation;
            return this;
        }

        public KustomizationDefinitionResponse build() {
            return new KustomizationDefinitionResponse(dependsOn, force, path, prune, retryIntervalInSeconds, syncIntervalInSeconds, timeoutInSeconds, validation);
        }
    }
}