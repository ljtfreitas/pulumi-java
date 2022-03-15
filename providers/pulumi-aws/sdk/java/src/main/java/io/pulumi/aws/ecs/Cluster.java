// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ecs.ClusterArgs;
import io.pulumi.aws.ecs.inputs.ClusterState;
import io.pulumi.aws.ecs.outputs.ClusterConfiguration;
import io.pulumi.aws.ecs.outputs.ClusterDefaultCapacityProviderStrategy;
import io.pulumi.aws.ecs.outputs.ClusterSetting;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ECS clusters can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ecs/cluster:Cluster stateless stateless-app
 * ```
 * 
 */
@ResourceType(type="aws:ecs/cluster:Cluster")
public class Cluster extends io.pulumi.resources.CustomResource {
    /**
     * ARN that identifies the cluster.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN that identifies the cluster.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * List of short names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
     * 
     */
    @Export(name="capacityProviders", type=List.class, parameters={String.class})
    private Output<List<String>> capacityProviders;

    /**
     * @return List of short names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
     * 
     */
    public Output<List<String>> getCapacityProviders() {
        return this.capacityProviders;
    }
    /**
     * The execute command configuration for the cluster. Detailed below.
     * 
     */
    @Export(name="configuration", type=ClusterConfiguration.class, parameters={})
    private Output</* @Nullable */ ClusterConfiguration> configuration;

    /**
     * @return The execute command configuration for the cluster. Detailed below.
     * 
     */
    public Output</* @Nullable */ ClusterConfiguration> getConfiguration() {
        return this.configuration;
    }
    /**
     * Configuration block for capacity provider strategy to use by default for the cluster. Can be one or more. Detailed below.
     * 
     */
    @Export(name="defaultCapacityProviderStrategies", type=List.class, parameters={ClusterDefaultCapacityProviderStrategy.class})
    private Output<List<ClusterDefaultCapacityProviderStrategy>> defaultCapacityProviderStrategies;

    /**
     * @return Configuration block for capacity provider strategy to use by default for the cluster. Can be one or more. Detailed below.
     * 
     */
    public Output<List<ClusterDefaultCapacityProviderStrategy>> getDefaultCapacityProviderStrategies() {
        return this.defaultCapacityProviderStrategies;
    }
    /**
     * Name of the setting to manage. Valid values: `containerInsights`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the setting to manage. Valid values: `containerInsights`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Detailed below.
     * 
     */
    @Export(name="settings", type=List.class, parameters={ClusterSetting.class})
    private Output<List<ClusterSetting>> settings;

    /**
     * @return Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Detailed below.
     * 
     */
    public Output<List<ClusterSetting>> getSettings() {
        return this.settings;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ClusterArgs.Builder a);
    }
    private static io.pulumi.aws.ecs.ClusterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ecs.ClusterArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Cluster(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, @Nullable ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, @Nullable ClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable ClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/cluster:Cluster", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Cluster get(String name, Output<String> id, @Nullable ClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}
