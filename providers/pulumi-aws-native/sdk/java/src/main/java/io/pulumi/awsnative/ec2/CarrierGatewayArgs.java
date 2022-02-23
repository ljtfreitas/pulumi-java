// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.CarrierGatewayTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CarrierGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final CarrierGatewayArgs Empty = new CarrierGatewayArgs();

    /**
     * The tags for the carrier gateway.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<List<CarrierGatewayTagArgs>> tags;

    public Input<List<CarrierGatewayTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The ID of the VPC.
     * 
     */
    @InputImport(name="vpcId", required=true)
        private final Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId;
    }

    public CarrierGatewayArgs(
        @Nullable Input<List<CarrierGatewayTagArgs>> tags,
        Input<String> vpcId) {
        this.tags = tags;
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private CarrierGatewayArgs() {
        this.tags = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CarrierGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<CarrierGatewayTagArgs>> tags;
        private Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(CarrierGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setTags(@Nullable Input<List<CarrierGatewayTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<CarrierGatewayTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVpcId(Input<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Input.of(Objects.requireNonNull(vpcId));
            return this;
        }
        public CarrierGatewayArgs build() {
            return new CarrierGatewayArgs(tags, vpcId);
        }
    }
}
