// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.eks.AddonArgs;
import io.pulumi.aws.eks.inputs.AddonState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an EKS add-on.
 * 
 * > **Note:** Amazon EKS add-on can only be used with Amazon EKS Clusters
 * running version 1.18 with platform version eks.3 or later
 * because add-ons rely on the Server-side Apply Kubernetes feature,
 * which is only available in Kubernetes 1.18 and later.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EKS add-on can be imported using the `cluster_name` and `addon_name` separated by a colon (`:`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:eks/addon:Addon my_eks_addon my_cluster_name:my_addon_name
 * ```
 * 
 */
@ResourceType(type="aws:eks/addon:Addon")
public class Addon extends io.pulumi.resources.CustomResource {
    /**
     * Name of the EKS add-on. The name must match one of
     * the names returned by [list-addon](https://docs.aws.amazon.com/cli/latest/reference/eks/list-addons.html).
     * 
     */
    @OutputExport(name="addonName", type=String.class, parameters={})
    private Output<String> addonName;

    /**
     * @return Name of the EKS add-on. The name must match one of
     * the names returned by [list-addon](https://docs.aws.amazon.com/cli/latest/reference/eks/list-addons.html).
     * 
     */
    public Output<String> getAddonName() {
        return this.addonName;
    }
    /**
     * The version of the EKS add-on. The version must
     * match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
     * 
     */
    @OutputExport(name="addonVersion", type=String.class, parameters={})
    private Output<String> addonVersion;

    /**
     * @return The version of the EKS add-on. The version must
     * match one of the versions returned by [describe-addon-versions](https://docs.aws.amazon.com/cli/latest/reference/eks/describe-addon-versions.html).
     * 
     */
    public Output<String> getAddonVersion() {
        return this.addonVersion;
    }
    /**
     * Amazon Resource Name (ARN) of the EKS add-on.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the EKS add-on.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     */
    @OutputExport(name="clusterName", type=String.class, parameters={})
    private Output<String> clusterName;

    /**
     * @return Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     */
    public Output<String> getClusterName() {
        return this.clusterName;
    }
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
     * 
     */
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was created.
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
     * 
     */
    @OutputExport(name="modifiedAt", type=String.class, parameters={})
    private Output<String> modifiedAt;

    /**
     * @return Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the EKS add-on was updated.
     * 
     */
    public Output<String> getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Define how to resolve parameter value conflicts
     * when migrating an existing add-on to an Amazon EKS add-on or when applying
     * version updates to the add-on. Valid values are `NONE` and `OVERWRITE`.
     * 
     */
    @OutputExport(name="resolveConflicts", type=String.class, parameters={})
    private Output</* @Nullable */ String> resolveConflicts;

    /**
     * @return Define how to resolve parameter value conflicts
     * when migrating an existing add-on to an Amazon EKS add-on or when applying
     * version updates to the add-on. Valid values are `NONE` and `OVERWRITE`.
     * 
     */
    public Output</* @Nullable */ String> getResolveConflicts() {
        return this.resolveConflicts;
    }
    /**
     * The Amazon Resource Name (ARN) of an
     * existing IAM role to bind to the add-on's service account. The role must be
     * assigned the IAM permissions required by the add-on. If you don't specify
     * an existing IAM role, then the add-on uses the permissions assigned to the node
     * IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
     * in the Amazon EKS User Guide.
     * 
     */
    @OutputExport(name="serviceAccountRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceAccountRoleArn;

    /**
     * @return The Amazon Resource Name (ARN) of an
     * existing IAM role to bind to the add-on's service account. The role must be
     * assigned the IAM permissions required by the add-on. If you don't specify
     * an existing IAM role, then the add-on uses the permissions assigned to the node
     * IAM role. For more information, see [Amazon EKS node IAM role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html)
     * in the Amazon EKS User Guide.
     * 
     */
    public Output</* @Nullable */ String> getServiceAccountRoleArn() {
        return this.serviceAccountRoleArn;
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
     * (Optional) Key-value map of resource tags, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return (Optional) Key-value map of resource tags, including those inherited from the provider .
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
    public Addon(String name, AddonArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:eks/addon:Addon", name, args == null ? AddonArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Addon(String name, Input<String> id, @Nullable AddonState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:eks/addon:Addon", name, state, makeResourceOptions(options, id));
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
    public static Addon get(String name, Input<String> id, @Nullable AddonState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Addon(name, id, state, options);
    }
}
