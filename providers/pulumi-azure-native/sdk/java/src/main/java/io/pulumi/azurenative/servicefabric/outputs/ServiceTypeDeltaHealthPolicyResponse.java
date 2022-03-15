// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTypeDeltaHealthPolicyResponse {
    /**
     * The maximum allowed percentage of services health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the services at the beginning of upgrade and the state of the services at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion to make sure the global state of the cluster is within tolerated limits.
     * 
     */
    private final @Nullable Integer maxPercentDeltaUnhealthyServices;

    @CustomType.Constructor
    private ServiceTypeDeltaHealthPolicyResponse(@CustomType.Parameter("maxPercentDeltaUnhealthyServices") @Nullable Integer maxPercentDeltaUnhealthyServices) {
        this.maxPercentDeltaUnhealthyServices = maxPercentDeltaUnhealthyServices;
    }

    /**
     * The maximum allowed percentage of services health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the services at the beginning of upgrade and the state of the services at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion to make sure the global state of the cluster is within tolerated limits.
     * 
    */
    public Optional<Integer> getMaxPercentDeltaUnhealthyServices() {
        return Optional.ofNullable(this.maxPercentDeltaUnhealthyServices);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTypeDeltaHealthPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxPercentDeltaUnhealthyServices;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTypeDeltaHealthPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPercentDeltaUnhealthyServices = defaults.maxPercentDeltaUnhealthyServices;
        }

        public Builder maxPercentDeltaUnhealthyServices(@Nullable Integer maxPercentDeltaUnhealthyServices) {
            this.maxPercentDeltaUnhealthyServices = maxPercentDeltaUnhealthyServices;
            return this;
        }
        public ServiceTypeDeltaHealthPolicyResponse build() {
            return new ServiceTypeDeltaHealthPolicyResponse(maxPercentDeltaUnhealthyServices);
        }
    }
}
