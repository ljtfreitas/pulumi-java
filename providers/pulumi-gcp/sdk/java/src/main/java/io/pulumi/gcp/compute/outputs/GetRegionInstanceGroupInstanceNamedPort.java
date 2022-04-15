// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegionInstanceGroupInstanceNamedPort {
    /**
     * The name of the instance group.  One of `name` or `self_link` must be provided.
     * 
     */
    private final String name;
    /**
     * Integer port number
     * 
     */
    private final Integer port;

    @CustomType.Constructor
    private GetRegionInstanceGroupInstanceNamedPort(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("port") Integer port) {
        this.name = name;
        this.port = port;
    }

    /**
     * The name of the instance group.  One of `name` or `self_link` must be provided.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Integer port number
     * 
    */
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionInstanceGroupInstanceNamedPort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionInstanceGroupInstanceNamedPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }        public GetRegionInstanceGroupInstanceNamedPort build() {
            return new GetRegionInstanceGroupInstanceNamedPort(name, port);
        }
    }
}
