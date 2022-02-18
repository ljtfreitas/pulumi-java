// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.outputs;

import io.pulumi.azurenative.connectedvmwarevsphere.outputs.NicIPSettingsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkInterfaceResponse {
    /**
     * Gets or sets the device key value.
     * 
     */
    private final @Nullable Integer deviceKey;
    /**
     * Gets or sets the nic ip addresses.
     * 
     */
    private final List<String> ipAddresses;
    /**
     * Gets or sets the ipsettings.
     * 
     */
    private final @Nullable NicIPSettingsResponse ipSettings;
    /**
     * Gets or sets the label of the virtual network in vCenter that the nic is connected to.
     * 
     */
    private final String label;
    /**
     * Gets or sets the NIC MAC address.
     * 
     */
    private final String macAddress;
    /**
     * Gets or sets the name of the network interface.
     * 
     */
    private final @Nullable String name;
    /**
     * Gets or sets the ARM Id of the network resource to connect the virtual machine.
     * 
     */
    private final @Nullable String networkId;
    /**
     * Gets or sets the name of the virtual network in vCenter that the nic is connected to.
     * 
     */
    private final String networkMoName;
    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID of the virtual network
     * that the nic is connected to.
     * 
     */
    private final String networkMoRefId;
    /**
     * NIC type
     * 
     */
    private final @Nullable String nicType;
    /**
     * Gets or sets the power on boot.
     * 
     */
    private final @Nullable String powerOnBoot;

    @OutputCustomType.Constructor({"deviceKey","ipAddresses","ipSettings","label","macAddress","name","networkId","networkMoName","networkMoRefId","nicType","powerOnBoot"})
    private NetworkInterfaceResponse(
        @Nullable Integer deviceKey,
        List<String> ipAddresses,
        @Nullable NicIPSettingsResponse ipSettings,
        String label,
        String macAddress,
        @Nullable String name,
        @Nullable String networkId,
        String networkMoName,
        String networkMoRefId,
        @Nullable String nicType,
        @Nullable String powerOnBoot) {
        this.deviceKey = deviceKey;
        this.ipAddresses = Objects.requireNonNull(ipAddresses);
        this.ipSettings = ipSettings;
        this.label = Objects.requireNonNull(label);
        this.macAddress = Objects.requireNonNull(macAddress);
        this.name = name;
        this.networkId = networkId;
        this.networkMoName = Objects.requireNonNull(networkMoName);
        this.networkMoRefId = Objects.requireNonNull(networkMoRefId);
        this.nicType = nicType;
        this.powerOnBoot = powerOnBoot;
    }

    /**
     * Gets or sets the device key value.
     * 
     */
    public Optional<Integer> getDeviceKey() {
        return Optional.ofNullable(this.deviceKey);
    }
    /**
     * Gets or sets the nic ip addresses.
     * 
     */
    public List<String> getIpAddresses() {
        return this.ipAddresses;
    }
    /**
     * Gets or sets the ipsettings.
     * 
     */
    public Optional<NicIPSettingsResponse> getIpSettings() {
        return Optional.ofNullable(this.ipSettings);
    }
    /**
     * Gets or sets the label of the virtual network in vCenter that the nic is connected to.
     * 
     */
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets or sets the NIC MAC address.
     * 
     */
    public String getMacAddress() {
        return this.macAddress;
    }
    /**
     * Gets or sets the name of the network interface.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Gets or sets the ARM Id of the network resource to connect the virtual machine.
     * 
     */
    public Optional<String> getNetworkId() {
        return Optional.ofNullable(this.networkId);
    }
    /**
     * Gets or sets the name of the virtual network in vCenter that the nic is connected to.
     * 
     */
    public String getNetworkMoName() {
        return this.networkMoName;
    }
    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID of the virtual network
     * that the nic is connected to.
     * 
     */
    public String getNetworkMoRefId() {
        return this.networkMoRefId;
    }
    /**
     * NIC type
     * 
     */
    public Optional<String> getNicType() {
        return Optional.ofNullable(this.nicType);
    }
    /**
     * Gets or sets the power on boot.
     * 
     */
    public Optional<String> getPowerOnBoot() {
        return Optional.ofNullable(this.powerOnBoot);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer deviceKey;
        private List<String> ipAddresses;
        private @Nullable NicIPSettingsResponse ipSettings;
        private String label;
        private String macAddress;
        private @Nullable String name;
        private @Nullable String networkId;
        private String networkMoName;
        private String networkMoRefId;
        private @Nullable String nicType;
        private @Nullable String powerOnBoot;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceKey = defaults.deviceKey;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.ipSettings = defaults.ipSettings;
    	      this.label = defaults.label;
    	      this.macAddress = defaults.macAddress;
    	      this.name = defaults.name;
    	      this.networkId = defaults.networkId;
    	      this.networkMoName = defaults.networkMoName;
    	      this.networkMoRefId = defaults.networkMoRefId;
    	      this.nicType = defaults.nicType;
    	      this.powerOnBoot = defaults.powerOnBoot;
        }

        public Builder setDeviceKey(@Nullable Integer deviceKey) {
            this.deviceKey = deviceKey;
            return this;
        }

        public Builder setIpAddresses(List<String> ipAddresses) {
            this.ipAddresses = Objects.requireNonNull(ipAddresses);
            return this;
        }

        public Builder setIpSettings(@Nullable NicIPSettingsResponse ipSettings) {
            this.ipSettings = ipSettings;
            return this;
        }

        public Builder setLabel(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }

        public Builder setMacAddress(String macAddress) {
            this.macAddress = Objects.requireNonNull(macAddress);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNetworkId(@Nullable String networkId) {
            this.networkId = networkId;
            return this;
        }

        public Builder setNetworkMoName(String networkMoName) {
            this.networkMoName = Objects.requireNonNull(networkMoName);
            return this;
        }

        public Builder setNetworkMoRefId(String networkMoRefId) {
            this.networkMoRefId = Objects.requireNonNull(networkMoRefId);
            return this;
        }

        public Builder setNicType(@Nullable String nicType) {
            this.nicType = nicType;
            return this;
        }

        public Builder setPowerOnBoot(@Nullable String powerOnBoot) {
            this.powerOnBoot = powerOnBoot;
            return this;
        }

        public NetworkInterfaceResponse build() {
            return new NetworkInterfaceResponse(deviceKey, ipAddresses, ipSettings, label, macAddress, name, networkId, networkMoName, networkMoRefId, nicType, powerOnBoot);
        }
    }
}
