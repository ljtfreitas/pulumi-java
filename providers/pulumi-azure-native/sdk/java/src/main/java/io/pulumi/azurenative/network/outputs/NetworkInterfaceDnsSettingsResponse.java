// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkInterfaceDnsSettingsResponse {
    /**
     * If the VM that uses this NIC is part of an Availability Set, then this list will have the union of all DNS servers from all NICs that are part of the Availability Set. This property is what is configured on each of those VMs.
     * 
     */
    private final List<String> appliedDnsServers;
    /**
     * List of DNS servers IP addresses. Use 'AzureProvidedDNS' to switch to azure provided DNS resolution. 'AzureProvidedDNS' value cannot be combined with other IPs, it must be the only value in dnsServers collection.
     * 
     */
    private final @Nullable List<String> dnsServers;
    /**
     * Relative DNS name for this NIC used for internal communications between VMs in the same virtual network.
     * 
     */
    private final @Nullable String internalDnsNameLabel;
    /**
     * Even if internalDnsNameLabel is not specified, a DNS entry is created for the primary NIC of the VM. This DNS name can be constructed by concatenating the VM name with the value of internalDomainNameSuffix.
     * 
     */
    private final String internalDomainNameSuffix;
    /**
     * Fully qualified DNS name supporting internal communications between VMs in the same virtual network.
     * 
     */
    private final String internalFqdn;

    @OutputCustomType.Constructor({"appliedDnsServers","dnsServers","internalDnsNameLabel","internalDomainNameSuffix","internalFqdn"})
    private NetworkInterfaceDnsSettingsResponse(
        List<String> appliedDnsServers,
        @Nullable List<String> dnsServers,
        @Nullable String internalDnsNameLabel,
        String internalDomainNameSuffix,
        String internalFqdn) {
        this.appliedDnsServers = Objects.requireNonNull(appliedDnsServers);
        this.dnsServers = dnsServers;
        this.internalDnsNameLabel = internalDnsNameLabel;
        this.internalDomainNameSuffix = Objects.requireNonNull(internalDomainNameSuffix);
        this.internalFqdn = Objects.requireNonNull(internalFqdn);
    }

    /**
     * If the VM that uses this NIC is part of an Availability Set, then this list will have the union of all DNS servers from all NICs that are part of the Availability Set. This property is what is configured on each of those VMs.
     * 
     */
    public List<String> getAppliedDnsServers() {
        return this.appliedDnsServers;
    }
    /**
     * List of DNS servers IP addresses. Use 'AzureProvidedDNS' to switch to azure provided DNS resolution. 'AzureProvidedDNS' value cannot be combined with other IPs, it must be the only value in dnsServers collection.
     * 
     */
    public List<String> getDnsServers() {
        return this.dnsServers == null ? List.of() : this.dnsServers;
    }
    /**
     * Relative DNS name for this NIC used for internal communications between VMs in the same virtual network.
     * 
     */
    public Optional<String> getInternalDnsNameLabel() {
        return Optional.ofNullable(this.internalDnsNameLabel);
    }
    /**
     * Even if internalDnsNameLabel is not specified, a DNS entry is created for the primary NIC of the VM. This DNS name can be constructed by concatenating the VM name with the value of internalDomainNameSuffix.
     * 
     */
    public String getInternalDomainNameSuffix() {
        return this.internalDomainNameSuffix;
    }
    /**
     * Fully qualified DNS name supporting internal communications between VMs in the same virtual network.
     * 
     */
    public String getInternalFqdn() {
        return this.internalFqdn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceDnsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> appliedDnsServers;
        private @Nullable List<String> dnsServers;
        private @Nullable String internalDnsNameLabel;
        private String internalDomainNameSuffix;
        private String internalFqdn;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceDnsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appliedDnsServers = defaults.appliedDnsServers;
    	      this.dnsServers = defaults.dnsServers;
    	      this.internalDnsNameLabel = defaults.internalDnsNameLabel;
    	      this.internalDomainNameSuffix = defaults.internalDomainNameSuffix;
    	      this.internalFqdn = defaults.internalFqdn;
        }

        public Builder setAppliedDnsServers(List<String> appliedDnsServers) {
            this.appliedDnsServers = Objects.requireNonNull(appliedDnsServers);
            return this;
        }

        public Builder setDnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public Builder setInternalDnsNameLabel(@Nullable String internalDnsNameLabel) {
            this.internalDnsNameLabel = internalDnsNameLabel;
            return this;
        }

        public Builder setInternalDomainNameSuffix(String internalDomainNameSuffix) {
            this.internalDomainNameSuffix = Objects.requireNonNull(internalDomainNameSuffix);
            return this;
        }

        public Builder setInternalFqdn(String internalFqdn) {
            this.internalFqdn = Objects.requireNonNull(internalFqdn);
            return this;
        }

        public NetworkInterfaceDnsSettingsResponse build() {
            return new NetworkInterfaceDnsSettingsResponse(appliedDnsServers, dnsServers, internalDnsNameLabel, internalDomainNameSuffix, internalFqdn);
        }
    }
}
