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
public final class DockerImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final DockerImageArgs Empty = new DockerImageArgs();

    /**
     * Image name of a custom base image.
     * <seealso href="https://docs.microsoft.com/en-us/azure/machine-learning/how-to-deploy-custom-docker-image#use-a-custom-base-image" />
     * 
     */
    @InputImport(name="dockerImageUri", required=true)
        private final Input<String> dockerImageUri;

    public Input<String> getDockerImageUri() {
        return this.dockerImageUri;
    }

    /**
     * Enum to determine docker specification type. Must be either Build or Image.
     * Expected value is 'Image'.
     * 
     */
    @InputImport(name="dockerSpecificationType", required=true)
        private final Input<String> dockerSpecificationType;

    public Input<String> getDockerSpecificationType() {
        return this.dockerSpecificationType;
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

    public DockerImageArgs(
        Input<String> dockerImageUri,
        Input<String> dockerSpecificationType,
        @Nullable Input<DockerImagePlatformArgs> platform) {
        this.dockerImageUri = Objects.requireNonNull(dockerImageUri, "expected parameter 'dockerImageUri' to be non-null");
        this.dockerSpecificationType = Objects.requireNonNull(dockerSpecificationType, "expected parameter 'dockerSpecificationType' to be non-null");
        this.platform = platform;
    }

    private DockerImageArgs() {
        this.dockerImageUri = Input.empty();
        this.dockerSpecificationType = Input.empty();
        this.platform = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DockerImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> dockerImageUri;
        private Input<String> dockerSpecificationType;
        private @Nullable Input<DockerImagePlatformArgs> platform;

        public Builder() {
    	      // Empty
        }

        public Builder(DockerImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dockerImageUri = defaults.dockerImageUri;
    	      this.dockerSpecificationType = defaults.dockerSpecificationType;
    	      this.platform = defaults.platform;
        }

        public Builder setDockerImageUri(Input<String> dockerImageUri) {
            this.dockerImageUri = Objects.requireNonNull(dockerImageUri);
            return this;
        }

        public Builder setDockerImageUri(String dockerImageUri) {
            this.dockerImageUri = Input.of(Objects.requireNonNull(dockerImageUri));
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

        public Builder setPlatform(@Nullable Input<DockerImagePlatformArgs> platform) {
            this.platform = platform;
            return this;
        }

        public Builder setPlatform(@Nullable DockerImagePlatformArgs platform) {
            this.platform = Input.ofNullable(platform);
            return this;
        }
        public DockerImageArgs build() {
            return new DockerImageArgs(dockerImageUri, dockerSpecificationType, platform);
        }
    }
}
