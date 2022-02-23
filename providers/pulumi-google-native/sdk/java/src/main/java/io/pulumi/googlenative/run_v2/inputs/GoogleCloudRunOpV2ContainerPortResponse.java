// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * ContainerPort represents a network port in a single container.
 * 
 */
public final class GoogleCloudRunOpV2ContainerPortResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRunOpV2ContainerPortResponse Empty = new GoogleCloudRunOpV2ContainerPortResponse();

    /**
     * Port number the container listens on. This must be a valid TCP port number, 0 < container_port < 65536.
     * 
     */
    @InputImport(name="containerPort", required=true)
      private final Integer containerPort;

    public Integer getContainerPort() {
        return this.containerPort;
    }

    /**
     * If specified, used to specify which protocol to use. Allowed values are "http1" and "h2c".
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public GoogleCloudRunOpV2ContainerPortResponse(
        Integer containerPort,
        String name) {
        this.containerPort = Objects.requireNonNull(containerPort, "expected parameter 'containerPort' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GoogleCloudRunOpV2ContainerPortResponse() {
        this.containerPort = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2ContainerPortResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer containerPort;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2ContainerPortResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
    	      this.name = defaults.name;
        }

        public Builder setContainerPort(Integer containerPort) {
            this.containerPort = Objects.requireNonNull(containerPort);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GoogleCloudRunOpV2ContainerPortResponse build() {
            return new GoogleCloudRunOpV2ContainerPortResponse(containerPort, name);
        }
    }
}
