// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonMWSSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonRdsForOracleSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonRdsForSqlServerSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonRedshiftSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AvroSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureBlobFSSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDataExplorerSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDataLakeStoreSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDatabricksDeltaLakeSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMariaDBSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMySqlSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzurePostgreSqlSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureSqlSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureTableSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.BinarySourceResponse;
import io.pulumi.azurenative.datafactory.outputs.BlobSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.CassandraSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.CommonDataServiceForAppsSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.ConcurSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.CosmosDbMongoDbApiSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.CosmosDbSqlApiSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.CouchbaseSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.DatasetReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.Db2SourceResponse;
import io.pulumi.azurenative.datafactory.outputs.DelimitedTextSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.DocumentDbCollectionSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.DrillSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.DynamicsAXSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.DynamicsCrmSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.DynamicsSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.EloquaSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.ExcelSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.FileSystemSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.GoogleAdWordsSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.GoogleBigQuerySourceResponse;
import io.pulumi.azurenative.datafactory.outputs.GreenplumSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.HBaseSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.HdfsSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.HiveSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.HttpSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.HubspotSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.ImpalaSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.InformixSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.JiraSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.JsonSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.MagentoSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.MariaDBSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.MarketoSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.MicrosoftAccessSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.MongoDbAtlasSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.MongoDbSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.MongoDbV2SourceResponse;
import io.pulumi.azurenative.datafactory.outputs.MySqlSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.NetezzaSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.ODataSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.OdbcSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.Office365SourceResponse;
import io.pulumi.azurenative.datafactory.outputs.OracleServiceCloudSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.OracleSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.OrcSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParquetSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.PaypalSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.PhoenixSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.PostgreSqlSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.PrestoSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.QuickBooksSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.RelationalSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.ResponsysSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.RestSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SalesforceMarketingCloudSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SalesforceServiceCloudSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SalesforceSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SapBwSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SapCloudForCustomerSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SapEccSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SapHanaSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SapOpenHubSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SapTableSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.ServiceNowSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SharePointOnlineListSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.ShopifySourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SnowflakeSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SparkSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SqlDWSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SqlMISourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SqlServerSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SqlSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SquareSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SybaseSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.TabularSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.TeradataSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.azurenative.datafactory.outputs.VerticaSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.WebSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.XeroSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.XmlSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.ZohoSourceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LookupActivityResponse {
    /**
     * Lookup activity dataset reference.
     * 
     */
    private final DatasetReferenceResponse dataset;
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * Whether to return first row or all rows. Default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object firstRowOnly;
    /**
     * Linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Activity policy.
     * 
     */
    private final @Nullable ActivityPolicyResponse policy;
    /**
     * Dataset-specific source properties, same as copy activity source.
     * 
     */
    private final Object source;
    /**
     * Type of activity.
     * Expected value is 'Lookup'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @CustomType.Constructor
    private LookupActivityResponse(
        @CustomType.Parameter("dataset") DatasetReferenceResponse dataset,
        @CustomType.Parameter("dependsOn") @Nullable List<ActivityDependencyResponse> dependsOn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("firstRowOnly") @Nullable Object firstRowOnly,
        @CustomType.Parameter("linkedServiceName") @Nullable LinkedServiceReferenceResponse linkedServiceName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("policy") @Nullable ActivityPolicyResponse policy,
        @CustomType.Parameter("source") Object source,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userProperties") @Nullable List<UserPropertyResponse> userProperties) {
        this.dataset = dataset;
        this.dependsOn = dependsOn;
        this.description = description;
        this.firstRowOnly = firstRowOnly;
        this.linkedServiceName = linkedServiceName;
        this.name = name;
        this.policy = policy;
        this.source = source;
        this.type = type;
        this.userProperties = userProperties;
    }

    /**
     * Lookup activity dataset reference.
     * 
    */
    public DatasetReferenceResponse getDataset() {
        return this.dataset;
    }
    /**
     * Activity depends on condition.
     * 
    */
    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Whether to return first row or all rows. Default value is true. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getFirstRowOnly() {
        return Optional.ofNullable(this.firstRowOnly);
    }
    /**
     * Linked service reference.
     * 
    */
    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }
    /**
     * Activity name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Activity policy.
     * 
    */
    public Optional<ActivityPolicyResponse> getPolicy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * Dataset-specific source properties, same as copy activity source.
     * 
    */
    public Object getSource() {
        return this.source;
    }
    /**
     * Type of activity.
     * Expected value is 'Lookup'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Activity user properties.
     * 
    */
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LookupActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetReferenceResponse dataset;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable Object firstRowOnly;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private Object source;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(LookupActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.firstRowOnly = defaults.firstRowOnly;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder dataset(DatasetReferenceResponse dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }

        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder firstRowOnly(@Nullable Object firstRowOnly) {
            this.firstRowOnly = firstRowOnly;
            return this;
        }

        public Builder linkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder policy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder source(Object source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public LookupActivityResponse build() {
            return new LookupActivityResponse(dataset, dependsOn, description, firstRowOnly, linkedServiceName, name, policy, source, type, userProperties);
        }
    }
}
