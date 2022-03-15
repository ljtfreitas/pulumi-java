// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VpcDhcpOptionsAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcDhcpOptionsAssociationArgs Empty = new VpcDhcpOptionsAssociationArgs();

    /**
     * The ID of the DHCP Options Set to associate to the VPC.
     * 
     */
    @Import(name="dhcpOptionsId", required=true)
      private final Output<String> dhcpOptionsId;

    public Output<String> getDhcpOptionsId() {
        return this.dhcpOptionsId;
    }

    /**
     * The ID of the VPC to which we would like to associate a DHCP Options Set.
     * 
     */
    @Import(name="vpcId", required=true)
      private final Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public VpcDhcpOptionsAssociationArgs(
        Output<String> dhcpOptionsId,
        Output<String> vpcId) {
        this.dhcpOptionsId = Objects.requireNonNull(dhcpOptionsId, "expected parameter 'dhcpOptionsId' to be non-null");
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private VpcDhcpOptionsAssociationArgs() {
        this.dhcpOptionsId = Output.empty();
        this.vpcId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcDhcpOptionsAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dhcpOptionsId;
        private Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcDhcpOptionsAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dhcpOptionsId = defaults.dhcpOptionsId;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder dhcpOptionsId(Output<String> dhcpOptionsId) {
            this.dhcpOptionsId = Objects.requireNonNull(dhcpOptionsId);
            return this;
        }

        public Builder dhcpOptionsId(String dhcpOptionsId) {
            this.dhcpOptionsId = Output.of(Objects.requireNonNull(dhcpOptionsId));
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
        public VpcDhcpOptionsAssociationArgs build() {
            return new VpcDhcpOptionsAssociationArgs(dhcpOptionsId, vpcId);
        }
    }
}
