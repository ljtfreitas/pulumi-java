// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.amplify.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppAutoBranchCreationConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppAutoBranchCreationConfigGetArgs Empty = new AppAutoBranchCreationConfigGetArgs();

    /**
     * The basic authorization credentials for the autocreated branch.
     * 
     */
    @Import(name="basicAuthCredentials")
      private final @Nullable Output<String> basicAuthCredentials;

    public Output<String> getBasicAuthCredentials() {
        return this.basicAuthCredentials == null ? Output.empty() : this.basicAuthCredentials;
    }

    /**
     * The build specification (build spec) for the autocreated branch.
     * 
     */
    @Import(name="buildSpec")
      private final @Nullable Output<String> buildSpec;

    public Output<String> getBuildSpec() {
        return this.buildSpec == null ? Output.empty() : this.buildSpec;
    }

    /**
     * Enables auto building for the autocreated branch.
     * 
     */
    @Import(name="enableAutoBuild")
      private final @Nullable Output<Boolean> enableAutoBuild;

    public Output<Boolean> getEnableAutoBuild() {
        return this.enableAutoBuild == null ? Output.empty() : this.enableAutoBuild;
    }

    /**
     * Enables basic authorization for the autocreated branch.
     * 
     */
    @Import(name="enableBasicAuth")
      private final @Nullable Output<Boolean> enableBasicAuth;

    public Output<Boolean> getEnableBasicAuth() {
        return this.enableBasicAuth == null ? Output.empty() : this.enableBasicAuth;
    }

    /**
     * Enables performance mode for the branch.
     * 
     */
    @Import(name="enablePerformanceMode")
      private final @Nullable Output<Boolean> enablePerformanceMode;

    public Output<Boolean> getEnablePerformanceMode() {
        return this.enablePerformanceMode == null ? Output.empty() : this.enablePerformanceMode;
    }

    /**
     * Enables pull request previews for the autocreated branch.
     * 
     */
    @Import(name="enablePullRequestPreview")
      private final @Nullable Output<Boolean> enablePullRequestPreview;

    public Output<Boolean> getEnablePullRequestPreview() {
        return this.enablePullRequestPreview == null ? Output.empty() : this.enablePullRequestPreview;
    }

    /**
     * The environment variables for the autocreated branch.
     * 
     */
    @Import(name="environmentVariables")
      private final @Nullable Output<Map<String,String>> environmentVariables;

    public Output<Map<String,String>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Output.empty() : this.environmentVariables;
    }

    /**
     * The framework for the autocreated branch.
     * 
     */
    @Import(name="framework")
      private final @Nullable Output<String> framework;

    public Output<String> getFramework() {
        return this.framework == null ? Output.empty() : this.framework;
    }

    /**
     * The Amplify environment name for the pull request.
     * 
     */
    @Import(name="pullRequestEnvironmentName")
      private final @Nullable Output<String> pullRequestEnvironmentName;

    public Output<String> getPullRequestEnvironmentName() {
        return this.pullRequestEnvironmentName == null ? Output.empty() : this.pullRequestEnvironmentName;
    }

    /**
     * Describes the current stage for the autocreated branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
     * 
     */
    @Import(name="stage")
      private final @Nullable Output<String> stage;

    public Output<String> getStage() {
        return this.stage == null ? Output.empty() : this.stage;
    }

    public AppAutoBranchCreationConfigGetArgs(
        @Nullable Output<String> basicAuthCredentials,
        @Nullable Output<String> buildSpec,
        @Nullable Output<Boolean> enableAutoBuild,
        @Nullable Output<Boolean> enableBasicAuth,
        @Nullable Output<Boolean> enablePerformanceMode,
        @Nullable Output<Boolean> enablePullRequestPreview,
        @Nullable Output<Map<String,String>> environmentVariables,
        @Nullable Output<String> framework,
        @Nullable Output<String> pullRequestEnvironmentName,
        @Nullable Output<String> stage) {
        this.basicAuthCredentials = basicAuthCredentials;
        this.buildSpec = buildSpec;
        this.enableAutoBuild = enableAutoBuild;
        this.enableBasicAuth = enableBasicAuth;
        this.enablePerformanceMode = enablePerformanceMode;
        this.enablePullRequestPreview = enablePullRequestPreview;
        this.environmentVariables = environmentVariables;
        this.framework = framework;
        this.pullRequestEnvironmentName = pullRequestEnvironmentName;
        this.stage = stage;
    }

    private AppAutoBranchCreationConfigGetArgs() {
        this.basicAuthCredentials = Output.empty();
        this.buildSpec = Output.empty();
        this.enableAutoBuild = Output.empty();
        this.enableBasicAuth = Output.empty();
        this.enablePerformanceMode = Output.empty();
        this.enablePullRequestPreview = Output.empty();
        this.environmentVariables = Output.empty();
        this.framework = Output.empty();
        this.pullRequestEnvironmentName = Output.empty();
        this.stage = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppAutoBranchCreationConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> basicAuthCredentials;
        private @Nullable Output<String> buildSpec;
        private @Nullable Output<Boolean> enableAutoBuild;
        private @Nullable Output<Boolean> enableBasicAuth;
        private @Nullable Output<Boolean> enablePerformanceMode;
        private @Nullable Output<Boolean> enablePullRequestPreview;
        private @Nullable Output<Map<String,String>> environmentVariables;
        private @Nullable Output<String> framework;
        private @Nullable Output<String> pullRequestEnvironmentName;
        private @Nullable Output<String> stage;

        public Builder() {
    	      // Empty
        }

        public Builder(AppAutoBranchCreationConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicAuthCredentials = defaults.basicAuthCredentials;
    	      this.buildSpec = defaults.buildSpec;
    	      this.enableAutoBuild = defaults.enableAutoBuild;
    	      this.enableBasicAuth = defaults.enableBasicAuth;
    	      this.enablePerformanceMode = defaults.enablePerformanceMode;
    	      this.enablePullRequestPreview = defaults.enablePullRequestPreview;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.framework = defaults.framework;
    	      this.pullRequestEnvironmentName = defaults.pullRequestEnvironmentName;
    	      this.stage = defaults.stage;
        }

        public Builder basicAuthCredentials(@Nullable Output<String> basicAuthCredentials) {
            this.basicAuthCredentials = basicAuthCredentials;
            return this;
        }

        public Builder basicAuthCredentials(@Nullable String basicAuthCredentials) {
            this.basicAuthCredentials = Output.ofNullable(basicAuthCredentials);
            return this;
        }

        public Builder buildSpec(@Nullable Output<String> buildSpec) {
            this.buildSpec = buildSpec;
            return this;
        }

        public Builder buildSpec(@Nullable String buildSpec) {
            this.buildSpec = Output.ofNullable(buildSpec);
            return this;
        }

        public Builder enableAutoBuild(@Nullable Output<Boolean> enableAutoBuild) {
            this.enableAutoBuild = enableAutoBuild;
            return this;
        }

        public Builder enableAutoBuild(@Nullable Boolean enableAutoBuild) {
            this.enableAutoBuild = Output.ofNullable(enableAutoBuild);
            return this;
        }

        public Builder enableBasicAuth(@Nullable Output<Boolean> enableBasicAuth) {
            this.enableBasicAuth = enableBasicAuth;
            return this;
        }

        public Builder enableBasicAuth(@Nullable Boolean enableBasicAuth) {
            this.enableBasicAuth = Output.ofNullable(enableBasicAuth);
            return this;
        }

        public Builder enablePerformanceMode(@Nullable Output<Boolean> enablePerformanceMode) {
            this.enablePerformanceMode = enablePerformanceMode;
            return this;
        }

        public Builder enablePerformanceMode(@Nullable Boolean enablePerformanceMode) {
            this.enablePerformanceMode = Output.ofNullable(enablePerformanceMode);
            return this;
        }

        public Builder enablePullRequestPreview(@Nullable Output<Boolean> enablePullRequestPreview) {
            this.enablePullRequestPreview = enablePullRequestPreview;
            return this;
        }

        public Builder enablePullRequestPreview(@Nullable Boolean enablePullRequestPreview) {
            this.enablePullRequestPreview = Output.ofNullable(enablePullRequestPreview);
            return this;
        }

        public Builder environmentVariables(@Nullable Output<Map<String,String>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder environmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = Output.ofNullable(environmentVariables);
            return this;
        }

        public Builder framework(@Nullable Output<String> framework) {
            this.framework = framework;
            return this;
        }

        public Builder framework(@Nullable String framework) {
            this.framework = Output.ofNullable(framework);
            return this;
        }

        public Builder pullRequestEnvironmentName(@Nullable Output<String> pullRequestEnvironmentName) {
            this.pullRequestEnvironmentName = pullRequestEnvironmentName;
            return this;
        }

        public Builder pullRequestEnvironmentName(@Nullable String pullRequestEnvironmentName) {
            this.pullRequestEnvironmentName = Output.ofNullable(pullRequestEnvironmentName);
            return this;
        }

        public Builder stage(@Nullable Output<String> stage) {
            this.stage = stage;
            return this;
        }

        public Builder stage(@Nullable String stage) {
            this.stage = Output.ofNullable(stage);
            return this;
        }
        public AppAutoBranchCreationConfigGetArgs build() {
            return new AppAutoBranchCreationConfigGetArgs(basicAuthCredentials, buildSpec, enableAutoBuild, enableBasicAuth, enablePerformanceMode, enablePullRequestPreview, environmentVariables, framework, pullRequestEnvironmentName, stage);
        }
    }
}
