// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNodeTypeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNodeTypeArgs Empty = new GetNodeTypeArgs();

    /**
     * The name of the cluster resource.
     * 
     */
    @Import(name="clusterName", required=true)
      private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * The name of the node type.
     * 
     */
    @Import(name="nodeTypeName", required=true)
      private final String nodeTypeName;

    public String getNodeTypeName() {
        return this.nodeTypeName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetNodeTypeArgs(
        String clusterName,
        String nodeTypeName,
        String resourceGroupName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.nodeTypeName = Objects.requireNonNull(nodeTypeName, "expected parameter 'nodeTypeName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetNodeTypeArgs() {
        this.clusterName = null;
        this.nodeTypeName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String nodeTypeName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.nodeTypeName = defaults.nodeTypeName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder nodeTypeName(String nodeTypeName) {
            this.nodeTypeName = Objects.requireNonNull(nodeTypeName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetNodeTypeArgs build() {
            return new GetNodeTypeArgs(clusterName, nodeTypeName, resourceGroupName);
        }
    }
}
