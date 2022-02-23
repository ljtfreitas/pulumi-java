// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Build properties for the static site.
 * 
 */
public final class StaticSiteBuildPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final StaticSiteBuildPropertiesArgs Empty = new StaticSiteBuildPropertiesArgs();

    /**
     * A custom command to run during deployment of the Azure Functions API application.
     * 
     */
    @InputImport(name="apiBuildCommand")
        private final @Nullable Input<String> apiBuildCommand;

    public Input<String> getApiBuildCommand() {
        return this.apiBuildCommand == null ? Input.empty() : this.apiBuildCommand;
    }

    /**
     * The path to the api code within the repository.
     * 
     */
    @InputImport(name="apiLocation")
        private final @Nullable Input<String> apiLocation;

    public Input<String> getApiLocation() {
        return this.apiLocation == null ? Input.empty() : this.apiLocation;
    }

    /**
     * Deprecated: The path of the app artifacts after building (deprecated in favor of OutputLocation)
     * 
     */
    @InputImport(name="appArtifactLocation")
        private final @Nullable Input<String> appArtifactLocation;

    public Input<String> getAppArtifactLocation() {
        return this.appArtifactLocation == null ? Input.empty() : this.appArtifactLocation;
    }

    /**
     * A custom command to run during deployment of the static content application.
     * 
     */
    @InputImport(name="appBuildCommand")
        private final @Nullable Input<String> appBuildCommand;

    public Input<String> getAppBuildCommand() {
        return this.appBuildCommand == null ? Input.empty() : this.appBuildCommand;
    }

    /**
     * The path to the app code within the repository.
     * 
     */
    @InputImport(name="appLocation")
        private final @Nullable Input<String> appLocation;

    public Input<String> getAppLocation() {
        return this.appLocation == null ? Input.empty() : this.appLocation;
    }

    /**
     * Github Action secret name override.
     * 
     */
    @InputImport(name="githubActionSecretNameOverride")
        private final @Nullable Input<String> githubActionSecretNameOverride;

    public Input<String> getGithubActionSecretNameOverride() {
        return this.githubActionSecretNameOverride == null ? Input.empty() : this.githubActionSecretNameOverride;
    }

    /**
     * The output path of the app after building.
     * 
     */
    @InputImport(name="outputLocation")
        private final @Nullable Input<String> outputLocation;

    public Input<String> getOutputLocation() {
        return this.outputLocation == null ? Input.empty() : this.outputLocation;
    }

    /**
     * Skip Github Action workflow generation.
     * 
     */
    @InputImport(name="skipGithubActionWorkflowGeneration")
        private final @Nullable Input<Boolean> skipGithubActionWorkflowGeneration;

    public Input<Boolean> getSkipGithubActionWorkflowGeneration() {
        return this.skipGithubActionWorkflowGeneration == null ? Input.empty() : this.skipGithubActionWorkflowGeneration;
    }

    public StaticSiteBuildPropertiesArgs(
        @Nullable Input<String> apiBuildCommand,
        @Nullable Input<String> apiLocation,
        @Nullable Input<String> appArtifactLocation,
        @Nullable Input<String> appBuildCommand,
        @Nullable Input<String> appLocation,
        @Nullable Input<String> githubActionSecretNameOverride,
        @Nullable Input<String> outputLocation,
        @Nullable Input<Boolean> skipGithubActionWorkflowGeneration) {
        this.apiBuildCommand = apiBuildCommand;
        this.apiLocation = apiLocation;
        this.appArtifactLocation = appArtifactLocation;
        this.appBuildCommand = appBuildCommand;
        this.appLocation = appLocation;
        this.githubActionSecretNameOverride = githubActionSecretNameOverride;
        this.outputLocation = outputLocation;
        this.skipGithubActionWorkflowGeneration = skipGithubActionWorkflowGeneration;
    }

    private StaticSiteBuildPropertiesArgs() {
        this.apiBuildCommand = Input.empty();
        this.apiLocation = Input.empty();
        this.appArtifactLocation = Input.empty();
        this.appBuildCommand = Input.empty();
        this.appLocation = Input.empty();
        this.githubActionSecretNameOverride = Input.empty();
        this.outputLocation = Input.empty();
        this.skipGithubActionWorkflowGeneration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticSiteBuildPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiBuildCommand;
        private @Nullable Input<String> apiLocation;
        private @Nullable Input<String> appArtifactLocation;
        private @Nullable Input<String> appBuildCommand;
        private @Nullable Input<String> appLocation;
        private @Nullable Input<String> githubActionSecretNameOverride;
        private @Nullable Input<String> outputLocation;
        private @Nullable Input<Boolean> skipGithubActionWorkflowGeneration;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticSiteBuildPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiBuildCommand = defaults.apiBuildCommand;
    	      this.apiLocation = defaults.apiLocation;
    	      this.appArtifactLocation = defaults.appArtifactLocation;
    	      this.appBuildCommand = defaults.appBuildCommand;
    	      this.appLocation = defaults.appLocation;
    	      this.githubActionSecretNameOverride = defaults.githubActionSecretNameOverride;
    	      this.outputLocation = defaults.outputLocation;
    	      this.skipGithubActionWorkflowGeneration = defaults.skipGithubActionWorkflowGeneration;
        }

        public Builder setApiBuildCommand(@Nullable Input<String> apiBuildCommand) {
            this.apiBuildCommand = apiBuildCommand;
            return this;
        }

        public Builder setApiBuildCommand(@Nullable String apiBuildCommand) {
            this.apiBuildCommand = Input.ofNullable(apiBuildCommand);
            return this;
        }

        public Builder setApiLocation(@Nullable Input<String> apiLocation) {
            this.apiLocation = apiLocation;
            return this;
        }

        public Builder setApiLocation(@Nullable String apiLocation) {
            this.apiLocation = Input.ofNullable(apiLocation);
            return this;
        }

        public Builder setAppArtifactLocation(@Nullable Input<String> appArtifactLocation) {
            this.appArtifactLocation = appArtifactLocation;
            return this;
        }

        public Builder setAppArtifactLocation(@Nullable String appArtifactLocation) {
            this.appArtifactLocation = Input.ofNullable(appArtifactLocation);
            return this;
        }

        public Builder setAppBuildCommand(@Nullable Input<String> appBuildCommand) {
            this.appBuildCommand = appBuildCommand;
            return this;
        }

        public Builder setAppBuildCommand(@Nullable String appBuildCommand) {
            this.appBuildCommand = Input.ofNullable(appBuildCommand);
            return this;
        }

        public Builder setAppLocation(@Nullable Input<String> appLocation) {
            this.appLocation = appLocation;
            return this;
        }

        public Builder setAppLocation(@Nullable String appLocation) {
            this.appLocation = Input.ofNullable(appLocation);
            return this;
        }

        public Builder setGithubActionSecretNameOverride(@Nullable Input<String> githubActionSecretNameOverride) {
            this.githubActionSecretNameOverride = githubActionSecretNameOverride;
            return this;
        }

        public Builder setGithubActionSecretNameOverride(@Nullable String githubActionSecretNameOverride) {
            this.githubActionSecretNameOverride = Input.ofNullable(githubActionSecretNameOverride);
            return this;
        }

        public Builder setOutputLocation(@Nullable Input<String> outputLocation) {
            this.outputLocation = outputLocation;
            return this;
        }

        public Builder setOutputLocation(@Nullable String outputLocation) {
            this.outputLocation = Input.ofNullable(outputLocation);
            return this;
        }

        public Builder setSkipGithubActionWorkflowGeneration(@Nullable Input<Boolean> skipGithubActionWorkflowGeneration) {
            this.skipGithubActionWorkflowGeneration = skipGithubActionWorkflowGeneration;
            return this;
        }

        public Builder setSkipGithubActionWorkflowGeneration(@Nullable Boolean skipGithubActionWorkflowGeneration) {
            this.skipGithubActionWorkflowGeneration = Input.ofNullable(skipGithubActionWorkflowGeneration);
            return this;
        }
        public StaticSiteBuildPropertiesArgs build() {
            return new StaticSiteBuildPropertiesArgs(apiBuildCommand, apiLocation, appArtifactLocation, appBuildCommand, appLocation, githubActionSecretNameOverride, outputLocation, skipGithubActionWorkflowGeneration);
        }
    }
}
