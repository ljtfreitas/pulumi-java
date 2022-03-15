// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resourcegroups;

import io.pulumi.awsnative.resourcegroups.inputs.GroupConfigurationItemArgs;
import io.pulumi.awsnative.resourcegroups.inputs.GroupResourceQueryArgs;
import io.pulumi.awsnative.resourcegroups.inputs.GroupTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupArgs Empty = new GroupArgs();

    @Import(name="configuration")
      private final @Nullable Output<List<GroupConfigurationItemArgs>> configuration;

    public Output<List<GroupConfigurationItemArgs>> getConfiguration() {
        return this.configuration == null ? Output.empty() : this.configuration;
    }

    /**
     * The description of the resource group
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The name of the resource group
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="resourceQuery")
      private final @Nullable Output<GroupResourceQueryArgs> resourceQuery;

    public Output<GroupResourceQueryArgs> getResourceQuery() {
        return this.resourceQuery == null ? Output.empty() : this.resourceQuery;
    }

    @Import(name="resources")
      private final @Nullable Output<List<String>> resources;

    public Output<List<String>> getResources() {
        return this.resources == null ? Output.empty() : this.resources;
    }

    @Import(name="tags")
      private final @Nullable Output<List<GroupTagArgs>> tags;

    public Output<List<GroupTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public GroupArgs(
        @Nullable Output<List<GroupConfigurationItemArgs>> configuration,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<GroupResourceQueryArgs> resourceQuery,
        @Nullable Output<List<String>> resources,
        @Nullable Output<List<GroupTagArgs>> tags) {
        this.configuration = configuration;
        this.description = description;
        this.name = name;
        this.resourceQuery = resourceQuery;
        this.resources = resources;
        this.tags = tags;
    }

    private GroupArgs() {
        this.configuration = Output.empty();
        this.description = Output.empty();
        this.name = Output.empty();
        this.resourceQuery = Output.empty();
        this.resources = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GroupConfigurationItemArgs>> configuration;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<GroupResourceQueryArgs> resourceQuery;
        private @Nullable Output<List<String>> resources;
        private @Nullable Output<List<GroupTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.resourceQuery = defaults.resourceQuery;
    	      this.resources = defaults.resources;
    	      this.tags = defaults.tags;
        }

        public Builder configuration(@Nullable Output<List<GroupConfigurationItemArgs>> configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder configuration(@Nullable List<GroupConfigurationItemArgs> configuration) {
            this.configuration = Output.ofNullable(configuration);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder resourceQuery(@Nullable Output<GroupResourceQueryArgs> resourceQuery) {
            this.resourceQuery = resourceQuery;
            return this;
        }

        public Builder resourceQuery(@Nullable GroupResourceQueryArgs resourceQuery) {
            this.resourceQuery = Output.ofNullable(resourceQuery);
            return this;
        }

        public Builder resources(@Nullable Output<List<String>> resources) {
            this.resources = resources;
            return this;
        }

        public Builder resources(@Nullable List<String> resources) {
            this.resources = Output.ofNullable(resources);
            return this;
        }

        public Builder tags(@Nullable Output<List<GroupTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<GroupTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public GroupArgs build() {
            return new GroupArgs(configuration, description, name, resourceQuery, resources, tags);
        }
    }
}
