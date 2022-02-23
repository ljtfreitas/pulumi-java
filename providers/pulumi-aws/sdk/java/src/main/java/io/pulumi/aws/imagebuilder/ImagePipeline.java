// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.imagebuilder.ImagePipelineArgs;
import io.pulumi.aws.imagebuilder.inputs.ImagePipelineState;
import io.pulumi.aws.imagebuilder.outputs.ImagePipelineImageTestsConfiguration;
import io.pulumi.aws.imagebuilder.outputs.ImagePipelineSchedule;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an Image Builder Image Pipeline.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_imagebuilder_image_pipeline` resources can be imported using the Amazon Resource Name (ARN), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:imagebuilder/imagePipeline:ImagePipeline example arn:aws:imagebuilder:us-east-1:123456789012:image-pipeline/example
 * ```
 * 
 */
@ResourceType(type="aws:imagebuilder/imagePipeline:ImagePipeline")
public class ImagePipeline extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the image pipeline.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the image pipeline.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Date the image pipeline was created.
     * 
     */
    @OutputExport(name="dateCreated", type=String.class, parameters={})
    private Output<String> dateCreated;

    /**
     * @return Date the image pipeline was created.
     * 
     */
    public Output<String> getDateCreated() {
        return this.dateCreated;
    }
    /**
     * Date the image pipeline was last run.
     * 
     */
    @OutputExport(name="dateLastRun", type=String.class, parameters={})
    private Output<String> dateLastRun;

    /**
     * @return Date the image pipeline was last run.
     * 
     */
    public Output<String> getDateLastRun() {
        return this.dateLastRun;
    }
    /**
     * Date the image pipeline will run next.
     * 
     */
    @OutputExport(name="dateNextRun", type=String.class, parameters={})
    private Output<String> dateNextRun;

    /**
     * @return Date the image pipeline will run next.
     * 
     */
    public Output<String> getDateNextRun() {
        return this.dateNextRun;
    }
    /**
     * Date the image pipeline was updated.
     * 
     */
    @OutputExport(name="dateUpdated", type=String.class, parameters={})
    private Output<String> dateUpdated;

    /**
     * @return Date the image pipeline was updated.
     * 
     */
    public Output<String> getDateUpdated() {
        return this.dateUpdated;
    }
    /**
     * Description of the image pipeline.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the image pipeline.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Amazon Resource Name (ARN) of the Image Builder Distribution Configuration.
     * 
     */
    @OutputExport(name="distributionConfigurationArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> distributionConfigurationArn;

    /**
     * @return Amazon Resource Name (ARN) of the Image Builder Distribution Configuration.
     * 
     */
    public Output</* @Nullable */ String> getDistributionConfigurationArn() {
        return this.distributionConfigurationArn;
    }
    /**
     * Whether additional information about the image being created is collected. Defaults to `true`.
     * 
     */
    @OutputExport(name="enhancedImageMetadataEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enhancedImageMetadataEnabled;

    /**
     * @return Whether additional information about the image being created is collected. Defaults to `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnhancedImageMetadataEnabled() {
        return this.enhancedImageMetadataEnabled;
    }
    /**
     * Amazon Resource Name (ARN) of the Image Builder Infrastructure Recipe.
     * 
     */
    @OutputExport(name="imageRecipeArn", type=String.class, parameters={})
    private Output<String> imageRecipeArn;

    /**
     * @return Amazon Resource Name (ARN) of the Image Builder Infrastructure Recipe.
     * 
     */
    public Output<String> getImageRecipeArn() {
        return this.imageRecipeArn;
    }
    /**
     * Configuration block with image tests configuration. Detailed below.
     * 
     */
    @OutputExport(name="imageTestsConfiguration", type=ImagePipelineImageTestsConfiguration.class, parameters={})
    private Output<ImagePipelineImageTestsConfiguration> imageTestsConfiguration;

    /**
     * @return Configuration block with image tests configuration. Detailed below.
     * 
     */
    public Output<ImagePipelineImageTestsConfiguration> getImageTestsConfiguration() {
        return this.imageTestsConfiguration;
    }
    /**
     * Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
     * 
     */
    @OutputExport(name="infrastructureConfigurationArn", type=String.class, parameters={})
    private Output<String> infrastructureConfigurationArn;

    /**
     * @return Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
     * 
     */
    public Output<String> getInfrastructureConfigurationArn() {
        return this.infrastructureConfigurationArn;
    }
    /**
     * Name of the image pipeline.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the image pipeline.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Platform of the image pipeline.
     * 
     */
    @OutputExport(name="platform", type=String.class, parameters={})
    private Output<String> platform;

    /**
     * @return Platform of the image pipeline.
     * 
     */
    public Output<String> getPlatform() {
        return this.platform;
    }
    /**
     * Configuration block with schedule settings. Detailed below.
     * 
     */
    @OutputExport(name="schedule", type=ImagePipelineSchedule.class, parameters={})
    private Output</* @Nullable */ ImagePipelineSchedule> schedule;

    /**
     * @return Configuration block with schedule settings. Detailed below.
     * 
     */
    public Output</* @Nullable */ ImagePipelineSchedule> getSchedule() {
        return this.schedule;
    }
    /**
     * Status of the image pipeline. Valid values are `DISABLED` and `ENABLED`. Defaults to `ENABLED`.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return Status of the image pipeline. Valid values are `DISABLED` and `ENABLED`. Defaults to `ENABLED`.
     * 
     */
    public Output</* @Nullable */ String> getStatus() {
        return this.status;
    }
    /**
     * Key-value map of resource tags for the image pipeline. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags for the image pipeline. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ImagePipeline(String name, ImagePipelineArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:imagebuilder/imagePipeline:ImagePipeline", name, args == null ? ImagePipelineArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ImagePipeline(String name, Input<String> id, @Nullable ImagePipelineState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:imagebuilder/imagePipeline:ImagePipeline", name, state, makeResourceOptions(options, id));
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
    public static ImagePipeline get(String name, Input<String> id, @Nullable ImagePipelineState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ImagePipeline(name, id, state, options);
    }
}
