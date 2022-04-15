// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionReadinessCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionReadinessCheckArgs Empty = new FlexibleAppVersionReadinessCheckArgs();

    /**
     * A maximum time limit on application initialization, measured from moment the application successfully
     * replies to a healthcheck until it is ready to serve traffic. Default: "300s"
     * 
     */
    @Import(name="appStartTimeout")
      private final @Nullable Output<String> appStartTimeout;

    public Output<String> appStartTimeout() {
        return this.appStartTimeout == null ? Codegen.empty() : this.appStartTimeout;
    }

    /**
     * Interval between health checks.
     * 
     */
    @Import(name="checkInterval")
      private final @Nullable Output<String> checkInterval;

    public Output<String> checkInterval() {
        return this.checkInterval == null ? Codegen.empty() : this.checkInterval;
    }

    /**
     * Number of consecutive failed checks required before considering the VM unhealthy. Default: 4.
     * 
     */
    @Import(name="failureThreshold")
      private final @Nullable Output<Double> failureThreshold;

    public Output<Double> failureThreshold() {
        return this.failureThreshold == null ? Codegen.empty() : this.failureThreshold;
    }

    /**
     * Host header to send when performing a HTTP Readiness check. Example: "myapp.appspot.com"
     * 
     */
    @Import(name="host")
      private final @Nullable Output<String> host;

    public Output<String> host() {
        return this.host == null ? Codegen.empty() : this.host;
    }

    /**
     * Path to the static files matched by the URL pattern, from the application root directory.
     * The path can refer to text matched in groupings in the URL pattern.
     * 
     */
    @Import(name="path", required=true)
      private final Output<String> path;

    public Output<String> path() {
        return this.path;
    }

    /**
     * Number of consecutive successful checks required before considering the VM healthy. Default: 2.
     * 
     */
    @Import(name="successThreshold")
      private final @Nullable Output<Double> successThreshold;

    public Output<Double> successThreshold() {
        return this.successThreshold == null ? Codegen.empty() : this.successThreshold;
    }

    /**
     * Time before the check is considered failed. Default: "4s"
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<String> timeout;

    public Output<String> timeout() {
        return this.timeout == null ? Codegen.empty() : this.timeout;
    }

    public FlexibleAppVersionReadinessCheckArgs(
        @Nullable Output<String> appStartTimeout,
        @Nullable Output<String> checkInterval,
        @Nullable Output<Double> failureThreshold,
        @Nullable Output<String> host,
        Output<String> path,
        @Nullable Output<Double> successThreshold,
        @Nullable Output<String> timeout) {
        this.appStartTimeout = appStartTimeout;
        this.checkInterval = checkInterval;
        this.failureThreshold = failureThreshold;
        this.host = host;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.successThreshold = successThreshold;
        this.timeout = timeout;
    }

    private FlexibleAppVersionReadinessCheckArgs() {
        this.appStartTimeout = Codegen.empty();
        this.checkInterval = Codegen.empty();
        this.failureThreshold = Codegen.empty();
        this.host = Codegen.empty();
        this.path = Codegen.empty();
        this.successThreshold = Codegen.empty();
        this.timeout = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionReadinessCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> appStartTimeout;
        private @Nullable Output<String> checkInterval;
        private @Nullable Output<Double> failureThreshold;
        private @Nullable Output<String> host;
        private Output<String> path;
        private @Nullable Output<Double> successThreshold;
        private @Nullable Output<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionReadinessCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appStartTimeout = defaults.appStartTimeout;
    	      this.checkInterval = defaults.checkInterval;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeout = defaults.timeout;
        }

        public Builder appStartTimeout(@Nullable Output<String> appStartTimeout) {
            this.appStartTimeout = appStartTimeout;
            return this;
        }
        public Builder appStartTimeout(@Nullable String appStartTimeout) {
            this.appStartTimeout = Codegen.ofNullable(appStartTimeout);
            return this;
        }
        public Builder checkInterval(@Nullable Output<String> checkInterval) {
            this.checkInterval = checkInterval;
            return this;
        }
        public Builder checkInterval(@Nullable String checkInterval) {
            this.checkInterval = Codegen.ofNullable(checkInterval);
            return this;
        }
        public Builder failureThreshold(@Nullable Output<Double> failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Builder failureThreshold(@Nullable Double failureThreshold) {
            this.failureThreshold = Codegen.ofNullable(failureThreshold);
            return this;
        }
        public Builder host(@Nullable Output<String> host) {
            this.host = host;
            return this;
        }
        public Builder host(@Nullable String host) {
            this.host = Codegen.ofNullable(host);
            return this;
        }
        public Builder path(Output<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder path(String path) {
            this.path = Output.of(Objects.requireNonNull(path));
            return this;
        }
        public Builder successThreshold(@Nullable Output<Double> successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Builder successThreshold(@Nullable Double successThreshold) {
            this.successThreshold = Codegen.ofNullable(successThreshold);
            return this;
        }
        public Builder timeout(@Nullable Output<String> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable String timeout) {
            this.timeout = Codegen.ofNullable(timeout);
            return this;
        }        public FlexibleAppVersionReadinessCheckArgs build() {
            return new FlexibleAppVersionReadinessCheckArgs(appStartTimeout, checkInterval, failureThreshold, host, path, successThreshold, timeout);
        }
    }
}
