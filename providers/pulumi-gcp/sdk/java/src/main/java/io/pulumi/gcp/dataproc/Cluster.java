// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.dataproc.ClusterArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterState;
import io.pulumi.gcp.dataproc.outputs.ClusterClusterConfig;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages a Cloud Dataproc cluster resource within GCP.
 * 
 * * [API documentation](https://cloud.google.com/dataproc/docs/reference/rest/v1/projects.regions.clusters)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dataproc/docs)
 * 
 * !> **Warning:** Due to limitations of the API, all arguments except
 * `labels`,`cluster_config.worker_config.num_instances` and `cluster_config.preemptible_worker_config.num_instances` are non-updatable. Changing others will cause recreation of the
 * whole cluster!
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:dataproc/cluster:Cluster")
public class Cluster extends io.pulumi.resources.CustomResource {
    /**
     * Allows you to configure various aspects of the cluster.
     * Structure defined below.
     * 
     */
    @Export(name="clusterConfig", type=ClusterClusterConfig.class, parameters={})
    private Output<ClusterClusterConfig> clusterConfig;

    /**
     * @return Allows you to configure various aspects of the cluster.
     * Structure defined below.
     * 
     */
    public Output<ClusterClusterConfig> getClusterConfig() {
        return this.clusterConfig;
    }
    /**
     * The timeout duration which allows graceful decomissioning when you change the number of worker nodes directly through a
     * terraform apply
     * 
     */
    @Export(name="gracefulDecommissionTimeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> gracefulDecommissionTimeout;

    /**
     * @return The timeout duration which allows graceful decomissioning when you change the number of worker nodes directly through a
     * terraform apply
     * 
     */
    public Output</* @Nullable */ String> getGracefulDecommissionTimeout() {
        return this.gracefulDecommissionTimeout;
    }
    /**
     * The list of labels (key/value pairs) to be applied to
     * instances in the cluster. GCP generates some itself including `goog-dataproc-cluster-name`
     * which is the name of the cluster.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return The list of labels (key/value pairs) to be applied to
     * instances in the cluster. GCP generates some itself including `goog-dataproc-cluster-name`
     * which is the name of the cluster.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The name of the cluster, unique within the project and
     * zone.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the cluster, unique within the project and
     * zone.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the `cluster` will exist. If it
     * is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the `cluster` will exist. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The region in which the cluster and associated nodes will be created in.
     * Defaults to `global`.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output</* @Nullable */ String> region;

    /**
     * @return The region in which the cluster and associated nodes will be created in.
     * Defaults to `global`.
     * 
     */
    public Output</* @Nullable */ String> getRegion() {
        return this.region;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ClusterArgs.Builder a);
    }
    private static io.pulumi.gcp.dataproc.ClusterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.dataproc.ClusterArgs.builder();
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
        super("gcp:dataproc/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable ClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/cluster:Cluster", name, state, makeResourceOptions(options, id));
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
