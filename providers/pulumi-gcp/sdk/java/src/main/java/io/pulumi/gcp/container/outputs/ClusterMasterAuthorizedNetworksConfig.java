// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.container.outputs.ClusterMasterAuthorizedNetworksConfigCidrBlock;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterMasterAuthorizedNetworksConfig {
    /**
     * External networks that can access the
     * Kubernetes cluster master through HTTPS.
     * 
     */
    private final @Nullable List<ClusterMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks;

    @OutputCustomType.Constructor({"cidrBlocks"})
    private ClusterMasterAuthorizedNetworksConfig(@Nullable List<ClusterMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks) {
        this.cidrBlocks = cidrBlocks;
    }

    /**
     * External networks that can access the
     * Kubernetes cluster master through HTTPS.
     * 
     */
    public List<ClusterMasterAuthorizedNetworksConfigCidrBlock> getCidrBlocks() {
        return this.cidrBlocks == null ? List.of() : this.cidrBlocks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterAuthorizedNetworksConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ClusterMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterAuthorizedNetworksConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
        }

        public Builder setCidrBlocks(@Nullable List<ClusterMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            return this;
        }
        public ClusterMasterAuthorizedNetworksConfig build() {
            return new ClusterMasterAuthorizedNetworksConfig(cidrBlocks);
        }
    }
}
