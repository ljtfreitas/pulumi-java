// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class GoogleCloudMlV1__ContainerPortResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__ContainerPortResponse Empty = new GoogleCloudMlV1__ContainerPortResponse();

    @InputImport(name="containerPort", required=true)
    private final Integer containerPort;

    public Integer getContainerPort() {
        return this.containerPort;
    }

    public GoogleCloudMlV1__ContainerPortResponse(Integer containerPort) {
        this.containerPort = Objects.requireNonNull(containerPort, "expected parameter 'containerPort' to be non-null");
    }

    private GoogleCloudMlV1__ContainerPortResponse() {
        this.containerPort = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__ContainerPortResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer containerPort;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__ContainerPortResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
        }

        public Builder setContainerPort(Integer containerPort) {
            this.containerPort = Objects.requireNonNull(containerPort);
            return this;
        }

        public GoogleCloudMlV1__ContainerPortResponse build() {
            return new GoogleCloudMlV1__ContainerPortResponse(containerPort);
        }
    }
}