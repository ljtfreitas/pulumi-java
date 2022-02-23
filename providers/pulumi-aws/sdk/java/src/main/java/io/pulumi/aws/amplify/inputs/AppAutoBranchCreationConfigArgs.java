// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.amplify.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppAutoBranchCreationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppAutoBranchCreationConfigArgs Empty = new AppAutoBranchCreationConfigArgs();

    /**
     * The basic authorization credentials for the autocreated branch.
     * 
     */
    @InputImport(name="basicAuthCredentials")
    private final @Nullable Input<String> basicAuthCredentials;

    public Input<String> getBasicAuthCredentials() {
        return this.basicAuthCredentials == null ? Input.empty() : this.basicAuthCredentials;
    }

    /**
     * The build specification (build spec) for the autocreated branch.
     * 
     */
    @InputImport(name="buildSpec")
    private final @Nullable Input<String> buildSpec;

    public Input<String> getBuildSpec() {
        return this.buildSpec == null ? Input.empty() : this.buildSpec;
    }

    /**
     * Enables auto building for the autocreated branch.
     * 
     */
    @InputImport(name="enableAutoBuild")
    private final @Nullable Input<Boolean> enableAutoBuild;

    public Input<Boolean> getEnableAutoBuild() {
        return this.enableAutoBuild == null ? Input.empty() : this.enableAutoBuild;
    }

    /**
     * Enables basic authorization for the autocreated branch.
     * 
     */
    @InputImport(name="enableBasicAuth")
    private final @Nullable Input<Boolean> enableBasicAuth;

    public Input<Boolean> getEnableBasicAuth() {
        return this.enableBasicAuth == null ? Input.empty() : this.enableBasicAuth;
    }

    /**
     * Enables performance mode for the branch.
     * 
     */
    @InputImport(name="enablePerformanceMode")
    private final @Nullable Input<Boolean> enablePerformanceMode;

    public Input<Boolean> getEnablePerformanceMode() {
        return this.enablePerformanceMode == null ? Input.empty() : this.enablePerformanceMode;
    }

    /**
     * Enables pull request previews for the autocreated branch.
     * 
     */
    @InputImport(name="enablePullRequestPreview")
    private final @Nullable Input<Boolean> enablePullRequestPreview;

    public Input<Boolean> getEnablePullRequestPreview() {
        return this.enablePullRequestPreview == null ? Input.empty() : this.enablePullRequestPreview;
    }

    /**
     * The environment variables for the autocreated branch.
     * 
     */
    @InputImport(name="environmentVariables")
    private final @Nullable Input<Map<String,String>> environmentVariables;

    public Input<Map<String,String>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Input.empty() : this.environmentVariables;
    }

    /**
     * The framework for the autocreated branch.
     * 
     */
    @InputImport(name="framework")
    private final @Nullable Input<String> framework;

    public Input<String> getFramework() {
        return this.framework == null ? Input.empty() : this.framework;
    }

    /**
     * The Amplify environment name for the pull request.
     * 
     */
    @InputImport(name="pullRequestEnvironmentName")
    private final @Nullable Input<String> pullRequestEnvironmentName;

    public Input<String> getPullRequestEnvironmentName() {
        return this.pullRequestEnvironmentName == null ? Input.empty() : this.pullRequestEnvironmentName;
    }

    /**
     * Describes the current stage for the autocreated branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
     * 
     */
    @InputImport(name="stage")
    private final @Nullable Input<String> stage;

    public Input<String> getStage() {
        return this.stage == null ? Input.empty() : this.stage;
    }

    public AppAutoBranchCreationConfigArgs(
        @Nullable Input<String> basicAuthCredentials,
        @Nullable Input<String> buildSpec,
        @Nullable Input<Boolean> enableAutoBuild,
        @Nullable Input<Boolean> enableBasicAuth,
        @Nullable Input<Boolean> enablePerformanceMode,
        @Nullable Input<Boolean> enablePullRequestPreview,
        @Nullable Input<Map<String,String>> environmentVariables,
        @Nullable Input<String> framework,
        @Nullable Input<String> pullRequestEnvironmentName,
        @Nullable Input<String> stage) {
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

    private AppAutoBranchCreationConfigArgs() {
        this.basicAuthCredentials = Input.empty();
        this.buildSpec = Input.empty();
        this.enableAutoBuild = Input.empty();
        this.enableBasicAuth = Input.empty();
        this.enablePerformanceMode = Input.empty();
        this.enablePullRequestPreview = Input.empty();
        this.environmentVariables = Input.empty();
        this.framework = Input.empty();
        this.pullRequestEnvironmentName = Input.empty();
        this.stage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppAutoBranchCreationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> basicAuthCredentials;
        private @Nullable Input<String> buildSpec;
        private @Nullable Input<Boolean> enableAutoBuild;
        private @Nullable Input<Boolean> enableBasicAuth;
        private @Nullable Input<Boolean> enablePerformanceMode;
        private @Nullable Input<Boolean> enablePullRequestPreview;
        private @Nullable Input<Map<String,String>> environmentVariables;
        private @Nullable Input<String> framework;
        private @Nullable Input<String> pullRequestEnvironmentName;
        private @Nullable Input<String> stage;

        public Builder() {
    	      // Empty
        }

        public Builder(AppAutoBranchCreationConfigArgs defaults) {
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

        public Builder setBasicAuthCredentials(@Nullable Input<String> basicAuthCredentials) {
            this.basicAuthCredentials = basicAuthCredentials;
            return this;
        }

        public Builder setBasicAuthCredentials(@Nullable String basicAuthCredentials) {
            this.basicAuthCredentials = Input.ofNullable(basicAuthCredentials);
            return this;
        }

        public Builder setBuildSpec(@Nullable Input<String> buildSpec) {
            this.buildSpec = buildSpec;
            return this;
        }

        public Builder setBuildSpec(@Nullable String buildSpec) {
            this.buildSpec = Input.ofNullable(buildSpec);
            return this;
        }

        public Builder setEnableAutoBuild(@Nullable Input<Boolean> enableAutoBuild) {
            this.enableAutoBuild = enableAutoBuild;
            return this;
        }

        public Builder setEnableAutoBuild(@Nullable Boolean enableAutoBuild) {
            this.enableAutoBuild = Input.ofNullable(enableAutoBuild);
            return this;
        }

        public Builder setEnableBasicAuth(@Nullable Input<Boolean> enableBasicAuth) {
            this.enableBasicAuth = enableBasicAuth;
            return this;
        }

        public Builder setEnableBasicAuth(@Nullable Boolean enableBasicAuth) {
            this.enableBasicAuth = Input.ofNullable(enableBasicAuth);
            return this;
        }

        public Builder setEnablePerformanceMode(@Nullable Input<Boolean> enablePerformanceMode) {
            this.enablePerformanceMode = enablePerformanceMode;
            return this;
        }

        public Builder setEnablePerformanceMode(@Nullable Boolean enablePerformanceMode) {
            this.enablePerformanceMode = Input.ofNullable(enablePerformanceMode);
            return this;
        }

        public Builder setEnablePullRequestPreview(@Nullable Input<Boolean> enablePullRequestPreview) {
            this.enablePullRequestPreview = enablePullRequestPreview;
            return this;
        }

        public Builder setEnablePullRequestPreview(@Nullable Boolean enablePullRequestPreview) {
            this.enablePullRequestPreview = Input.ofNullable(enablePullRequestPreview);
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Input<Map<String,String>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = Input.ofNullable(environmentVariables);
            return this;
        }

        public Builder setFramework(@Nullable Input<String> framework) {
            this.framework = framework;
            return this;
        }

        public Builder setFramework(@Nullable String framework) {
            this.framework = Input.ofNullable(framework);
            return this;
        }

        public Builder setPullRequestEnvironmentName(@Nullable Input<String> pullRequestEnvironmentName) {
            this.pullRequestEnvironmentName = pullRequestEnvironmentName;
            return this;
        }

        public Builder setPullRequestEnvironmentName(@Nullable String pullRequestEnvironmentName) {
            this.pullRequestEnvironmentName = Input.ofNullable(pullRequestEnvironmentName);
            return this;
        }

        public Builder setStage(@Nullable Input<String> stage) {
            this.stage = stage;
            return this;
        }

        public Builder setStage(@Nullable String stage) {
            this.stage = Input.ofNullable(stage);
            return this;
        }
        public AppAutoBranchCreationConfigArgs build() {
            return new AppAutoBranchCreationConfigArgs(basicAuthCredentials, buildSpec, enableAutoBuild, enableBasicAuth, enablePerformanceMode, enablePullRequestPreview, environmentVariables, framework, pullRequestEnvironmentName, stage);
        }
    }
}
