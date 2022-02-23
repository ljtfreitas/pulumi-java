// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.artifactregistry.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.artifactregistry.inputs.RepositoryIamBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryIamBindingState extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryIamBindingState Empty = new RepositoryIamBindingState();

    @InputImport(name="condition")
        private final @Nullable Input<RepositoryIamBindingConditionGetArgs> condition;

    public Input<RepositoryIamBindingConditionGetArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @InputImport(name="etag")
        private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * The name of the location this repository is located in.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="members")
        private final @Nullable Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members == null ? Input.empty() : this.members;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="repository")
        private final @Nullable Input<String> repository;

    public Input<String> getRepository() {
        return this.repository == null ? Input.empty() : this.repository;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.artifactregistry.RepositoryIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
        private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public RepositoryIamBindingState(
        @Nullable Input<RepositoryIamBindingConditionGetArgs> condition,
        @Nullable Input<String> etag,
        @Nullable Input<String> location,
        @Nullable Input<List<String>> members,
        @Nullable Input<String> project,
        @Nullable Input<String> repository,
        @Nullable Input<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.location = location;
        this.members = members;
        this.project = project;
        this.repository = repository;
        this.role = role;
    }

    private RepositoryIamBindingState() {
        this.condition = Input.empty();
        this.etag = Input.empty();
        this.location = Input.empty();
        this.members = Input.empty();
        this.project = Input.empty();
        this.repository = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RepositoryIamBindingConditionGetArgs> condition;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> location;
        private @Nullable Input<List<String>> members;
        private @Nullable Input<String> project;
        private @Nullable Input<String> repository;
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryIamBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.repository = defaults.repository;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<RepositoryIamBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable RepositoryIamBindingConditionGetArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMembers(@Nullable Input<List<String>> members) {
            this.members = members;
            return this;
        }

        public Builder setMembers(@Nullable List<String> members) {
            this.members = Input.ofNullable(members);
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

        public Builder setRepository(@Nullable Input<String> repository) {
            this.repository = repository;
            return this;
        }

        public Builder setRepository(@Nullable String repository) {
            this.repository = Input.ofNullable(repository);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }
        public RepositoryIamBindingState build() {
            return new RepositoryIamBindingState(condition, etag, location, members, project, repository, role);
        }
    }
}
