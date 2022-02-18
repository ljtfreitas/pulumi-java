// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.azurenative.hybridnetwork.enums.VMSwitchType;
import io.pulumi.azurenative.hybridnetwork.inputs.NetworkInterfaceIPConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network interface properties.
 * 
 */
public final class NetworkInterfaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceArgs Empty = new NetworkInterfaceArgs();

    /**
     * A list of IP configurations of the network interface.
     * 
     */
    @InputImport(name="ipConfigurations")
    private final @Nullable Input<List<NetworkInterfaceIPConfigurationArgs>> ipConfigurations;

    public Input<List<NetworkInterfaceIPConfigurationArgs>> getIpConfigurations() {
        return this.ipConfigurations == null ? Input.empty() : this.ipConfigurations;
    }

    /**
     * The MAC address of the network interface.
     * 
     */
    @InputImport(name="macAddress")
    private final @Nullable Input<String> macAddress;

    public Input<String> getMacAddress() {
        return this.macAddress == null ? Input.empty() : this.macAddress;
    }

    /**
     * The name of the network interface.
     * 
     */
    @InputImport(name="networkInterfaceName")
    private final @Nullable Input<String> networkInterfaceName;

    public Input<String> getNetworkInterfaceName() {
        return this.networkInterfaceName == null ? Input.empty() : this.networkInterfaceName;
    }

    /**
     * The type of the VM switch.
     * 
     */
    @InputImport(name="vmSwitchType")
    private final @Nullable Input<Either<String,VMSwitchType>> vmSwitchType;

    public Input<Either<String,VMSwitchType>> getVmSwitchType() {
        return this.vmSwitchType == null ? Input.empty() : this.vmSwitchType;
    }

    public NetworkInterfaceArgs(
        @Nullable Input<List<NetworkInterfaceIPConfigurationArgs>> ipConfigurations,
        @Nullable Input<String> macAddress,
        @Nullable Input<String> networkInterfaceName,
        @Nullable Input<Either<String,VMSwitchType>> vmSwitchType) {
        this.ipConfigurations = ipConfigurations;
        this.macAddress = macAddress;
        this.networkInterfaceName = networkInterfaceName;
        this.vmSwitchType = vmSwitchType;
    }

    private NetworkInterfaceArgs() {
        this.ipConfigurations = Input.empty();
        this.macAddress = Input.empty();
        this.networkInterfaceName = Input.empty();
        this.vmSwitchType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<NetworkInterfaceIPConfigurationArgs>> ipConfigurations;
        private @Nullable Input<String> macAddress;
        private @Nullable Input<String> networkInterfaceName;
        private @Nullable Input<Either<String,VMSwitchType>> vmSwitchType;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.macAddress = defaults.macAddress;
    	      this.networkInterfaceName = defaults.networkInterfaceName;
    	      this.vmSwitchType = defaults.vmSwitchType;
        }

        public Builder setIpConfigurations(@Nullable Input<List<NetworkInterfaceIPConfigurationArgs>> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }

        public Builder setIpConfigurations(@Nullable List<NetworkInterfaceIPConfigurationArgs> ipConfigurations) {
            this.ipConfigurations = Input.ofNullable(ipConfigurations);
            return this;
        }

        public Builder setMacAddress(@Nullable Input<String> macAddress) {
            this.macAddress = macAddress;
            return this;
        }

        public Builder setMacAddress(@Nullable String macAddress) {
            this.macAddress = Input.ofNullable(macAddress);
            return this;
        }

        public Builder setNetworkInterfaceName(@Nullable Input<String> networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }

        public Builder setNetworkInterfaceName(@Nullable String networkInterfaceName) {
            this.networkInterfaceName = Input.ofNullable(networkInterfaceName);
            return this;
        }

        public Builder setVmSwitchType(@Nullable Input<Either<String,VMSwitchType>> vmSwitchType) {
            this.vmSwitchType = vmSwitchType;
            return this;
        }

        public Builder setVmSwitchType(@Nullable Either<String,VMSwitchType> vmSwitchType) {
            this.vmSwitchType = Input.ofNullable(vmSwitchType);
            return this;
        }

        public NetworkInterfaceArgs build() {
            return new NetworkInterfaceArgs(ipConfigurations, macAddress, networkInterfaceName, vmSwitchType);
        }
    }
}
