// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetServiceTemplateSpecContainerPort extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceTemplateSpecContainerPort Empty = new GetServiceTemplateSpecContainerPort();

    @Import(name="containerPort", required=true)
      private final Integer containerPort;

    public Integer getContainerPort() {
        return this.containerPort;
    }

    /**
     * The name of the Cloud Run Service.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    @Import(name="protocol", required=true)
      private final String protocol;

    public String getProtocol() {
        return this.protocol;
    }

    public GetServiceTemplateSpecContainerPort(
        Integer containerPort,
        String name,
        String protocol) {
        this.containerPort = Objects.requireNonNull(containerPort, "expected parameter 'containerPort' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
    }

    private GetServiceTemplateSpecContainerPort() {
        this.containerPort = null;
        this.name = null;
        this.protocol = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecContainerPort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer containerPort;
        private String name;
        private String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpecContainerPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        public Builder containerPort(Integer containerPort) {
            this.containerPort = Objects.requireNonNull(containerPort);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public GetServiceTemplateSpecContainerPort build() {
            return new GetServiceTemplateSpecContainerPort(containerPort, name, protocol);
        }
    }
}
