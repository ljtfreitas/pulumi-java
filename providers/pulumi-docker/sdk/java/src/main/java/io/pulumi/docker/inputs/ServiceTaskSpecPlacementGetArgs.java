// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.docker.inputs.ServiceTaskSpecPlacementPlatformGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecPlacementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecPlacementGetArgs Empty = new ServiceTaskSpecPlacementGetArgs();

    @Import(name="constraints")
      private final @Nullable Output<List<String>> constraints;

    public Output<List<String>> getConstraints() {
        return this.constraints == null ? Output.empty() : this.constraints;
    }

    @Import(name="maxReplicas")
      private final @Nullable Output<Integer> maxReplicas;

    public Output<Integer> getMaxReplicas() {
        return this.maxReplicas == null ? Output.empty() : this.maxReplicas;
    }

    @Import(name="platforms")
      private final @Nullable Output<List<ServiceTaskSpecPlacementPlatformGetArgs>> platforms;

    public Output<List<ServiceTaskSpecPlacementPlatformGetArgs>> getPlatforms() {
        return this.platforms == null ? Output.empty() : this.platforms;
    }

    @Import(name="prefs")
      private final @Nullable Output<List<String>> prefs;

    public Output<List<String>> getPrefs() {
        return this.prefs == null ? Output.empty() : this.prefs;
    }

    public ServiceTaskSpecPlacementGetArgs(
        @Nullable Output<List<String>> constraints,
        @Nullable Output<Integer> maxReplicas,
        @Nullable Output<List<ServiceTaskSpecPlacementPlatformGetArgs>> platforms,
        @Nullable Output<List<String>> prefs) {
        this.constraints = constraints;
        this.maxReplicas = maxReplicas;
        this.platforms = platforms;
        this.prefs = prefs;
    }

    private ServiceTaskSpecPlacementGetArgs() {
        this.constraints = Output.empty();
        this.maxReplicas = Output.empty();
        this.platforms = Output.empty();
        this.prefs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecPlacementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> constraints;
        private @Nullable Output<Integer> maxReplicas;
        private @Nullable Output<List<ServiceTaskSpecPlacementPlatformGetArgs>> platforms;
        private @Nullable Output<List<String>> prefs;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecPlacementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constraints = defaults.constraints;
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.platforms = defaults.platforms;
    	      this.prefs = defaults.prefs;
        }

        public Builder constraints(@Nullable Output<List<String>> constraints) {
            this.constraints = constraints;
            return this;
        }

        public Builder constraints(@Nullable List<String> constraints) {
            this.constraints = Output.ofNullable(constraints);
            return this;
        }

        public Builder maxReplicas(@Nullable Output<Integer> maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }

        public Builder maxReplicas(@Nullable Integer maxReplicas) {
            this.maxReplicas = Output.ofNullable(maxReplicas);
            return this;
        }

        public Builder platforms(@Nullable Output<List<ServiceTaskSpecPlacementPlatformGetArgs>> platforms) {
            this.platforms = platforms;
            return this;
        }

        public Builder platforms(@Nullable List<ServiceTaskSpecPlacementPlatformGetArgs> platforms) {
            this.platforms = Output.ofNullable(platforms);
            return this;
        }

        public Builder prefs(@Nullable Output<List<String>> prefs) {
            this.prefs = prefs;
            return this;
        }

        public Builder prefs(@Nullable List<String> prefs) {
            this.prefs = Output.ofNullable(prefs);
            return this;
        }
        public ServiceTaskSpecPlacementGetArgs build() {
            return new ServiceTaskSpecPlacementGetArgs(constraints, maxReplicas, platforms, prefs);
        }
    }
}
