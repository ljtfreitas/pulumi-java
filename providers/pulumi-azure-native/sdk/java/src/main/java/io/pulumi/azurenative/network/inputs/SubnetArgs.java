// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.VirtualNetworkPrivateEndpointNetworkPolicies;
import io.pulumi.azurenative.network.enums.VirtualNetworkPrivateLinkServiceNetworkPolicies;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayIPConfigurationArgs;
import io.pulumi.azurenative.network.inputs.DelegationArgs;
import io.pulumi.azurenative.network.inputs.NetworkSecurityGroupArgs;
import io.pulumi.azurenative.network.inputs.RouteTableArgs;
import io.pulumi.azurenative.network.inputs.ServiceEndpointPolicyArgs;
import io.pulumi.azurenative.network.inputs.ServiceEndpointPropertiesFormatArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Subnet in a virtual network resource.
 * 
 */
public final class SubnetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetArgs Empty = new SubnetArgs();

    /**
     * The address prefix for the subnet.
     * 
     */
    @InputImport(name="addressPrefix")
        private final @Nullable Input<String> addressPrefix;

    public Input<String> getAddressPrefix() {
        return this.addressPrefix == null ? Input.empty() : this.addressPrefix;
    }

    /**
     * List of address prefixes for the subnet.
     * 
     */
    @InputImport(name="addressPrefixes")
        private final @Nullable Input<List<String>> addressPrefixes;

    public Input<List<String>> getAddressPrefixes() {
        return this.addressPrefixes == null ? Input.empty() : this.addressPrefixes;
    }

    /**
     * Application gateway IP configurations of virtual network resource.
     * 
     */
    @InputImport(name="applicationGatewayIpConfigurations")
        private final @Nullable Input<List<ApplicationGatewayIPConfigurationArgs>> applicationGatewayIpConfigurations;

    public Input<List<ApplicationGatewayIPConfigurationArgs>> getApplicationGatewayIpConfigurations() {
        return this.applicationGatewayIpConfigurations == null ? Input.empty() : this.applicationGatewayIpConfigurations;
    }

    /**
     * An array of references to the delegations on the subnet.
     * 
     */
    @InputImport(name="delegations")
        private final @Nullable Input<List<DelegationArgs>> delegations;

    public Input<List<DelegationArgs>> getDelegations() {
        return this.delegations == null ? Input.empty() : this.delegations;
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
     * Array of IpAllocation which reference this subnet.
     * 
     */
    @InputImport(name="ipAllocations")
        private final @Nullable Input<List<SubResourceArgs>> ipAllocations;

    public Input<List<SubResourceArgs>> getIpAllocations() {
        return this.ipAllocations == null ? Input.empty() : this.ipAllocations;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Nat gateway associated with this subnet.
     * 
     */
    @InputImport(name="natGateway")
        private final @Nullable Input<SubResourceArgs> natGateway;

    public Input<SubResourceArgs> getNatGateway() {
        return this.natGateway == null ? Input.empty() : this.natGateway;
    }

    /**
     * The reference to the NetworkSecurityGroup resource.
     * 
     */
    @InputImport(name="networkSecurityGroup")
        private final @Nullable Input<NetworkSecurityGroupArgs> networkSecurityGroup;

    public Input<NetworkSecurityGroupArgs> getNetworkSecurityGroup() {
        return this.networkSecurityGroup == null ? Input.empty() : this.networkSecurityGroup;
    }

    /**
     * Enable or Disable apply network policies on private end point in the subnet.
     * 
     */
    @InputImport(name="privateEndpointNetworkPolicies")
        private final @Nullable Input<Either<String,VirtualNetworkPrivateEndpointNetworkPolicies>> privateEndpointNetworkPolicies;

    public Input<Either<String,VirtualNetworkPrivateEndpointNetworkPolicies>> getPrivateEndpointNetworkPolicies() {
        return this.privateEndpointNetworkPolicies == null ? Input.empty() : this.privateEndpointNetworkPolicies;
    }

    /**
     * Enable or Disable apply network policies on private link service in the subnet.
     * 
     */
    @InputImport(name="privateLinkServiceNetworkPolicies")
        private final @Nullable Input<Either<String,VirtualNetworkPrivateLinkServiceNetworkPolicies>> privateLinkServiceNetworkPolicies;

    public Input<Either<String,VirtualNetworkPrivateLinkServiceNetworkPolicies>> getPrivateLinkServiceNetworkPolicies() {
        return this.privateLinkServiceNetworkPolicies == null ? Input.empty() : this.privateLinkServiceNetworkPolicies;
    }

    /**
     * The reference to the RouteTable resource.
     * 
     */
    @InputImport(name="routeTable")
        private final @Nullable Input<RouteTableArgs> routeTable;

    public Input<RouteTableArgs> getRouteTable() {
        return this.routeTable == null ? Input.empty() : this.routeTable;
    }

    /**
     * An array of service endpoint policies.
     * 
     */
    @InputImport(name="serviceEndpointPolicies")
        private final @Nullable Input<List<ServiceEndpointPolicyArgs>> serviceEndpointPolicies;

    public Input<List<ServiceEndpointPolicyArgs>> getServiceEndpointPolicies() {
        return this.serviceEndpointPolicies == null ? Input.empty() : this.serviceEndpointPolicies;
    }

    /**
     * An array of service endpoints.
     * 
     */
    @InputImport(name="serviceEndpoints")
        private final @Nullable Input<List<ServiceEndpointPropertiesFormatArgs>> serviceEndpoints;

    public Input<List<ServiceEndpointPropertiesFormatArgs>> getServiceEndpoints() {
        return this.serviceEndpoints == null ? Input.empty() : this.serviceEndpoints;
    }

    /**
     * Resource type.
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public SubnetArgs(
        @Nullable Input<String> addressPrefix,
        @Nullable Input<List<String>> addressPrefixes,
        @Nullable Input<List<ApplicationGatewayIPConfigurationArgs>> applicationGatewayIpConfigurations,
        @Nullable Input<List<DelegationArgs>> delegations,
        @Nullable Input<String> id,
        @Nullable Input<List<SubResourceArgs>> ipAllocations,
        @Nullable Input<String> name,
        @Nullable Input<SubResourceArgs> natGateway,
        @Nullable Input<NetworkSecurityGroupArgs> networkSecurityGroup,
        @Nullable Input<Either<String,VirtualNetworkPrivateEndpointNetworkPolicies>> privateEndpointNetworkPolicies,
        @Nullable Input<Either<String,VirtualNetworkPrivateLinkServiceNetworkPolicies>> privateLinkServiceNetworkPolicies,
        @Nullable Input<RouteTableArgs> routeTable,
        @Nullable Input<List<ServiceEndpointPolicyArgs>> serviceEndpointPolicies,
        @Nullable Input<List<ServiceEndpointPropertiesFormatArgs>> serviceEndpoints,
        @Nullable Input<String> type) {
        this.addressPrefix = addressPrefix;
        this.addressPrefixes = addressPrefixes;
        this.applicationGatewayIpConfigurations = applicationGatewayIpConfigurations;
        this.delegations = delegations;
        this.id = id;
        this.ipAllocations = ipAllocations;
        this.name = name;
        this.natGateway = natGateway;
        this.networkSecurityGroup = networkSecurityGroup;
        this.privateEndpointNetworkPolicies = privateEndpointNetworkPolicies == null ? Input.ofLeft("Enabled") : privateEndpointNetworkPolicies;
        this.privateLinkServiceNetworkPolicies = privateLinkServiceNetworkPolicies == null ? Input.ofLeft("Enabled") : privateLinkServiceNetworkPolicies;
        this.routeTable = routeTable;
        this.serviceEndpointPolicies = serviceEndpointPolicies;
        this.serviceEndpoints = serviceEndpoints;
        this.type = type;
    }

    private SubnetArgs() {
        this.addressPrefix = Input.empty();
        this.addressPrefixes = Input.empty();
        this.applicationGatewayIpConfigurations = Input.empty();
        this.delegations = Input.empty();
        this.id = Input.empty();
        this.ipAllocations = Input.empty();
        this.name = Input.empty();
        this.natGateway = Input.empty();
        this.networkSecurityGroup = Input.empty();
        this.privateEndpointNetworkPolicies = Input.empty();
        this.privateLinkServiceNetworkPolicies = Input.empty();
        this.routeTable = Input.empty();
        this.serviceEndpointPolicies = Input.empty();
        this.serviceEndpoints = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> addressPrefix;
        private @Nullable Input<List<String>> addressPrefixes;
        private @Nullable Input<List<ApplicationGatewayIPConfigurationArgs>> applicationGatewayIpConfigurations;
        private @Nullable Input<List<DelegationArgs>> delegations;
        private @Nullable Input<String> id;
        private @Nullable Input<List<SubResourceArgs>> ipAllocations;
        private @Nullable Input<String> name;
        private @Nullable Input<SubResourceArgs> natGateway;
        private @Nullable Input<NetworkSecurityGroupArgs> networkSecurityGroup;
        private @Nullable Input<Either<String,VirtualNetworkPrivateEndpointNetworkPolicies>> privateEndpointNetworkPolicies;
        private @Nullable Input<Either<String,VirtualNetworkPrivateLinkServiceNetworkPolicies>> privateLinkServiceNetworkPolicies;
        private @Nullable Input<RouteTableArgs> routeTable;
        private @Nullable Input<List<ServiceEndpointPolicyArgs>> serviceEndpointPolicies;
        private @Nullable Input<List<ServiceEndpointPropertiesFormatArgs>> serviceEndpoints;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.addressPrefixes = defaults.addressPrefixes;
    	      this.applicationGatewayIpConfigurations = defaults.applicationGatewayIpConfigurations;
    	      this.delegations = defaults.delegations;
    	      this.id = defaults.id;
    	      this.ipAllocations = defaults.ipAllocations;
    	      this.name = defaults.name;
    	      this.natGateway = defaults.natGateway;
    	      this.networkSecurityGroup = defaults.networkSecurityGroup;
    	      this.privateEndpointNetworkPolicies = defaults.privateEndpointNetworkPolicies;
    	      this.privateLinkServiceNetworkPolicies = defaults.privateLinkServiceNetworkPolicies;
    	      this.routeTable = defaults.routeTable;
    	      this.serviceEndpointPolicies = defaults.serviceEndpointPolicies;
    	      this.serviceEndpoints = defaults.serviceEndpoints;
    	      this.type = defaults.type;
        }

        public Builder setAddressPrefix(@Nullable Input<String> addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }

        public Builder setAddressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = Input.ofNullable(addressPrefix);
            return this;
        }

        public Builder setAddressPrefixes(@Nullable Input<List<String>> addressPrefixes) {
            this.addressPrefixes = addressPrefixes;
            return this;
        }

        public Builder setAddressPrefixes(@Nullable List<String> addressPrefixes) {
            this.addressPrefixes = Input.ofNullable(addressPrefixes);
            return this;
        }

        public Builder setApplicationGatewayIpConfigurations(@Nullable Input<List<ApplicationGatewayIPConfigurationArgs>> applicationGatewayIpConfigurations) {
            this.applicationGatewayIpConfigurations = applicationGatewayIpConfigurations;
            return this;
        }

        public Builder setApplicationGatewayIpConfigurations(@Nullable List<ApplicationGatewayIPConfigurationArgs> applicationGatewayIpConfigurations) {
            this.applicationGatewayIpConfigurations = Input.ofNullable(applicationGatewayIpConfigurations);
            return this;
        }

        public Builder setDelegations(@Nullable Input<List<DelegationArgs>> delegations) {
            this.delegations = delegations;
            return this;
        }

        public Builder setDelegations(@Nullable List<DelegationArgs> delegations) {
            this.delegations = Input.ofNullable(delegations);
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

        public Builder setIpAllocations(@Nullable Input<List<SubResourceArgs>> ipAllocations) {
            this.ipAllocations = ipAllocations;
            return this;
        }

        public Builder setIpAllocations(@Nullable List<SubResourceArgs> ipAllocations) {
            this.ipAllocations = Input.ofNullable(ipAllocations);
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

        public Builder setNatGateway(@Nullable Input<SubResourceArgs> natGateway) {
            this.natGateway = natGateway;
            return this;
        }

        public Builder setNatGateway(@Nullable SubResourceArgs natGateway) {
            this.natGateway = Input.ofNullable(natGateway);
            return this;
        }

        public Builder setNetworkSecurityGroup(@Nullable Input<NetworkSecurityGroupArgs> networkSecurityGroup) {
            this.networkSecurityGroup = networkSecurityGroup;
            return this;
        }

        public Builder setNetworkSecurityGroup(@Nullable NetworkSecurityGroupArgs networkSecurityGroup) {
            this.networkSecurityGroup = Input.ofNullable(networkSecurityGroup);
            return this;
        }

        public Builder setPrivateEndpointNetworkPolicies(@Nullable Input<Either<String,VirtualNetworkPrivateEndpointNetworkPolicies>> privateEndpointNetworkPolicies) {
            this.privateEndpointNetworkPolicies = privateEndpointNetworkPolicies;
            return this;
        }

        public Builder setPrivateEndpointNetworkPolicies(@Nullable Either<String,VirtualNetworkPrivateEndpointNetworkPolicies> privateEndpointNetworkPolicies) {
            this.privateEndpointNetworkPolicies = Input.ofNullable(privateEndpointNetworkPolicies);
            return this;
        }

        public Builder setPrivateLinkServiceNetworkPolicies(@Nullable Input<Either<String,VirtualNetworkPrivateLinkServiceNetworkPolicies>> privateLinkServiceNetworkPolicies) {
            this.privateLinkServiceNetworkPolicies = privateLinkServiceNetworkPolicies;
            return this;
        }

        public Builder setPrivateLinkServiceNetworkPolicies(@Nullable Either<String,VirtualNetworkPrivateLinkServiceNetworkPolicies> privateLinkServiceNetworkPolicies) {
            this.privateLinkServiceNetworkPolicies = Input.ofNullable(privateLinkServiceNetworkPolicies);
            return this;
        }

        public Builder setRouteTable(@Nullable Input<RouteTableArgs> routeTable) {
            this.routeTable = routeTable;
            return this;
        }

        public Builder setRouteTable(@Nullable RouteTableArgs routeTable) {
            this.routeTable = Input.ofNullable(routeTable);
            return this;
        }

        public Builder setServiceEndpointPolicies(@Nullable Input<List<ServiceEndpointPolicyArgs>> serviceEndpointPolicies) {
            this.serviceEndpointPolicies = serviceEndpointPolicies;
            return this;
        }

        public Builder setServiceEndpointPolicies(@Nullable List<ServiceEndpointPolicyArgs> serviceEndpointPolicies) {
            this.serviceEndpointPolicies = Input.ofNullable(serviceEndpointPolicies);
            return this;
        }

        public Builder setServiceEndpoints(@Nullable Input<List<ServiceEndpointPropertiesFormatArgs>> serviceEndpoints) {
            this.serviceEndpoints = serviceEndpoints;
            return this;
        }

        public Builder setServiceEndpoints(@Nullable List<ServiceEndpointPropertiesFormatArgs> serviceEndpoints) {
            this.serviceEndpoints = Input.ofNullable(serviceEndpoints);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public SubnetArgs build() {
            return new SubnetArgs(addressPrefix, addressPrefixes, applicationGatewayIpConfigurations, delegations, id, ipAllocations, name, natGateway, networkSecurityGroup, privateEndpointNetworkPolicies, privateLinkServiceNetworkPolicies, routeTable, serviceEndpointPolicies, serviceEndpoints, type);
        }
    }
}
