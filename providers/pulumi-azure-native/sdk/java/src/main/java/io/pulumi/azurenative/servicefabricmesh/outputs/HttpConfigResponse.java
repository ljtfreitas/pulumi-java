// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.azurenative.servicefabricmesh.outputs.HttpHostConfigResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class HttpConfigResponse {
    /**
     * description for routing.
     * 
     */
    private final List<HttpHostConfigResponse> hosts;
    /**
     * http gateway config name.
     * 
     */
    private final String name;
    /**
     * Specifies the port at which the service endpoint below needs to be exposed.
     * 
     */
    private final Integer port;

    @CustomType.Constructor
    private HttpConfigResponse(
        @CustomType.Parameter("hosts") List<HttpHostConfigResponse> hosts,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("port") Integer port) {
        this.hosts = hosts;
        this.name = name;
        this.port = port;
    }

    /**
     * description for routing.
     * 
    */
    public List<HttpHostConfigResponse> getHosts() {
        return this.hosts;
    }
    /**
     * http gateway config name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Specifies the port at which the service endpoint below needs to be exposed.
     * 
    */
    public Integer getPort() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<HttpHostConfigResponse> hosts;
        private String name;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hosts = defaults.hosts;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        public Builder hosts(List<HttpHostConfigResponse> hosts) {
            this.hosts = Objects.requireNonNull(hosts);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public HttpConfigResponse build() {
            return new HttpConfigResponse(hosts, name, port);
        }
    }
}
