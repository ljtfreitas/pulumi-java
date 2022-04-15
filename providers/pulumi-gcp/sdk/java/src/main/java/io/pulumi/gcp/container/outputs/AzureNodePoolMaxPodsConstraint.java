// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class AzureNodePoolMaxPodsConstraint {
    /**
     * Required. The maximum number of pods to schedule on a single node.
     * 
     */
    private final Integer maxPodsPerNode;

    @CustomType.Constructor
    private AzureNodePoolMaxPodsConstraint(@CustomType.Parameter("maxPodsPerNode") Integer maxPodsPerNode) {
        this.maxPodsPerNode = maxPodsPerNode;
    }

    /**
     * Required. The maximum number of pods to schedule on a single node.
     * 
    */
    public Integer maxPodsPerNode() {
        return this.maxPodsPerNode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureNodePoolMaxPodsConstraint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxPodsPerNode;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureNodePoolMaxPodsConstraint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPodsPerNode = defaults.maxPodsPerNode;
        }

        public Builder maxPodsPerNode(Integer maxPodsPerNode) {
            this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode);
            return this;
        }        public AzureNodePoolMaxPodsConstraint build() {
            return new AzureNodePoolMaxPodsConstraint(maxPodsPerNode);
        }
    }
}
