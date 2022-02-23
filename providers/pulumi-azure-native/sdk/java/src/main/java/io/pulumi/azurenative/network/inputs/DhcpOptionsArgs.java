// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DhcpOptions contains an array of DNS servers available to VMs deployed in the virtual network. Standard DHCP option for a subnet overrides VNET DHCP options.
 * 
 */
public final class DhcpOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DhcpOptionsArgs Empty = new DhcpOptionsArgs();

    /**
     * The list of DNS servers IP addresses.
     * 
     */
    @InputImport(name="dnsServers")
        private final @Nullable Input<List<String>> dnsServers;

    public Input<List<String>> getDnsServers() {
        return this.dnsServers == null ? Input.empty() : this.dnsServers;
    }

    public DhcpOptionsArgs(@Nullable Input<List<String>> dnsServers) {
        this.dnsServers = dnsServers;
    }

    private DhcpOptionsArgs() {
        this.dnsServers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DhcpOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> dnsServers;

        public Builder() {
    	      // Empty
        }

        public Builder(DhcpOptionsArgs defaults) {
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
        public DhcpOptionsArgs build() {
            return new DhcpOptionsArgs(dnsServers);
        }
    }
}
