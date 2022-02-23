// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class EgressOnlyInternetGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final EgressOnlyInternetGatewayArgs Empty = new EgressOnlyInternetGatewayArgs();

    /**
     * The ID of the VPC for which to create the egress-only internet gateway.
     * 
     */
    @InputImport(name="vpcId", required=true)
        private final Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId;
    }

    public EgressOnlyInternetGatewayArgs(Input<String> vpcId) {
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private EgressOnlyInternetGatewayArgs() {
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EgressOnlyInternetGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(EgressOnlyInternetGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setVpcId(Input<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Input.of(Objects.requireNonNull(vpcId));
            return this;
        }
        public EgressOnlyInternetGatewayArgs build() {
            return new EgressOnlyInternetGatewayArgs(vpcId);
        }
    }
}
