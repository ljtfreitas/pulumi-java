// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterClusterConfigWorkerConfigDiskConfig {
    /**
     * Size of the primary disk attached to each preemptible worker node, specified
     * in GB. The smallest allowed disk size is 10GB. GCP will default to a predetermined
     * computed value if not set (currently 500GB). Note: If SSDs are not
     * attached, it also contains the HDFS data blocks and Hadoop working directories.
     * 
     */
    private final @Nullable Integer bootDiskSizeGb;
    /**
     * The disk type of the primary disk attached to each preemptible worker node.
     * One of `"pd-ssd"` or `"pd-standard"`. Defaults to `"pd-standard"`.
     * 
     */
    private final @Nullable String bootDiskType;
    /**
     * The amount of local SSD disks that will be
     * attached to each preemptible worker node. Defaults to 0.
     * 
     */
    private final @Nullable Integer numLocalSsds;

    @OutputCustomType.Constructor({"bootDiskSizeGb","bootDiskType","numLocalSsds"})
    private ClusterClusterConfigWorkerConfigDiskConfig(
        @Nullable Integer bootDiskSizeGb,
        @Nullable String bootDiskType,
        @Nullable Integer numLocalSsds) {
        this.bootDiskSizeGb = bootDiskSizeGb;
        this.bootDiskType = bootDiskType;
        this.numLocalSsds = numLocalSsds;
    }

    /**
     * Size of the primary disk attached to each preemptible worker node, specified
     * in GB. The smallest allowed disk size is 10GB. GCP will default to a predetermined
     * computed value if not set (currently 500GB). Note: If SSDs are not
     * attached, it also contains the HDFS data blocks and Hadoop working directories.
     * 
     */
    public Optional<Integer> getBootDiskSizeGb() {
        return Optional.ofNullable(this.bootDiskSizeGb);
    }
    /**
     * The disk type of the primary disk attached to each preemptible worker node.
     * One of `"pd-ssd"` or `"pd-standard"`. Defaults to `"pd-standard"`.
     * 
     */
    public Optional<String> getBootDiskType() {
        return Optional.ofNullable(this.bootDiskType);
    }
    /**
     * The amount of local SSD disks that will be
     * attached to each preemptible worker node. Defaults to 0.
     * 
     */
    public Optional<Integer> getNumLocalSsds() {
        return Optional.ofNullable(this.numLocalSsds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigWorkerConfigDiskConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bootDiskSizeGb;
        private @Nullable String bootDiskType;
        private @Nullable Integer numLocalSsds;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigWorkerConfigDiskConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootDiskSizeGb = defaults.bootDiskSizeGb;
    	      this.bootDiskType = defaults.bootDiskType;
    	      this.numLocalSsds = defaults.numLocalSsds;
        }

        public Builder setBootDiskSizeGb(@Nullable Integer bootDiskSizeGb) {
            this.bootDiskSizeGb = bootDiskSizeGb;
            return this;
        }

        public Builder setBootDiskType(@Nullable String bootDiskType) {
            this.bootDiskType = bootDiskType;
            return this;
        }

        public Builder setNumLocalSsds(@Nullable Integer numLocalSsds) {
            this.numLocalSsds = numLocalSsds;
            return this;
        }
        public ClusterClusterConfigWorkerConfigDiskConfig build() {
            return new ClusterClusterConfigWorkerConfigDiskConfig(bootDiskSizeGb, bootDiskType, numLocalSsds);
        }
    }
}
