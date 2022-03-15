// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectServiceAccountArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetProjectServiceAccountArgs Empty = new GetProjectServiceAccountArgs();

    /**
     * The project the unique service account was created for. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    /**
     * The project the lookup originates from. This field is used if you are making the request
     * from a different account than the one you are finding the service account for.
     * 
     */
    @Import(name="userProject")
      private final @Nullable String userProject;

    public Optional<String> getUserProject() {
        return this.userProject == null ? Optional.empty() : Optional.ofNullable(this.userProject);
    }

    public GetProjectServiceAccountArgs(
        @Nullable String project,
        @Nullable String userProject) {
        this.project = project;
        this.userProject = userProject;
    }

    private GetProjectServiceAccountArgs() {
        this.project = null;
        this.userProject = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectServiceAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private @Nullable String userProject;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectServiceAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.userProject = defaults.userProject;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder userProject(@Nullable String userProject) {
            this.userProject = userProject;
            return this;
        }
        public GetProjectServiceAccountArgs build() {
            return new GetProjectServiceAccountArgs(project, userProject);
        }
    }
}
