// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.VpnAuthenticationType;
import io.pulumi.azurenative.network.enums.VpnClientProtocol;
import io.pulumi.azurenative.network.inputs.AddressSpaceArgs;
import io.pulumi.azurenative.network.inputs.IpsecPolicyArgs;
import io.pulumi.azurenative.network.inputs.RadiusServerArgs;
import io.pulumi.azurenative.network.inputs.VpnClientRevokedCertificateArgs;
import io.pulumi.azurenative.network.inputs.VpnClientRootCertificateArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VpnClientConfiguration for P2S client.
 * 
 */
public final class VpnClientConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnClientConfigurationArgs Empty = new VpnClientConfigurationArgs();

    /**
     * The AADAudience property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     * 
     */
    @InputImport(name="aadAudience")
        private final @Nullable Input<String> aadAudience;

    public Input<String> getAadAudience() {
        return this.aadAudience == null ? Input.empty() : this.aadAudience;
    }

    /**
     * The AADIssuer property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     * 
     */
    @InputImport(name="aadIssuer")
        private final @Nullable Input<String> aadIssuer;

    public Input<String> getAadIssuer() {
        return this.aadIssuer == null ? Input.empty() : this.aadIssuer;
    }

    /**
     * The AADTenant property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     * 
     */
    @InputImport(name="aadTenant")
        private final @Nullable Input<String> aadTenant;

    public Input<String> getAadTenant() {
        return this.aadTenant == null ? Input.empty() : this.aadTenant;
    }

    /**
     * The radius server address property of the VirtualNetworkGateway resource for vpn client connection.
     * 
     */
    @InputImport(name="radiusServerAddress")
        private final @Nullable Input<String> radiusServerAddress;

    public Input<String> getRadiusServerAddress() {
        return this.radiusServerAddress == null ? Input.empty() : this.radiusServerAddress;
    }

    /**
     * The radius secret property of the VirtualNetworkGateway resource for vpn client connection.
     * 
     */
    @InputImport(name="radiusServerSecret")
        private final @Nullable Input<String> radiusServerSecret;

    public Input<String> getRadiusServerSecret() {
        return this.radiusServerSecret == null ? Input.empty() : this.radiusServerSecret;
    }

    /**
     * The radiusServers property for multiple radius server configuration.
     * 
     */
    @InputImport(name="radiusServers")
        private final @Nullable Input<List<RadiusServerArgs>> radiusServers;

    public Input<List<RadiusServerArgs>> getRadiusServers() {
        return this.radiusServers == null ? Input.empty() : this.radiusServers;
    }

    /**
     * VPN authentication types for the virtual network gateway..
     * 
     */
    @InputImport(name="vpnAuthenticationTypes")
        private final @Nullable Input<List<Either<String,VpnAuthenticationType>>> vpnAuthenticationTypes;

    public Input<List<Either<String,VpnAuthenticationType>>> getVpnAuthenticationTypes() {
        return this.vpnAuthenticationTypes == null ? Input.empty() : this.vpnAuthenticationTypes;
    }

    /**
     * The reference to the address space resource which represents Address space for P2S VpnClient.
     * 
     */
    @InputImport(name="vpnClientAddressPool")
        private final @Nullable Input<AddressSpaceArgs> vpnClientAddressPool;

    public Input<AddressSpaceArgs> getVpnClientAddressPool() {
        return this.vpnClientAddressPool == null ? Input.empty() : this.vpnClientAddressPool;
    }

    /**
     * VpnClientIpsecPolicies for virtual network gateway P2S client.
     * 
     */
    @InputImport(name="vpnClientIpsecPolicies")
        private final @Nullable Input<List<IpsecPolicyArgs>> vpnClientIpsecPolicies;

    public Input<List<IpsecPolicyArgs>> getVpnClientIpsecPolicies() {
        return this.vpnClientIpsecPolicies == null ? Input.empty() : this.vpnClientIpsecPolicies;
    }

    /**
     * VpnClientProtocols for Virtual network gateway.
     * 
     */
    @InputImport(name="vpnClientProtocols")
        private final @Nullable Input<List<Either<String,VpnClientProtocol>>> vpnClientProtocols;

    public Input<List<Either<String,VpnClientProtocol>>> getVpnClientProtocols() {
        return this.vpnClientProtocols == null ? Input.empty() : this.vpnClientProtocols;
    }

    /**
     * VpnClientRevokedCertificate for Virtual network gateway.
     * 
     */
    @InputImport(name="vpnClientRevokedCertificates")
        private final @Nullable Input<List<VpnClientRevokedCertificateArgs>> vpnClientRevokedCertificates;

    public Input<List<VpnClientRevokedCertificateArgs>> getVpnClientRevokedCertificates() {
        return this.vpnClientRevokedCertificates == null ? Input.empty() : this.vpnClientRevokedCertificates;
    }

    /**
     * VpnClientRootCertificate for virtual network gateway.
     * 
     */
    @InputImport(name="vpnClientRootCertificates")
        private final @Nullable Input<List<VpnClientRootCertificateArgs>> vpnClientRootCertificates;

    public Input<List<VpnClientRootCertificateArgs>> getVpnClientRootCertificates() {
        return this.vpnClientRootCertificates == null ? Input.empty() : this.vpnClientRootCertificates;
    }

    public VpnClientConfigurationArgs(
        @Nullable Input<String> aadAudience,
        @Nullable Input<String> aadIssuer,
        @Nullable Input<String> aadTenant,
        @Nullable Input<String> radiusServerAddress,
        @Nullable Input<String> radiusServerSecret,
        @Nullable Input<List<RadiusServerArgs>> radiusServers,
        @Nullable Input<List<Either<String,VpnAuthenticationType>>> vpnAuthenticationTypes,
        @Nullable Input<AddressSpaceArgs> vpnClientAddressPool,
        @Nullable Input<List<IpsecPolicyArgs>> vpnClientIpsecPolicies,
        @Nullable Input<List<Either<String,VpnClientProtocol>>> vpnClientProtocols,
        @Nullable Input<List<VpnClientRevokedCertificateArgs>> vpnClientRevokedCertificates,
        @Nullable Input<List<VpnClientRootCertificateArgs>> vpnClientRootCertificates) {
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

    private VpnClientConfigurationArgs() {
        this.aadAudience = Input.empty();
        this.aadIssuer = Input.empty();
        this.aadTenant = Input.empty();
        this.radiusServerAddress = Input.empty();
        this.radiusServerSecret = Input.empty();
        this.radiusServers = Input.empty();
        this.vpnAuthenticationTypes = Input.empty();
        this.vpnClientAddressPool = Input.empty();
        this.vpnClientIpsecPolicies = Input.empty();
        this.vpnClientProtocols = Input.empty();
        this.vpnClientRevokedCertificates = Input.empty();
        this.vpnClientRootCertificates = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnClientConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> aadAudience;
        private @Nullable Input<String> aadIssuer;
        private @Nullable Input<String> aadTenant;
        private @Nullable Input<String> radiusServerAddress;
        private @Nullable Input<String> radiusServerSecret;
        private @Nullable Input<List<RadiusServerArgs>> radiusServers;
        private @Nullable Input<List<Either<String,VpnAuthenticationType>>> vpnAuthenticationTypes;
        private @Nullable Input<AddressSpaceArgs> vpnClientAddressPool;
        private @Nullable Input<List<IpsecPolicyArgs>> vpnClientIpsecPolicies;
        private @Nullable Input<List<Either<String,VpnClientProtocol>>> vpnClientProtocols;
        private @Nullable Input<List<VpnClientRevokedCertificateArgs>> vpnClientRevokedCertificates;
        private @Nullable Input<List<VpnClientRootCertificateArgs>> vpnClientRootCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnClientConfigurationArgs defaults) {
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

        public Builder setAadAudience(@Nullable Input<String> aadAudience) {
            this.aadAudience = aadAudience;
            return this;
        }

        public Builder setAadAudience(@Nullable String aadAudience) {
            this.aadAudience = Input.ofNullable(aadAudience);
            return this;
        }

        public Builder setAadIssuer(@Nullable Input<String> aadIssuer) {
            this.aadIssuer = aadIssuer;
            return this;
        }

        public Builder setAadIssuer(@Nullable String aadIssuer) {
            this.aadIssuer = Input.ofNullable(aadIssuer);
            return this;
        }

        public Builder setAadTenant(@Nullable Input<String> aadTenant) {
            this.aadTenant = aadTenant;
            return this;
        }

        public Builder setAadTenant(@Nullable String aadTenant) {
            this.aadTenant = Input.ofNullable(aadTenant);
            return this;
        }

        public Builder setRadiusServerAddress(@Nullable Input<String> radiusServerAddress) {
            this.radiusServerAddress = radiusServerAddress;
            return this;
        }

        public Builder setRadiusServerAddress(@Nullable String radiusServerAddress) {
            this.radiusServerAddress = Input.ofNullable(radiusServerAddress);
            return this;
        }

        public Builder setRadiusServerSecret(@Nullable Input<String> radiusServerSecret) {
            this.radiusServerSecret = radiusServerSecret;
            return this;
        }

        public Builder setRadiusServerSecret(@Nullable String radiusServerSecret) {
            this.radiusServerSecret = Input.ofNullable(radiusServerSecret);
            return this;
        }

        public Builder setRadiusServers(@Nullable Input<List<RadiusServerArgs>> radiusServers) {
            this.radiusServers = radiusServers;
            return this;
        }

        public Builder setRadiusServers(@Nullable List<RadiusServerArgs> radiusServers) {
            this.radiusServers = Input.ofNullable(radiusServers);
            return this;
        }

        public Builder setVpnAuthenticationTypes(@Nullable Input<List<Either<String,VpnAuthenticationType>>> vpnAuthenticationTypes) {
            this.vpnAuthenticationTypes = vpnAuthenticationTypes;
            return this;
        }

        public Builder setVpnAuthenticationTypes(@Nullable List<Either<String,VpnAuthenticationType>> vpnAuthenticationTypes) {
            this.vpnAuthenticationTypes = Input.ofNullable(vpnAuthenticationTypes);
            return this;
        }

        public Builder setVpnClientAddressPool(@Nullable Input<AddressSpaceArgs> vpnClientAddressPool) {
            this.vpnClientAddressPool = vpnClientAddressPool;
            return this;
        }

        public Builder setVpnClientAddressPool(@Nullable AddressSpaceArgs vpnClientAddressPool) {
            this.vpnClientAddressPool = Input.ofNullable(vpnClientAddressPool);
            return this;
        }

        public Builder setVpnClientIpsecPolicies(@Nullable Input<List<IpsecPolicyArgs>> vpnClientIpsecPolicies) {
            this.vpnClientIpsecPolicies = vpnClientIpsecPolicies;
            return this;
        }

        public Builder setVpnClientIpsecPolicies(@Nullable List<IpsecPolicyArgs> vpnClientIpsecPolicies) {
            this.vpnClientIpsecPolicies = Input.ofNullable(vpnClientIpsecPolicies);
            return this;
        }

        public Builder setVpnClientProtocols(@Nullable Input<List<Either<String,VpnClientProtocol>>> vpnClientProtocols) {
            this.vpnClientProtocols = vpnClientProtocols;
            return this;
        }

        public Builder setVpnClientProtocols(@Nullable List<Either<String,VpnClientProtocol>> vpnClientProtocols) {
            this.vpnClientProtocols = Input.ofNullable(vpnClientProtocols);
            return this;
        }

        public Builder setVpnClientRevokedCertificates(@Nullable Input<List<VpnClientRevokedCertificateArgs>> vpnClientRevokedCertificates) {
            this.vpnClientRevokedCertificates = vpnClientRevokedCertificates;
            return this;
        }

        public Builder setVpnClientRevokedCertificates(@Nullable List<VpnClientRevokedCertificateArgs> vpnClientRevokedCertificates) {
            this.vpnClientRevokedCertificates = Input.ofNullable(vpnClientRevokedCertificates);
            return this;
        }

        public Builder setVpnClientRootCertificates(@Nullable Input<List<VpnClientRootCertificateArgs>> vpnClientRootCertificates) {
            this.vpnClientRootCertificates = vpnClientRootCertificates;
            return this;
        }

        public Builder setVpnClientRootCertificates(@Nullable List<VpnClientRootCertificateArgs> vpnClientRootCertificates) {
            this.vpnClientRootCertificates = Input.ofNullable(vpnClientRootCertificates);
            return this;
        }
        public VpnClientConfigurationArgs build() {
            return new VpnClientConfigurationArgs(aadAudience, aadIssuer, aadTenant, radiusServerAddress, radiusServerSecret, radiusServers, vpnAuthenticationTypes, vpnClientAddressPool, vpnClientIpsecPolicies, vpnClientProtocols, vpnClientRevokedCertificates, vpnClientRootCertificates);
        }
    }
}
