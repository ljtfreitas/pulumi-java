// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a virtual machines scale sets network configuration's DNS settings.
 * 
 */
public final class VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs Empty = new VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs();

    /**
     * List of DNS servers IP addresses
     * 
     */
    @InputImport(name="dnsServers")
        private final @Nullable Input<List<String>> dnsServers;

    public Input<List<String>> getDnsServers() {
        return this.dnsServers == null ? Input.empty() : this.dnsServers;
    }

    public VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs(@Nullable Input<List<String>> dnsServers) {
        this.dnsServers = dnsServers;
    }

    private VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs() {
        this.dnsServers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> dnsServers;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServers = defaults.dnsServers;
        }

        public Builder setDnsServers(@Nullable Input<List<String>> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public Builder setDnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = Input.ofNullable(dnsServers);
            return this;
        }
        public VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs build() {
            return new VirtualMachineScaleSetNetworkConfigurationDnsSettingsArgs(dnsServers);
        }
    }
}
