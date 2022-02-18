// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a virtual machines scale sets network configuration's DNS settings.
 * 
 */
public final class VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse Empty = new VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse();

    /**
     * List of DNS servers IP addresses
     * 
     */
    @InputImport(name="dnsServers")
    private final @Nullable List<String> dnsServers;

    public List<String> getDnsServers() {
        return this.dnsServers == null ? List.of() : this.dnsServers;
    }

    public VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse(@Nullable List<String> dnsServers) {
        this.dnsServers = dnsServers;
    }

    private VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse() {
        this.dnsServers = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dnsServers;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServers = defaults.dnsServers;
        }

        public Builder setDnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse build() {
            return new VirtualMachineScaleSetNetworkConfigurationDnsSettingsResponse(dnsServers);
        }
    }
}
