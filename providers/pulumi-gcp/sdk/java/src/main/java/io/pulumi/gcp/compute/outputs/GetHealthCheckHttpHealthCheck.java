// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetHealthCheckHttpHealthCheck {
    private final String host;
    private final Integer port;
    private final String portName;
    private final String portSpecification;
    private final String proxyHeader;
    private final String requestPath;
    private final String response;

    @OutputCustomType.Constructor({"host","port","portName","portSpecification","proxyHeader","requestPath","response"})
    private GetHealthCheckHttpHealthCheck(
        String host,
        Integer port,
        String portName,
        String portSpecification,
        String proxyHeader,
        String requestPath,
        String response) {
        this.host = Objects.requireNonNull(host);
        this.port = Objects.requireNonNull(port);
        this.portName = Objects.requireNonNull(portName);
        this.portSpecification = Objects.requireNonNull(portSpecification);
        this.proxyHeader = Objects.requireNonNull(proxyHeader);
        this.requestPath = Objects.requireNonNull(requestPath);
        this.response = Objects.requireNonNull(response);
    }

    public String getHost() {
        return this.host;
    }
    public Integer getPort() {
        return this.port;
    }
    public String getPortName() {
        return this.portName;
    }
    public String getPortSpecification() {
        return this.portSpecification;
    }
    public String getProxyHeader() {
        return this.proxyHeader;
    }
    public String getRequestPath() {
        return this.requestPath;
    }
    public String getResponse() {
        return this.response;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHealthCheckHttpHealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private Integer port;
        private String portName;
        private String portSpecification;
        private String proxyHeader;
        private String requestPath;
        private String response;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHealthCheckHttpHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.requestPath = defaults.requestPath;
    	      this.response = defaults.response;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setPortName(String portName) {
            this.portName = Objects.requireNonNull(portName);
            return this;
        }

        public Builder setPortSpecification(String portSpecification) {
            this.portSpecification = Objects.requireNonNull(portSpecification);
            return this;
        }

        public Builder setProxyHeader(String proxyHeader) {
            this.proxyHeader = Objects.requireNonNull(proxyHeader);
            return this;
        }

        public Builder setRequestPath(String requestPath) {
            this.requestPath = Objects.requireNonNull(requestPath);
            return this;
        }

        public Builder setResponse(String response) {
            this.response = Objects.requireNonNull(response);
            return this;
        }
        public GetHealthCheckHttpHealthCheck build() {
            return new GetHealthCheckHttpHealthCheck(host, port, portName, portSpecification, proxyHeader, requestPath, response);
        }
    }
}
