// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecListenerHealthCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerHealthCheckArgs Empty = new VirtualGatewaySpecListenerHealthCheckArgs();

    /**
     * The number of consecutive successful health checks that must occur before declaring listener healthy.
     * 
     */
    @InputImport(name="healthyThreshold", required=true)
    private final Input<Integer> healthyThreshold;

    public Input<Integer> getHealthyThreshold() {
        return this.healthyThreshold;
    }

    /**
     * The time period in milliseconds between each health check execution.
     * 
     */
    @InputImport(name="intervalMillis", required=true)
    private final Input<Integer> intervalMillis;

    public Input<Integer> getIntervalMillis() {
        return this.intervalMillis;
    }

    /**
     * The destination path for the health check request. This is only required if the specified protocol is `http` or `http2`.
     * 
     */
    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * The destination port for the health check request. This port must match the port defined in the `port_mapping` for the listener.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * The protocol for the health check request. Valid values are `http`, `http2`, and `grpc`.
     * 
     */
    @InputImport(name="protocol", required=true)
    private final Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol;
    }

    /**
     * The amount of time to wait when receiving a response from the health check, in milliseconds.
     * 
     */
    @InputImport(name="timeoutMillis", required=true)
    private final Input<Integer> timeoutMillis;

    public Input<Integer> getTimeoutMillis() {
        return this.timeoutMillis;
    }

    /**
     * The number of consecutive failed health checks that must occur before declaring a virtual gateway unhealthy.
     * 
     */
    @InputImport(name="unhealthyThreshold", required=true)
    private final Input<Integer> unhealthyThreshold;

    public Input<Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public VirtualGatewaySpecListenerHealthCheckArgs(
        Input<Integer> healthyThreshold,
        Input<Integer> intervalMillis,
        @Nullable Input<String> path,
        @Nullable Input<Integer> port,
        Input<String> protocol,
        Input<Integer> timeoutMillis,
        Input<Integer> unhealthyThreshold) {
        this.healthyThreshold = Objects.requireNonNull(healthyThreshold, "expected parameter 'healthyThreshold' to be non-null");
        this.intervalMillis = Objects.requireNonNull(intervalMillis, "expected parameter 'intervalMillis' to be non-null");
        this.path = path;
        this.port = port;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.timeoutMillis = Objects.requireNonNull(timeoutMillis, "expected parameter 'timeoutMillis' to be non-null");
        this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold, "expected parameter 'unhealthyThreshold' to be non-null");
    }

    private VirtualGatewaySpecListenerHealthCheckArgs() {
        this.healthyThreshold = Input.empty();
        this.intervalMillis = Input.empty();
        this.path = Input.empty();
        this.port = Input.empty();
        this.protocol = Input.empty();
        this.timeoutMillis = Input.empty();
        this.unhealthyThreshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> healthyThreshold;
        private Input<Integer> intervalMillis;
        private @Nullable Input<String> path;
        private @Nullable Input<Integer> port;
        private Input<String> protocol;
        private Input<Integer> timeoutMillis;
        private Input<Integer> unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerHealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.intervalMillis = defaults.intervalMillis;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.timeoutMillis = defaults.timeoutMillis;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder setHealthyThreshold(Input<Integer> healthyThreshold) {
            this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
            return this;
        }

        public Builder setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = Input.of(Objects.requireNonNull(healthyThreshold));
            return this;
        }

        public Builder setIntervalMillis(Input<Integer> intervalMillis) {
            this.intervalMillis = Objects.requireNonNull(intervalMillis);
            return this;
        }

        public Builder setIntervalMillis(Integer intervalMillis) {
            this.intervalMillis = Input.of(Objects.requireNonNull(intervalMillis));
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setProtocol(Input<String> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Input.of(Objects.requireNonNull(protocol));
            return this;
        }

        public Builder setTimeoutMillis(Input<Integer> timeoutMillis) {
            this.timeoutMillis = Objects.requireNonNull(timeoutMillis);
            return this;
        }

        public Builder setTimeoutMillis(Integer timeoutMillis) {
            this.timeoutMillis = Input.of(Objects.requireNonNull(timeoutMillis));
            return this;
        }

        public Builder setUnhealthyThreshold(Input<Integer> unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }

        public Builder setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Input.of(Objects.requireNonNull(unhealthyThreshold));
            return this;
        }
        public VirtualGatewaySpecListenerHealthCheckArgs build() {
            return new VirtualGatewaySpecListenerHealthCheckArgs(healthyThreshold, intervalMillis, path, port, protocol, timeoutMillis, unhealthyThreshold);
        }
    }
}
