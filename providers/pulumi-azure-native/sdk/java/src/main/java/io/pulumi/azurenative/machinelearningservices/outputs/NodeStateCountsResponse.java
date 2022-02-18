// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class NodeStateCountsResponse {
    /**
     * Number of compute nodes in idle state.
     * 
     */
    private final Integer idleNodeCount;
    /**
     * Number of compute nodes which are leaving the amlCompute.
     * 
     */
    private final Integer leavingNodeCount;
    /**
     * Number of compute nodes which are in preempted state.
     * 
     */
    private final Integer preemptedNodeCount;
    /**
     * Number of compute nodes which are being prepared.
     * 
     */
    private final Integer preparingNodeCount;
    /**
     * Number of compute nodes which are running jobs.
     * 
     */
    private final Integer runningNodeCount;
    /**
     * Number of compute nodes which are in unusable state.
     * 
     */
    private final Integer unusableNodeCount;

    @OutputCustomType.Constructor({"idleNodeCount","leavingNodeCount","preemptedNodeCount","preparingNodeCount","runningNodeCount","unusableNodeCount"})
    private NodeStateCountsResponse(
        Integer idleNodeCount,
        Integer leavingNodeCount,
        Integer preemptedNodeCount,
        Integer preparingNodeCount,
        Integer runningNodeCount,
        Integer unusableNodeCount) {
        this.idleNodeCount = Objects.requireNonNull(idleNodeCount);
        this.leavingNodeCount = Objects.requireNonNull(leavingNodeCount);
        this.preemptedNodeCount = Objects.requireNonNull(preemptedNodeCount);
        this.preparingNodeCount = Objects.requireNonNull(preparingNodeCount);
        this.runningNodeCount = Objects.requireNonNull(runningNodeCount);
        this.unusableNodeCount = Objects.requireNonNull(unusableNodeCount);
    }

    /**
     * Number of compute nodes in idle state.
     * 
     */
    public Integer getIdleNodeCount() {
        return this.idleNodeCount;
    }
    /**
     * Number of compute nodes which are leaving the amlCompute.
     * 
     */
    public Integer getLeavingNodeCount() {
        return this.leavingNodeCount;
    }
    /**
     * Number of compute nodes which are in preempted state.
     * 
     */
    public Integer getPreemptedNodeCount() {
        return this.preemptedNodeCount;
    }
    /**
     * Number of compute nodes which are being prepared.
     * 
     */
    public Integer getPreparingNodeCount() {
        return this.preparingNodeCount;
    }
    /**
     * Number of compute nodes which are running jobs.
     * 
     */
    public Integer getRunningNodeCount() {
        return this.runningNodeCount;
    }
    /**
     * Number of compute nodes which are in unusable state.
     * 
     */
    public Integer getUnusableNodeCount() {
        return this.unusableNodeCount;
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
