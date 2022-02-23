// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.AddressSpaceResponse;
import io.pulumi.azurenative.network.outputs.RoutingConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class P2SConnectionConfigurationResponse {
    /**
     * Flag indicating whether the enable internet security flag is turned on for the P2S Connections or not.
     * 
     */
    private final @Nullable Boolean enableInternetSecurity;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the P2SConnectionConfiguration resource.
     * 
     */
    private final String provisioningState;
    /**
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    private final @Nullable RoutingConfigurationResponse routingConfiguration;
    /**
     * The reference to the address space resource which represents Address space for P2S VpnClient.
     * 
     */
    private final @Nullable AddressSpaceResponse vpnClientAddressPool;

    @OutputCustomType.Constructor({"enableInternetSecurity","etag","id","name","provisioningState","routingConfiguration","vpnClientAddressPool"})
    private P2SConnectionConfigurationResponse(
        @Nullable Boolean enableInternetSecurity,
        String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        @Nullable RoutingConfigurationResponse routingConfiguration,
        @Nullable AddressSpaceResponse vpnClientAddressPool) {
        this.enableInternetSecurity = enableInternetSecurity;
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.routingConfiguration = routingConfiguration;
        this.vpnClientAddressPool = vpnClientAddressPool;
    }

    /**
     * Flag indicating whether the enable internet security flag is turned on for the P2S Connections or not.
     * 
     */
    public Optional<Boolean> getEnableInternetSecurity() {
        return Optional.ofNullable(this.enableInternetSecurity);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the P2SConnectionConfiguration resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    public Optional<RoutingConfigurationResponse> getRoutingConfiguration() {
        return Optional.ofNullable(this.routingConfiguration);
    }
    /**
     * The reference to the address space resource which represents Address space for P2S VpnClient.
     * 
     */
    public Optional<AddressSpaceResponse> getVpnClientAddressPool() {
        return Optional.ofNullable(this.vpnClientAddressPool);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(P2SConnectionConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableInternetSecurity;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private @Nullable RoutingConfigurationResponse routingConfiguration;
        private @Nullable AddressSpaceResponse vpnClientAddressPool;

        public Builder() {
    	      // Empty
        }

        public Builder(P2SConnectionConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableInternetSecurity = defaults.enableInternetSecurity;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.routingConfiguration = defaults.routingConfiguration;
    	      this.vpnClientAddressPool = defaults.vpnClientAddressPool;
        }

        public Builder setEnableInternetSecurity(@Nullable Boolean enableInternetSecurity) {
            this.enableInternetSecurity = enableInternetSecurity;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRoutingConfiguration(@Nullable RoutingConfigurationResponse routingConfiguration) {
            this.routingConfiguration = routingConfiguration;
            return this;
        }

        public Builder setVpnClientAddressPool(@Nullable AddressSpaceResponse vpnClientAddressPool) {
            this.vpnClientAddressPool = vpnClientAddressPool;
            return this;
        }
        public P2SConnectionConfigurationResponse build() {
            return new P2SConnectionConfigurationResponse(enableInternetSecurity, etag, id, name, provisioningState, routingConfiguration, vpnClientAddressPool);
        }
    }
}
