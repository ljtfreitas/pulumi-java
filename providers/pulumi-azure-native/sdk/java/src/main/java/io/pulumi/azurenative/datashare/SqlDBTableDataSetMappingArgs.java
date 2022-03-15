// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlDBTableDataSetMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlDBTableDataSetMappingArgs Empty = new SqlDBTableDataSetMappingArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The id of the source data set.
     * 
     */
    @Import(name="dataSetId", required=true)
      private final Output<String> dataSetId;

    public Output<String> getDataSetId() {
        return this.dataSetId;
    }

    /**
     * The name of the data set mapping to be created.
     * 
     */
    @Import(name="dataSetMappingName")
      private final @Nullable Output<String> dataSetMappingName;

    public Output<String> getDataSetMappingName() {
        return this.dataSetMappingName == null ? Output.empty() : this.dataSetMappingName;
    }

    /**
     * DatabaseName name of the sink data set
     * 
     */
    @Import(name="databaseName", required=true)
      private final Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * Kind of data set mapping.
     * Expected value is 'SqlDBTable'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Schema of the table. Default value is dbo.
     * 
     */
    @Import(name="schemaName", required=true)
      private final Output<String> schemaName;

    public Output<String> getSchemaName() {
        return this.schemaName;
    }

    /**
     * The name of the share subscription which will hold the data set sink.
     * 
     */
    @Import(name="shareSubscriptionName", required=true)
      private final Output<String> shareSubscriptionName;

    public Output<String> getShareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    /**
     * Resource id of SQL server
     * 
     */
    @Import(name="sqlServerResourceId", required=true)
      private final Output<String> sqlServerResourceId;

    public Output<String> getSqlServerResourceId() {
        return this.sqlServerResourceId;
    }

    /**
     * SQL DB table name.
     * 
     */
    @Import(name="tableName", required=true)
      private final Output<String> tableName;

    public Output<String> getTableName() {
        return this.tableName;
    }

    public SqlDBTableDataSetMappingArgs(
        Output<String> accountName,
        Output<String> dataSetId,
        @Nullable Output<String> dataSetMappingName,
        Output<String> databaseName,
        Output<String> kind,
        Output<String> resourceGroupName,
        Output<String> schemaName,
        Output<String> shareSubscriptionName,
        Output<String> sqlServerResourceId,
        Output<String> tableName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataSetId = Objects.requireNonNull(dataSetId, "expected parameter 'dataSetId' to be non-null");
        this.dataSetMappingName = dataSetMappingName;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.schemaName = Objects.requireNonNull(schemaName, "expected parameter 'schemaName' to be non-null");
        this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
        this.sqlServerResourceId = Objects.requireNonNull(sqlServerResourceId, "expected parameter 'sqlServerResourceId' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private SqlDBTableDataSetMappingArgs() {
        this.accountName = Output.empty();
        this.dataSetId = Output.empty();
        this.dataSetMappingName = Output.empty();
        this.databaseName = Output.empty();
        this.kind = Output.empty();
        this.resourceGroupName = Output.empty();
        this.schemaName = Output.empty();
        this.shareSubscriptionName = Output.empty();
        this.sqlServerResourceId = Output.empty();
        this.tableName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlDBTableDataSetMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private Output<String> dataSetId;
        private @Nullable Output<String> dataSetMappingName;
        private Output<String> databaseName;
        private Output<String> kind;
        private Output<String> resourceGroupName;
        private Output<String> schemaName;
        private Output<String> shareSubscriptionName;
        private Output<String> sqlServerResourceId;
        private Output<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlDBTableDataSetMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataSetId = defaults.dataSetId;
    	      this.dataSetMappingName = defaults.dataSetMappingName;
    	      this.databaseName = defaults.databaseName;
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schemaName = defaults.schemaName;
    	      this.shareSubscriptionName = defaults.shareSubscriptionName;
    	      this.sqlServerResourceId = defaults.sqlServerResourceId;
    	      this.tableName = defaults.tableName;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder dataSetId(Output<String> dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }

        public Builder dataSetId(String dataSetId) {
            this.dataSetId = Output.of(Objects.requireNonNull(dataSetId));
            return this;
        }

        public Builder dataSetMappingName(@Nullable Output<String> dataSetMappingName) {
            this.dataSetMappingName = dataSetMappingName;
            return this;
        }

        public Builder dataSetMappingName(@Nullable String dataSetMappingName) {
            this.dataSetMappingName = Output.ofNullable(dataSetMappingName);
            return this;
        }

        public Builder databaseName(Output<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder databaseName(String databaseName) {
            this.databaseName = Output.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder schemaName(Output<String> schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }

        public Builder schemaName(String schemaName) {
            this.schemaName = Output.of(Objects.requireNonNull(schemaName));
            return this;
        }

        public Builder shareSubscriptionName(Output<String> shareSubscriptionName) {
            this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName);
            return this;
        }

        public Builder shareSubscriptionName(String shareSubscriptionName) {
            this.shareSubscriptionName = Output.of(Objects.requireNonNull(shareSubscriptionName));
            return this;
        }

        public Builder sqlServerResourceId(Output<String> sqlServerResourceId) {
            this.sqlServerResourceId = Objects.requireNonNull(sqlServerResourceId);
            return this;
        }

        public Builder sqlServerResourceId(String sqlServerResourceId) {
            this.sqlServerResourceId = Output.of(Objects.requireNonNull(sqlServerResourceId));
            return this;
        }

        public Builder tableName(Output<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder tableName(String tableName) {
            this.tableName = Output.of(Objects.requireNonNull(tableName));
            return this;
        }
        public SqlDBTableDataSetMappingArgs build() {
            return new SqlDBTableDataSetMappingArgs(accountName, dataSetId, dataSetMappingName, databaseName, kind, resourceGroupName, schemaName, shareSubscriptionName, sqlServerResourceId, tableName);
        }
    }
}
