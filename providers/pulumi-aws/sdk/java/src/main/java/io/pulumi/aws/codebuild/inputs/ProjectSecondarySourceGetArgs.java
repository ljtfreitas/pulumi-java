// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.aws.codebuild.inputs.ProjectSecondarySourceAuthGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectSecondarySourceBuildStatusConfigGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectSecondarySourceGitSubmodulesConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectSecondarySourceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectSecondarySourceGetArgs Empty = new ProjectSecondarySourceGetArgs();

    /**
     * Configuration block with the authorization settings for AWS CodeBuild to access the source code to be built. This information is for the AWS CodeBuild console's use only. Use the `aws.codebuild.SourceCredential` resource instead. Auth blocks are documented below.
     * 
     * @Deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
     */
    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    @Import(name="auth")
      private final @Nullable Output<ProjectSecondarySourceAuthGetArgs> auth;

    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    public Output<ProjectSecondarySourceAuthGetArgs> getAuth() {
        return this.auth == null ? Output.empty() : this.auth;
    }

    /**
     * Contains information that defines how the build project reports the build status to the source provider. This option is only used when the source provider is `GITHUB`, `GITHUB_ENTERPRISE`, or `BITBUCKET`.
     * 
     */
    @Import(name="buildStatusConfig")
      private final @Nullable Output<ProjectSecondarySourceBuildStatusConfigGetArgs> buildStatusConfig;

    public Output<ProjectSecondarySourceBuildStatusConfigGetArgs> getBuildStatusConfig() {
        return this.buildStatusConfig == null ? Output.empty() : this.buildStatusConfig;
    }

    /**
     * Build specification to use for this build project's related builds. This must be set when `type` is `NO_SOURCE`.
     * 
     */
    @Import(name="buildspec")
      private final @Nullable Output<String> buildspec;

    public Output<String> getBuildspec() {
        return this.buildspec == null ? Output.empty() : this.buildspec;
    }

    /**
     * Truncate git history to this many commits. Use `0` for a `Full` checkout which you need to run commands like `git branch --show-current`. See [AWS CodePipeline User Guide: Tutorial: Use full clone with a GitHub pipeline source](https://docs.aws.amazon.com/codepipeline/latest/userguide/tutorials-github-gitclone.html) for details.
     * 
     */
    @Import(name="gitCloneDepth")
      private final @Nullable Output<Integer> gitCloneDepth;

    public Output<Integer> getGitCloneDepth() {
        return this.gitCloneDepth == null ? Output.empty() : this.gitCloneDepth;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="gitSubmodulesConfig")
      private final @Nullable Output<ProjectSecondarySourceGitSubmodulesConfigGetArgs> gitSubmodulesConfig;

    public Output<ProjectSecondarySourceGitSubmodulesConfigGetArgs> getGitSubmodulesConfig() {
        return this.gitSubmodulesConfig == null ? Output.empty() : this.gitSubmodulesConfig;
    }

    /**
     * Ignore SSL warnings when connecting to source control.
     * 
     */
    @Import(name="insecureSsl")
      private final @Nullable Output<Boolean> insecureSsl;

    public Output<Boolean> getInsecureSsl() {
        return this.insecureSsl == null ? Output.empty() : this.insecureSsl;
    }

    /**
     * Location of the source code from git or s3.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Whether to report the status of a build's start and finish to your source provider. This option is only valid when the `type` is `BITBUCKET` or `GITHUB`.
     * 
     */
    @Import(name="reportBuildStatus")
      private final @Nullable Output<Boolean> reportBuildStatus;

    public Output<Boolean> getReportBuildStatus() {
        return this.reportBuildStatus == null ? Output.empty() : this.reportBuildStatus;
    }

    /**
     * An identifier for a source in the build project.
     * 
     */
    @Import(name="sourceIdentifier", required=true)
      private final Output<String> sourceIdentifier;

    public Output<String> getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ProjectSecondarySourceGetArgs(
        @Nullable Output<ProjectSecondarySourceAuthGetArgs> auth,
        @Nullable Output<ProjectSecondarySourceBuildStatusConfigGetArgs> buildStatusConfig,
        @Nullable Output<String> buildspec,
        @Nullable Output<Integer> gitCloneDepth,
        @Nullable Output<ProjectSecondarySourceGitSubmodulesConfigGetArgs> gitSubmodulesConfig,
        @Nullable Output<Boolean> insecureSsl,
        @Nullable Output<String> location,
        @Nullable Output<Boolean> reportBuildStatus,
        Output<String> sourceIdentifier,
        Output<String> type) {
        this.auth = auth;
        this.buildStatusConfig = buildStatusConfig;
        this.buildspec = buildspec;
        this.gitCloneDepth = gitCloneDepth;
        this.gitSubmodulesConfig = gitSubmodulesConfig;
        this.insecureSsl = insecureSsl;
        this.location = location;
        this.reportBuildStatus = reportBuildStatus;
        this.sourceIdentifier = Objects.requireNonNull(sourceIdentifier, "expected parameter 'sourceIdentifier' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ProjectSecondarySourceGetArgs() {
        this.auth = Output.empty();
        this.buildStatusConfig = Output.empty();
        this.buildspec = Output.empty();
        this.gitCloneDepth = Output.empty();
        this.gitSubmodulesConfig = Output.empty();
        this.insecureSsl = Output.empty();
        this.location = Output.empty();
        this.reportBuildStatus = Output.empty();
        this.sourceIdentifier = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSecondarySourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ProjectSecondarySourceAuthGetArgs> auth;
        private @Nullable Output<ProjectSecondarySourceBuildStatusConfigGetArgs> buildStatusConfig;
        private @Nullable Output<String> buildspec;
        private @Nullable Output<Integer> gitCloneDepth;
        private @Nullable Output<ProjectSecondarySourceGitSubmodulesConfigGetArgs> gitSubmodulesConfig;
        private @Nullable Output<Boolean> insecureSsl;
        private @Nullable Output<String> location;
        private @Nullable Output<Boolean> reportBuildStatus;
        private Output<String> sourceIdentifier;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSecondarySourceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.buildStatusConfig = defaults.buildStatusConfig;
    	      this.buildspec = defaults.buildspec;
    	      this.gitCloneDepth = defaults.gitCloneDepth;
    	      this.gitSubmodulesConfig = defaults.gitSubmodulesConfig;
    	      this.insecureSsl = defaults.insecureSsl;
    	      this.location = defaults.location;
    	      this.reportBuildStatus = defaults.reportBuildStatus;
    	      this.sourceIdentifier = defaults.sourceIdentifier;
    	      this.type = defaults.type;
        }

        public Builder auth(@Nullable Output<ProjectSecondarySourceAuthGetArgs> auth) {
            this.auth = auth;
            return this;
        }

        public Builder auth(@Nullable ProjectSecondarySourceAuthGetArgs auth) {
            this.auth = Output.ofNullable(auth);
            return this;
        }

        public Builder buildStatusConfig(@Nullable Output<ProjectSecondarySourceBuildStatusConfigGetArgs> buildStatusConfig) {
            this.buildStatusConfig = buildStatusConfig;
            return this;
        }

        public Builder buildStatusConfig(@Nullable ProjectSecondarySourceBuildStatusConfigGetArgs buildStatusConfig) {
            this.buildStatusConfig = Output.ofNullable(buildStatusConfig);
            return this;
        }

        public Builder buildspec(@Nullable Output<String> buildspec) {
            this.buildspec = buildspec;
            return this;
        }

        public Builder buildspec(@Nullable String buildspec) {
            this.buildspec = Output.ofNullable(buildspec);
            return this;
        }

        public Builder gitCloneDepth(@Nullable Output<Integer> gitCloneDepth) {
            this.gitCloneDepth = gitCloneDepth;
            return this;
        }

        public Builder gitCloneDepth(@Nullable Integer gitCloneDepth) {
            this.gitCloneDepth = Output.ofNullable(gitCloneDepth);
            return this;
        }

        public Builder gitSubmodulesConfig(@Nullable Output<ProjectSecondarySourceGitSubmodulesConfigGetArgs> gitSubmodulesConfig) {
            this.gitSubmodulesConfig = gitSubmodulesConfig;
            return this;
        }

        public Builder gitSubmodulesConfig(@Nullable ProjectSecondarySourceGitSubmodulesConfigGetArgs gitSubmodulesConfig) {
            this.gitSubmodulesConfig = Output.ofNullable(gitSubmodulesConfig);
            return this;
        }

        public Builder insecureSsl(@Nullable Output<Boolean> insecureSsl) {
            this.insecureSsl = insecureSsl;
            return this;
        }

        public Builder insecureSsl(@Nullable Boolean insecureSsl) {
            this.insecureSsl = Output.ofNullable(insecureSsl);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder reportBuildStatus(@Nullable Output<Boolean> reportBuildStatus) {
            this.reportBuildStatus = reportBuildStatus;
            return this;
        }

        public Builder reportBuildStatus(@Nullable Boolean reportBuildStatus) {
            this.reportBuildStatus = Output.ofNullable(reportBuildStatus);
            return this;
        }

        public Builder sourceIdentifier(Output<String> sourceIdentifier) {
            this.sourceIdentifier = Objects.requireNonNull(sourceIdentifier);
            return this;
        }

        public Builder sourceIdentifier(String sourceIdentifier) {
            this.sourceIdentifier = Output.of(Objects.requireNonNull(sourceIdentifier));
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public ProjectSecondarySourceGetArgs build() {
            return new ProjectSecondarySourceGetArgs(auth, buildStatusConfig, buildspec, gitCloneDepth, gitSubmodulesConfig, insecureSsl, location, reportBuildStatus, sourceIdentifier, type);
        }
    }
}
