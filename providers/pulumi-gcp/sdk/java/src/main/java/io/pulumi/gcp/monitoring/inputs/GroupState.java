// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupState extends io.pulumi.resources.ResourceArgs {

    public static final GroupState Empty = new GroupState();

    /**
     * A user-assigned name for this group, used only for display
     * purposes.
     * 
     */
    @InputImport(name="displayName")
        private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The filter used to determine which monitored resources
     * belong to this group.
     * 
     */
    @InputImport(name="filter")
        private final @Nullable Input<String> filter;

    public Input<String> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * If true, the members of this group are considered to be a
     * cluster. The system can perform additional analysis on
     * groups that are clusters.
     * 
     */
    @InputImport(name="isCluster")
        private final @Nullable Input<Boolean> isCluster;

    public Input<Boolean> getIsCluster() {
        return this.isCluster == null ? Input.empty() : this.isCluster;
    }

    /**
     * A unique identifier for this group. The format is "projects/{project_id_or_number}/groups/{group_id}".
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the group's parent, if it has one. The format is
     * "projects/{project_id_or_number}/groups/{group_id}". For
     * groups with no parent, parentName is the empty string, "".
     * 
     */
    @InputImport(name="parentName")
        private final @Nullable Input<String> parentName;

    public Input<String> getParentName() {
        return this.parentName == null ? Input.empty() : this.parentName;
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

    public GroupState(
        @Nullable Input<String> displayName,
        @Nullable Input<String> filter,
        @Nullable Input<Boolean> isCluster,
        @Nullable Input<String> name,
        @Nullable Input<String> parentName,
        @Nullable Input<String> project) {
        this.displayName = displayName;
        this.filter = filter;
        this.isCluster = isCluster;
        this.name = name;
        this.parentName = parentName;
        this.project = project;
    }

    private GroupState() {
        this.displayName = Input.empty();
        this.filter = Input.empty();
        this.isCluster = Input.empty();
        this.name = Input.empty();
        this.parentName = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> filter;
        private @Nullable Input<Boolean> isCluster;
        private @Nullable Input<String> name;
        private @Nullable Input<String> parentName;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.filter = defaults.filter;
    	      this.isCluster = defaults.isCluster;
    	      this.name = defaults.name;
    	      this.parentName = defaults.parentName;
    	      this.project = defaults.project;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setFilter(@Nullable Input<String> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable String filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setIsCluster(@Nullable Input<Boolean> isCluster) {
            this.isCluster = isCluster;
            return this;
        }

        public Builder setIsCluster(@Nullable Boolean isCluster) {
            this.isCluster = Input.ofNullable(isCluster);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setParentName(@Nullable Input<String> parentName) {
            this.parentName = parentName;
            return this;
        }

        public Builder setParentName(@Nullable String parentName) {
            this.parentName = Input.ofNullable(parentName);
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
        public GroupState build() {
            return new GroupState(displayName, filter, isCluster, name, parentName, project);
        }
    }
}
