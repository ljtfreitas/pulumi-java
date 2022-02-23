// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterEndpointArgs Empty = new ClusterEndpointArgs();

    /**
     * The DNS address of the primary read-write node.
     * 
     */
    @InputImport(name="address")
        private final @Nullable Input<String> address;

    public Input<String> getAddress() {
        return this.address == null ? Input.empty() : this.address;
    }

    /**
     * The port number that the engine is listening on.
     * 
     */
    @InputImport(name="port")
        private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    public ClusterEndpointArgs(
        @Nullable Input<String> address,
        @Nullable Input<Integer> port) {
        this.address = address;
        this.port = port;
    }

    private ClusterEndpointArgs() {
        this.address = Input.empty();
        this.port = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> address;
        private @Nullable Input<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.port = defaults.port;
        }

        public Builder setAddress(@Nullable Input<String> address) {
            this.address = address;
            return this;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = Input.ofNullable(address);
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
        public ClusterEndpointArgs build() {
            return new ClusterEndpointArgs(address, port);
        }
    }
}
