// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder;

import io.pulumi.aws.imagebuilder.inputs.ImagePipelineImageTestsConfigurationArgs;
import io.pulumi.aws.imagebuilder.inputs.ImagePipelineScheduleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImagePipelineArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImagePipelineArgs Empty = new ImagePipelineArgs();

    /**
     * Description of the image pipeline.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Amazon Resource Name (ARN) of the Image Builder Distribution Configuration.
     * 
     */
    @Import(name="distributionConfigurationArn")
      private final @Nullable Output<String> distributionConfigurationArn;

    public Output<String> getDistributionConfigurationArn() {
        return this.distributionConfigurationArn == null ? Output.empty() : this.distributionConfigurationArn;
    }

    /**
     * Whether additional information about the image being created is collected. Defaults to `true`.
     * 
     */
    @Import(name="enhancedImageMetadataEnabled")
      private final @Nullable Output<Boolean> enhancedImageMetadataEnabled;

    public Output<Boolean> getEnhancedImageMetadataEnabled() {
        return this.enhancedImageMetadataEnabled == null ? Output.empty() : this.enhancedImageMetadataEnabled;
    }

    /**
     * Amazon Resource Name (ARN) of the Image Builder Infrastructure Recipe.
     * 
     */
    @Import(name="imageRecipeArn", required=true)
      private final Output<String> imageRecipeArn;

    public Output<String> getImageRecipeArn() {
        return this.imageRecipeArn;
    }

    /**
     * Configuration block with image tests configuration. Detailed below.
     * 
     */
    @Import(name="imageTestsConfiguration")
      private final @Nullable Output<ImagePipelineImageTestsConfigurationArgs> imageTestsConfiguration;

    public Output<ImagePipelineImageTestsConfigurationArgs> getImageTestsConfiguration() {
        return this.imageTestsConfiguration == null ? Output.empty() : this.imageTestsConfiguration;
    }

    /**
     * Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
     * 
     */
    @Import(name="infrastructureConfigurationArn", required=true)
      private final Output<String> infrastructureConfigurationArn;

    public Output<String> getInfrastructureConfigurationArn() {
        return this.infrastructureConfigurationArn;
    }

    /**
     * Name of the image pipeline.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Configuration block with schedule settings. Detailed below.
     * 
     */
    @Import(name="schedule")
      private final @Nullable Output<ImagePipelineScheduleArgs> schedule;

    public Output<ImagePipelineScheduleArgs> getSchedule() {
        return this.schedule == null ? Output.empty() : this.schedule;
    }

    /**
     * Status of the image pipeline. Valid values are `DISABLED` and `ENABLED`. Defaults to `ENABLED`.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * Key-value map of resource tags for the image pipeline. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ImagePipelineArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> distributionConfigurationArn,
        @Nullable Output<Boolean> enhancedImageMetadataEnabled,
        Output<String> imageRecipeArn,
        @Nullable Output<ImagePipelineImageTestsConfigurationArgs> imageTestsConfiguration,
        Output<String> infrastructureConfigurationArn,
        @Nullable Output<String> name,
        @Nullable Output<ImagePipelineScheduleArgs> schedule,
        @Nullable Output<String> status,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description;
        this.distributionConfigurationArn = distributionConfigurationArn;
        this.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
        this.imageRecipeArn = Objects.requireNonNull(imageRecipeArn, "expected parameter 'imageRecipeArn' to be non-null");
        this.imageTestsConfiguration = imageTestsConfiguration;
        this.infrastructureConfigurationArn = Objects.requireNonNull(infrastructureConfigurationArn, "expected parameter 'infrastructureConfigurationArn' to be non-null");
        this.name = name;
        this.schedule = schedule;
        this.status = status;
        this.tags = tags;
    }

    private ImagePipelineArgs() {
        this.description = Output.empty();
        this.distributionConfigurationArn = Output.empty();
        this.enhancedImageMetadataEnabled = Output.empty();
        this.imageRecipeArn = Output.empty();
        this.imageTestsConfiguration = Output.empty();
        this.infrastructureConfigurationArn = Output.empty();
        this.name = Output.empty();
        this.schedule = Output.empty();
        this.status = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImagePipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> distributionConfigurationArn;
        private @Nullable Output<Boolean> enhancedImageMetadataEnabled;
        private Output<String> imageRecipeArn;
        private @Nullable Output<ImagePipelineImageTestsConfigurationArgs> imageTestsConfiguration;
        private Output<String> infrastructureConfigurationArn;
        private @Nullable Output<String> name;
        private @Nullable Output<ImagePipelineScheduleArgs> schedule;
        private @Nullable Output<String> status;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ImagePipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.distributionConfigurationArn = defaults.distributionConfigurationArn;
    	      this.enhancedImageMetadataEnabled = defaults.enhancedImageMetadataEnabled;
    	      this.imageRecipeArn = defaults.imageRecipeArn;
    	      this.imageTestsConfiguration = defaults.imageTestsConfiguration;
    	      this.infrastructureConfigurationArn = defaults.infrastructureConfigurationArn;
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder distributionConfigurationArn(@Nullable Output<String> distributionConfigurationArn) {
            this.distributionConfigurationArn = distributionConfigurationArn;
            return this;
        }

        public Builder distributionConfigurationArn(@Nullable String distributionConfigurationArn) {
            this.distributionConfigurationArn = Output.ofNullable(distributionConfigurationArn);
            return this;
        }

        public Builder enhancedImageMetadataEnabled(@Nullable Output<Boolean> enhancedImageMetadataEnabled) {
            this.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
            return this;
        }

        public Builder enhancedImageMetadataEnabled(@Nullable Boolean enhancedImageMetadataEnabled) {
            this.enhancedImageMetadataEnabled = Output.ofNullable(enhancedImageMetadataEnabled);
            return this;
        }

        public Builder imageRecipeArn(Output<String> imageRecipeArn) {
            this.imageRecipeArn = Objects.requireNonNull(imageRecipeArn);
            return this;
        }

        public Builder imageRecipeArn(String imageRecipeArn) {
            this.imageRecipeArn = Output.of(Objects.requireNonNull(imageRecipeArn));
            return this;
        }

        public Builder imageTestsConfiguration(@Nullable Output<ImagePipelineImageTestsConfigurationArgs> imageTestsConfiguration) {
            this.imageTestsConfiguration = imageTestsConfiguration;
            return this;
        }

        public Builder imageTestsConfiguration(@Nullable ImagePipelineImageTestsConfigurationArgs imageTestsConfiguration) {
            this.imageTestsConfiguration = Output.ofNullable(imageTestsConfiguration);
            return this;
        }

        public Builder infrastructureConfigurationArn(Output<String> infrastructureConfigurationArn) {
            this.infrastructureConfigurationArn = Objects.requireNonNull(infrastructureConfigurationArn);
            return this;
        }

        public Builder infrastructureConfigurationArn(String infrastructureConfigurationArn) {
            this.infrastructureConfigurationArn = Output.of(Objects.requireNonNull(infrastructureConfigurationArn));
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder schedule(@Nullable Output<ImagePipelineScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder schedule(@Nullable ImagePipelineScheduleArgs schedule) {
            this.schedule = Output.ofNullable(schedule);
            return this;
        }

        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public ImagePipelineArgs build() {
            return new ImagePipelineArgs(description, distributionConfigurationArn, enhancedImageMetadataEnabled, imageRecipeArn, imageTestsConfiguration, infrastructureConfigurationArn, name, schedule, status, tags);
        }
    }
}
