// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HealthCheckGrpcHealthCheck {
    /**
     * The gRPC service name for the health check.
     * The value of grpcServiceName has the following meanings by convention:
     * - Empty serviceName means the overall status of all services at the backend.
     * - Non-empty serviceName means the health of that gRPC service, as defined by the owner of the service.
     *   The grpcServiceName can only be ASCII.
     * 
     */
    private final @Nullable String grpcServiceName;
    /**
     * The port number for the health check request.
     * Must be specified if portName and portSpecification are not set
     * or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
     * 
     */
    private final @Nullable Integer port;
    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and
     * port_name are defined, port takes precedence.
     * 
     */
    private final @Nullable String portName;
    /**
     * Specifies how port is selected for health checking, can be one of the
     * following values:
     * * `USE_FIXED_PORT`: The port number in `port` is used for health checking.
     * * `USE_NAMED_PORT`: The `portName` is used for health checking.
     * * `USE_SERVING_PORT`: For NetworkEndpointGroup, the port specified for each
     *   network endpoint is used for health checking. For other backends, the
     *   port or named port specified in the Backend Service is used for health
     *   checking.
     *   If not specified, gRPC health check follows behavior specified in `port` and
     *   `portName` fields.
     *   Possible values are `USE_FIXED_PORT`, `USE_NAMED_PORT`, and `USE_SERVING_PORT`.
     * 
     */
    private final @Nullable String portSpecification;

    @OutputCustomType.Constructor({"grpcServiceName","port","portName","portSpecification"})
    private HealthCheckGrpcHealthCheck(
        @Nullable String grpcServiceName,
        @Nullable Integer port,
        @Nullable String portName,
        @Nullable String portSpecification) {
        this.grpcServiceName = grpcServiceName;
        this.port = port;
        this.portName = portName;
        this.portSpecification = portSpecification;
    }

    /**
     * The gRPC service name for the health check.
     * The value of grpcServiceName has the following meanings by convention:
     * - Empty serviceName means the overall status of all services at the backend.
     * - Non-empty serviceName means the health of that gRPC service, as defined by the owner of the service.
     *   The grpcServiceName can only be ASCII.
     * 
     */
    public Optional<String> getGrpcServiceName() {
        return Optional.ofNullable(this.grpcServiceName);
    }
    /**
     * The port number for the health check request.
     * Must be specified if portName and portSpecification are not set
     * or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
     * 
     */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and
     * port_name are defined, port takes precedence.
     * 
     */
    public Optional<String> getPortName() {
        return Optional.ofNullable(this.portName);
    }
    /**
     * Specifies how port is selected for health checking, can be one of the
     * following values:
     * * `USE_FIXED_PORT`: The port number in `port` is used for health checking.
     * * `USE_NAMED_PORT`: The `portName` is used for health checking.
     * * `USE_SERVING_PORT`: For NetworkEndpointGroup, the port specified for each
     *   network endpoint is used for health checking. For other backends, the
     *   port or named port specified in the Backend Service is used for health
     *   checking.
     *   If not specified, gRPC health check follows behavior specified in `port` and
     *   `portName` fields.
     *   Possible values are `USE_FIXED_PORT`, `USE_NAMED_PORT`, and `USE_SERVING_PORT`.
     * 
     */
    public Optional<String> getPortSpecification() {
        return Optional.ofNullable(this.portSpecification);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckGrpcHealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String grpcServiceName;
        private @Nullable Integer port;
        private @Nullable String portName;
        private @Nullable String portSpecification;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckGrpcHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpcServiceName = defaults.grpcServiceName;
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
        }

        public Builder setGrpcServiceName(@Nullable String grpcServiceName) {
            this.grpcServiceName = grpcServiceName;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setPortName(@Nullable String portName) {
            this.portName = portName;
            return this;
        }

        public Builder setPortSpecification(@Nullable String portSpecification) {
            this.portSpecification = portSpecification;
            return this;
        }
        public HealthCheckGrpcHealthCheck build() {
            return new HealthCheckGrpcHealthCheck(grpcServiceName, port, portName, portSpecification);
        }
    }
}
