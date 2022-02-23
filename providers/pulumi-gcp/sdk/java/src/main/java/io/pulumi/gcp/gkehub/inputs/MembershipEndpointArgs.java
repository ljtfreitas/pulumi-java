// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.gkehub.inputs.MembershipEndpointGkeClusterArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MembershipEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final MembershipEndpointArgs Empty = new MembershipEndpointArgs();

    /**
     * If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
     * Structure is documented below.
     * 
     */
    @InputImport(name="gkeCluster")
        private final @Nullable Input<MembershipEndpointGkeClusterArgs> gkeCluster;

    public Input<MembershipEndpointGkeClusterArgs> getGkeCluster() {
        return this.gkeCluster == null ? Input.empty() : this.gkeCluster;
    }

    public MembershipEndpointArgs(@Nullable Input<MembershipEndpointGkeClusterArgs> gkeCluster) {
        this.gkeCluster = gkeCluster;
    }

    private MembershipEndpointArgs() {
        this.gkeCluster = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MembershipEndpointGkeClusterArgs> gkeCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gkeCluster = defaults.gkeCluster;
        }

        public Builder setGkeCluster(@Nullable Input<MembershipEndpointGkeClusterArgs> gkeCluster) {
            this.gkeCluster = gkeCluster;
            return this;
        }

        public Builder setGkeCluster(@Nullable MembershipEndpointGkeClusterArgs gkeCluster) {
            this.gkeCluster = Input.ofNullable(gkeCluster);
            return this;
        }
        public MembershipEndpointArgs build() {
            return new MembershipEndpointArgs(gkeCluster);
        }
    }
}
