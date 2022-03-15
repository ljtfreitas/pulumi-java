// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGatewayArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGatewayArgs Empty = new GetGatewayArgs();

    /**
     * The ID of the gateway device.
     * 
     */
    @Import(name="gatewayId", required=true)
      private final String gatewayId;

    public String getGatewayId() {
        return this.gatewayId;
    }

    public GetGatewayArgs(String gatewayId) {
        this.gatewayId = Objects.requireNonNull(gatewayId, "expected parameter 'gatewayId' to be non-null");
    }

    private GetGatewayArgs() {
        this.gatewayId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gatewayId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayId = defaults.gatewayId;
        }

        public Builder gatewayId(String gatewayId) {
            this.gatewayId = Objects.requireNonNull(gatewayId);
            return this;
        }
        public GetGatewayArgs build() {
            return new GetGatewayArgs(gatewayId);
        }
    }
}
