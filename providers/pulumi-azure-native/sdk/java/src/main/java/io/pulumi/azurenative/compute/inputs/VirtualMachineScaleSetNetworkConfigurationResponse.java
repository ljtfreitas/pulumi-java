// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.SubResourceResponse;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetIPConfigurationResponse;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set network profile's network configurations.
 * 
 */
public final class VirtualMachineScaleSetNetworkConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetNetworkConfigurationResponse Empty = new VirtualMachineScaleSetNetworkConfigurationResponse();

    /**
     * Specify what happens to the network interface when the VM is deleted
     * 
     */
    @Import(name="deleteOption")
      private final @Nullable String deleteOption;

    public Optional<String> getDeleteOption() {
        return this.deleteOption == null ? Optional.empty() : Optional.ofNullable(this.deleteOption);
    }

    /**
     * The dns settings to be applied on the network interfaces.
     * 
     */
    @Import(name="dnsSettings")
      private final @Nullable VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse dnsSettings;

    public Optional<VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse> getDnsSettings() {
        return this.dnsSettings == null ? Optional.empty() : Optional.ofNullable(this.dnsSettings);
    }

    /**
     * Specifies whether the network interface is accelerated networking-enabled.
     * 
     */
    @Import(name="enableAcceleratedNetworking")
      private final @Nullable Boolean enableAcceleratedNetworking;

    public Optional<Boolean> getEnableAcceleratedNetworking() {
        return this.enableAcceleratedNetworking == null ? Optional.empty() : Optional.ofNullable(this.enableAcceleratedNetworking);
    }

    /**
     * Specifies whether the network interface is FPGA networking-enabled.
     * 
     */
    @Import(name="enableFpga")
      private final @Nullable Boolean enableFpga;

    public Optional<Boolean> getEnableFpga() {
        return this.enableFpga == null ? Optional.empty() : Optional.ofNullable(this.enableFpga);
    }

    /**
     * Whether IP forwarding enabled on this NIC.
     * 
     */
    @Import(name="enableIPForwarding")
      private final @Nullable Boolean enableIPForwarding;

    public Optional<Boolean> getEnableIPForwarding() {
        return this.enableIPForwarding == null ? Optional.empty() : Optional.ofNullable(this.enableIPForwarding);
    }

    /**
     * Resource Id
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Specifies the IP configurations of the network interface.
     * 
     */
    @Import(name="ipConfigurations", required=true)
      private final List<VirtualMachineScaleSetIPConfigurationResponse> ipConfigurations;

    public List<VirtualMachineScaleSetIPConfigurationResponse> getIpConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * The network configuration name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The network security group.
     * 
     */
    @Import(name="networkSecurityGroup")
      private final @Nullable SubResourceResponse networkSecurityGroup;

    public Optional<SubResourceResponse> getNetworkSecurityGroup() {
        return this.networkSecurityGroup == null ? Optional.empty() : Optional.ofNullable(this.networkSecurityGroup);
    }

    /**
     * Specifies the primary network interface in case the virtual machine has more than 1 network interface.
     * 
     */
    @Import(name="primary")
      private final @Nullable Boolean primary;

    public Optional<Boolean> getPrimary() {
        return this.primary == null ? Optional.empty() : Optional.ofNullable(this.primary);
    }

    public VirtualMachineScaleSetNetworkConfigurationResponse(
        @Nullable String deleteOption,
        @Nullable VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse dnsSettings,
        @Nullable Boolean enableAcceleratedNetworking,
        @Nullable Boolean enableFpga,
        @Nullable Boolean enableIPForwarding,
        @Nullable String id,
        List<VirtualMachineScaleSetIPConfigurationResponse> ipConfigurations,
        String name,
        @Nullable SubResourceResponse networkSecurityGroup,
        @Nullable Boolean primary) {
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

    private VirtualMachineScaleSetNetworkConfigurationResponse() {
        this.deleteOption = null;
        this.dnsSettings = null;
        this.enableAcceleratedNetworking = null;
        this.enableFpga = null;
        this.enableIPForwarding = null;
        this.id = null;
        this.ipConfigurations = List.of();
        this.name = null;
        this.networkSecurityGroup = null;
        this.primary = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetNetworkConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deleteOption;
        private @Nullable VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse dnsSettings;
        private @Nullable Boolean enableAcceleratedNetworking;
        private @Nullable Boolean enableFpga;
        private @Nullable Boolean enableIPForwarding;
        private @Nullable String id;
        private List<VirtualMachineScaleSetIPConfigurationResponse> ipConfigurations;
        private String name;
        private @Nullable SubResourceResponse networkSecurityGroup;
        private @Nullable Boolean primary;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetNetworkConfigurationResponse defaults) {
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

        public Builder deleteOption(@Nullable String deleteOption) {
            this.deleteOption = deleteOption;
            return this;
        }

        public Builder dnsSettings(@Nullable VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse dnsSettings) {
            this.dnsSettings = dnsSettings;
            return this;
        }

        public Builder enableAcceleratedNetworking(@Nullable Boolean enableAcceleratedNetworking) {
            this.enableAcceleratedNetworking = enableAcceleratedNetworking;
            return this;
        }

        public Builder enableFpga(@Nullable Boolean enableFpga) {
            this.enableFpga = enableFpga;
            return this;
        }

        public Builder enableIPForwarding(@Nullable Boolean enableIPForwarding) {
            this.enableIPForwarding = enableIPForwarding;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder ipConfigurations(List<VirtualMachineScaleSetIPConfigurationResponse> ipConfigurations) {
            this.ipConfigurations = Objects.requireNonNull(ipConfigurations);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder networkSecurityGroup(@Nullable SubResourceResponse networkSecurityGroup) {
            this.networkSecurityGroup = networkSecurityGroup;
            return this;
        }

        public Builder primary(@Nullable Boolean primary) {
            this.primary = primary;
            return this;
        }
        public VirtualMachineScaleSetNetworkConfigurationResponse build() {
            return new VirtualMachineScaleSetNetworkConfigurationResponse(deleteOption, dnsSettings, enableAcceleratedNetworking, enableFpga, enableIPForwarding, id, ipConfigurations, name, networkSecurityGroup, primary);
        }
    }
}
