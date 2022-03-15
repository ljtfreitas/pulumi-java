// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A concurrency control configuration. Defines a group config that, when attached to an instance, recognizes that instance as part of a group of instances where only up the concurrency_limit of instances in that group can undergo simultaneous maintenance. For more information: go/concurrency-control-design-doc
 * 
 */
public final class ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs Empty = new ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs();

    @Import(name="concurrencyLimit")
      private final @Nullable Output<Integer> concurrencyLimit;

    public Output<Integer> getConcurrencyLimit() {
        return this.concurrencyLimit == null ? Output.empty() : this.concurrencyLimit;
    }

    public ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs(@Nullable Output<Integer> concurrencyLimit) {
        this.concurrencyLimit = concurrencyLimit;
    }

    private ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs() {
        this.concurrencyLimit = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> concurrencyLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.concurrencyLimit = defaults.concurrencyLimit;
        }

        public Builder concurrencyLimit(@Nullable Output<Integer> concurrencyLimit) {
            this.concurrencyLimit = concurrencyLimit;
            return this;
        }

        public Builder concurrencyLimit(@Nullable Integer concurrencyLimit) {
            this.concurrencyLimit = Output.ofNullable(concurrencyLimit);
            return this;
        }
        public ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs build() {
            return new ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs(concurrencyLimit);
        }
    }
}
