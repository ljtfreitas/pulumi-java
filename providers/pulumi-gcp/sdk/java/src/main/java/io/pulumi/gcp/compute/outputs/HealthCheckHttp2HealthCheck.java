// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HealthCheckHttp2HealthCheck {
    /**
     * The value of the host header in the HTTP2 health check request.
     * If left empty (default value), the public IP on behalf of which this health
     * check is performed will be used.
     * 
     */
    private final @Nullable String host;
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
     * The request path of the HTTP2 health check request.
     * The default value is /.
     * 
     */
    private final @Nullable String requestPath;
    /**
     * The bytes to match against the beginning of the response data. If left empty
     * (the default value), any response will indicate health. The response data
     * can only be ASCII.
     * 
     */
    private final @Nullable String response;

    @CustomType.Constructor
    private HealthCheckHttp2HealthCheck(
        @CustomType.Parameter("host") @Nullable String host,
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("portName") @Nullable String portName,
        @CustomType.Parameter("portSpecification") @Nullable String portSpecification,
        @CustomType.Parameter("proxyHeader") @Nullable String proxyHeader,
        @CustomType.Parameter("requestPath") @Nullable String requestPath,
        @CustomType.Parameter("response") @Nullable String response) {
        this.host = host;
        this.port = port;
        this.portName = portName;
        this.portSpecification = portSpecification;
        this.proxyHeader = proxyHeader;
        this.requestPath = requestPath;
        this.response = response;
    }

    /**
     * The value of the host header in the HTTP2 health check request.
     * If left empty (default value), the public IP on behalf of which this health
     * check is performed will be used.
     * 
    */
    public Optional<String> getHost() {
        return Optional.ofNullable(this.host);
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
     * The request path of the HTTP2 health check request.
     * The default value is /.
     * 
    */
    public Optional<String> getRequestPath() {
        return Optional.ofNullable(this.requestPath);
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

    public static Builder builder(HealthCheckHttp2HealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String host;
        private @Nullable Integer port;
        private @Nullable String portName;
        private @Nullable String portSpecification;
        private @Nullable String proxyHeader;
        private @Nullable String requestPath;
        private @Nullable String response;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckHttp2HealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.requestPath = defaults.requestPath;
    	      this.response = defaults.response;
        }

        public Builder host(@Nullable String host) {
            this.host = host;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder portName(@Nullable String portName) {
            this.portName = portName;
            return this;
        }

        public Builder portSpecification(@Nullable String portSpecification) {
            this.portSpecification = portSpecification;
            return this;
        }

        public Builder proxyHeader(@Nullable String proxyHeader) {
            this.proxyHeader = proxyHeader;
            return this;
        }

        public Builder requestPath(@Nullable String requestPath) {
            this.requestPath = requestPath;
            return this;
        }

        public Builder response(@Nullable String response) {
            this.response = response;
            return this;
        }
        public HealthCheckHttp2HealthCheck build() {
            return new HealthCheckHttp2HealthCheck(host, port, portName, portSpecification, proxyHeader, requestPath, response);
        }
    }
}
