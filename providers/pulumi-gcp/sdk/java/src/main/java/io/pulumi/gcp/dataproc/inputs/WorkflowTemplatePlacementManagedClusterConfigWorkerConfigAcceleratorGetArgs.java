// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorGetArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorGetArgs();

    /**
     * The number of the accelerator cards of this type exposed to this instance.
     * 
     */
    @Import(name="acceleratorCount")
      private final @Nullable Output<Integer> acceleratorCount;

    public Output<Integer> getAcceleratorCount() {
        return this.acceleratorCount == null ? Output.empty() : this.acceleratorCount;
    }

    /**
     * Full URL, partial URI, or short name of the accelerator type resource to expose to this instance. See (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the accelerator type resource, for example, `nvidia-tesla-k80`.
     * 
     */
    @Import(name="acceleratorType")
      private final @Nullable Output<String> acceleratorType;

    public Output<String> getAcceleratorType() {
        return this.acceleratorType == null ? Output.empty() : this.acceleratorType;
    }

    public WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorGetArgs(
        @Nullable Output<Integer> acceleratorCount,
        @Nullable Output<String> acceleratorType) {
        this.acceleratorCount = acceleratorCount;
        this.acceleratorType = acceleratorType;
    }

    private WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorGetArgs() {
        this.acceleratorCount = Output.empty();
        this.acceleratorType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> acceleratorCount;
        private @Nullable Output<String> acceleratorType;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorType = defaults.acceleratorType;
        }

        public Builder acceleratorCount(@Nullable Output<Integer> acceleratorCount) {
            this.acceleratorCount = acceleratorCount;
            return this;
        }

        public Builder acceleratorCount(@Nullable Integer acceleratorCount) {
            this.acceleratorCount = Output.ofNullable(acceleratorCount);
            return this;
        }

        public Builder acceleratorType(@Nullable Output<String> acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }

        public Builder acceleratorType(@Nullable String acceleratorType) {
            this.acceleratorType = Output.ofNullable(acceleratorType);
            return this;
        }
        public WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorGetArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorGetArgs(acceleratorCount, acceleratorType);
        }
    }
}
