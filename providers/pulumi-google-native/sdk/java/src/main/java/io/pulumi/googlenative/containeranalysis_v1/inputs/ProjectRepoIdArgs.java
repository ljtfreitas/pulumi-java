// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Selects a repo using a Google Cloud Platform project ID (e.g., winged-cargo-31) and a repo name within that project.
 * 
 */
public final class ProjectRepoIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectRepoIdArgs Empty = new ProjectRepoIdArgs();

    /**
     * The ID of the project.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The name of the repo. Leave empty for the default repo.
     * 
     */
    @Import(name="repoName")
      private final @Nullable Output<String> repoName;

    public Output<String> getRepoName() {
        return this.repoName == null ? Output.empty() : this.repoName;
    }

    public ProjectRepoIdArgs(
        @Nullable Output<String> project,
        @Nullable Output<String> repoName) {
        this.project = project;
        this.repoName = repoName;
    }

    private ProjectRepoIdArgs() {
        this.project = Output.empty();
        this.repoName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectRepoIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> project;
        private @Nullable Output<String> repoName;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectRepoIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.repoName = defaults.repoName;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder repoName(@Nullable Output<String> repoName) {
            this.repoName = repoName;
            return this;
        }

        public Builder repoName(@Nullable String repoName) {
            this.repoName = Output.ofNullable(repoName);
            return this;
        }
        public ProjectRepoIdArgs build() {
            return new ProjectRepoIdArgs(project, repoName);
        }
    }
}
