// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Customer End point to store/retrieve data during a contact.
 * 
 */
public final class EndPointResponse extends io.pulumi.resources.InvokeArgs {

    public static final EndPointResponse Empty = new EndPointResponse();

    /**
     * Name of an end point.
     * 
     */
    @InputImport(name="endPointName", required=true)
        private final String endPointName;

    public String getEndPointName() {
        return this.endPointName;
    }

    /**
     * IP Address.
     * 
     */
    @InputImport(name="ipAddress", required=true)
        private final String ipAddress;

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * TCP port to listen on to receive data.
     * 
     */
    @InputImport(name="port", required=true)
        private final String port;

    public String getPort() {
        return this.port;
    }

    /**
     * Protocol either UDP or TCP.
     * 
     */
    @InputImport(name="protocol", required=true)
        private final String protocol;

    public String getProtocol() {
        return this.protocol;
    }

    public EndPointResponse(
        String endPointName,
        String ipAddress,
        String port,
        String protocol) {
        this.endPointName = Objects.requireNonNull(endPointName, "expected parameter 'endPointName' to be non-null");
        this.ipAddress = Objects.requireNonNull(ipAddress, "expected parameter 'ipAddress' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
    }

    private EndPointResponse() {
        this.endPointName = null;
        this.ipAddress = null;
        this.port = null;
        this.protocol = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndPointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endPointName;
        private String ipAddress;
        private String port;
        private String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(EndPointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endPointName = defaults.endPointName;
    	      this.ipAddress = defaults.ipAddress;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder setEndPointName(String endPointName) {
            this.endPointName = Objects.requireNonNull(endPointName);
            return this;
        }

        public Builder setIpAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder setPort(String port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public EndPointResponse build() {
            return new EndPointResponse(endPointName, ipAddress, port, protocol);
        }
    }
}
