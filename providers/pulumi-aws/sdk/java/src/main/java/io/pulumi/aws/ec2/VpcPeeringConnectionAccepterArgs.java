// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterAccepterArgs;
import io.pulumi.aws.ec2.inputs.VpcPeeringConnectionAccepterRequesterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcPeeringConnectionAccepterArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcPeeringConnectionAccepterArgs Empty = new VpcPeeringConnectionAccepterArgs();

    /**
     * A configuration block that describes [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the accepter VPC.
     * 
     */
    @InputImport(name="accepter")
    private final @Nullable Input<VpcPeeringConnectionAccepterAccepterArgs> accepter;

    public Input<VpcPeeringConnectionAccepterAccepterArgs> getAccepter() {
        return this.accepter == null ? Input.empty() : this.accepter;
    }

    /**
     * Whether or not to accept the peering request. Defaults to `false`.
     * 
     */
    @InputImport(name="autoAccept")
    private final @Nullable Input<Boolean> autoAccept;

    public Input<Boolean> getAutoAccept() {
        return this.autoAccept == null ? Input.empty() : this.autoAccept;
    }

    /**
     * A configuration block that describes [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the requester VPC.
     * 
     */
    @InputImport(name="requester")
    private final @Nullable Input<VpcPeeringConnectionAccepterRequesterArgs> requester;

    public Input<VpcPeeringConnectionAccepterRequesterArgs> getRequester() {
        return this.requester == null ? Input.empty() : this.requester;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The VPC Peering Connection ID to manage.
     * 
     */
    @InputImport(name="vpcPeeringConnectionId", required=true)
    private final Input<String> vpcPeeringConnectionId;

    public Input<String> getVpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId;
    }

    public VpcPeeringConnectionAccepterArgs(
        @Nullable Input<VpcPeeringConnectionAccepterAccepterArgs> accepter,
        @Nullable Input<Boolean> autoAccept,
        @Nullable Input<VpcPeeringConnectionAccepterRequesterArgs> requester,
        @Nullable Input<Map<String,String>> tags,
        Input<String> vpcPeeringConnectionId) {
        this.accepter = accepter;
        this.autoAccept = autoAccept;
        this.requester = requester;
        this.tags = tags;
        this.vpcPeeringConnectionId = Objects.requireNonNull(vpcPeeringConnectionId, "expected parameter 'vpcPeeringConnectionId' to be non-null");
    }

    private VpcPeeringConnectionAccepterArgs() {
        this.accepter = Input.empty();
        this.autoAccept = Input.empty();
        this.requester = Input.empty();
        this.tags = Input.empty();
        this.vpcPeeringConnectionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcPeeringConnectionAccepterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VpcPeeringConnectionAccepterAccepterArgs> accepter;
        private @Nullable Input<Boolean> autoAccept;
        private @Nullable Input<VpcPeeringConnectionAccepterRequesterArgs> requester;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> vpcPeeringConnectionId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcPeeringConnectionAccepterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accepter = defaults.accepter;
    	      this.autoAccept = defaults.autoAccept;
    	      this.requester = defaults.requester;
    	      this.tags = defaults.tags;
    	      this.vpcPeeringConnectionId = defaults.vpcPeeringConnectionId;
        }

        public Builder setAccepter(@Nullable Input<VpcPeeringConnectionAccepterAccepterArgs> accepter) {
            this.accepter = accepter;
            return this;
        }

        public Builder setAccepter(@Nullable VpcPeeringConnectionAccepterAccepterArgs accepter) {
            this.accepter = Input.ofNullable(accepter);
            return this;
        }

        public Builder setAutoAccept(@Nullable Input<Boolean> autoAccept) {
            this.autoAccept = autoAccept;
            return this;
        }

        public Builder setAutoAccept(@Nullable Boolean autoAccept) {
            this.autoAccept = Input.ofNullable(autoAccept);
            return this;
        }

        public Builder setRequester(@Nullable Input<VpcPeeringConnectionAccepterRequesterArgs> requester) {
            this.requester = requester;
            return this;
        }

        public Builder setRequester(@Nullable VpcPeeringConnectionAccepterRequesterArgs requester) {
            this.requester = Input.ofNullable(requester);
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

        public Builder setVpcPeeringConnectionId(Input<String> vpcPeeringConnectionId) {
            this.vpcPeeringConnectionId = Objects.requireNonNull(vpcPeeringConnectionId);
            return this;
        }

        public Builder setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
            this.vpcPeeringConnectionId = Input.of(Objects.requireNonNull(vpcPeeringConnectionId));
            return this;
        }
        public VpcPeeringConnectionAccepterArgs build() {
            return new VpcPeeringConnectionAccepterArgs(accepter, autoAccept, requester, tags, vpcPeeringConnectionId);
        }
    }
}
