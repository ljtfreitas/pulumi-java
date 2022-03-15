// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the health policy used to evaluate the health of services belonging to a service type.
 * 
 */
public final class ServiceTypeHealthPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceTypeHealthPolicyResponse Empty = new ServiceTypeHealthPolicyResponse();

    /**
     * The maximum percentage of services allowed to be unhealthy before your application is considered in error.
     * 
     */
    @Import(name="maxPercentUnhealthyServices")
      private final @Nullable Integer maxPercentUnhealthyServices;

    public Optional<Integer> getMaxPercentUnhealthyServices() {
        return this.maxPercentUnhealthyServices == null ? Optional.empty() : Optional.ofNullable(this.maxPercentUnhealthyServices);
    }

    public ServiceTypeHealthPolicyResponse(@Nullable Integer maxPercentUnhealthyServices) {
        this.maxPercentUnhealthyServices = maxPercentUnhealthyServices == null ? 0 : maxPercentUnhealthyServices;
    }

    private ServiceTypeHealthPolicyResponse() {
        this.maxPercentUnhealthyServices = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTypeHealthPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxPercentUnhealthyServices;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTypeHealthPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPercentUnhealthyServices = defaults.maxPercentUnhealthyServices;
        }

        public Builder maxPercentUnhealthyServices(@Nullable Integer maxPercentUnhealthyServices) {
            this.maxPercentUnhealthyServices = maxPercentUnhealthyServices;
            return this;
        }
        public ServiceTypeHealthPolicyResponse build() {
            return new ServiceTypeHealthPolicyResponse(maxPercentUnhealthyServices);
        }
    }
}
