// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.InboundNatPoolResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class PoolEndpointConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final PoolEndpointConfigurationResponse Empty = new PoolEndpointConfigurationResponse();

    /**
     * The maximum number of inbound NAT pools per Batch pool is 5. If the maximum number of inbound NAT pools is exceeded the request fails with HTTP status code 400. This cannot be specified if the IPAddressProvisioningType is NoPublicIPAddresses.
     * 
     */
    @InputImport(name="inboundNatPools", required=true)
    private final List<InboundNatPoolResponse> inboundNatPools;

    public List<InboundNatPoolResponse> getInboundNatPools() {
        return this.inboundNatPools;
    }

    public PoolEndpointConfigurationResponse(List<InboundNatPoolResponse> inboundNatPools) {
        this.inboundNatPools = Objects.requireNonNull(inboundNatPools, "expected parameter 'inboundNatPools' to be non-null");
    }

    private PoolEndpointConfigurationResponse() {
        this.inboundNatPools = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PoolEndpointConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<InboundNatPoolResponse> inboundNatPools;

        public Builder() {
    	      // Empty
        }

        public Builder(PoolEndpointConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inboundNatPools = defaults.inboundNatPools;
        }

        public Builder setInboundNatPools(List<InboundNatPoolResponse> inboundNatPools) {
            this.inboundNatPools = Objects.requireNonNull(inboundNatPools);
            return this;
        }

        public PoolEndpointConfigurationResponse build() {
            return new PoolEndpointConfigurationResponse(inboundNatPools);
        }
    }
}
