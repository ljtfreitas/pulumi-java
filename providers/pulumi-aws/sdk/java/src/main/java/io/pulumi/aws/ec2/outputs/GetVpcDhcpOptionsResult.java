// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetVpcDhcpOptionsFilter;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetVpcDhcpOptionsResult {
    /**
     * The ARN of the DHCP Options Set.
     * 
     */
    private final String arn;
    /**
     * EC2 DHCP Options ID
     * 
     */
    private final String dhcpOptionsId;
    /**
     * The suffix domain name to used when resolving non Fully Qualified Domain NamesE.g., the `search` value in the `/etc/resolv.conf` file.
     * 
     */
    private final String domainName;
    /**
     * List of name servers.
     * 
     */
    private final List<String> domainNameServers;
    private final @Nullable List<GetVpcDhcpOptionsFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * List of NETBIOS name servers.
     * 
     */
    private final List<String> netbiosNameServers;
    /**
     * The NetBIOS node type (1, 2, 4, or 8). For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
     * 
     */
    private final String netbiosNodeType;
    /**
     * List of NTP servers.
     * 
     */
    private final List<String> ntpServers;
    /**
     * The ID of the AWS account that owns the DHCP options set.
     * 
     */
    private final String ownerId;
    /**
     * A map of tags assigned to the resource.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetVpcDhcpOptionsResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("dhcpOptionsId") String dhcpOptionsId,
        @CustomType.Parameter("domainName") String domainName,
        @CustomType.Parameter("domainNameServers") List<String> domainNameServers,
        @CustomType.Parameter("filters") @Nullable List<GetVpcDhcpOptionsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("netbiosNameServers") List<String> netbiosNameServers,
        @CustomType.Parameter("netbiosNodeType") String netbiosNodeType,
        @CustomType.Parameter("ntpServers") List<String> ntpServers,
        @CustomType.Parameter("ownerId") String ownerId,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.arn = arn;
        this.dhcpOptionsId = dhcpOptionsId;
        this.domainName = domainName;
        this.domainNameServers = domainNameServers;
        this.filters = filters;
        this.id = id;
        this.netbiosNameServers = netbiosNameServers;
        this.netbiosNodeType = netbiosNodeType;
        this.ntpServers = ntpServers;
        this.ownerId = ownerId;
        this.tags = tags;
    }

    /**
     * The ARN of the DHCP Options Set.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * EC2 DHCP Options ID
     * 
    */
    public String getDhcpOptionsId() {
        return this.dhcpOptionsId;
    }
    /**
     * The suffix domain name to used when resolving non Fully Qualified Domain NamesE.g., the `search` value in the `/etc/resolv.conf` file.
     * 
    */
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * List of name servers.
     * 
    */
    public List<String> getDomainNameServers() {
        return this.domainNameServers;
    }
    public List<GetVpcDhcpOptionsFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * List of NETBIOS name servers.
     * 
    */
    public List<String> getNetbiosNameServers() {
        return this.netbiosNameServers;
    }
    /**
     * The NetBIOS node type (1, 2, 4, or 8). For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
     * 
    */
    public String getNetbiosNodeType() {
        return this.netbiosNodeType;
    }
    /**
     * List of NTP servers.
     * 
    */
    public List<String> getNtpServers() {
        return this.ntpServers;
    }
    /**
     * The ID of the AWS account that owns the DHCP options set.
     * 
    */
    public String getOwnerId() {
        return this.ownerId;
    }
    /**
     * A map of tags assigned to the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcDhcpOptionsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String dhcpOptionsId;
        private String domainName;
        private List<String> domainNameServers;
        private @Nullable List<GetVpcDhcpOptionsFilter> filters;
        private String id;
        private List<String> netbiosNameServers;
        private String netbiosNodeType;
        private List<String> ntpServers;
        private String ownerId;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcDhcpOptionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dhcpOptionsId = defaults.dhcpOptionsId;
    	      this.domainName = defaults.domainName;
    	      this.domainNameServers = defaults.domainNameServers;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.netbiosNameServers = defaults.netbiosNameServers;
    	      this.netbiosNodeType = defaults.netbiosNodeType;
    	      this.ntpServers = defaults.ntpServers;
    	      this.ownerId = defaults.ownerId;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder dhcpOptionsId(String dhcpOptionsId) {
            this.dhcpOptionsId = Objects.requireNonNull(dhcpOptionsId);
            return this;
        }

        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder domainNameServers(List<String> domainNameServers) {
            this.domainNameServers = Objects.requireNonNull(domainNameServers);
            return this;
        }

        public Builder filters(@Nullable List<GetVpcDhcpOptionsFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder netbiosNameServers(List<String> netbiosNameServers) {
            this.netbiosNameServers = Objects.requireNonNull(netbiosNameServers);
            return this;
        }

        public Builder netbiosNodeType(String netbiosNodeType) {
            this.netbiosNodeType = Objects.requireNonNull(netbiosNodeType);
            return this;
        }

        public Builder ntpServers(List<String> ntpServers) {
            this.ntpServers = Objects.requireNonNull(ntpServers);
            return this;
        }

        public Builder ownerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetVpcDhcpOptionsResult build() {
            return new GetVpcDhcpOptionsResult(arn, dhcpOptionsId, domainName, domainNameServers, filters, id, netbiosNameServers, netbiosNodeType, ntpServers, ownerId, tags);
        }
    }
}
