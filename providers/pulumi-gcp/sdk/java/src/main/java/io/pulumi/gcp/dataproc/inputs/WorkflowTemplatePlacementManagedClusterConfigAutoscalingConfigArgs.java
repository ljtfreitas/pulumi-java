// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfigArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfigArgs();

    /**
     * Optional. The autoscaling policy used by the cluster. Only resource names including projectid and location (region) are valid. Examples: * `https://www.googleapis.com/compute/v1/projects/` Note that the policy must be in the same project and Dataproc region.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy == null ? Output.empty() : this.policy;
    }

    public WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfigArgs(@Nullable Output<String> policy) {
        this.policy = policy;
    }

    private WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfigArgs() {
        this.policy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
        }

        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }

        public Builder policy(@Nullable String policy) {
            this.policy = Output.ofNullable(policy);
            return this;
        }
        public WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfigArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfigArgs(policy);
        }
    }
}
