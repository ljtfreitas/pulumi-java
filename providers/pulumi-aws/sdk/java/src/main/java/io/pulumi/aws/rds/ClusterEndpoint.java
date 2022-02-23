// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.rds.ClusterEndpointArgs;
import io.pulumi.aws.rds.inputs.ClusterEndpointState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an RDS Aurora Cluster Endpoint.
 * You can refer to the [User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Overview.Endpoints.html#Aurora.Endpoints.Cluster).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * RDS Clusters Endpoint can be imported using the `cluster_endpoint_identifier`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:rds/clusterEndpoint:ClusterEndpoint custom_reader aurora-prod-cluster-custom-reader
 * ```
 * 
 *  [1]https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Overview.Endpoints.html#Aurora.Endpoints.Cluster
 * 
 */
@ResourceType(type="aws:rds/clusterEndpoint:ClusterEndpoint")
public class ClusterEndpoint extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of cluster
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of cluster
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
     * 
     */
    @OutputExport(name="clusterEndpointIdentifier", type=String.class, parameters={})
    private Output<String> clusterEndpointIdentifier;

    /**
     * @return The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
     * 
     */
    public Output<String> getClusterEndpointIdentifier() {
        return this.clusterEndpointIdentifier;
    }
    /**
     * The cluster identifier.
     * 
     */
    @OutputExport(name="clusterIdentifier", type=String.class, parameters={})
    private Output<String> clusterIdentifier;

    /**
     * @return The cluster identifier.
     * 
     */
    public Output<String> getClusterIdentifier() {
        return this.clusterIdentifier;
    }
    /**
     * The type of the endpoint. One of: READER , ANY .
     * 
     */
    @OutputExport(name="customEndpointType", type=String.class, parameters={})
    private Output<String> customEndpointType;

    /**
     * @return The type of the endpoint. One of: READER , ANY .
     * 
     */
    public Output<String> getCustomEndpointType() {
        return this.customEndpointType;
    }
    /**
     * A custom endpoint for the Aurora cluster
     * 
     */
    @OutputExport(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return A custom endpoint for the Aurora cluster
     * 
     */
    public Output<String> getEndpoint() {
        return this.endpoint;
    }
    /**
     * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `static_members`.
     * 
     */
    @OutputExport(name="excludedMembers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> excludedMembers;

    /**
     * @return List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `static_members`.
     * 
     */
    public Output</* @Nullable */ List<String>> getExcludedMembers() {
        return this.excludedMembers;
    }
    /**
     * List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excluded_members`.
     * 
     */
    @OutputExport(name="staticMembers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> staticMembers;

    /**
     * @return List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excluded_members`.
     * 
     */
    public Output</* @Nullable */ List<String>> getStaticMembers() {
        return this.staticMembers;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterEndpoint(String name, ClusterEndpointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/clusterEndpoint:ClusterEndpoint", name, args == null ? ClusterEndpointArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ClusterEndpoint(String name, Input<String> id, @Nullable ClusterEndpointState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/clusterEndpoint:ClusterEndpoint", name, state, makeResourceOptions(options, id));
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
    public static ClusterEndpoint get(String name, Input<String> id, @Nullable ClusterEndpointState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ClusterEndpoint(name, id, state, options);
    }
}
