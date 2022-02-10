// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningexperimentation;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    @InputImport(name="accountName", required=true)
    private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="friendlyName", required=true)
    private final Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName;
    }

    @InputImport(name="gitrepo")
    private final @Nullable Input<String> gitrepo;

    public Input<String> getGitrepo() {
        return this.gitrepo == null ? Input.empty() : this.gitrepo;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="projectName")
    private final @Nullable Input<String> projectName;

    public Input<String> getProjectName() {
        return this.projectName == null ? Input.empty() : this.projectName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public ProjectArgs(
        Input<String> accountName,
        @Nullable Input<String> description,
        Input<String> friendlyName,
        @Nullable Input<String> gitrepo,
        @Nullable Input<String> location,
        @Nullable Input<String> projectName,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        Input<String> workspaceName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.description = description;
        this.friendlyName = Objects.requireNonNull(friendlyName, "expected parameter 'friendlyName' to be non-null");
        this.gitrepo = gitrepo;
        this.location = location;
        this.projectName = projectName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private ProjectArgs() {
        this.accountName = Input.empty();
        this.description = Input.empty();
        this.friendlyName = Input.empty();
        this.gitrepo = Input.empty();
        this.location = Input.empty();
        this.projectName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> description;
        private Input<String> friendlyName;
        private @Nullable Input<String> gitrepo;
        private @Nullable Input<String> location;
        private @Nullable Input<String> projectName;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.description = defaults.description;
    	      this.friendlyName = defaults.friendlyName;
    	      this.gitrepo = defaults.gitrepo;
    	      this.location = defaults.location;
    	      this.projectName = defaults.projectName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFriendlyName(Input<String> friendlyName) {
            this.friendlyName = Objects.requireNonNull(friendlyName);
            return this;
        }

        public Builder setFriendlyName(String friendlyName) {
            this.friendlyName = Input.of(Objects.requireNonNull(friendlyName));
            return this;
        }

        public Builder setGitrepo(@Nullable Input<String> gitrepo) {
            this.gitrepo = gitrepo;
            return this;
        }

        public Builder setGitrepo(@Nullable String gitrepo) {
            this.gitrepo = Input.ofNullable(gitrepo);
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

        public Builder setProjectName(@Nullable Input<String> projectName) {
            this.projectName = projectName;
            return this;
        }

        public Builder setProjectName(@Nullable String projectName) {
            this.projectName = Input.ofNullable(projectName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public ProjectArgs build() {
            return new ProjectArgs(accountName, description, friendlyName, gitrepo, location, projectName, resourceGroupName, tags, workspaceName);
        }
    }
}