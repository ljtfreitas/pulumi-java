// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSqlPoolWorkloadClassifierArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSqlPoolWorkloadClassifierArgs Empty = new GetSqlPoolWorkloadClassifierArgs();

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
     * SQL pool name
     * 
     */
    @InputImport(name="sqlPoolName", required=true)
        private final String sqlPoolName;

    public String getSqlPoolName() {
        return this.sqlPoolName;
    }

    /**
     * The name of the workload classifier.
     * 
     */
    @InputImport(name="workloadClassifierName", required=true)
        private final String workloadClassifierName;

    public String getWorkloadClassifierName() {
        return this.workloadClassifierName;
    }

    /**
     * The name of the workload group.
     * 
     */
    @InputImport(name="workloadGroupName", required=true)
        private final String workloadGroupName;

    public String getWorkloadGroupName() {
        return this.workloadGroupName;
    }

    /**
     * The name of the workspace
     * 
     */
    @InputImport(name="workspaceName", required=true)
        private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetSqlPoolWorkloadClassifierArgs(
        String resourceGroupName,
        String sqlPoolName,
        String workloadClassifierName,
        String workloadGroupName,
        String workspaceName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sqlPoolName = Objects.requireNonNull(sqlPoolName, "expected parameter 'sqlPoolName' to be non-null");
        this.workloadClassifierName = Objects.requireNonNull(workloadClassifierName, "expected parameter 'workloadClassifierName' to be non-null");
        this.workloadGroupName = Objects.requireNonNull(workloadGroupName, "expected parameter 'workloadGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetSqlPoolWorkloadClassifierArgs() {
        this.resourceGroupName = null;
        this.sqlPoolName = null;
        this.workloadClassifierName = null;
        this.workloadGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSqlPoolWorkloadClassifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String sqlPoolName;
        private String workloadClassifierName;
        private String workloadGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSqlPoolWorkloadClassifierArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sqlPoolName = defaults.sqlPoolName;
    	      this.workloadClassifierName = defaults.workloadClassifierName;
    	      this.workloadGroupName = defaults.workloadGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSqlPoolName(String sqlPoolName) {
            this.sqlPoolName = Objects.requireNonNull(sqlPoolName);
            return this;
        }

        public Builder setWorkloadClassifierName(String workloadClassifierName) {
            this.workloadClassifierName = Objects.requireNonNull(workloadClassifierName);
            return this;
        }

        public Builder setWorkloadGroupName(String workloadGroupName) {
            this.workloadGroupName = Objects.requireNonNull(workloadGroupName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public GetSqlPoolWorkloadClassifierArgs build() {
            return new GetSqlPoolWorkloadClassifierArgs(resourceGroupName, sqlPoolName, workloadClassifierName, workloadGroupName, workspaceName);
        }
    }
}
