// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.inputs.RestHealthCheckArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the REST health check step properties.
 * 
 */
public final class RestHealthCheckStepAttributesArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestHealthCheckStepAttributesArgs Empty = new RestHealthCheckStepAttributesArgs();

    /**
     * The list of checks that form the health check step.
     * 
     */
    @InputImport(name="healthChecks", required=true)
        private final Input<List<RestHealthCheckArgs>> healthChecks;

    public Input<List<RestHealthCheckArgs>> getHealthChecks() {
        return this.healthChecks;
    }

    /**
     * The duration in ISO 8601 format for which the resource is expected to be continuously healthy. If maxElasticDuration is specified, healthy state duration is enforced after the detection of first healthy signal.
     * 
     */
    @InputImport(name="healthyStateDuration", required=true)
        private final Input<String> healthyStateDuration;

    public Input<String> getHealthyStateDuration() {
        return this.healthyStateDuration;
    }

    /**
     * The duration in ISO 8601 format for which the health check waits for the resource to become healthy. Health check fails if it doesn't. Health check starts to enforce healthyStateDuration once resource becomes healthy.
     * 
     */
    @InputImport(name="maxElasticDuration")
        private final @Nullable Input<String> maxElasticDuration;

    public Input<String> getMaxElasticDuration() {
        return this.maxElasticDuration == null ? Input.empty() : this.maxElasticDuration;
    }

    /**
     * The type of health check.
     * Expected value is 'REST'.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * The duration in ISO 8601 format for which health check waits idly without any checks.
     * 
     */
    @InputImport(name="waitDuration")
        private final @Nullable Input<String> waitDuration;

    public Input<String> getWaitDuration() {
        return this.waitDuration == null ? Input.empty() : this.waitDuration;
    }

    public RestHealthCheckStepAttributesArgs(
        Input<List<RestHealthCheckArgs>> healthChecks,
        Input<String> healthyStateDuration,
        @Nullable Input<String> maxElasticDuration,
        Input<String> type,
        @Nullable Input<String> waitDuration) {
        this.healthChecks = Objects.requireNonNull(healthChecks, "expected parameter 'healthChecks' to be non-null");
        this.healthyStateDuration = Objects.requireNonNull(healthyStateDuration, "expected parameter 'healthyStateDuration' to be non-null");
        this.maxElasticDuration = maxElasticDuration;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.waitDuration = waitDuration;
    }

    private RestHealthCheckStepAttributesArgs() {
        this.healthChecks = Input.empty();
        this.healthyStateDuration = Input.empty();
        this.maxElasticDuration = Input.empty();
        this.type = Input.empty();
        this.waitDuration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestHealthCheckStepAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<RestHealthCheckArgs>> healthChecks;
        private Input<String> healthyStateDuration;
        private @Nullable Input<String> maxElasticDuration;
        private Input<String> type;
        private @Nullable Input<String> waitDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(RestHealthCheckStepAttributesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthChecks = defaults.healthChecks;
    	      this.healthyStateDuration = defaults.healthyStateDuration;
    	      this.maxElasticDuration = defaults.maxElasticDuration;
    	      this.type = defaults.type;
    	      this.waitDuration = defaults.waitDuration;
        }

        public Builder setHealthChecks(Input<List<RestHealthCheckArgs>> healthChecks) {
            this.healthChecks = Objects.requireNonNull(healthChecks);
            return this;
        }

        public Builder setHealthChecks(List<RestHealthCheckArgs> healthChecks) {
            this.healthChecks = Input.of(Objects.requireNonNull(healthChecks));
            return this;
        }

        public Builder setHealthyStateDuration(Input<String> healthyStateDuration) {
            this.healthyStateDuration = Objects.requireNonNull(healthyStateDuration);
            return this;
        }

        public Builder setHealthyStateDuration(String healthyStateDuration) {
            this.healthyStateDuration = Input.of(Objects.requireNonNull(healthyStateDuration));
            return this;
        }

        public Builder setMaxElasticDuration(@Nullable Input<String> maxElasticDuration) {
            this.maxElasticDuration = maxElasticDuration;
            return this;
        }

        public Builder setMaxElasticDuration(@Nullable String maxElasticDuration) {
            this.maxElasticDuration = Input.ofNullable(maxElasticDuration);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setWaitDuration(@Nullable Input<String> waitDuration) {
            this.waitDuration = waitDuration;
            return this;
        }

        public Builder setWaitDuration(@Nullable String waitDuration) {
            this.waitDuration = Input.ofNullable(waitDuration);
            return this;
        }
        public RestHealthCheckStepAttributesArgs build() {
            return new RestHealthCheckStepAttributesArgs(healthChecks, healthyStateDuration, maxElasticDuration, type, waitDuration);
        }
    }
}
