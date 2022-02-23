// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1.enums.WorkloadMetadataConfigMode;
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
    @InputImport(name="mode")
      private final @Nullable Input<WorkloadMetadataConfigMode> mode;

    public Input<WorkloadMetadataConfigMode> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    public WorkloadMetadataConfigArgs(@Nullable Input<WorkloadMetadataConfigMode> mode) {
        this.mode = mode;
    }

    private WorkloadMetadataConfigArgs() {
        this.mode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadMetadataConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WorkloadMetadataConfigMode> mode;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadMetadataConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        public Builder setMode(@Nullable Input<WorkloadMetadataConfigMode> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable WorkloadMetadataConfigMode mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }
        public WorkloadMetadataConfigArgs build() {
            return new WorkloadMetadataConfigArgs(mode);
        }
    }
}
