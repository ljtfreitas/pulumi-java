// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.evidently.ProjectArgs;
import io.pulumi.awsnative.evidently.outputs.ProjectDataDeliveryObject;
import io.pulumi.awsnative.evidently.outputs.ProjectTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Evidently::Project
 * 
 */
@ResourceType(type="aws-native:evidently:Project")
public class Project extends io.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @Export(name="dataDelivery", type=ProjectDataDeliveryObject.class, parameters={})
    private Output</* @Nullable */ ProjectDataDeliveryObject> dataDelivery;

    public Output</* @Nullable */ ProjectDataDeliveryObject> getDataDelivery() {
        return this.dataDelivery;
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ProjectTag.class})
    private Output</* @Nullable */ List<ProjectTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<ProjectTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ProjectArgs.Builder a);
    }
    private static io.pulumi.awsnative.evidently.ProjectArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.evidently.ProjectArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Project(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Project(String name) {
        this(name, ProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Project(String name, @Nullable ProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Project(String name, @Nullable ProjectArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:evidently:Project", name, args == null ? ProjectArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Project(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:evidently:Project", name, null, makeResourceOptions(options, id));
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
    public static Project get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Project(name, id, options);
    }
}
