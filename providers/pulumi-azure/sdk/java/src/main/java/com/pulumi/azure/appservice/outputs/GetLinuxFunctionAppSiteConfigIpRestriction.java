// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.GetLinuxFunctionAppSiteConfigIpRestrictionHeader;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLinuxFunctionAppSiteConfigIpRestriction {
    /**
     * @return The action taken.
     * 
     */
    private final String action;
    /**
     * @return A `headers` block as defined above.
     * 
     */
    private final List<GetLinuxFunctionAppSiteConfigIpRestrictionHeader> headers;
    /**
     * @return The CIDR notation of the IP or IP Range matched.
     * 
     */
    private final String ipAddress;
    /**
     * @return The name which should be used for this Linux Function App.
     * 
     */
    private final String name;
    /**
     * @return The priority value of this `ip_restriction`.
     * 
     */
    private final Integer priority;
    /**
     * @return The Service Tag used for this IP Restriction.
     * 
     */
    private final String serviceTag;
    /**
     * @return The Virtual Network Subnet ID used for this IP Restriction.
     * 
     */
    private final String virtualNetworkSubnetId;

    @CustomType.Constructor
    private GetLinuxFunctionAppSiteConfigIpRestriction(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("headers") List<GetLinuxFunctionAppSiteConfigIpRestrictionHeader> headers,
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("serviceTag") String serviceTag,
        @CustomType.Parameter("virtualNetworkSubnetId") String virtualNetworkSubnetId) {
        this.action = action;
        this.headers = headers;
        this.ipAddress = ipAddress;
        this.name = name;
        this.priority = priority;
        this.serviceTag = serviceTag;
        this.virtualNetworkSubnetId = virtualNetworkSubnetId;
    }

    /**
     * @return The action taken.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return A `headers` block as defined above.
     * 
     */
    public List<GetLinuxFunctionAppSiteConfigIpRestrictionHeader> headers() {
        return this.headers;
    }
    /**
     * @return The CIDR notation of the IP or IP Range matched.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return The name which should be used for this Linux Function App.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The priority value of this `ip_restriction`.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return The Service Tag used for this IP Restriction.
     * 
     */
    public String serviceTag() {
        return this.serviceTag;
    }
    /**
     * @return The Virtual Network Subnet ID used for this IP Restriction.
     * 
     */
    public String virtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinuxFunctionAppSiteConfigIpRestriction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private List<GetLinuxFunctionAppSiteConfigIpRestrictionHeader> headers;
        private String ipAddress;
        private String name;
        private Integer priority;
        private String serviceTag;
        private String virtualNetworkSubnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinuxFunctionAppSiteConfigIpRestriction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.headers = defaults.headers;
    	      this.ipAddress = defaults.ipAddress;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.serviceTag = defaults.serviceTag;
    	      this.virtualNetworkSubnetId = defaults.virtualNetworkSubnetId;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder headers(List<GetLinuxFunctionAppSiteConfigIpRestrictionHeader> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }
        public Builder headers(GetLinuxFunctionAppSiteConfigIpRestrictionHeader... headers) {
            return headers(List.of(headers));
        }
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
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
        public Builder serviceTag(String serviceTag) {
            this.serviceTag = Objects.requireNonNull(serviceTag);
            return this;
        }
        public Builder virtualNetworkSubnetId(String virtualNetworkSubnetId) {
            this.virtualNetworkSubnetId = Objects.requireNonNull(virtualNetworkSubnetId);
            return this;
        }        public GetLinuxFunctionAppSiteConfigIpRestriction build() {
            return new GetLinuxFunctionAppSiteConfigIpRestriction(action, headers, ipAddress, name, priority, serviceTag, virtualNetworkSubnetId);
        }
    }
}
