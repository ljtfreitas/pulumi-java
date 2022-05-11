// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.datafactory.DatasetCosmosDBApiArgs;
import com.pulumi.azure.datafactory.inputs.DatasetCosmosDBApiState;
import com.pulumi.azure.datafactory.outputs.DatasetCosmosDBApiSchemaColumn;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure Cosmos DB SQL API Dataset inside an Azure Data Factory.
 * 
 * ## Import
 * 
 * Data Factory Datasets can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:datafactory/datasetCosmosDBApi:DatasetCosmosDBApi example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/datasets/example
 * ```
 * 
 */
@ResourceType(type="azure:datafactory/datasetCosmosDBApi:DatasetCosmosDBApi")
public class DatasetCosmosDBApi extends com.pulumi.resources.CustomResource {
    /**
     * A map of additional properties to associate with the Data Factory Dataset.
     * 
     */
    @Export(name="additionalProperties", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Data Factory Dataset.
     * 
     */
    public Output<Optional<Map<String,String>>> additionalProperties() {
        return Codegen.optional(this.additionalProperties);
    }
    /**
     * List of tags that can be used for describing the Data Factory Dataset.
     * 
     */
    @Export(name="annotations", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Dataset.
     * 
     */
    public Output<Optional<List<String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * The collection name of the Data Factory Dataset Azure Cosmos DB SQL API.
     * 
     */
    @Export(name="collectionName", type=String.class, parameters={})
    private Output</* @Nullable */ String> collectionName;

    /**
     * @return The collection name of the Data Factory Dataset Azure Cosmos DB SQL API.
     * 
     */
    public Output<Optional<String>> collectionName() {
        return Codegen.optional(this.collectionName);
    }
    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    @Export(name="dataFactoryId", type=String.class, parameters={})
    private Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    public Output<String> dataFactoryId() {
        return this.dataFactoryId;
    }
    /**
     * The description for the Data Factory Dataset.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description for the Data Factory Dataset.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
     * 
     */
    @Export(name="folder", type=String.class, parameters={})
    private Output</* @Nullable */ String> folder;

    /**
     * @return The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
     * 
     */
    public Output<Optional<String>> folder() {
        return Codegen.optional(this.folder);
    }
    /**
     * The Data Factory Linked Service name in which to associate the Dataset with.
     * 
     */
    @Export(name="linkedServiceName", type=String.class, parameters={})
    private Output<String> linkedServiceName;

    /**
     * @return The Data Factory Linked Service name in which to associate the Dataset with.
     * 
     */
    public Output<String> linkedServiceName() {
        return this.linkedServiceName;
    }
    /**
     * Specifies the name of the Data Factory Dataset. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Dataset. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of parameters to associate with the Data Factory Dataset.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory Dataset.
     * 
     */
    public Output<Optional<Map<String,String>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * A `schema_column` block as defined below.
     * 
     */
    @Export(name="schemaColumns", type=List.class, parameters={DatasetCosmosDBApiSchemaColumn.class})
    private Output</* @Nullable */ List<DatasetCosmosDBApiSchemaColumn>> schemaColumns;

    /**
     * @return A `schema_column` block as defined below.
     * 
     */
    public Output<Optional<List<DatasetCosmosDBApiSchemaColumn>>> schemaColumns() {
        return Codegen.optional(this.schemaColumns);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatasetCosmosDBApi(String name) {
        this(name, DatasetCosmosDBApiArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatasetCosmosDBApi(String name, DatasetCosmosDBApiArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatasetCosmosDBApi(String name, DatasetCosmosDBApiArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/datasetCosmosDBApi:DatasetCosmosDBApi", name, args == null ? DatasetCosmosDBApiArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatasetCosmosDBApi(String name, Output<String> id, @Nullable DatasetCosmosDBApiState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/datasetCosmosDBApi:DatasetCosmosDBApi", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static DatasetCosmosDBApi get(String name, Output<String> id, @Nullable DatasetCosmosDBApiState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatasetCosmosDBApi(name, id, state, options);
    }
}
