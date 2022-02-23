// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetInternetGatewayAttachment extends io.pulumi.resources.InvokeArgs {

    public static final GetInternetGatewayAttachment Empty = new GetInternetGatewayAttachment();

    /**
     * The current state of the attachment between the gateway and the VPC. Present only if a VPC is attached
     * 
     */
    @InputImport(name="state", required=true)
    private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * The ID of an attached VPC.
     * 
     */
    @InputImport(name="vpcId", required=true)
    private final String vpcId;

    public String getVpcId() {
        return this.vpcId;
    }

    public GetInternetGatewayAttachment(
        String state,
        String vpcId) {
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private GetInternetGatewayAttachment() {
        this.state = null;
        this.vpcId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInternetGatewayAttachment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String state;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInternetGatewayAttachment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.state = defaults.state;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetInternetGatewayAttachment build() {
            return new GetInternetGatewayAttachment(state, vpcId);
        }
    }
}
