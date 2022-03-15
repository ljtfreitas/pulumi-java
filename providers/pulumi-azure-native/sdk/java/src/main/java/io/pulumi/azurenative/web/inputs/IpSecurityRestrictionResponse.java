// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IP security restriction on an app.
 * 
 */
public final class IpSecurityRestrictionResponse extends io.pulumi.resources.InvokeArgs {

    public static final IpSecurityRestrictionResponse Empty = new IpSecurityRestrictionResponse();

    /**
     * Allow or Deny access for this IP range.
     * 
     */
    @Import(name="action")
      private final @Nullable String action;

    public Optional<String> getAction() {
        return this.action == null ? Optional.empty() : Optional.ofNullable(this.action);
    }

    /**
     * IP restriction rule description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * IP restriction rule headers.
     * X-Forwarded-Host (https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Forwarded-Host#Examples).
     * The matching logic is ..
     * - If the property is null or empty (default), all hosts(or lack of) are allowed.
     * - A value is compared using ordinal-ignore-case (excluding port number).
     * - Subdomain wildcards are permitted but don't match the root domain. For example, *.contoso.com matches the subdomain foo.contoso.com
     *    but not the root domain contoso.com or multi-level foo.bar.contoso.com
     * - Unicode host names are allowed but are converted to Punycode for matching.
     * 
     * X-Forwarded-For (https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Forwarded-For#Examples).
     * The matching logic is ..
     * - If the property is null or empty (default), any forwarded-for chains (or lack of) are allowed.
     * - If any address (excluding port number) in the chain (comma separated) matches the CIDR defined by the property.
     * 
     * X-Azure-FDID and X-FD-HealthProbe.
     * The matching logic is exact match.
     * 
     */
    @Import(name="headers")
      private final @Nullable Map<String,List<String>> headers;

    public Map<String,List<String>> getHeaders() {
        return this.headers == null ? Map.of() : this.headers;
    }

    /**
     * IP address the security restriction is valid for.
     * It can be in form of pure ipv4 address (required SubnetMask property) or
     * CIDR notation such as ipv4/mask (leading bit match). For CIDR,
     * SubnetMask property must not be specified.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable String ipAddress;

    public Optional<String> getIpAddress() {
        return this.ipAddress == null ? Optional.empty() : Optional.ofNullable(this.ipAddress);
    }

    /**
     * IP restriction rule name.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Priority of IP restriction rule.
     * 
     */
    @Import(name="priority")
      private final @Nullable Integer priority;

    public Optional<Integer> getPriority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    /**
     * Subnet mask for the range of IP addresses the restriction is valid for.
     * 
     */
    @Import(name="subnetMask")
      private final @Nullable String subnetMask;

    public Optional<String> getSubnetMask() {
        return this.subnetMask == null ? Optional.empty() : Optional.ofNullable(this.subnetMask);
    }

    /**
     * (internal) Subnet traffic tag
     * 
     */
    @Import(name="subnetTrafficTag")
      private final @Nullable Integer subnetTrafficTag;

    public Optional<Integer> getSubnetTrafficTag() {
        return this.subnetTrafficTag == null ? Optional.empty() : Optional.ofNullable(this.subnetTrafficTag);
    }

    /**
     * Defines what this IP filter will be used for. This is to support IP filtering on proxies.
     * 
     */
    @Import(name="tag")
      private final @Nullable String tag;

    public Optional<String> getTag() {
        return this.tag == null ? Optional.empty() : Optional.ofNullable(this.tag);
    }

    /**
     * Virtual network resource id
     * 
     */
    @Import(name="vnetSubnetResourceId")
      private final @Nullable String vnetSubnetResourceId;

    public Optional<String> getVnetSubnetResourceId() {
        return this.vnetSubnetResourceId == null ? Optional.empty() : Optional.ofNullable(this.vnetSubnetResourceId);
    }

    /**
     * (internal) Vnet traffic tag
     * 
     */
    @Import(name="vnetTrafficTag")
      private final @Nullable Integer vnetTrafficTag;

    public Optional<Integer> getVnetTrafficTag() {
        return this.vnetTrafficTag == null ? Optional.empty() : Optional.ofNullable(this.vnetTrafficTag);
    }

    public IpSecurityRestrictionResponse(
        @Nullable String action,
        @Nullable String description,
        @Nullable Map<String,List<String>> headers,
        @Nullable String ipAddress,
        @Nullable String name,
        @Nullable Integer priority,
        @Nullable String subnetMask,
        @Nullable Integer subnetTrafficTag,
        @Nullable String tag,
        @Nullable String vnetSubnetResourceId,
        @Nullable Integer vnetTrafficTag) {
        this.action = action;
        this.description = description;
        this.headers = headers;
        this.ipAddress = ipAddress;
        this.name = name;
        this.priority = priority;
        this.subnetMask = subnetMask;
        this.subnetTrafficTag = subnetTrafficTag;
        this.tag = tag;
        this.vnetSubnetResourceId = vnetSubnetResourceId;
        this.vnetTrafficTag = vnetTrafficTag;
    }

    private IpSecurityRestrictionResponse() {
        this.action = null;
        this.description = null;
        this.headers = Map.of();
        this.ipAddress = null;
        this.name = null;
        this.priority = null;
        this.subnetMask = null;
        this.subnetTrafficTag = null;
        this.tag = null;
        this.vnetSubnetResourceId = null;
        this.vnetTrafficTag = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpSecurityRestrictionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable String description;
        private @Nullable Map<String,List<String>> headers;
        private @Nullable String ipAddress;
        private @Nullable String name;
        private @Nullable Integer priority;
        private @Nullable String subnetMask;
        private @Nullable Integer subnetTrafficTag;
        private @Nullable String tag;
        private @Nullable String vnetSubnetResourceId;
        private @Nullable Integer vnetTrafficTag;

        public Builder() {
    	      // Empty
        }

        public Builder(IpSecurityRestrictionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.headers = defaults.headers;
    	      this.ipAddress = defaults.ipAddress;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.subnetMask = defaults.subnetMask;
    	      this.subnetTrafficTag = defaults.subnetTrafficTag;
    	      this.tag = defaults.tag;
    	      this.vnetSubnetResourceId = defaults.vnetSubnetResourceId;
    	      this.vnetTrafficTag = defaults.vnetTrafficTag;
        }

        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder headers(@Nullable Map<String,List<String>> headers) {
            this.headers = headers;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder subnetMask(@Nullable String subnetMask) {
            this.subnetMask = subnetMask;
            return this;
        }

        public Builder subnetTrafficTag(@Nullable Integer subnetTrafficTag) {
            this.subnetTrafficTag = subnetTrafficTag;
            return this;
        }

        public Builder tag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }

        public Builder vnetSubnetResourceId(@Nullable String vnetSubnetResourceId) {
            this.vnetSubnetResourceId = vnetSubnetResourceId;
            return this;
        }

        public Builder vnetTrafficTag(@Nullable Integer vnetTrafficTag) {
            this.vnetTrafficTag = vnetTrafficTag;
            return this;
        }
        public IpSecurityRestrictionResponse build() {
            return new IpSecurityRestrictionResponse(action, description, headers, ipAddress, name, priority, subnetMask, subnetTrafficTag, tag, vnetSubnetResourceId, vnetTrafficTag);
        }
    }
}
