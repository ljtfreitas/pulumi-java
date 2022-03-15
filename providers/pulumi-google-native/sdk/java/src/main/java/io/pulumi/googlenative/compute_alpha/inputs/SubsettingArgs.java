// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.enums.SubsettingPolicy;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Subsetting configuration for this BackendService. Currently this is applicable only for Internal TCP/UDP load balancing, Internal HTTP(S) load balancing and Traffic Director.
 * 
 */
public final class SubsettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubsettingArgs Empty = new SubsettingArgs();

    @Import(name="policy")
      private final @Nullable Output<SubsettingPolicy> policy;

    public Output<SubsettingPolicy> getPolicy() {
        return this.policy == null ? Output.empty() : this.policy;
    }

    /**
     * The number of backends per backend group assigned to each proxy instance or each service mesh client. An input parameter to the `CONSISTENT_HASH_SUBSETTING` algorithm. Can only be set if `policy` is set to `CONSISTENT_HASH_SUBSETTING`. Can only be set if load balancing scheme is `INTERNAL_MANAGED` or `INTERNAL_SELF_MANAGED`. `subset_size` is optional for Internal HTTP(S) load balancing and required for Traffic Director. If you do not provide this value, Cloud Load Balancing will calculate it dynamically to optimize the number of proxies/clients visible to each backend and vice versa. Must be greater than 0. If `subset_size` is larger than the number of backends/endpoints, then subsetting is disabled.
     * 
     */
    @Import(name="subsetSize")
      private final @Nullable Output<Integer> subsetSize;

    public Output<Integer> getSubsetSize() {
        return this.subsetSize == null ? Output.empty() : this.subsetSize;
    }

    public SubsettingArgs(
        @Nullable Output<SubsettingPolicy> policy,
        @Nullable Output<Integer> subsetSize) {
        this.policy = policy;
        this.subsetSize = subsetSize;
    }

    private SubsettingArgs() {
        this.policy = Output.empty();
        this.subsetSize = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubsettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SubsettingPolicy> policy;
        private @Nullable Output<Integer> subsetSize;

        public Builder() {
    	      // Empty
        }

        public Builder(SubsettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.subsetSize = defaults.subsetSize;
        }

        public Builder policy(@Nullable Output<SubsettingPolicy> policy) {
            this.policy = policy;
            return this;
        }

        public Builder policy(@Nullable SubsettingPolicy policy) {
            this.policy = Output.ofNullable(policy);
            return this;
        }

        public Builder subsetSize(@Nullable Output<Integer> subsetSize) {
            this.subsetSize = subsetSize;
            return this;
        }

        public Builder subsetSize(@Nullable Integer subsetSize) {
            this.subsetSize = Output.ofNullable(subsetSize);
            return this;
        }
        public SubsettingArgs build() {
            return new SubsettingArgs(policy, subsetSize);
        }
    }
}
