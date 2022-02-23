// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1.inputs.ClusterConfigResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Cluster that is managed by the workflow.
 * 
 */
public final class ManagedClusterResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedClusterResponse Empty = new ManagedClusterResponse();

    /**
     * The cluster name prefix. A unique cluster name will be formed by appending a random suffix.The name must contain only lower-case letters (a-z), numbers (0-9), and hyphens (-). Must begin with a letter. Cannot begin or end with hyphen. Must consist of between 2 and 35 characters.
     * 
     */
    @InputImport(name="clusterName", required=true)
      private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * The cluster configuration.
     * 
     */
    @InputImport(name="config", required=true)
      private final ClusterConfigResponse config;

    public ClusterConfigResponse getConfig() {
        return this.config;
    }

    /**
     * Optional. The labels to associate with this cluster.Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62}Label values must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be associated with a given cluster.
     * 
     */
    @InputImport(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels;
    }

    public ManagedClusterResponse(
        String clusterName,
        ClusterConfigResponse config,
        Map<String,String> labels) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
    }

    private ManagedClusterResponse() {
        this.clusterName = null;
        this.config = null;
        this.labels = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private ClusterConfigResponse config;
        private Map<String,String> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.config = defaults.config;
    	      this.labels = defaults.labels;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setConfig(ClusterConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public ManagedClusterResponse build() {
            return new ManagedClusterResponse(clusterName, config, labels);
        }
    }
}
