// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.kusto.DatabasePrincipalAssignmentArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Class representing a database principal assignment.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:kusto:DatabasePrincipalAssignment kustoclusterrptest4/Kustodatabase8/kustoprincipal1 /subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Kusto/Clusters/kustoclusterrptest4/Databases/Kustodatabase8/PrincipalAssignments/kustoprincipal1 
 * ```
 * 
 */
@ResourceType(type="azure-native:kusto:DatabasePrincipalAssignment")
public class DatabasePrincipalAssignment extends io.pulumi.resources.CustomResource {
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
     * The principal ID assigned to the database principal. It can be a user email, application ID, or security group name.
     * 
     */
    @OutputExport(name="principalId", type=String.class, parameters={})
    private Output<String> principalId;

    /**
     * @return The principal ID assigned to the database principal. It can be a user email, application ID, or security group name.
     * 
     */
    public Output<String> getPrincipalId() {
        return this.principalId;
    }
    /**
     * The principal name
     * 
     */
    @OutputExport(name="principalName", type=String.class, parameters={})
    private Output<String> principalName;

    /**
     * @return The principal name
     * 
     */
    public Output<String> getPrincipalName() {
        return this.principalName;
    }
    /**
     * Principal type.
     * 
     */
    @OutputExport(name="principalType", type=String.class, parameters={})
    private Output<String> principalType;

    /**
     * @return Principal type.
     * 
     */
    public Output<String> getPrincipalType() {
        return this.principalType;
    }
    /**
     * The provisioned state of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioned state of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Database principal role.
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return Database principal role.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }
    /**
     * The tenant id of the principal
     * 
     */
    @OutputExport(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    /**
     * @return The tenant id of the principal
     * 
     */
    public Output</* @Nullable */ String> getTenantId() {
        return this.tenantId;
    }
    /**
     * The tenant name of the principal
     * 
     */
    @OutputExport(name="tenantName", type=String.class, parameters={})
    private Output<String> tenantName;

    /**
     * @return The tenant name of the principal
     * 
     */
    public Output<String> getTenantName() {
        return this.tenantName;
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
    public DatabasePrincipalAssignment(String name, DatabasePrincipalAssignmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:DatabasePrincipalAssignment", name, args == null ? DatabasePrincipalAssignmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DatabasePrincipalAssignment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:DatabasePrincipalAssignment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:kusto/v20191109:DatabasePrincipalAssignment").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200215:DatabasePrincipalAssignment").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200614:DatabasePrincipalAssignment").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200918:DatabasePrincipalAssignment").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20210101:DatabasePrincipalAssignment").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20210827:DatabasePrincipalAssignment").build())
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
    public static DatabasePrincipalAssignment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DatabasePrincipalAssignment(name, id, options);
    }
}
