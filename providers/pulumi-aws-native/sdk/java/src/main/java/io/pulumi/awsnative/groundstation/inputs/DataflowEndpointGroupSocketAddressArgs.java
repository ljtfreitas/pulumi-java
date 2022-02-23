// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataflowEndpointGroupSocketAddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataflowEndpointGroupSocketAddressArgs Empty = new DataflowEndpointGroupSocketAddressArgs();

    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="port")
        private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    public DataflowEndpointGroupSocketAddressArgs(
        @Nullable Input<String> name,
        @Nullable Input<Integer> port) {
        this.name = name;
        this.port = port;
    }

    private DataflowEndpointGroupSocketAddressArgs() {
        this.name = Input.empty();
        this.port = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataflowEndpointGroupSocketAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataflowEndpointGroupSocketAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }
        public DataflowEndpointGroupSocketAddressArgs build() {
            return new DataflowEndpointGroupSocketAddressArgs(name, port);
        }
    }
}
