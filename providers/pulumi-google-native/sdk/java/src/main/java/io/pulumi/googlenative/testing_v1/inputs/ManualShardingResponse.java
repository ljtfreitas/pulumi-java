// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.testing_v1.inputs.TestTargetsForShardResponse;
import java.util.List;
import java.util.Objects;


/**
 * Shards test cases into the specified groups of packages, classes, and/or methods. With manual sharding enabled, specifying test targets via environment_variables or in InstrumentationTest is invalid.
 * 
 */
public final class ManualShardingResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManualShardingResponse Empty = new ManualShardingResponse();

    /**
     * Group of packages, classes, and/or test methods to be run for each shard. When any physical devices are selected, the number of test_targets_for_shard must be >= 1 and <= 50. When no physical devices are selected, the number must be >= 1 and <= 500.
     * 
     */
    @InputImport(name="testTargetsForShard", required=true)
      private final List<TestTargetsForShardResponse> testTargetsForShard;

    public List<TestTargetsForShardResponse> getTestTargetsForShard() {
        return this.testTargetsForShard;
    }

    public ManualShardingResponse(List<TestTargetsForShardResponse> testTargetsForShard) {
        this.testTargetsForShard = Objects.requireNonNull(testTargetsForShard, "expected parameter 'testTargetsForShard' to be non-null");
    }

    private ManualShardingResponse() {
        this.testTargetsForShard = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManualShardingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TestTargetsForShardResponse> testTargetsForShard;

        public Builder() {
    	      // Empty
        }

        public Builder(ManualShardingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.testTargetsForShard = defaults.testTargetsForShard;
        }

        public Builder setTestTargetsForShard(List<TestTargetsForShardResponse> testTargetsForShard) {
            this.testTargetsForShard = Objects.requireNonNull(testTargetsForShard);
            return this;
        }
        public ManualShardingResponse build() {
            return new ManualShardingResponse(testTargetsForShard);
        }
    }
}
