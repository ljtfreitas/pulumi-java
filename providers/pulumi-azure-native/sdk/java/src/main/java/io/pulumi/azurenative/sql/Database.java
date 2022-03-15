// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.DatabaseArgs;
import io.pulumi.azurenative.sql.outputs.SkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A database resource.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:Database testdb /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default-SQL-SouthEastAsia/providers/Microsoft.Sql/servers/testsvr/databases/testdb 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:Database")
public class Database extends io.pulumi.resources.CustomResource {
    /**
     * Time in minutes after which database is automatically paused. A value of -1 means that automatic pause is disabled
     * 
     */
    @Export(name="autoPauseDelay", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> autoPauseDelay;

    /**
     * @return Time in minutes after which database is automatically paused. A value of -1 means that automatic pause is disabled
     * 
     */
    public Output</* @Nullable */ Integer> getAutoPauseDelay() {
        return this.autoPauseDelay;
    }
    /**
     * Collation of the metadata catalog.
     * 
     */
    @Export(name="catalogCollation", type=String.class, parameters={})
    private Output</* @Nullable */ String> catalogCollation;

    /**
     * @return Collation of the metadata catalog.
     * 
     */
    public Output</* @Nullable */ String> getCatalogCollation() {
        return this.catalogCollation;
    }
    /**
     * The collation of the database.
     * 
     */
    @Export(name="collation", type=String.class, parameters={})
    private Output</* @Nullable */ String> collation;

    /**
     * @return The collation of the database.
     * 
     */
    public Output</* @Nullable */ String> getCollation() {
        return this.collation;
    }
    /**
     * The creation date of the database (ISO8601 format).
     * 
     */
    @Export(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return The creation date of the database (ISO8601 format).
     * 
     */
    public Output<String> getCreationDate() {
        return this.creationDate;
    }
    /**
     * The storage account type used to store backups for this database.
     * 
     */
    @Export(name="currentBackupStorageRedundancy", type=String.class, parameters={})
    private Output<String> currentBackupStorageRedundancy;

    /**
     * @return The storage account type used to store backups for this database.
     * 
     */
    public Output<String> getCurrentBackupStorageRedundancy() {
        return this.currentBackupStorageRedundancy;
    }
    /**
     * The current service level objective name of the database.
     * 
     */
    @Export(name="currentServiceObjectiveName", type=String.class, parameters={})
    private Output<String> currentServiceObjectiveName;

    /**
     * @return The current service level objective name of the database.
     * 
     */
    public Output<String> getCurrentServiceObjectiveName() {
        return this.currentServiceObjectiveName;
    }
    /**
     * The name and tier of the SKU.
     * 
     */
    @Export(name="currentSku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> currentSku;

    /**
     * @return The name and tier of the SKU.
     * 
     */
    public Output<SkuResponse> getCurrentSku() {
        return this.currentSku;
    }
    /**
     * The ID of the database.
     * 
     */
    @Export(name="databaseId", type=String.class, parameters={})
    private Output<String> databaseId;

    /**
     * @return The ID of the database.
     * 
     */
    public Output<String> getDatabaseId() {
        return this.databaseId;
    }
    /**
     * The default secondary region for this database.
     * 
     */
    @Export(name="defaultSecondaryLocation", type=String.class, parameters={})
    private Output<String> defaultSecondaryLocation;

    /**
     * @return The default secondary region for this database.
     * 
     */
    public Output<String> getDefaultSecondaryLocation() {
        return this.defaultSecondaryLocation;
    }
    /**
     * This records the earliest start date and time that restore is available for this database (ISO8601 format).
     * 
     */
    @Export(name="earliestRestoreDate", type=String.class, parameters={})
    private Output<String> earliestRestoreDate;

    /**
     * @return This records the earliest start date and time that restore is available for this database (ISO8601 format).
     * 
     */
    public Output<String> getEarliestRestoreDate() {
        return this.earliestRestoreDate;
    }
    /**
     * The resource identifier of the elastic pool containing this database.
     * 
     */
    @Export(name="elasticPoolId", type=String.class, parameters={})
    private Output</* @Nullable */ String> elasticPoolId;

    /**
     * @return The resource identifier of the elastic pool containing this database.
     * 
     */
    public Output</* @Nullable */ String> getElasticPoolId() {
        return this.elasticPoolId;
    }
    /**
     * Failover Group resource identifier that this database belongs to.
     * 
     */
    @Export(name="failoverGroupId", type=String.class, parameters={})
    private Output<String> failoverGroupId;

    /**
     * @return Failover Group resource identifier that this database belongs to.
     * 
     */
    public Output<String> getFailoverGroupId() {
        return this.failoverGroupId;
    }
    /**
     * The number of secondary replicas associated with the database that are used to provide high availability.
     * 
     */
    @Export(name="highAvailabilityReplicaCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> highAvailabilityReplicaCount;

    /**
     * @return The number of secondary replicas associated with the database that are used to provide high availability.
     * 
     */
    public Output</* @Nullable */ Integer> getHighAvailabilityReplicaCount() {
        return this.highAvailabilityReplicaCount;
    }
    /**
     * Kind of database. This is metadata used for the Azure portal experience.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of database. This is metadata used for the Azure portal experience.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The license type to apply for this database. `LicenseIncluded` if you need a license, or `BasePrice` if you have a license and are eligible for the Azure Hybrid Benefit.
     * 
     */
    @Export(name="licenseType", type=String.class, parameters={})
    private Output</* @Nullable */ String> licenseType;

    /**
     * @return The license type to apply for this database. `LicenseIncluded` if you need a license, or `BasePrice` if you have a license and are eligible for the Azure Hybrid Benefit.
     * 
     */
    public Output</* @Nullable */ String> getLicenseType() {
        return this.licenseType;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Maintenance configuration id assigned to the database. This configuration defines the period when the maintenance updates will occur.
     * 
     */
    @Export(name="maintenanceConfigurationId", type=String.class, parameters={})
    private Output</* @Nullable */ String> maintenanceConfigurationId;

    /**
     * @return Maintenance configuration id assigned to the database. This configuration defines the period when the maintenance updates will occur.
     * 
     */
    public Output</* @Nullable */ String> getMaintenanceConfigurationId() {
        return this.maintenanceConfigurationId;
    }
    /**
     * Resource that manages the database.
     * 
     */
    @Export(name="managedBy", type=String.class, parameters={})
    private Output<String> managedBy;

    /**
     * @return Resource that manages the database.
     * 
     */
    public Output<String> getManagedBy() {
        return this.managedBy;
    }
    /**
     * The max log size for this database.
     * 
     */
    @Export(name="maxLogSizeBytes", type=Double.class, parameters={})
    private Output<Double> maxLogSizeBytes;

    /**
     * @return The max log size for this database.
     * 
     */
    public Output<Double> getMaxLogSizeBytes() {
        return this.maxLogSizeBytes;
    }
    /**
     * The max size of the database expressed in bytes.
     * 
     */
    @Export(name="maxSizeBytes", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> maxSizeBytes;

    /**
     * @return The max size of the database expressed in bytes.
     * 
     */
    public Output</* @Nullable */ Double> getMaxSizeBytes() {
        return this.maxSizeBytes;
    }
    /**
     * Minimal capacity that database will always have allocated, if not paused
     * 
     */
    @Export(name="minCapacity", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> minCapacity;

    /**
     * @return Minimal capacity that database will always have allocated, if not paused
     * 
     */
    public Output</* @Nullable */ Double> getMinCapacity() {
        return this.minCapacity;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The date when database was paused by user configuration or action(ISO8601 format). Null if the database is ready.
     * 
     */
    @Export(name="pausedDate", type=String.class, parameters={})
    private Output<String> pausedDate;

    /**
     * @return The date when database was paused by user configuration or action(ISO8601 format). Null if the database is ready.
     * 
     */
    public Output<String> getPausedDate() {
        return this.pausedDate;
    }
    /**
     * The state of read-only routing. If enabled, connections that have application intent set to readonly in their connection string may be routed to a readonly secondary replica in the same region.
     * 
     */
    @Export(name="readScale", type=String.class, parameters={})
    private Output</* @Nullable */ String> readScale;

    /**
     * @return The state of read-only routing. If enabled, connections that have application intent set to readonly in their connection string may be routed to a readonly secondary replica in the same region.
     * 
     */
    public Output</* @Nullable */ String> getReadScale() {
        return this.readScale;
    }
    /**
     * The storage account type to be used to store backups for this database.
     * 
     */
    @Export(name="requestedBackupStorageRedundancy", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestedBackupStorageRedundancy;

    /**
     * @return The storage account type to be used to store backups for this database.
     * 
     */
    public Output</* @Nullable */ String> getRequestedBackupStorageRedundancy() {
        return this.requestedBackupStorageRedundancy;
    }
    /**
     * The requested service level objective name of the database.
     * 
     */
    @Export(name="requestedServiceObjectiveName", type=String.class, parameters={})
    private Output<String> requestedServiceObjectiveName;

    /**
     * @return The requested service level objective name of the database.
     * 
     */
    public Output<String> getRequestedServiceObjectiveName() {
        return this.requestedServiceObjectiveName;
    }
    /**
     * The date when database was resumed by user action or database login (ISO8601 format). Null if the database is paused.
     * 
     */
    @Export(name="resumedDate", type=String.class, parameters={})
    private Output<String> resumedDate;

    /**
     * @return The date when database was resumed by user action or database login (ISO8601 format). Null if the database is paused.
     * 
     */
    public Output<String> getResumedDate() {
        return this.resumedDate;
    }
    /**
     * The secondary type of the database if it is a secondary.  Valid values are Geo and Named.
     * 
     */
    @Export(name="secondaryType", type=String.class, parameters={})
    private Output</* @Nullable */ String> secondaryType;

    /**
     * @return The secondary type of the database if it is a secondary.  Valid values are Geo and Named.
     * 
     */
    public Output</* @Nullable */ String> getSecondaryType() {
        return this.secondaryType;
    }
    /**
     * The database SKU.
     * 
     * The list of SKUs may vary by region and support offer. To determine the SKUs (including the SKU name, tier/edition, family, and capacity) that are available to your subscription in an Azure region, use the `Capabilities_ListByLocation` REST API or one of the following commands:
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The database SKU.
     * 
     * The list of SKUs may vary by region and support offer. To determine the SKUs (including the SKU name, tier/edition, family, and capacity) that are available to your subscription in an Azure region, use the `Capabilities_ListByLocation` REST API or one of the following commands:
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * The status of the database.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the database.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Whether or not this database is zone redundant, which means the replicas of this database will be spread across multiple availability zones.
     * 
     */
    @Export(name="zoneRedundant", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> zoneRedundant;

    /**
     * @return Whether or not this database is zone redundant, which means the replicas of this database will be spread across multiple availability zones.
     * 
     */
    public Output</* @Nullable */ Boolean> getZoneRedundant() {
        return this.zoneRedundant;
    }

    public interface BuilderApplicator {
        public void apply(DatabaseArgs.Builder a);
    }
    private static io.pulumi.azurenative.sql.DatabaseArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.sql.DatabaseArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Database(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Database(String name) {
        this(name, DatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Database(String name, DatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Database(String name, DatabaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:Database", name, args == null ? DatabaseArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Database(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:Database", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:sql/v20140401:Database").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20170301preview:Database").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20171001preview:Database").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20190601preview:Database").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20200202preview:Database").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20200801preview:Database").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20201101preview:Database").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20210201preview:Database").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20210501preview:Database").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20210801preview:Database").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Database get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, options);
    }
}
