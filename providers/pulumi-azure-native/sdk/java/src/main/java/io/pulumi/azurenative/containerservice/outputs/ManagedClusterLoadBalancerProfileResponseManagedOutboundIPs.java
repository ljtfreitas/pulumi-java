// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs {
    /**
     * Desired number of outbound IP created/managed by Azure for the cluster load balancer. Allowed values must be in the range of 1 to 100 (inclusive). The default value is 1.
     * 
     */
    private final @Nullable Integer count;

    @CustomType.Constructor
    private ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs(@CustomType.Parameter("count") @Nullable Integer count) {
        this.count = count;
    }

    /**
     * Desired number of outbound IP created/managed by Azure for the cluster load balancer. Allowed values must be in the range of 1 to 100 (inclusive). The default value is 1.
     * 
    */
    public Optional<Integer> getCount() {
        return Optional.ofNullable(this.count);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
        }

        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }
        public ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs build() {
            return new ManagedClusterLoadBalancerProfileResponseManagedOutboundIPs(count);
        }
    }
}
