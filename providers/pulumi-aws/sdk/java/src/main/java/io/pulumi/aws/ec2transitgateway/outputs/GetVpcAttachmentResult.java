// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway.outputs;

import io.pulumi.aws.ec2transitgateway.outputs.GetVpcAttachmentFilter;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetVpcAttachmentResult {
    /**
     * Whether Appliance Mode support is enabled.
     * 
     */
    private final String applianceModeSupport;
    /**
     * Whether DNS support is enabled.
     * 
     */
    private final String dnsSupport;
    private final @Nullable List<GetVpcAttachmentFilter> filters;
    /**
     * EC2 Transit Gateway VPC Attachment identifier
     * 
     */
    private final String id;
    /**
     * Whether IPv6 support is enabled.
     * 
     */
    private final String ipv6Support;
    /**
     * Identifiers of EC2 Subnets.
     * 
     */
    private final List<String> subnetIds;
    /**
     * Key-value tags for the EC2 Transit Gateway VPC Attachment
     * 
     */
    private final Map<String,String> tags;
    /**
     * EC2 Transit Gateway identifier
     * 
     */
    private final String transitGatewayId;
    /**
     * Identifier of EC2 VPC.
     * 
     */
    private final String vpcId;
    /**
     * Identifier of the AWS account that owns the EC2 VPC.
     * 
     */
    private final String vpcOwnerId;

    @CustomType.Constructor
    private GetVpcAttachmentResult(
        @CustomType.Parameter("applianceModeSupport") String applianceModeSupport,
        @CustomType.Parameter("dnsSupport") String dnsSupport,
        @CustomType.Parameter("filters") @Nullable List<GetVpcAttachmentFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ipv6Support") String ipv6Support,
        @CustomType.Parameter("subnetIds") List<String> subnetIds,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("transitGatewayId") String transitGatewayId,
        @CustomType.Parameter("vpcId") String vpcId,
        @CustomType.Parameter("vpcOwnerId") String vpcOwnerId) {
        this.applianceModeSupport = applianceModeSupport;
        this.dnsSupport = dnsSupport;
        this.filters = filters;
        this.id = id;
        this.ipv6Support = ipv6Support;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.transitGatewayId = transitGatewayId;
        this.vpcId = vpcId;
        this.vpcOwnerId = vpcOwnerId;
    }

    /**
     * Whether Appliance Mode support is enabled.
     * 
    */
    public String getApplianceModeSupport() {
        return this.applianceModeSupport;
    }
    /**
     * Whether DNS support is enabled.
     * 
    */
    public String getDnsSupport() {
        return this.dnsSupport;
    }
    public List<GetVpcAttachmentFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * EC2 Transit Gateway VPC Attachment identifier
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Whether IPv6 support is enabled.
     * 
    */
    public String getIpv6Support() {
        return this.ipv6Support;
    }
    /**
     * Identifiers of EC2 Subnets.
     * 
    */
    public List<String> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * Key-value tags for the EC2 Transit Gateway VPC Attachment
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * EC2 Transit Gateway identifier
     * 
    */
    public String getTransitGatewayId() {
        return this.transitGatewayId;
    }
    /**
     * Identifier of EC2 VPC.
     * 
    */
    public String getVpcId() {
        return this.vpcId;
    }
    /**
     * Identifier of the AWS account that owns the EC2 VPC.
     * 
    */
    public String getVpcOwnerId() {
        return this.vpcOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcAttachmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applianceModeSupport;
        private String dnsSupport;
        private @Nullable List<GetVpcAttachmentFilter> filters;
        private String id;
        private String ipv6Support;
        private List<String> subnetIds;
        private Map<String,String> tags;
        private String transitGatewayId;
        private String vpcId;
        private String vpcOwnerId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcAttachmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applianceModeSupport = defaults.applianceModeSupport;
    	      this.dnsSupport = defaults.dnsSupport;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ipv6Support = defaults.ipv6Support;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.transitGatewayId = defaults.transitGatewayId;
    	      this.vpcId = defaults.vpcId;
    	      this.vpcOwnerId = defaults.vpcOwnerId;
        }

        public Builder applianceModeSupport(String applianceModeSupport) {
            this.applianceModeSupport = Objects.requireNonNull(applianceModeSupport);
            return this;
        }

        public Builder dnsSupport(String dnsSupport) {
            this.dnsSupport = Objects.requireNonNull(dnsSupport);
            return this;
        }

        public Builder filters(@Nullable List<GetVpcAttachmentFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder ipv6Support(String ipv6Support) {
            this.ipv6Support = Objects.requireNonNull(ipv6Support);
            return this;
        }

        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder transitGatewayId(String transitGatewayId) {
            this.transitGatewayId = Objects.requireNonNull(transitGatewayId);
            return this;
        }

        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }

        public Builder vpcOwnerId(String vpcOwnerId) {
            this.vpcOwnerId = Objects.requireNonNull(vpcOwnerId);
            return this;
        }
        public GetVpcAttachmentResult build() {
            return new GetVpcAttachmentResult(applianceModeSupport, dnsSupport, filters, id, ipv6Support, subnetIds, tags, transitGatewayId, vpcId, vpcOwnerId);
        }
    }
}
