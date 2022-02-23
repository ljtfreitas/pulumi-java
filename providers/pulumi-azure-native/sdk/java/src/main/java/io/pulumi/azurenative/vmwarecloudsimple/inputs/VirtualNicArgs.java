// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.inputs;

import io.pulumi.azurenative.vmwarecloudsimple.enums.NICType;
import io.pulumi.azurenative.vmwarecloudsimple.inputs.GuestOSNICCustomizationArgs;
import io.pulumi.azurenative.vmwarecloudsimple.inputs.VirtualNetworkArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Virtual NIC model
 * 
 */
public final class VirtualNicArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNicArgs Empty = new VirtualNicArgs();

    /**
     * guest OS customization for nic
     * 
     */
    @InputImport(name="customization")
        private final @Nullable Input<GuestOSNICCustomizationArgs> customization;

    public Input<GuestOSNICCustomizationArgs> getCustomization() {
        return this.customization == null ? Input.empty() : this.customization;
    }

    /**
     * NIC ip address
     * 
     */
    @InputImport(name="ipAddresses")
        private final @Nullable Input<List<String>> ipAddresses;

    public Input<List<String>> getIpAddresses() {
        return this.ipAddresses == null ? Input.empty() : this.ipAddresses;
    }

    /**
     * NIC MAC address
     * 
     */
    @InputImport(name="macAddress")
        private final @Nullable Input<String> macAddress;

    public Input<String> getMacAddress() {
        return this.macAddress == null ? Input.empty() : this.macAddress;
    }

    /**
     * Virtual Network
     * 
     */
    @InputImport(name="network", required=true)
        private final Input<VirtualNetworkArgs> network;

    public Input<VirtualNetworkArgs> getNetwork() {
        return this.network;
    }

    /**
     * NIC type
     * 
     */
    @InputImport(name="nicType", required=true)
        private final Input<NICType> nicType;

    public Input<NICType> getNicType() {
        return this.nicType;
    }

    /**
     * Is NIC powered on/off on boot
     * 
     */
    @InputImport(name="powerOnBoot")
        private final @Nullable Input<Boolean> powerOnBoot;

    public Input<Boolean> getPowerOnBoot() {
        return this.powerOnBoot == null ? Input.empty() : this.powerOnBoot;
    }

    /**
     * NIC id
     * 
     */
    @InputImport(name="virtualNicId")
        private final @Nullable Input<String> virtualNicId;

    public Input<String> getVirtualNicId() {
        return this.virtualNicId == null ? Input.empty() : this.virtualNicId;
    }

    public VirtualNicArgs(
        @Nullable Input<GuestOSNICCustomizationArgs> customization,
        @Nullable Input<List<String>> ipAddresses,
        @Nullable Input<String> macAddress,
        Input<VirtualNetworkArgs> network,
        Input<NICType> nicType,
        @Nullable Input<Boolean> powerOnBoot,
        @Nullable Input<String> virtualNicId) {
        this.customization = customization;
        this.ipAddresses = ipAddresses;
        this.macAddress = macAddress;
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.nicType = Objects.requireNonNull(nicType, "expected parameter 'nicType' to be non-null");
        this.powerOnBoot = powerOnBoot;
        this.virtualNicId = virtualNicId;
    }

    private VirtualNicArgs() {
        this.customization = Input.empty();
        this.ipAddresses = Input.empty();
        this.macAddress = Input.empty();
        this.network = Input.empty();
        this.nicType = Input.empty();
        this.powerOnBoot = Input.empty();
        this.virtualNicId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GuestOSNICCustomizationArgs> customization;
        private @Nullable Input<List<String>> ipAddresses;
        private @Nullable Input<String> macAddress;
        private Input<VirtualNetworkArgs> network;
        private Input<NICType> nicType;
        private @Nullable Input<Boolean> powerOnBoot;
        private @Nullable Input<String> virtualNicId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNicArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customization = defaults.customization;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.macAddress = defaults.macAddress;
    	      this.network = defaults.network;
    	      this.nicType = defaults.nicType;
    	      this.powerOnBoot = defaults.powerOnBoot;
    	      this.virtualNicId = defaults.virtualNicId;
        }

        public Builder setCustomization(@Nullable Input<GuestOSNICCustomizationArgs> customization) {
            this.customization = customization;
            return this;
        }

        public Builder setCustomization(@Nullable GuestOSNICCustomizationArgs customization) {
            this.customization = Input.ofNullable(customization);
            return this;
        }

        public Builder setIpAddresses(@Nullable Input<List<String>> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        public Builder setIpAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = Input.ofNullable(ipAddresses);
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

        public Builder setNetwork(Input<VirtualNetworkArgs> network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNetwork(VirtualNetworkArgs network) {
            this.network = Input.of(Objects.requireNonNull(network));
            return this;
        }

        public Builder setNicType(Input<NICType> nicType) {
            this.nicType = Objects.requireNonNull(nicType);
            return this;
        }

        public Builder setNicType(NICType nicType) {
            this.nicType = Input.of(Objects.requireNonNull(nicType));
            return this;
        }

        public Builder setPowerOnBoot(@Nullable Input<Boolean> powerOnBoot) {
            this.powerOnBoot = powerOnBoot;
            return this;
        }

        public Builder setPowerOnBoot(@Nullable Boolean powerOnBoot) {
            this.powerOnBoot = Input.ofNullable(powerOnBoot);
            return this;
        }

        public Builder setVirtualNicId(@Nullable Input<String> virtualNicId) {
            this.virtualNicId = virtualNicId;
            return this;
        }

        public Builder setVirtualNicId(@Nullable String virtualNicId) {
            this.virtualNicId = Input.ofNullable(virtualNicId);
            return this;
        }
        public VirtualNicArgs build() {
            return new VirtualNicArgs(customization, ipAddresses, macAddress, network, nicType, powerOnBoot, virtualNicId);
        }
    }
}
