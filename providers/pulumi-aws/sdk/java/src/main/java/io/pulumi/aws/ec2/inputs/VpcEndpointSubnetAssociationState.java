// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcEndpointSubnetAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final VpcEndpointSubnetAssociationState Empty = new VpcEndpointSubnetAssociationState();

    /**
     * The ID of the subnet to be associated with the VPC endpoint.
     * 
     */
    @Import(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId == null ? Output.empty() : this.subnetId;
    }

    /**
     * The ID of the VPC endpoint with which the subnet will be associated.
     * 
     */
    @Import(name="vpcEndpointId")
      private final @Nullable Output<String> vpcEndpointId;

    public Output<String> getVpcEndpointId() {
        return this.vpcEndpointId == null ? Output.empty() : this.vpcEndpointId;
    }

    public VpcEndpointSubnetAssociationState(
        @Nullable Output<String> subnetId,
        @Nullable Output<String> vpcEndpointId) {
        this.subnetId = subnetId;
        this.vpcEndpointId = vpcEndpointId;
    }

    private VpcEndpointSubnetAssociationState() {
        this.subnetId = Output.empty();
        this.vpcEndpointId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcEndpointSubnetAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> subnetId;
        private @Nullable Output<String> vpcEndpointId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcEndpointSubnetAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
    	      this.vpcEndpointId = defaults.vpcEndpointId;
        }

        public Builder subnetId(@Nullable Output<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Output.ofNullable(subnetId);
            return this;
        }

        public Builder vpcEndpointId(@Nullable Output<String> vpcEndpointId) {
            this.vpcEndpointId = vpcEndpointId;
            return this;
        }

        public Builder vpcEndpointId(@Nullable String vpcEndpointId) {
            this.vpcEndpointId = Output.ofNullable(vpcEndpointId);
            return this;
        }
        public VpcEndpointSubnetAssociationState build() {
            return new VpcEndpointSubnetAssociationState(subnetId, vpcEndpointId);
        }
    }
}
