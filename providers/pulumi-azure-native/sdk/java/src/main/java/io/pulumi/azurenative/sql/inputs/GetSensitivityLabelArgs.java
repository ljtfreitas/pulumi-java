// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSensitivityLabelArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSensitivityLabelArgs Empty = new GetSensitivityLabelArgs();

    /**
     * The name of the column.
     * 
     */
    @Import(name="columnName", required=true)
      private final String columnName;

    public String getColumnName() {
        return this.columnName;
    }

    /**
     * The name of the database.
     * 
     */
    @Import(name="databaseName", required=true)
      private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the schema.
     * 
     */
    @Import(name="schemaName", required=true)
      private final String schemaName;

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * The source of the sensitivity label.
     * 
     */
    @Import(name="sensitivityLabelSource", required=true)
      private final String sensitivityLabelSource;

    public String getSensitivityLabelSource() {
        return this.sensitivityLabelSource;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final String serverName;

    public String getServerName() {
        return this.serverName;
    }

    /**
     * The name of the table.
     * 
     */
    @Import(name="tableName", required=true)
      private final String tableName;

    public String getTableName() {
        return this.tableName;
    }

    public GetSensitivityLabelArgs(
        String columnName,
        String databaseName,
        String resourceGroupName,
        String schemaName,
        String sensitivityLabelSource,
        String serverName,
        String tableName) {
        this.columnName = Objects.requireNonNull(columnName, "expected parameter 'columnName' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.schemaName = Objects.requireNonNull(schemaName, "expected parameter 'schemaName' to be non-null");
        this.sensitivityLabelSource = Objects.requireNonNull(sensitivityLabelSource, "expected parameter 'sensitivityLabelSource' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private GetSensitivityLabelArgs() {
        this.columnName = null;
        this.databaseName = null;
        this.resourceGroupName = null;
        this.schemaName = null;
        this.sensitivityLabelSource = null;
        this.serverName = null;
        this.tableName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensitivityLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String columnName;
        private String databaseName;
        private String resourceGroupName;
        private String schemaName;
        private String sensitivityLabelSource;
        private String serverName;
        private String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSensitivityLabelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnName = defaults.columnName;
    	      this.databaseName = defaults.databaseName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schemaName = defaults.schemaName;
    	      this.sensitivityLabelSource = defaults.sensitivityLabelSource;
    	      this.serverName = defaults.serverName;
    	      this.tableName = defaults.tableName;
        }

        public Builder columnName(String columnName) {
            this.columnName = Objects.requireNonNull(columnName);
            return this;
        }

        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder schemaName(String schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }

        public Builder sensitivityLabelSource(String sensitivityLabelSource) {
            this.sensitivityLabelSource = Objects.requireNonNull(sensitivityLabelSource);
            return this;
        }

        public Builder serverName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public GetSensitivityLabelArgs build() {
            return new GetSensitivityLabelArgs(columnName, databaseName, resourceGroupName, schemaName, sensitivityLabelSource, serverName, tableName);
        }
    }
}
