// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.TransitGatewayPeeringAttachmentOptionsArgs;
import io.pulumi.awsnative.ec2.inputs.TransitGatewayPeeringAttachmentTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransitGatewayPeeringAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransitGatewayPeeringAttachmentArgs Empty = new TransitGatewayPeeringAttachmentArgs();

    /**
     * Options for transit gateway peering attachment
     * 
     */
    @Import(name="options")
      private final @Nullable Output<TransitGatewayPeeringAttachmentOptionsArgs> options;

    public Output<TransitGatewayPeeringAttachmentOptionsArgs> getOptions() {
        return this.options == null ? Output.empty() : this.options;
    }

    /**
     * The ID of the peer account
     * 
     */
    @Import(name="peerAccountId", required=true)
      private final Output<String> peerAccountId;

    public Output<String> getPeerAccountId() {
        return this.peerAccountId;
    }

    /**
     * Peer Region
     * 
     */
    @Import(name="peerRegion", required=true)
      private final Output<String> peerRegion;

    public Output<String> getPeerRegion() {
        return this.peerRegion;
    }

    /**
     * The ID of the peer transit gateway.
     * 
     */
    @Import(name="peerTransitGatewayId", required=true)
      private final Output<String> peerTransitGatewayId;

    public Output<String> getPeerTransitGatewayId() {
        return this.peerTransitGatewayId;
    }

    /**
     * The tags for the transit gateway peering attachment.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<TransitGatewayPeeringAttachmentTagArgs>> tags;

    public Output<List<TransitGatewayPeeringAttachmentTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The ID of the transit gateway.
     * 
     */
    @Import(name="transitGatewayId", required=true)
      private final Output<String> transitGatewayId;

    public Output<String> getTransitGatewayId() {
        return this.transitGatewayId;
    }

    public TransitGatewayPeeringAttachmentArgs(
        @Nullable Output<TransitGatewayPeeringAttachmentOptionsArgs> options,
        Output<String> peerAccountId,
        Output<String> peerRegion,
        Output<String> peerTransitGatewayId,
        @Nullable Output<List<TransitGatewayPeeringAttachmentTagArgs>> tags,
        Output<String> transitGatewayId) {
        this.options = options;
        this.peerAccountId = Objects.requireNonNull(peerAccountId, "expected parameter 'peerAccountId' to be non-null");
        this.peerRegion = Objects.requireNonNull(peerRegion, "expected parameter 'peerRegion' to be non-null");
        this.peerTransitGatewayId = Objects.requireNonNull(peerTransitGatewayId, "expected parameter 'peerTransitGatewayId' to be non-null");
        this.tags = tags;
        this.transitGatewayId = Objects.requireNonNull(transitGatewayId, "expected parameter 'transitGatewayId' to be non-null");
    }

    private TransitGatewayPeeringAttachmentArgs() {
        this.options = Output.empty();
        this.peerAccountId = Output.empty();
        this.peerRegion = Output.empty();
        this.peerTransitGatewayId = Output.empty();
        this.tags = Output.empty();
        this.transitGatewayId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayPeeringAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TransitGatewayPeeringAttachmentOptionsArgs> options;
        private Output<String> peerAccountId;
        private Output<String> peerRegion;
        private Output<String> peerTransitGatewayId;
        private @Nullable Output<List<TransitGatewayPeeringAttachmentTagArgs>> tags;
        private Output<String> transitGatewayId;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayPeeringAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.options = defaults.options;
    	      this.peerAccountId = defaults.peerAccountId;
    	      this.peerRegion = defaults.peerRegion;
    	      this.peerTransitGatewayId = defaults.peerTransitGatewayId;
    	      this.tags = defaults.tags;
    	      this.transitGatewayId = defaults.transitGatewayId;
        }

        public Builder options(@Nullable Output<TransitGatewayPeeringAttachmentOptionsArgs> options) {
            this.options = options;
            return this;
        }

        public Builder options(@Nullable TransitGatewayPeeringAttachmentOptionsArgs options) {
            this.options = Output.ofNullable(options);
            return this;
        }

        public Builder peerAccountId(Output<String> peerAccountId) {
            this.peerAccountId = Objects.requireNonNull(peerAccountId);
            return this;
        }

        public Builder peerAccountId(String peerAccountId) {
            this.peerAccountId = Output.of(Objects.requireNonNull(peerAccountId));
            return this;
        }

        public Builder peerRegion(Output<String> peerRegion) {
            this.peerRegion = Objects.requireNonNull(peerRegion);
            return this;
        }

        public Builder peerRegion(String peerRegion) {
            this.peerRegion = Output.of(Objects.requireNonNull(peerRegion));
            return this;
        }

        public Builder peerTransitGatewayId(Output<String> peerTransitGatewayId) {
            this.peerTransitGatewayId = Objects.requireNonNull(peerTransitGatewayId);
            return this;
        }

        public Builder peerTransitGatewayId(String peerTransitGatewayId) {
            this.peerTransitGatewayId = Output.of(Objects.requireNonNull(peerTransitGatewayId));
            return this;
        }

        public Builder tags(@Nullable Output<List<TransitGatewayPeeringAttachmentTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<TransitGatewayPeeringAttachmentTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder transitGatewayId(Output<String> transitGatewayId) {
            this.transitGatewayId = Objects.requireNonNull(transitGatewayId);
            return this;
        }

        public Builder transitGatewayId(String transitGatewayId) {
            this.transitGatewayId = Output.of(Objects.requireNonNull(transitGatewayId));
            return this;
        }
        public TransitGatewayPeeringAttachmentArgs build() {
            return new TransitGatewayPeeringAttachmentArgs(options, peerAccountId, peerRegion, peerTransitGatewayId, tags, transitGatewayId);
        }
    }
}
