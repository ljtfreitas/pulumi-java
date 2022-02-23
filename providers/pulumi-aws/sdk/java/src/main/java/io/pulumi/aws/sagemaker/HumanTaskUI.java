// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.sagemaker.HumanTaskUIArgs;
import io.pulumi.aws.sagemaker.inputs.HumanTaskUIState;
import io.pulumi.aws.sagemaker.outputs.HumanTaskUIUiTemplate;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Sagemaker Human Task UI resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Sagemaker Human Task UIs can be imported using the `human_task_ui_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sagemaker/humanTaskUI:HumanTaskUI example example
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/humanTaskUI:HumanTaskUI")
public class HumanTaskUI extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Human Task UI.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this Human Task UI.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name of the Human Task UI.
     * 
     */
    @OutputExport(name="humanTaskUiName", type=String.class, parameters={})
    private Output<String> humanTaskUiName;

    /**
     * @return The name of the Human Task UI.
     * 
     */
    public Output<String> getHumanTaskUiName() {
        return this.humanTaskUiName;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The Liquid template for the worker user interface. See UI Template below.
     * 
     */
    @OutputExport(name="uiTemplate", type=HumanTaskUIUiTemplate.class, parameters={})
    private Output<HumanTaskUIUiTemplate> uiTemplate;

    /**
     * @return The Liquid template for the worker user interface. See UI Template below.
     * 
     */
    public Output<HumanTaskUIUiTemplate> getUiTemplate() {
        return this.uiTemplate;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HumanTaskUI(String name, HumanTaskUIArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/humanTaskUI:HumanTaskUI", name, args == null ? HumanTaskUIArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private HumanTaskUI(String name, Input<String> id, @Nullable HumanTaskUIState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/humanTaskUI:HumanTaskUI", name, state, makeResourceOptions(options, id));
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
    public static HumanTaskUI get(String name, Input<String> id, @Nullable HumanTaskUIState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HumanTaskUI(name, id, state, options);
    }
}
