// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualGatewaySpecListenerHealthCheck {
    /**
     * The number of consecutive successful health checks that must occur before declaring listener healthy.
     * 
     */
    private final Integer healthyThreshold;
    /**
     * The time period in milliseconds between each health check execution.
     * 
     */
    private final Integer intervalMillis;
    /**
     * The destination path for the health check request. This is only required if the specified protocol is `http` or `http2`.
     * 
     */
    private final @Nullable String path;
    /**
     * The destination port for the health check request. This port must match the port defined in the `port_mapping` for the listener.
     * 
     */
    private final @Nullable Integer port;
    /**
     * The protocol for the health check request. Valid values are `http`, `http2`, and `grpc`.
     * 
     */
    private final String protocol;
    /**
     * The amount of time to wait when receiving a response from the health check, in milliseconds.
     * 
     */
    private final Integer timeoutMillis;
    /**
     * The number of consecutive failed health checks that must occur before declaring a virtual gateway unhealthy.
     * 
     */
    private final Integer unhealthyThreshold;

    @OutputCustomType.Constructor({"healthyThreshold","intervalMillis","path","port","protocol","timeoutMillis","unhealthyThreshold"})
    private VirtualGatewaySpecListenerHealthCheck(
        Integer healthyThreshold,
        Integer intervalMillis,
        @Nullable String path,
        @Nullable Integer port,
        String protocol,
        Integer timeoutMillis,
        Integer unhealthyThreshold) {
        this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
        this.intervalMillis = Objects.requireNonNull(intervalMillis);
        this.path = path;
        this.port = port;
        this.protocol = Objects.requireNonNull(protocol);
        this.timeoutMillis = Objects.requireNonNull(timeoutMillis);
        this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
    }

    /**
     * The number of consecutive successful health checks that must occur before declaring listener healthy.
     * 
     */
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }
    /**
     * The time period in milliseconds between each health check execution.
     * 
     */
    public Integer getIntervalMillis() {
        return this.intervalMillis;
    }
    /**
     * The destination path for the health check request. This is only required if the specified protocol is `http` or `http2`.
     * 
     */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * The destination port for the health check request. This port must match the port defined in the `port_mapping` for the listener.
     * 
     */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * The protocol for the health check request. Valid values are `http`, `http2`, and `grpc`.
     * 
     */
    public String getProtocol() {
        return this.protocol;
    }
    /**
     * The amount of time to wait when receiving a response from the health check, in milliseconds.
     * 
     */
    public Integer getTimeoutMillis() {
        return this.timeoutMillis;
    }
    /**
     * The number of consecutive failed health checks that must occur before declaring a virtual gateway unhealthy.
     * 
     */
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerHealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer healthyThreshold;
        private Integer intervalMillis;
        private @Nullable String path;
        private @Nullable Integer port;
        private String protocol;
        private Integer timeoutMillis;
        private Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.intervalMillis = defaults.intervalMillis;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.timeoutMillis = defaults.timeoutMillis;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
            return this;
        }

        public Builder setIntervalMillis(Integer intervalMillis) {
            this.intervalMillis = Objects.requireNonNull(intervalMillis);
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setTimeoutMillis(Integer timeoutMillis) {
            this.timeoutMillis = Objects.requireNonNull(timeoutMillis);
            return this;
        }

        public Builder setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }
        public VirtualGatewaySpecListenerHealthCheck build() {
            return new VirtualGatewaySpecListenerHealthCheck(healthyThreshold, intervalMillis, path, port, protocol, timeoutMillis, unhealthyThreshold);
        }
    }
}
