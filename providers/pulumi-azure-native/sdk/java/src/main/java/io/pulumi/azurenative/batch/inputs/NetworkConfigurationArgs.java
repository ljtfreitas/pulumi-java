// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.PoolEndpointConfigurationArgs;
import io.pulumi.azurenative.batch.inputs.PublicIPAddressConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The network configuration for a pool.
 * 
 */
public final class NetworkConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkConfigurationArgs Empty = new NetworkConfigurationArgs();

    /**
     * Pool endpoint configuration is only supported on pools with the virtualMachineConfiguration property.
     * 
     */
    @InputImport(name="endpointConfiguration")
    private final @Nullable Input<PoolEndpointConfigurationArgs> endpointConfiguration;

    public Input<PoolEndpointConfigurationArgs> getEndpointConfiguration() {
        return this.endpointConfiguration == null ? Input.empty() : this.endpointConfiguration;
    }

    /**
     * This property is only supported on Pools with the virtualMachineConfiguration property.
     * 
     */
    @InputImport(name="publicIPAddressConfiguration")
    private final @Nullable Input<PublicIPAddressConfigurationArgs> publicIPAddressConfiguration;

    public Input<PublicIPAddressConfigurationArgs> getPublicIPAddressConfiguration() {
        return this.publicIPAddressConfiguration == null ? Input.empty() : this.publicIPAddressConfiguration;
    }

    /**
     * The virtual network must be in the same region and subscription as the Azure Batch account. The specified subnet should have enough free IP addresses to accommodate the number of nodes in the pool. If the subnet doesn't have enough free IP addresses, the pool will partially allocate compute nodes and a resize error will occur. The 'MicrosoftAzureBatch' service principal must have the 'Classic Virtual Machine Contributor' Role-Based Access Control (RBAC) role for the specified VNet. The specified subnet must allow communication from the Azure Batch service to be able to schedule tasks on the compute nodes. This can be verified by checking if the specified VNet has any associated Network Security Groups (NSG). If communication to the compute nodes in the specified subnet is denied by an NSG, then the Batch service will set the state of the compute nodes to unusable. If the specified VNet has any associated Network Security Groups (NSG), then a few reserved system ports must be enabled for inbound communication. For pools created with a virtual machine configuration, enable ports 29876 and 29877, as well as port 22 for Linux and port 3389 for Windows. For pools created with a cloud service configuration, enable ports 10100, 20100, and 30100. Also enable outbound connections to Azure Storage on port 443. For cloudServiceConfiguration pools, only 'classic' VNETs are supported. For more details see: https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration
     * 
     */
    @InputImport(name="subnetId")
    private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    public NetworkConfigurationArgs(
        @Nullable Input<PoolEndpointConfigurationArgs> endpointConfiguration,
        @Nullable Input<PublicIPAddressConfigurationArgs> publicIPAddressConfiguration,
        @Nullable Input<String> subnetId) {
        this.endpointConfiguration = endpointConfiguration;
        this.publicIPAddressConfiguration = publicIPAddressConfiguration;
        this.subnetId = subnetId;
    }

    private NetworkConfigurationArgs() {
        this.endpointConfiguration = Input.empty();
        this.publicIPAddressConfiguration = Input.empty();
        this.subnetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PoolEndpointConfigurationArgs> endpointConfiguration;
        private @Nullable Input<PublicIPAddressConfigurationArgs> publicIPAddressConfiguration;
        private @Nullable Input<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointConfiguration = defaults.endpointConfiguration;
    	      this.publicIPAddressConfiguration = defaults.publicIPAddressConfiguration;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setEndpointConfiguration(@Nullable Input<PoolEndpointConfigurationArgs> endpointConfiguration) {
            this.endpointConfiguration = endpointConfiguration;
            return this;
        }

        public Builder setEndpointConfiguration(@Nullable PoolEndpointConfigurationArgs endpointConfiguration) {
            this.endpointConfiguration = Input.ofNullable(endpointConfiguration);
            return this;
        }

        public Builder setPublicIPAddressConfiguration(@Nullable Input<PublicIPAddressConfigurationArgs> publicIPAddressConfiguration) {
            this.publicIPAddressConfiguration = publicIPAddressConfiguration;
            return this;
        }

        public Builder setPublicIPAddressConfiguration(@Nullable PublicIPAddressConfigurationArgs publicIPAddressConfiguration) {
            this.publicIPAddressConfiguration = Input.ofNullable(publicIPAddressConfiguration);
            return this;
        }

        public Builder setSubnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
            return this;
        }

        public NetworkConfigurationArgs build() {
            return new NetworkConfigurationArgs(endpointConfiguration, publicIPAddressConfiguration, subnetId);
        }
    }
}
