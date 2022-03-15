// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.metastore_v1alpha.MetadataImportArgs;
import io.pulumi.googlenative.metastore_v1alpha.outputs.DatabaseDumpResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new MetadataImport in a given project and location.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:metastore/v1alpha:MetadataImport")
public class MetadataImport extends io.pulumi.resources.CustomResource {
    /**
     * The time when the metadata import was started.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the metadata import was started.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Immutable. A database dump from a pre-existing metastore's database.
     * 
     */
    @Export(name="databaseDump", type=DatabaseDumpResponse.class, parameters={})
    private Output<DatabaseDumpResponse> databaseDump;

    /**
     * @return Immutable. A database dump from a pre-existing metastore's database.
     * 
     */
    public Output<DatabaseDumpResponse> getDatabaseDump() {
        return this.databaseDump;
    }
    /**
     * The description of the metadata import.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the metadata import.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The time when the metadata import finished.
     * 
     */
    @Export(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return The time when the metadata import finished.
     * 
     */
    public Output<String> getEndTime() {
        return this.endTime;
    }
    /**
     * Immutable. The relative resource name of the metadata import, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}/metadataImports/{metadata_import_id}.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. The relative resource name of the metadata import, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}/metadataImports/{metadata_import_id}.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The current state of the metadata import.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the metadata import.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The time when the metadata import was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time when the metadata import was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(MetadataImportArgs.Builder a);
    }
    private static io.pulumi.googlenative.metastore_v1alpha.MetadataImportArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.metastore_v1alpha.MetadataImportArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public MetadataImport(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MetadataImport(String name) {
        this(name, MetadataImportArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MetadataImport(String name, MetadataImportArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MetadataImport(String name, MetadataImportArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:metastore/v1alpha:MetadataImport", name, args == null ? MetadataImportArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private MetadataImport(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:metastore/v1alpha:MetadataImport", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static MetadataImport get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MetadataImport(name, id, options);
    }
}
