// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.ConnectionArgs;
import io.pulumi.azurenative.automation.outputs.ConnectionTypeAssociationPropertyResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Definition of the connection.
 * API Version: 2019-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:automation:Connection mysConnection /subscriptions/subid/resourceGroups/rg/providers/Microsoft.Automation/automationAccounts/myAutomationAccount28/connections/mysConnection 
 * ```
 * 
 */
@ResourceType(type="azure-native:automation:Connection")
public class Connection extends io.pulumi.resources.CustomResource {
    /**
     * Gets or sets the connectionType of the connection.
     * 
     */
    @Export(name="connectionType", type=ConnectionTypeAssociationPropertyResponse.class, parameters={})
    private Output</* @Nullable */ ConnectionTypeAssociationPropertyResponse> connectionType;

    /**
     * @return Gets or sets the connectionType of the connection.
     * 
     */
    public Output</* @Nullable */ ConnectionTypeAssociationPropertyResponse> getConnectionType() {
        return this.connectionType;
    }
    /**
     * Gets the creation time.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return Gets the creation time.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * Gets or sets the description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Gets or sets the description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Gets the field definition values of the connection.
     * 
     */
    @Export(name="fieldDefinitionValues", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> fieldDefinitionValues;

    /**
     * @return Gets the field definition values of the connection.
     * 
     */
    public Output<Map<String,String>> getFieldDefinitionValues() {
        return this.fieldDefinitionValues;
    }
    /**
     * Gets the last modified time.
     * 
     */
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    /**
     * @return Gets the last modified time.
     * 
     */
    public Output<String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ConnectionArgs.Builder a);
    }
    private static io.pulumi.azurenative.automation.ConnectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.automation.ConnectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Connection(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connection(String name) {
        this(name, ConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connection(String name, ConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connection(String name, ConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:Connection", name, args == null ? ConnectionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Connection(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:Connection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:automation/v20151031:Connection").build()),
                Output.of(Alias.builder().setType("azure-native:automation/v20190601:Connection").build()),
                Output.of(Alias.builder().setType("azure-native:automation/v20200113preview:Connection").build())
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
    public static Connection get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Connection(name, id, options);
    }
}
