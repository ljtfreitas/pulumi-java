// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeploymentGroupAutoRollbackConfiguration {
    /**
     * Indicates whether a defined automatic rollback configuration is currently enabled for this Deployment Group. If you enable automatic rollback, you must specify at least one event type.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The event type or types that trigger a rollback. Supported types are `DEPLOYMENT_FAILURE` and `DEPLOYMENT_STOP_ON_ALARM`.
     * 
     */
    private final @Nullable List<String> events;

    @OutputCustomType.Constructor({"enabled","events"})
    private DeploymentGroupAutoRollbackConfiguration(
        @Nullable Boolean enabled,
        @Nullable List<String> events) {
        this.enabled = enabled;
        this.events = events;
    }

    /**
     * Indicates whether a defined automatic rollback configuration is currently enabled for this Deployment Group. If you enable automatic rollback, you must specify at least one event type.
     * 
     */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The event type or types that trigger a rollback. Supported types are `DEPLOYMENT_FAILURE` and `DEPLOYMENT_STOP_ON_ALARM`.
     * 
     */
    public List<String> getEvents() {
        return this.events == null ? List.of() : this.events;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupAutoRollbackConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable List<String> events;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupAutoRollbackConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.events = defaults.events;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEvents(@Nullable List<String> events) {
            this.events = events;
            return this;
        }
        public DeploymentGroupAutoRollbackConfiguration build() {
            return new DeploymentGroupAutoRollbackConfiguration(enabled, events);
        }
    }
}
