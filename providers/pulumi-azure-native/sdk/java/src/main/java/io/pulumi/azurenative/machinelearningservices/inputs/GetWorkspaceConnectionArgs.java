// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWorkspaceConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWorkspaceConnectionArgs Empty = new GetWorkspaceConnectionArgs();

    /**
     * Friendly name of the workspace connection
     * 
     */
    @InputImport(name="connectionName", required=true)
        private final String connectionName;

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
        private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetWorkspaceConnectionArgs(
        String connectionName,
        String resourceGroupName,
        String workspaceName) {
        this.connectionName = Objects.requireNonNull(connectionName, "expected parameter 'connectionName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetWorkspaceConnectionArgs() {
        this.connectionName = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionName;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkspaceConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionName = defaults.connectionName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setConnectionName(String connectionName) {
            this.connectionName = Objects.requireNonNull(connectionName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public GetWorkspaceConnectionArgs build() {
            return new GetWorkspaceConnectionArgs(connectionName, resourceGroupName, workspaceName);
        }
    }
}
