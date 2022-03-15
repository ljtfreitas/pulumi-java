// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class AwsNodePoolMaxPodsConstraintGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsNodePoolMaxPodsConstraintGetArgs Empty = new AwsNodePoolMaxPodsConstraintGetArgs();

    /**
     * Required. The maximum number of pods to schedule on a single node.
     * 
     */
    @Import(name="maxPodsPerNode", required=true)
      private final Output<Integer> maxPodsPerNode;

    public Output<Integer> getMaxPodsPerNode() {
        return this.maxPodsPerNode;
    }

    public AwsNodePoolMaxPodsConstraintGetArgs(Output<Integer> maxPodsPerNode) {
        this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode, "expected parameter 'maxPodsPerNode' to be non-null");
    }

    private AwsNodePoolMaxPodsConstraintGetArgs() {
        this.maxPodsPerNode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsNodePoolMaxPodsConstraintGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> maxPodsPerNode;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsNodePoolMaxPodsConstraintGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPodsPerNode = defaults.maxPodsPerNode;
        }

        public Builder maxPodsPerNode(Output<Integer> maxPodsPerNode) {
            this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode);
            return this;
        }

        public Builder maxPodsPerNode(Integer maxPodsPerNode) {
            this.maxPodsPerNode = Output.of(Objects.requireNonNull(maxPodsPerNode));
            return this;
        }
        public AwsNodePoolMaxPodsConstraintGetArgs build() {
            return new AwsNodePoolMaxPodsConstraintGetArgs(maxPodsPerNode);
        }
    }
}
