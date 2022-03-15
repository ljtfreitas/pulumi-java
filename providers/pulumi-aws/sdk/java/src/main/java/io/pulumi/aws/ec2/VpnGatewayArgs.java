// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpnGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnGatewayArgs Empty = new VpnGatewayArgs();

    /**
     * The Autonomous System Number (ASN) for the Amazon side of the gateway. If you don't specify an ASN, the virtual private gateway is created with the default ASN.
     * 
     */
    @Import(name="amazonSideAsn")
      private final @Nullable Output<String> amazonSideAsn;

    public Output<String> getAmazonSideAsn() {
        return this.amazonSideAsn == null ? Output.empty() : this.amazonSideAsn;
    }

    /**
     * The Availability Zone for the virtual private gateway.
     * 
     */
    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Output.empty() : this.availabilityZone;
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
     * The VPC ID to create in.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId == null ? Output.empty() : this.vpcId;
    }

    public VpnGatewayArgs(
        @Nullable Output<String> amazonSideAsn,
        @Nullable Output<String> availabilityZone,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> vpcId) {
        this.amazonSideAsn = amazonSideAsn;
        this.availabilityZone = availabilityZone;
        this.tags = tags;
        this.vpcId = vpcId;
    }

    private VpnGatewayArgs() {
        this.amazonSideAsn = Output.empty();
        this.availabilityZone = Output.empty();
        this.tags = Output.empty();
        this.vpcId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> amazonSideAsn;
        private @Nullable Output<String> availabilityZone;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amazonSideAsn = defaults.amazonSideAsn;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder amazonSideAsn(@Nullable Output<String> amazonSideAsn) {
            this.amazonSideAsn = amazonSideAsn;
            return this;
        }

        public Builder amazonSideAsn(@Nullable String amazonSideAsn) {
            this.amazonSideAsn = Output.ofNullable(amazonSideAsn);
            return this;
        }

        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Output.ofNullable(availabilityZone);
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

        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Output.ofNullable(vpcId);
            return this;
        }
        public VpnGatewayArgs build() {
            return new VpnGatewayArgs(amazonSideAsn, availabilityZone, tags, vpcId);
        }
    }
}
