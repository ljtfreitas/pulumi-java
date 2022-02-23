// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * A selector that chooses target cluster for jobs based on metadata.
 * 
 */
public final class ClusterSelectorResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClusterSelectorResponse Empty = new ClusterSelectorResponse();

    /**
     * The cluster labels. Cluster must have all labels to match.
     * 
     */
    @InputImport(name="clusterLabels", required=true)
      private final Map<String,String> clusterLabels;

    public Map<String,String> getClusterLabels() {
        return this.clusterLabels;
    }

    /**
     * Optional. The zone where workflow process executes. This parameter does not affect the selection of the cluster.If unspecified, the zone of the first cluster matching the selector is used.
     * 
     */
    @InputImport(name="zone", required=true)
      private final String zone;

    public String getZone() {
        return this.zone;
    }

    public ClusterSelectorResponse(
        Map<String,String> clusterLabels,
        String zone) {
        this.clusterLabels = Objects.requireNonNull(clusterLabels, "expected parameter 'clusterLabels' to be non-null");
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private ClusterSelectorResponse() {
        this.clusterLabels = Map.of();
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSelectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> clusterLabels;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterSelectorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterLabels = defaults.clusterLabels;
    	      this.zone = defaults.zone;
        }

        public Builder setClusterLabels(Map<String,String> clusterLabels) {
            this.clusterLabels = Objects.requireNonNull(clusterLabels);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public ClusterSelectorResponse build() {
            return new ClusterSelectorResponse(clusterLabels, zone);
        }
    }
}
