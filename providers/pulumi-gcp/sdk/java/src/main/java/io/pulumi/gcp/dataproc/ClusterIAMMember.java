// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.dataproc.ClusterIAMMemberArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterIAMMemberState;
import io.pulumi.gcp.dataproc.outputs.ClusterIAMMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage IAM policies on dataproc clusters. Each of these resources serves a different use case:
 * 
 * * `gcp.dataproc.ClusterIAMPolicy`: Authoritative. Sets the IAM policy for the cluster and replaces any existing policy already attached.
 * * `gcp.dataproc.ClusterIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the cluster are preserved.
 * * `gcp.dataproc.ClusterIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the cluster are preserved.
 * 
 * > **Note:** `gcp.dataproc.ClusterIAMPolicy` **cannot** be used in conjunction with `gcp.dataproc.ClusterIAMBinding` and `gcp.dataproc.ClusterIAMMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the cluster as `gcp.dataproc.ClusterIAMPolicy` replaces the entire policy.
 * 
 * > **Note:** `gcp.dataproc.ClusterIAMBinding` resources **can be** used in conjunction with `gcp.dataproc.ClusterIAMMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_dataproc\_cluster\_iam\_policy
 * 
 * ## google\_dataproc\_cluster\_iam\_binding
 * 
 * ## google\_dataproc\_cluster\_iam\_member
 * 
 * ## Import
 * 
 * Cluster IAM resources can be imported using the project, region, cluster name, role and/or member.
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/clusterIAMMember:ClusterIAMMember editor "projects/{project}/regions/{region}/clusters/{cluster}"
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/clusterIAMMember:ClusterIAMMember editor "projects/{project}/regions/{region}/clusters/{cluster} roles/editor"
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/clusterIAMMember:ClusterIAMMember editor "projects/{project}/regions/{region}/clusters/{cluster} roles/editor user:jane@example.com"
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:dataproc/clusterIAMMember:ClusterIAMMember")
public class ClusterIAMMember extends io.pulumi.resources.CustomResource {
    /**
     * The name or relative resource id of the cluster to manage IAM policies for.
     * 
     */
    @Export(name="cluster", type=String.class, parameters={})
    private Output<String> cluster;

    /**
     * @return The name or relative resource id of the cluster to manage IAM policies for.
     * 
     */
    public Output<String> getCluster() {
        return this.cluster;
    }
    @Export(name="condition", type=ClusterIAMMemberCondition.class, parameters={})
    private Output</* @Nullable */ ClusterIAMMemberCondition> condition;

    public Output</* @Nullable */ ClusterIAMMemberCondition> getCondition() {
        return this.condition;
    }
    /**
     * (Computed) The etag of the clusters's IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the clusters's IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    @Export(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }
    /**
     * The project in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The region in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region in which the cluster belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.dataproc.ClusterIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.dataproc.ClusterIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }

    public interface BuilderApplicator {
        public void apply(ClusterIAMMemberArgs.Builder a);
    }
    private static io.pulumi.gcp.dataproc.ClusterIAMMemberArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.dataproc.ClusterIAMMemberArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ClusterIAMMember(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterIAMMember(String name) {
        this(name, ClusterIAMMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterIAMMember(String name, ClusterIAMMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterIAMMember(String name, ClusterIAMMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/clusterIAMMember:ClusterIAMMember", name, args == null ? ClusterIAMMemberArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ClusterIAMMember(String name, Output<String> id, @Nullable ClusterIAMMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/clusterIAMMember:ClusterIAMMember", name, state, makeResourceOptions(options, id));
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
    public static ClusterIAMMember get(String name, Output<String> id, @Nullable ClusterIAMMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ClusterIAMMember(name, id, state, options);
    }
}
