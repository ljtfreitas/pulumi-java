// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory;

import io.pulumi.azurenative.datafactory.inputs.AmazonMWSLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AmazonRdsForOracleLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AmazonRdsForSqlServerLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AmazonRedshiftLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AmazonS3CompatibleLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AmazonS3LinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureBatchLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobFSLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobStorageLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureDataExplorerLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureDataLakeAnalyticsLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureDatabricksDeltaLakeLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureDatabricksLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureFileStorageLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureFunctionLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureMLLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureMLServiceLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureMariaDBLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureMySqlLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzurePostgreSqlLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureSearchLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureSqlDWLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureSqlDatabaseLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureSqlMILinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureStorageLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureTableStorageLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.CassandraLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.CommonDataServiceForAppsLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.ConcurLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.CosmosDbLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.CosmosDbMongoDbApiLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.CouchbaseLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.CustomDataSourceLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.Db2LinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.DrillLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.DynamicsAXLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.DynamicsCrmLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.DynamicsLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.EloquaLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.FileServerLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.FtpServerLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.GoogleAdWordsLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.GoogleBigQueryLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.GoogleCloudStorageLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.GreenplumLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.HBaseLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightOnDemandLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.HdfsLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.HiveLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.HttpLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.HubspotLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.ImpalaLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.InformixLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.JiraLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.MagentoLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.MariaDBLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.MarketoLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.MicrosoftAccessLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.MongoDbAtlasLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.MongoDbLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.MongoDbV2LinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.MySqlLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.NetezzaLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.ODataLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.OdbcLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.Office365LinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.OracleCloudStorageLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.OracleLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.OracleServiceCloudLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.PaypalLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.PhoenixLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.PostgreSqlLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.PrestoLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.QuickBooksLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.ResponsysLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.RestServiceLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.SalesforceLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.SalesforceMarketingCloudLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.SalesforceServiceCloudLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.SapBWLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.SapCloudForCustomerLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.SapEccLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.SapHanaLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.SapOpenHubLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.SapTableLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.ServiceNowLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.SftpServerLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.SharePointOnlineListLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.ShopifyLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.SnowflakeLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.SparkLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.SqlServerLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.SquareLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.SybaseLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.TeradataLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.VerticaLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.WebLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.XeroLinkedServiceArgs;
import io.pulumi.azurenative.datafactory.inputs.ZohoLinkedServiceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkedServiceArgs Empty = new LinkedServiceArgs();

    /**
     * The factory name.
     * 
     */
    @InputImport(name="factoryName", required=true)
        private final Input<String> factoryName;

    public Input<String> getFactoryName() {
        return this.factoryName;
    }

    /**
     * The linked service name.
     * 
     */
    @InputImport(name="linkedServiceName")
        private final @Nullable Input<String> linkedServiceName;

    public Input<String> getLinkedServiceName() {
        return this.linkedServiceName == null ? Input.empty() : this.linkedServiceName;
    }

    /**
     * Properties of linked service.
     * 
     */
    @InputImport(name="properties", required=true)
        private final Input<Object> properties;

    public Input<Object> getProperties() {
        return this.properties;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public LinkedServiceArgs(
        Input<String> factoryName,
        @Nullable Input<String> linkedServiceName,
        Input<Object> properties,
        Input<String> resourceGroupName) {
        this.factoryName = Objects.requireNonNull(factoryName, "expected parameter 'factoryName' to be non-null");
        this.linkedServiceName = linkedServiceName;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private LinkedServiceArgs() {
        this.factoryName = Input.empty();
        this.linkedServiceName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> factoryName;
        private @Nullable Input<String> linkedServiceName;
        private Input<Object> properties;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.factoryName = defaults.factoryName;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setFactoryName(Input<String> factoryName) {
            this.factoryName = Objects.requireNonNull(factoryName);
            return this;
        }

        public Builder setFactoryName(String factoryName) {
            this.factoryName = Input.of(Objects.requireNonNull(factoryName));
            return this;
        }

        public Builder setLinkedServiceName(@Nullable Input<String> linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable String linkedServiceName) {
            this.linkedServiceName = Input.ofNullable(linkedServiceName);
            return this;
        }

        public Builder setProperties(Input<Object> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setProperties(Object properties) {
            this.properties = Input.of(Objects.requireNonNull(properties));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public LinkedServiceArgs build() {
            return new LinkedServiceArgs(factoryName, linkedServiceName, properties, resourceGroupName);
        }
    }
}
