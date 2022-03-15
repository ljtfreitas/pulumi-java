// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.RouteSpecHttp2RouteRetryPolicyPerRetryTimeout;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RouteSpecHttp2RouteRetryPolicy {
    /**
     * List of HTTP retry events.
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * 
     */
    private final @Nullable List<String> httpRetryEvents;
    /**
     * The maximum number of retries.
     * 
     */
    private final Integer maxRetries;
    /**
     * The per-retry timeout.
     * 
     */
    private final RouteSpecHttp2RouteRetryPolicyPerRetryTimeout perRetryTimeout;
    /**
     * List of TCP retry events. The only valid value is `connection-error`.
     * 
     */
    private final @Nullable List<String> tcpRetryEvents;

    @CustomType.Constructor
    private RouteSpecHttp2RouteRetryPolicy(
        @CustomType.Parameter("httpRetryEvents") @Nullable List<String> httpRetryEvents,
        @CustomType.Parameter("maxRetries") Integer maxRetries,
        @CustomType.Parameter("perRetryTimeout") RouteSpecHttp2RouteRetryPolicyPerRetryTimeout perRetryTimeout,
        @CustomType.Parameter("tcpRetryEvents") @Nullable List<String> tcpRetryEvents) {
        this.httpRetryEvents = httpRetryEvents;
        this.maxRetries = maxRetries;
        this.perRetryTimeout = perRetryTimeout;
        this.tcpRetryEvents = tcpRetryEvents;
    }

    /**
     * List of HTTP retry events.
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * 
    */
    public List<String> getHttpRetryEvents() {
        return this.httpRetryEvents == null ? List.of() : this.httpRetryEvents;
    }
    /**
     * The maximum number of retries.
     * 
    */
    public Integer getMaxRetries() {
        return this.maxRetries;
    }
    /**
     * The per-retry timeout.
     * 
    */
    public RouteSpecHttp2RouteRetryPolicyPerRetryTimeout getPerRetryTimeout() {
        return this.perRetryTimeout;
    }
    /**
     * List of TCP retry events. The only valid value is `connection-error`.
     * 
    */
    public List<String> getTcpRetryEvents() {
        return this.tcpRetryEvents == null ? List.of() : this.tcpRetryEvents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttp2RouteRetryPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> httpRetryEvents;
        private Integer maxRetries;
        private RouteSpecHttp2RouteRetryPolicyPerRetryTimeout perRetryTimeout;
        private @Nullable List<String> tcpRetryEvents;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttp2RouteRetryPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpRetryEvents = defaults.httpRetryEvents;
    	      this.maxRetries = defaults.maxRetries;
    	      this.perRetryTimeout = defaults.perRetryTimeout;
    	      this.tcpRetryEvents = defaults.tcpRetryEvents;
        }

        public Builder httpRetryEvents(@Nullable List<String> httpRetryEvents) {
            this.httpRetryEvents = httpRetryEvents;
            return this;
        }

        public Builder maxRetries(Integer maxRetries) {
            this.maxRetries = Objects.requireNonNull(maxRetries);
            return this;
        }

        public Builder perRetryTimeout(RouteSpecHttp2RouteRetryPolicyPerRetryTimeout perRetryTimeout) {
            this.perRetryTimeout = Objects.requireNonNull(perRetryTimeout);
            return this;
        }

        public Builder tcpRetryEvents(@Nullable List<String> tcpRetryEvents) {
            this.tcpRetryEvents = tcpRetryEvents;
            return this;
        }
        public RouteSpecHttp2RouteRetryPolicy build() {
            return new RouteSpecHttp2RouteRetryPolicy(httpRetryEvents, maxRetries, perRetryTimeout, tcpRetryEvents);
        }
    }
}
