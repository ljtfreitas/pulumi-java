// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.meta_v1.outputs.ListMeta;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.ClusterRoleListArgs;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.outputs.ClusterRole;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ClusterRoleList is a collection of ClusterRoles
 * 
 */
@ResourceType(type="kubernetes:rbac.authorization.k8s.io/v1:ClusterRoleList")
public class ClusterRoleList extends io.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Export(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    /**
     * Items is a list of ClusterRoles
     * 
     */
    @Export(name="items", type=List.class, parameters={ClusterRole.class})
    private Output<List<ClusterRole>> items;

    /**
     * @return Items is a list of ClusterRoles
     * 
     */
    public Output<List<ClusterRole>> getItems() {
        return this.items;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Standard object's metadata.
     * 
     */
    @Export(name="metadata", type=ListMeta.class, parameters={})
    private Output</* @Nullable */ ListMeta> metadata;

    /**
     * @return Standard object's metadata.
     * 
     */
    public Output</* @Nullable */ ListMeta> getMetadata() {
        return this.metadata;
    }

    public interface BuilderApplicator {
        public void apply(ClusterRoleListArgs.Builder a);
    }
    private static io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.ClusterRoleListArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.ClusterRoleListArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ClusterRoleList(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterRoleList(String name) {
        this(name, ClusterRoleListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterRoleList(String name, ClusterRoleListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterRoleList(String name, ClusterRoleListArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:rbac.authorization.k8s.io/v1:ClusterRoleList", name, makeArgs(args), makeResourceOptions(options, Output.empty()));
    }

    private ClusterRoleList(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:rbac.authorization.k8s.io/v1:ClusterRoleList", name, null, makeResourceOptions(options, id));
    }

    private static ClusterRoleListArgs makeArgs(ClusterRoleListArgs args) {
        var builder = args == null ? ClusterRoleListArgs.builder() : ClusterRoleListArgs.builder(args);
        return builder
            .apiVersion("rbac.authorization.k8s.io/v1")
            .kind("ClusterRoleList")
            .build();
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ClusterRoleList get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ClusterRoleList(name, id, options);
    }
}
