// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.AddressSpaceResponse;
import io.pulumi.azurenative.network.outputs.IpsecPolicyResponse;
import io.pulumi.azurenative.network.outputs.RadiusServerResponse;
import io.pulumi.azurenative.network.outputs.VpnClientRevokedCertificateResponse;
import io.pulumi.azurenative.network.outputs.VpnClientRootCertificateResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VpnClientConfigurationResponse {
    /**
     * The AADAudience property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     * 
     */
    private final @Nullable String aadAudience;
    /**
     * The AADIssuer property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     * 
     */
    private final @Nullable String aadIssuer;
    /**
     * The AADTenant property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     * 
     */
    private final @Nullable String aadTenant;
    /**
     * The radius server address property of the VirtualNetworkGateway resource for vpn client connection.
     * 
     */
    private final @Nullable String radiusServerAddress;
    /**
     * The radius secret property of the VirtualNetworkGateway resource for vpn client connection.
     * 
     */
    private final @Nullable String radiusServerSecret;
    /**
     * The radiusServers property for multiple radius server configuration.
     * 
     */
    private final @Nullable List<RadiusServerResponse> radiusServers;
    /**
     * VPN authentication types for the virtual network gateway..
     * 
     */
    private final @Nullable List<String> vpnAuthenticationTypes;
    /**
     * The reference to the address space resource which represents Address space for P2S VpnClient.
     * 
     */
    private final @Nullable AddressSpaceResponse vpnClientAddressPool;
    /**
     * VpnClientIpsecPolicies for virtual network gateway P2S client.
     * 
     */
    private final @Nullable List<IpsecPolicyResponse> vpnClientIpsecPolicies;
    /**
     * VpnClientProtocols for Virtual network gateway.
     * 
     */
    private final @Nullable List<String> vpnClientProtocols;
    /**
     * VpnClientRevokedCertificate for Virtual network gateway.
     * 
     */
    private final @Nullable List<VpnClientRevokedCertificateResponse> vpnClientRevokedCertificates;
    /**
     * VpnClientRootCertificate for virtual network gateway.
     * 
     */
    private final @Nullable List<VpnClientRootCertificateResponse> vpnClientRootCertificates;

    @OutputCustomType.Constructor({"aadAudience","aadIssuer","aadTenant","radiusServerAddress","radiusServerSecret","radiusServers","vpnAuthenticationTypes","vpnClientAddressPool","vpnClientIpsecPolicies","vpnClientProtocols","vpnClientRevokedCertificates","vpnClientRootCertificates"})
    private VpnClientConfigurationResponse(
        @Nullable String aadAudience,
        @Nullable String aadIssuer,
        @Nullable String aadTenant,
        @Nullable String radiusServerAddress,
        @Nullable String radiusServerSecret,
        @Nullable List<RadiusServerResponse> radiusServers,
        @Nullable List<String> vpnAuthenticationTypes,
        @Nullable AddressSpaceResponse vpnClientAddressPool,
        @Nullable List<IpsecPolicyResponse> vpnClientIpsecPolicies,
        @Nullable List<String> vpnClientProtocols,
        @Nullable List<VpnClientRevokedCertificateResponse> vpnClientRevokedCertificates,
        @Nullable List<VpnClientRootCertificateResponse> vpnClientRootCertificates) {
        this.aadAudience = aadAudience;
        this.aadIssuer = aadIssuer;
        this.aadTenant = aadTenant;
        this.radiusServerAddress = radiusServerAddress;
        this.radiusServerSecret = radiusServerSecret;
        this.radiusServers = radiusServers;
        this.vpnAuthenticationTypes = vpnAuthenticationTypes;
        this.vpnClientAddressPool = vpnClientAddressPool;
        this.vpnClientIpsecPolicies = vpnClientIpsecPolicies;
        this.vpnClientProtocols = vpnClientProtocols;
        this.vpnClientRevokedCertificates = vpnClientRevokedCertificates;
        this.vpnClientRootCertificates = vpnClientRootCertificates;
    }

    /**
     * The AADAudience property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     * 
     */
    public Optional<String> getAadAudience() {
        return Optional.ofNullable(this.aadAudience);
    }
    /**
     * The AADIssuer property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     * 
     */
    public Optional<String> getAadIssuer() {
        return Optional.ofNullable(this.aadIssuer);
    }
    /**
     * The AADTenant property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     * 
     */
    public Optional<String> getAadTenant() {
        return Optional.ofNullable(this.aadTenant);
    }
    /**
     * The radius server address property of the VirtualNetworkGateway resource for vpn client connection.
     * 
     */
    public Optional<String> getRadiusServerAddress() {
        return Optional.ofNullable(this.radiusServerAddress);
    }
    /**
     * The radius secret property of the VirtualNetworkGateway resource for vpn client connection.
     * 
     */
    public Optional<String> getRadiusServerSecret() {
        return Optional.ofNullable(this.radiusServerSecret);
    }
    /**
     * The radiusServers property for multiple radius server configuration.
     * 
     */
    public List<RadiusServerResponse> getRadiusServers() {
        return this.radiusServers == null ? List.of() : this.radiusServers;
    }
    /**
     * VPN authentication types for the virtual network gateway..
     * 
     */
    public List<String> getVpnAuthenticationTypes() {
        return this.vpnAuthenticationTypes == null ? List.of() : this.vpnAuthenticationTypes;
    }
    /**
     * The reference to the address space resource which represents Address space for P2S VpnClient.
     * 
     */
    public Optional<AddressSpaceResponse> getVpnClientAddressPool() {
        return Optional.ofNullable(this.vpnClientAddressPool);
    }
    /**
     * VpnClientIpsecPolicies for virtual network gateway P2S client.
     * 
     */
    public List<IpsecPolicyResponse> getVpnClientIpsecPolicies() {
        return this.vpnClientIpsecPolicies == null ? List.of() : this.vpnClientIpsecPolicies;
    }
    /**
     * VpnClientProtocols for Virtual network gateway.
     * 
     */
    public List<String> getVpnClientProtocols() {
        return this.vpnClientProtocols == null ? List.of() : this.vpnClientProtocols;
    }
    /**
     * VpnClientRevokedCertificate for Virtual network gateway.
     * 
     */
    public List<VpnClientRevokedCertificateResponse> getVpnClientRevokedCertificates() {
        return this.vpnClientRevokedCertificates == null ? List.of() : this.vpnClientRevokedCertificates;
    }
    /**
     * VpnClientRootCertificate for virtual network gateway.
     * 
     */
    public List<VpnClientRootCertificateResponse> getVpnClientRootCertificates() {
        return this.vpnClientRootCertificates == null ? List.of() : this.vpnClientRootCertificates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnClientConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aadAudience;
        private @Nullable String aadIssuer;
        private @Nullable String aadTenant;
        private @Nullable String radiusServerAddress;
        private @Nullable String radiusServerSecret;
        private @Nullable List<RadiusServerResponse> radiusServers;
        private @Nullable List<String> vpnAuthenticationTypes;
        private @Nullable AddressSpaceResponse vpnClientAddressPool;
        private @Nullable List<IpsecPolicyResponse> vpnClientIpsecPolicies;
        private @Nullable List<String> vpnClientProtocols;
        private @Nullable List<VpnClientRevokedCertificateResponse> vpnClientRevokedCertificates;
        private @Nullable List<VpnClientRootCertificateResponse> vpnClientRootCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnClientConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadAudience = defaults.aadAudience;
    	      this.aadIssuer = defaults.aadIssuer;
    	      this.aadTenant = defaults.aadTenant;
    	      this.radiusServerAddress = defaults.radiusServerAddress;
    	      this.radiusServerSecret = defaults.radiusServerSecret;
    	      this.radiusServers = defaults.radiusServers;
    	      this.vpnAuthenticationTypes = defaults.vpnAuthenticationTypes;
    	      this.vpnClientAddressPool = defaults.vpnClientAddressPool;
    	      this.vpnClientIpsecPolicies = defaults.vpnClientIpsecPolicies;
    	      this.vpnClientProtocols = defaults.vpnClientProtocols;
    	      this.vpnClientRevokedCertificates = defaults.vpnClientRevokedCertificates;
    	      this.vpnClientRootCertificates = defaults.vpnClientRootCertificates;
        }

        public Builder setAadAudience(@Nullable String aadAudience) {
            this.aadAudience = aadAudience;
            return this;
        }

        public Builder setAadIssuer(@Nullable String aadIssuer) {
            this.aadIssuer = aadIssuer;
            return this;
        }

        public Builder setAadTenant(@Nullable String aadTenant) {
            this.aadTenant = aadTenant;
            return this;
        }

        public Builder setRadiusServerAddress(@Nullable String radiusServerAddress) {
            this.radiusServerAddress = radiusServerAddress;
            return this;
        }

        public Builder setRadiusServerSecret(@Nullable String radiusServerSecret) {
            this.radiusServerSecret = radiusServerSecret;
            return this;
        }

        public Builder setRadiusServers(@Nullable List<RadiusServerResponse> radiusServers) {
            this.radiusServers = radiusServers;
            return this;
        }

        public Builder setVpnAuthenticationTypes(@Nullable List<String> vpnAuthenticationTypes) {
            this.vpnAuthenticationTypes = vpnAuthenticationTypes;
            return this;
        }

        public Builder setVpnClientAddressPool(@Nullable AddressSpaceResponse vpnClientAddressPool) {
            this.vpnClientAddressPool = vpnClientAddressPool;
            return this;
        }

        public Builder setVpnClientIpsecPolicies(@Nullable List<IpsecPolicyResponse> vpnClientIpsecPolicies) {
            this.vpnClientIpsecPolicies = vpnClientIpsecPolicies;
            return this;
        }

        public Builder setVpnClientProtocols(@Nullable List<String> vpnClientProtocols) {
            this.vpnClientProtocols = vpnClientProtocols;
            return this;
        }

        public Builder setVpnClientRevokedCertificates(@Nullable List<VpnClientRevokedCertificateResponse> vpnClientRevokedCertificates) {
            this.vpnClientRevokedCertificates = vpnClientRevokedCertificates;
            return this;
        }

        public Builder setVpnClientRootCertificates(@Nullable List<VpnClientRootCertificateResponse> vpnClientRootCertificates) {
            this.vpnClientRootCertificates = vpnClientRootCertificates;
            return this;
        }
        public VpnClientConfigurationResponse build() {
            return new VpnClientConfigurationResponse(aadAudience, aadIssuer, aadTenant, radiusServerAddress, radiusServerSecret, radiusServers, vpnAuthenticationTypes, vpnClientAddressPool, vpnClientIpsecPolicies, vpnClientProtocols, vpnClientRevokedCertificates, vpnClientRootCertificates);
        }
    }
}
