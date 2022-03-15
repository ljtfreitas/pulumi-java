// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.DockerImagePlatformResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class to represent configuration settings for Docker Build
 * 
 */
public final class DockerBuildResponse extends io.pulumi.resources.InvokeArgs {

    public static final DockerBuildResponse Empty = new DockerBuildResponse();

    /**
     * Path to a snapshot of the Docker Context. This property is only valid if Dockerfile is specified.
     * The path is relative to the asset path which must contain a single Blob URI value.
     * <seealso href="https://docs.docker.com/engine/context/working-with-contexts/" />
     * 
     */
    @Import(name="context")
      private final @Nullable String context;

    public Optional<String> getContext() {
        return this.context == null ? Optional.empty() : Optional.ofNullable(this.context);
    }

    /**
     * Enum to determine docker specification type. Must be either Build or Image.
     * Expected value is 'Build'.
     * 
     */
    @Import(name="dockerSpecificationType", required=true)
      private final String dockerSpecificationType;

    public String getDockerSpecificationType() {
        return this.dockerSpecificationType;
    }

    /**
     * Docker command line instructions to assemble an image.
     * <seealso href="https://repo2docker.readthedocs.io/en/latest/config_files.html#dockerfile-advanced-environments" />
     * 
     */
    @Import(name="dockerfile", required=true)
      private final String dockerfile;

    public String getDockerfile() {
        return this.dockerfile;
    }

    /**
     * The platform information of the docker image.
     * 
     */
    @Import(name="platform")
      private final @Nullable DockerImagePlatformResponse platform;

    public Optional<DockerImagePlatformResponse> getPlatform() {
        return this.platform == null ? Optional.empty() : Optional.ofNullable(this.platform);
    }

    public DockerBuildResponse(
        @Nullable String context,
        String dockerSpecificationType,
        String dockerfile,
        @Nullable DockerImagePlatformResponse platform) {
        this.context = context;
        this.dockerSpecificationType = Objects.requireNonNull(dockerSpecificationType, "expected parameter 'dockerSpecificationType' to be non-null");
        this.dockerfile = Objects.requireNonNull(dockerfile, "expected parameter 'dockerfile' to be non-null");
        this.platform = platform;
    }

    private DockerBuildResponse() {
        this.context = null;
        this.dockerSpecificationType = null;
        this.dockerfile = null;
        this.platform = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DockerBuildResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String context;
        private String dockerSpecificationType;
        private String dockerfile;
        private @Nullable DockerImagePlatformResponse platform;

        public Builder() {
    	      // Empty
        }

        public Builder(DockerBuildResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.dockerSpecificationType = defaults.dockerSpecificationType;
    	      this.dockerfile = defaults.dockerfile;
    	      this.platform = defaults.platform;
        }

        public Builder context(@Nullable String context) {
            this.context = context;
            return this;
        }

        public Builder dockerSpecificationType(String dockerSpecificationType) {
            this.dockerSpecificationType = Objects.requireNonNull(dockerSpecificationType);
            return this;
        }

        public Builder dockerfile(String dockerfile) {
            this.dockerfile = Objects.requireNonNull(dockerfile);
            return this;
        }

        public Builder platform(@Nullable DockerImagePlatformResponse platform) {
            this.platform = platform;
            return this;
        }
        public DockerBuildResponse build() {
            return new DockerBuildResponse(context, dockerSpecificationType, dockerfile, platform);
        }
    }
}
