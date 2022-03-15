// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the health policy used to evaluate the health of services belonging to a service type.
 * 
 */
public final class ServiceTypeHealthPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTypeHealthPolicyArgs Empty = new ServiceTypeHealthPolicyArgs();

    /**
     * The maximum percentage of services allowed to be unhealthy before your application is considered in error.
     * 
     */
    @Import(name="maxPercentUnhealthyServices")
      private final @Nullable Output<Integer> maxPercentUnhealthyServices;

    public Output<Integer> getMaxPercentUnhealthyServices() {
        return this.maxPercentUnhealthyServices == null ? Output.empty() : this.maxPercentUnhealthyServices;
    }

    public ServiceTypeHealthPolicyArgs(@Nullable Output<Integer> maxPercentUnhealthyServices) {
        this.maxPercentUnhealthyServices = maxPercentUnhealthyServices == null ? Output.ofNullable(0) : maxPercentUnhealthyServices;
    }

    private ServiceTypeHealthPolicyArgs() {
        this.maxPercentUnhealthyServices = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTypeHealthPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxPercentUnhealthyServices;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTypeHealthPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPercentUnhealthyServices = defaults.maxPercentUnhealthyServices;
        }

        public Builder maxPercentUnhealthyServices(@Nullable Output<Integer> maxPercentUnhealthyServices) {
            this.maxPercentUnhealthyServices = maxPercentUnhealthyServices;
            return this;
        }

        public Builder maxPercentUnhealthyServices(@Nullable Integer maxPercentUnhealthyServices) {
            this.maxPercentUnhealthyServices = Output.ofNullable(maxPercentUnhealthyServices);
            return this;
        }
        public ServiceTypeHealthPolicyArgs build() {
            return new ServiceTypeHealthPolicyArgs(maxPercentUnhealthyServices);
        }
    }
}
