// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VPCDHCPOptionsAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VPCDHCPOptionsAssociationArgs Empty = new VPCDHCPOptionsAssociationArgs();

    /**
     * The ID of the DHCP options set, or default to associate no DHCP options with the VPC.
     * 
     */
    @Import(name="dhcpOptionsId", required=true)
      private final Output<String> dhcpOptionsId;

    public Output<String> getDhcpOptionsId() {
        return this.dhcpOptionsId;
    }

    /**
     * The ID of the VPC.
     * 
     */
    @Import(name="vpcId", required=true)
      private final Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public VPCDHCPOptionsAssociationArgs(
        Output<String> dhcpOptionsId,
        Output<String> vpcId) {
        this.dhcpOptionsId = Objects.requireNonNull(dhcpOptionsId, "expected parameter 'dhcpOptionsId' to be non-null");
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private VPCDHCPOptionsAssociationArgs() {
        this.dhcpOptionsId = Output.empty();
        this.vpcId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VPCDHCPOptionsAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dhcpOptionsId;
        private Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(VPCDHCPOptionsAssociationArgs defaults) {
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
        public VPCDHCPOptionsAssociationArgs build() {
            return new VPCDHCPOptionsAssociationArgs(dhcpOptionsId, vpcId);
        }
    }
}
