// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class InstanceGroupNamedPortGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupNamedPortGetArgs Empty = new InstanceGroupNamedPortGetArgs();

    /**
     * The name which the port will be mapped to.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The port number to map the name to.
     * 
     */
    @InputImport(name="port", required=true)
        private final Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port;
    }

    public InstanceGroupNamedPortGetArgs(
        Input<String> name,
        Input<Integer> port) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private InstanceGroupNamedPortGetArgs() {
        this.name = Input.empty();
        this.port = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupNamedPortGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupNamedPortGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPort(Input<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Input.of(Objects.requireNonNull(port));
            return this;
        }
        public InstanceGroupNamedPortGetArgs build() {
            return new InstanceGroupNamedPortGetArgs(name, port);
        }
    }
}
