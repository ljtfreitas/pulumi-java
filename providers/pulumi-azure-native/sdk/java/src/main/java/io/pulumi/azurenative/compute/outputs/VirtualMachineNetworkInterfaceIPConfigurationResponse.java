// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.SubResourceResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachinePublicIPAddressConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualMachineNetworkInterfaceIPConfigurationResponse {
    /**
     * Specifies an array of references to backend address pools of application gateways. A virtual machine can reference backend address pools of multiple application gateways. Multiple virtual machines cannot use the same application gateway.
     * 
     */
    private final @Nullable List<SubResourceResponse> applicationGatewayBackendAddressPools;
    /**
     * Specifies an array of references to application security group.
     * 
     */
    private final @Nullable List<SubResourceResponse> applicationSecurityGroups;
    /**
     * Specifies an array of references to backend address pools of load balancers. A virtual machine can reference backend address pools of one public and one internal load balancer. [Multiple virtual machines cannot use the same basic sku load balancer].
     * 
     */
    private final @Nullable List<SubResourceResponse> loadBalancerBackendAddressPools;
    /**
     * The IP configuration name.
     * 
     */
    private final String name;
    /**
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
     */
    private final @Nullable Boolean primary;
    /**
     * Available from Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.  Possible values are: 'IPv4' and 'IPv6'.
     * 
     */
    private final @Nullable String privateIPAddressVersion;
    /**
     * The publicIPAddressConfiguration.
     * 
     */
    private final @Nullable VirtualMachinePublicIPAddressConfigurationResponse publicIPAddressConfiguration;
    /**
     * Specifies the identifier of the subnet.
     * 
     */
    private final @Nullable SubResourceResponse subnet;

    @OutputCustomType.Constructor({"applicationGatewayBackendAddressPools","applicationSecurityGroups","loadBalancerBackendAddressPools","name","primary","privateIPAddressVersion","publicIPAddressConfiguration","subnet"})
    private VirtualMachineNetworkInterfaceIPConfigurationResponse(
        @Nullable List<SubResourceResponse> applicationGatewayBackendAddressPools,
        @Nullable List<SubResourceResponse> applicationSecurityGroups,
        @Nullable List<SubResourceResponse> loadBalancerBackendAddressPools,
        String name,
        @Nullable Boolean primary,
        @Nullable String privateIPAddressVersion,
        @Nullable VirtualMachinePublicIPAddressConfigurationResponse publicIPAddressConfiguration,
        @Nullable SubResourceResponse subnet) {
        this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
        this.applicationSecurityGroups = applicationSecurityGroups;
        this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
        this.name = Objects.requireNonNull(name);
        this.primary = primary;
        this.privateIPAddressVersion = privateIPAddressVersion;
        this.publicIPAddressConfiguration = publicIPAddressConfiguration;
        this.subnet = subnet;
    }

    /**
     * Specifies an array of references to backend address pools of application gateways. A virtual machine can reference backend address pools of multiple application gateways. Multiple virtual machines cannot use the same application gateway.
     * 
     */
    public List<SubResourceResponse> getApplicationGatewayBackendAddressPools() {
        return this.applicationGatewayBackendAddressPools == null ? List.of() : this.applicationGatewayBackendAddressPools;
    }
    /**
     * Specifies an array of references to application security group.
     * 
     */
    public List<SubResourceResponse> getApplicationSecurityGroups() {
        return this.applicationSecurityGroups == null ? List.of() : this.applicationSecurityGroups;
    }
    /**
     * Specifies an array of references to backend address pools of load balancers. A virtual machine can reference backend address pools of one public and one internal load balancer. [Multiple virtual machines cannot use the same basic sku load balancer].
     * 
     */
    public List<SubResourceResponse> getLoadBalancerBackendAddressPools() {
        return this.loadBalancerBackendAddressPools == null ? List.of() : this.loadBalancerBackendAddressPools;
    }
    /**
     * The IP configuration name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
     */
    public Optional<Boolean> getPrimary() {
        return Optional.ofNullable(this.primary);
    }
    /**
     * Available from Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.  Possible values are: 'IPv4' and 'IPv6'.
     * 
     */
    public Optional<String> getPrivateIPAddressVersion() {
        return Optional.ofNullable(this.privateIPAddressVersion);
    }
    /**
     * The publicIPAddressConfiguration.
     * 
     */
    public Optional<VirtualMachinePublicIPAddressConfigurationResponse> getPublicIPAddressConfiguration() {
        return Optional.ofNullable(this.publicIPAddressConfiguration);
    }
    /**
     * Specifies the identifier of the subnet.
     * 
     */
    public Optional<SubResourceResponse> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineNetworkInterfaceIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SubResourceResponse> applicationGatewayBackendAddressPools;
        private @Nullable List<SubResourceResponse> applicationSecurityGroups;
        private @Nullable List<SubResourceResponse> loadBalancerBackendAddressPools;
        private String name;
        private @Nullable Boolean primary;
        private @Nullable String privateIPAddressVersion;
        private @Nullable VirtualMachinePublicIPAddressConfigurationResponse publicIPAddressConfiguration;
        private @Nullable SubResourceResponse subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineNetworkInterfaceIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationGatewayBackendAddressPools = defaults.applicationGatewayBackendAddressPools;
    	      this.applicationSecurityGroups = defaults.applicationSecurityGroups;
    	      this.loadBalancerBackendAddressPools = defaults.loadBalancerBackendAddressPools;
    	      this.name = defaults.name;
    	      this.primary = defaults.primary;
    	      this.privateIPAddressVersion = defaults.privateIPAddressVersion;
    	      this.publicIPAddressConfiguration = defaults.publicIPAddressConfiguration;
    	      this.subnet = defaults.subnet;
        }

        public Builder setApplicationGatewayBackendAddressPools(@Nullable List<SubResourceResponse> applicationGatewayBackendAddressPools) {
            this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
            return this;
        }

        public Builder setApplicationSecurityGroups(@Nullable List<SubResourceResponse> applicationSecurityGroups) {
            this.applicationSecurityGroups = applicationSecurityGroups;
            return this;
        }

        public Builder setLoadBalancerBackendAddressPools(@Nullable List<SubResourceResponse> loadBalancerBackendAddressPools) {
            this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrimary(@Nullable Boolean primary) {
            this.primary = primary;
            return this;
        }

        public Builder setPrivateIPAddressVersion(@Nullable String privateIPAddressVersion) {
            this.privateIPAddressVersion = privateIPAddressVersion;
            return this;
        }

        public Builder setPublicIPAddressConfiguration(@Nullable VirtualMachinePublicIPAddressConfigurationResponse publicIPAddressConfiguration) {
            this.publicIPAddressConfiguration = publicIPAddressConfiguration;
            return this;
        }

        public Builder setSubnet(@Nullable SubResourceResponse subnet) {
            this.subnet = subnet;
            return this;
        }
        public VirtualMachineNetworkInterfaceIPConfigurationResponse build() {
            return new VirtualMachineNetworkInterfaceIPConfigurationResponse(applicationGatewayBackendAddressPools, applicationSecurityGroups, loadBalancerBackendAddressPools, name, primary, privateIPAddressVersion, publicIPAddressConfiguration, subnet);
        }
    }
}
