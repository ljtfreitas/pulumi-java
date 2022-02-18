// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.streamanalytics.OutputArgs;
import io.pulumi.azurenative.streamanalytics.outputs.AvroSerializationResponse;
import io.pulumi.azurenative.streamanalytics.outputs.AzureDataLakeStoreOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.AzureSqlDatabaseOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.AzureTableOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.BlobOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.CsvSerializationResponse;
import io.pulumi.azurenative.streamanalytics.outputs.DiagnosticsResponse;
import io.pulumi.azurenative.streamanalytics.outputs.DocumentDbOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.EventHubOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.JsonSerializationResponse;
import io.pulumi.azurenative.streamanalytics.outputs.PowerBIOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.ServiceBusQueueOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.ServiceBusTopicOutputDataSourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An output object, containing all information associated with the named output. All outputs are contained under a streaming job.
 * API Version: 2016-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:streamanalytics:Output output5195 /subscriptions/56b5e0a9-b645-407d-99b0-c64f86013e3d/resourceGroups/sjrg6912/providers/Microsoft.StreamAnalytics/streamingjobs/sj3310/outputs/output5195 
 * ```
 * 
 */
@ResourceType(type="azure-native:streamanalytics:Output")
public class Output extends io.pulumi.resources.CustomResource {
    /**
     * Describes the data source that output will be written to. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @OutputExport(name="datasource", type=Object.class, parameters={})
    private io.pulumi.core.Output</* @Nullable */ Object> datasource;

    /**
     * @return Describes the data source that output will be written to. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public io.pulumi.core.Output</* @Nullable */ Object> getDatasource() {
        return this.datasource;
    }
    /**
     * Describes conditions applicable to the Input, Output, or the job overall, that warrant customer attention.
     * 
     */
    @OutputExport(name="diagnostics", type=DiagnosticsResponse.class, parameters={})
    private io.pulumi.core.Output<DiagnosticsResponse> diagnostics;

    /**
     * @return Describes conditions applicable to the Input, Output, or the job overall, that warrant customer attention.
     * 
     */
    public io.pulumi.core.Output<DiagnosticsResponse> getDiagnostics() {
        return this.diagnostics;
    }
    /**
     * The current entity tag for the output. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private io.pulumi.core.Output<String> etag;

    /**
     * @return The current entity tag for the output. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
     */
    public io.pulumi.core.Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private io.pulumi.core.Output</* @Nullable */ String> name;

    /**
     * @return Resource name
     * 
     */
    public io.pulumi.core.Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * Describes how data from an input is serialized or how data is serialized when written to an output. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @OutputExport(name="serialization", type=Object.class, parameters={})
    private io.pulumi.core.Output</* @Nullable */ Object> serialization;

    /**
     * @return Describes how data from an input is serialized or how data is serialized when written to an output. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public io.pulumi.core.Output</* @Nullable */ Object> getSerialization() {
        return this.serialization;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private io.pulumi.core.Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public io.pulumi.core.Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Output(String name, OutputArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:streamanalytics:Output", name, args == null ? OutputArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Output(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:streamanalytics:Output", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:streamanalytics/v20160301:Output").build()),
                Input.of(Alias.builder().setType("azure-native:streamanalytics/v20170401preview:Output").build()),
                Input.of(Alias.builder().setType("azure-native:streamanalytics/v20200301:Output").build()),
                Input.of(Alias.builder().setType("azure-native:streamanalytics/v20211001preview:Output").build())
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
    public static Output get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Output(name, id, options);
    }
}
