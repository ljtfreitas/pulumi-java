// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.IpAddressResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The flow endpoints configuration.
 * 
 */
public final class FlowEndpointsResponse extends io.pulumi.resources.InvokeArgs {

    public static final FlowEndpointsResponse Empty = new FlowEndpointsResponse();

    /**
     * The access endpoint ip address.
     * 
     */
    @InputImport(name="accessEndpointIpAddresses")
        private final @Nullable List<IpAddressResponse> accessEndpointIpAddresses;

    public List<IpAddressResponse> getAccessEndpointIpAddresses() {
        return this.accessEndpointIpAddresses == null ? List.of() : this.accessEndpointIpAddresses;
    }

    /**
     * The outgoing ip address.
     * 
     */
    @InputImport(name="outgoingIpAddresses")
        private final @Nullable List<IpAddressResponse> outgoingIpAddresses;

    public List<IpAddressResponse> getOutgoingIpAddresses() {
        return this.outgoingIpAddresses == null ? List.of() : this.outgoingIpAddresses;
    }

    public FlowEndpointsResponse(
        @Nullable List<IpAddressResponse> accessEndpointIpAddresses,
        @Nullable List<IpAddressResponse> outgoingIpAddresses) {
        this.accessEndpointIpAddresses = accessEndpointIpAddresses;
        this.outgoingIpAddresses = outgoingIpAddresses;
    }

    private FlowEndpointsResponse() {
        this.accessEndpointIpAddresses = List.of();
        this.outgoingIpAddresses = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowEndpointsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<IpAddressResponse> accessEndpointIpAddresses;
        private @Nullable List<IpAddressResponse> outgoingIpAddresses;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowEndpointsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessEndpointIpAddresses = defaults.accessEndpointIpAddresses;
    	      this.outgoingIpAddresses = defaults.outgoingIpAddresses;
        }

        public Builder setAccessEndpointIpAddresses(@Nullable List<IpAddressResponse> accessEndpointIpAddresses) {
            this.accessEndpointIpAddresses = accessEndpointIpAddresses;
            return this;
        }

        public Builder setOutgoingIpAddresses(@Nullable List<IpAddressResponse> outgoingIpAddresses) {
            this.outgoingIpAddresses = outgoingIpAddresses;
            return this;
        }
        public FlowEndpointsResponse build() {
            return new FlowEndpointsResponse(accessEndpointIpAddresses, outgoingIpAddresses);
        }
    }
}
