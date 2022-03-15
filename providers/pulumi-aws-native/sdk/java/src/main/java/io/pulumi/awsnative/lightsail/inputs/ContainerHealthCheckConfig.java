// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the health check configuration of an Amazon Lightsail container service.
 * 
 */
public final class ContainerHealthCheckConfig extends io.pulumi.resources.InvokeArgs {

    public static final ContainerHealthCheckConfig Empty = new ContainerHealthCheckConfig();

    /**
     * The number of consecutive health checks successes required before moving the container to the Healthy state. The default value is 2.
     * 
     */
    @Import(name="healthyThreshold")
      private final @Nullable Integer healthyThreshold;

    public Optional<Integer> getHealthyThreshold() {
        return this.healthyThreshold == null ? Optional.empty() : Optional.ofNullable(this.healthyThreshold);
    }

    /**
     * The approximate interval, in seconds, between health checks of an individual container. You can specify between 5 and 300 seconds. The default value is 5.
     * 
     */
    @Import(name="intervalSeconds")
      private final @Nullable Integer intervalSeconds;

    public Optional<Integer> getIntervalSeconds() {
        return this.intervalSeconds == null ? Optional.empty() : Optional.ofNullable(this.intervalSeconds);
    }

    /**
     * The path on the container on which to perform the health check. The default value is /.
     * 
     */
    @Import(name="path")
      private final @Nullable String path;

    public Optional<String> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    /**
     * The HTTP codes to use when checking for a successful response from a container. You can specify values between 200 and 499. You can specify multiple values (for example, 200,202) or a range of values (for example, 200-299).
     * 
     */
    @Import(name="successCodes")
      private final @Nullable String successCodes;

    public Optional<String> getSuccessCodes() {
        return this.successCodes == null ? Optional.empty() : Optional.ofNullable(this.successCodes);
    }

    /**
     * The amount of time, in seconds, during which no response means a failed health check. You can specify between 2 and 60 seconds. The default value is 2.
     * 
     */
    @Import(name="timeoutSeconds")
      private final @Nullable Integer timeoutSeconds;

    public Optional<Integer> getTimeoutSeconds() {
        return this.timeoutSeconds == null ? Optional.empty() : Optional.ofNullable(this.timeoutSeconds);
    }

    /**
     * The number of consecutive health check failures required before moving the container to the Unhealthy state. The default value is 2.
     * 
     */
    @Import(name="unhealthyThreshold")
      private final @Nullable Integer unhealthyThreshold;

    public Optional<Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold == null ? Optional.empty() : Optional.ofNullable(this.unhealthyThreshold);
    }

    public ContainerHealthCheckConfig(
        @Nullable Integer healthyThreshold,
        @Nullable Integer intervalSeconds,
        @Nullable String path,
        @Nullable String successCodes,
        @Nullable Integer timeoutSeconds,
        @Nullable Integer unhealthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        this.intervalSeconds = intervalSeconds;
        this.path = path;
        this.successCodes = successCodes;
        this.timeoutSeconds = timeoutSeconds;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    private ContainerHealthCheckConfig() {
        this.healthyThreshold = null;
        this.intervalSeconds = null;
        this.path = null;
        this.successCodes = null;
        this.timeoutSeconds = null;
        this.unhealthyThreshold = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerHealthCheckConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer healthyThreshold;
        private @Nullable Integer intervalSeconds;
        private @Nullable String path;
        private @Nullable String successCodes;
        private @Nullable Integer timeoutSeconds;
        private @Nullable Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerHealthCheckConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.intervalSeconds = defaults.intervalSeconds;
    	      this.path = defaults.path;
    	      this.successCodes = defaults.successCodes;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder healthyThreshold(@Nullable Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        public Builder intervalSeconds(@Nullable Integer intervalSeconds) {
            this.intervalSeconds = intervalSeconds;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder successCodes(@Nullable String successCodes) {
            this.successCodes = successCodes;
            return this;
        }

        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public Builder unhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public ContainerHealthCheckConfig build() {
            return new ContainerHealthCheckConfig(healthyThreshold, intervalSeconds, path, successCodes, timeoutSeconds, unhealthyThreshold);
        }
    }
}
