// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.SensitivityLabelArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A sensitivity label.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:SensitivityLabel current /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/myRG/providers/Microsoft.Sql/servers/myServer/databases/myDatabase/schemas/dbo/tables/myTable/columns/myColumn/sensitivityLabels/current 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:SensitivityLabel")
public class SensitivityLabel extends io.pulumi.resources.CustomResource {
    /**
     * The column name.
     * 
     */
    @OutputExport(name="columnName", type=String.class, parameters={})
    private Output<String> columnName;

    /**
     * @return The column name.
     * 
     */
    public Output<String> getColumnName() {
        return this.columnName;
    }
    /**
     * The information type.
     * 
     */
    @OutputExport(name="informationType", type=String.class, parameters={})
    private Output</* @Nullable */ String> informationType;

    /**
     * @return The information type.
     * 
     */
    public Output</* @Nullable */ String> getInformationType() {
        return this.informationType;
    }
    /**
     * The information type ID.
     * 
     */
    @OutputExport(name="informationTypeId", type=String.class, parameters={})
    private Output</* @Nullable */ String> informationTypeId;

    /**
     * @return The information type ID.
     * 
     */
    public Output</* @Nullable */ String> getInformationTypeId() {
        return this.informationTypeId;
    }
    /**
     * Is sensitivity recommendation disabled. Applicable for recommended sensitivity label only. Specifies whether the sensitivity recommendation on this column is disabled (dismissed) or not.
     * 
     */
    @OutputExport(name="isDisabled", type=Boolean.class, parameters={})
    private Output<Boolean> isDisabled;

    /**
     * @return Is sensitivity recommendation disabled. Applicable for recommended sensitivity label only. Specifies whether the sensitivity recommendation on this column is disabled (dismissed) or not.
     * 
     */
    public Output<Boolean> getIsDisabled() {
        return this.isDisabled;
    }
    /**
     * The label ID.
     * 
     */
    @OutputExport(name="labelId", type=String.class, parameters={})
    private Output</* @Nullable */ String> labelId;

    /**
     * @return The label ID.
     * 
     */
    public Output</* @Nullable */ String> getLabelId() {
        return this.labelId;
    }
    /**
     * The label name.
     * 
     */
    @OutputExport(name="labelName", type=String.class, parameters={})
    private Output</* @Nullable */ String> labelName;

    /**
     * @return The label name.
     * 
     */
    public Output</* @Nullable */ String> getLabelName() {
        return this.labelName;
    }
    /**
     * Resource that manages the sensitivity label.
     * 
     */
    @OutputExport(name="managedBy", type=String.class, parameters={})
    private Output<String> managedBy;

    /**
     * @return Resource that manages the sensitivity label.
     * 
     */
    public Output<String> getManagedBy() {
        return this.managedBy;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="rank", type=String.class, parameters={})
    private Output</* @Nullable */ String> rank;

    public Output</* @Nullable */ String> getRank() {
        return this.rank;
    }
    /**
     * The schema name.
     * 
     */
    @OutputExport(name="schemaName", type=String.class, parameters={})
    private Output<String> schemaName;

    /**
     * @return The schema name.
     * 
     */
    public Output<String> getSchemaName() {
        return this.schemaName;
    }
    /**
     * The table name.
     * 
     */
    @OutputExport(name="tableName", type=String.class, parameters={})
    private Output<String> tableName;

    /**
     * @return The table name.
     * 
     */
    public Output<String> getTableName() {
        return this.tableName;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SensitivityLabel(String name, SensitivityLabelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:SensitivityLabel", name, args == null ? SensitivityLabelArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SensitivityLabel(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:SensitivityLabel", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20170301preview:SensitivityLabel").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200202preview:SensitivityLabel").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200801preview:SensitivityLabel").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20201101preview:SensitivityLabel").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210201preview:SensitivityLabel").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210501preview:SensitivityLabel").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210801preview:SensitivityLabel").build())
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
    public static SensitivityLabel get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SensitivityLabel(name, id, options);
    }
}
