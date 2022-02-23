// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.InboundNatPoolArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class PoolEndpointConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PoolEndpointConfigurationArgs Empty = new PoolEndpointConfigurationArgs();

    /**
     * The maximum number of inbound NAT pools per Batch pool is 5. If the maximum number of inbound NAT pools is exceeded the request fails with HTTP status code 400. This cannot be specified if the IPAddressProvisioningType is NoPublicIPAddresses.
     * 
     */
    @InputImport(name="inboundNatPools", required=true)
        private final Input<List<InboundNatPoolArgs>> inboundNatPools;

    public Input<List<InboundNatPoolArgs>> getInboundNatPools() {
        return this.inboundNatPools;
    }

    public PoolEndpointConfigurationArgs(Input<List<InboundNatPoolArgs>> inboundNatPools) {
        this.inboundNatPools = Objects.requireNonNull(inboundNatPools, "expected parameter 'inboundNatPools' to be non-null");
    }

    private PoolEndpointConfigurationArgs() {
        this.inboundNatPools = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PoolEndpointConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<InboundNatPoolArgs>> inboundNatPools;

        public Builder() {
    	      // Empty
        }

        public Builder(PoolEndpointConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inboundNatPools = defaults.inboundNatPools;
        }

        public Builder setInboundNatPools(Input<List<InboundNatPoolArgs>> inboundNatPools) {
            this.inboundNatPools = Objects.requireNonNull(inboundNatPools);
            return this;
        }

        public Builder setInboundNatPools(List<InboundNatPoolArgs> inboundNatPools) {
            this.inboundNatPools = Input.of(Objects.requireNonNull(inboundNatPools));
            return this;
        }
        public PoolEndpointConfigurationArgs build() {
            return new PoolEndpointConfigurationArgs(inboundNatPools);
        }
    }
}
