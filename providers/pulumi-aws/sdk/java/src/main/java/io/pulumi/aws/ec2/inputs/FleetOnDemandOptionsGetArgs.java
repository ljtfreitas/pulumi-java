// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetOnDemandOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetOnDemandOptionsGetArgs Empty = new FleetOnDemandOptionsGetArgs();

    /**
     * How to allocate the target capacity across the Spot pools. Valid values: `diversified`, `lowestPrice`. Default: `lowestPrice`.
     * 
     */
    @Import(name="allocationStrategy")
      private final @Nullable Output<String> allocationStrategy;

    public Output<String> getAllocationStrategy() {
        return this.allocationStrategy == null ? Output.empty() : this.allocationStrategy;
    }

    public FleetOnDemandOptionsGetArgs(@Nullable Output<String> allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    private FleetOnDemandOptionsGetArgs() {
        this.allocationStrategy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetOnDemandOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> allocationStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetOnDemandOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
        }

        public Builder allocationStrategy(@Nullable Output<String> allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }

        public Builder allocationStrategy(@Nullable String allocationStrategy) {
            this.allocationStrategy = Output.ofNullable(allocationStrategy);
            return this;
        }
        public FleetOnDemandOptionsGetArgs build() {
            return new FleetOnDemandOptionsGetArgs(allocationStrategy);
        }
    }
}
