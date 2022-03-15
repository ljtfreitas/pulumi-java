// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.core_v1.ResourceQuotaArgs;
import io.pulumi.kubernetes.core_v1.outputs.ResourceQuotaSpec;
import io.pulumi.kubernetes.core_v1.outputs.ResourceQuotaStatus;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ResourceQuota sets aggregate quota restrictions enforced per namespace
 * 
 */
@ResourceType(type="kubernetes:core/v1:ResourceQuota")
public class ResourceQuota extends io.pulumi.resources.CustomResource {
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
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Export(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    /**
     * Spec defines the desired quota. https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @Export(name="spec", type=ResourceQuotaSpec.class, parameters={})
    private Output</* @Nullable */ ResourceQuotaSpec> spec;

    /**
     * @return Spec defines the desired quota. https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    public Output</* @Nullable */ ResourceQuotaSpec> getSpec() {
        return this.spec;
    }
    /**
     * Status defines the actual enforced quota and its current usage. https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @Export(name="status", type=ResourceQuotaStatus.class, parameters={})
    private Output</* @Nullable */ ResourceQuotaStatus> status;

    /**
     * @return Status defines the actual enforced quota and its current usage. https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    public Output</* @Nullable */ ResourceQuotaStatus> getStatus() {
        return this.status;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ResourceQuotaArgs.Builder a);
    }
    private static io.pulumi.kubernetes.core_v1.ResourceQuotaArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.kubernetes.core_v1.ResourceQuotaArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ResourceQuota(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceQuota(String name) {
        this(name, ResourceQuotaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceQuota(String name, @Nullable ResourceQuotaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceQuota(String name, @Nullable ResourceQuotaArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:ResourceQuota", name, makeArgs(args), makeResourceOptions(options, Output.empty()));
    }

    private ResourceQuota(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:ResourceQuota", name, null, makeResourceOptions(options, id));
    }

    private static ResourceQuotaArgs makeArgs(@Nullable ResourceQuotaArgs args) {
        var builder = args == null ? ResourceQuotaArgs.builder() : ResourceQuotaArgs.builder(args);
        return builder
            .apiVersion("v1")
            .kind("ResourceQuota")
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
    public static ResourceQuota get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourceQuota(name, id, options);
    }
}
