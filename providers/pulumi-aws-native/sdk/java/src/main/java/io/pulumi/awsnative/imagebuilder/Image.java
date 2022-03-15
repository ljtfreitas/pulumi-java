// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.imagebuilder.ImageArgs;
import io.pulumi.awsnative.imagebuilder.outputs.ImageTestsConfiguration;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::ImageBuilder::Image
 * 
 */
@ResourceType(type="aws-native:imagebuilder:Image")
public class Image extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the image.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the image.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The Amazon Resource Name (ARN) of the container recipe that defines how images are configured and tested.
     * 
     */
    @Export(name="containerRecipeArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> containerRecipeArn;

    /**
     * @return The Amazon Resource Name (ARN) of the container recipe that defines how images are configured and tested.
     * 
     */
    public Output</* @Nullable */ String> getContainerRecipeArn() {
        return this.containerRecipeArn;
    }
    /**
     * The Amazon Resource Name (ARN) of the distribution configuration.
     * 
     */
    @Export(name="distributionConfigurationArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> distributionConfigurationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the distribution configuration.
     * 
     */
    public Output</* @Nullable */ String> getDistributionConfigurationArn() {
        return this.distributionConfigurationArn;
    }
    /**
     * Collects additional information about the image being created, including the operating system (OS) version and package list.
     * 
     */
    @Export(name="enhancedImageMetadataEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enhancedImageMetadataEnabled;

    /**
     * @return Collects additional information about the image being created, including the operating system (OS) version and package list.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnhancedImageMetadataEnabled() {
        return this.enhancedImageMetadataEnabled;
    }
    /**
     * The AMI ID of the EC2 AMI in current region.
     * 
     */
    @Export(name="imageId", type=String.class, parameters={})
    private Output<String> imageId;

    /**
     * @return The AMI ID of the EC2 AMI in current region.
     * 
     */
    public Output<String> getImageId() {
        return this.imageId;
    }
    /**
     * The Amazon Resource Name (ARN) of the image recipe that defines how images are configured, tested, and assessed.
     * 
     */
    @Export(name="imageRecipeArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> imageRecipeArn;

    /**
     * @return The Amazon Resource Name (ARN) of the image recipe that defines how images are configured, tested, and assessed.
     * 
     */
    public Output</* @Nullable */ String> getImageRecipeArn() {
        return this.imageRecipeArn;
    }
    /**
     * The image tests configuration used when creating this image.
     * 
     */
    @Export(name="imageTestsConfiguration", type=ImageTestsConfiguration.class, parameters={})
    private Output</* @Nullable */ ImageTestsConfiguration> imageTestsConfiguration;

    /**
     * @return The image tests configuration used when creating this image.
     * 
     */
    public Output</* @Nullable */ ImageTestsConfiguration> getImageTestsConfiguration() {
        return this.imageTestsConfiguration;
    }
    /**
     * The Amazon Resource Name (ARN) of the infrastructure configuration.
     * 
     */
    @Export(name="infrastructureConfigurationArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> infrastructureConfigurationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the infrastructure configuration.
     * 
     */
    public Output</* @Nullable */ String> getInfrastructureConfigurationArn() {
        return this.infrastructureConfigurationArn;
    }
    /**
     * The name of the image.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the image.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The tags associated with the image.
     * 
     */
    @Export(name="tags", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> tags;

    /**
     * @return The tags associated with the image.
     * 
     */
    public Output</* @Nullable */ Object> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ImageArgs.Builder a);
    }
    private static io.pulumi.awsnative.imagebuilder.ImageArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.imagebuilder.ImageArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Image(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Image(String name) {
        this(name, ImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Image(String name, @Nullable ImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Image(String name, @Nullable ImageArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:imagebuilder:Image", name, args == null ? ImageArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Image(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:imagebuilder:Image", name, null, makeResourceOptions(options, id));
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
    public static Image get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Image(name, id, options);
    }
}
