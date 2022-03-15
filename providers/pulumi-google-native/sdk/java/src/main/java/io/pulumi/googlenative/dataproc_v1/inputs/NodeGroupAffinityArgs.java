// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Node Group Affinity for clusters using sole-tenant node groups.
 * 
 */
public final class NodeGroupAffinityArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupAffinityArgs Empty = new NodeGroupAffinityArgs();

    /**
     * The URI of a sole-tenant node group resource (https://cloud.google.com/compute/docs/reference/rest/v1/nodeGroups) that the cluster will be created on.A full URL, partial URI, or node group name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-central1-a/nodeGroups/node-group-1 projects/[project_id]/zones/us-central1-a/nodeGroups/node-group-1 node-group-1
     * 
     */
    @Import(name="nodeGroupUri", required=true)
      private final Output<String> nodeGroupUri;

    public Output<String> getNodeGroupUri() {
        return this.nodeGroupUri;
    }

    public NodeGroupAffinityArgs(Output<String> nodeGroupUri) {
        this.nodeGroupUri = Objects.requireNonNull(nodeGroupUri, "expected parameter 'nodeGroupUri' to be non-null");
    }

    private NodeGroupAffinityArgs() {
        this.nodeGroupUri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> nodeGroupUri;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupAffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeGroupUri = defaults.nodeGroupUri;
        }

        public Builder nodeGroupUri(Output<String> nodeGroupUri) {
            this.nodeGroupUri = Objects.requireNonNull(nodeGroupUri);
            return this;
        }

        public Builder nodeGroupUri(String nodeGroupUri) {
            this.nodeGroupUri = Output.of(Objects.requireNonNull(nodeGroupUri));
            return this;
        }
        public NodeGroupAffinityArgs build() {
            return new NodeGroupAffinityArgs(nodeGroupUri);
        }
    }
}
