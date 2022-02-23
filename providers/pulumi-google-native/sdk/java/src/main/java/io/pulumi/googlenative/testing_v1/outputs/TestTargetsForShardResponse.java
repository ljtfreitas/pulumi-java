// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TestTargetsForShardResponse {
    /**
     * Group of packages, classes, and/or test methods to be run for each shard. The targets need to be specified in AndroidJUnitRunner argument format. For example, "package com.my.packages" "class com.my.package.MyClass". The number of shard_test_targets must be greater than 0.
     * 
     */
    private final List<String> testTargets;

    @OutputCustomType.Constructor({"testTargets"})
    private TestTargetsForShardResponse(List<String> testTargets) {
        this.testTargets = Objects.requireNonNull(testTargets);
    }

    /**
     * Group of packages, classes, and/or test methods to be run for each shard. The targets need to be specified in AndroidJUnitRunner argument format. For example, "package com.my.packages" "class com.my.package.MyClass". The number of shard_test_targets must be greater than 0.
     * 
     */
    public List<String> getTestTargets() {
        return this.testTargets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestTargetsForShardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> testTargets;

        public Builder() {
    	      // Empty
        }

        public Builder(TestTargetsForShardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.testTargets = defaults.testTargets;
        }

        public Builder setTestTargets(List<String> testTargets) {
            this.testTargets = Objects.requireNonNull(testTargets);
            return this;
        }
        public TestTargetsForShardResponse build() {
            return new TestTargetsForShardResponse(testTargets);
        }
    }
}
