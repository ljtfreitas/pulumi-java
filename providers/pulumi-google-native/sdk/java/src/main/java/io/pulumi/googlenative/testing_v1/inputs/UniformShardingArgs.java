// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Uniformly shards test cases given a total number of shards. For Instrumentation test, it will be translated to "-e numShard" "-e shardIndex" AndroidJUnitRunner arguments. With uniform sharding enabled, specifying these sharding arguments via environment_variables is invalid.
 * 
 */
public final class UniformShardingArgs extends io.pulumi.resources.ResourceArgs {

    public static final UniformShardingArgs Empty = new UniformShardingArgs();

    /**
     * Total number of shards. When any physical devices are selected, the number must be >= 1 and <= 50. When no physical devices are selected, the number must be >= 1 and <= 500.
     * 
     */
    @Import(name="numShards", required=true)
      private final Output<Integer> numShards;

    public Output<Integer> getNumShards() {
        return this.numShards;
    }

    public UniformShardingArgs(Output<Integer> numShards) {
        this.numShards = Objects.requireNonNull(numShards, "expected parameter 'numShards' to be non-null");
    }

    private UniformShardingArgs() {
        this.numShards = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UniformShardingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> numShards;

        public Builder() {
    	      // Empty
        }

        public Builder(UniformShardingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numShards = defaults.numShards;
        }

        public Builder numShards(Output<Integer> numShards) {
            this.numShards = Objects.requireNonNull(numShards);
            return this;
        }

        public Builder numShards(Integer numShards) {
            this.numShards = Output.of(Objects.requireNonNull(numShards));
            return this;
        }
        public UniformShardingArgs build() {
            return new UniformShardingArgs(numShards);
        }
    }
}
