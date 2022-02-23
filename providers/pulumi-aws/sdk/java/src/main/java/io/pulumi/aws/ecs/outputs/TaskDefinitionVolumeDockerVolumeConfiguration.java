// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskDefinitionVolumeDockerVolumeConfiguration {
    /**
     * If this value is `true`, the Docker volume is created if it does not already exist. *Note*: This field is only used if the scope is `shared`.
     * 
     */
    private final @Nullable Boolean autoprovision;
    /**
     * Docker volume driver to use. The driver value must match the driver name provided by Docker because it is used for task placement.
     * 
     */
    private final @Nullable String driver;
    /**
     * Map of Docker driver specific options.
     * 
     */
    private final @Nullable Map<String,String> driverOpts;
    /**
     * Map of custom metadata to add to your Docker volume.
     * 
     */
    private final @Nullable Map<String,String> labels;
    /**
     * Scope for the Docker volume, which determines its lifecycle, either `task` or `shared`.  Docker volumes that are scoped to a `task` are automatically provisioned when the task starts and destroyed when the task stops. Docker volumes that are scoped as `shared` persist after the task stops.
     * 
     */
    private final @Nullable String scope;

    @OutputCustomType.Constructor({"autoprovision","driver","driverOpts","labels","scope"})
    private TaskDefinitionVolumeDockerVolumeConfiguration(
        @Nullable Boolean autoprovision,
        @Nullable String driver,
        @Nullable Map<String,String> driverOpts,
        @Nullable Map<String,String> labels,
        @Nullable String scope) {
        this.autoprovision = autoprovision;
        this.driver = driver;
        this.driverOpts = driverOpts;
        this.labels = labels;
        this.scope = scope;
    }

    /**
     * If this value is `true`, the Docker volume is created if it does not already exist. *Note*: This field is only used if the scope is `shared`.
     * 
     */
    public Optional<Boolean> getAutoprovision() {
        return Optional.ofNullable(this.autoprovision);
    }
    /**
     * Docker volume driver to use. The driver value must match the driver name provided by Docker because it is used for task placement.
     * 
     */
    public Optional<String> getDriver() {
        return Optional.ofNullable(this.driver);
    }
    /**
     * Map of Docker driver specific options.
     * 
     */
    public Map<String,String> getDriverOpts() {
        return this.driverOpts == null ? Map.of() : this.driverOpts;
    }
    /**
     * Map of custom metadata to add to your Docker volume.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * Scope for the Docker volume, which determines its lifecycle, either `task` or `shared`.  Docker volumes that are scoped to a `task` are automatically provisioned when the task starts and destroyed when the task stops. Docker volumes that are scoped as `shared` persist after the task stops.
     * 
     */
    public Optional<String> getScope() {
        return Optional.ofNullable(this.scope);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionVolumeDockerVolumeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoprovision;
        private @Nullable String driver;
        private @Nullable Map<String,String> driverOpts;
        private @Nullable Map<String,String> labels;
        private @Nullable String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionVolumeDockerVolumeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoprovision = defaults.autoprovision;
    	      this.driver = defaults.driver;
    	      this.driverOpts = defaults.driverOpts;
    	      this.labels = defaults.labels;
    	      this.scope = defaults.scope;
        }

        public Builder setAutoprovision(@Nullable Boolean autoprovision) {
            this.autoprovision = autoprovision;
            return this;
        }

        public Builder setDriver(@Nullable String driver) {
            this.driver = driver;
            return this;
        }

        public Builder setDriverOpts(@Nullable Map<String,String> driverOpts) {
            this.driverOpts = driverOpts;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        public TaskDefinitionVolumeDockerVolumeConfiguration build() {
            return new TaskDefinitionVolumeDockerVolumeConfiguration(autoprovision, driver, driverOpts, labels, scope);
        }
    }
}
