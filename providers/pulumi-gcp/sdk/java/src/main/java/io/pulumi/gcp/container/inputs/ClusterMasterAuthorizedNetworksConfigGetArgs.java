// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterMasterAuthorizedNetworksConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterMasterAuthorizedNetworksConfigGetArgs Empty = new ClusterMasterAuthorizedNetworksConfigGetArgs();

    /**
     * External networks that can access the
     * Kubernetes cluster master through HTTPS.
     * 
     */
    @InputImport(name="cidrBlocks")
        private final @Nullable Input<List<ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs>> cidrBlocks;

    public Input<List<ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs>> getCidrBlocks() {
        return this.cidrBlocks == null ? Input.empty() : this.cidrBlocks;
    }

    public ClusterMasterAuthorizedNetworksConfigGetArgs(@Nullable Input<List<ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs>> cidrBlocks) {
        this.cidrBlocks = cidrBlocks;
    }

    private ClusterMasterAuthorizedNetworksConfigGetArgs() {
        this.cidrBlocks = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterAuthorizedNetworksConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs>> cidrBlocks;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterAuthorizedNetworksConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
        }

        public Builder setCidrBlocks(@Nullable Input<List<ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs>> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            return this;
        }

        public Builder setCidrBlocks(@Nullable List<ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs> cidrBlocks) {
            this.cidrBlocks = Input.ofNullable(cidrBlocks);
            return this;
        }
        public ClusterMasterAuthorizedNetworksConfigGetArgs build() {
            return new ClusterMasterAuthorizedNetworksConfigGetArgs(cidrBlocks);
        }
    }
}
