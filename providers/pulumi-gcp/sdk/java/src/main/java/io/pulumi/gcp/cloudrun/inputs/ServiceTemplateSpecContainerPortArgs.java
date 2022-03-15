// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerPortArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerPortArgs Empty = new ServiceTemplateSpecContainerPortArgs();

    /**
     * Port number.
     * 
     */
    @Import(name="containerPort", required=true)
      private final Output<Integer> containerPort;

    public Output<Integer> getContainerPort() {
        return this.containerPort;
    }

    /**
     * Volume's name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Protocol used on port. Defaults to TCP.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> getProtocol() {
        return this.protocol == null ? Output.empty() : this.protocol;
    }

    public ServiceTemplateSpecContainerPortArgs(
        Output<Integer> containerPort,
        @Nullable Output<String> name,
        @Nullable Output<String> protocol) {
        this.containerPort = Objects.requireNonNull(containerPort, "expected parameter 'containerPort' to be non-null");
        this.name = name;
        this.protocol = protocol;
    }

    private ServiceTemplateSpecContainerPortArgs() {
        this.containerPort = Output.empty();
        this.name = Output.empty();
        this.protocol = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> containerPort;
        private @Nullable Output<String> name;
        private @Nullable Output<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        public Builder containerPort(Output<Integer> containerPort) {
            this.containerPort = Objects.requireNonNull(containerPort);
            return this;
        }

        public Builder containerPort(Integer containerPort) {
            this.containerPort = Output.of(Objects.requireNonNull(containerPort));
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder protocol(@Nullable String protocol) {
            this.protocol = Output.ofNullable(protocol);
            return this;
        }
        public ServiceTemplateSpecContainerPortArgs build() {
            return new ServiceTemplateSpecContainerPortArgs(containerPort, name, protocol);
        }
    }
}
