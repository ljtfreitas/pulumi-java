// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.VpnGatewayTunnelingProtocol;
import io.pulumi.azurenative.network.inputs.IpsecPolicyArgs;
import io.pulumi.azurenative.network.inputs.P2SVpnServerConfigRadiusClientRootCertificateArgs;
import io.pulumi.azurenative.network.inputs.P2SVpnServerConfigRadiusServerRootCertificateArgs;
import io.pulumi.azurenative.network.inputs.P2SVpnServerConfigVpnClientRevokedCertificateArgs;
import io.pulumi.azurenative.network.inputs.P2SVpnServerConfigVpnClientRootCertificateArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class P2sVpnServerConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final P2sVpnServerConfigurationArgs Empty = new P2sVpnServerConfigurationArgs();

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
        private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The name of the P2SVpnServerConfiguration that is unique within a VirtualWan in a resource group. This name can be used to access the resource along with Paren VirtualWan resource name.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Radius client root certificate of P2SVpnServerConfiguration.
     * 
     */
    @InputImport(name="p2SVpnServerConfigRadiusClientRootCertificates")
        private final @Nullable Input<List<P2SVpnServerConfigRadiusClientRootCertificateArgs>> p2SVpnServerConfigRadiusClientRootCertificates;

    public Input<List<P2SVpnServerConfigRadiusClientRootCertificateArgs>> getP2SVpnServerConfigRadiusClientRootCertificates() {
        return this.p2SVpnServerConfigRadiusClientRootCertificates == null ? Input.empty() : this.p2SVpnServerConfigRadiusClientRootCertificates;
    }

    /**
     * Radius Server root certificate of P2SVpnServerConfiguration.
     * 
     */
    @InputImport(name="p2SVpnServerConfigRadiusServerRootCertificates")
        private final @Nullable Input<List<P2SVpnServerConfigRadiusServerRootCertificateArgs>> p2SVpnServerConfigRadiusServerRootCertificates;

    public Input<List<P2SVpnServerConfigRadiusServerRootCertificateArgs>> getP2SVpnServerConfigRadiusServerRootCertificates() {
        return this.p2SVpnServerConfigRadiusServerRootCertificates == null ? Input.empty() : this.p2SVpnServerConfigRadiusServerRootCertificates;
    }

    /**
     * VPN client revoked certificate of P2SVpnServerConfiguration.
     * 
     */
    @InputImport(name="p2SVpnServerConfigVpnClientRevokedCertificates")
        private final @Nullable Input<List<P2SVpnServerConfigVpnClientRevokedCertificateArgs>> p2SVpnServerConfigVpnClientRevokedCertificates;

    public Input<List<P2SVpnServerConfigVpnClientRevokedCertificateArgs>> getP2SVpnServerConfigVpnClientRevokedCertificates() {
        return this.p2SVpnServerConfigVpnClientRevokedCertificates == null ? Input.empty() : this.p2SVpnServerConfigVpnClientRevokedCertificates;
    }

    /**
     * VPN client root certificate of P2SVpnServerConfiguration.
     * 
     */
    @InputImport(name="p2SVpnServerConfigVpnClientRootCertificates")
        private final @Nullable Input<List<P2SVpnServerConfigVpnClientRootCertificateArgs>> p2SVpnServerConfigVpnClientRootCertificates;

    public Input<List<P2SVpnServerConfigVpnClientRootCertificateArgs>> getP2SVpnServerConfigVpnClientRootCertificates() {
        return this.p2SVpnServerConfigVpnClientRootCertificates == null ? Input.empty() : this.p2SVpnServerConfigVpnClientRootCertificates;
    }

    /**
     * The name of the P2SVpnServerConfiguration.
     * 
     */
    @InputImport(name="p2SVpnServerConfigurationName")
        private final @Nullable Input<String> p2SVpnServerConfigurationName;

    public Input<String> getP2SVpnServerConfigurationName() {
        return this.p2SVpnServerConfigurationName == null ? Input.empty() : this.p2SVpnServerConfigurationName;
    }

    /**
     * The radius server address property of the P2SVpnServerConfiguration resource for point to site client connection.
     * 
     */
    @InputImport(name="radiusServerAddress")
        private final @Nullable Input<String> radiusServerAddress;

    public Input<String> getRadiusServerAddress() {
        return this.radiusServerAddress == null ? Input.empty() : this.radiusServerAddress;
    }

    /**
     * The radius secret property of the P2SVpnServerConfiguration resource for point to site client connection.
     * 
     */
    @InputImport(name="radiusServerSecret")
        private final @Nullable Input<String> radiusServerSecret;

    public Input<String> getRadiusServerSecret() {
        return this.radiusServerSecret == null ? Input.empty() : this.radiusServerSecret;
    }

    /**
     * The resource group name of the VirtualWan.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the VirtualWan.
     * 
     */
    @InputImport(name="virtualWanName", required=true)
        private final Input<String> virtualWanName;

    public Input<String> getVirtualWanName() {
        return this.virtualWanName;
    }

    /**
     * VpnClientIpsecPolicies for P2SVpnServerConfiguration.
     * 
     */
    @InputImport(name="vpnClientIpsecPolicies")
        private final @Nullable Input<List<IpsecPolicyArgs>> vpnClientIpsecPolicies;

    public Input<List<IpsecPolicyArgs>> getVpnClientIpsecPolicies() {
        return this.vpnClientIpsecPolicies == null ? Input.empty() : this.vpnClientIpsecPolicies;
    }

    /**
     * VPN protocols for the P2SVpnServerConfiguration.
     * 
     */
    @InputImport(name="vpnProtocols")
        private final @Nullable Input<List<Either<String,VpnGatewayTunnelingProtocol>>> vpnProtocols;

    public Input<List<Either<String,VpnGatewayTunnelingProtocol>>> getVpnProtocols() {
        return this.vpnProtocols == null ? Input.empty() : this.vpnProtocols;
    }

    public P2sVpnServerConfigurationArgs(
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<List<P2SVpnServerConfigRadiusClientRootCertificateArgs>> p2SVpnServerConfigRadiusClientRootCertificates,
        @Nullable Input<List<P2SVpnServerConfigRadiusServerRootCertificateArgs>> p2SVpnServerConfigRadiusServerRootCertificates,
        @Nullable Input<List<P2SVpnServerConfigVpnClientRevokedCertificateArgs>> p2SVpnServerConfigVpnClientRevokedCertificates,
        @Nullable Input<List<P2SVpnServerConfigVpnClientRootCertificateArgs>> p2SVpnServerConfigVpnClientRootCertificates,
        @Nullable Input<String> p2SVpnServerConfigurationName,
        @Nullable Input<String> radiusServerAddress,
        @Nullable Input<String> radiusServerSecret,
        Input<String> resourceGroupName,
        Input<String> virtualWanName,
        @Nullable Input<List<IpsecPolicyArgs>> vpnClientIpsecPolicies,
        @Nullable Input<List<Either<String,VpnGatewayTunnelingProtocol>>> vpnProtocols) {
        this.id = id;
        this.name = name;
        this.p2SVpnServerConfigRadiusClientRootCertificates = p2SVpnServerConfigRadiusClientRootCertificates;
        this.p2SVpnServerConfigRadiusServerRootCertificates = p2SVpnServerConfigRadiusServerRootCertificates;
        this.p2SVpnServerConfigVpnClientRevokedCertificates = p2SVpnServerConfigVpnClientRevokedCertificates;
        this.p2SVpnServerConfigVpnClientRootCertificates = p2SVpnServerConfigVpnClientRootCertificates;
        this.p2SVpnServerConfigurationName = p2SVpnServerConfigurationName;
        this.radiusServerAddress = radiusServerAddress;
        this.radiusServerSecret = radiusServerSecret;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualWanName = Objects.requireNonNull(virtualWanName, "expected parameter 'virtualWanName' to be non-null");
        this.vpnClientIpsecPolicies = vpnClientIpsecPolicies;
        this.vpnProtocols = vpnProtocols;
    }

    private P2sVpnServerConfigurationArgs() {
        this.id = Input.empty();
        this.name = Input.empty();
        this.p2SVpnServerConfigRadiusClientRootCertificates = Input.empty();
        this.p2SVpnServerConfigRadiusServerRootCertificates = Input.empty();
        this.p2SVpnServerConfigVpnClientRevokedCertificates = Input.empty();
        this.p2SVpnServerConfigVpnClientRootCertificates = Input.empty();
        this.p2SVpnServerConfigurationName = Input.empty();
        this.radiusServerAddress = Input.empty();
        this.radiusServerSecret = Input.empty();
        this.resourceGroupName = Input.empty();
        this.virtualWanName = Input.empty();
        this.vpnClientIpsecPolicies = Input.empty();
        this.vpnProtocols = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(P2sVpnServerConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<List<P2SVpnServerConfigRadiusClientRootCertificateArgs>> p2SVpnServerConfigRadiusClientRootCertificates;
        private @Nullable Input<List<P2SVpnServerConfigRadiusServerRootCertificateArgs>> p2SVpnServerConfigRadiusServerRootCertificates;
        private @Nullable Input<List<P2SVpnServerConfigVpnClientRevokedCertificateArgs>> p2SVpnServerConfigVpnClientRevokedCertificates;
        private @Nullable Input<List<P2SVpnServerConfigVpnClientRootCertificateArgs>> p2SVpnServerConfigVpnClientRootCertificates;
        private @Nullable Input<String> p2SVpnServerConfigurationName;
        private @Nullable Input<String> radiusServerAddress;
        private @Nullable Input<String> radiusServerSecret;
        private Input<String> resourceGroupName;
        private Input<String> virtualWanName;
        private @Nullable Input<List<IpsecPolicyArgs>> vpnClientIpsecPolicies;
        private @Nullable Input<List<Either<String,VpnGatewayTunnelingProtocol>>> vpnProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(P2sVpnServerConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.p2SVpnServerConfigRadiusClientRootCertificates = defaults.p2SVpnServerConfigRadiusClientRootCertificates;
    	      this.p2SVpnServerConfigRadiusServerRootCertificates = defaults.p2SVpnServerConfigRadiusServerRootCertificates;
    	      this.p2SVpnServerConfigVpnClientRevokedCertificates = defaults.p2SVpnServerConfigVpnClientRevokedCertificates;
    	      this.p2SVpnServerConfigVpnClientRootCertificates = defaults.p2SVpnServerConfigVpnClientRootCertificates;
    	      this.p2SVpnServerConfigurationName = defaults.p2SVpnServerConfigurationName;
    	      this.radiusServerAddress = defaults.radiusServerAddress;
    	      this.radiusServerSecret = defaults.radiusServerSecret;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualWanName = defaults.virtualWanName;
    	      this.vpnClientIpsecPolicies = defaults.vpnClientIpsecPolicies;
    	      this.vpnProtocols = defaults.vpnProtocols;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setP2SVpnServerConfigRadiusClientRootCertificates(@Nullable Input<List<P2SVpnServerConfigRadiusClientRootCertificateArgs>> p2SVpnServerConfigRadiusClientRootCertificates) {
            this.p2SVpnServerConfigRadiusClientRootCertificates = p2SVpnServerConfigRadiusClientRootCertificates;
            return this;
        }

        public Builder setP2SVpnServerConfigRadiusClientRootCertificates(@Nullable List<P2SVpnServerConfigRadiusClientRootCertificateArgs> p2SVpnServerConfigRadiusClientRootCertificates) {
            this.p2SVpnServerConfigRadiusClientRootCertificates = Input.ofNullable(p2SVpnServerConfigRadiusClientRootCertificates);
            return this;
        }

        public Builder setP2SVpnServerConfigRadiusServerRootCertificates(@Nullable Input<List<P2SVpnServerConfigRadiusServerRootCertificateArgs>> p2SVpnServerConfigRadiusServerRootCertificates) {
            this.p2SVpnServerConfigRadiusServerRootCertificates = p2SVpnServerConfigRadiusServerRootCertificates;
            return this;
        }

        public Builder setP2SVpnServerConfigRadiusServerRootCertificates(@Nullable List<P2SVpnServerConfigRadiusServerRootCertificateArgs> p2SVpnServerConfigRadiusServerRootCertificates) {
            this.p2SVpnServerConfigRadiusServerRootCertificates = Input.ofNullable(p2SVpnServerConfigRadiusServerRootCertificates);
            return this;
        }

        public Builder setP2SVpnServerConfigVpnClientRevokedCertificates(@Nullable Input<List<P2SVpnServerConfigVpnClientRevokedCertificateArgs>> p2SVpnServerConfigVpnClientRevokedCertificates) {
            this.p2SVpnServerConfigVpnClientRevokedCertificates = p2SVpnServerConfigVpnClientRevokedCertificates;
            return this;
        }

        public Builder setP2SVpnServerConfigVpnClientRevokedCertificates(@Nullable List<P2SVpnServerConfigVpnClientRevokedCertificateArgs> p2SVpnServerConfigVpnClientRevokedCertificates) {
            this.p2SVpnServerConfigVpnClientRevokedCertificates = Input.ofNullable(p2SVpnServerConfigVpnClientRevokedCertificates);
            return this;
        }

        public Builder setP2SVpnServerConfigVpnClientRootCertificates(@Nullable Input<List<P2SVpnServerConfigVpnClientRootCertificateArgs>> p2SVpnServerConfigVpnClientRootCertificates) {
            this.p2SVpnServerConfigVpnClientRootCertificates = p2SVpnServerConfigVpnClientRootCertificates;
            return this;
        }

        public Builder setP2SVpnServerConfigVpnClientRootCertificates(@Nullable List<P2SVpnServerConfigVpnClientRootCertificateArgs> p2SVpnServerConfigVpnClientRootCertificates) {
            this.p2SVpnServerConfigVpnClientRootCertificates = Input.ofNullable(p2SVpnServerConfigVpnClientRootCertificates);
            return this;
        }

        public Builder setP2SVpnServerConfigurationName(@Nullable Input<String> p2SVpnServerConfigurationName) {
            this.p2SVpnServerConfigurationName = p2SVpnServerConfigurationName;
            return this;
        }

        public Builder setP2SVpnServerConfigurationName(@Nullable String p2SVpnServerConfigurationName) {
            this.p2SVpnServerConfigurationName = Input.ofNullable(p2SVpnServerConfigurationName);
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setVirtualWanName(Input<String> virtualWanName) {
            this.virtualWanName = Objects.requireNonNull(virtualWanName);
            return this;
        }

        public Builder setVirtualWanName(String virtualWanName) {
            this.virtualWanName = Input.of(Objects.requireNonNull(virtualWanName));
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

        public Builder setVpnProtocols(@Nullable Input<List<Either<String,VpnGatewayTunnelingProtocol>>> vpnProtocols) {
            this.vpnProtocols = vpnProtocols;
            return this;
        }

        public Builder setVpnProtocols(@Nullable List<Either<String,VpnGatewayTunnelingProtocol>> vpnProtocols) {
            this.vpnProtocols = Input.ofNullable(vpnProtocols);
            return this;
        }
        public P2sVpnServerConfigurationArgs build() {
            return new P2sVpnServerConfigurationArgs(id, name, p2SVpnServerConfigRadiusClientRootCertificates, p2SVpnServerConfigRadiusServerRootCertificates, p2SVpnServerConfigVpnClientRevokedCertificates, p2SVpnServerConfigVpnClientRootCertificates, p2SVpnServerConfigurationName, radiusServerAddress, radiusServerSecret, resourceGroupName, virtualWanName, vpnClientIpsecPolicies, vpnProtocols);
        }
    }
}
