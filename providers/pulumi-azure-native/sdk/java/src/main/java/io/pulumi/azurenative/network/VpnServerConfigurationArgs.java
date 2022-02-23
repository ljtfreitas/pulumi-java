// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.VpnAuthenticationType;
import io.pulumi.azurenative.network.enums.VpnGatewayTunnelingProtocol;
import io.pulumi.azurenative.network.inputs.AadAuthenticationParametersArgs;
import io.pulumi.azurenative.network.inputs.IpsecPolicyArgs;
import io.pulumi.azurenative.network.inputs.RadiusServerArgs;
import io.pulumi.azurenative.network.inputs.VpnServerConfigRadiusClientRootCertificateArgs;
import io.pulumi.azurenative.network.inputs.VpnServerConfigRadiusServerRootCertificateArgs;
import io.pulumi.azurenative.network.inputs.VpnServerConfigVpnClientRevokedCertificateArgs;
import io.pulumi.azurenative.network.inputs.VpnServerConfigVpnClientRootCertificateArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpnServerConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnServerConfigurationArgs Empty = new VpnServerConfigurationArgs();

    /**
     * The set of aad vpn authentication parameters.
     * 
     */
    @InputImport(name="aadAuthenticationParameters")
        private final @Nullable Input<AadAuthenticationParametersArgs> aadAuthenticationParameters;

    public Input<AadAuthenticationParametersArgs> getAadAuthenticationParameters() {
        return this.aadAuthenticationParameters == null ? Input.empty() : this.aadAuthenticationParameters;
    }

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
     * Resource location.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the VpnServerConfiguration that is unique within a resource group.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Radius client root certificate of VpnServerConfiguration.
     * 
     */
    @InputImport(name="radiusClientRootCertificates")
        private final @Nullable Input<List<VpnServerConfigRadiusClientRootCertificateArgs>> radiusClientRootCertificates;

    public Input<List<VpnServerConfigRadiusClientRootCertificateArgs>> getRadiusClientRootCertificates() {
        return this.radiusClientRootCertificates == null ? Input.empty() : this.radiusClientRootCertificates;
    }

    /**
     * The radius server address property of the VpnServerConfiguration resource for point to site client connection.
     * 
     */
    @InputImport(name="radiusServerAddress")
        private final @Nullable Input<String> radiusServerAddress;

    public Input<String> getRadiusServerAddress() {
        return this.radiusServerAddress == null ? Input.empty() : this.radiusServerAddress;
    }

    /**
     * Radius Server root certificate of VpnServerConfiguration.
     * 
     */
    @InputImport(name="radiusServerRootCertificates")
        private final @Nullable Input<List<VpnServerConfigRadiusServerRootCertificateArgs>> radiusServerRootCertificates;

    public Input<List<VpnServerConfigRadiusServerRootCertificateArgs>> getRadiusServerRootCertificates() {
        return this.radiusServerRootCertificates == null ? Input.empty() : this.radiusServerRootCertificates;
    }

    /**
     * The radius secret property of the VpnServerConfiguration resource for point to site client connection.
     * 
     */
    @InputImport(name="radiusServerSecret")
        private final @Nullable Input<String> radiusServerSecret;

    public Input<String> getRadiusServerSecret() {
        return this.radiusServerSecret == null ? Input.empty() : this.radiusServerSecret;
    }

    /**
     * Multiple Radius Server configuration for VpnServerConfiguration.
     * 
     */
    @InputImport(name="radiusServers")
        private final @Nullable Input<List<RadiusServerArgs>> radiusServers;

    public Input<List<RadiusServerArgs>> getRadiusServers() {
        return this.radiusServers == null ? Input.empty() : this.radiusServers;
    }

    /**
     * The resource group name of the VpnServerConfiguration.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * VPN authentication types for the VpnServerConfiguration.
     * 
     */
    @InputImport(name="vpnAuthenticationTypes")
        private final @Nullable Input<List<Either<String,VpnAuthenticationType>>> vpnAuthenticationTypes;

    public Input<List<Either<String,VpnAuthenticationType>>> getVpnAuthenticationTypes() {
        return this.vpnAuthenticationTypes == null ? Input.empty() : this.vpnAuthenticationTypes;
    }

    /**
     * VpnClientIpsecPolicies for VpnServerConfiguration.
     * 
     */
    @InputImport(name="vpnClientIpsecPolicies")
        private final @Nullable Input<List<IpsecPolicyArgs>> vpnClientIpsecPolicies;

    public Input<List<IpsecPolicyArgs>> getVpnClientIpsecPolicies() {
        return this.vpnClientIpsecPolicies == null ? Input.empty() : this.vpnClientIpsecPolicies;
    }

    /**
     * VPN client revoked certificate of VpnServerConfiguration.
     * 
     */
    @InputImport(name="vpnClientRevokedCertificates")
        private final @Nullable Input<List<VpnServerConfigVpnClientRevokedCertificateArgs>> vpnClientRevokedCertificates;

    public Input<List<VpnServerConfigVpnClientRevokedCertificateArgs>> getVpnClientRevokedCertificates() {
        return this.vpnClientRevokedCertificates == null ? Input.empty() : this.vpnClientRevokedCertificates;
    }

    /**
     * VPN client root certificate of VpnServerConfiguration.
     * 
     */
    @InputImport(name="vpnClientRootCertificates")
        private final @Nullable Input<List<VpnServerConfigVpnClientRootCertificateArgs>> vpnClientRootCertificates;

    public Input<List<VpnServerConfigVpnClientRootCertificateArgs>> getVpnClientRootCertificates() {
        return this.vpnClientRootCertificates == null ? Input.empty() : this.vpnClientRootCertificates;
    }

    /**
     * VPN protocols for the VpnServerConfiguration.
     * 
     */
    @InputImport(name="vpnProtocols")
        private final @Nullable Input<List<Either<String,VpnGatewayTunnelingProtocol>>> vpnProtocols;

    public Input<List<Either<String,VpnGatewayTunnelingProtocol>>> getVpnProtocols() {
        return this.vpnProtocols == null ? Input.empty() : this.vpnProtocols;
    }

    /**
     * The name of the VpnServerConfiguration being created or updated.
     * 
     */
    @InputImport(name="vpnServerConfigurationName")
        private final @Nullable Input<String> vpnServerConfigurationName;

    public Input<String> getVpnServerConfigurationName() {
        return this.vpnServerConfigurationName == null ? Input.empty() : this.vpnServerConfigurationName;
    }

    public VpnServerConfigurationArgs(
        @Nullable Input<AadAuthenticationParametersArgs> aadAuthenticationParameters,
        @Nullable Input<String> id,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<List<VpnServerConfigRadiusClientRootCertificateArgs>> radiusClientRootCertificates,
        @Nullable Input<String> radiusServerAddress,
        @Nullable Input<List<VpnServerConfigRadiusServerRootCertificateArgs>> radiusServerRootCertificates,
        @Nullable Input<String> radiusServerSecret,
        @Nullable Input<List<RadiusServerArgs>> radiusServers,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<Either<String,VpnAuthenticationType>>> vpnAuthenticationTypes,
        @Nullable Input<List<IpsecPolicyArgs>> vpnClientIpsecPolicies,
        @Nullable Input<List<VpnServerConfigVpnClientRevokedCertificateArgs>> vpnClientRevokedCertificates,
        @Nullable Input<List<VpnServerConfigVpnClientRootCertificateArgs>> vpnClientRootCertificates,
        @Nullable Input<List<Either<String,VpnGatewayTunnelingProtocol>>> vpnProtocols,
        @Nullable Input<String> vpnServerConfigurationName) {
        this.aadAuthenticationParameters = aadAuthenticationParameters;
        this.id = id;
        this.location = location;
        this.name = name;
        this.radiusClientRootCertificates = radiusClientRootCertificates;
        this.radiusServerAddress = radiusServerAddress;
        this.radiusServerRootCertificates = radiusServerRootCertificates;
        this.radiusServerSecret = radiusServerSecret;
        this.radiusServers = radiusServers;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.vpnAuthenticationTypes = vpnAuthenticationTypes;
        this.vpnClientIpsecPolicies = vpnClientIpsecPolicies;
        this.vpnClientRevokedCertificates = vpnClientRevokedCertificates;
        this.vpnClientRootCertificates = vpnClientRootCertificates;
        this.vpnProtocols = vpnProtocols;
        this.vpnServerConfigurationName = vpnServerConfigurationName;
    }

    private VpnServerConfigurationArgs() {
        this.aadAuthenticationParameters = Input.empty();
        this.id = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.radiusClientRootCertificates = Input.empty();
        this.radiusServerAddress = Input.empty();
        this.radiusServerRootCertificates = Input.empty();
        this.radiusServerSecret = Input.empty();
        this.radiusServers = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.vpnAuthenticationTypes = Input.empty();
        this.vpnClientIpsecPolicies = Input.empty();
        this.vpnClientRevokedCertificates = Input.empty();
        this.vpnClientRootCertificates = Input.empty();
        this.vpnProtocols = Input.empty();
        this.vpnServerConfigurationName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnServerConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AadAuthenticationParametersArgs> aadAuthenticationParameters;
        private @Nullable Input<String> id;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<List<VpnServerConfigRadiusClientRootCertificateArgs>> radiusClientRootCertificates;
        private @Nullable Input<String> radiusServerAddress;
        private @Nullable Input<List<VpnServerConfigRadiusServerRootCertificateArgs>> radiusServerRootCertificates;
        private @Nullable Input<String> radiusServerSecret;
        private @Nullable Input<List<RadiusServerArgs>> radiusServers;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<Either<String,VpnAuthenticationType>>> vpnAuthenticationTypes;
        private @Nullable Input<List<IpsecPolicyArgs>> vpnClientIpsecPolicies;
        private @Nullable Input<List<VpnServerConfigVpnClientRevokedCertificateArgs>> vpnClientRevokedCertificates;
        private @Nullable Input<List<VpnServerConfigVpnClientRootCertificateArgs>> vpnClientRootCertificates;
        private @Nullable Input<List<Either<String,VpnGatewayTunnelingProtocol>>> vpnProtocols;
        private @Nullable Input<String> vpnServerConfigurationName;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnServerConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadAuthenticationParameters = defaults.aadAuthenticationParameters;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.radiusClientRootCertificates = defaults.radiusClientRootCertificates;
    	      this.radiusServerAddress = defaults.radiusServerAddress;
    	      this.radiusServerRootCertificates = defaults.radiusServerRootCertificates;
    	      this.radiusServerSecret = defaults.radiusServerSecret;
    	      this.radiusServers = defaults.radiusServers;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.vpnAuthenticationTypes = defaults.vpnAuthenticationTypes;
    	      this.vpnClientIpsecPolicies = defaults.vpnClientIpsecPolicies;
    	      this.vpnClientRevokedCertificates = defaults.vpnClientRevokedCertificates;
    	      this.vpnClientRootCertificates = defaults.vpnClientRootCertificates;
    	      this.vpnProtocols = defaults.vpnProtocols;
    	      this.vpnServerConfigurationName = defaults.vpnServerConfigurationName;
        }

        public Builder setAadAuthenticationParameters(@Nullable Input<AadAuthenticationParametersArgs> aadAuthenticationParameters) {
            this.aadAuthenticationParameters = aadAuthenticationParameters;
            return this;
        }

        public Builder setAadAuthenticationParameters(@Nullable AadAuthenticationParametersArgs aadAuthenticationParameters) {
            this.aadAuthenticationParameters = Input.ofNullable(aadAuthenticationParameters);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setRadiusClientRootCertificates(@Nullable Input<List<VpnServerConfigRadiusClientRootCertificateArgs>> radiusClientRootCertificates) {
            this.radiusClientRootCertificates = radiusClientRootCertificates;
            return this;
        }

        public Builder setRadiusClientRootCertificates(@Nullable List<VpnServerConfigRadiusClientRootCertificateArgs> radiusClientRootCertificates) {
            this.radiusClientRootCertificates = Input.ofNullable(radiusClientRootCertificates);
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

        public Builder setRadiusServerRootCertificates(@Nullable Input<List<VpnServerConfigRadiusServerRootCertificateArgs>> radiusServerRootCertificates) {
            this.radiusServerRootCertificates = radiusServerRootCertificates;
            return this;
        }

        public Builder setRadiusServerRootCertificates(@Nullable List<VpnServerConfigRadiusServerRootCertificateArgs> radiusServerRootCertificates) {
            this.radiusServerRootCertificates = Input.ofNullable(radiusServerRootCertificates);
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
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

        public Builder setVpnClientIpsecPolicies(@Nullable Input<List<IpsecPolicyArgs>> vpnClientIpsecPolicies) {
            this.vpnClientIpsecPolicies = vpnClientIpsecPolicies;
            return this;
        }

        public Builder setVpnClientIpsecPolicies(@Nullable List<IpsecPolicyArgs> vpnClientIpsecPolicies) {
            this.vpnClientIpsecPolicies = Input.ofNullable(vpnClientIpsecPolicies);
            return this;
        }

        public Builder setVpnClientRevokedCertificates(@Nullable Input<List<VpnServerConfigVpnClientRevokedCertificateArgs>> vpnClientRevokedCertificates) {
            this.vpnClientRevokedCertificates = vpnClientRevokedCertificates;
            return this;
        }

        public Builder setVpnClientRevokedCertificates(@Nullable List<VpnServerConfigVpnClientRevokedCertificateArgs> vpnClientRevokedCertificates) {
            this.vpnClientRevokedCertificates = Input.ofNullable(vpnClientRevokedCertificates);
            return this;
        }

        public Builder setVpnClientRootCertificates(@Nullable Input<List<VpnServerConfigVpnClientRootCertificateArgs>> vpnClientRootCertificates) {
            this.vpnClientRootCertificates = vpnClientRootCertificates;
            return this;
        }

        public Builder setVpnClientRootCertificates(@Nullable List<VpnServerConfigVpnClientRootCertificateArgs> vpnClientRootCertificates) {
            this.vpnClientRootCertificates = Input.ofNullable(vpnClientRootCertificates);
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

        public Builder setVpnServerConfigurationName(@Nullable Input<String> vpnServerConfigurationName) {
            this.vpnServerConfigurationName = vpnServerConfigurationName;
            return this;
        }

        public Builder setVpnServerConfigurationName(@Nullable String vpnServerConfigurationName) {
            this.vpnServerConfigurationName = Input.ofNullable(vpnServerConfigurationName);
            return this;
        }
        public VpnServerConfigurationArgs build() {
            return new VpnServerConfigurationArgs(aadAuthenticationParameters, id, location, name, radiusClientRootCertificates, radiusServerAddress, radiusServerRootCertificates, radiusServerSecret, radiusServers, resourceGroupName, tags, vpnAuthenticationTypes, vpnClientIpsecPolicies, vpnClientRevokedCertificates, vpnClientRootCertificates, vpnProtocols, vpnServerConfigurationName);
        }
    }
}
