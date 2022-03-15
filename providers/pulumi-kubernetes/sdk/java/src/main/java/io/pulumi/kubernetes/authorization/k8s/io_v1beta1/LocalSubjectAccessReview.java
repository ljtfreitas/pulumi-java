// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1beta1;

import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.authorization.k8s.io_v1beta1.LocalSubjectAccessReviewArgs;
import io.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs.SubjectAccessReviewSpec;
import io.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs.SubjectAccessReviewStatus;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * LocalSubjectAccessReview checks whether or not a user or group can perform an action in a given namespace. Having a namespace scoped resource makes it much easier to grant namespace scoped policy that includes permissions checking.
 * 
 */
@ResourceType(type="kubernetes:authorization.k8s.io/v1beta1:LocalSubjectAccessReview")
public class LocalSubjectAccessReview extends io.pulumi.resources.CustomResource {
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
    @Export(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    /**
     * Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace you made the request against.  If empty, it is defaulted.
     * 
     */
    @Export(name="spec", type=SubjectAccessReviewSpec.class, parameters={})
    private Output<SubjectAccessReviewSpec> spec;

    /**
     * @return Spec holds information about the request being evaluated.  spec.namespace must be equal to the namespace you made the request against.  If empty, it is defaulted.
     * 
     */
    public Output<SubjectAccessReviewSpec> getSpec() {
        return this.spec;
    }
    /**
     * Status is filled in by the server and indicates whether the request is allowed or not
     * 
     */
    @Export(name="status", type=SubjectAccessReviewStatus.class, parameters={})
    private Output</* @Nullable */ SubjectAccessReviewStatus> status;

    /**
     * @return Status is filled in by the server and indicates whether the request is allowed or not
     * 
     */
    public Output</* @Nullable */ SubjectAccessReviewStatus> getStatus() {
        return this.status;
    }

    public interface BuilderApplicator {
        public void apply(LocalSubjectAccessReviewArgs.Builder a);
    }
    private static io.pulumi.kubernetes.authorization.k8s.io_v1beta1.LocalSubjectAccessReviewArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.kubernetes.authorization.k8s.io_v1beta1.LocalSubjectAccessReviewArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public LocalSubjectAccessReview(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LocalSubjectAccessReview(String name) {
        this(name, LocalSubjectAccessReviewArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LocalSubjectAccessReview(String name, LocalSubjectAccessReviewArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocalSubjectAccessReview(String name, LocalSubjectAccessReviewArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:authorization.k8s.io/v1beta1:LocalSubjectAccessReview", name, makeArgs(args), makeResourceOptions(options, Output.empty()));
    }

    private LocalSubjectAccessReview(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:authorization.k8s.io/v1beta1:LocalSubjectAccessReview", name, null, makeResourceOptions(options, id));
    }

    private static LocalSubjectAccessReviewArgs makeArgs(LocalSubjectAccessReviewArgs args) {
        var builder = args == null ? LocalSubjectAccessReviewArgs.builder() : LocalSubjectAccessReviewArgs.builder(args);
        return builder
            .apiVersion("authorization.k8s.io/v1beta1")
            .kind("LocalSubjectAccessReview")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("kubernetes:authorization.k8s.io/v1:LocalSubjectAccessReview").build())
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
    public static LocalSubjectAccessReview get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LocalSubjectAccessReview(name, id, options);
    }
}
