// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionReadinessCheckGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionReadinessCheckGetArgs Empty = new FlexibleAppVersionReadinessCheckGetArgs();

    /**
     * A maximum time limit on application initialization, measured from moment the application successfully
     * replies to a healthcheck until it is ready to serve traffic. Default: "300s"
     * 
     */
    @InputImport(name="appStartTimeout")
        private final @Nullable Input<String> appStartTimeout;

    public Input<String> getAppStartTimeout() {
        return this.appStartTimeout == null ? Input.empty() : this.appStartTimeout;
    }

    /**
     * Interval between health checks.
     * 
     */
    @InputImport(name="checkInterval")
        private final @Nullable Input<String> checkInterval;

    public Input<String> getCheckInterval() {
        return this.checkInterval == null ? Input.empty() : this.checkInterval;
    }

    /**
     * Number of consecutive failed checks required before considering the VM unhealthy. Default: 4.
     * 
     */
    @InputImport(name="failureThreshold")
        private final @Nullable Input<Double> failureThreshold;

    public Input<Double> getFailureThreshold() {
        return this.failureThreshold == null ? Input.empty() : this.failureThreshold;
    }

    /**
     * Host header to send when performing a HTTP Readiness check. Example: "myapp.appspot.com"
     * 
     */
    @InputImport(name="host")
        private final @Nullable Input<String> host;

    public Input<String> getHost() {
        return this.host == null ? Input.empty() : this.host;
    }

    /**
     * Path to the static files matched by the URL pattern, from the application root directory.
     * The path can refer to text matched in groupings in the URL pattern.
     * 
     */
    @InputImport(name="path", required=true)
        private final Input<String> path;

    public Input<String> getPath() {
        return this.path;
    }

    /**
     * Number of consecutive successful checks required before considering the VM healthy. Default: 2.
     * 
     */
    @InputImport(name="successThreshold")
        private final @Nullable Input<Double> successThreshold;

    public Input<Double> getSuccessThreshold() {
        return this.successThreshold == null ? Input.empty() : this.successThreshold;
    }

    /**
     * Time before the check is considered failed. Default: "4s"
     * 
     */
    @InputImport(name="timeout")
        private final @Nullable Input<String> timeout;

    public Input<String> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    public FlexibleAppVersionReadinessCheckGetArgs(
        @Nullable Input<String> appStartTimeout,
        @Nullable Input<String> checkInterval,
        @Nullable Input<Double> failureThreshold,
        @Nullable Input<String> host,
        Input<String> path,
        @Nullable Input<Double> successThreshold,
        @Nullable Input<String> timeout) {
        this.appStartTimeout = appStartTimeout;
        this.checkInterval = checkInterval;
        this.failureThreshold = failureThreshold;
        this.host = host;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.successThreshold = successThreshold;
        this.timeout = timeout;
    }

    private FlexibleAppVersionReadinessCheckGetArgs() {
        this.appStartTimeout = Input.empty();
        this.checkInterval = Input.empty();
        this.failureThreshold = Input.empty();
        this.host = Input.empty();
        this.path = Input.empty();
        this.successThreshold = Input.empty();
        this.timeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionReadinessCheckGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appStartTimeout;
        private @Nullable Input<String> checkInterval;
        private @Nullable Input<Double> failureThreshold;
        private @Nullable Input<String> host;
        private Input<String> path;
        private @Nullable Input<Double> successThreshold;
        private @Nullable Input<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionReadinessCheckGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appStartTimeout = defaults.appStartTimeout;
    	      this.checkInterval = defaults.checkInterval;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeout = defaults.timeout;
        }

        public Builder setAppStartTimeout(@Nullable Input<String> appStartTimeout) {
            this.appStartTimeout = appStartTimeout;
            return this;
        }

        public Builder setAppStartTimeout(@Nullable String appStartTimeout) {
            this.appStartTimeout = Input.ofNullable(appStartTimeout);
            return this;
        }

        public Builder setCheckInterval(@Nullable Input<String> checkInterval) {
            this.checkInterval = checkInterval;
            return this;
        }

        public Builder setCheckInterval(@Nullable String checkInterval) {
            this.checkInterval = Input.ofNullable(checkInterval);
            return this;
        }

        public Builder setFailureThreshold(@Nullable Input<Double> failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        public Builder setFailureThreshold(@Nullable Double failureThreshold) {
            this.failureThreshold = Input.ofNullable(failureThreshold);
            return this;
        }

        public Builder setHost(@Nullable Input<String> host) {
            this.host = host;
            return this;
        }

        public Builder setHost(@Nullable String host) {
            this.host = Input.ofNullable(host);
            return this;
        }

        public Builder setPath(Input<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Input.of(Objects.requireNonNull(path));
            return this;
        }

        public Builder setSuccessThreshold(@Nullable Input<Double> successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }

        public Builder setSuccessThreshold(@Nullable Double successThreshold) {
            this.successThreshold = Input.ofNullable(successThreshold);
            return this;
        }

        public Builder setTimeout(@Nullable Input<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }
        public FlexibleAppVersionReadinessCheckGetArgs build() {
            return new FlexibleAppVersionReadinessCheckGetArgs(appStartTimeout, checkInterval, failureThreshold, host, path, successThreshold, timeout);
        }
    }
}
