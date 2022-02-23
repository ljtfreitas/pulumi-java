// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.glue.DataCatalogEncryptionSettingsArgs;
import io.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsState;
import io.pulumi.aws.glue.outputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettings;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Glue Data Catalog Encryption Settings resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Glue Data Catalog Encryption Settings can be imported using `CATALOG-ID` (AWS account ID if not custom), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:glue/dataCatalogEncryptionSettings:DataCatalogEncryptionSettings example 123456789012
 * ```
 * 
 */
@ResourceType(type="aws:glue/dataCatalogEncryptionSettings:DataCatalogEncryptionSettings")
public class DataCatalogEncryptionSettings extends io.pulumi.resources.CustomResource {
    /**
     * The ID of the Data Catalog to set the security configuration for. If none is provided, the AWS account ID is used by default.
     * 
     */
    @OutputExport(name="catalogId", type=String.class, parameters={})
    private Output<String> catalogId;

    /**
     * @return The ID of the Data Catalog to set the security configuration for. If none is provided, the AWS account ID is used by default.
     * 
     */
    public Output<String> getCatalogId() {
        return this.catalogId;
    }
    /**
     * The security configuration to set. see Data Catalog Encryption Settings.
     * 
     */
    @OutputExport(name="dataCatalogEncryptionSettings", type=DataCatalogEncryptionSettingsDataCatalogEncryptionSettings.class, parameters={})
    private Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettings> dataCatalogEncryptionSettings;

    /**
     * @return The security configuration to set. see Data Catalog Encryption Settings.
     * 
     */
    public Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettings> getDataCatalogEncryptionSettings() {
        return this.dataCatalogEncryptionSettings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataCatalogEncryptionSettings(String name, DataCatalogEncryptionSettingsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/dataCatalogEncryptionSettings:DataCatalogEncryptionSettings", name, args == null ? DataCatalogEncryptionSettingsArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DataCatalogEncryptionSettings(String name, Input<String> id, @Nullable DataCatalogEncryptionSettingsState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/dataCatalogEncryptionSettings:DataCatalogEncryptionSettings", name, state, makeResourceOptions(options, id));
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
    public static DataCatalogEncryptionSettings get(String name, Input<String> id, @Nullable DataCatalogEncryptionSettingsState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataCatalogEncryptionSettings(name, id, state, options);
    }
}
