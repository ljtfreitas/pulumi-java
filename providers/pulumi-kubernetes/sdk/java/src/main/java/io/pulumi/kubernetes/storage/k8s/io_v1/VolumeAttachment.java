// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1;

import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import io.pulumi.kubernetes.storage.k8s.io_v1.VolumeAttachmentArgs;
import io.pulumi.kubernetes.storage.k8s.io_v1.outputs.VolumeAttachmentSpec;
import io.pulumi.kubernetes.storage.k8s.io_v1.outputs.VolumeAttachmentStatus;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * VolumeAttachment captures the intent to attach or detach the specified volume to/from the specified node.
 * 
 * VolumeAttachment objects are non-namespaced.
 * 
 */
@ResourceType(type="kubernetes:storage.k8s.io/v1:VolumeAttachment")
public class VolumeAttachment extends io.pulumi.resources.CustomResource {
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
     * Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Export(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    /**
     * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.
     * 
     */
    @Export(name="spec", type=VolumeAttachmentSpec.class, parameters={})
    private Output<VolumeAttachmentSpec> spec;

    /**
     * @return Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.
     * 
     */
    public Output<VolumeAttachmentSpec> getSpec() {
        return this.spec;
    }
    /**
     * Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher.
     * 
     */
    @Export(name="status", type=VolumeAttachmentStatus.class, parameters={})
    private Output</* @Nullable */ VolumeAttachmentStatus> status;

    /**
     * @return Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher.
     * 
     */
    public Output</* @Nullable */ VolumeAttachmentStatus> getStatus() {
        return this.status;
    }

    public interface BuilderApplicator {
        public void apply(VolumeAttachmentArgs.Builder a);
    }
    private static io.pulumi.kubernetes.storage.k8s.io_v1.VolumeAttachmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.kubernetes.storage.k8s.io_v1.VolumeAttachmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VolumeAttachment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VolumeAttachment(String name) {
        this(name, VolumeAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VolumeAttachment(String name, VolumeAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VolumeAttachment(String name, VolumeAttachmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:storage.k8s.io/v1:VolumeAttachment", name, makeArgs(args), makeResourceOptions(options, Output.empty()));
    }

    private VolumeAttachment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:storage.k8s.io/v1:VolumeAttachment", name, null, makeResourceOptions(options, id));
    }

    private static VolumeAttachmentArgs makeArgs(VolumeAttachmentArgs args) {
        var builder = args == null ? VolumeAttachmentArgs.builder() : VolumeAttachmentArgs.builder(args);
        return builder
            .apiVersion("storage.k8s.io/v1")
            .kind("VolumeAttachment")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("kubernetes:storage.k8s.io/v1alpha1:VolumeAttachment").build()),
                Output.of(Alias.builder().setType("kubernetes:storage.k8s.io/v1beta1:VolumeAttachment").build())
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
    public static VolumeAttachment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VolumeAttachment(name, id, options);
    }
}
