// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementClusterSelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementClusterSelectorArgs Empty = new WorkflowTemplatePlacementClusterSelectorArgs();

    /**
     * Required. The cluster labels. Cluster must have all labels to match.
     * 
     */
    @InputImport(name="clusterLabels", required=true)
        private final Input<Map<String,String>> clusterLabels;

    public Input<Map<String,String>> getClusterLabels() {
        return this.clusterLabels;
    }

    /**
     * Optional. The zone where the Compute Engine cluster will be located. On a create request, it is required in the "global" region. If omitted in a non-global Dataproc region, the service will pick a zone in the corresponding Compute Engine region. On a get request, zone will always be present. A full URL, partial URI, or short name are valid. Examples: * `https://www.googleapis.com/compute/v1/projects/` * `us-central1-f`
     * 
     */
    @InputImport(name="zone")
        private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public WorkflowTemplatePlacementClusterSelectorArgs(
        Input<Map<String,String>> clusterLabels,
        @Nullable Input<String> zone) {
        this.clusterLabels = Objects.requireNonNull(clusterLabels, "expected parameter 'clusterLabels' to be non-null");
        this.zone = zone;
    }

    private WorkflowTemplatePlacementClusterSelectorArgs() {
        this.clusterLabels = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementClusterSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Map<String,String>> clusterLabels;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementClusterSelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterLabels = defaults.clusterLabels;
    	      this.zone = defaults.zone;
        }

        public Builder setClusterLabels(Input<Map<String,String>> clusterLabels) {
            this.clusterLabels = Objects.requireNonNull(clusterLabels);
            return this;
        }

        public Builder setClusterLabels(Map<String,String> clusterLabels) {
            this.clusterLabels = Input.of(Objects.requireNonNull(clusterLabels));
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }
        public WorkflowTemplatePlacementClusterSelectorArgs build() {
            return new WorkflowTemplatePlacementClusterSelectorArgs(clusterLabels, zone);
        }
    }
}
