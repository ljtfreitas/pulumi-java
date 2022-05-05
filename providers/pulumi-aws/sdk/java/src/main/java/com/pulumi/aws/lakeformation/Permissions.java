// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lakeformation.PermissionsArgs;
import com.pulumi.aws.lakeformation.inputs.PermissionsState;
import com.pulumi.aws.lakeformation.outputs.PermissionsDataLocation;
import com.pulumi.aws.lakeformation.outputs.PermissionsDatabase;
import com.pulumi.aws.lakeformation.outputs.PermissionsTable;
import com.pulumi.aws.lakeformation.outputs.PermissionsTableWithColumns;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Grant Permissions For A Lake Formation S3 Resource
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new Permissions(&#34;example&#34;, PermissionsArgs.builder()        
 *             .principal(aws_iam_role.getWorkflow_role().getArn())
 *             .permissions(&#34;ALL&#34;)
 *             .dataLocation(PermissionsDataLocation.builder()
 *                 .arn(aws_lakeformation_resource.getExample().getArn())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Grant Permissions For A Glue Catalog Database
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new Permissions(&#34;example&#34;, PermissionsArgs.builder()        
 *             .role(aws_iam_role.getWorkflow_role().getArn())
 *             .permissions(            
 *                 &#34;CREATE_TABLE&#34;,
 *                 &#34;ALTER&#34;,
 *                 &#34;DROP&#34;)
 *             .database(PermissionsDatabase.builder()
 *                 .name(aws_glue_catalog_database.getExample().getName())
 *                 .catalogId(&#34;110376042874&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 */
@ResourceType(type="aws:lakeformation/permissions:Permissions")
public class Permissions extends com.pulumi.resources.CustomResource {
    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    @Export(name="catalogId", type=String.class, parameters={})
    private Output</* @Nullable */ String> catalogId;

    /**
     * @return Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    public Output<Optional<String>> catalogId() {
        return Codegen.optional(this.catalogId);
    }
    /**
     * Whether the permissions are to be granted for the Data Catalog. Defaults to `false`.
     * 
     */
    @Export(name="catalogResource", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> catalogResource;

    /**
     * @return Whether the permissions are to be granted for the Data Catalog. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> catalogResource() {
        return Codegen.optional(this.catalogResource);
    }
    /**
     * Configuration block for a data location resource. Detailed below.
     * 
     */
    @Export(name="dataLocation", type=PermissionsDataLocation.class, parameters={})
    private Output<PermissionsDataLocation> dataLocation;

    /**
     * @return Configuration block for a data location resource. Detailed below.
     * 
     */
    public Output<PermissionsDataLocation> dataLocation() {
        return this.dataLocation;
    }
    /**
     * Configuration block for a database resource. Detailed below.
     * 
     */
    @Export(name="database", type=PermissionsDatabase.class, parameters={})
    private Output<PermissionsDatabase> database;

    /**
     * @return Configuration block for a database resource. Detailed below.
     * 
     */
    public Output<PermissionsDatabase> database() {
        return this.database;
    }
    /**
     * List of permissions granted to the principal. Valid values may include `ALL`, `ALTER`, `CREATE_DATABASE`, `CREATE_TABLE`, `DATA_LOCATION_ACCESS`, `DELETE`, `DESCRIBE`, `DROP`, `INSERT`, and `SELECT`. For details on each permission, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
     */
    @Export(name="permissions", type=List.class, parameters={String.class})
    private Output<List<String>> permissions;

    /**
     * @return List of permissions granted to the principal. Valid values may include `ALL`, `ALTER`, `CREATE_DATABASE`, `CREATE_TABLE`, `DATA_LOCATION_ACCESS`, `DELETE`, `DESCRIBE`, `DROP`, `INSERT`, and `SELECT`. For details on each permission, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
     */
    public Output<List<String>> permissions() {
        return this.permissions;
    }
    /**
     * Subset of `permissions` which the principal can pass.
     * 
     */
    @Export(name="permissionsWithGrantOptions", type=List.class, parameters={String.class})
    private Output<List<String>> permissionsWithGrantOptions;

    /**
     * @return Subset of `permissions` which the principal can pass.
     * 
     */
    public Output<List<String>> permissionsWithGrantOptions() {
        return this.permissionsWithGrantOptions;
    }
    /**
     * Principal to be granted the permissions on the resource. Supported principals include `IAM_ALLOWED_PRINCIPALS` (see Default Behavior and `IAMAllowedPrincipals` above), IAM roles, users, groups, SAML groups and users, QuickSight groups, OUs, and organizations as well as AWS account IDs for cross-account permissions. For more information, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
     */
    @Export(name="principal", type=String.class, parameters={})
    private Output<String> principal;

    /**
     * @return Principal to be granted the permissions on the resource. Supported principals include `IAM_ALLOWED_PRINCIPALS` (see Default Behavior and `IAMAllowedPrincipals` above), IAM roles, users, groups, SAML groups and users, QuickSight groups, OUs, and organizations as well as AWS account IDs for cross-account permissions. For more information, see [Lake Formation Permissions Reference](https://docs.aws.amazon.com/lake-formation/latest/dg/lf-permissions-reference.html).
     * 
     */
    public Output<String> principal() {
        return this.principal;
    }
    /**
     * Configuration block for a table resource. Detailed below.
     * 
     */
    @Export(name="table", type=PermissionsTable.class, parameters={})
    private Output<PermissionsTable> table;

    /**
     * @return Configuration block for a table resource. Detailed below.
     * 
     */
    public Output<PermissionsTable> table() {
        return this.table;
    }
    /**
     * Configuration block for a table with columns resource. Detailed below.
     * 
     */
    @Export(name="tableWithColumns", type=PermissionsTableWithColumns.class, parameters={})
    private Output<PermissionsTableWithColumns> tableWithColumns;

    /**
     * @return Configuration block for a table with columns resource. Detailed below.
     * 
     */
    public Output<PermissionsTableWithColumns> tableWithColumns() {
        return this.tableWithColumns;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Permissions(String name) {
        this(name, PermissionsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Permissions(String name, PermissionsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Permissions(String name, PermissionsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lakeformation/permissions:Permissions", name, args == null ? PermissionsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Permissions(String name, Output<String> id, @Nullable PermissionsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lakeformation/permissions:Permissions", name, state, makeResourceOptions(options, id));
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
    public static Permissions get(String name, Output<String> id, @Nullable PermissionsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Permissions(name, id, state, options);
    }
}
