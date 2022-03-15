// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterArgs;
import io.pulumi.aws.ec2.inputs.VpcPeeringConnectionRequesterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcPeeringConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcPeeringConnectionArgs Empty = new VpcPeeringConnectionArgs();

    /**
     * An optional configuration block that allows for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
     * the peering connection (a maximum of one).
     * 
     */
    @Import(name="accepter")
      private final @Nullable Output<VpcPeeringConnectionAccepterArgs> accepter;

    public Output<VpcPeeringConnectionAccepterArgs> getAccepter() {
        return this.accepter == null ? Output.empty() : this.accepter;
    }

    /**
     * Accept the peering (both VPCs need to be in the same AWS account and region).
     * 
     */
    @Import(name="autoAccept")
      private final @Nullable Output<Boolean> autoAccept;

    public Output<Boolean> getAutoAccept() {
        return this.autoAccept == null ? Output.empty() : this.autoAccept;
    }

    /**
     * The AWS account ID of the owner of the peer VPC.
     * Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
     * 
     */
    @Import(name="peerOwnerId")
      private final @Nullable Output<String> peerOwnerId;

    public Output<String> getPeerOwnerId() {
        return this.peerOwnerId == null ? Output.empty() : this.peerOwnerId;
    }

    /**
     * The region of the accepter VPC of the VPC Peering Connection. `auto_accept` must be `false`,
     * and use the `aws.ec2.VpcPeeringConnectionAccepter` to manage the accepter side.
     * 
     */
    @Import(name="peerRegion")
      private final @Nullable Output<String> peerRegion;

    public Output<String> getPeerRegion() {
        return this.peerRegion == null ? Output.empty() : this.peerRegion;
    }

    /**
     * The ID of the VPC with which you are creating the VPC Peering Connection.
     * 
     */
    @Import(name="peerVpcId", required=true)
      private final Output<String> peerVpcId;

    public Output<String> getPeerVpcId() {
        return this.peerVpcId;
    }

    /**
     * A optional configuration block that allows for [VPC Peering Connection](https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
     * the peering connection (a maximum of one).
     * 
     */
    @Import(name="requester")
      private final @Nullable Output<VpcPeeringConnectionRequesterArgs> requester;

    public Output<VpcPeeringConnectionRequesterArgs> getRequester() {
        return this.requester == null ? Output.empty() : this.requester;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The ID of the requester VPC.
     * 
     */
    @Import(name="vpcId", required=true)
      private final Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public VpcPeeringConnectionArgs(
        @Nullable Output<VpcPeeringConnectionAccepterArgs> accepter,
        @Nullable Output<Boolean> autoAccept,
        @Nullable Output<String> peerOwnerId,
        @Nullable Output<String> peerRegion,
        Output<String> peerVpcId,
        @Nullable Output<VpcPeeringConnectionRequesterArgs> requester,
        @Nullable Output<Map<String,String>> tags,
        Output<String> vpcId) {
        this.accepter = accepter;
        this.autoAccept = autoAccept;
        this.peerOwnerId = peerOwnerId;
        this.peerRegion = peerRegion;
        this.peerVpcId = Objects.requireNonNull(peerVpcId, "expected parameter 'peerVpcId' to be non-null");
        this.requester = requester;
        this.tags = tags;
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private VpcPeeringConnectionArgs() {
        this.accepter = Output.empty();
        this.autoAccept = Output.empty();
        this.peerOwnerId = Output.empty();
        this.peerRegion = Output.empty();
        this.peerVpcId = Output.empty();
        this.requester = Output.empty();
        this.tags = Output.empty();
        this.vpcId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcPeeringConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VpcPeeringConnectionAccepterArgs> accepter;
        private @Nullable Output<Boolean> autoAccept;
        private @Nullable Output<String> peerOwnerId;
        private @Nullable Output<String> peerRegion;
        private Output<String> peerVpcId;
        private @Nullable Output<VpcPeeringConnectionRequesterArgs> requester;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcPeeringConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accepter = defaults.accepter;
    	      this.autoAccept = defaults.autoAccept;
    	      this.peerOwnerId = defaults.peerOwnerId;
    	      this.peerRegion = defaults.peerRegion;
    	      this.peerVpcId = defaults.peerVpcId;
    	      this.requester = defaults.requester;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder accepter(@Nullable Output<VpcPeeringConnectionAccepterArgs> accepter) {
            this.accepter = accepter;
            return this;
        }

        public Builder accepter(@Nullable VpcPeeringConnectionAccepterArgs accepter) {
            this.accepter = Output.ofNullable(accepter);
            return this;
        }

        public Builder autoAccept(@Nullable Output<Boolean> autoAccept) {
            this.autoAccept = autoAccept;
            return this;
        }

        public Builder autoAccept(@Nullable Boolean autoAccept) {
            this.autoAccept = Output.ofNullable(autoAccept);
            return this;
        }

        public Builder peerOwnerId(@Nullable Output<String> peerOwnerId) {
            this.peerOwnerId = peerOwnerId;
            return this;
        }

        public Builder peerOwnerId(@Nullable String peerOwnerId) {
            this.peerOwnerId = Output.ofNullable(peerOwnerId);
            return this;
        }

        public Builder peerRegion(@Nullable Output<String> peerRegion) {
            this.peerRegion = peerRegion;
            return this;
        }

        public Builder peerRegion(@Nullable String peerRegion) {
            this.peerRegion = Output.ofNullable(peerRegion);
            return this;
        }

        public Builder peerVpcId(Output<String> peerVpcId) {
            this.peerVpcId = Objects.requireNonNull(peerVpcId);
            return this;
        }

        public Builder peerVpcId(String peerVpcId) {
            this.peerVpcId = Output.of(Objects.requireNonNull(peerVpcId));
            return this;
        }

        public Builder requester(@Nullable Output<VpcPeeringConnectionRequesterArgs> requester) {
            this.requester = requester;
            return this;
        }

        public Builder requester(@Nullable VpcPeeringConnectionRequesterArgs requester) {
            this.requester = Output.ofNullable(requester);
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

        public Builder vpcId(Output<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }

        public Builder vpcId(String vpcId) {
            this.vpcId = Output.of(Objects.requireNonNull(vpcId));
            return this;
        }
        public VpcPeeringConnectionArgs build() {
            return new VpcPeeringConnectionArgs(accepter, autoAccept, peerOwnerId, peerRegion, peerVpcId, requester, tags, vpcId);
        }
    }
}
