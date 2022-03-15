// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1;

import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.ClusterRoleBindingArgs;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.outputs.RoleRef;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.outputs.Subject;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a ClusterRole in the global namespace, and adds who information via Subject.
 * 
 */
@ResourceType(type="kubernetes:rbac.authorization.k8s.io/v1:ClusterRoleBinding")
public class ClusterRoleBinding extends io.pulumi.resources.CustomResource {
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
    @Export(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard object's metadata.
     * 
     */
    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    /**
     * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
     * 
     */
    @Export(name="roleRef", type=RoleRef.class, parameters={})
    private Output<RoleRef> roleRef;

    /**
     * @return RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
     * 
     */
    public Output<RoleRef> getRoleRef() {
        return this.roleRef;
    }
    /**
     * Subjects holds references to the objects the role applies to.
     * 
     */
    @Export(name="subjects", type=List.class, parameters={Subject.class})
    private Output</* @Nullable */ List<Subject>> subjects;

    /**
     * @return Subjects holds references to the objects the role applies to.
     * 
     */
    public Output</* @Nullable */ List<Subject>> getSubjects() {
        return this.subjects;
    }

    public interface BuilderApplicator {
        public void apply(ClusterRoleBindingArgs.Builder a);
    }
    private static io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.ClusterRoleBindingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.ClusterRoleBindingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ClusterRoleBinding(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterRoleBinding(String name) {
        this(name, ClusterRoleBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterRoleBinding(String name, ClusterRoleBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterRoleBinding(String name, ClusterRoleBindingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:rbac.authorization.k8s.io/v1:ClusterRoleBinding", name, makeArgs(args), makeResourceOptions(options, Output.empty()));
    }

    private ClusterRoleBinding(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:rbac.authorization.k8s.io/v1:ClusterRoleBinding", name, null, makeResourceOptions(options, id));
    }

    private static ClusterRoleBindingArgs makeArgs(ClusterRoleBindingArgs args) {
        var builder = args == null ? ClusterRoleBindingArgs.builder() : ClusterRoleBindingArgs.builder(args);
        return builder
            .apiVersion("rbac.authorization.k8s.io/v1")
            .kind("ClusterRoleBinding")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("kubernetes:rbac.authorization.k8s.io/v1alpha1:ClusterRoleBinding").build()),
                Output.of(Alias.builder().setType("kubernetes:rbac.authorization.k8s.io/v1beta1:ClusterRoleBinding").build())
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
    public static ClusterRoleBinding get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ClusterRoleBinding(name, id, options);
    }
}
