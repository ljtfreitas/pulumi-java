// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.DockerImagePlatformArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Class to represent configuration settings for Docker Build
 * 
 */
public final class DockerBuildArgs extends io.pulumi.resources.ResourceArgs {

    public static final DockerBuildArgs Empty = new DockerBuildArgs();

    /**
     * Path to a snapshot of the Docker Context. This property is only valid if Dockerfile is specified.
     * The path is relative to the asset path which must contain a single Blob URI value.
     * <seealso href="https://docs.docker.com/engine/context/working-with-contexts/" />
     * 
     */
    @InputImport(name="context")
    private final @Nullable Input<String> context;

    public Input<String> getContext() {
        return this.context == null ? Input.empty() : this.context;
    }

    /**
     * Enum to determine docker specification type. Must be either Build or Image.
     * Expected value is 'Build'.
     * 
     */
    @InputImport(name="dockerSpecificationType", required=true)
    private final Input<String> dockerSpecificationType;

    public Input<String> getDockerSpecificationType() {
        return this.dockerSpecificationType;
    }

    /**
     * Docker command line instructions to assemble an image.
     * <seealso href="https://repo2docker.readthedocs.io/en/latest/config_files.html#dockerfile-advanced-environments" />
     * 
     */
    @InputImport(name="dockerfile", required=true)
    private final Input<String> dockerfile;

    public Input<String> getDockerfile() {
        return this.dockerfile;
    }

    /**
     * The platform information of the docker image.
     * 
     */
    @InputImport(name="platform")
    private final @Nullable Input<DockerImagePlatformArgs> platform;

    public Input<DockerImagePlatformArgs> getPlatform() {
        return this.platform == null ? Input.empty() : this.platform;
    }

    public DockerBuildArgs(
        @Nullable Input<String> context,
        Input<String> dockerSpecificationType,
        Input<String> dockerfile,
        @Nullable Input<DockerImagePlatformArgs> platform) {
        this.context = context;
        this.dockerSpecificationType = Objects.requireNonNull(dockerSpecificationType, "expected parameter 'dockerSpecificationType' to be non-null");
        this.dockerfile = Objects.requireNonNull(dockerfile, "expected parameter 'dockerfile' to be non-null");
        this.platform = platform;
    }

    private DockerBuildArgs() {
        this.context = Input.empty();
        this.dockerSpecificationType = Input.empty();
        this.dockerfile = Input.empty();
        this.platform = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DockerBuildArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> context;
        private Input<String> dockerSpecificationType;
        private Input<String> dockerfile;
        private @Nullable Input<DockerImagePlatformArgs> platform;

        public Builder() {
    	      // Empty
        }

        public Builder(DockerBuildArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.dockerSpecificationType = defaults.dockerSpecificationType;
    	      this.dockerfile = defaults.dockerfile;
    	      this.platform = defaults.platform;
        }

        public Builder setContext(@Nullable Input<String> context) {
            this.context = context;
            return this;
        }

        public Builder setContext(@Nullable String context) {
            this.context = Input.ofNullable(context);
            return this;
        }

        public Builder setDockerSpecificationType(Input<String> dockerSpecificationType) {
            this.dockerSpecificationType = Objects.requireNonNull(dockerSpecificationType);
            return this;
        }

        public Builder setDockerSpecificationType(String dockerSpecificationType) {
            this.dockerSpecificationType = Input.of(Objects.requireNonNull(dockerSpecificationType));
            return this;
        }

        public Builder setDockerfile(Input<String> dockerfile) {
            this.dockerfile = Objects.requireNonNull(dockerfile);
            return this;
        }

        public Builder setDockerfile(String dockerfile) {
            this.dockerfile = Input.of(Objects.requireNonNull(dockerfile));
            return this;
        }

        public Builder setPlatform(@Nullable Input<DockerImagePlatformArgs> platform) {
            this.platform = platform;
            return this;
        }

        public Builder setPlatform(@Nullable DockerImagePlatformArgs platform) {
            this.platform = Input.ofNullable(platform);
            return this;
        }

        public DockerBuildArgs build() {
            return new DockerBuildArgs(context, dockerSpecificationType, dockerfile, platform);
        }
    }
}
