// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class ClusterNodePoolNodeConfigEphemeralStorageConfig {
    /**
     * Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
     * 
     */
    private final Integer localSsdCount;

    @OutputCustomType.Constructor({"localSsdCount"})
    private ClusterNodePoolNodeConfigEphemeralStorageConfig(Integer localSsdCount) {
        this.localSsdCount = Objects.requireNonNull(localSsdCount);
    }

    /**
     * Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
     * 
     */
    public Integer getLocalSsdCount() {
        return this.localSsdCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNodeConfigEphemeralStorageConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer localSsdCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePoolNodeConfigEphemeralStorageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localSsdCount = defaults.localSsdCount;
        }

        public Builder setLocalSsdCount(Integer localSsdCount) {
            this.localSsdCount = Objects.requireNonNull(localSsdCount);
            return this;
        }
        public ClusterNodePoolNodeConfigEphemeralStorageConfig build() {
            return new ClusterNodePoolNodeConfigEphemeralStorageConfig(localSsdCount);
        }
    }
}
