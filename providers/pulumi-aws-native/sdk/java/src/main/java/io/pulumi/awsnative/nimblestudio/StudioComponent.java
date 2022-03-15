// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.nimblestudio.StudioComponentArgs;
import io.pulumi.awsnative.nimblestudio.enums.StudioComponentSubtype;
import io.pulumi.awsnative.nimblestudio.enums.StudioComponentType;
import io.pulumi.awsnative.nimblestudio.outputs.StudioComponentConfiguration;
import io.pulumi.awsnative.nimblestudio.outputs.StudioComponentInitializationScript;
import io.pulumi.awsnative.nimblestudio.outputs.StudioComponentScriptParameterKeyValue;
import io.pulumi.awsnative.nimblestudio.outputs.StudioComponentTags;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a studio component which connects a non-Nimble Studio resource in your account to your studio
 * 
 */
@ResourceType(type="aws-native:nimblestudio:StudioComponent")
public class StudioComponent extends io.pulumi.resources.CustomResource {
    @Export(name="configuration", type=StudioComponentConfiguration.class, parameters={})
    private Output</* @Nullable */ StudioComponentConfiguration> configuration;

    public Output</* @Nullable */ StudioComponentConfiguration> getConfiguration() {
        return this.configuration;
    }
    /**
     * <p>The description.</p>
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return <p>The description.</p>
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * <p>The EC2 security groups that control access to the studio component.</p>
     * 
     */
    @Export(name="ec2SecurityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> ec2SecurityGroupIds;

    /**
     * @return <p>The EC2 security groups that control access to the studio component.</p>
     * 
     */
    public Output</* @Nullable */ List<String>> getEc2SecurityGroupIds() {
        return this.ec2SecurityGroupIds;
    }
    /**
     * <p>Initialization scripts for studio components.</p>
     * 
     */
    @Export(name="initializationScripts", type=List.class, parameters={StudioComponentInitializationScript.class})
    private Output</* @Nullable */ List<StudioComponentInitializationScript>> initializationScripts;

    /**
     * @return <p>Initialization scripts for studio components.</p>
     * 
     */
    public Output</* @Nullable */ List<StudioComponentInitializationScript>> getInitializationScripts() {
        return this.initializationScripts;
    }
    /**
     * <p>The name for the studio component.</p>
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return <p>The name for the studio component.</p>
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * <p>Parameters for the studio component scripts.</p>
     * 
     */
    @Export(name="scriptParameters", type=List.class, parameters={StudioComponentScriptParameterKeyValue.class})
    private Output</* @Nullable */ List<StudioComponentScriptParameterKeyValue>> scriptParameters;

    /**
     * @return <p>Parameters for the studio component scripts.</p>
     * 
     */
    public Output</* @Nullable */ List<StudioComponentScriptParameterKeyValue>> getScriptParameters() {
        return this.scriptParameters;
    }
    @Export(name="studioComponentId", type=String.class, parameters={})
    private Output<String> studioComponentId;

    public Output<String> getStudioComponentId() {
        return this.studioComponentId;
    }
    /**
     * <p>The studioId. </p>
     * 
     */
    @Export(name="studioId", type=String.class, parameters={})
    private Output<String> studioId;

    /**
     * @return <p>The studioId. </p>
     * 
     */
    public Output<String> getStudioId() {
        return this.studioId;
    }
    @Export(name="subtype", type=StudioComponentSubtype.class, parameters={})
    private Output</* @Nullable */ StudioComponentSubtype> subtype;

    public Output</* @Nullable */ StudioComponentSubtype> getSubtype() {
        return this.subtype;
    }
    @Export(name="tags", type=StudioComponentTags.class, parameters={})
    private Output</* @Nullable */ StudioComponentTags> tags;

    public Output</* @Nullable */ StudioComponentTags> getTags() {
        return this.tags;
    }
    @Export(name="type", type=StudioComponentType.class, parameters={})
    private Output<StudioComponentType> type;

    public Output<StudioComponentType> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(StudioComponentArgs.Builder a);
    }
    private static io.pulumi.awsnative.nimblestudio.StudioComponentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.nimblestudio.StudioComponentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public StudioComponent(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StudioComponent(String name) {
        this(name, StudioComponentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StudioComponent(String name, StudioComponentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StudioComponent(String name, StudioComponentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:nimblestudio:StudioComponent", name, args == null ? StudioComponentArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private StudioComponent(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:nimblestudio:StudioComponent", name, null, makeResourceOptions(options, id));
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
    public static StudioComponent get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StudioComponent(name, id, options);
    }
}
