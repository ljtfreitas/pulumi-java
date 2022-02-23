// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild;

import io.pulumi.aws.codebuild.inputs.ProjectArtifactsArgs;
import io.pulumi.aws.codebuild.inputs.ProjectBuildBatchConfigArgs;
import io.pulumi.aws.codebuild.inputs.ProjectCacheArgs;
import io.pulumi.aws.codebuild.inputs.ProjectEnvironmentArgs;
import io.pulumi.aws.codebuild.inputs.ProjectFileSystemLocationArgs;
import io.pulumi.aws.codebuild.inputs.ProjectLogsConfigArgs;
import io.pulumi.aws.codebuild.inputs.ProjectSecondaryArtifactArgs;
import io.pulumi.aws.codebuild.inputs.ProjectSecondarySourceArgs;
import io.pulumi.aws.codebuild.inputs.ProjectSecondarySourceVersionArgs;
import io.pulumi.aws.codebuild.inputs.ProjectSourceArgs;
import io.pulumi.aws.codebuild.inputs.ProjectVpcConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="artifacts", required=true)
    private final Input<ProjectArtifactsArgs> artifacts;

    public Input<ProjectArtifactsArgs> getArtifacts() {
        return this.artifacts;
    }

    /**
     * Generates a publicly-accessible URL for the projects build badge. Available as `badge_url` attribute when enabled.
     * 
     */
    @InputImport(name="badgeEnabled")
    private final @Nullable Input<Boolean> badgeEnabled;

    public Input<Boolean> getBadgeEnabled() {
        return this.badgeEnabled == null ? Input.empty() : this.badgeEnabled;
    }

    /**
     * Defines the batch build options for the project.
     * 
     */
    @InputImport(name="buildBatchConfig")
    private final @Nullable Input<ProjectBuildBatchConfigArgs> buildBatchConfig;

    public Input<ProjectBuildBatchConfigArgs> getBuildBatchConfig() {
        return this.buildBatchConfig == null ? Input.empty() : this.buildBatchConfig;
    }

    /**
     * Number of minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that does not get marked as completed. The default is 60 minutes.
     * 
     */
    @InputImport(name="buildTimeout")
    private final @Nullable Input<Integer> buildTimeout;

    public Input<Integer> getBuildTimeout() {
        return this.buildTimeout == null ? Input.empty() : this.buildTimeout;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="cache")
    private final @Nullable Input<ProjectCacheArgs> cache;

    public Input<ProjectCacheArgs> getCache() {
        return this.cache == null ? Input.empty() : this.cache;
    }

    /**
     * Specify a maximum number of concurrent builds for the project. The value specified must be greater than 0 and less than the account concurrent running builds limit.
     * 
     */
    @InputImport(name="concurrentBuildLimit")
    private final @Nullable Input<Integer> concurrentBuildLimit;

    public Input<Integer> getConcurrentBuildLimit() {
        return this.concurrentBuildLimit == null ? Input.empty() : this.concurrentBuildLimit;
    }

    /**
     * Short description of the project.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build project's build output artifacts.
     * 
     */
    @InputImport(name="encryptionKey")
    private final @Nullable Input<String> encryptionKey;

    public Input<String> getEncryptionKey() {
        return this.encryptionKey == null ? Input.empty() : this.encryptionKey;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="environment", required=true)
    private final Input<ProjectEnvironmentArgs> environment;

    public Input<ProjectEnvironmentArgs> getEnvironment() {
        return this.environment;
    }

    /**
     * A set of file system locations to to mount inside the build. File system locations are documented below.
     * 
     */
    @InputImport(name="fileSystemLocations")
    private final @Nullable Input<List<ProjectFileSystemLocationArgs>> fileSystemLocations;

    public Input<List<ProjectFileSystemLocationArgs>> getFileSystemLocations() {
        return this.fileSystemLocations == null ? Input.empty() : this.fileSystemLocations;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="logsConfig")
    private final @Nullable Input<ProjectLogsConfigArgs> logsConfig;

    public Input<ProjectLogsConfigArgs> getLogsConfig() {
        return this.logsConfig == null ? Input.empty() : this.logsConfig;
    }

    /**
     * Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specifies the visibility of the project's builds. Possible values are: `PUBLIC_READ` and `PRIVATE`. Default value is `PRIVATE`.
     * 
     */
    @InputImport(name="projectVisibility")
    private final @Nullable Input<String> projectVisibility;

    public Input<String> getProjectVisibility() {
        return this.projectVisibility == null ? Input.empty() : this.projectVisibility;
    }

    /**
     * Number of minutes, from 5 to 480 (8 hours), a build is allowed to be queued before it times out. The default is 8 hours.
     * 
     */
    @InputImport(name="queuedTimeout")
    private final @Nullable Input<Integer> queuedTimeout;

    public Input<Integer> getQueuedTimeout() {
        return this.queuedTimeout == null ? Input.empty() : this.queuedTimeout;
    }

    /**
     * The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3 artifacts for the project's builds.
     * 
     */
    @InputImport(name="resourceAccessRole")
    private final @Nullable Input<String> resourceAccessRole;

    public Input<String> getResourceAccessRole() {
        return this.resourceAccessRole == null ? Input.empty() : this.resourceAccessRole;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="secondaryArtifacts")
    private final @Nullable Input<List<ProjectSecondaryArtifactArgs>> secondaryArtifacts;

    public Input<List<ProjectSecondaryArtifactArgs>> getSecondaryArtifacts() {
        return this.secondaryArtifacts == null ? Input.empty() : this.secondaryArtifacts;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="secondarySourceVersions")
    private final @Nullable Input<List<ProjectSecondarySourceVersionArgs>> secondarySourceVersions;

    public Input<List<ProjectSecondarySourceVersionArgs>> getSecondarySourceVersions() {
        return this.secondarySourceVersions == null ? Input.empty() : this.secondarySourceVersions;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="secondarySources")
    private final @Nullable Input<List<ProjectSecondarySourceArgs>> secondarySources;

    public Input<List<ProjectSecondarySourceArgs>> getSecondarySources() {
        return this.secondarySources == null ? Input.empty() : this.secondarySources;
    }

    /**
     * Specifies the service role ARN for the batch build project.
     * 
     */
    @InputImport(name="serviceRole", required=true)
    private final Input<String> serviceRole;

    public Input<String> getServiceRole() {
        return this.serviceRole;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="source", required=true)
    private final Input<ProjectSourceArgs> source;

    public Input<ProjectSourceArgs> getSource() {
        return this.source;
    }

    /**
     * The source version for the corresponding source identifier. See [AWS docs](https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ProjectSourceVersion.html#CodeBuild-Type-ProjectSourceVersion-sourceVersion) for more details.
     * 
     */
    @InputImport(name="sourceVersion")
    private final @Nullable Input<String> sourceVersion;

    public Input<String> getSourceVersion() {
        return this.sourceVersion == null ? Input.empty() : this.sourceVersion;
    }

    /**
     * Map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="vpcConfig")
    private final @Nullable Input<ProjectVpcConfigArgs> vpcConfig;

    public Input<ProjectVpcConfigArgs> getVpcConfig() {
        return this.vpcConfig == null ? Input.empty() : this.vpcConfig;
    }

    public ProjectArgs(
        Input<ProjectArtifactsArgs> artifacts,
        @Nullable Input<Boolean> badgeEnabled,
        @Nullable Input<ProjectBuildBatchConfigArgs> buildBatchConfig,
        @Nullable Input<Integer> buildTimeout,
        @Nullable Input<ProjectCacheArgs> cache,
        @Nullable Input<Integer> concurrentBuildLimit,
        @Nullable Input<String> description,
        @Nullable Input<String> encryptionKey,
        Input<ProjectEnvironmentArgs> environment,
        @Nullable Input<List<ProjectFileSystemLocationArgs>> fileSystemLocations,
        @Nullable Input<ProjectLogsConfigArgs> logsConfig,
        @Nullable Input<String> name,
        @Nullable Input<String> projectVisibility,
        @Nullable Input<Integer> queuedTimeout,
        @Nullable Input<String> resourceAccessRole,
        @Nullable Input<List<ProjectSecondaryArtifactArgs>> secondaryArtifacts,
        @Nullable Input<List<ProjectSecondarySourceVersionArgs>> secondarySourceVersions,
        @Nullable Input<List<ProjectSecondarySourceArgs>> secondarySources,
        Input<String> serviceRole,
        Input<ProjectSourceArgs> source,
        @Nullable Input<String> sourceVersion,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<ProjectVpcConfigArgs> vpcConfig) {
        this.artifacts = Objects.requireNonNull(artifacts, "expected parameter 'artifacts' to be non-null");
        this.badgeEnabled = badgeEnabled;
        this.buildBatchConfig = buildBatchConfig;
        this.buildTimeout = buildTimeout;
        this.cache = cache;
        this.concurrentBuildLimit = concurrentBuildLimit;
        this.description = description;
        this.encryptionKey = encryptionKey;
        this.environment = Objects.requireNonNull(environment, "expected parameter 'environment' to be non-null");
        this.fileSystemLocations = fileSystemLocations;
        this.logsConfig = logsConfig;
        this.name = name;
        this.projectVisibility = projectVisibility;
        this.queuedTimeout = queuedTimeout;
        this.resourceAccessRole = resourceAccessRole;
        this.secondaryArtifacts = secondaryArtifacts;
        this.secondarySourceVersions = secondarySourceVersions;
        this.secondarySources = secondarySources;
        this.serviceRole = Objects.requireNonNull(serviceRole, "expected parameter 'serviceRole' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.sourceVersion = sourceVersion;
        this.tags = tags;
        this.vpcConfig = vpcConfig;
    }

    private ProjectArgs() {
        this.artifacts = Input.empty();
        this.badgeEnabled = Input.empty();
        this.buildBatchConfig = Input.empty();
        this.buildTimeout = Input.empty();
        this.cache = Input.empty();
        this.concurrentBuildLimit = Input.empty();
        this.description = Input.empty();
        this.encryptionKey = Input.empty();
        this.environment = Input.empty();
        this.fileSystemLocations = Input.empty();
        this.logsConfig = Input.empty();
        this.name = Input.empty();
        this.projectVisibility = Input.empty();
        this.queuedTimeout = Input.empty();
        this.resourceAccessRole = Input.empty();
        this.secondaryArtifacts = Input.empty();
        this.secondarySourceVersions = Input.empty();
        this.secondarySources = Input.empty();
        this.serviceRole = Input.empty();
        this.source = Input.empty();
        this.sourceVersion = Input.empty();
        this.tags = Input.empty();
        this.vpcConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ProjectArtifactsArgs> artifacts;
        private @Nullable Input<Boolean> badgeEnabled;
        private @Nullable Input<ProjectBuildBatchConfigArgs> buildBatchConfig;
        private @Nullable Input<Integer> buildTimeout;
        private @Nullable Input<ProjectCacheArgs> cache;
        private @Nullable Input<Integer> concurrentBuildLimit;
        private @Nullable Input<String> description;
        private @Nullable Input<String> encryptionKey;
        private Input<ProjectEnvironmentArgs> environment;
        private @Nullable Input<List<ProjectFileSystemLocationArgs>> fileSystemLocations;
        private @Nullable Input<ProjectLogsConfigArgs> logsConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<String> projectVisibility;
        private @Nullable Input<Integer> queuedTimeout;
        private @Nullable Input<String> resourceAccessRole;
        private @Nullable Input<List<ProjectSecondaryArtifactArgs>> secondaryArtifacts;
        private @Nullable Input<List<ProjectSecondarySourceVersionArgs>> secondarySourceVersions;
        private @Nullable Input<List<ProjectSecondarySourceArgs>> secondarySources;
        private Input<String> serviceRole;
        private Input<ProjectSourceArgs> source;
        private @Nullable Input<String> sourceVersion;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<ProjectVpcConfigArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifacts = defaults.artifacts;
    	      this.badgeEnabled = defaults.badgeEnabled;
    	      this.buildBatchConfig = defaults.buildBatchConfig;
    	      this.buildTimeout = defaults.buildTimeout;
    	      this.cache = defaults.cache;
    	      this.concurrentBuildLimit = defaults.concurrentBuildLimit;
    	      this.description = defaults.description;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.environment = defaults.environment;
    	      this.fileSystemLocations = defaults.fileSystemLocations;
    	      this.logsConfig = defaults.logsConfig;
    	      this.name = defaults.name;
    	      this.projectVisibility = defaults.projectVisibility;
    	      this.queuedTimeout = defaults.queuedTimeout;
    	      this.resourceAccessRole = defaults.resourceAccessRole;
    	      this.secondaryArtifacts = defaults.secondaryArtifacts;
    	      this.secondarySourceVersions = defaults.secondarySourceVersions;
    	      this.secondarySources = defaults.secondarySources;
    	      this.serviceRole = defaults.serviceRole;
    	      this.source = defaults.source;
    	      this.sourceVersion = defaults.sourceVersion;
    	      this.tags = defaults.tags;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder setArtifacts(Input<ProjectArtifactsArgs> artifacts) {
            this.artifacts = Objects.requireNonNull(artifacts);
            return this;
        }

        public Builder setArtifacts(ProjectArtifactsArgs artifacts) {
            this.artifacts = Input.of(Objects.requireNonNull(artifacts));
            return this;
        }

        public Builder setBadgeEnabled(@Nullable Input<Boolean> badgeEnabled) {
            this.badgeEnabled = badgeEnabled;
            return this;
        }

        public Builder setBadgeEnabled(@Nullable Boolean badgeEnabled) {
            this.badgeEnabled = Input.ofNullable(badgeEnabled);
            return this;
        }

        public Builder setBuildBatchConfig(@Nullable Input<ProjectBuildBatchConfigArgs> buildBatchConfig) {
            this.buildBatchConfig = buildBatchConfig;
            return this;
        }

        public Builder setBuildBatchConfig(@Nullable ProjectBuildBatchConfigArgs buildBatchConfig) {
            this.buildBatchConfig = Input.ofNullable(buildBatchConfig);
            return this;
        }

        public Builder setBuildTimeout(@Nullable Input<Integer> buildTimeout) {
            this.buildTimeout = buildTimeout;
            return this;
        }

        public Builder setBuildTimeout(@Nullable Integer buildTimeout) {
            this.buildTimeout = Input.ofNullable(buildTimeout);
            return this;
        }

        public Builder setCache(@Nullable Input<ProjectCacheArgs> cache) {
            this.cache = cache;
            return this;
        }

        public Builder setCache(@Nullable ProjectCacheArgs cache) {
            this.cache = Input.ofNullable(cache);
            return this;
        }

        public Builder setConcurrentBuildLimit(@Nullable Input<Integer> concurrentBuildLimit) {
            this.concurrentBuildLimit = concurrentBuildLimit;
            return this;
        }

        public Builder setConcurrentBuildLimit(@Nullable Integer concurrentBuildLimit) {
            this.concurrentBuildLimit = Input.ofNullable(concurrentBuildLimit);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEncryptionKey(@Nullable Input<String> encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        public Builder setEncryptionKey(@Nullable String encryptionKey) {
            this.encryptionKey = Input.ofNullable(encryptionKey);
            return this;
        }

        public Builder setEnvironment(Input<ProjectEnvironmentArgs> environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }

        public Builder setEnvironment(ProjectEnvironmentArgs environment) {
            this.environment = Input.of(Objects.requireNonNull(environment));
            return this;
        }

        public Builder setFileSystemLocations(@Nullable Input<List<ProjectFileSystemLocationArgs>> fileSystemLocations) {
            this.fileSystemLocations = fileSystemLocations;
            return this;
        }

        public Builder setFileSystemLocations(@Nullable List<ProjectFileSystemLocationArgs> fileSystemLocations) {
            this.fileSystemLocations = Input.ofNullable(fileSystemLocations);
            return this;
        }

        public Builder setLogsConfig(@Nullable Input<ProjectLogsConfigArgs> logsConfig) {
            this.logsConfig = logsConfig;
            return this;
        }

        public Builder setLogsConfig(@Nullable ProjectLogsConfigArgs logsConfig) {
            this.logsConfig = Input.ofNullable(logsConfig);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProjectVisibility(@Nullable Input<String> projectVisibility) {
            this.projectVisibility = projectVisibility;
            return this;
        }

        public Builder setProjectVisibility(@Nullable String projectVisibility) {
            this.projectVisibility = Input.ofNullable(projectVisibility);
            return this;
        }

        public Builder setQueuedTimeout(@Nullable Input<Integer> queuedTimeout) {
            this.queuedTimeout = queuedTimeout;
            return this;
        }

        public Builder setQueuedTimeout(@Nullable Integer queuedTimeout) {
            this.queuedTimeout = Input.ofNullable(queuedTimeout);
            return this;
        }

        public Builder setResourceAccessRole(@Nullable Input<String> resourceAccessRole) {
            this.resourceAccessRole = resourceAccessRole;
            return this;
        }

        public Builder setResourceAccessRole(@Nullable String resourceAccessRole) {
            this.resourceAccessRole = Input.ofNullable(resourceAccessRole);
            return this;
        }

        public Builder setSecondaryArtifacts(@Nullable Input<List<ProjectSecondaryArtifactArgs>> secondaryArtifacts) {
            this.secondaryArtifacts = secondaryArtifacts;
            return this;
        }

        public Builder setSecondaryArtifacts(@Nullable List<ProjectSecondaryArtifactArgs> secondaryArtifacts) {
            this.secondaryArtifacts = Input.ofNullable(secondaryArtifacts);
            return this;
        }

        public Builder setSecondarySourceVersions(@Nullable Input<List<ProjectSecondarySourceVersionArgs>> secondarySourceVersions) {
            this.secondarySourceVersions = secondarySourceVersions;
            return this;
        }

        public Builder setSecondarySourceVersions(@Nullable List<ProjectSecondarySourceVersionArgs> secondarySourceVersions) {
            this.secondarySourceVersions = Input.ofNullable(secondarySourceVersions);
            return this;
        }

        public Builder setSecondarySources(@Nullable Input<List<ProjectSecondarySourceArgs>> secondarySources) {
            this.secondarySources = secondarySources;
            return this;
        }

        public Builder setSecondarySources(@Nullable List<ProjectSecondarySourceArgs> secondarySources) {
            this.secondarySources = Input.ofNullable(secondarySources);
            return this;
        }

        public Builder setServiceRole(Input<String> serviceRole) {
            this.serviceRole = Objects.requireNonNull(serviceRole);
            return this;
        }

        public Builder setServiceRole(String serviceRole) {
            this.serviceRole = Input.of(Objects.requireNonNull(serviceRole));
            return this;
        }

        public Builder setSource(Input<ProjectSourceArgs> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSource(ProjectSourceArgs source) {
            this.source = Input.of(Objects.requireNonNull(source));
            return this;
        }

        public Builder setSourceVersion(@Nullable Input<String> sourceVersion) {
            this.sourceVersion = sourceVersion;
            return this;
        }

        public Builder setSourceVersion(@Nullable String sourceVersion) {
            this.sourceVersion = Input.ofNullable(sourceVersion);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVpcConfig(@Nullable Input<ProjectVpcConfigArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public Builder setVpcConfig(@Nullable ProjectVpcConfigArgs vpcConfig) {
            this.vpcConfig = Input.ofNullable(vpcConfig);
            return this;
        }
        public ProjectArgs build() {
            return new ProjectArgs(artifacts, badgeEnabled, buildBatchConfig, buildTimeout, cache, concurrentBuildLimit, description, encryptionKey, environment, fileSystemLocations, logsConfig, name, projectVisibility, queuedTimeout, resourceAccessRole, secondaryArtifacts, secondarySourceVersions, secondarySources, serviceRole, source, sourceVersion, tags, vpcConfig);
        }
    }
}
