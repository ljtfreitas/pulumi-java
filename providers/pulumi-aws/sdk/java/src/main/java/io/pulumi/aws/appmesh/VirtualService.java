// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.appmesh.VirtualServiceArgs;
import io.pulumi.aws.appmesh.inputs.VirtualServiceState;
import io.pulumi.aws.appmesh.outputs.VirtualServiceSpec;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AWS App Mesh virtual service resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * App Mesh virtual services can be imported using `mesh_name` together with the virtual service's `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appmesh/virtualService:VirtualService servicea simpleapp/servicea.simpleapp.local
 * ```
 * 
 *  [1]/docs/providers/aws/index.html
 * 
 */
@ResourceType(type="aws:appmesh/virtualService:VirtualService")
public class VirtualService extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the virtual service.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the virtual service.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The creation date of the virtual service.
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The creation date of the virtual service.
     * 
     */
    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The last update date of the virtual service.
     * 
     */
    @Export(name="lastUpdatedDate", type=String.class, parameters={})
    private Output<String> lastUpdatedDate;

    /**
     * @return The last update date of the virtual service.
     * 
     */
    public Output<String> getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    /**
     * The name of the service mesh in which to create the virtual service. Must be between 1 and 255 characters in length.
     * 
     */
    @Export(name="meshName", type=String.class, parameters={})
    private Output<String> meshName;

    /**
     * @return The name of the service mesh in which to create the virtual service. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> getMeshName() {
        return this.meshName;
    }
    /**
     * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
     * 
     */
    @Export(name="meshOwner", type=String.class, parameters={})
    private Output<String> meshOwner;

    /**
     * @return The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
     * 
     */
    public Output<String> getMeshOwner() {
        return this.meshOwner;
    }
    /**
     * The name to use for the virtual service. Must be between 1 and 255 characters in length.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name to use for the virtual service. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The resource owner's AWS account ID.
     * 
     */
    @Export(name="resourceOwner", type=String.class, parameters={})
    private Output<String> resourceOwner;

    /**
     * @return The resource owner's AWS account ID.
     * 
     */
    public Output<String> getResourceOwner() {
        return this.resourceOwner;
    }
    /**
     * The virtual service specification to apply.
     * 
     */
    @Export(name="spec", type=VirtualServiceSpec.class, parameters={})
    private Output<VirtualServiceSpec> spec;

    /**
     * @return The virtual service specification to apply.
     * 
     */
    public Output<VirtualServiceSpec> getSpec() {
        return this.spec;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(VirtualServiceArgs.Builder a);
    }
    private static io.pulumi.aws.appmesh.VirtualServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.appmesh.VirtualServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VirtualService(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualService(String name) {
        this(name, VirtualServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualService(String name, VirtualServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualService(String name, VirtualServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appmesh/virtualService:VirtualService", name, args == null ? VirtualServiceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VirtualService(String name, Output<String> id, @Nullable VirtualServiceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appmesh/virtualService:VirtualService", name, state, makeResourceOptions(options, id));
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
    public static VirtualService get(String name, Output<String> id, @Nullable VirtualServiceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualService(name, id, state, options);
    }
}
