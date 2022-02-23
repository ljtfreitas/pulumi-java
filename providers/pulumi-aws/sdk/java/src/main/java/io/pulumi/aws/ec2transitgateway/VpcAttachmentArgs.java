// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcAttachmentArgs Empty = new VpcAttachmentArgs();

    /**
     * Whether Appliance Mode support is enabled. If enabled, a traffic flow between a source and destination uses the same Availability Zone for the VPC attachment for the lifetime of that flow. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    @InputImport(name="applianceModeSupport")
    private final @Nullable Input<String> applianceModeSupport;

    public Input<String> getApplianceModeSupport() {
        return this.applianceModeSupport == null ? Input.empty() : this.applianceModeSupport;
    }

    /**
     * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @InputImport(name="dnsSupport")
    private final @Nullable Input<String> dnsSupport;

    public Input<String> getDnsSupport() {
        return this.dnsSupport == null ? Input.empty() : this.dnsSupport;
    }

    /**
     * Whether IPv6 support is enabled. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    @InputImport(name="ipv6Support")
    private final @Nullable Input<String> ipv6Support;

    public Input<String> getIpv6Support() {
        return this.ipv6Support == null ? Input.empty() : this.ipv6Support;
    }

    /**
     * Identifiers of EC2 Subnets.
     * 
     */
    @InputImport(name="subnetIds", required=true)
    private final Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    /**
     * Key-value tags for the EC2 Transit Gateway VPC Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
     * 
     */
    @InputImport(name="transitGatewayDefaultRouteTableAssociation")
    private final @Nullable Input<Boolean> transitGatewayDefaultRouteTableAssociation;

    public Input<Boolean> getTransitGatewayDefaultRouteTableAssociation() {
        return this.transitGatewayDefaultRouteTableAssociation == null ? Input.empty() : this.transitGatewayDefaultRouteTableAssociation;
    }

    /**
     * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
     * 
     */
    @InputImport(name="transitGatewayDefaultRouteTablePropagation")
    private final @Nullable Input<Boolean> transitGatewayDefaultRouteTablePropagation;

    public Input<Boolean> getTransitGatewayDefaultRouteTablePropagation() {
        return this.transitGatewayDefaultRouteTablePropagation == null ? Input.empty() : this.transitGatewayDefaultRouteTablePropagation;
    }

    /**
     * Identifier of EC2 Transit Gateway.
     * 
     */
    @InputImport(name="transitGatewayId", required=true)
    private final Input<String> transitGatewayId;

    public Input<String> getTransitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     * Identifier of EC2 VPC.
     * 
     */
    @InputImport(name="vpcId", required=true)
    private final Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId;
    }

    public VpcAttachmentArgs(
        @Nullable Input<String> applianceModeSupport,
        @Nullable Input<String> dnsSupport,
        @Nullable Input<String> ipv6Support,
        Input<List<String>> subnetIds,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Boolean> transitGatewayDefaultRouteTableAssociation,
        @Nullable Input<Boolean> transitGatewayDefaultRouteTablePropagation,
        Input<String> transitGatewayId,
        Input<String> vpcId) {
        this.applianceModeSupport = applianceModeSupport;
        this.dnsSupport = dnsSupport;
        this.ipv6Support = ipv6Support;
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.tags = tags;
        this.transitGatewayDefaultRouteTableAssociation = transitGatewayDefaultRouteTableAssociation;
        this.transitGatewayDefaultRouteTablePropagation = transitGatewayDefaultRouteTablePropagation;
        this.transitGatewayId = Objects.requireNonNull(transitGatewayId, "expected parameter 'transitGatewayId' to be non-null");
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private VpcAttachmentArgs() {
        this.applianceModeSupport = Input.empty();
        this.dnsSupport = Input.empty();
        this.ipv6Support = Input.empty();
        this.subnetIds = Input.empty();
        this.tags = Input.empty();
        this.transitGatewayDefaultRouteTableAssociation = Input.empty();
        this.transitGatewayDefaultRouteTablePropagation = Input.empty();
        this.transitGatewayId = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applianceModeSupport;
        private @Nullable Input<String> dnsSupport;
        private @Nullable Input<String> ipv6Support;
        private Input<List<String>> subnetIds;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Boolean> transitGatewayDefaultRouteTableAssociation;
        private @Nullable Input<Boolean> transitGatewayDefaultRouteTablePropagation;
        private Input<String> transitGatewayId;
        private Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applianceModeSupport = defaults.applianceModeSupport;
    	      this.dnsSupport = defaults.dnsSupport;
    	      this.ipv6Support = defaults.ipv6Support;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.transitGatewayDefaultRouteTableAssociation = defaults.transitGatewayDefaultRouteTableAssociation;
    	      this.transitGatewayDefaultRouteTablePropagation = defaults.transitGatewayDefaultRouteTablePropagation;
    	      this.transitGatewayId = defaults.transitGatewayId;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setApplianceModeSupport(@Nullable Input<String> applianceModeSupport) {
            this.applianceModeSupport = applianceModeSupport;
            return this;
        }

        public Builder setApplianceModeSupport(@Nullable String applianceModeSupport) {
            this.applianceModeSupport = Input.ofNullable(applianceModeSupport);
            return this;
        }

        public Builder setDnsSupport(@Nullable Input<String> dnsSupport) {
            this.dnsSupport = dnsSupport;
            return this;
        }

        public Builder setDnsSupport(@Nullable String dnsSupport) {
            this.dnsSupport = Input.ofNullable(dnsSupport);
            return this;
        }

        public Builder setIpv6Support(@Nullable Input<String> ipv6Support) {
            this.ipv6Support = ipv6Support;
            return this;
        }

        public Builder setIpv6Support(@Nullable String ipv6Support) {
            this.ipv6Support = Input.ofNullable(ipv6Support);
            return this;
        }

        public Builder setSubnetIds(Input<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder setSubnetIds(List<String> subnetIds) {
            this.subnetIds = Input.of(Objects.requireNonNull(subnetIds));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTransitGatewayDefaultRouteTableAssociation(@Nullable Input<Boolean> transitGatewayDefaultRouteTableAssociation) {
            this.transitGatewayDefaultRouteTableAssociation = transitGatewayDefaultRouteTableAssociation;
            return this;
        }

        public Builder setTransitGatewayDefaultRouteTableAssociation(@Nullable Boolean transitGatewayDefaultRouteTableAssociation) {
            this.transitGatewayDefaultRouteTableAssociation = Input.ofNullable(transitGatewayDefaultRouteTableAssociation);
            return this;
        }

        public Builder setTransitGatewayDefaultRouteTablePropagation(@Nullable Input<Boolean> transitGatewayDefaultRouteTablePropagation) {
            this.transitGatewayDefaultRouteTablePropagation = transitGatewayDefaultRouteTablePropagation;
            return this;
        }

        public Builder setTransitGatewayDefaultRouteTablePropagation(@Nullable Boolean transitGatewayDefaultRouteTablePropagation) {
            this.transitGatewayDefaultRouteTablePropagation = Input.ofNullable(transitGatewayDefaultRouteTablePropagation);
            return this;
        }

        public Builder setTransitGatewayId(Input<String> transitGatewayId) {
            this.transitGatewayId = Objects.requireNonNull(transitGatewayId);
            return this;
        }

        public Builder setTransitGatewayId(String transitGatewayId) {
            this.transitGatewayId = Input.of(Objects.requireNonNull(transitGatewayId));
            return this;
        }

        public Builder setVpcId(Input<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Input.of(Objects.requireNonNull(vpcId));
            return this;
        }
        public VpcAttachmentArgs build() {
            return new VpcAttachmentArgs(applianceModeSupport, dnsSupport, ipv6Support, subnetIds, tags, transitGatewayDefaultRouteTableAssociation, transitGatewayDefaultRouteTablePropagation, transitGatewayId, vpcId);
        }
    }
}
