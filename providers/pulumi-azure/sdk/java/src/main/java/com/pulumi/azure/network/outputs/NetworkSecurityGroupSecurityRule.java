// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkSecurityGroupSecurityRule {
    /**
     * @return Specifies whether network traffic is allowed or denied. Possible values are `Allow` and `Deny`.
     * 
     */
    private final String access;
    /**
     * @return A description for this rule. Restricted to 140 characters.
     * 
     */
    private final @Nullable String description;
    /**
     * @return CIDR or destination IP range or * to match any IP. Tags such as ‘VirtualNetwork’, ‘AzureLoadBalancer’ and ‘Internet’ can also be used. This is required if `destination_address_prefixes` is not specified.
     * 
     */
    private final @Nullable String destinationAddressPrefix;
    /**
     * @return List of destination address prefixes. Tags may not be used. This is required if `destination_address_prefix` is not specified.
     * 
     */
    private final @Nullable List<String> destinationAddressPrefixes;
    /**
     * @return A List of destination Application Security Group ID&#39;s
     * 
     */
    private final @Nullable List<String> destinationApplicationSecurityGroupIds;
    /**
     * @return Destination Port or Range. Integer or range between `0` and `65535` or `*` to match any. This is required if `destination_port_ranges` is not specified.
     * 
     */
    private final @Nullable String destinationPortRange;
    /**
     * @return List of destination ports or port ranges. This is required if `destination_port_range` is not specified.
     * 
     */
    private final @Nullable List<String> destinationPortRanges;
    /**
     * @return The direction specifies if rule will be evaluated on incoming or outgoing traffic. Possible values are `Inbound` and `Outbound`.
     * 
     */
    private final String direction;
    /**
     * @return The name of the security rule.
     * 
     */
    private final String name;
    /**
     * @return Specifies the priority of the rule. The value can be between 100 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     */
    private final Integer priority;
    /**
     * @return Network protocol this rule applies to. Possible values include `Tcp`, `Udp`, `Icmp`, `Esp`, `Ah` or `*` (which matches all).
     * 
     */
    private final String protocol;
    /**
     * @return CIDR or source IP range or * to match any IP. Tags such as ‘VirtualNetwork’, ‘AzureLoadBalancer’ and ‘Internet’ can also be used. This is required if `source_address_prefixes` is not specified.
     * 
     */
    private final @Nullable String sourceAddressPrefix;
    /**
     * @return List of source address prefixes. Tags may not be used. This is required if `source_address_prefix` is not specified.
     * 
     */
    private final @Nullable List<String> sourceAddressPrefixes;
    /**
     * @return A List of source Application Security Group ID&#39;s
     * 
     */
    private final @Nullable List<String> sourceApplicationSecurityGroupIds;
    /**
     * @return Source Port or Range. Integer or range between `0` and `65535` or `*` to match any. This is required if `source_port_ranges` is not specified.
     * 
     */
    private final @Nullable String sourcePortRange;
    /**
     * @return List of source ports or port ranges. This is required if `source_port_range` is not specified.
     * 
     */
    private final @Nullable List<String> sourcePortRanges;

    @CustomType.Constructor
    private NetworkSecurityGroupSecurityRule(
        @CustomType.Parameter("access") String access,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("destinationAddressPrefix") @Nullable String destinationAddressPrefix,
        @CustomType.Parameter("destinationAddressPrefixes") @Nullable List<String> destinationAddressPrefixes,
        @CustomType.Parameter("destinationApplicationSecurityGroupIds") @Nullable List<String> destinationApplicationSecurityGroupIds,
        @CustomType.Parameter("destinationPortRange") @Nullable String destinationPortRange,
        @CustomType.Parameter("destinationPortRanges") @Nullable List<String> destinationPortRanges,
        @CustomType.Parameter("direction") String direction,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("sourceAddressPrefix") @Nullable String sourceAddressPrefix,
        @CustomType.Parameter("sourceAddressPrefixes") @Nullable List<String> sourceAddressPrefixes,
        @CustomType.Parameter("sourceApplicationSecurityGroupIds") @Nullable List<String> sourceApplicationSecurityGroupIds,
        @CustomType.Parameter("sourcePortRange") @Nullable String sourcePortRange,
        @CustomType.Parameter("sourcePortRanges") @Nullable List<String> sourcePortRanges) {
        this.access = access;
        this.description = description;
        this.destinationAddressPrefix = destinationAddressPrefix;
        this.destinationAddressPrefixes = destinationAddressPrefixes;
        this.destinationApplicationSecurityGroupIds = destinationApplicationSecurityGroupIds;
        this.destinationPortRange = destinationPortRange;
        this.destinationPortRanges = destinationPortRanges;
        this.direction = direction;
        this.name = name;
        this.priority = priority;
        this.protocol = protocol;
        this.sourceAddressPrefix = sourceAddressPrefix;
        this.sourceAddressPrefixes = sourceAddressPrefixes;
        this.sourceApplicationSecurityGroupIds = sourceApplicationSecurityGroupIds;
        this.sourcePortRange = sourcePortRange;
        this.sourcePortRanges = sourcePortRanges;
    }

    /**
     * @return Specifies whether network traffic is allowed or denied. Possible values are `Allow` and `Deny`.
     * 
     */
    public String access() {
        return this.access;
    }
    /**
     * @return A description for this rule. Restricted to 140 characters.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return CIDR or destination IP range or * to match any IP. Tags such as ‘VirtualNetwork’, ‘AzureLoadBalancer’ and ‘Internet’ can also be used. This is required if `destination_address_prefixes` is not specified.
     * 
     */
    public Optional<String> destinationAddressPrefix() {
        return Optional.ofNullable(this.destinationAddressPrefix);
    }
    /**
     * @return List of destination address prefixes. Tags may not be used. This is required if `destination_address_prefix` is not specified.
     * 
     */
    public List<String> destinationAddressPrefixes() {
        return this.destinationAddressPrefixes == null ? List.of() : this.destinationAddressPrefixes;
    }
    /**
     * @return A List of destination Application Security Group ID&#39;s
     * 
     */
    public List<String> destinationApplicationSecurityGroupIds() {
        return this.destinationApplicationSecurityGroupIds == null ? List.of() : this.destinationApplicationSecurityGroupIds;
    }
    /**
     * @return Destination Port or Range. Integer or range between `0` and `65535` or `*` to match any. This is required if `destination_port_ranges` is not specified.
     * 
     */
    public Optional<String> destinationPortRange() {
        return Optional.ofNullable(this.destinationPortRange);
    }
    /**
     * @return List of destination ports or port ranges. This is required if `destination_port_range` is not specified.
     * 
     */
    public List<String> destinationPortRanges() {
        return this.destinationPortRanges == null ? List.of() : this.destinationPortRanges;
    }
    /**
     * @return The direction specifies if rule will be evaluated on incoming or outgoing traffic. Possible values are `Inbound` and `Outbound`.
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return The name of the security rule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specifies the priority of the rule. The value can be between 100 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return Network protocol this rule applies to. Possible values include `Tcp`, `Udp`, `Icmp`, `Esp`, `Ah` or `*` (which matches all).
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return CIDR or source IP range or * to match any IP. Tags such as ‘VirtualNetwork’, ‘AzureLoadBalancer’ and ‘Internet’ can also be used. This is required if `source_address_prefixes` is not specified.
     * 
     */
    public Optional<String> sourceAddressPrefix() {
        return Optional.ofNullable(this.sourceAddressPrefix);
    }
    /**
     * @return List of source address prefixes. Tags may not be used. This is required if `source_address_prefix` is not specified.
     * 
     */
    public List<String> sourceAddressPrefixes() {
        return this.sourceAddressPrefixes == null ? List.of() : this.sourceAddressPrefixes;
    }
    /**
     * @return A List of source Application Security Group ID&#39;s
     * 
     */
    public List<String> sourceApplicationSecurityGroupIds() {
        return this.sourceApplicationSecurityGroupIds == null ? List.of() : this.sourceApplicationSecurityGroupIds;
    }
    /**
     * @return Source Port or Range. Integer or range between `0` and `65535` or `*` to match any. This is required if `source_port_ranges` is not specified.
     * 
     */
    public Optional<String> sourcePortRange() {
        return Optional.ofNullable(this.sourcePortRange);
    }
    /**
     * @return List of source ports or port ranges. This is required if `source_port_range` is not specified.
     * 
     */
    public List<String> sourcePortRanges() {
        return this.sourcePortRanges == null ? List.of() : this.sourcePortRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkSecurityGroupSecurityRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String access;
        private @Nullable String description;
        private @Nullable String destinationAddressPrefix;
        private @Nullable List<String> destinationAddressPrefixes;
        private @Nullable List<String> destinationApplicationSecurityGroupIds;
        private @Nullable String destinationPortRange;
        private @Nullable List<String> destinationPortRanges;
        private String direction;
        private String name;
        private Integer priority;
        private String protocol;
        private @Nullable String sourceAddressPrefix;
        private @Nullable List<String> sourceAddressPrefixes;
        private @Nullable List<String> sourceApplicationSecurityGroupIds;
        private @Nullable String sourcePortRange;
        private @Nullable List<String> sourcePortRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkSecurityGroupSecurityRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.description = defaults.description;
    	      this.destinationAddressPrefix = defaults.destinationAddressPrefix;
    	      this.destinationAddressPrefixes = defaults.destinationAddressPrefixes;
    	      this.destinationApplicationSecurityGroupIds = defaults.destinationApplicationSecurityGroupIds;
    	      this.destinationPortRange = defaults.destinationPortRange;
    	      this.destinationPortRanges = defaults.destinationPortRanges;
    	      this.direction = defaults.direction;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.protocol = defaults.protocol;
    	      this.sourceAddressPrefix = defaults.sourceAddressPrefix;
    	      this.sourceAddressPrefixes = defaults.sourceAddressPrefixes;
    	      this.sourceApplicationSecurityGroupIds = defaults.sourceApplicationSecurityGroupIds;
    	      this.sourcePortRange = defaults.sourcePortRange;
    	      this.sourcePortRanges = defaults.sourcePortRanges;
        }

        public Builder access(String access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder destinationAddressPrefix(@Nullable String destinationAddressPrefix) {
            this.destinationAddressPrefix = destinationAddressPrefix;
            return this;
        }
        public Builder destinationAddressPrefixes(@Nullable List<String> destinationAddressPrefixes) {
            this.destinationAddressPrefixes = destinationAddressPrefixes;
            return this;
        }
        public Builder destinationAddressPrefixes(String... destinationAddressPrefixes) {
            return destinationAddressPrefixes(List.of(destinationAddressPrefixes));
        }
        public Builder destinationApplicationSecurityGroupIds(@Nullable List<String> destinationApplicationSecurityGroupIds) {
            this.destinationApplicationSecurityGroupIds = destinationApplicationSecurityGroupIds;
            return this;
        }
        public Builder destinationApplicationSecurityGroupIds(String... destinationApplicationSecurityGroupIds) {
            return destinationApplicationSecurityGroupIds(List.of(destinationApplicationSecurityGroupIds));
        }
        public Builder destinationPortRange(@Nullable String destinationPortRange) {
            this.destinationPortRange = destinationPortRange;
            return this;
        }
        public Builder destinationPortRanges(@Nullable List<String> destinationPortRanges) {
            this.destinationPortRanges = destinationPortRanges;
            return this;
        }
        public Builder destinationPortRanges(String... destinationPortRanges) {
            return destinationPortRanges(List.of(destinationPortRanges));
        }
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder sourceAddressPrefix(@Nullable String sourceAddressPrefix) {
            this.sourceAddressPrefix = sourceAddressPrefix;
            return this;
        }
        public Builder sourceAddressPrefixes(@Nullable List<String> sourceAddressPrefixes) {
            this.sourceAddressPrefixes = sourceAddressPrefixes;
            return this;
        }
        public Builder sourceAddressPrefixes(String... sourceAddressPrefixes) {
            return sourceAddressPrefixes(List.of(sourceAddressPrefixes));
        }
        public Builder sourceApplicationSecurityGroupIds(@Nullable List<String> sourceApplicationSecurityGroupIds) {
            this.sourceApplicationSecurityGroupIds = sourceApplicationSecurityGroupIds;
            return this;
        }
        public Builder sourceApplicationSecurityGroupIds(String... sourceApplicationSecurityGroupIds) {
            return sourceApplicationSecurityGroupIds(List.of(sourceApplicationSecurityGroupIds));
        }
        public Builder sourcePortRange(@Nullable String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public Builder sourcePortRanges(@Nullable List<String> sourcePortRanges) {
            this.sourcePortRanges = sourcePortRanges;
            return this;
        }
        public Builder sourcePortRanges(String... sourcePortRanges) {
            return sourcePortRanges(List.of(sourcePortRanges));
        }        public NetworkSecurityGroupSecurityRule build() {
            return new NetworkSecurityGroupSecurityRule(access, description, destinationAddressPrefix, destinationAddressPrefixes, destinationApplicationSecurityGroupIds, destinationPortRange, destinationPortRanges, direction, name, priority, protocol, sourceAddressPrefix, sourceAddressPrefixes, sourceApplicationSecurityGroupIds, sourcePortRange, sourcePortRanges);
        }
    }
}
