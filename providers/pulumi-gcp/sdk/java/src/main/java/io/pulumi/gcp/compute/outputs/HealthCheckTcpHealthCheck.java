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
public final class HealthCheckTcpHealthCheck {
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
    /**
     * Specifies the type of proxy header to append before sending data to the
     * backend.
     * Default value is `NONE`.
     * Possible values are `NONE` and `PROXY_V1`.
     * 
     */
    private final @Nullable String proxyHeader;
    /**
     * The application data to send once the SSL connection has been
     * established (default value is empty). If both request and response are
     * empty, the connection establishment alone will indicate health. The request
     * data can only be ASCII.
     * 
     */
    private final @Nullable String request;
    /**
     * The bytes to match against the beginning of the response data. If left empty
     * (the default value), any response will indicate health. The response data
     * can only be ASCII.
     * 
     */
    private final @Nullable String response;

    @OutputCustomType.Constructor({"port","portName","portSpecification","proxyHeader","request","response"})
    private HealthCheckTcpHealthCheck(
        @Nullable Integer port,
        @Nullable String portName,
        @Nullable String portSpecification,
        @Nullable String proxyHeader,
        @Nullable String request,
        @Nullable String response) {
        this.port = port;
        this.portName = portName;
        this.portSpecification = portSpecification;
        this.proxyHeader = proxyHeader;
        this.request = request;
        this.response = response;
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
    /**
     * Specifies the type of proxy header to append before sending data to the
     * backend.
     * Default value is `NONE`.
     * Possible values are `NONE` and `PROXY_V1`.
     * 
     */
    public Optional<String> getProxyHeader() {
        return Optional.ofNullable(this.proxyHeader);
    }
    /**
     * The application data to send once the SSL connection has been
     * established (default value is empty). If both request and response are
     * empty, the connection establishment alone will indicate health. The request
     * data can only be ASCII.
     * 
     */
    public Optional<String> getRequest() {
        return Optional.ofNullable(this.request);
    }
    /**
     * The bytes to match against the beginning of the response data. If left empty
     * (the default value), any response will indicate health. The response data
     * can only be ASCII.
     * 
     */
    public Optional<String> getResponse() {
        return Optional.ofNullable(this.response);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckTcpHealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer port;
        private @Nullable String portName;
        private @Nullable String portSpecification;
        private @Nullable String proxyHeader;
        private @Nullable String request;
        private @Nullable String response;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckTcpHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.request = defaults.request;
    	      this.response = defaults.response;
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

        public Builder setProxyHeader(@Nullable String proxyHeader) {
            this.proxyHeader = proxyHeader;
            return this;
        }

        public Builder setRequest(@Nullable String request) {
            this.request = request;
            return this;
        }

        public Builder setResponse(@Nullable String response) {
            this.response = response;
            return this;
        }
        public HealthCheckTcpHealthCheck build() {
            return new HealthCheckTcpHealthCheck(port, portName, portSpecification, proxyHeader, request, response);
        }
    }
}
