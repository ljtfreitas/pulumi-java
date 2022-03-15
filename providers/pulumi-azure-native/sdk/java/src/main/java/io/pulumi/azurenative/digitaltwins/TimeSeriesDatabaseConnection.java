// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.digitaltwins;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.digitaltwins.TimeSeriesDatabaseConnectionArgs;
import io.pulumi.azurenative.digitaltwins.outputs.AzureDataExplorerConnectionPropertiesResponse;
import io.pulumi.azurenative.digitaltwins.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Describes a time series database connection resource.
 * API Version: 2021-06-30-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:digitaltwins:TimeSeriesDatabaseConnection myConnection /subscriptions/50016170-c839-41ba-a724-51e9df440b9e/resourcegroups/resRg/providers/Microsoft.DigitalTwins/digitalTwinsInstances/myDigitalTwinsService/timeSeriesDatabaseConnections/myConnection 
 * ```
 * 
 */
@ResourceType(type="azure-native:digitaltwins:TimeSeriesDatabaseConnection")
public class TimeSeriesDatabaseConnection extends io.pulumi.resources.CustomResource {
    /**
     * Extension resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Extension resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Properties of a specific time series database connection.
     * 
     */
    @Export(name="properties", type=AzureDataExplorerConnectionPropertiesResponse.class, parameters={})
    private Output<AzureDataExplorerConnectionPropertiesResponse> properties;

    /**
     * @return Properties of a specific time series database connection.
     * 
     */
    public Output<AzureDataExplorerConnectionPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(TimeSeriesDatabaseConnectionArgs.Builder a);
    }
    private static io.pulumi.azurenative.digitaltwins.TimeSeriesDatabaseConnectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.digitaltwins.TimeSeriesDatabaseConnectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TimeSeriesDatabaseConnection(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TimeSeriesDatabaseConnection(String name) {
        this(name, TimeSeriesDatabaseConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TimeSeriesDatabaseConnection(String name, TimeSeriesDatabaseConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TimeSeriesDatabaseConnection(String name, TimeSeriesDatabaseConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:digitaltwins:TimeSeriesDatabaseConnection", name, args == null ? TimeSeriesDatabaseConnectionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private TimeSeriesDatabaseConnection(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:digitaltwins:TimeSeriesDatabaseConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:digitaltwins/v20210630preview:TimeSeriesDatabaseConnection").build())
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
    public static TimeSeriesDatabaseConnection get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TimeSeriesDatabaseConnection(name, id, options);
    }
}
