// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.EtcdInfoResponse;
import io.pulumi.azurenative.databoxedge.outputs.NodeInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class KubernetesClusterInfoResponse {
    /**
     * Etcd configuration
     * 
     */
    private final EtcdInfoResponse etcdInfo;
    /**
     * Kubernetes cluster nodes
     * 
     */
    private final List<NodeInfoResponse> nodes;
    /**
     * Kubernetes cluster version
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"etcdInfo","nodes","version"})
    private KubernetesClusterInfoResponse(
        EtcdInfoResponse etcdInfo,
        List<NodeInfoResponse> nodes,
        String version) {
        this.etcdInfo = Objects.requireNonNull(etcdInfo);
        this.nodes = Objects.requireNonNull(nodes);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * Etcd configuration
     * 
     */
    public EtcdInfoResponse getEtcdInfo() {
        return this.etcdInfo;
    }
    /**
     * Kubernetes cluster nodes
     * 
     */
    public List<NodeInfoResponse> getNodes() {
        return this.nodes;
    }
    /**
     * Kubernetes cluster version
     * 
     */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EtcdInfoResponse etcdInfo;
        private List<NodeInfoResponse> nodes;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesClusterInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etcdInfo = defaults.etcdInfo;
    	      this.nodes = defaults.nodes;
    	      this.version = defaults.version;
        }

        public Builder setEtcdInfo(EtcdInfoResponse etcdInfo) {
            this.etcdInfo = Objects.requireNonNull(etcdInfo);
            return this;
        }

        public Builder setNodes(List<NodeInfoResponse> nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public KubernetesClusterInfoResponse build() {
            return new KubernetesClusterInfoResponse(etcdInfo, nodes, version);
        }
    }
}
