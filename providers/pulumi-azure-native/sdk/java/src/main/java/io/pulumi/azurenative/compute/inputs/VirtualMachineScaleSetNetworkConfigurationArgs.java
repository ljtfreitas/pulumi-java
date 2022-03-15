// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.DeleteOptions;
import io.pulumi.azurenative.compute.inputs.SubResourceArgs;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetIPConfigurationArgs;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set network profile's network configurations.
 * 
 */
public final class VirtualMachineScaleSetNetworkConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetNetworkConfigurationArgs Empty = new VirtualMachineScaleSetNetworkConfigurationArgs();

    /**
     * Specify what happens to the network interface when the VM is deleted
     * 
     */
    @Import(name="deleteOption")
      private final @Nullable Output<Either<String,DeleteOptions>> deleteOption;

    public Output<Either<String,DeleteOptions>> getDeleteOption() {
        return this.deleteOption == null ? Output.empty() : this.deleteOption;
    }

    /**
     * The dns settings to be applied on the network interfaces.
     * 
     */
    @Import(name="dnsSettings")
      private final @Nullable Output<VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs> dnsSettings;

    public Output<VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs> getDnsSettings() {
        return this.dnsSettings == null ? Output.empty() : this.dnsSettings;
    }

    /**
     * Specifies whether the network interface is accelerated networking-enabled.
     * 
     */
    @Import(name="enableAcceleratedNetworking")
      private final @Nullable Output<Boolean> enableAcceleratedNetworking;

    public Output<Boolean> getEnableAcceleratedNetworking() {
        return this.enableAcceleratedNetworking == null ? Output.empty() : this.enableAcceleratedNetworking;
    }

    /**
     * Specifies whether the network interface is FPGA networking-enabled.
     * 
     */
    @Import(name="enableFpga")
      private final @Nullable Output<Boolean> enableFpga;

    public Output<Boolean> getEnableFpga() {
        return this.enableFpga == null ? Output.empty() : this.enableFpga;
    }

    /**
     * Whether IP forwarding enabled on this NIC.
     * 
     */
    @Import(name="enableIPForwarding")
      private final @Nullable Output<Boolean> enableIPForwarding;

    public Output<Boolean> getEnableIPForwarding() {
        return this.enableIPForwarding == null ? Output.empty() : this.enableIPForwarding;
    }

    /**
     * Resource Id
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * Specifies the IP configurations of the network interface.
     * 
     */
    @Import(name="ipConfigurations", required=true)
      private final Output<List<VirtualMachineScaleSetIPConfigurationArgs>> ipConfigurations;

    public Output<List<VirtualMachineScaleSetIPConfigurationArgs>> getIpConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * The network configuration name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The network security group.
     * 
     */
    @Import(name="networkSecurityGroup")
      private final @Nullable Output<SubResourceArgs> networkSecurityGroup;

    public Output<SubResourceArgs> getNetworkSecurityGroup() {
        return this.networkSecurityGroup == null ? Output.empty() : this.networkSecurityGroup;
    }

    /**
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
     */
    @Import(name="primary")
      private final @Nullable Output<Boolean> primary;

    public Output<Boolean> getPrimary() {
        return this.primary == null ? Output.empty() : this.primary;
    }

    public VirtualMachineScaleSetNetworkConfigurationArgs(
        @Nullable Output<Either<String,DeleteOptions>> deleteOption,
        @Nullable Output<VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs> dnsSettings,
        @Nullable Output<Boolean> enableAcceleratedNetworking,
        @Nullable Output<Boolean> enableFpga,
        @Nullable Output<Boolean> enableIPForwarding,
        @Nullable Output<String> id,
        Output<List<VirtualMachineScaleSetIPConfigurationArgs>> ipConfigurations,
        Output<String> name,
        @Nullable Output<SubResourceArgs> networkSecurityGroup,
        @Nullable Output<Boolean> primary) {
        this.deleteOption = deleteOption;
        this.dnsSettings = dnsSettings;
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        this.enableFpga = enableFpga;
        this.enableIPForwarding = enableIPForwarding;
        this.id = id;
        this.ipConfigurations = Objects.requireNonNull(ipConfigurations, "expected parameter 'ipConfigurations' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.networkSecurityGroup = networkSecurityGroup;
        this.primary = primary;
    }

    private VirtualMachineScaleSetNetworkConfigurationArgs() {
        this.deleteOption = Output.empty();
        this.dnsSettings = Output.empty();
        this.enableAcceleratedNetworking = Output.empty();
        this.enableFpga = Output.empty();
        this.enableIPForwarding = Output.empty();
        this.id = Output.empty();
        this.ipConfigurations = Output.empty();
        this.name = Output.empty();
        this.networkSecurityGroup = Output.empty();
        this.primary = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,DeleteOptions>> deleteOption;
        private @Nullable Output<VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs> dnsSettings;
        private @Nullable Output<Boolean> enableAcceleratedNetworking;
        private @Nullable Output<Boolean> enableFpga;
        private @Nullable Output<Boolean> enableIPForwarding;
        private @Nullable Output<String> id;
        private Output<List<VirtualMachineScaleSetIPConfigurationArgs>> ipConfigurations;
        private Output<String> name;
        private @Nullable Output<SubResourceArgs> networkSecurityGroup;
        private @Nullable Output<Boolean> primary;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetNetworkConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOption = defaults.deleteOption;
    	      this.dnsSettings = defaults.dnsSettings;
    	      this.enableAcceleratedNetworking = defaults.enableAcceleratedNetworking;
    	      this.enableFpga = defaults.enableFpga;
    	      this.enableIPForwarding = defaults.enableIPForwarding;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.name = defaults.name;
    	      this.networkSecurityGroup = defaults.networkSecurityGroup;
    	      this.primary = defaults.primary;
        }

        public Builder deleteOption(@Nullable Output<Either<String,DeleteOptions>> deleteOption) {
            this.deleteOption = deleteOption;
            return this;
        }

        public Builder deleteOption(@Nullable Either<String,DeleteOptions> deleteOption) {
            this.deleteOption = Output.ofNullable(deleteOption);
            return this;
        }

        public Builder dnsSettings(@Nullable Output<VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs> dnsSettings) {
            this.dnsSettings = dnsSettings;
            return this;
        }

        public Builder dnsSettings(@Nullable VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs dnsSettings) {
            this.dnsSettings = Output.ofNullable(dnsSettings);
            return this;
        }

        public Builder enableAcceleratedNetworking(@Nullable Output<Boolean> enableAcceleratedNetworking) {
            this.enableAcceleratedNetworking = enableAcceleratedNetworking;
            return this;
        }

        public Builder enableAcceleratedNetworking(@Nullable Boolean enableAcceleratedNetworking) {
            this.enableAcceleratedNetworking = Output.ofNullable(enableAcceleratedNetworking);
            return this;
        }

        public Builder enableFpga(@Nullable Output<Boolean> enableFpga) {
            this.enableFpga = enableFpga;
            return this;
        }

        public Builder enableFpga(@Nullable Boolean enableFpga) {
            this.enableFpga = Output.ofNullable(enableFpga);
            return this;
        }

        public Builder enableIPForwarding(@Nullable Output<Boolean> enableIPForwarding) {
            this.enableIPForwarding = enableIPForwarding;
            return this;
        }

        public Builder enableIPForwarding(@Nullable Boolean enableIPForwarding) {
            this.enableIPForwarding = Output.ofNullable(enableIPForwarding);
            return this;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }

        public Builder ipConfigurations(Output<List<VirtualMachineScaleSetIPConfigurationArgs>> ipConfigurations) {
            this.ipConfigurations = Objects.requireNonNull(ipConfigurations);
            return this;
        }

        public Builder ipConfigurations(List<VirtualMachineScaleSetIPConfigurationArgs> ipConfigurations) {
            this.ipConfigurations = Output.of(Objects.requireNonNull(ipConfigurations));
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder networkSecurityGroup(@Nullable Output<SubResourceArgs> networkSecurityGroup) {
            this.networkSecurityGroup = networkSecurityGroup;
            return this;
        }

        public Builder networkSecurityGroup(@Nullable SubResourceArgs networkSecurityGroup) {
            this.networkSecurityGroup = Output.ofNullable(networkSecurityGroup);
            return this;
        }

        public Builder primary(@Nullable Output<Boolean> primary) {
            this.primary = primary;
            return this;
        }

        public Builder primary(@Nullable Boolean primary) {
            this.primary = Output.ofNullable(primary);
            return this;
        }
        public VirtualMachineScaleSetNetworkConfigurationArgs build() {
            return new VirtualMachineScaleSetNetworkConfigurationArgs(deleteOption, dnsSettings, enableAcceleratedNetworking, enableFpga, enableIPForwarding, id, ipConfigurations, name, networkSecurityGroup, primary);
        }
    }
}
