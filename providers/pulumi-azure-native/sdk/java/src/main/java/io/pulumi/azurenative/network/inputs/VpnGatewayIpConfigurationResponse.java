// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IP Configuration of a VPN Gateway Resource.
 * 
 */
public final class VpnGatewayIpConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final VpnGatewayIpConfigurationResponse Empty = new VpnGatewayIpConfigurationResponse();

    /**
     * The identifier of the IP configuration for a VPN Gateway.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The private IP address of this IP configuration.
     * 
     */
    @InputImport(name="privateIpAddress")
    private final @Nullable String privateIpAddress;

    public Optional<String> getPrivateIpAddress() {
        return this.privateIpAddress == null ? Optional.empty() : Optional.ofNullable(this.privateIpAddress);
    }

    /**
     * The public IP address of this IP configuration.
     * 
     */
    @InputImport(name="publicIpAddress")
    private final @Nullable String publicIpAddress;

    public Optional<String> getPublicIpAddress() {
        return this.publicIpAddress == null ? Optional.empty() : Optional.ofNullable(this.publicIpAddress);
    }

    public VpnGatewayIpConfigurationResponse(
        @Nullable String id,
        @Nullable String privateIpAddress,
        @Nullable String publicIpAddress) {
        this.id = id;
        this.privateIpAddress = privateIpAddress;
        this.publicIpAddress = publicIpAddress;
    }

    private VpnGatewayIpConfigurationResponse() {
        this.id = null;
        this.privateIpAddress = null;
        this.publicIpAddress = null;
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
