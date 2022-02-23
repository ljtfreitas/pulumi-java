// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterMasterAuthorizedNetworksConfigCidrBlockArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterMasterAuthorizedNetworksConfigCidrBlockArgs Empty = new ClusterMasterAuthorizedNetworksConfigCidrBlockArgs();

    /**
     * External network that can access Kubernetes master through HTTPS.
     * Must be specified in CIDR notation.
     * 
     */
    @InputImport(name="cidrBlock", required=true)
        private final Input<String> cidrBlock;

    public Input<String> getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * Field for users to identify CIDR blocks.
     * 
     */
    @InputImport(name="displayName")
        private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    public ClusterMasterAuthorizedNetworksConfigCidrBlockArgs(
        Input<String> cidrBlock,
        @Nullable Input<String> displayName) {
        this.cidrBlock = Objects.requireNonNull(cidrBlock, "expected parameter 'cidrBlock' to be non-null");
        this.displayName = displayName;
    }

    private ClusterMasterAuthorizedNetworksConfigCidrBlockArgs() {
        this.cidrBlock = Input.empty();
        this.displayName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterAuthorizedNetworksConfigCidrBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cidrBlock;
        private @Nullable Input<String> displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterAuthorizedNetworksConfigCidrBlockArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.displayName = defaults.displayName;
        }

        public Builder setCidrBlock(Input<String> cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }

        public Builder setCidrBlock(String cidrBlock) {
            this.cidrBlock = Input.of(Objects.requireNonNull(cidrBlock));
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }
        public ClusterMasterAuthorizedNetworksConfigCidrBlockArgs build() {
            return new ClusterMasterAuthorizedNetworksConfigCidrBlockArgs(cidrBlock, displayName);
        }
    }
}
