// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr;

import io.pulumi.aws.ecr.inputs.RepositoryEncryptionConfigurationArgs;
import io.pulumi.aws.ecr.inputs.RepositoryImageScanningConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryArgs Empty = new RepositoryArgs();

    /**
     * Encryption configuration for the repository. See below for schema.
     * 
     */
    @Import(name="encryptionConfigurations")
      private final @Nullable Output<List<RepositoryEncryptionConfigurationArgs>> encryptionConfigurations;

    public Output<List<RepositoryEncryptionConfigurationArgs>> getEncryptionConfigurations() {
        return this.encryptionConfigurations == null ? Output.empty() : this.encryptionConfigurations;
    }

    /**
     * Configuration block that defines image scanning configuration for the repository. By default, image scanning must be manually triggered. See the [ECR User Guide](https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html) for more information about image scanning.
     * 
     */
    @Import(name="imageScanningConfiguration")
      private final @Nullable Output<RepositoryImageScanningConfigurationArgs> imageScanningConfiguration;

    public Output<RepositoryImageScanningConfigurationArgs> getImageScanningConfiguration() {
        return this.imageScanningConfiguration == null ? Output.empty() : this.imageScanningConfiguration;
    }

    /**
     * The tag mutability setting for the repository. Must be one of: `MUTABLE` or `IMMUTABLE`. Defaults to `MUTABLE`.
     * 
     */
    @Import(name="imageTagMutability")
      private final @Nullable Output<String> imageTagMutability;

    public Output<String> getImageTagMutability() {
        return this.imageTagMutability == null ? Output.empty() : this.imageTagMutability;
    }

    /**
     * Name of the repository.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public RepositoryArgs(
        @Nullable Output<List<RepositoryEncryptionConfigurationArgs>> encryptionConfigurations,
        @Nullable Output<RepositoryImageScanningConfigurationArgs> imageScanningConfiguration,
        @Nullable Output<String> imageTagMutability,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags) {
        this.encryptionConfigurations = encryptionConfigurations;
        this.imageScanningConfiguration = imageScanningConfiguration;
        this.imageTagMutability = imageTagMutability;
        this.name = name;
        this.tags = tags;
    }

    private RepositoryArgs() {
        this.encryptionConfigurations = Output.empty();
        this.imageScanningConfiguration = Output.empty();
        this.imageTagMutability = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<RepositoryEncryptionConfigurationArgs>> encryptionConfigurations;
        private @Nullable Output<RepositoryImageScanningConfigurationArgs> imageScanningConfiguration;
        private @Nullable Output<String> imageTagMutability;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionConfigurations = defaults.encryptionConfigurations;
    	      this.imageScanningConfiguration = defaults.imageScanningConfiguration;
    	      this.imageTagMutability = defaults.imageTagMutability;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder encryptionConfigurations(@Nullable Output<List<RepositoryEncryptionConfigurationArgs>> encryptionConfigurations) {
            this.encryptionConfigurations = encryptionConfigurations;
            return this;
        }

        public Builder encryptionConfigurations(@Nullable List<RepositoryEncryptionConfigurationArgs> encryptionConfigurations) {
            this.encryptionConfigurations = Output.ofNullable(encryptionConfigurations);
            return this;
        }

        public Builder imageScanningConfiguration(@Nullable Output<RepositoryImageScanningConfigurationArgs> imageScanningConfiguration) {
            this.imageScanningConfiguration = imageScanningConfiguration;
            return this;
        }

        public Builder imageScanningConfiguration(@Nullable RepositoryImageScanningConfigurationArgs imageScanningConfiguration) {
            this.imageScanningConfiguration = Output.ofNullable(imageScanningConfiguration);
            return this;
        }

        public Builder imageTagMutability(@Nullable Output<String> imageTagMutability) {
            this.imageTagMutability = imageTagMutability;
            return this;
        }

        public Builder imageTagMutability(@Nullable String imageTagMutability) {
            this.imageTagMutability = Output.ofNullable(imageTagMutability);
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

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public RepositoryArgs build() {
            return new RepositoryArgs(encryptionConfigurations, imageScanningConfiguration, imageTagMutability, name, tags);
        }
    }
}
