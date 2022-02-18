// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VpnGatewayIpConfigurationResponse {
    /**
     * The identifier of the IP configuration for a VPN Gateway.
     * 
     */
    private final @Nullable String id;
    /**
     * The private IP address of this IP configuration.
     * 
     */
    private final @Nullable String privateIpAddress;
    /**
     * The public IP address of this IP configuration.
     * 
     */
    private final @Nullable String publicIpAddress;

    @OutputCustomType.Constructor({"id","privateIpAddress","publicIpAddress"})
    private VpnGatewayIpConfigurationResponse(
        @Nullable String id,
        @Nullable String privateIpAddress,
        @Nullable String publicIpAddress) {
        this.id = id;
        this.privateIpAddress = privateIpAddress;
        this.publicIpAddress = publicIpAddress;
    }

    /**
     * The identifier of the IP configuration for a VPN Gateway.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The private IP address of this IP configuration.
     * 
     */
    public Optional<String> getPrivateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }
    /**
     * The public IP address of this IP configuration.
     * 
     */
    public Optional<String> getPublicIpAddress() {
        return Optional.ofNullable(this.publicIpAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnGatewayIpConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String privateIpAddress;
        private @Nullable String publicIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnGatewayIpConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.publicIpAddress = defaults.publicIpAddress;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setPrivateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        public Builder setPublicIpAddress(@Nullable String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }

        public VpnGatewayIpConfigurationResponse build() {
            return new VpnGatewayIpConfigurationResponse(id, privateIpAddress, publicIpAddress);
        }
    }
}
