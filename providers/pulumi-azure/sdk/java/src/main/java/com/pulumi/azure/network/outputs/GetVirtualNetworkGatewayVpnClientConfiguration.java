// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.GetVirtualNetworkGatewayVpnClientConfigurationRevokedCertificate;
import com.pulumi.azure.network.outputs.GetVirtualNetworkGatewayVpnClientConfigurationRootCertificate;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualNetworkGatewayVpnClientConfiguration {
    /**
     * @return The client id of the Azure VPN application.
     * See [Create an Active Directory (AD) tenant for P2S OpenVPN protocol connections](https://docs.microsoft.com/en-gb/azure/vpn-gateway/openvpn-azure-ad-tenant-multi-app) for values
     * This setting is incompatible with the use of
     * `root_certificate` and `revoked_certificate`, `radius_server_address`, and `radius_server_secret`.
     * 
     */
    private final String aadAudience;
    /**
     * @return The STS url for your tenant
     * This setting is incompatible with the use of
     * `root_certificate` and `revoked_certificate`, `radius_server_address`, and `radius_server_secret`.
     * 
     */
    private final String aadIssuer;
    /**
     * @return AzureAD Tenant URL
     * This setting is incompatible with the use of
     * `root_certificate` and `revoked_certificate`, `radius_server_address`, and `radius_server_secret`.
     * 
     */
    private final String aadTenant;
    /**
     * @return The address space out of which IP addresses for
     * vpn clients will be taken. You can provide more than one address space, e.g.
     * in CIDR notation.
     * 
     */
    private final List<String> addressSpaces;
    /**
     * @return The address of the Radius server.
     * This setting is incompatible with the use of
     * `aad_tenant`, `aad_audience`, `aad_issuer`, `root_certificate` and `revoked_certificate`.
     * 
     */
    private final String radiusServerAddress;
    /**
     * @return The secret used by the Radius server.
     * This setting is incompatible with the use of
     * `aad_tenant`, `aad_audience`, `aad_issuer`, `root_certificate` and `revoked_certificate`.
     * 
     */
    private final String radiusServerSecret;
    /**
     * @return One or more `revoked_certificate` blocks which
     * are defined below.
     * This setting is incompatible with the use of
     * `aad_tenant`, `aad_audience`, `aad_issuer`, `radius_server_address`, and `radius_server_secret`.
     * 
     */
    private final List<GetVirtualNetworkGatewayVpnClientConfigurationRevokedCertificate> revokedCertificates;
    /**
     * @return One or more `root_certificate` blocks which are
     * defined below. These root certificates are used to sign the client certificate
     * used by the VPN clients to connect to the gateway.
     * This setting is incompatible with the use of
     * `aad_tenant`, `aad_audience`, `aad_issuer`, `radius_server_address`, and `radius_server_secret`.
     * 
     */
    private final List<GetVirtualNetworkGatewayVpnClientConfigurationRootCertificate> rootCertificates;
    /**
     * @return List of the protocols supported by the vpn client.
     * The supported values are `SSTP`, `IkeV2` and `OpenVPN`.
     * 
     */
    private final List<String> vpnClientProtocols;

    @CustomType.Constructor
    private GetVirtualNetworkGatewayVpnClientConfiguration(
        @CustomType.Parameter("aadAudience") String aadAudience,
        @CustomType.Parameter("aadIssuer") String aadIssuer,
        @CustomType.Parameter("aadTenant") String aadTenant,
        @CustomType.Parameter("addressSpaces") List<String> addressSpaces,
        @CustomType.Parameter("radiusServerAddress") String radiusServerAddress,
        @CustomType.Parameter("radiusServerSecret") String radiusServerSecret,
        @CustomType.Parameter("revokedCertificates") List<GetVirtualNetworkGatewayVpnClientConfigurationRevokedCertificate> revokedCertificates,
        @CustomType.Parameter("rootCertificates") List<GetVirtualNetworkGatewayVpnClientConfigurationRootCertificate> rootCertificates,
        @CustomType.Parameter("vpnClientProtocols") List<String> vpnClientProtocols) {
        this.aadAudience = aadAudience;
        this.aadIssuer = aadIssuer;
        this.aadTenant = aadTenant;
        this.addressSpaces = addressSpaces;
        this.radiusServerAddress = radiusServerAddress;
        this.radiusServerSecret = radiusServerSecret;
        this.revokedCertificates = revokedCertificates;
        this.rootCertificates = rootCertificates;
        this.vpnClientProtocols = vpnClientProtocols;
    }

    /**
     * @return The client id of the Azure VPN application.
     * See [Create an Active Directory (AD) tenant for P2S OpenVPN protocol connections](https://docs.microsoft.com/en-gb/azure/vpn-gateway/openvpn-azure-ad-tenant-multi-app) for values
     * This setting is incompatible with the use of
     * `root_certificate` and `revoked_certificate`, `radius_server_address`, and `radius_server_secret`.
     * 
     */
    public String aadAudience() {
        return this.aadAudience;
    }
    /**
     * @return The STS url for your tenant
     * This setting is incompatible with the use of
     * `root_certificate` and `revoked_certificate`, `radius_server_address`, and `radius_server_secret`.
     * 
     */
    public String aadIssuer() {
        return this.aadIssuer;
    }
    /**
     * @return AzureAD Tenant URL
     * This setting is incompatible with the use of
     * `root_certificate` and `revoked_certificate`, `radius_server_address`, and `radius_server_secret`.
     * 
     */
    public String aadTenant() {
        return this.aadTenant;
    }
    /**
     * @return The address space out of which IP addresses for
     * vpn clients will be taken. You can provide more than one address space, e.g.
     * in CIDR notation.
     * 
     */
    public List<String> addressSpaces() {
        return this.addressSpaces;
    }
    /**
     * @return The address of the Radius server.
     * This setting is incompatible with the use of
     * `aad_tenant`, `aad_audience`, `aad_issuer`, `root_certificate` and `revoked_certificate`.
     * 
     */
    public String radiusServerAddress() {
        return this.radiusServerAddress;
    }
    /**
     * @return The secret used by the Radius server.
     * This setting is incompatible with the use of
     * `aad_tenant`, `aad_audience`, `aad_issuer`, `root_certificate` and `revoked_certificate`.
     * 
     */
    public String radiusServerSecret() {
        return this.radiusServerSecret;
    }
    /**
     * @return One or more `revoked_certificate` blocks which
     * are defined below.
     * This setting is incompatible with the use of
     * `aad_tenant`, `aad_audience`, `aad_issuer`, `radius_server_address`, and `radius_server_secret`.
     * 
     */
    public List<GetVirtualNetworkGatewayVpnClientConfigurationRevokedCertificate> revokedCertificates() {
        return this.revokedCertificates;
    }
    /**
     * @return One or more `root_certificate` blocks which are
     * defined below. These root certificates are used to sign the client certificate
     * used by the VPN clients to connect to the gateway.
     * This setting is incompatible with the use of
     * `aad_tenant`, `aad_audience`, `aad_issuer`, `radius_server_address`, and `radius_server_secret`.
     * 
     */
    public List<GetVirtualNetworkGatewayVpnClientConfigurationRootCertificate> rootCertificates() {
        return this.rootCertificates;
    }
    /**
     * @return List of the protocols supported by the vpn client.
     * The supported values are `SSTP`, `IkeV2` and `OpenVPN`.
     * 
     */
    public List<String> vpnClientProtocols() {
        return this.vpnClientProtocols;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkGatewayVpnClientConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aadAudience;
        private String aadIssuer;
        private String aadTenant;
        private List<String> addressSpaces;
        private String radiusServerAddress;
        private String radiusServerSecret;
        private List<GetVirtualNetworkGatewayVpnClientConfigurationRevokedCertificate> revokedCertificates;
        private List<GetVirtualNetworkGatewayVpnClientConfigurationRootCertificate> rootCertificates;
        private List<String> vpnClientProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkGatewayVpnClientConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadAudience = defaults.aadAudience;
    	      this.aadIssuer = defaults.aadIssuer;
    	      this.aadTenant = defaults.aadTenant;
    	      this.addressSpaces = defaults.addressSpaces;
    	      this.radiusServerAddress = defaults.radiusServerAddress;
    	      this.radiusServerSecret = defaults.radiusServerSecret;
    	      this.revokedCertificates = defaults.revokedCertificates;
    	      this.rootCertificates = defaults.rootCertificates;
    	      this.vpnClientProtocols = defaults.vpnClientProtocols;
        }

        public Builder aadAudience(String aadAudience) {
            this.aadAudience = Objects.requireNonNull(aadAudience);
            return this;
        }
        public Builder aadIssuer(String aadIssuer) {
            this.aadIssuer = Objects.requireNonNull(aadIssuer);
            return this;
        }
        public Builder aadTenant(String aadTenant) {
            this.aadTenant = Objects.requireNonNull(aadTenant);
            return this;
        }
        public Builder addressSpaces(List<String> addressSpaces) {
            this.addressSpaces = Objects.requireNonNull(addressSpaces);
            return this;
        }
        public Builder addressSpaces(String... addressSpaces) {
            return addressSpaces(List.of(addressSpaces));
        }
        public Builder radiusServerAddress(String radiusServerAddress) {
            this.radiusServerAddress = Objects.requireNonNull(radiusServerAddress);
            return this;
        }
        public Builder radiusServerSecret(String radiusServerSecret) {
            this.radiusServerSecret = Objects.requireNonNull(radiusServerSecret);
            return this;
        }
        public Builder revokedCertificates(List<GetVirtualNetworkGatewayVpnClientConfigurationRevokedCertificate> revokedCertificates) {
            this.revokedCertificates = Objects.requireNonNull(revokedCertificates);
            return this;
        }
        public Builder revokedCertificates(GetVirtualNetworkGatewayVpnClientConfigurationRevokedCertificate... revokedCertificates) {
            return revokedCertificates(List.of(revokedCertificates));
        }
        public Builder rootCertificates(List<GetVirtualNetworkGatewayVpnClientConfigurationRootCertificate> rootCertificates) {
            this.rootCertificates = Objects.requireNonNull(rootCertificates);
            return this;
        }
        public Builder rootCertificates(GetVirtualNetworkGatewayVpnClientConfigurationRootCertificate... rootCertificates) {
            return rootCertificates(List.of(rootCertificates));
        }
        public Builder vpnClientProtocols(List<String> vpnClientProtocols) {
            this.vpnClientProtocols = Objects.requireNonNull(vpnClientProtocols);
            return this;
        }
        public Builder vpnClientProtocols(String... vpnClientProtocols) {
            return vpnClientProtocols(List.of(vpnClientProtocols));
        }        public GetVirtualNetworkGatewayVpnClientConfiguration build() {
            return new GetVirtualNetworkGatewayVpnClientConfiguration(aadAudience, aadIssuer, aadTenant, addressSpaces, radiusServerAddress, radiusServerSecret, revokedCertificates, rootCertificates, vpnClientProtocols);
        }
    }
}
