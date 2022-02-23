// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectionMonitorDestinationResponse {
    /**
     * Address of the connection monitor destination (IP or domain name).
     * 
     */
    private final @Nullable String address;
    /**
     * The destination port used by connection monitor.
     * 
     */
    private final @Nullable Integer port;
    /**
     * The ID of the resource used as the destination by connection monitor.
     * 
     */
    private final @Nullable String resourceId;

    @OutputCustomType.Constructor({"address","port","resourceId"})
    private ConnectionMonitorDestinationResponse(
        @Nullable String address,
        @Nullable Integer port,
        @Nullable String resourceId) {
        this.address = address;
        this.port = port;
        this.resourceId = resourceId;
    }

    /**
     * Address of the connection monitor destination (IP or domain name).
     * 
     */
    public Optional<String> getAddress() {
        return Optional.ofNullable(this.address);
    }
    /**
     * The destination port used by connection monitor.
     * 
     */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * The ID of the resource used as the destination by connection monitor.
     * 
     */
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable Integer port;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.port = defaults.port;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = address;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public ConnectionMonitorDestinationResponse build() {
            return new ConnectionMonitorDestinationResponse(address, port, resourceId);
        }
    }
}
