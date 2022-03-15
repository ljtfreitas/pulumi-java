// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestackhci.inputs;

import io.pulumi.azurenative.azurestackhci.inputs.ClusterNodeResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Properties reported by cluster agent.
 * 
 */
public final class ClusterReportedPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClusterReportedPropertiesResponse Empty = new ClusterReportedPropertiesResponse();

    /**
     * Unique id generated by the on-prem cluster.
     * 
     */
    @Import(name="clusterId", required=true)
      private final String clusterId;

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * Name of the on-prem cluster connected to this resource.
     * 
     */
    @Import(name="clusterName", required=true)
      private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * Version of the cluster software.
     * 
     */
    @Import(name="clusterVersion", required=true)
      private final String clusterVersion;

    public String getClusterVersion() {
        return this.clusterVersion;
    }

    /**
     * Last time the cluster reported the data.
     * 
     */
    @Import(name="lastUpdated", required=true)
      private final String lastUpdated;

    public String getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * List of nodes reported by the cluster.
     * 
     */
    @Import(name="nodes", required=true)
      private final List<ClusterNodeResponse> nodes;

    public List<ClusterNodeResponse> getNodes() {
        return this.nodes;
    }

    public ClusterReportedPropertiesResponse(
        String clusterId,
        String clusterName,
        String clusterVersion,
        String lastUpdated,
        List<ClusterNodeResponse> nodes) {
        this.clusterId = Objects.requireNonNull(clusterId, "expected parameter 'clusterId' to be non-null");
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.clusterVersion = Objects.requireNonNull(clusterVersion, "expected parameter 'clusterVersion' to be non-null");
        this.lastUpdated = Objects.requireNonNull(lastUpdated, "expected parameter 'lastUpdated' to be non-null");
        this.nodes = Objects.requireNonNull(nodes, "expected parameter 'nodes' to be non-null");
    }

    private ClusterReportedPropertiesResponse() {
        this.clusterId = null;
        this.clusterName = null;
        this.clusterVersion = null;
        this.lastUpdated = null;
        this.nodes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterReportedPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterId;
        private String clusterName;
        private String clusterVersion;
        private String lastUpdated;
        private List<ClusterNodeResponse> nodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterReportedPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.clusterName = defaults.clusterName;
    	      this.clusterVersion = defaults.clusterVersion;
    	      this.lastUpdated = defaults.lastUpdated;
    	      this.nodes = defaults.nodes;
        }

        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder clusterVersion(String clusterVersion) {
            this.clusterVersion = Objects.requireNonNull(clusterVersion);
            return this;
        }

        public Builder lastUpdated(String lastUpdated) {
            this.lastUpdated = Objects.requireNonNull(lastUpdated);
            return this;
        }

        public Builder nodes(List<ClusterNodeResponse> nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }
        public ClusterReportedPropertiesResponse build() {
            return new ClusterReportedPropertiesResponse(clusterId, clusterName, clusterVersion, lastUpdated, nodes);
        }
    }
}
