// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the connection monitor endpoint scope item.
 * 
 */
public final class ConnectionMonitorEndpointScopeItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionMonitorEndpointScopeItemResponse Empty = new ConnectionMonitorEndpointScopeItemResponse();

    /**
     * The address of the endpoint item. Supported types are IPv4/IPv6 subnet mask or IPv4/IPv6 IP address.
     * 
     */
    @InputImport(name="address")
    private final @Nullable String address;

    public Optional<String> getAddress() {
        return this.address == null ? Optional.empty() : Optional.ofNullable(this.address);
    }

    public ConnectionMonitorEndpointScopeItemResponse(@Nullable String address) {
        this.address = address;
    }

    private ConnectionMonitorEndpointScopeItemResponse() {
        this.address = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorEndpointScopeItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorEndpointScopeItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = address;
            return this;
        }

        public ConnectionMonitorEndpointScopeItemResponse build() {
            return new ConnectionMonitorEndpointScopeItemResponse(address);
        }
    }
}
