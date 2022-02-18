// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ComputeBindingResponse {
    /**
     * ID of the compute resource.
     * 
     */
    private final @Nullable String computeId;
    /**
     * Number of nodes.
     * 
     */
    private final @Nullable Integer nodeCount;

    @OutputCustomType.Constructor({"computeId","nodeCount"})
    private ComputeBindingResponse(
        @Nullable String computeId,
        @Nullable Integer nodeCount) {
        this.computeId = computeId;
        this.nodeCount = nodeCount;
    }

    /**
     * ID of the compute resource.
     * 
     */
    public Optional<String> getComputeId() {
        return Optional.ofNullable(this.computeId);
    }
    /**
     * Number of nodes.
     * 
     */
    public Optional<Integer> getNodeCount() {
        return Optional.ofNullable(this.nodeCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeBindingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String computeId;
        private @Nullable Integer nodeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeBindingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeId = defaults.computeId;
    	      this.nodeCount = defaults.nodeCount;
        }

        public Builder setComputeId(@Nullable String computeId) {
            this.computeId = computeId;
            return this;
        }

        public Builder setNodeCount(@Nullable Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        public ComputeBindingResponse build() {
            return new ComputeBindingResponse(computeId, nodeCount);
        }
    }
}
