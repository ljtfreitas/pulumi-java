// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.azure.compute.outputs.WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddress {
    /**
     * @return The Prefix which should be used for the Domain Name Label for each Virtual Machine Instance. Azure concatenates the Domain Name Label and Virtual Machine Index to create a unique Domain Name Label for each Virtual Machine.
     * 
     */
    private final @Nullable String domainNameLabel;
    /**
     * @return The Idle Timeout in Minutes for the Public IP Address. Possible values are in the range `4` to `32`.
     * 
     */
    private final @Nullable Integer idleTimeoutInMinutes;
    /**
     * @return One or more `ip_tag` blocks as defined above.
     * 
     */
    private final @Nullable List<WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag> ipTags;
    /**
     * @return The Name of the Public IP Address Configuration.
     * 
     */
    private final String name;
    /**
     * @return The ID of the Public IP Address Prefix from where Public IP Addresses should be allocated. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String publicIpPrefixId;

    @CustomType.Constructor
    private WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddress(
        @CustomType.Parameter("domainNameLabel") @Nullable String domainNameLabel,
        @CustomType.Parameter("idleTimeoutInMinutes") @Nullable Integer idleTimeoutInMinutes,
        @CustomType.Parameter("ipTags") @Nullable List<WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag> ipTags,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("publicIpPrefixId") @Nullable String publicIpPrefixId) {
        this.domainNameLabel = domainNameLabel;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.ipTags = ipTags;
        this.name = name;
        this.publicIpPrefixId = publicIpPrefixId;
    }

    /**
     * @return The Prefix which should be used for the Domain Name Label for each Virtual Machine Instance. Azure concatenates the Domain Name Label and Virtual Machine Index to create a unique Domain Name Label for each Virtual Machine.
     * 
     */
    public Optional<String> domainNameLabel() {
        return Optional.ofNullable(this.domainNameLabel);
    }
    /**
     * @return The Idle Timeout in Minutes for the Public IP Address. Possible values are in the range `4` to `32`.
     * 
     */
    public Optional<Integer> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }
    /**
     * @return One or more `ip_tag` blocks as defined above.
     * 
     */
    public List<WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag> ipTags() {
        return this.ipTags == null ? List.of() : this.ipTags;
    }
    /**
     * @return The Name of the Public IP Address Configuration.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the Public IP Address Prefix from where Public IP Addresses should be allocated. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> publicIpPrefixId() {
        return Optional.ofNullable(this.publicIpPrefixId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String domainNameLabel;
        private @Nullable Integer idleTimeoutInMinutes;
        private @Nullable List<WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag> ipTags;
        private String name;
        private @Nullable String publicIpPrefixId;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainNameLabel = defaults.domainNameLabel;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.ipTags = defaults.ipTags;
    	      this.name = defaults.name;
    	      this.publicIpPrefixId = defaults.publicIpPrefixId;
        }

        public Builder domainNameLabel(@Nullable String domainNameLabel) {
            this.domainNameLabel = domainNameLabel;
            return this;
        }
        public Builder idleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }
        public Builder ipTags(@Nullable List<WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag> ipTags) {
            this.ipTags = ipTags;
            return this;
        }
        public Builder ipTags(WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTag... ipTags) {
            return ipTags(List.of(ipTags));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder publicIpPrefixId(@Nullable String publicIpPrefixId) {
            this.publicIpPrefixId = publicIpPrefixId;
            return this;
        }        public WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddress build() {
            return new WindowsVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddress(domainNameLabel, idleTimeoutInMinutes, ipTags, name, publicIpPrefixId);
        }
    }
}
