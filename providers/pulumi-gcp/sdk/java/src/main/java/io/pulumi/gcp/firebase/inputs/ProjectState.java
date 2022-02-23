// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.firebase.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectState extends io.pulumi.resources.ResourceArgs {

    public static final ProjectState Empty = new ProjectState();

    /**
     * The GCP project display name
     * 
     */
    @InputImport(name="displayName")
        private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The number of the google project that firebase is enabled on.
     * 
     */
    @InputImport(name="projectNumber")
        private final @Nullable Input<String> projectNumber;

    public Input<String> getProjectNumber() {
        return this.projectNumber == null ? Input.empty() : this.projectNumber;
    }

    public ProjectState(
        @Nullable Input<String> displayName,
        @Nullable Input<String> project,
        @Nullable Input<String> projectNumber) {
        this.displayName = displayName;
        this.project = project;
        this.projectNumber = projectNumber;
    }

    private ProjectState() {
        this.displayName = Input.empty();
        this.project = Input.empty();
        this.projectNumber = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> project;
        private @Nullable Input<String> projectNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.project = defaults.project;
    	      this.projectNumber = defaults.projectNumber;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setProjectNumber(@Nullable Input<String> projectNumber) {
            this.projectNumber = projectNumber;
            return this;
        }

        public Builder setProjectNumber(@Nullable String projectNumber) {
            this.projectNumber = Input.ofNullable(projectNumber);
            return this;
        }
        public ProjectState build() {
            return new ProjectState(displayName, project, projectNumber);
        }
    }
}
