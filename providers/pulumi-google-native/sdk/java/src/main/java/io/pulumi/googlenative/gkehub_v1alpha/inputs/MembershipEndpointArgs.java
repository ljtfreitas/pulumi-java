// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.gkehub_v1alpha.inputs.EdgeClusterArgs;
import io.pulumi.googlenative.gkehub_v1alpha.inputs.GkeClusterArgs;
import io.pulumi.googlenative.gkehub_v1alpha.inputs.KubernetesResourceArgs;
import io.pulumi.googlenative.gkehub_v1alpha.inputs.MultiCloudClusterArgs;
import io.pulumi.googlenative.gkehub_v1alpha.inputs.OnPremClusterArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MembershipEndpoint contains information needed to contact a Kubernetes API, endpoint and any additional Kubernetes metadata.
 * 
 */
public final class MembershipEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final MembershipEndpointArgs Empty = new MembershipEndpointArgs();

    /**
     * Optional. Specific information for a Google Edge cluster.
     * 
     */
    @Import(name="edgeCluster")
      private final @Nullable Output<EdgeClusterArgs> edgeCluster;

    public Output<EdgeClusterArgs> getEdgeCluster() {
        return this.edgeCluster == null ? Output.empty() : this.edgeCluster;
    }

    /**
     * Optional. Specific information for a GKE-on-GCP cluster.
     * 
     */
    @Import(name="gkeCluster")
      private final @Nullable Output<GkeClusterArgs> gkeCluster;

    public Output<GkeClusterArgs> getGkeCluster() {
        return this.gkeCluster == null ? Output.empty() : this.gkeCluster;
    }

    /**
     * Optional. The in-cluster Kubernetes Resources that should be applied for a correctly registered cluster, in the steady state. These resources: * Ensure that the cluster is exclusively registered to one and only one Hub Membership. * Propagate Workload Pool Information available in the Membership Authority field. * Ensure proper initial configuration of default Hub Features.
     * 
     */
    @Import(name="kubernetesResource")
      private final @Nullable Output<KubernetesResourceArgs> kubernetesResource;

    public Output<KubernetesResourceArgs> getKubernetesResource() {
        return this.kubernetesResource == null ? Output.empty() : this.kubernetesResource;
    }

    /**
     * Optional. Specific information for a GKE Multi-Cloud cluster.
     * 
     */
    @Import(name="multiCloudCluster")
      private final @Nullable Output<MultiCloudClusterArgs> multiCloudCluster;

    public Output<MultiCloudClusterArgs> getMultiCloudCluster() {
        return this.multiCloudCluster == null ? Output.empty() : this.multiCloudCluster;
    }

    /**
     * Optional. Specific information for a GKE On-Prem cluster. An onprem user-cluster who has no resourceLink is not allowed to use this field, it should have a nil "type" instead.
     * 
     */
    @Import(name="onPremCluster")
      private final @Nullable Output<OnPremClusterArgs> onPremCluster;

    public Output<OnPremClusterArgs> getOnPremCluster() {
        return this.onPremCluster == null ? Output.empty() : this.onPremCluster;
    }

    public MembershipEndpointArgs(
        @Nullable Output<EdgeClusterArgs> edgeCluster,
        @Nullable Output<GkeClusterArgs> gkeCluster,
        @Nullable Output<KubernetesResourceArgs> kubernetesResource,
        @Nullable Output<MultiCloudClusterArgs> multiCloudCluster,
        @Nullable Output<OnPremClusterArgs> onPremCluster) {
        this.edgeCluster = edgeCluster;
        this.gkeCluster = gkeCluster;
        this.kubernetesResource = kubernetesResource;
        this.multiCloudCluster = multiCloudCluster;
        this.onPremCluster = onPremCluster;
    }

    private MembershipEndpointArgs() {
        this.edgeCluster = Output.empty();
        this.gkeCluster = Output.empty();
        this.kubernetesResource = Output.empty();
        this.multiCloudCluster = Output.empty();
        this.onPremCluster = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EdgeClusterArgs> edgeCluster;
        private @Nullable Output<GkeClusterArgs> gkeCluster;
        private @Nullable Output<KubernetesResourceArgs> kubernetesResource;
        private @Nullable Output<MultiCloudClusterArgs> multiCloudCluster;
        private @Nullable Output<OnPremClusterArgs> onPremCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.edgeCluster = defaults.edgeCluster;
    	      this.gkeCluster = defaults.gkeCluster;
    	      this.kubernetesResource = defaults.kubernetesResource;
    	      this.multiCloudCluster = defaults.multiCloudCluster;
    	      this.onPremCluster = defaults.onPremCluster;
        }

        public Builder edgeCluster(@Nullable Output<EdgeClusterArgs> edgeCluster) {
            this.edgeCluster = edgeCluster;
            return this;
        }

        public Builder edgeCluster(@Nullable EdgeClusterArgs edgeCluster) {
            this.edgeCluster = Output.ofNullable(edgeCluster);
            return this;
        }

        public Builder gkeCluster(@Nullable Output<GkeClusterArgs> gkeCluster) {
            this.gkeCluster = gkeCluster;
            return this;
        }

        public Builder gkeCluster(@Nullable GkeClusterArgs gkeCluster) {
            this.gkeCluster = Output.ofNullable(gkeCluster);
            return this;
        }

        public Builder kubernetesResource(@Nullable Output<KubernetesResourceArgs> kubernetesResource) {
            this.kubernetesResource = kubernetesResource;
            return this;
        }

        public Builder kubernetesResource(@Nullable KubernetesResourceArgs kubernetesResource) {
            this.kubernetesResource = Output.ofNullable(kubernetesResource);
            return this;
        }

        public Builder multiCloudCluster(@Nullable Output<MultiCloudClusterArgs> multiCloudCluster) {
            this.multiCloudCluster = multiCloudCluster;
            return this;
        }

        public Builder multiCloudCluster(@Nullable MultiCloudClusterArgs multiCloudCluster) {
            this.multiCloudCluster = Output.ofNullable(multiCloudCluster);
            return this;
        }

        public Builder onPremCluster(@Nullable Output<OnPremClusterArgs> onPremCluster) {
            this.onPremCluster = onPremCluster;
            return this;
        }

        public Builder onPremCluster(@Nullable OnPremClusterArgs onPremCluster) {
            this.onPremCluster = Output.ofNullable(onPremCluster);
            return this;
        }
        public MembershipEndpointArgs build() {
            return new MembershipEndpointArgs(edgeCluster, gkeCluster, kubernetesResource, multiCloudCluster, onPremCluster);
        }
    }
}
