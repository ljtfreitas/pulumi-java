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


public final class ClusterClusterConfigMasterConfigDiskConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigMasterConfigDiskConfigGetArgs Empty = new ClusterClusterConfigMasterConfigDiskConfigGetArgs();

    /**
     * Size of the primary disk attached to each preemptible worker node, specified
     * in GB. The smallest allowed disk size is 10GB. GCP will default to a predetermined
     * computed value if not set (currently 500GB). Note: If SSDs are not
     * attached, it also contains the HDFS data blocks and Hadoop working directories.
     * 
     */
    @Import(name="bootDiskSizeGb")
      private final @Nullable Output<Integer> bootDiskSizeGb;

    public Output<Integer> bootDiskSizeGb() {
        return this.bootDiskSizeGb == null ? Codegen.empty() : this.bootDiskSizeGb;
    }

    /**
     * The disk type of the primary disk attached to each preemptible worker node.
     * One of `"pd-ssd"` or `"pd-standard"`. Defaults to `"pd-standard"`.
     * 
     */
    @Import(name="bootDiskType")
      private final @Nullable Output<String> bootDiskType;

    public Output<String> bootDiskType() {
        return this.bootDiskType == null ? Codegen.empty() : this.bootDiskType;
    }

    /**
     * The amount of local SSD disks that will be
     * attached to each preemptible worker node. Defaults to 0.
     * 
     */
    @Import(name="numLocalSsds")
      private final @Nullable Output<Integer> numLocalSsds;

    public Output<Integer> numLocalSsds() {
        return this.numLocalSsds == null ? Codegen.empty() : this.numLocalSsds;
    }

    public ClusterClusterConfigMasterConfigDiskConfigGetArgs(
        @Nullable Output<Integer> bootDiskSizeGb,
        @Nullable Output<String> bootDiskType,
        @Nullable Output<Integer> numLocalSsds) {
        this.bootDiskSizeGb = bootDiskSizeGb;
        this.bootDiskType = bootDiskType;
        this.numLocalSsds = numLocalSsds;
    }

    private ClusterClusterConfigMasterConfigDiskConfigGetArgs() {
        this.bootDiskSizeGb = Codegen.empty();
        this.bootDiskType = Codegen.empty();
        this.numLocalSsds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigMasterConfigDiskConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> bootDiskSizeGb;
        private @Nullable Output<String> bootDiskType;
        private @Nullable Output<Integer> numLocalSsds;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigMasterConfigDiskConfigGetArgs defaults) {
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
        }        public ClusterClusterConfigMasterConfigDiskConfigGetArgs build() {
            return new ClusterClusterConfigMasterConfigDiskConfigGetArgs(bootDiskSizeGb, bootDiskType, numLocalSsds);
        }
    }
}
