// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class NodeStateCountsResponse extends io.pulumi.resources.InvokeArgs {

    public static final NodeStateCountsResponse Empty = new NodeStateCountsResponse();

    @InputImport(name="idleNodeCount", required=true)
    private final Integer idleNodeCount;

    public Integer getIdleNodeCount() {
        return this.idleNodeCount;
    }

    @InputImport(name="leavingNodeCount", required=true)
    private final Integer leavingNodeCount;

    public Integer getLeavingNodeCount() {
        return this.leavingNodeCount;
    }

    @InputImport(name="preemptedNodeCount", required=true)
    private final Integer preemptedNodeCount;

    public Integer getPreemptedNodeCount() {
        return this.preemptedNodeCount;
    }

    @InputImport(name="preparingNodeCount", required=true)
    private final Integer preparingNodeCount;

    public Integer getPreparingNodeCount() {
        return this.preparingNodeCount;
    }

    @InputImport(name="runningNodeCount", required=true)
    private final Integer runningNodeCount;

    public Integer getRunningNodeCount() {
        return this.runningNodeCount;
    }

    @InputImport(name="unusableNodeCount", required=true)
    private final Integer unusableNodeCount;

    public Integer getUnusableNodeCount() {
        return this.unusableNodeCount;
    }

    public NodeStateCountsResponse(
        Integer idleNodeCount,
        Integer leavingNodeCount,
        Integer preemptedNodeCount,
        Integer preparingNodeCount,
        Integer runningNodeCount,
        Integer unusableNodeCount) {
        this.idleNodeCount = Objects.requireNonNull(idleNodeCount, "expected parameter 'idleNodeCount' to be non-null");
        this.leavingNodeCount = Objects.requireNonNull(leavingNodeCount, "expected parameter 'leavingNodeCount' to be non-null");
        this.preemptedNodeCount = Objects.requireNonNull(preemptedNodeCount, "expected parameter 'preemptedNodeCount' to be non-null");
        this.preparingNodeCount = Objects.requireNonNull(preparingNodeCount, "expected parameter 'preparingNodeCount' to be non-null");
        this.runningNodeCount = Objects.requireNonNull(runningNodeCount, "expected parameter 'runningNodeCount' to be non-null");
        this.unusableNodeCount = Objects.requireNonNull(unusableNodeCount, "expected parameter 'unusableNodeCount' to be non-null");
    }

    private NodeStateCountsResponse() {
        this.idleNodeCount = null;
        this.leavingNodeCount = null;
        this.preemptedNodeCount = null;
        this.preparingNodeCount = null;
        this.runningNodeCount = null;
        this.unusableNodeCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeStateCountsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer idleNodeCount;
        private Integer leavingNodeCount;
        private Integer preemptedNodeCount;
        private Integer preparingNodeCount;
        private Integer runningNodeCount;
        private Integer unusableNodeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeStateCountsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idleNodeCount = defaults.idleNodeCount;
    	      this.leavingNodeCount = defaults.leavingNodeCount;
    	      this.preemptedNodeCount = defaults.preemptedNodeCount;
    	      this.preparingNodeCount = defaults.preparingNodeCount;
    	      this.runningNodeCount = defaults.runningNodeCount;
    	      this.unusableNodeCount = defaults.unusableNodeCount;
        }

        public Builder setIdleNodeCount(Integer idleNodeCount) {
            this.idleNodeCount = Objects.requireNonNull(idleNodeCount);
            return this;
        }

        public Builder setLeavingNodeCount(Integer leavingNodeCount) {
            this.leavingNodeCount = Objects.requireNonNull(leavingNodeCount);
            return this;
        }

        public Builder setPreemptedNodeCount(Integer preemptedNodeCount) {
            this.preemptedNodeCount = Objects.requireNonNull(preemptedNodeCount);
            return this;
        }

        public Builder setPreparingNodeCount(Integer preparingNodeCount) {
            this.preparingNodeCount = Objects.requireNonNull(preparingNodeCount);
            return this;
        }

        public Builder setRunningNodeCount(Integer runningNodeCount) {
            this.runningNodeCount = Objects.requireNonNull(runningNodeCount);
            return this;
        }

        public Builder setUnusableNodeCount(Integer unusableNodeCount) {
            this.unusableNodeCount = Objects.requireNonNull(unusableNodeCount);
            return this;
        }

        public NodeStateCountsResponse build() {
            return new NodeStateCountsResponse(idleNodeCount, leavingNodeCount, preemptedNodeCount, preparingNodeCount, runningNodeCount, unusableNodeCount);
        }
    }
}