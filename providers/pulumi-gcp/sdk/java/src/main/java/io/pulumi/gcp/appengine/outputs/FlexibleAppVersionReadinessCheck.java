// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlexibleAppVersionReadinessCheck {
    /**
     * A maximum time limit on application initialization, measured from moment the application successfully
     * replies to a healthcheck until it is ready to serve traffic. Default: "300s"
     * 
     */
    private final @Nullable String appStartTimeout;
    /**
     * Interval between health checks.
     * 
     */
    private final @Nullable String checkInterval;
    /**
     * Number of consecutive failed checks required before considering the VM unhealthy. Default: 4.
     * 
     */
    private final @Nullable Double failureThreshold;
    /**
     * Host header to send when performing a HTTP Readiness check. Example: "myapp.appspot.com"
     * 
     */
    private final @Nullable String host;
    /**
     * Path to the static files matched by the URL pattern, from the application root directory.
     * The path can refer to text matched in groupings in the URL pattern.
     * 
     */
    private final String path;
    /**
     * Number of consecutive successful checks required before considering the VM healthy. Default: 2.
     * 
     */
    private final @Nullable Double successThreshold;
    /**
     * Time before the check is considered failed. Default: "4s"
     * 
     */
    private final @Nullable String timeout;

    @CustomType.Constructor
    private FlexibleAppVersionReadinessCheck(
        @CustomType.Parameter("appStartTimeout") @Nullable String appStartTimeout,
        @CustomType.Parameter("checkInterval") @Nullable String checkInterval,
        @CustomType.Parameter("failureThreshold") @Nullable Double failureThreshold,
        @CustomType.Parameter("host") @Nullable String host,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("successThreshold") @Nullable Double successThreshold,
        @CustomType.Parameter("timeout") @Nullable String timeout) {
        this.appStartTimeout = appStartTimeout;
        this.checkInterval = checkInterval;
        this.failureThreshold = failureThreshold;
        this.host = host;
        this.path = path;
        this.successThreshold = successThreshold;
        this.timeout = timeout;
    }

    /**
     * A maximum time limit on application initialization, measured from moment the application successfully
     * replies to a healthcheck until it is ready to serve traffic. Default: "300s"
     * 
    */
    public Optional<String> getAppStartTimeout() {
        return Optional.ofNullable(this.appStartTimeout);
    }
    /**
     * Interval between health checks.
     * 
    */
    public Optional<String> getCheckInterval() {
        return Optional.ofNullable(this.checkInterval);
    }
    /**
     * Number of consecutive failed checks required before considering the VM unhealthy. Default: 4.
     * 
    */
    public Optional<Double> getFailureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }
    /**
     * Host header to send when performing a HTTP Readiness check. Example: "myapp.appspot.com"
     * 
    */
    public Optional<String> getHost() {
        return Optional.ofNullable(this.host);
    }
    /**
     * Path to the static files matched by the URL pattern, from the application root directory.
     * The path can refer to text matched in groupings in the URL pattern.
     * 
    */
    public String getPath() {
        return this.path;
    }
    /**
     * Number of consecutive successful checks required before considering the VM healthy. Default: 2.
     * 
    */
    public Optional<Double> getSuccessThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }
    /**
     * Time before the check is considered failed. Default: "4s"
     * 
    */
    public Optional<String> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionReadinessCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appStartTimeout;
        private @Nullable String checkInterval;
        private @Nullable Double failureThreshold;
        private @Nullable String host;
        private String path;
        private @Nullable Double successThreshold;
        private @Nullable String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionReadinessCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appStartTimeout = defaults.appStartTimeout;
    	      this.checkInterval = defaults.checkInterval;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeout = defaults.timeout;
        }

        public Builder appStartTimeout(@Nullable String appStartTimeout) {
            this.appStartTimeout = appStartTimeout;
            return this;
        }

        public Builder checkInterval(@Nullable String checkInterval) {
            this.checkInterval = checkInterval;
            return this;
        }

        public Builder failureThreshold(@Nullable Double failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        public Builder host(@Nullable String host) {
            this.host = host;
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder successThreshold(@Nullable Double successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }

        public Builder timeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }
        public FlexibleAppVersionReadinessCheck build() {
            return new FlexibleAppVersionReadinessCheck(appStartTimeout, checkInterval, failureThreshold, host, path, successThreshold, timeout);
        }
    }
}
