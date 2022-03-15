// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.SqlPoolWorkloadGroupArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Workload group operations for a sql pool
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:synapse:SqlPoolWorkloadGroup smallrc /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/sqlcrudtest-6852/providers/Microsoft.Synapse/workspaces/sqlcrudtest-2080/sqlPools/workloadGroups/smallrc 
 * ```
 * 
 */
@ResourceType(type="azure-native:synapse:SqlPoolWorkloadGroup")
public class SqlPoolWorkloadGroup extends io.pulumi.resources.CustomResource {
    /**
     * The workload group importance level.
     * 
     */
    @Export(name="importance", type=String.class, parameters={})
    private Output</* @Nullable */ String> importance;

    /**
     * @return The workload group importance level.
     * 
     */
    public Output</* @Nullable */ String> getImportance() {
        return this.importance;
    }
    /**
     * The workload group cap percentage resource.
     * 
     */
    @Export(name="maxResourcePercent", type=Integer.class, parameters={})
    private Output<Integer> maxResourcePercent;

    /**
     * @return The workload group cap percentage resource.
     * 
     */
    public Output<Integer> getMaxResourcePercent() {
        return this.maxResourcePercent;
    }
    /**
     * The workload group request maximum grant percentage.
     * 
     */
    @Export(name="maxResourcePercentPerRequest", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> maxResourcePercentPerRequest;

    /**
     * @return The workload group request maximum grant percentage.
     * 
     */
    public Output</* @Nullable */ Double> getMaxResourcePercentPerRequest() {
        return this.maxResourcePercentPerRequest;
    }
    /**
     * The workload group minimum percentage resource.
     * 
     */
    @Export(name="minResourcePercent", type=Integer.class, parameters={})
    private Output<Integer> minResourcePercent;

    /**
     * @return The workload group minimum percentage resource.
     * 
     */
    public Output<Integer> getMinResourcePercent() {
        return this.minResourcePercent;
    }
    /**
     * The workload group request minimum grant percentage.
     * 
     */
    @Export(name="minResourcePercentPerRequest", type=Double.class, parameters={})
    private Output<Double> minResourcePercentPerRequest;

    /**
     * @return The workload group request minimum grant percentage.
     * 
     */
    public Output<Double> getMinResourcePercentPerRequest() {
        return this.minResourcePercentPerRequest;
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
     * The workload group query execution timeout.
     * 
     */
    @Export(name="queryExecutionTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> queryExecutionTimeout;

    /**
     * @return The workload group query execution timeout.
     * 
     */
    public Output</* @Nullable */ Integer> getQueryExecutionTimeout() {
        return this.queryExecutionTimeout;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(SqlPoolWorkloadGroupArgs.Builder a);
    }
    private static io.pulumi.azurenative.synapse.SqlPoolWorkloadGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.synapse.SqlPoolWorkloadGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SqlPoolWorkloadGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlPoolWorkloadGroup(String name) {
        this(name, SqlPoolWorkloadGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlPoolWorkloadGroup(String name, SqlPoolWorkloadGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlPoolWorkloadGroup(String name, SqlPoolWorkloadGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:SqlPoolWorkloadGroup", name, args == null ? SqlPoolWorkloadGroupArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SqlPoolWorkloadGroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:SqlPoolWorkloadGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:synapse/v20190601preview:SqlPoolWorkloadGroup").build()),
                Output.of(Alias.builder().setType("azure-native:synapse/v20201201:SqlPoolWorkloadGroup").build()),
                Output.of(Alias.builder().setType("azure-native:synapse/v20210301:SqlPoolWorkloadGroup").build()),
                Output.of(Alias.builder().setType("azure-native:synapse/v20210401preview:SqlPoolWorkloadGroup").build()),
                Output.of(Alias.builder().setType("azure-native:synapse/v20210501:SqlPoolWorkloadGroup").build()),
                Output.of(Alias.builder().setType("azure-native:synapse/v20210601:SqlPoolWorkloadGroup").build()),
                Output.of(Alias.builder().setType("azure-native:synapse/v20210601preview:SqlPoolWorkloadGroup").build())
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
    public static SqlPoolWorkloadGroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SqlPoolWorkloadGroup(name, id, options);
    }
}
