// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.inputs.ResourceReferenceResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Desired outbound IP resources for the cluster load balancer.
 * 
 */
public final class ManagedClusterLoadBalancerProfileResponseOutboundIPs extends io.pulumi.resources.InvokeArgs {

    public static final ManagedClusterLoadBalancerProfileResponseOutboundIPs Empty = new ManagedClusterLoadBalancerProfileResponseOutboundIPs();

    /**
     * A list of public IP resources.
     * 
     */
    @InputImport(name="publicIPs")
    private final @Nullable List<ResourceReferenceResponse> publicIPs;

    public List<ResourceReferenceResponse> getPublicIPs() {
        return this.publicIPs == null ? List.of() : this.publicIPs;
    }

    public ManagedClusterLoadBalancerProfileResponseOutboundIPs(@Nullable List<ResourceReferenceResponse> publicIPs) {
        this.publicIPs = publicIPs;
    }

    private ManagedClusterLoadBalancerProfileResponseOutboundIPs() {
        this.publicIPs = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterLoadBalancerProfileResponseOutboundIPs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ResourceReferenceResponse> publicIPs;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterLoadBalancerProfileResponseOutboundIPs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicIPs = defaults.publicIPs;
        }

        public Builder setPublicIPs(@Nullable List<ResourceReferenceResponse> publicIPs) {
            this.publicIPs = publicIPs;
            return this;
        }

        public ManagedClusterLoadBalancerProfileResponseOutboundIPs build() {
            return new ManagedClusterLoadBalancerProfileResponseOutboundIPs(publicIPs);
        }
    }
}
