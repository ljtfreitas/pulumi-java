// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteState extends io.pulumi.resources.ResourceArgs {

    public static final RouteState Empty = new RouteState();

    /**
     * Indicates whether to drop traffic that matches this route (default to `false`).
     * 
     */
    @InputImport(name="blackhole")
    private final @Nullable Input<Boolean> blackhole;

    public Input<Boolean> getBlackhole() {
        return this.blackhole == null ? Input.empty() : this.blackhole;
    }

    /**
     * IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
     * 
     */
    @InputImport(name="destinationCidrBlock")
    private final @Nullable Input<String> destinationCidrBlock;

    public Input<String> getDestinationCidrBlock() {
        return this.destinationCidrBlock == null ? Input.empty() : this.destinationCidrBlock;
    }

    /**
     * Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
     * 
     */
    @InputImport(name="transitGatewayAttachmentId")
    private final @Nullable Input<String> transitGatewayAttachmentId;

    public Input<String> getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId == null ? Input.empty() : this.transitGatewayAttachmentId;
    }

    /**
     * Identifier of EC2 Transit Gateway Route Table.
     * 
     */
    @InputImport(name="transitGatewayRouteTableId")
    private final @Nullable Input<String> transitGatewayRouteTableId;

    public Input<String> getTransitGatewayRouteTableId() {
        return this.transitGatewayRouteTableId == null ? Input.empty() : this.transitGatewayRouteTableId;
    }

    public RouteState(
        @Nullable Input<Boolean> blackhole,
        @Nullable Input<String> destinationCidrBlock,
        @Nullable Input<String> transitGatewayAttachmentId,
        @Nullable Input<String> transitGatewayRouteTableId) {
        this.blackhole = blackhole;
        this.destinationCidrBlock = destinationCidrBlock;
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
    }

    private RouteState() {
        this.blackhole = Input.empty();
        this.destinationCidrBlock = Input.empty();
        this.transitGatewayAttachmentId = Input.empty();
        this.transitGatewayRouteTableId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> blackhole;
        private @Nullable Input<String> destinationCidrBlock;
        private @Nullable Input<String> transitGatewayAttachmentId;
        private @Nullable Input<String> transitGatewayRouteTableId;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blackhole = defaults.blackhole;
    	      this.destinationCidrBlock = defaults.destinationCidrBlock;
    	      this.transitGatewayAttachmentId = defaults.transitGatewayAttachmentId;
    	      this.transitGatewayRouteTableId = defaults.transitGatewayRouteTableId;
        }

        public Builder setBlackhole(@Nullable Input<Boolean> blackhole) {
            this.blackhole = blackhole;
            return this;
        }

        public Builder setBlackhole(@Nullable Boolean blackhole) {
            this.blackhole = Input.ofNullable(blackhole);
            return this;
        }

        public Builder setDestinationCidrBlock(@Nullable Input<String> destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        public Builder setDestinationCidrBlock(@Nullable String destinationCidrBlock) {
            this.destinationCidrBlock = Input.ofNullable(destinationCidrBlock);
            return this;
        }

        public Builder setTransitGatewayAttachmentId(@Nullable Input<String> transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = transitGatewayAttachmentId;
            return this;
        }

        public Builder setTransitGatewayAttachmentId(@Nullable String transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = Input.ofNullable(transitGatewayAttachmentId);
            return this;
        }

        public Builder setTransitGatewayRouteTableId(@Nullable Input<String> transitGatewayRouteTableId) {
            this.transitGatewayRouteTableId = transitGatewayRouteTableId;
            return this;
        }

        public Builder setTransitGatewayRouteTableId(@Nullable String transitGatewayRouteTableId) {
            this.transitGatewayRouteTableId = Input.ofNullable(transitGatewayRouteTableId);
            return this;
        }
        public RouteState build() {
            return new RouteState(blackhole, destinationCidrBlock, transitGatewayAttachmentId, transitGatewayRouteTableId);
        }
    }
}
