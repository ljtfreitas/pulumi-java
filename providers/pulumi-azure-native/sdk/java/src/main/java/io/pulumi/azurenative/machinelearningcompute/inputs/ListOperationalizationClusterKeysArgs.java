// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListOperationalizationClusterKeysArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListOperationalizationClusterKeysArgs Empty = new ListOperationalizationClusterKeysArgs();

    /**
     * The name of the cluster.
     * 
     */
    @InputImport(name="clusterName", required=true)
        private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * Name of the resource group in which the cluster is located.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListOperationalizationClusterKeysArgs(
        String clusterName,
        String resourceGroupName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListOperationalizationClusterKeysArgs() {
        this.clusterName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListOperationalizationClusterKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListOperationalizationClusterKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public ListOperationalizationClusterKeysArgs build() {
            return new ListOperationalizationClusterKeysArgs(clusterName, resourceGroupName);
        }
    }
}
