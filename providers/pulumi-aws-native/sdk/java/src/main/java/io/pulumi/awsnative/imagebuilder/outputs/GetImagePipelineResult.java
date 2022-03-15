// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.awsnative.imagebuilder.enums.ImagePipelineStatus;
import io.pulumi.awsnative.imagebuilder.outputs.ImagePipelineImageTestsConfiguration;
import io.pulumi.awsnative.imagebuilder.outputs.ImagePipelineSchedule;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagePipelineResult {
    /**
     * The Amazon Resource Name (ARN) of the image pipeline.
     * 
     */
    private final @Nullable String arn;
    /**
     * The Amazon Resource Name (ARN) of the container recipe that defines how images are configured and tested.
     * 
     */
    private final @Nullable String containerRecipeArn;
    /**
     * The description of the image pipeline.
     * 
     */
    private final @Nullable String description;
    /**
     * The Amazon Resource Name (ARN) of the distribution configuration associated with this image pipeline.
     * 
     */
    private final @Nullable String distributionConfigurationArn;
    /**
     * Collects additional information about the image being created, including the operating system (OS) version and package list.
     * 
     */
    private final @Nullable Boolean enhancedImageMetadataEnabled;
    /**
     * The Amazon Resource Name (ARN) of the image recipe that defines how images are configured, tested, and assessed.
     * 
     */
    private final @Nullable String imageRecipeArn;
    /**
     * The image tests configuration of the image pipeline.
     * 
     */
    private final @Nullable ImagePipelineImageTestsConfiguration imageTestsConfiguration;
    /**
     * The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image pipeline.
     * 
     */
    private final @Nullable String infrastructureConfigurationArn;
    /**
     * The schedule of the image pipeline.
     * 
     */
    private final @Nullable ImagePipelineSchedule schedule;
    /**
     * The status of the image pipeline.
     * 
     */
    private final @Nullable ImagePipelineStatus status;
    /**
     * The tags of this image pipeline.
     * 
     */
    private final @Nullable Object tags;

    @CustomType.Constructor
    private GetImagePipelineResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("containerRecipeArn") @Nullable String containerRecipeArn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("distributionConfigurationArn") @Nullable String distributionConfigurationArn,
        @CustomType.Parameter("enhancedImageMetadataEnabled") @Nullable Boolean enhancedImageMetadataEnabled,
        @CustomType.Parameter("imageRecipeArn") @Nullable String imageRecipeArn,
        @CustomType.Parameter("imageTestsConfiguration") @Nullable ImagePipelineImageTestsConfiguration imageTestsConfiguration,
        @CustomType.Parameter("infrastructureConfigurationArn") @Nullable String infrastructureConfigurationArn,
        @CustomType.Parameter("schedule") @Nullable ImagePipelineSchedule schedule,
        @CustomType.Parameter("status") @Nullable ImagePipelineStatus status,
        @CustomType.Parameter("tags") @Nullable Object tags) {
        this.arn = arn;
        this.containerRecipeArn = containerRecipeArn;
        this.description = description;
        this.distributionConfigurationArn = distributionConfigurationArn;
        this.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
        this.imageRecipeArn = imageRecipeArn;
        this.imageTestsConfiguration = imageTestsConfiguration;
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
        this.schedule = schedule;
        this.status = status;
        this.tags = tags;
    }

    /**
     * The Amazon Resource Name (ARN) of the image pipeline.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The Amazon Resource Name (ARN) of the container recipe that defines how images are configured and tested.
     * 
    */
    public Optional<String> getContainerRecipeArn() {
        return Optional.ofNullable(this.containerRecipeArn);
    }
    /**
     * The description of the image pipeline.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The Amazon Resource Name (ARN) of the distribution configuration associated with this image pipeline.
     * 
    */
    public Optional<String> getDistributionConfigurationArn() {
        return Optional.ofNullable(this.distributionConfigurationArn);
    }
    /**
     * Collects additional information about the image being created, including the operating system (OS) version and package list.
     * 
    */
    public Optional<Boolean> getEnhancedImageMetadataEnabled() {
        return Optional.ofNullable(this.enhancedImageMetadataEnabled);
    }
    /**
     * The Amazon Resource Name (ARN) of the image recipe that defines how images are configured, tested, and assessed.
     * 
    */
    public Optional<String> getImageRecipeArn() {
        return Optional.ofNullable(this.imageRecipeArn);
    }
    /**
     * The image tests configuration of the image pipeline.
     * 
    */
    public Optional<ImagePipelineImageTestsConfiguration> getImageTestsConfiguration() {
        return Optional.ofNullable(this.imageTestsConfiguration);
    }
    /**
     * The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image pipeline.
     * 
    */
    public Optional<String> getInfrastructureConfigurationArn() {
        return Optional.ofNullable(this.infrastructureConfigurationArn);
    }
    /**
     * The schedule of the image pipeline.
     * 
    */
    public Optional<ImagePipelineSchedule> getSchedule() {
        return Optional.ofNullable(this.schedule);
    }
    /**
     * The status of the image pipeline.
     * 
    */
    public Optional<ImagePipelineStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * The tags of this image pipeline.
     * 
    */
    public Optional<Object> getTags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagePipelineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String containerRecipeArn;
        private @Nullable String description;
        private @Nullable String distributionConfigurationArn;
        private @Nullable Boolean enhancedImageMetadataEnabled;
        private @Nullable String imageRecipeArn;
        private @Nullable ImagePipelineImageTestsConfiguration imageTestsConfiguration;
        private @Nullable String infrastructureConfigurationArn;
        private @Nullable ImagePipelineSchedule schedule;
        private @Nullable ImagePipelineStatus status;
        private @Nullable Object tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImagePipelineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.containerRecipeArn = defaults.containerRecipeArn;
    	      this.description = defaults.description;
    	      this.distributionConfigurationArn = defaults.distributionConfigurationArn;
    	      this.enhancedImageMetadataEnabled = defaults.enhancedImageMetadataEnabled;
    	      this.imageRecipeArn = defaults.imageRecipeArn;
    	      this.imageTestsConfiguration = defaults.imageTestsConfiguration;
    	      this.infrastructureConfigurationArn = defaults.infrastructureConfigurationArn;
    	      this.schedule = defaults.schedule;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder containerRecipeArn(@Nullable String containerRecipeArn) {
            this.containerRecipeArn = containerRecipeArn;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder distributionConfigurationArn(@Nullable String distributionConfigurationArn) {
            this.distributionConfigurationArn = distributionConfigurationArn;
            return this;
        }

        public Builder enhancedImageMetadataEnabled(@Nullable Boolean enhancedImageMetadataEnabled) {
            this.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
            return this;
        }

        public Builder imageRecipeArn(@Nullable String imageRecipeArn) {
            this.imageRecipeArn = imageRecipeArn;
            return this;
        }

        public Builder imageTestsConfiguration(@Nullable ImagePipelineImageTestsConfiguration imageTestsConfiguration) {
            this.imageTestsConfiguration = imageTestsConfiguration;
            return this;
        }

        public Builder infrastructureConfigurationArn(@Nullable String infrastructureConfigurationArn) {
            this.infrastructureConfigurationArn = infrastructureConfigurationArn;
            return this;
        }

        public Builder schedule(@Nullable ImagePipelineSchedule schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder status(@Nullable ImagePipelineStatus status) {
            this.status = status;
            return this;
        }

        public Builder tags(@Nullable Object tags) {
            this.tags = tags;
            return this;
        }
        public GetImagePipelineResult build() {
            return new GetImagePipelineResult(arn, containerRecipeArn, description, distributionConfigurationArn, enhancedImageMetadataEnabled, imageRecipeArn, imageTestsConfiguration, infrastructureConfigurationArn, schedule, status, tags);
        }
    }
}
