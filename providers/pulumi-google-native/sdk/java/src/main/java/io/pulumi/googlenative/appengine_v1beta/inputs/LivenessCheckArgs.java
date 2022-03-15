// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Health checking configuration for VM instances. Unhealthy instances are killed and replaced with new instances.
 * 
 */
public final class LivenessCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final LivenessCheckArgs Empty = new LivenessCheckArgs();

    /**
     * Interval between health checks.
     * 
     */
    @Import(name="checkInterval")
      private final @Nullable Output<String> checkInterval;

    public Output<String> getCheckInterval() {
        return this.checkInterval == null ? Output.empty() : this.checkInterval;
    }

    /**
     * Number of consecutive failed checks required before considering the VM unhealthy.
     * 
     */
    @Import(name="failureThreshold")
      private final @Nullable Output<Integer> failureThreshold;

    public Output<Integer> getFailureThreshold() {
        return this.failureThreshold == null ? Output.empty() : this.failureThreshold;
    }

    /**
     * Host header to send when performing a HTTP Liveness check. Example: "myapp.appspot.com"
     * 
     */
    @Import(name="host")
      private final @Nullable Output<String> host;

    public Output<String> getHost() {
        return this.host == null ? Output.empty() : this.host;
    }

    /**
     * The initial delay before starting to execute the checks.
     * 
     */
    @Import(name="initialDelay")
      private final @Nullable Output<String> initialDelay;

    public Output<String> getInitialDelay() {
        return this.initialDelay == null ? Output.empty() : this.initialDelay;
    }

    /**
     * The request path.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Output.empty() : this.path;
    }

    /**
     * Number of consecutive successful checks required before considering the VM healthy.
     * 
     */
    @Import(name="successThreshold")
      private final @Nullable Output<Integer> successThreshold;

    public Output<Integer> getSuccessThreshold() {
        return this.successThreshold == null ? Output.empty() : this.successThreshold;
    }

    /**
     * Time before the check is considered failed.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<String> timeout;

    public Output<String> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    public LivenessCheckArgs(
        @Nullable Output<String> checkInterval,
        @Nullable Output<Integer> failureThreshold,
        @Nullable Output<String> host,
        @Nullable Output<String> initialDelay,
        @Nullable Output<String> path,
        @Nullable Output<Integer> successThreshold,
        @Nullable Output<String> timeout) {
        this.checkInterval = checkInterval;
        this.failureThreshold = failureThreshold;
        this.host = host;
        this.initialDelay = initialDelay;
        this.path = path;
        this.successThreshold = successThreshold;
        this.timeout = timeout;
    }

    private LivenessCheckArgs() {
        this.checkInterval = Output.empty();
        this.failureThreshold = Output.empty();
        this.host = Output.empty();
        this.initialDelay = Output.empty();
        this.path = Output.empty();
        this.successThreshold = Output.empty();
        this.timeout = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LivenessCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> checkInterval;
        private @Nullable Output<Integer> failureThreshold;
        private @Nullable Output<String> host;
        private @Nullable Output<String> initialDelay;
        private @Nullable Output<String> path;
        private @Nullable Output<Integer> successThreshold;
        private @Nullable Output<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(LivenessCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkInterval = defaults.checkInterval;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.host = defaults.host;
    	      this.initialDelay = defaults.initialDelay;
    	      this.path = defaults.path;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeout = defaults.timeout;
        }

        public Builder checkInterval(@Nullable Output<String> checkInterval) {
            this.checkInterval = checkInterval;
            return this;
        }

        public Builder checkInterval(@Nullable String checkInterval) {
            this.checkInterval = Output.ofNullable(checkInterval);
            return this;
        }

        public Builder failureThreshold(@Nullable Output<Integer> failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        public Builder failureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = Output.ofNullable(failureThreshold);
            return this;
        }

        public Builder host(@Nullable Output<String> host) {
            this.host = host;
            return this;
        }

        public Builder host(@Nullable String host) {
            this.host = Output.ofNullable(host);
            return this;
        }

        public Builder initialDelay(@Nullable Output<String> initialDelay) {
            this.initialDelay = initialDelay;
            return this;
        }

        public Builder initialDelay(@Nullable String initialDelay) {
            this.initialDelay = Output.ofNullable(initialDelay);
            return this;
        }

        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = Output.ofNullable(path);
            return this;
        }

        public Builder successThreshold(@Nullable Output<Integer> successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }

        public Builder successThreshold(@Nullable Integer successThreshold) {
            this.successThreshold = Output.ofNullable(successThreshold);
            return this;
        }

        public Builder timeout(@Nullable Output<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder timeout(@Nullable String timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }
        public LivenessCheckArgs build() {
            return new LivenessCheckArgs(checkInterval, failureThreshold, host, initialDelay, path, successThreshold, timeout);
        }
    }
}
