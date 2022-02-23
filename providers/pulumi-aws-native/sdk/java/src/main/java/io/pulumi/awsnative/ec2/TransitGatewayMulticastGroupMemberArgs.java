// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TransitGatewayMulticastGroupMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransitGatewayMulticastGroupMemberArgs Empty = new TransitGatewayMulticastGroupMemberArgs();

    /**
     * The IP address assigned to the transit gateway multicast group.
     * 
     */
    @InputImport(name="groupIpAddress", required=true)
        private final Input<String> groupIpAddress;

    public Input<String> getGroupIpAddress() {
        return this.groupIpAddress;
    }

    /**
     * The ID of the transit gateway attachment.
     * 
     */
    @InputImport(name="networkInterfaceId", required=true)
        private final Input<String> networkInterfaceId;

    public Input<String> getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * The ID of the transit gateway multicast domain.
     * 
     */
    @InputImport(name="transitGatewayMulticastDomainId", required=true)
        private final Input<String> transitGatewayMulticastDomainId;

    public Input<String> getTransitGatewayMulticastDomainId() {
        return this.transitGatewayMulticastDomainId;
    }

    public TransitGatewayMulticastGroupMemberArgs(
        Input<String> groupIpAddress,
        Input<String> networkInterfaceId,
        Input<String> transitGatewayMulticastDomainId) {
        this.groupIpAddress = Objects.requireNonNull(groupIpAddress, "expected parameter 'groupIpAddress' to be non-null");
        this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId, "expected parameter 'networkInterfaceId' to be non-null");
        this.transitGatewayMulticastDomainId = Objects.requireNonNull(transitGatewayMulticastDomainId, "expected parameter 'transitGatewayMulticastDomainId' to be non-null");
    }

    private TransitGatewayMulticastGroupMemberArgs() {
        this.groupIpAddress = Input.empty();
        this.networkInterfaceId = Input.empty();
        this.transitGatewayMulticastDomainId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayMulticastGroupMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> groupIpAddress;
        private Input<String> networkInterfaceId;
        private Input<String> transitGatewayMulticastDomainId;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayMulticastGroupMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIpAddress = defaults.groupIpAddress;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.transitGatewayMulticastDomainId = defaults.transitGatewayMulticastDomainId;
        }

        public Builder setGroupIpAddress(Input<String> groupIpAddress) {
            this.groupIpAddress = Objects.requireNonNull(groupIpAddress);
            return this;
        }

        public Builder setGroupIpAddress(String groupIpAddress) {
            this.groupIpAddress = Input.of(Objects.requireNonNull(groupIpAddress));
            return this;
        }

        public Builder setNetworkInterfaceId(Input<String> networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }

        public Builder setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Input.of(Objects.requireNonNull(networkInterfaceId));
            return this;
        }

        public Builder setTransitGatewayMulticastDomainId(Input<String> transitGatewayMulticastDomainId) {
            this.transitGatewayMulticastDomainId = Objects.requireNonNull(transitGatewayMulticastDomainId);
            return this;
        }

        public Builder setTransitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
            this.transitGatewayMulticastDomainId = Input.of(Objects.requireNonNull(transitGatewayMulticastDomainId));
            return this;
        }
        public TransitGatewayMulticastGroupMemberArgs build() {
            return new TransitGatewayMulticastGroupMemberArgs(groupIpAddress, networkInterfaceId, transitGatewayMulticastDomainId);
        }
    }
}
