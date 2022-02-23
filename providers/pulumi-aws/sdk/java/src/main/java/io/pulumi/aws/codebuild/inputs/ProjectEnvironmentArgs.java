// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.aws.codebuild.inputs.ProjectEnvironmentEnvironmentVariableArgs;
import io.pulumi.aws.codebuild.inputs.ProjectEnvironmentRegistryCredentialArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectEnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectEnvironmentArgs Empty = new ProjectEnvironmentArgs();

    /**
     * ARN of the S3 bucket, path prefix and object key that contains the PEM-encoded certificate.
     * 
     */
    @InputImport(name="certificate")
    private final @Nullable Input<String> certificate;

    public Input<String> getCertificate() {
        return this.certificate == null ? Input.empty() : this.certificate;
    }

    /**
     * Information about the compute resources the build project will use. Valid values: `BUILD_GENERAL1_SMALL`, `BUILD_GENERAL1_MEDIUM`, `BUILD_GENERAL1_LARGE`, `BUILD_GENERAL1_2XLARGE`. `BUILD_GENERAL1_SMALL` is only valid if `type` is set to `LINUX_CONTAINER`. When `type` is set to `LINUX_GPU_CONTAINER`, `compute_type` must be `BUILD_GENERAL1_LARGE`.
     * 
     */
    @InputImport(name="computeType", required=true)
    private final Input<String> computeType;

    public Input<String> getComputeType() {
        return this.computeType;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="environmentVariables")
    private final @Nullable Input<List<ProjectEnvironmentEnvironmentVariableArgs>> environmentVariables;

    public Input<List<ProjectEnvironmentEnvironmentVariableArgs>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Input.empty() : this.environmentVariables;
    }

    /**
     * Docker image to use for this build project. Valid values include [Docker images provided by CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html) (e.g `aws/codebuild/standard:2.0`), [Docker Hub images](https://hub.docker.com/) (e.g., `nginx/nginx:latest`), and full Docker repository URIs such as those for ECR (e.g., `137112412989.dkr.ecr.us-west-2.amazonaws.com/amazonlinux:latest`).
     * 
     */
    @InputImport(name="image", required=true)
    private final Input<String> image;

    public Input<String> getImage() {
        return this.image;
    }

    /**
     * Type of credentials AWS CodeBuild uses to pull images in your build. Valid values: `CODEBUILD`, `SERVICE_ROLE`. When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image, you must use CodeBuild credentials. Defaults to `CODEBUILD`.
     * 
     */
    @InputImport(name="imagePullCredentialsType")
    private final @Nullable Input<String> imagePullCredentialsType;

    public Input<String> getImagePullCredentialsType() {
        return this.imagePullCredentialsType == null ? Input.empty() : this.imagePullCredentialsType;
    }

    /**
     * Whether to enable running the Docker daemon inside a Docker container. Defaults to `false`.
     * 
     */
    @InputImport(name="privilegedMode")
    private final @Nullable Input<Boolean> privilegedMode;

    public Input<Boolean> getPrivilegedMode() {
        return this.privilegedMode == null ? Input.empty() : this.privilegedMode;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="registryCredential")
    private final @Nullable Input<ProjectEnvironmentRegistryCredentialArgs> registryCredential;

    public Input<ProjectEnvironmentRegistryCredentialArgs> getRegistryCredential() {
        return this.registryCredential == null ? Input.empty() : this.registryCredential;
    }

    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ProjectEnvironmentArgs(
        @Nullable Input<String> certificate,
        Input<String> computeType,
        @Nullable Input<List<ProjectEnvironmentEnvironmentVariableArgs>> environmentVariables,
        Input<String> image,
        @Nullable Input<String> imagePullCredentialsType,
        @Nullable Input<Boolean> privilegedMode,
        @Nullable Input<ProjectEnvironmentRegistryCredentialArgs> registryCredential,
        Input<String> type) {
        this.certificate = certificate;
        this.computeType = Objects.requireNonNull(computeType, "expected parameter 'computeType' to be non-null");
        this.environmentVariables = environmentVariables;
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.imagePullCredentialsType = imagePullCredentialsType;
        this.privilegedMode = privilegedMode;
        this.registryCredential = registryCredential;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ProjectEnvironmentArgs() {
        this.certificate = Input.empty();
        this.computeType = Input.empty();
        this.environmentVariables = Input.empty();
        this.image = Input.empty();
        this.imagePullCredentialsType = Input.empty();
        this.privilegedMode = Input.empty();
        this.registryCredential = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificate;
        private Input<String> computeType;
        private @Nullable Input<List<ProjectEnvironmentEnvironmentVariableArgs>> environmentVariables;
        private Input<String> image;
        private @Nullable Input<String> imagePullCredentialsType;
        private @Nullable Input<Boolean> privilegedMode;
        private @Nullable Input<ProjectEnvironmentRegistryCredentialArgs> registryCredential;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectEnvironmentArgs defaults) {
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

        public Builder setCertificate(@Nullable Input<String> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder setCertificate(@Nullable String certificate) {
            this.certificate = Input.ofNullable(certificate);
            return this;
        }

        public Builder setComputeType(Input<String> computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }

        public Builder setComputeType(String computeType) {
            this.computeType = Input.of(Objects.requireNonNull(computeType));
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Input<List<ProjectEnvironmentEnvironmentVariableArgs>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable List<ProjectEnvironmentEnvironmentVariableArgs> environmentVariables) {
            this.environmentVariables = Input.ofNullable(environmentVariables);
            return this;
        }

        public Builder setImage(Input<String> image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setImage(String image) {
            this.image = Input.of(Objects.requireNonNull(image));
            return this;
        }

        public Builder setImagePullCredentialsType(@Nullable Input<String> imagePullCredentialsType) {
            this.imagePullCredentialsType = imagePullCredentialsType;
            return this;
        }

        public Builder setImagePullCredentialsType(@Nullable String imagePullCredentialsType) {
            this.imagePullCredentialsType = Input.ofNullable(imagePullCredentialsType);
            return this;
        }

        public Builder setPrivilegedMode(@Nullable Input<Boolean> privilegedMode) {
            this.privilegedMode = privilegedMode;
            return this;
        }

        public Builder setPrivilegedMode(@Nullable Boolean privilegedMode) {
            this.privilegedMode = Input.ofNullable(privilegedMode);
            return this;
        }

        public Builder setRegistryCredential(@Nullable Input<ProjectEnvironmentRegistryCredentialArgs> registryCredential) {
            this.registryCredential = registryCredential;
            return this;
        }

        public Builder setRegistryCredential(@Nullable ProjectEnvironmentRegistryCredentialArgs registryCredential) {
            this.registryCredential = Input.ofNullable(registryCredential);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ProjectEnvironmentArgs build() {
            return new ProjectEnvironmentArgs(certificate, computeType, environmentVariables, image, imagePullCredentialsType, privilegedMode, registryCredential, type);
        }
    }
}
