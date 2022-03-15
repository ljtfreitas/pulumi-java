// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcAttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final VpcAttachmentState Empty = new VpcAttachmentState();

    /**
     * Whether Appliance Mode support is enabled. If enabled, a traffic flow between a source and destination uses the same Availability Zone for the VPC attachment for the lifetime of that flow. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    @Import(name="applianceModeSupport")
      private final @Nullable Output<String> applianceModeSupport;

    public Output<String> getApplianceModeSupport() {
        return this.applianceModeSupport == null ? Output.empty() : this.applianceModeSupport;
    }

    /**
     * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @Import(name="dnsSupport")
      private final @Nullable Output<String> dnsSupport;

    public Output<String> getDnsSupport() {
        return this.dnsSupport == null ? Output.empty() : this.dnsSupport;
    }

    /**
     * Whether IPv6 support is enabled. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    @Import(name="ipv6Support")
      private final @Nullable Output<String> ipv6Support;

    public Output<String> getIpv6Support() {
        return this.ipv6Support == null ? Output.empty() : this.ipv6Support;
    }

    /**
     * Identifiers of EC2 Subnets.
     * 
     */
    @Import(name="subnetIds")
      private final @Nullable Output<List<String>> subnetIds;

    public Output<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Output.empty() : this.subnetIds;
    }

    /**
     * Key-value tags for the EC2 Transit Gateway VPC Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
     * 
     */
    @Import(name="transitGatewayDefaultRouteTableAssociation")
      private final @Nullable Output<Boolean> transitGatewayDefaultRouteTableAssociation;

    public Output<Boolean> getTransitGatewayDefaultRouteTableAssociation() {
        return this.transitGatewayDefaultRouteTableAssociation == null ? Output.empty() : this.transitGatewayDefaultRouteTableAssociation;
    }

    /**
     * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
     * 
     */
    @Import(name="transitGatewayDefaultRouteTablePropagation")
      private final @Nullable Output<Boolean> transitGatewayDefaultRouteTablePropagation;

    public Output<Boolean> getTransitGatewayDefaultRouteTablePropagation() {
        return this.transitGatewayDefaultRouteTablePropagation == null ? Output.empty() : this.transitGatewayDefaultRouteTablePropagation;
    }

    /**
     * Identifier of EC2 Transit Gateway.
     * 
     */
    @Import(name="transitGatewayId")
      private final @Nullable Output<String> transitGatewayId;

    public Output<String> getTransitGatewayId() {
        return this.transitGatewayId == null ? Output.empty() : this.transitGatewayId;
    }

    /**
     * Identifier of EC2 VPC.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId == null ? Output.empty() : this.vpcId;
    }

    /**
     * Identifier of the AWS account that owns the EC2 VPC.
     * 
     */
    @Import(name="vpcOwnerId")
      private final @Nullable Output<String> vpcOwnerId;

    public Output<String> getVpcOwnerId() {
        return this.vpcOwnerId == null ? Output.empty() : this.vpcOwnerId;
    }

    public VpcAttachmentState(
        @Nullable Output<String> applianceModeSupport,
        @Nullable Output<String> dnsSupport,
        @Nullable Output<String> ipv6Support,
        @Nullable Output<List<String>> subnetIds,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<Boolean> transitGatewayDefaultRouteTableAssociation,
        @Nullable Output<Boolean> transitGatewayDefaultRouteTablePropagation,
        @Nullable Output<String> transitGatewayId,
        @Nullable Output<String> vpcId,
        @Nullable Output<String> vpcOwnerId) {
        this.applianceModeSupport = applianceModeSupport;
        this.dnsSupport = dnsSupport;
        this.ipv6Support = ipv6Support;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.transitGatewayDefaultRouteTableAssociation = transitGatewayDefaultRouteTableAssociation;
        this.transitGatewayDefaultRouteTablePropagation = transitGatewayDefaultRouteTablePropagation;
        this.transitGatewayId = transitGatewayId;
        this.vpcId = vpcId;
        this.vpcOwnerId = vpcOwnerId;
    }

    private VpcAttachmentState() {
        this.applianceModeSupport = Output.empty();
        this.dnsSupport = Output.empty();
        this.ipv6Support = Output.empty();
        this.subnetIds = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.transitGatewayDefaultRouteTableAssociation = Output.empty();
        this.transitGatewayDefaultRouteTablePropagation = Output.empty();
        this.transitGatewayId = Output.empty();
        this.vpcId = Output.empty();
        this.vpcOwnerId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applianceModeSupport;
        private @Nullable Output<String> dnsSupport;
        private @Nullable Output<String> ipv6Support;
        private @Nullable Output<List<String>> subnetIds;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<Boolean> transitGatewayDefaultRouteTableAssociation;
        private @Nullable Output<Boolean> transitGatewayDefaultRouteTablePropagation;
        private @Nullable Output<String> transitGatewayId;
        private @Nullable Output<String> vpcId;
        private @Nullable Output<String> vpcOwnerId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcAttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applianceModeSupport = defaults.applianceModeSupport;
    	      this.dnsSupport = defaults.dnsSupport;
    	      this.ipv6Support = defaults.ipv6Support;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.transitGatewayDefaultRouteTableAssociation = defaults.transitGatewayDefaultRouteTableAssociation;
    	      this.transitGatewayDefaultRouteTablePropagation = defaults.transitGatewayDefaultRouteTablePropagation;
    	      this.transitGatewayId = defaults.transitGatewayId;
    	      this.vpcId = defaults.vpcId;
    	      this.vpcOwnerId = defaults.vpcOwnerId;
        }

        public Builder applianceModeSupport(@Nullable Output<String> applianceModeSupport) {
            this.applianceModeSupport = applianceModeSupport;
            return this;
        }

        public Builder applianceModeSupport(@Nullable String applianceModeSupport) {
            this.applianceModeSupport = Output.ofNullable(applianceModeSupport);
            return this;
        }

        public Builder dnsSupport(@Nullable Output<String> dnsSupport) {
            this.dnsSupport = dnsSupport;
            return this;
        }

        public Builder dnsSupport(@Nullable String dnsSupport) {
            this.dnsSupport = Output.ofNullable(dnsSupport);
            return this;
        }

        public Builder ipv6Support(@Nullable Output<String> ipv6Support) {
            this.ipv6Support = ipv6Support;
            return this;
        }

        public Builder ipv6Support(@Nullable String ipv6Support) {
            this.ipv6Support = Output.ofNullable(ipv6Support);
            return this;
        }

        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Output.ofNullable(subnetIds);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }

        public Builder transitGatewayDefaultRouteTableAssociation(@Nullable Output<Boolean> transitGatewayDefaultRouteTableAssociation) {
            this.transitGatewayDefaultRouteTableAssociation = transitGatewayDefaultRouteTableAssociation;
            return this;
        }

        public Builder transitGatewayDefaultRouteTableAssociation(@Nullable Boolean transitGatewayDefaultRouteTableAssociation) {
            this.transitGatewayDefaultRouteTableAssociation = Output.ofNullable(transitGatewayDefaultRouteTableAssociation);
            return this;
        }

        public Builder transitGatewayDefaultRouteTablePropagation(@Nullable Output<Boolean> transitGatewayDefaultRouteTablePropagation) {
            this.transitGatewayDefaultRouteTablePropagation = transitGatewayDefaultRouteTablePropagation;
            return this;
        }

        public Builder transitGatewayDefaultRouteTablePropagation(@Nullable Boolean transitGatewayDefaultRouteTablePropagation) {
            this.transitGatewayDefaultRouteTablePropagation = Output.ofNullable(transitGatewayDefaultRouteTablePropagation);
            return this;
        }

        public Builder transitGatewayId(@Nullable Output<String> transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }

        public Builder transitGatewayId(@Nullable String transitGatewayId) {
            this.transitGatewayId = Output.ofNullable(transitGatewayId);
            return this;
        }

        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Output.ofNullable(vpcId);
            return this;
        }

        public Builder vpcOwnerId(@Nullable Output<String> vpcOwnerId) {
            this.vpcOwnerId = vpcOwnerId;
            return this;
        }

        public Builder vpcOwnerId(@Nullable String vpcOwnerId) {
            this.vpcOwnerId = Output.ofNullable(vpcOwnerId);
            return this;
        }
        public VpcAttachmentState build() {
            return new VpcAttachmentState(applianceModeSupport, dnsSupport, ipv6Support, subnetIds, tags, tagsAll, transitGatewayDefaultRouteTableAssociation, transitGatewayDefaultRouteTablePropagation, transitGatewayId, vpcId, vpcOwnerId);
        }
    }
}
