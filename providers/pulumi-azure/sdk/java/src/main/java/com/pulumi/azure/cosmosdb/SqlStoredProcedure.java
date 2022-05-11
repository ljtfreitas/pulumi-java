// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.cosmosdb.SqlStoredProcedureArgs;
import com.pulumi.azure.cosmosdb.inputs.SqlStoredProcedureState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a SQL Stored Procedure within a Cosmos DB Account SQL Database.
 * 
 * ## Example Usage
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
 *         final var exampleAccount = Output.of(CosmosdbFunctions.getAccount(GetAccountArgs.builder()
 *             .name(&#34;tfex-cosmosdb-account&#34;)
 *             .resourceGroupName(&#34;tfex-cosmosdb-account-rg&#34;)
 *             .build()));
 * 
 *         var exampleSqlDatabase = new SqlDatabase(&#34;exampleSqlDatabase&#34;, SqlDatabaseArgs.builder()        
 *             .resourceGroupName(exampleAccount.apply(getAccountResult -&gt; getAccountResult.getResourceGroupName()))
 *             .accountName(exampleAccount.apply(getAccountResult -&gt; getAccountResult.getName()))
 *             .throughput(400)
 *             .build());
 * 
 *         var exampleSqlContainer = new SqlContainer(&#34;exampleSqlContainer&#34;, SqlContainerArgs.builder()        
 *             .resourceGroupName(azurerm_cosmosdb_account.getExample().getResource_group_name())
 *             .accountName(azurerm_cosmosdb_account.getExample().getName())
 *             .databaseName(exampleSqlDatabase.getName())
 *             .partitionKeyPath(&#34;/id&#34;)
 *             .build());
 * 
 *         var exampleSqlStoredProcedure = new SqlStoredProcedure(&#34;exampleSqlStoredProcedure&#34;, SqlStoredProcedureArgs.builder()        
 *             .resourceGroupName(azurerm_cosmosdb_account.getExample().getResource_group_name())
 *             .accountName(azurerm_cosmosdb_account.getExample().getName())
 *             .databaseName(exampleSqlDatabase.getName())
 *             .containerName(exampleSqlContainer.getName())
 *             .body(&#34;&#34;&#34;
 *   	function () { var context = getContext(); var response = context.getResponse(); response.setBody(&#39;Hello, World&#39;); }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * CosmosDB SQL Stored Procedures can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:cosmosdb/sqlStoredProcedure:SqlStoredProcedure db1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/account1/sqlDatabases/db1/containers/c1/storedProcedures/sp1
 * ```
 * 
 */
@ResourceType(type="azure:cosmosdb/sqlStoredProcedure:SqlStoredProcedure")
public class SqlStoredProcedure extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Cosmos DB Account to create the stored procedure within. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="accountName", type=String.class, parameters={})
    private Output<String> accountName;

    /**
     * @return The name of the Cosmos DB Account to create the stored procedure within. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }
    /**
     * The body of the stored procedure.
     * 
     */
    @Export(name="body", type=String.class, parameters={})
    private Output<String> body;

    /**
     * @return The body of the stored procedure.
     * 
     */
    public Output<String> body() {
        return this.body;
    }
    /**
     * The name of the Cosmos DB SQL Container to create the stored procedure within. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="containerName", type=String.class, parameters={})
    private Output<String> containerName;

    /**
     * @return The name of the Cosmos DB SQL Container to create the stored procedure within. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> containerName() {
        return this.containerName;
    }
    /**
     * The name of the Cosmos DB SQL Database to create the stored procedure within. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output<String> databaseName;

    /**
     * @return The name of the Cosmos DB SQL Database to create the stored procedure within. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }
    /**
     * Specifies the name of the Cosmos DB SQL Stored Procedure. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Cosmos DB SQL Stored Procedure. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group in which the Cosmos DB SQL Database is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Cosmos DB SQL Database is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlStoredProcedure(String name) {
        this(name, SqlStoredProcedureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlStoredProcedure(String name, SqlStoredProcedureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlStoredProcedure(String name, SqlStoredProcedureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cosmosdb/sqlStoredProcedure:SqlStoredProcedure", name, args == null ? SqlStoredProcedureArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SqlStoredProcedure(String name, Output<String> id, @Nullable SqlStoredProcedureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:cosmosdb/sqlStoredProcedure:SqlStoredProcedure", name, state, makeResourceOptions(options, id));
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
    public static SqlStoredProcedure get(String name, Output<String> id, @Nullable SqlStoredProcedureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SqlStoredProcedure(name, id, state, options);
    }
}
