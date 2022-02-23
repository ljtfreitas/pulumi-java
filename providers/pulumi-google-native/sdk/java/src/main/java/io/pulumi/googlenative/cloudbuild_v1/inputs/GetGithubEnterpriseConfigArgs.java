// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGithubEnterpriseConfigArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGithubEnterpriseConfigArgs Empty = new GetGithubEnterpriseConfigArgs();

    @InputImport(name="configId")
      private final @Nullable String configId;

    public Optional<String> getConfigId() {
        return this.configId == null ? Optional.empty() : Optional.ofNullable(this.configId);
    }

    @InputImport(name="githubEnterpriseConfigId", required=true)
      private final String githubEnterpriseConfigId;

    public String getGithubEnterpriseConfigId() {
        return this.githubEnterpriseConfigId;
    }

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="projectId")
      private final @Nullable String projectId;

    public Optional<String> getProjectId() {
        return this.projectId == null ? Optional.empty() : Optional.ofNullable(this.projectId);
    }

    public GetGithubEnterpriseConfigArgs(
        @Nullable String configId,
        String githubEnterpriseConfigId,
        String location,
        @Nullable String project,
        @Nullable String projectId) {
        this.configId = configId;
        this.githubEnterpriseConfigId = Objects.requireNonNull(githubEnterpriseConfigId, "expected parameter 'githubEnterpriseConfigId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.projectId = projectId;
    }

    private GetGithubEnterpriseConfigArgs() {
        this.configId = null;
        this.githubEnterpriseConfigId = null;
        this.location = null;
        this.project = null;
        this.projectId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGithubEnterpriseConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String configId;
        private String githubEnterpriseConfigId;
        private String location;
        private @Nullable String project;
        private @Nullable String projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGithubEnterpriseConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.githubEnterpriseConfigId = defaults.githubEnterpriseConfigId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.projectId = defaults.projectId;
        }

        public Builder setConfigId(@Nullable String configId) {
            this.configId = configId;
            return this;
        }

        public Builder setGithubEnterpriseConfigId(String githubEnterpriseConfigId) {
            this.githubEnterpriseConfigId = Objects.requireNonNull(githubEnterpriseConfigId);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setProjectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        public GetGithubEnterpriseConfigArgs build() {
            return new GetGithubEnterpriseConfigArgs(configId, githubEnterpriseConfigId, location, project, projectId);
        }
    }
}
