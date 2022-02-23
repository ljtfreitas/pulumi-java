// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.NodeSelectorArgs;
import io.pulumi.kubernetes.core_v1.inputs.PreferredSchedulingTermArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Node affinity is a group of node affinity scheduling rules.
 * 
 */
public final class NodeAffinityArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeAffinityArgs Empty = new NodeAffinityArgs();

    /**
     * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.
     * 
     */
    @InputImport(name="preferredDuringSchedulingIgnoredDuringExecution")
        private final @Nullable Input<List<PreferredSchedulingTermArgs>> preferredDuringSchedulingIgnoredDuringExecution;

    public Input<List<PreferredSchedulingTermArgs>> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return this.preferredDuringSchedulingIgnoredDuringExecution == null ? Input.empty() : this.preferredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to an update), the system may or may not try to eventually evict the pod from its node.
     * 
     */
    @InputImport(name="requiredDuringSchedulingIgnoredDuringExecution")
        private final @Nullable Input<NodeSelectorArgs> requiredDuringSchedulingIgnoredDuringExecution;

    public Input<NodeSelectorArgs> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return this.requiredDuringSchedulingIgnoredDuringExecution == null ? Input.empty() : this.requiredDuringSchedulingIgnoredDuringExecution;
    }

    public NodeAffinityArgs(
        @Nullable Input<List<PreferredSchedulingTermArgs>> preferredDuringSchedulingIgnoredDuringExecution,
        @Nullable Input<NodeSelectorArgs> requiredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }

    private NodeAffinityArgs() {
        this.preferredDuringSchedulingIgnoredDuringExecution = Input.empty();
        this.requiredDuringSchedulingIgnoredDuringExecution = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<PreferredSchedulingTermArgs>> preferredDuringSchedulingIgnoredDuringExecution;
        private @Nullable Input<NodeSelectorArgs> requiredDuringSchedulingIgnoredDuringExecution;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeAffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preferredDuringSchedulingIgnoredDuringExecution = defaults.preferredDuringSchedulingIgnoredDuringExecution;
    	      this.requiredDuringSchedulingIgnoredDuringExecution = defaults.requiredDuringSchedulingIgnoredDuringExecution;
        }

        public Builder setPreferredDuringSchedulingIgnoredDuringExecution(@Nullable Input<List<PreferredSchedulingTermArgs>> preferredDuringSchedulingIgnoredDuringExecution) {
            this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        public Builder setPreferredDuringSchedulingIgnoredDuringExecution(@Nullable List<PreferredSchedulingTermArgs> preferredDuringSchedulingIgnoredDuringExecution) {
            this.preferredDuringSchedulingIgnoredDuringExecution = Input.ofNullable(preferredDuringSchedulingIgnoredDuringExecution);
            return this;
        }

        public Builder setRequiredDuringSchedulingIgnoredDuringExecution(@Nullable Input<NodeSelectorArgs> requiredDuringSchedulingIgnoredDuringExecution) {
            this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        public Builder setRequiredDuringSchedulingIgnoredDuringExecution(@Nullable NodeSelectorArgs requiredDuringSchedulingIgnoredDuringExecution) {
            this.requiredDuringSchedulingIgnoredDuringExecution = Input.ofNullable(requiredDuringSchedulingIgnoredDuringExecution);
            return this;
        }
        public NodeAffinityArgs build() {
            return new NodeAffinityArgs(preferredDuringSchedulingIgnoredDuringExecution, requiredDuringSchedulingIgnoredDuringExecution);
        }
    }
}
