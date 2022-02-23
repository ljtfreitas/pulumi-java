// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDataSourceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDataSourceArgs Empty = new GetDataSourceArgs();

    /**
     * Name of the datasource
     * 
     */
    @InputImport(name="dataSourceName", required=true)
        private final String dataSourceName;

    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
        private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetDataSourceArgs(
        String dataSourceName,
        String resourceGroupName,
        String workspaceName) {
        this.dataSourceName = Objects.requireNonNull(dataSourceName, "expected parameter 'dataSourceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetDataSourceArgs() {
        this.dataSourceName = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSourceName;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSourceName = defaults.dataSourceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setDataSourceName(String dataSourceName) {
            this.dataSourceName = Objects.requireNonNull(dataSourceName);
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
        public GetDataSourceArgs build() {
            return new GetDataSourceArgs(dataSourceName, resourceGroupName, workspaceName);
        }
    }
}
