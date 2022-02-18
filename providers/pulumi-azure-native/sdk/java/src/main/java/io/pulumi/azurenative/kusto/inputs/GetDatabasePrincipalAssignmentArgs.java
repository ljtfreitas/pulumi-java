// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDatabasePrincipalAssignmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDatabasePrincipalAssignmentArgs Empty = new GetDatabasePrincipalAssignmentArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @InputImport(name="clusterName", required=true)
    private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * The name of the database in the Kusto cluster.
     * 
     */
    @InputImport(name="databaseName", required=true)
    private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The name of the Kusto principalAssignment.
     * 
     */
    @InputImport(name="principalAssignmentName", required=true)
    private final String principalAssignmentName;

    public String getPrincipalAssignmentName() {
        return this.principalAssignmentName;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetDatabasePrincipalAssignmentArgs(
        String clusterName,
        String databaseName,
        String principalAssignmentName,
        String resourceGroupName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.principalAssignmentName = Objects.requireNonNull(principalAssignmentName, "expected parameter 'principalAssignmentName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDatabasePrincipalAssignmentArgs() {
        this.clusterName = null;
        this.databaseName = null;
        this.principalAssignmentName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabasePrincipalAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String databaseName;
        private String principalAssignmentName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabasePrincipalAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.databaseName = defaults.databaseName;
    	      this.principalAssignmentName = defaults.principalAssignmentName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setPrincipalAssignmentName(String principalAssignmentName) {
            this.principalAssignmentName = Objects.requireNonNull(principalAssignmentName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetDatabasePrincipalAssignmentArgs build() {
            return new GetDatabasePrincipalAssignmentArgs(clusterName, databaseName, principalAssignmentName, resourceGroupName);
        }
    }
}
