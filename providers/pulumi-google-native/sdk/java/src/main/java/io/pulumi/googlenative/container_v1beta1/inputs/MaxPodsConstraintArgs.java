// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Constraints applied to pods.
 * 
 */
public final class MaxPodsConstraintArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaxPodsConstraintArgs Empty = new MaxPodsConstraintArgs();

    /**
     * Constraint enforced on the max num of pods per node.
     * 
     */
    @Import(name="maxPodsPerNode")
      private final @Nullable Output<String> maxPodsPerNode;

    public Output<String> getMaxPodsPerNode() {
        return this.maxPodsPerNode == null ? Output.empty() : this.maxPodsPerNode;
    }

    public MaxPodsConstraintArgs(@Nullable Output<String> maxPodsPerNode) {
        this.maxPodsPerNode = maxPodsPerNode;
    }

    private MaxPodsConstraintArgs() {
        this.maxPodsPerNode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaxPodsConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> maxPodsPerNode;

        public Builder() {
    	      // Empty
        }

        public Builder(MaxPodsConstraintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPodsPerNode = defaults.maxPodsPerNode;
        }

        public Builder maxPodsPerNode(@Nullable Output<String> maxPodsPerNode) {
            this.maxPodsPerNode = maxPodsPerNode;
            return this;
        }

        public Builder maxPodsPerNode(@Nullable String maxPodsPerNode) {
            this.maxPodsPerNode = Output.ofNullable(maxPodsPerNode);
            return this;
        }
        public MaxPodsConstraintArgs build() {
            return new MaxPodsConstraintArgs(maxPodsPerNode);
        }
    }
}
