// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.container_v1beta1.enums.WorkloadMetadataConfigMode;
import io.pulumi.googlenative.container_v1beta1.enums.WorkloadMetadataConfigNodeMetadata;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * WorkloadMetadataConfig defines the metadata configuration to expose to workloads on the node pool.
 * 
 */
public final class WorkloadMetadataConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkloadMetadataConfigArgs Empty = new WorkloadMetadataConfigArgs();

    /**
     * Mode is the configuration for how to expose metadata to workloads running on the node pool.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<WorkloadMetadataConfigMode> mode;

    public Output<WorkloadMetadataConfigMode> getMode() {
        return this.mode == null ? Output.empty() : this.mode;
    }

    /**
     * NodeMetadata is the configuration for how to expose metadata to the workloads running on the node.
     * 
     */
    @Import(name="nodeMetadata")
      private final @Nullable Output<WorkloadMetadataConfigNodeMetadata> nodeMetadata;

    public Output<WorkloadMetadataConfigNodeMetadata> getNodeMetadata() {
        return this.nodeMetadata == null ? Output.empty() : this.nodeMetadata;
    }

    public WorkloadMetadataConfigArgs(
        @Nullable Output<WorkloadMetadataConfigMode> mode,
        @Nullable Output<WorkloadMetadataConfigNodeMetadata> nodeMetadata) {
        this.mode = mode;
        this.nodeMetadata = nodeMetadata;
    }

    private WorkloadMetadataConfigArgs() {
        this.mode = Output.empty();
        this.nodeMetadata = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadMetadataConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WorkloadMetadataConfigMode> mode;
        private @Nullable Output<WorkloadMetadataConfigNodeMetadata> nodeMetadata;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadMetadataConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.nodeMetadata = defaults.nodeMetadata;
        }

        public Builder mode(@Nullable Output<WorkloadMetadataConfigMode> mode) {
            this.mode = mode;
            return this;
        }

        public Builder mode(@Nullable WorkloadMetadataConfigMode mode) {
            this.mode = Output.ofNullable(mode);
            return this;
        }

        public Builder nodeMetadata(@Nullable Output<WorkloadMetadataConfigNodeMetadata> nodeMetadata) {
            this.nodeMetadata = nodeMetadata;
            return this;
        }

        public Builder nodeMetadata(@Nullable WorkloadMetadataConfigNodeMetadata nodeMetadata) {
            this.nodeMetadata = Output.ofNullable(nodeMetadata);
            return this;
        }
        public WorkloadMetadataConfigArgs build() {
            return new WorkloadMetadataConfigArgs(mode, nodeMetadata);
        }
    }
}
