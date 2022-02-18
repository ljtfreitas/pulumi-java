// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSqlPoolSensitivityLabelArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSqlPoolSensitivityLabelArgs Empty = new GetSqlPoolSensitivityLabelArgs();

    /**
     * The name of the column.
     * 
     */
    @InputImport(name="columnName", required=true)
    private final String columnName;

    public String getColumnName() {
        return this.columnName;
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
     * The name of the schema.
     * 
     */
    @InputImport(name="schemaName", required=true)
    private final String schemaName;

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * The source of the sensitivity label.
     * 
     */
    @InputImport(name="sensitivityLabelSource", required=true)
    private final String sensitivityLabelSource;

    public String getSensitivityLabelSource() {
        return this.sensitivityLabelSource;
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
     * The name of the table.
     * 
     */
    @InputImport(name="tableName", required=true)
    private final String tableName;

    public String getTableName() {
        return this.tableName;
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

    public GetSqlPoolSensitivityLabelArgs(
        String columnName,
        String resourceGroupName,
        String schemaName,
        String sensitivityLabelSource,
        String sqlPoolName,
        String tableName,
        String workspaceName) {
        this.columnName = Objects.requireNonNull(columnName, "expected parameter 'columnName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.schemaName = Objects.requireNonNull(schemaName, "expected parameter 'schemaName' to be non-null");
        this.sensitivityLabelSource = Objects.requireNonNull(sensitivityLabelSource, "expected parameter 'sensitivityLabelSource' to be non-null");
        this.sqlPoolName = Objects.requireNonNull(sqlPoolName, "expected parameter 'sqlPoolName' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetSqlPoolSensitivityLabelArgs() {
        this.columnName = null;
        this.resourceGroupName = null;
        this.schemaName = null;
        this.sensitivityLabelSource = null;
        this.sqlPoolName = null;
        this.tableName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSqlPoolSensitivityLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String columnName;
        private String resourceGroupName;
        private String schemaName;
        private String sensitivityLabelSource;
        private String sqlPoolName;
        private String tableName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSqlPoolSensitivityLabelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnName = defaults.columnName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schemaName = defaults.schemaName;
    	      this.sensitivityLabelSource = defaults.sensitivityLabelSource;
    	      this.sqlPoolName = defaults.sqlPoolName;
    	      this.tableName = defaults.tableName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setColumnName(String columnName) {
            this.columnName = Objects.requireNonNull(columnName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSchemaName(String schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }

        public Builder setSensitivityLabelSource(String sensitivityLabelSource) {
            this.sensitivityLabelSource = Objects.requireNonNull(sensitivityLabelSource);
            return this;
        }

        public Builder setSqlPoolName(String sqlPoolName) {
            this.sqlPoolName = Objects.requireNonNull(sqlPoolName);
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public GetSqlPoolSensitivityLabelArgs build() {
            return new GetSqlPoolSensitivityLabelArgs(columnName, resourceGroupName, schemaName, sensitivityLabelSource, sqlPoolName, tableName, workspaceName);
        }
    }
}
