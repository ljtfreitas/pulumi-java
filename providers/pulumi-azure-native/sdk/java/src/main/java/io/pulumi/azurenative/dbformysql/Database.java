// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dbformysql.DatabaseArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a Database.
 * API Version: 2017-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:dbformysql:Database db1 /subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/TestGroup/providers/Microsoft.DBforMySQL/servers/testserver/databases/db1 
 * ```
 * 
 */
@ResourceType(type="azure-native:dbformysql:Database")
public class Database extends io.pulumi.resources.CustomResource {
    /**
     * The charset of the database.
     * 
     */
    @OutputExport(name="charset", type=String.class, parameters={})
    private Output</* @Nullable */ String> charset;

    /**
     * @return The charset of the database.
     * 
     */
    public Output</* @Nullable */ String> getCharset() {
        return this.charset;
    }
    /**
     * The collation of the database.
     * 
     */
    @OutputExport(name="collation", type=String.class, parameters={})
    private Output</* @Nullable */ String> collation;

    /**
     * @return The collation of the database.
     * 
     */
    public Output</* @Nullable */ String> getCollation() {
        return this.collation;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
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
    public Database(String name, DatabaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbformysql:Database", name, args == null ? DatabaseArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Database(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbformysql:Database", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:dbformysql/v20171201:Database").build()),
                Input.of(Alias.builder().setType("azure-native:dbformysql/v20171201preview:Database").build())
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
    public static Database get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, options);
    }
}
