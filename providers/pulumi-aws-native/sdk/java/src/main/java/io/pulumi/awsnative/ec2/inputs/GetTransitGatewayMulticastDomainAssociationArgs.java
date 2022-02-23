// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetTransitGatewayMulticastDomainAssociationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTransitGatewayMulticastDomainAssociationArgs Empty = new GetTransitGatewayMulticastDomainAssociationArgs();

    /**
     * The IDs of the subnets to associate with the transit gateway multicast domain.
     * 
     */
    @InputImport(name="subnetId", required=true)
        private final String subnetId;

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * The ID of the transit gateway attachment.
     * 
     */
    @InputImport(name="transitGatewayAttachmentId", required=true)
        private final String transitGatewayAttachmentId;

    public String getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    /**
     * The ID of the transit gateway multicast domain.
     * 
     */
    @InputImport(name="transitGatewayMulticastDomainId", required=true)
        private final String transitGatewayMulticastDomainId;

    public String getTransitGatewayMulticastDomainId() {
        return this.transitGatewayMulticastDomainId;
    }

    public GetTransitGatewayMulticastDomainAssociationArgs(
        String subnetId,
        String transitGatewayAttachmentId,
        String transitGatewayMulticastDomainId) {
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
        this.transitGatewayAttachmentId = Objects.requireNonNull(transitGatewayAttachmentId, "expected parameter 'transitGatewayAttachmentId' to be non-null");
        this.transitGatewayMulticastDomainId = Objects.requireNonNull(transitGatewayMulticastDomainId, "expected parameter 'transitGatewayMulticastDomainId' to be non-null");
    }

    private GetTransitGatewayMulticastDomainAssociationArgs() {
        this.subnetId = null;
        this.transitGatewayAttachmentId = null;
        this.transitGatewayMulticastDomainId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitGatewayMulticastDomainAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String subnetId;
        private String transitGatewayAttachmentId;
        private String transitGatewayMulticastDomainId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransitGatewayMulticastDomainAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
    	      this.transitGatewayAttachmentId = defaults.transitGatewayAttachmentId;
    	      this.transitGatewayMulticastDomainId = defaults.transitGatewayMulticastDomainId;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder setTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = Objects.requireNonNull(transitGatewayAttachmentId);
            return this;
        }

        public Builder setTransitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
            this.transitGatewayMulticastDomainId = Objects.requireNonNull(transitGatewayMulticastDomainId);
            return this;
        }
        public GetTransitGatewayMulticastDomainAssociationArgs build() {
            return new GetTransitGatewayMulticastDomainAssociationArgs(subnetId, transitGatewayAttachmentId, transitGatewayMulticastDomainId);
        }
    }
}
