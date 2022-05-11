// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.GetWindowsWebAppSiteConfigIpRestrictionHeader;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWindowsWebAppSiteConfigIpRestriction {
    /**
     * @return A `action` block as defined above.
     * 
     */
    private final String action;
    private final List<GetWindowsWebAppSiteConfigIpRestrictionHeader> headers;
    private final String ipAddress;
    /**
     * @return The name of this Windows Web App.
     * 
     */
    private final String name;
    private final Integer priority;
    private final String serviceTag;
    private final String virtualNetworkSubnetId;

    @CustomType.Constructor
    private GetWindowsWebAppSiteConfigIpRestriction(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("headers") List<GetWindowsWebAppSiteConfigIpRestrictionHeader> headers,
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
     * @return A `action` block as defined above.
     * 
     */
    public String action() {
        return this.action;
    }
    public List<GetWindowsWebAppSiteConfigIpRestrictionHeader> headers() {
        return this.headers;
    }
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return The name of this Windows Web App.
     * 
     */
    public String name() {
        return this.name;
    }
    public Integer priority() {
        return this.priority;
    }
    public String serviceTag() {
        return this.serviceTag;
    }
    public String virtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWindowsWebAppSiteConfigIpRestriction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private List<GetWindowsWebAppSiteConfigIpRestrictionHeader> headers;
        private String ipAddress;
        private String name;
        private Integer priority;
        private String serviceTag;
        private String virtualNetworkSubnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWindowsWebAppSiteConfigIpRestriction defaults) {
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
        public Builder headers(List<GetWindowsWebAppSiteConfigIpRestrictionHeader> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }
        public Builder headers(GetWindowsWebAppSiteConfigIpRestrictionHeader... headers) {
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
        }        public GetWindowsWebAppSiteConfigIpRestriction build() {
            return new GetWindowsWebAppSiteConfigIpRestriction(action, headers, ipAddress, name, priority, serviceTag, virtualNetworkSubnetId);
        }
    }
}
