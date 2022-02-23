// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.outputs;

import io.pulumi.aws.codebuild.outputs.ProjectEnvironmentEnvironmentVariable;
import io.pulumi.aws.codebuild.outputs.ProjectEnvironmentRegistryCredential;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProjectEnvironment {
    /**
     * ARN of the S3 bucket, path prefix and object key that contains the PEM-encoded certificate.
     * 
     */
    private final @Nullable String certificate;
    /**
     * Information about the compute resources the build project will use. Valid values: `BUILD_GENERAL1_SMALL`, `BUILD_GENERAL1_MEDIUM`, `BUILD_GENERAL1_LARGE`, `BUILD_GENERAL1_2XLARGE`. `BUILD_GENERAL1_SMALL` is only valid if `type` is set to `LINUX_CONTAINER`. When `type` is set to `LINUX_GPU_CONTAINER`, `compute_type` must be `BUILD_GENERAL1_LARGE`.
     * 
     */
    private final String computeType;
    /**
     * Configuration block. Detailed below.
     * 
     */
    private final @Nullable List<ProjectEnvironmentEnvironmentVariable> environmentVariables;
    /**
     * Docker image to use for this build project. Valid values include [Docker images provided by CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html) (e.g `aws/codebuild/standard:2.0`), [Docker Hub images](https://hub.docker.com/) (e.g., `nginx/nginx:latest`), and full Docker repository URIs such as those for ECR (e.g., `137112412989.dkr.ecr.us-west-2.amazonaws.com/amazonlinux:latest`).
     * 
     */
    private final String image;
    /**
     * Type of credentials AWS CodeBuild uses to pull images in your build. Valid values: `CODEBUILD`, `SERVICE_ROLE`. When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image, you must use CodeBuild credentials. Defaults to `CODEBUILD`.
     * 
     */
    private final @Nullable String imagePullCredentialsType;
    /**
     * Whether to enable running the Docker daemon inside a Docker container. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean privilegedMode;
    /**
     * Configuration block. Detailed below.
     * 
     */
    private final @Nullable ProjectEnvironmentRegistryCredential registryCredential;
    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"certificate","computeType","environmentVariables","image","imagePullCredentialsType","privilegedMode","registryCredential","type"})
    private ProjectEnvironment(
        @Nullable String certificate,
        String computeType,
        @Nullable List<ProjectEnvironmentEnvironmentVariable> environmentVariables,
        String image,
        @Nullable String imagePullCredentialsType,
        @Nullable Boolean privilegedMode,
        @Nullable ProjectEnvironmentRegistryCredential registryCredential,
        String type) {
        this.certificate = certificate;
        this.computeType = Objects.requireNonNull(computeType);
        this.environmentVariables = environmentVariables;
        this.image = Objects.requireNonNull(image);
        this.imagePullCredentialsType = imagePullCredentialsType;
        this.privilegedMode = privilegedMode;
        this.registryCredential = registryCredential;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * ARN of the S3 bucket, path prefix and object key that contains the PEM-encoded certificate.
     * 
     */
    public Optional<String> getCertificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * Information about the compute resources the build project will use. Valid values: `BUILD_GENERAL1_SMALL`, `BUILD_GENERAL1_MEDIUM`, `BUILD_GENERAL1_LARGE`, `BUILD_GENERAL1_2XLARGE`. `BUILD_GENERAL1_SMALL` is only valid if `type` is set to `LINUX_CONTAINER`. When `type` is set to `LINUX_GPU_CONTAINER`, `compute_type` must be `BUILD_GENERAL1_LARGE`.
     * 
     */
    public String getComputeType() {
        return this.computeType;
    }
    /**
     * Configuration block. Detailed below.
     * 
     */
    public List<ProjectEnvironmentEnvironmentVariable> getEnvironmentVariables() {
        return this.environmentVariables == null ? List.of() : this.environmentVariables;
    }
    /**
     * Docker image to use for this build project. Valid values include [Docker images provided by CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html) (e.g `aws/codebuild/standard:2.0`), [Docker Hub images](https://hub.docker.com/) (e.g., `nginx/nginx:latest`), and full Docker repository URIs such as those for ECR (e.g., `137112412989.dkr.ecr.us-west-2.amazonaws.com/amazonlinux:latest`).
     * 
     */
    public String getImage() {
        return this.image;
    }
    /**
     * Type of credentials AWS CodeBuild uses to pull images in your build. Valid values: `CODEBUILD`, `SERVICE_ROLE`. When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image, you must use CodeBuild credentials. Defaults to `CODEBUILD`.
     * 
     */
    public Optional<String> getImagePullCredentialsType() {
        return Optional.ofNullable(this.imagePullCredentialsType);
    }
    /**
     * Whether to enable running the Docker daemon inside a Docker container. Defaults to `false`.
     * 
     */
    public Optional<Boolean> getPrivilegedMode() {
        return Optional.ofNullable(this.privilegedMode);
    }
    /**
     * Configuration block. Detailed below.
     * 
     */
    public Optional<ProjectEnvironmentRegistryCredential> getRegistryCredential() {
        return Optional.ofNullable(this.registryCredential);
    }
    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectEnvironment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificate;
        private String computeType;
        private @Nullable List<ProjectEnvironmentEnvironmentVariable> environmentVariables;
        private String image;
        private @Nullable String imagePullCredentialsType;
        private @Nullable Boolean privilegedMode;
        private @Nullable ProjectEnvironmentRegistryCredential registryCredential;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.computeType = defaults.computeType;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.image = defaults.image;
    	      this.imagePullCredentialsType = defaults.imagePullCredentialsType;
    	      this.privilegedMode = defaults.privilegedMode;
    	      this.registryCredential = defaults.registryCredential;
    	      this.type = defaults.type;
        }

        public Builder setCertificate(@Nullable String certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder setComputeType(String computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable List<ProjectEnvironmentEnvironmentVariable> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setImage(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setImagePullCredentialsType(@Nullable String imagePullCredentialsType) {
            this.imagePullCredentialsType = imagePullCredentialsType;
            return this;
        }

        public Builder setPrivilegedMode(@Nullable Boolean privilegedMode) {
            this.privilegedMode = privilegedMode;
            return this;
        }

        public Builder setRegistryCredential(@Nullable ProjectEnvironmentRegistryCredential registryCredential) {
            this.registryCredential = registryCredential;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ProjectEnvironment build() {
            return new ProjectEnvironment(certificate, computeType, environmentVariables, image, imagePullCredentialsType, privilegedMode, registryCredential, type);
        }
    }
}
