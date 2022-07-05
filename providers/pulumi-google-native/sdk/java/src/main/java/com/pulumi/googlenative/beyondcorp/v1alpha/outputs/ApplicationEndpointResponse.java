// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.beyondcorp.v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApplicationEndpointResponse {
    /**
     * @return Hostname or IP address of the remote application endpoint.
     * 
     */
    private final String host;
    /**
     * @return Port of the remote application endpoint.
     * 
     */
    private final Integer port;

    @CustomType.Constructor
    private ApplicationEndpointResponse(
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("port") Integer port) {
        this.host = host;
        this.port = port;
    }

    /**
     * @return Hostname or IP address of the remote application endpoint.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return Port of the remote application endpoint.
     * 
     */
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }        public ApplicationEndpointResponse build() {
            return new ApplicationEndpointResponse(host, port);
        }
    }
}
