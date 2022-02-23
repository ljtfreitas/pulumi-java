// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.glue.CatalogDatabaseArgs;
import io.pulumi.aws.glue.inputs.CatalogDatabaseState;
import io.pulumi.aws.glue.outputs.CatalogDatabaseTargetDatabase;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Glue Catalog Database Resource. You can refer to the [Glue Developer Guide](http://docs.aws.amazon.com/glue/latest/dg/populate-data-catalog.html) for a full explanation of the Glue Data Catalog functionality
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Glue Catalog Databases can be imported using the `catalog_id:name`. If you have not set a Catalog ID specify the AWS Account ID that the database is in, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:glue/catalogDatabase:CatalogDatabase database 123456789012:my_database
 * ```
 * 
 */
@ResourceType(type="aws:glue/catalogDatabase:CatalogDatabase")
public class CatalogDatabase extends io.pulumi.resources.CustomResource {
    /**
     * ARN of the Glue Catalog Database.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the Glue Catalog Database.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * ID of the Data Catalog in which the database resides.
     * 
     */
    @OutputExport(name="catalogId", type=String.class, parameters={})
    private Output<String> catalogId;

    /**
     * @return ID of the Data Catalog in which the database resides.
     * 
     */
    public Output<String> getCatalogId() {
        return this.catalogId;
    }
    /**
     * Description of the database.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the database.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Location of the database (for example, an HDFS path).
     * 
     */
    @OutputExport(name="locationUri", type=String.class, parameters={})
    private Output<String> locationUri;

    /**
     * @return Location of the database (for example, an HDFS path).
     * 
     */
    public Output<String> getLocationUri() {
        return this.locationUri;
    }
    /**
     * Name of the database. The acceptable characters are lowercase letters, numbers, and the underscore character.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the database. The acceptable characters are lowercase letters, numbers, and the underscore character.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * List of key-value pairs that define parameters and properties of the database.
     * 
     */
    @OutputExport(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return List of key-value pairs that define parameters and properties of the database.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getParameters() {
        return this.parameters;
    }
    /**
     * Configuration block for a target database for resource linking. See `target_database` below.
     * 
     */
    @OutputExport(name="targetDatabase", type=CatalogDatabaseTargetDatabase.class, parameters={})
    private Output</* @Nullable */ CatalogDatabaseTargetDatabase> targetDatabase;

    /**
     * @return Configuration block for a target database for resource linking. See `target_database` below.
     * 
     */
    public Output</* @Nullable */ CatalogDatabaseTargetDatabase> getTargetDatabase() {
        return this.targetDatabase;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CatalogDatabase(String name, @Nullable CatalogDatabaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/catalogDatabase:CatalogDatabase", name, args == null ? CatalogDatabaseArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CatalogDatabase(String name, Input<String> id, @Nullable CatalogDatabaseState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/catalogDatabase:CatalogDatabase", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CatalogDatabase get(String name, Input<String> id, @Nullable CatalogDatabaseState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CatalogDatabase(name, id, state, options);
    }
}
