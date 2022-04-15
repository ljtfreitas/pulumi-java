// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs();

    /**
     * Optional. Size in GB of the boot disk (default is 500GB).
     * 
     */
    @Import(name="bootDiskSizeGb")
      private final @Nullable Output<Integer> bootDiskSizeGb;

    public Output<Integer> bootDiskSizeGb() {
        return this.bootDiskSizeGb == null ? Codegen.empty() : this.bootDiskSizeGb;
    }

    /**
     * Optional. Type of the boot disk (default is "pd-standard"). Valid values: "pd-ssd" (Persistent Disk Solid State Drive) or "pd-standard" (Persistent Disk Hard Disk Drive).
     * 
     */
    @Import(name="bootDiskType")
      private final @Nullable Output<String> bootDiskType;

    public Output<String> bootDiskType() {
        return this.bootDiskType == null ? Codegen.empty() : this.bootDiskType;
    }

    /**
     * Optional. Number of attached SSDs, from 0 to 4 (default is 0). If SSDs are not attached, the boot disk is used to store runtime logs and (https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data. If one or more SSDs are attached, this runtime bulk data is spread across them, and the boot disk contains only basic config and installed binaries.
     * 
     */
    @Import(name="numLocalSsds")
      private final @Nullable Output<Integer> numLocalSsds;

    public Output<Integer> numLocalSsds() {
        return this.numLocalSsds == null ? Codegen.empty() : this.numLocalSsds;
    }

    public WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs(
        @Nullable Output<Integer> bootDiskSizeGb,
        @Nullable Output<String> bootDiskType,
        @Nullable Output<Integer> numLocalSsds) {
        this.bootDiskSizeGb = bootDiskSizeGb;
        this.bootDiskType = bootDiskType;
        this.numLocalSsds = numLocalSsds;
    }

    private WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs() {
        this.bootDiskSizeGb = Codegen.empty();
        this.bootDiskType = Codegen.empty();
        this.numLocalSsds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> bootDiskSizeGb;
        private @Nullable Output<String> bootDiskType;
        private @Nullable Output<Integer> numLocalSsds;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootDiskSizeGb = defaults.bootDiskSizeGb;
    	      this.bootDiskType = defaults.bootDiskType;
    	      this.numLocalSsds = defaults.numLocalSsds;
        }

        public Builder bootDiskSizeGb(@Nullable Output<Integer> bootDiskSizeGb) {
            this.bootDiskSizeGb = bootDiskSizeGb;
            return this;
        }
        public Builder bootDiskSizeGb(@Nullable Integer bootDiskSizeGb) {
            this.bootDiskSizeGb = Codegen.ofNullable(bootDiskSizeGb);
            return this;
        }
        public Builder bootDiskType(@Nullable Output<String> bootDiskType) {
            this.bootDiskType = bootDiskType;
            return this;
        }
        public Builder bootDiskType(@Nullable String bootDiskType) {
            this.bootDiskType = Codegen.ofNullable(bootDiskType);
            return this;
        }
        public Builder numLocalSsds(@Nullable Output<Integer> numLocalSsds) {
            this.numLocalSsds = numLocalSsds;
            return this;
        }
        public Builder numLocalSsds(@Nullable Integer numLocalSsds) {
            this.numLocalSsds = Codegen.ofNullable(numLocalSsds);
            return this;
        }        public WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs(bootDiskSizeGb, bootDiskType, numLocalSsds);
        }
    }
}
