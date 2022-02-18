// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.GitHubActionConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebAppSourceControlResult {
    /**
     * Name of branch to use for deployment.
     * 
     */
    private final @Nullable String branch;
    /**
     * <code>true</code> to enable deployment rollback; otherwise, <code>false</code>.
     * 
     */
    private final @Nullable Boolean deploymentRollbackEnabled;
    /**
     * If GitHub Action is selected, than the associated configuration.
     * 
     */
    private final @Nullable GitHubActionConfigurationResponse gitHubActionConfiguration;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * <code>true</code> if this is deployed via GitHub action.
     * 
     */
    private final @Nullable Boolean isGitHubAction;
    /**
     * <code>true</code> to limit to manual integration; <code>false</code> to enable continuous integration (which configures webhooks into online repos like GitHub).
     * 
     */
    private final @Nullable Boolean isManualIntegration;
    /**
     * <code>true</code> for a Mercurial repository; <code>false</code> for a Git repository.
     * 
     */
    private final @Nullable Boolean isMercurial;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * Repository or source control URL.
     * 
     */
    private final @Nullable String repoUrl;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"branch","deploymentRollbackEnabled","gitHubActionConfiguration","id","isGitHubAction","isManualIntegration","isMercurial","kind","name","repoUrl","type"})
    private GetWebAppSourceControlResult(
        @Nullable String branch,
        @Nullable Boolean deploymentRollbackEnabled,
        @Nullable GitHubActionConfigurationResponse gitHubActionConfiguration,
        String id,
        @Nullable Boolean isGitHubAction,
        @Nullable Boolean isManualIntegration,
        @Nullable Boolean isMercurial,
        @Nullable String kind,
        String name,
        @Nullable String repoUrl,
        String type) {
        this.branch = branch;
        this.deploymentRollbackEnabled = deploymentRollbackEnabled;
        this.gitHubActionConfiguration = gitHubActionConfiguration;
        this.id = Objects.requireNonNull(id);
        this.isGitHubAction = isGitHubAction;
        this.isManualIntegration = isManualIntegration;
        this.isMercurial = isMercurial;
        this.kind = kind;
        this.name = Objects.requireNonNull(name);
        this.repoUrl = repoUrl;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Name of branch to use for deployment.
     * 
     */
    public Optional<String> getBranch() {
        return Optional.ofNullable(this.branch);
    }
    /**
     * <code>true</code> to enable deployment rollback; otherwise, <code>false</code>.
     * 
     */
    public Optional<Boolean> getDeploymentRollbackEnabled() {
        return Optional.ofNullable(this.deploymentRollbackEnabled);
    }
    /**
     * If GitHub Action is selected, than the associated configuration.
     * 
     */
    public Optional<GitHubActionConfigurationResponse> getGitHubActionConfiguration() {
        return Optional.ofNullable(this.gitHubActionConfiguration);
    }
    /**
     * Resource Id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * <code>true</code> if this is deployed via GitHub action.
     * 
     */
    public Optional<Boolean> getIsGitHubAction() {
        return Optional.ofNullable(this.isGitHubAction);
    }
    /**
     * <code>true</code> to limit to manual integration; <code>false</code> to enable continuous integration (which configures webhooks into online repos like GitHub).
     * 
     */
    public Optional<Boolean> getIsManualIntegration() {
        return Optional.ofNullable(this.isManualIntegration);
    }
    /**
     * <code>true</code> for a Mercurial repository; <code>false</code> for a Git repository.
     * 
     */
    public Optional<Boolean> getIsMercurial() {
        return Optional.ofNullable(this.isMercurial);
    }
    /**
     * Kind of resource.
     * 
     */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Repository or source control URL.
     * 
     */
    public Optional<String> getRepoUrl() {
        return Optional.ofNullable(this.repoUrl);
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppSourceControlResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String branch;
        private @Nullable Boolean deploymentRollbackEnabled;
        private @Nullable GitHubActionConfigurationResponse gitHubActionConfiguration;
        private String id;
        private @Nullable Boolean isGitHubAction;
        private @Nullable Boolean isManualIntegration;
        private @Nullable Boolean isMercurial;
        private @Nullable String kind;
        private String name;
        private @Nullable String repoUrl;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppSourceControlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.deploymentRollbackEnabled = defaults.deploymentRollbackEnabled;
    	      this.gitHubActionConfiguration = defaults.gitHubActionConfiguration;
    	      this.id = defaults.id;
    	      this.isGitHubAction = defaults.isGitHubAction;
    	      this.isManualIntegration = defaults.isManualIntegration;
    	      this.isMercurial = defaults.isMercurial;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.repoUrl = defaults.repoUrl;
    	      this.type = defaults.type;
        }

        public Builder setBranch(@Nullable String branch) {
            this.branch = branch;
            return this;
        }

        public Builder setDeploymentRollbackEnabled(@Nullable Boolean deploymentRollbackEnabled) {
            this.deploymentRollbackEnabled = deploymentRollbackEnabled;
            return this;
        }

        public Builder setGitHubActionConfiguration(@Nullable GitHubActionConfigurationResponse gitHubActionConfiguration) {
            this.gitHubActionConfiguration = gitHubActionConfiguration;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsGitHubAction(@Nullable Boolean isGitHubAction) {
            this.isGitHubAction = isGitHubAction;
            return this;
        }

        public Builder setIsManualIntegration(@Nullable Boolean isManualIntegration) {
            this.isManualIntegration = isManualIntegration;
            return this;
        }

        public Builder setIsMercurial(@Nullable Boolean isMercurial) {
            this.isMercurial = isMercurial;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRepoUrl(@Nullable String repoUrl) {
            this.repoUrl = repoUrl;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetWebAppSourceControlResult build() {
            return new GetWebAppSourceControlResult(branch, deploymentRollbackEnabled, gitHubActionConfiguration, id, isGitHubAction, isManualIntegration, isMercurial, kind, name, repoUrl, type);
        }
    }
}
