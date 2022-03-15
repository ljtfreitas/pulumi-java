// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Readiness checking configuration for VM instances. Unhealthy instances are removed from traffic rotation.
 * 
 */
public final class ReadinessCheckResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReadinessCheckResponse Empty = new ReadinessCheckResponse();

    /**
     * A maximum time limit on application initialization, measured from moment the application successfully replies to a healthcheck until it is ready to serve traffic.
     * 
     */
    @Import(name="appStartTimeout", required=true)
      private final String appStartTimeout;

    public String getAppStartTimeout() {
        return this.appStartTimeout;
    }

    /**
     * Interval between health checks.
     * 
     */
    @Import(name="checkInterval", required=true)
      private final String checkInterval;

    public String getCheckInterval() {
        return this.checkInterval;
    }

    /**
     * Number of consecutive failed checks required before removing traffic.
     * 
     */
    @Import(name="failureThreshold", required=true)
      private final Integer failureThreshold;

    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    /**
     * Host header to send when performing a HTTP Readiness check. Example: "myapp.appspot.com"
     * 
     */
    @Import(name="host", required=true)
      private final String host;

    public String getHost() {
        return this.host;
    }

    /**
     * The request path.
     * 
     */
    @Import(name="path", required=true)
      private final String path;

    public String getPath() {
        return this.path;
    }

    /**
     * Number of consecutive successful checks required before receiving traffic.
     * 
     */
    @Import(name="successThreshold", required=true)
      private final Integer successThreshold;

    public Integer getSuccessThreshold() {
        return this.successThreshold;
    }

    /**
     * Time before the check is considered failed.
     * 
     */
    @Import(name="timeout", required=true)
      private final String timeout;

    public String getTimeout() {
        return this.timeout;
    }

    public ReadinessCheckResponse(
        String appStartTimeout,
        String checkInterval,
        Integer failureThreshold,
        String host,
        String path,
        Integer successThreshold,
        String timeout) {
        this.appStartTimeout = Objects.requireNonNull(appStartTimeout, "expected parameter 'appStartTimeout' to be non-null");
        this.checkInterval = Objects.requireNonNull(checkInterval, "expected parameter 'checkInterval' to be non-null");
        this.failureThreshold = Objects.requireNonNull(failureThreshold, "expected parameter 'failureThreshold' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.successThreshold = Objects.requireNonNull(successThreshold, "expected parameter 'successThreshold' to be non-null");
        this.timeout = Objects.requireNonNull(timeout, "expected parameter 'timeout' to be non-null");
    }

    private ReadinessCheckResponse() {
        this.appStartTimeout = null;
        this.checkInterval = null;
        this.failureThreshold = null;
        this.host = null;
        this.path = null;
        this.successThreshold = null;
        this.timeout = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReadinessCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appStartTimeout;
        private String checkInterval;
        private Integer failureThreshold;
        private String host;
        private String path;
        private Integer successThreshold;
        private String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ReadinessCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appStartTimeout = defaults.appStartTimeout;
    	      this.checkInterval = defaults.checkInterval;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeout = defaults.timeout;
        }

        public Builder appStartTimeout(String appStartTimeout) {
            this.appStartTimeout = Objects.requireNonNull(appStartTimeout);
            return this;
        }

        public Builder checkInterval(String checkInterval) {
            this.checkInterval = Objects.requireNonNull(checkInterval);
            return this;
        }

        public Builder failureThreshold(Integer failureThreshold) {
            this.failureThreshold = Objects.requireNonNull(failureThreshold);
            return this;
        }

        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder successThreshold(Integer successThreshold) {
            this.successThreshold = Objects.requireNonNull(successThreshold);
            return this;
        }

        public Builder timeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        public ReadinessCheckResponse build() {
            return new ReadinessCheckResponse(appStartTimeout, checkInterval, failureThreshold, host, path, successThreshold, timeout);
        }
    }
}
