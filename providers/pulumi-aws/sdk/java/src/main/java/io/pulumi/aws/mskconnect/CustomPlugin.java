// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mskconnect;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.mskconnect.CustomPluginArgs;
import io.pulumi.aws.mskconnect.inputs.CustomPluginState;
import io.pulumi.aws.mskconnect.outputs.CustomPluginLocation;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Amazon MSK Connect Custom Plugin Resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * MSK Connect Custom Plugin can be imported using the plugin's `arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:mskconnect/customPlugin:CustomPlugin example 'arn:aws:kafkaconnect:eu-central-1:123456789012:custom-plugin/debezium-example/abcdefgh-1234-5678-9abc-defghijklmno-4'
 * ```
 * 
 */
@ResourceType(type="aws:mskconnect/customPlugin:CustomPlugin")
public class CustomPlugin extends io.pulumi.resources.CustomResource {
    /**
     * the Amazon Resource Name (ARN) of the custom plugin.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return the Amazon Resource Name (ARN) of the custom plugin.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The type of the plugin file. Allowed values are `ZIP` and `JAR`.
     * 
     */
    @OutputExport(name="contentType", type=String.class, parameters={})
    private Output<String> contentType;

    /**
     * @return The type of the plugin file. Allowed values are `ZIP` and `JAR`.
     * 
     */
    public Output<String> getContentType() {
        return this.contentType;
    }
    /**
     * A summary description of the custom plugin.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A summary description of the custom plugin.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * an ID of the latest successfully created revision of the custom plugin.
     * 
     */
    @OutputExport(name="latestRevision", type=Integer.class, parameters={})
    private Output<Integer> latestRevision;

    /**
     * @return an ID of the latest successfully created revision of the custom plugin.
     * 
     */
    public Output<Integer> getLatestRevision() {
        return this.latestRevision;
    }
    /**
     * Information about the location of a custom plugin. See below.
     * 
     */
    @OutputExport(name="location", type=CustomPluginLocation.class, parameters={})
    private Output<CustomPluginLocation> location;

    /**
     * @return Information about the location of a custom plugin. See below.
     * 
     */
    public Output<CustomPluginLocation> getLocation() {
        return this.location;
    }
    /**
     * The name of the custom plugin..
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the custom plugin..
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * the state of the custom plugin.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return the state of the custom plugin.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomPlugin(String name, CustomPluginArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:mskconnect/customPlugin:CustomPlugin", name, args == null ? CustomPluginArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CustomPlugin(String name, Input<String> id, @Nullable CustomPluginState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:mskconnect/customPlugin:CustomPlugin", name, state, makeResourceOptions(options, id));
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
    public static CustomPlugin get(String name, Input<String> id, @Nullable CustomPluginState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CustomPlugin(name, id, state, options);
    }
}