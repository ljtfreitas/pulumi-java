// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PeeringConnectionOptionsRequesterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PeeringConnectionOptionsRequesterGetArgs Empty = new PeeringConnectionOptionsRequesterGetArgs();

    /**
     * Allow a local linked EC2-Classic instance to communicate
     * with instances in a peer VPC. This enables an outbound communication from the local ClassicLink connection
     * to the remote VPC. This option is not supported for inter-region VPC peering.
     * 
     */
    @Import(name="allowClassicLinkToRemoteVpc")
      private final @Nullable Output<Boolean> allowClassicLinkToRemoteVpc;

    public Output<Boolean> getAllowClassicLinkToRemoteVpc() {
        return this.allowClassicLinkToRemoteVpc == null ? Output.empty() : this.allowClassicLinkToRemoteVpc;
    }

    /**
     * Allow a local VPC to resolve public DNS hostnames to
     * private IP addresses when queried from instances in the peer VPC.
     * 
     */
    @Import(name="allowRemoteVpcDnsResolution")
      private final @Nullable Output<Boolean> allowRemoteVpcDnsResolution;

    public Output<Boolean> getAllowRemoteVpcDnsResolution() {
        return this.allowRemoteVpcDnsResolution == null ? Output.empty() : this.allowRemoteVpcDnsResolution;
    }

    /**
     * Allow a local VPC to communicate with a linked EC2-Classic
     * instance in a peer VPC. This enables an outbound communication from the local VPC to the remote ClassicLink
     * connection. This option is not supported for inter-region VPC peering.
     * 
     */
    @Import(name="allowVpcToRemoteClassicLink")
      private final @Nullable Output<Boolean> allowVpcToRemoteClassicLink;

    public Output<Boolean> getAllowVpcToRemoteClassicLink() {
        return this.allowVpcToRemoteClassicLink == null ? Output.empty() : this.allowVpcToRemoteClassicLink;
    }

    public PeeringConnectionOptionsRequesterGetArgs(
        @Nullable Output<Boolean> allowClassicLinkToRemoteVpc,
        @Nullable Output<Boolean> allowRemoteVpcDnsResolution,
        @Nullable Output<Boolean> allowVpcToRemoteClassicLink) {
        this.allowClassicLinkToRemoteVpc = allowClassicLinkToRemoteVpc;
        this.allowRemoteVpcDnsResolution = allowRemoteVpcDnsResolution;
        this.allowVpcToRemoteClassicLink = allowVpcToRemoteClassicLink;
    }

    private PeeringConnectionOptionsRequesterGetArgs() {
        this.allowClassicLinkToRemoteVpc = Output.empty();
        this.allowRemoteVpcDnsResolution = Output.empty();
        this.allowVpcToRemoteClassicLink = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeeringConnectionOptionsRequesterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowClassicLinkToRemoteVpc;
        private @Nullable Output<Boolean> allowRemoteVpcDnsResolution;
        private @Nullable Output<Boolean> allowVpcToRemoteClassicLink;

        public Builder() {
    	      // Empty
        }

        public Builder(PeeringConnectionOptionsRequesterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowClassicLinkToRemoteVpc = defaults.allowClassicLinkToRemoteVpc;
    	      this.allowRemoteVpcDnsResolution = defaults.allowRemoteVpcDnsResolution;
    	      this.allowVpcToRemoteClassicLink = defaults.allowVpcToRemoteClassicLink;
        }

        public Builder allowClassicLinkToRemoteVpc(@Nullable Output<Boolean> allowClassicLinkToRemoteVpc) {
            this.allowClassicLinkToRemoteVpc = allowClassicLinkToRemoteVpc;
            return this;
        }

        public Builder allowClassicLinkToRemoteVpc(@Nullable Boolean allowClassicLinkToRemoteVpc) {
            this.allowClassicLinkToRemoteVpc = Output.ofNullable(allowClassicLinkToRemoteVpc);
            return this;
        }

        public Builder allowRemoteVpcDnsResolution(@Nullable Output<Boolean> allowRemoteVpcDnsResolution) {
            this.allowRemoteVpcDnsResolution = allowRemoteVpcDnsResolution;
            return this;
        }

        public Builder allowRemoteVpcDnsResolution(@Nullable Boolean allowRemoteVpcDnsResolution) {
            this.allowRemoteVpcDnsResolution = Output.ofNullable(allowRemoteVpcDnsResolution);
            return this;
        }

        public Builder allowVpcToRemoteClassicLink(@Nullable Output<Boolean> allowVpcToRemoteClassicLink) {
            this.allowVpcToRemoteClassicLink = allowVpcToRemoteClassicLink;
            return this;
        }

        public Builder allowVpcToRemoteClassicLink(@Nullable Boolean allowVpcToRemoteClassicLink) {
            this.allowVpcToRemoteClassicLink = Output.ofNullable(allowVpcToRemoteClassicLink);
            return this;
        }
        public PeeringConnectionOptionsRequesterGetArgs build() {
            return new PeeringConnectionOptionsRequesterGetArgs(allowClassicLinkToRemoteVpc, allowRemoteVpcDnsResolution, allowVpcToRemoteClassicLink);
        }
    }
}
