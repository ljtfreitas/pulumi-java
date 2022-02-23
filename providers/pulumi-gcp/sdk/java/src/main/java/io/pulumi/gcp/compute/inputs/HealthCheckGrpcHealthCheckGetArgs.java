// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HealthCheckGrpcHealthCheckGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final HealthCheckGrpcHealthCheckGetArgs Empty = new HealthCheckGrpcHealthCheckGetArgs();

    /**
     * The gRPC service name for the health check.
     * The value of grpcServiceName has the following meanings by convention:
     * - Empty serviceName means the overall status of all services at the backend.
     * - Non-empty serviceName means the health of that gRPC service, as defined by the owner of the service.
     *   The grpcServiceName can only be ASCII.
     * 
     */
    @InputImport(name="grpcServiceName")
        private final @Nullable Input<String> grpcServiceName;

    public Input<String> getGrpcServiceName() {
        return this.grpcServiceName == null ? Input.empty() : this.grpcServiceName;
    }

    /**
     * The port number for the health check request.
     * Must be specified if portName and portSpecification are not set
     * or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
     * 
     */
    @InputImport(name="port")
        private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and
     * port_name are defined, port takes precedence.
     * 
     */
    @InputImport(name="portName")
        private final @Nullable Input<String> portName;

    public Input<String> getPortName() {
        return this.portName == null ? Input.empty() : this.portName;
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
    @InputImport(name="portSpecification")
        private final @Nullable Input<String> portSpecification;

    public Input<String> getPortSpecification() {
        return this.portSpecification == null ? Input.empty() : this.portSpecification;
    }

    public HealthCheckGrpcHealthCheckGetArgs(
        @Nullable Input<String> grpcServiceName,
        @Nullable Input<Integer> port,
        @Nullable Input<String> portName,
        @Nullable Input<String> portSpecification) {
        this.grpcServiceName = grpcServiceName;
        this.port = port;
        this.portName = portName;
        this.portSpecification = portSpecification;
    }

    private HealthCheckGrpcHealthCheckGetArgs() {
        this.grpcServiceName = Input.empty();
        this.port = Input.empty();
        this.portName = Input.empty();
        this.portSpecification = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckGrpcHealthCheckGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> grpcServiceName;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> portName;
        private @Nullable Input<String> portSpecification;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckGrpcHealthCheckGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpcServiceName = defaults.grpcServiceName;
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
        }

        public Builder setGrpcServiceName(@Nullable Input<String> grpcServiceName) {
            this.grpcServiceName = grpcServiceName;
            return this;
        }

        public Builder setGrpcServiceName(@Nullable String grpcServiceName) {
            this.grpcServiceName = Input.ofNullable(grpcServiceName);
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

        public Builder setPortName(@Nullable Input<String> portName) {
            this.portName = portName;
            return this;
        }

        public Builder setPortName(@Nullable String portName) {
            this.portName = Input.ofNullable(portName);
            return this;
        }

        public Builder setPortSpecification(@Nullable Input<String> portSpecification) {
            this.portSpecification = portSpecification;
            return this;
        }

        public Builder setPortSpecification(@Nullable String portSpecification) {
            this.portSpecification = Input.ofNullable(portSpecification);
            return this;
        }
        public HealthCheckGrpcHealthCheckGetArgs build() {
            return new HealthCheckGrpcHealthCheckGetArgs(grpcServiceName, port, portName, portSpecification);
        }
    }
}
