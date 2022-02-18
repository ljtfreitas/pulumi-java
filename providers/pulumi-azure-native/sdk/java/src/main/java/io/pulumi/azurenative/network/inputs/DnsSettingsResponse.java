// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DNS Proxy Settings in Firewall Policy.
 * 
 */
public final class DnsSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DnsSettingsResponse Empty = new DnsSettingsResponse();

    /**
     * Enable DNS Proxy on Firewalls attached to the Firewall Policy.
     * 
     */
    @InputImport(name="enableProxy")
    private final @Nullable Boolean enableProxy;

    public Optional<Boolean> getEnableProxy() {
        return this.enableProxy == null ? Optional.empty() : Optional.ofNullable(this.enableProxy);
    }

    /**
     * FQDNs in Network Rules are supported when set to true.
     * 
     */
    @InputImport(name="requireProxyForNetworkRules")
    private final @Nullable Boolean requireProxyForNetworkRules;

    public Optional<Boolean> getRequireProxyForNetworkRules() {
        return this.requireProxyForNetworkRules == null ? Optional.empty() : Optional.ofNullable(this.requireProxyForNetworkRules);
    }

    /**
     * List of Custom DNS Servers.
     * 
     */
    @InputImport(name="servers")
    private final @Nullable List<String> servers;

    public List<String> getServers() {
        return this.servers == null ? List.of() : this.servers;
    }

    public DnsSettingsResponse(
        @Nullable Boolean enableProxy,
        @Nullable Boolean requireProxyForNetworkRules,
        @Nullable List<String> servers) {
        this.enableProxy = enableProxy;
        this.requireProxyForNetworkRules = requireProxyForNetworkRules;
        this.servers = servers;
    }

    private DnsSettingsResponse() {
        this.enableProxy = null;
        this.requireProxyForNetworkRules = null;
        this.servers = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableProxy;
        private @Nullable Boolean requireProxyForNetworkRules;
        private @Nullable List<String> servers;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableProxy = defaults.enableProxy;
    	      this.requireProxyForNetworkRules = defaults.requireProxyForNetworkRules;
    	      this.servers = defaults.servers;
        }

        public Builder setEnableProxy(@Nullable Boolean enableProxy) {
            this.enableProxy = enableProxy;
            return this;
        }

        public Builder setRequireProxyForNetworkRules(@Nullable Boolean requireProxyForNetworkRules) {
            this.requireProxyForNetworkRules = requireProxyForNetworkRules;
            return this;
        }

        public Builder setServers(@Nullable List<String> servers) {
            this.servers = servers;
            return this;
        }

        public DnsSettingsResponse build() {
            return new DnsSettingsResponse(enableProxy, requireProxyForNetworkRules, servers);
        }
    }
}
