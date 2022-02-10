// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.ModelDockerSectionBaseImageRegistryArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModelEnvironmentDefinitionDockerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelEnvironmentDefinitionDockerArgs Empty = new ModelEnvironmentDefinitionDockerArgs();

    @InputImport(name="baseDockerfile")
    private final @Nullable Input<String> baseDockerfile;

    public Input<String> getBaseDockerfile() {
        return this.baseDockerfile == null ? Input.empty() : this.baseDockerfile;
    }

    @InputImport(name="baseImage")
    private final @Nullable Input<String> baseImage;

    public Input<String> getBaseImage() {
        return this.baseImage == null ? Input.empty() : this.baseImage;
    }

    @InputImport(name="baseImageRegistry")
    private final @Nullable Input<ModelDockerSectionBaseImageRegistryArgs> baseImageRegistry;

    public Input<ModelDockerSectionBaseImageRegistryArgs> getBaseImageRegistry() {
        return this.baseImageRegistry == null ? Input.empty() : this.baseImageRegistry;
    }

    public ModelEnvironmentDefinitionDockerArgs(
        @Nullable Input<String> baseDockerfile,
        @Nullable Input<String> baseImage,
        @Nullable Input<ModelDockerSectionBaseImageRegistryArgs> baseImageRegistry) {
        this.baseDockerfile = baseDockerfile;
        this.baseImage = baseImage;
        this.baseImageRegistry = baseImageRegistry;
    }

    private ModelEnvironmentDefinitionDockerArgs() {
        this.baseDockerfile = Input.empty();
        this.baseImage = Input.empty();
        this.baseImageRegistry = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelEnvironmentDefinitionDockerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> baseDockerfile;
        private @Nullable Input<String> baseImage;
        private @Nullable Input<ModelDockerSectionBaseImageRegistryArgs> baseImageRegistry;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelEnvironmentDefinitionDockerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseDockerfile = defaults.baseDockerfile;
    	      this.baseImage = defaults.baseImage;
    	      this.baseImageRegistry = defaults.baseImageRegistry;
        }

        public Builder setBaseDockerfile(@Nullable Input<String> baseDockerfile) {
            this.baseDockerfile = baseDockerfile;
            return this;
        }

        public Builder setBaseDockerfile(@Nullable String baseDockerfile) {
            this.baseDockerfile = Input.ofNullable(baseDockerfile);
            return this;
        }

        public Builder setBaseImage(@Nullable Input<String> baseImage) {
            this.baseImage = baseImage;
            return this;
        }

        public Builder setBaseImage(@Nullable String baseImage) {
            this.baseImage = Input.ofNullable(baseImage);
            return this;
        }

        public Builder setBaseImageRegistry(@Nullable Input<ModelDockerSectionBaseImageRegistryArgs> baseImageRegistry) {
            this.baseImageRegistry = baseImageRegistry;
            return this;
        }

        public Builder setBaseImageRegistry(@Nullable ModelDockerSectionBaseImageRegistryArgs baseImageRegistry) {
            this.baseImageRegistry = Input.ofNullable(baseImageRegistry);
            return this;
        }

        public ModelEnvironmentDefinitionDockerArgs build() {
            return new ModelEnvironmentDefinitionDockerArgs(baseDockerfile, baseImage, baseImageRegistry);
        }
    }
}