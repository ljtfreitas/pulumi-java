// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.PodAffinityTermArgs;
import io.pulumi.kubernetes.core_v1.inputs.WeightedPodAffinityTermArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Pod anti affinity is a group of inter pod anti affinity scheduling rules.
 * 
 */
public final class PodAntiAffinityArgs extends io.pulumi.resources.ResourceArgs {

    public static final PodAntiAffinityArgs Empty = new PodAntiAffinityArgs();

    /**
     * The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling anti-affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding "weight" to the sum if the node has pods which matches the corresponding podAffinityTerm; the node(s) with the highest sum are the most preferred.
     * 
     */
    @InputImport(name="preferredDuringSchedulingIgnoredDuringExecution")
        private final @Nullable Input<List<WeightedPodAffinityTermArgs>> preferredDuringSchedulingIgnoredDuringExecution;

    public Input<List<WeightedPodAffinityTermArgs>> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return this.preferredDuringSchedulingIgnoredDuringExecution == null ? Input.empty() : this.preferredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the anti-affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to a pod label update), the system may or may not try to eventually evict the pod from its node. When there are multiple elements, the lists of nodes corresponding to each podAffinityTerm are intersected, i.e. all terms must be satisfied.
     * 
     */
    @InputImport(name="requiredDuringSchedulingIgnoredDuringExecution")
        private final @Nullable Input<List<PodAffinityTermArgs>> requiredDuringSchedulingIgnoredDuringExecution;

    public Input<List<PodAffinityTermArgs>> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return this.requiredDuringSchedulingIgnoredDuringExecution == null ? Input.empty() : this.requiredDuringSchedulingIgnoredDuringExecution;
    }

    public PodAntiAffinityArgs(
        @Nullable Input<List<WeightedPodAffinityTermArgs>> preferredDuringSchedulingIgnoredDuringExecution,
        @Nullable Input<List<PodAffinityTermArgs>> requiredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }

    private PodAntiAffinityArgs() {
        this.preferredDuringSchedulingIgnoredDuringExecution = Input.empty();
        this.requiredDuringSchedulingIgnoredDuringExecution = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodAntiAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<WeightedPodAffinityTermArgs>> preferredDuringSchedulingIgnoredDuringExecution;
        private @Nullable Input<List<PodAffinityTermArgs>> requiredDuringSchedulingIgnoredDuringExecution;

        public Builder() {
    	      // Empty
        }

        public Builder(PodAntiAffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preferredDuringSchedulingIgnoredDuringExecution = defaults.preferredDuringSchedulingIgnoredDuringExecution;
    	      this.requiredDuringSchedulingIgnoredDuringExecution = defaults.requiredDuringSchedulingIgnoredDuringExecution;
        }

        public Builder setPreferredDuringSchedulingIgnoredDuringExecution(@Nullable Input<List<WeightedPodAffinityTermArgs>> preferredDuringSchedulingIgnoredDuringExecution) {
            this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        public Builder setPreferredDuringSchedulingIgnoredDuringExecution(@Nullable List<WeightedPodAffinityTermArgs> preferredDuringSchedulingIgnoredDuringExecution) {
            this.preferredDuringSchedulingIgnoredDuringExecution = Input.ofNullable(preferredDuringSchedulingIgnoredDuringExecution);
            return this;
        }

        public Builder setRequiredDuringSchedulingIgnoredDuringExecution(@Nullable Input<List<PodAffinityTermArgs>> requiredDuringSchedulingIgnoredDuringExecution) {
            this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
            return this;
        }

        public Builder setRequiredDuringSchedulingIgnoredDuringExecution(@Nullable List<PodAffinityTermArgs> requiredDuringSchedulingIgnoredDuringExecution) {
            this.requiredDuringSchedulingIgnoredDuringExecution = Input.ofNullable(requiredDuringSchedulingIgnoredDuringExecution);
            return this;
        }
        public PodAntiAffinityArgs build() {
            return new PodAntiAffinityArgs(preferredDuringSchedulingIgnoredDuringExecution, requiredDuringSchedulingIgnoredDuringExecution);
        }
    }
}
