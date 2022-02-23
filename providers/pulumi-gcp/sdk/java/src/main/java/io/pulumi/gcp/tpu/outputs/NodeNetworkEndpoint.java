// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tpu.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NodeNetworkEndpoint {
    private final @Nullable String ipAddress;
    private final @Nullable Integer port;

    @OutputCustomType.Constructor({"ipAddress","port"})
    private NodeNetworkEndpoint(
        @Nullable String ipAddress,
        @Nullable Integer port) {
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public Optional<String> getIpAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeNetworkEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipAddress;
        private @Nullable Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeNetworkEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.port = defaults.port;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public NodeNetworkEndpoint build() {
            return new NodeNetworkEndpoint(ipAddress, port);
        }
    }
}
