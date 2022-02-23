// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.gkehub_v1beta1.outputs.EdgeClusterResponse;
import io.pulumi.googlenative.gkehub_v1beta1.outputs.GkeClusterResponse;
import io.pulumi.googlenative.gkehub_v1beta1.outputs.KubernetesMetadataResponse;
import io.pulumi.googlenative.gkehub_v1beta1.outputs.KubernetesResourceResponse;
import io.pulumi.googlenative.gkehub_v1beta1.outputs.MultiCloudClusterResponse;
import io.pulumi.googlenative.gkehub_v1beta1.outputs.OnPremClusterResponse;
import java.util.Objects;

@OutputCustomType
public final class MembershipEndpointResponse {
    /**
     * Optional. Specific information for a Google Edge cluster.
     * 
     */
    private final EdgeClusterResponse edgeCluster;
    /**
     * Optional. Specific information for a GKE-on-GCP cluster.
     * 
     */
    private final GkeClusterResponse gkeCluster;
    /**
     * Useful Kubernetes-specific metadata.
     * 
     */
    private final KubernetesMetadataResponse kubernetesMetadata;
    /**
     * Optional. The in-cluster Kubernetes Resources that should be applied for a correctly registered cluster, in the steady state. These resources: * Ensure that the cluster is exclusively registered to one and only one Hub Membership. * Propagate Workload Pool Information available in the Membership Authority field. * Ensure proper initial configuration of default Hub Features.
     * 
     */
    private final KubernetesResourceResponse kubernetesResource;
    /**
     * Optional. Specific information for a GKE Multi-Cloud cluster.
     * 
     */
    private final MultiCloudClusterResponse multiCloudCluster;
    /**
     * Optional. Specific information for a GKE On-Prem cluster. An onprem user-cluster who has no resourceLink is not allowed to use this field, it should have a nil "type" instead.
     * 
     */
    private final OnPremClusterResponse onPremCluster;

    @OutputCustomType.Constructor({"edgeCluster","gkeCluster","kubernetesMetadata","kubernetesResource","multiCloudCluster","onPremCluster"})
    private MembershipEndpointResponse(
        EdgeClusterResponse edgeCluster,
        GkeClusterResponse gkeCluster,
        KubernetesMetadataResponse kubernetesMetadata,
        KubernetesResourceResponse kubernetesResource,
        MultiCloudClusterResponse multiCloudCluster,
        OnPremClusterResponse onPremCluster) {
        this.edgeCluster = Objects.requireNonNull(edgeCluster);
        this.gkeCluster = Objects.requireNonNull(gkeCluster);
        this.kubernetesMetadata = Objects.requireNonNull(kubernetesMetadata);
        this.kubernetesResource = Objects.requireNonNull(kubernetesResource);
        this.multiCloudCluster = Objects.requireNonNull(multiCloudCluster);
        this.onPremCluster = Objects.requireNonNull(onPremCluster);
    }

    /**
     * Optional. Specific information for a Google Edge cluster.
     * 
     */
    public EdgeClusterResponse getEdgeCluster() {
        return this.edgeCluster;
    }
    /**
     * Optional. Specific information for a GKE-on-GCP cluster.
     * 
     */
    public GkeClusterResponse getGkeCluster() {
        return this.gkeCluster;
    }
    /**
     * Useful Kubernetes-specific metadata.
     * 
     */
    public KubernetesMetadataResponse getKubernetesMetadata() {
        return this.kubernetesMetadata;
    }
    /**
     * Optional. The in-cluster Kubernetes Resources that should be applied for a correctly registered cluster, in the steady state. These resources: * Ensure that the cluster is exclusively registered to one and only one Hub Membership. * Propagate Workload Pool Information available in the Membership Authority field. * Ensure proper initial configuration of default Hub Features.
     * 
     */
    public KubernetesResourceResponse getKubernetesResource() {
        return this.kubernetesResource;
    }
    /**
     * Optional. Specific information for a GKE Multi-Cloud cluster.
     * 
     */
    public MultiCloudClusterResponse getMultiCloudCluster() {
        return this.multiCloudCluster;
    }
    /**
     * Optional. Specific information for a GKE On-Prem cluster. An onprem user-cluster who has no resourceLink is not allowed to use this field, it should have a nil "type" instead.
     * 
     */
    public OnPremClusterResponse getOnPremCluster() {
        return this.onPremCluster;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeClusterResponse edgeCluster;
        private GkeClusterResponse gkeCluster;
        private KubernetesMetadataResponse kubernetesMetadata;
        private KubernetesResourceResponse kubernetesResource;
        private MultiCloudClusterResponse multiCloudCluster;
        private OnPremClusterResponse onPremCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.edgeCluster = defaults.edgeCluster;
    	      this.gkeCluster = defaults.gkeCluster;
    	      this.kubernetesMetadata = defaults.kubernetesMetadata;
    	      this.kubernetesResource = defaults.kubernetesResource;
    	      this.multiCloudCluster = defaults.multiCloudCluster;
    	      this.onPremCluster = defaults.onPremCluster;
        }

        public Builder setEdgeCluster(EdgeClusterResponse edgeCluster) {
            this.edgeCluster = Objects.requireNonNull(edgeCluster);
            return this;
        }

        public Builder setGkeCluster(GkeClusterResponse gkeCluster) {
            this.gkeCluster = Objects.requireNonNull(gkeCluster);
            return this;
        }

        public Builder setKubernetesMetadata(KubernetesMetadataResponse kubernetesMetadata) {
            this.kubernetesMetadata = Objects.requireNonNull(kubernetesMetadata);
            return this;
        }

        public Builder setKubernetesResource(KubernetesResourceResponse kubernetesResource) {
            this.kubernetesResource = Objects.requireNonNull(kubernetesResource);
            return this;
        }

        public Builder setMultiCloudCluster(MultiCloudClusterResponse multiCloudCluster) {
            this.multiCloudCluster = Objects.requireNonNull(multiCloudCluster);
            return this;
        }

        public Builder setOnPremCluster(OnPremClusterResponse onPremCluster) {
            this.onPremCluster = Objects.requireNonNull(onPremCluster);
            return this;
        }
        public MembershipEndpointResponse build() {
            return new MembershipEndpointResponse(edgeCluster, gkeCluster, kubernetesMetadata, kubernetesResource, multiCloudCluster, onPremCluster);
        }
    }
}
