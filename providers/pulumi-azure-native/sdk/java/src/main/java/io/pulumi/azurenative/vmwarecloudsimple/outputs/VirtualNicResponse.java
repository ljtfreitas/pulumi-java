// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.outputs;

import io.pulumi.azurenative.vmwarecloudsimple.outputs.GuestOSNICCustomizationResponse;
import io.pulumi.azurenative.vmwarecloudsimple.outputs.VirtualNetworkResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualNicResponse {
    /**
     * guest OS customization for nic
     * 
     */
    private final @Nullable GuestOSNICCustomizationResponse customization;
    /**
     * NIC ip address
     * 
     */
    private final @Nullable List<String> ipAddresses;
    /**
     * NIC MAC address
     * 
     */
    private final @Nullable String macAddress;
    /**
     * Virtual Network
     * 
     */
    private final VirtualNetworkResponse network;
    /**
     * NIC type
     * 
     */
    private final String nicType;
    /**
     * Is NIC powered on/off on boot
     * 
     */
    private final @Nullable Boolean powerOnBoot;
    /**
     * NIC id
     * 
     */
    private final @Nullable String virtualNicId;
    /**
     * NIC name
     * 
     */
    private final String virtualNicName;

    @OutputCustomType.Constructor({"customization","ipAddresses","macAddress","network","nicType","powerOnBoot","virtualNicId","virtualNicName"})
    private VirtualNicResponse(
        @Nullable GuestOSNICCustomizationResponse customization,
        @Nullable List<String> ipAddresses,
        @Nullable String macAddress,
        VirtualNetworkResponse network,
        String nicType,
        @Nullable Boolean powerOnBoot,
        @Nullable String virtualNicId,
        String virtualNicName) {
        this.customization = customization;
        this.ipAddresses = ipAddresses;
        this.macAddress = macAddress;
        this.network = Objects.requireNonNull(network);
        this.nicType = Objects.requireNonNull(nicType);
        this.powerOnBoot = powerOnBoot;
        this.virtualNicId = virtualNicId;
        this.virtualNicName = Objects.requireNonNull(virtualNicName);
    }

    /**
     * guest OS customization for nic
     * 
     */
    public Optional<GuestOSNICCustomizationResponse> getCustomization() {
        return Optional.ofNullable(this.customization);
    }
    /**
     * NIC ip address
     * 
     */
    public List<String> getIpAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }
    /**
     * NIC MAC address
     * 
     */
    public Optional<String> getMacAddress() {
        return Optional.ofNullable(this.macAddress);
    }
    /**
     * Virtual Network
     * 
     */
    public VirtualNetworkResponse getNetwork() {
        return this.network;
    }
    /**
     * NIC type
     * 
     */
    public String getNicType() {
        return this.nicType;
    }
    /**
     * Is NIC powered on/off on boot
     * 
     */
    public Optional<Boolean> getPowerOnBoot() {
        return Optional.ofNullable(this.powerOnBoot);
    }
    /**
     * NIC id
     * 
     */
    public Optional<String> getVirtualNicId() {
        return Optional.ofNullable(this.virtualNicId);
    }
    /**
     * NIC name
     * 
     */
    public String getVirtualNicName() {
        return this.virtualNicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNicResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GuestOSNICCustomizationResponse customization;
        private @Nullable List<String> ipAddresses;
        private @Nullable String macAddress;
        private VirtualNetworkResponse network;
        private String nicType;
        private @Nullable Boolean powerOnBoot;
        private @Nullable String virtualNicId;
        private String virtualNicName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNicResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customization = defaults.customization;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.macAddress = defaults.macAddress;
    	      this.network = defaults.network;
    	      this.nicType = defaults.nicType;
    	      this.powerOnBoot = defaults.powerOnBoot;
    	      this.virtualNicId = defaults.virtualNicId;
    	      this.virtualNicName = defaults.virtualNicName;
        }

        public Builder setCustomization(@Nullable GuestOSNICCustomizationResponse customization) {
            this.customization = customization;
            return this;
        }

        public Builder setIpAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        public Builder setMacAddress(@Nullable String macAddress) {
            this.macAddress = macAddress;
            return this;
        }

        public Builder setNetwork(VirtualNetworkResponse network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNicType(String nicType) {
            this.nicType = Objects.requireNonNull(nicType);
            return this;
        }

        public Builder setPowerOnBoot(@Nullable Boolean powerOnBoot) {
            this.powerOnBoot = powerOnBoot;
            return this;
        }

        public Builder setVirtualNicId(@Nullable String virtualNicId) {
            this.virtualNicId = virtualNicId;
            return this;
        }

        public Builder setVirtualNicName(String virtualNicName) {
            this.virtualNicName = Objects.requireNonNull(virtualNicName);
            return this;
        }
        public VirtualNicResponse build() {
            return new VirtualNicResponse(customization, ipAddresses, macAddress, network, nicType, powerOnBoot, virtualNicId, virtualNicName);
        }
    }
}
