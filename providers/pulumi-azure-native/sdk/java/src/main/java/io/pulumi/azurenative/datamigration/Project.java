// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datamigration.ProjectArgs;
import io.pulumi.azurenative.datamigration.outputs.DatabaseInfoResponse;
import io.pulumi.azurenative.datamigration.outputs.MiSqlConnectionInfoResponse;
import io.pulumi.azurenative.datamigration.outputs.MySqlConnectionInfoResponse;
import io.pulumi.azurenative.datamigration.outputs.PostgreSqlConnectionInfoResponse;
import io.pulumi.azurenative.datamigration.outputs.SqlConnectionInfoResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A project resource
 * API Version: 2018-04-19.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datamigration:Project DmsSdkProject /subscriptions/fc04246f-04c5-437e-ac5e-206a19e7193f/resourceGroups/DmsSdkRg/providers/Microsoft.DataMigration/services/DmsSdkService/projects/DmsSdkProject 
 * ```
 * 
 */
@ResourceType(type="azure-native:datamigration:Project")
public class Project extends io.pulumi.resources.CustomResource {
    /**
     * UTC Date and time when project was created
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return UTC Date and time when project was created
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * List of DatabaseInfo
     * 
     */
    @Export(name="databasesInfo", type=List.class, parameters={DatabaseInfoResponse.class})
    private Output</* @Nullable */ List<DatabaseInfoResponse>> databasesInfo;

    /**
     * @return List of DatabaseInfo
     * 
     */
    public Output</* @Nullable */ List<DatabaseInfoResponse>> getDatabasesInfo() {
        return this.databasesInfo;
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
     * The project's provisioning state
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The project's provisioning state
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Information for connecting to source
     * 
     */
    @Export(name="sourceConnectionInfo", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> sourceConnectionInfo;

    /**
     * @return Information for connecting to source
     * 
     */
    public Output</* @Nullable */ Object> getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }
    /**
     * Source platform for the project
     * 
     */
    @Export(name="sourcePlatform", type=String.class, parameters={})
    private Output<String> sourcePlatform;

    /**
     * @return Source platform for the project
     * 
     */
    public Output<String> getSourcePlatform() {
        return this.sourcePlatform;
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
     * Information for connecting to target
     * 
     */
    @Export(name="targetConnectionInfo", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> targetConnectionInfo;

    /**
     * @return Information for connecting to target
     * 
     */
    public Output</* @Nullable */ Object> getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }
    /**
     * Target platform for the project
     * 
     */
    @Export(name="targetPlatform", type=String.class, parameters={})
    private Output<String> targetPlatform;

    /**
     * @return Target platform for the project
     * 
     */
    public Output<String> getTargetPlatform() {
        return this.targetPlatform;
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

    public interface BuilderApplicator {
        public void apply(ProjectArgs.Builder a);
    }
    private static io.pulumi.azurenative.datamigration.ProjectArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.datamigration.ProjectArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Project(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Project(String name) {
        this(name, ProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Project(String name, ProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Project(String name, ProjectArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datamigration:Project", name, args == null ? ProjectArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Project(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datamigration:Project", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:datamigration/v20171115preview:Project").build()),
                Output.of(Alias.builder().setType("azure-native:datamigration/v20180315preview:Project").build()),
                Output.of(Alias.builder().setType("azure-native:datamigration/v20180331preview:Project").build()),
                Output.of(Alias.builder().setType("azure-native:datamigration/v20180419:Project").build()),
                Output.of(Alias.builder().setType("azure-native:datamigration/v20180715preview:Project").build()),
                Output.of(Alias.builder().setType("azure-native:datamigration/v20210630:Project").build()),
                Output.of(Alias.builder().setType("azure-native:datamigration/v20211030preview:Project").build())
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
    public static Project get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Project(name, id, options);
    }
}
