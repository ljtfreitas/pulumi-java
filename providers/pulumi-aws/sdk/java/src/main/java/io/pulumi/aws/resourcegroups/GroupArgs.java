// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.resourcegroups;

import io.pulumi.aws.resourcegroups.inputs.GroupResourceQueryArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupArgs Empty = new GroupArgs();

    /**
     * A description of the resource group.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The resource group's name. A resource group name can have a maximum of 127 characters, including letters, numbers, hyphens, dots, and underscores. The name cannot start with `AWS` or `aws`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A `resource_query` block. Resource queries are documented below.
     * 
     */
    @Import(name="resourceQuery", required=true)
      private final Output<GroupResourceQueryArgs> resourceQuery;

    public Output<GroupResourceQueryArgs> getResourceQuery() {
        return this.resourceQuery;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public GroupArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        Output<GroupResourceQueryArgs> resourceQuery,
        @Nullable Output<Map<String,String>> tags) {
        this.description = description;
        this.name = name;
        this.resourceQuery = Objects.requireNonNull(resourceQuery, "expected parameter 'resourceQuery' to be non-null");
        this.tags = tags;
    }

    private GroupArgs() {
        this.description = Output.empty();
        this.name = Output.empty();
        this.resourceQuery = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private Output<GroupResourceQueryArgs> resourceQuery;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.resourceQuery = defaults.resourceQuery;
    	      this.tags = defaults.tags;
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

        public Builder resourceQuery(Output<GroupResourceQueryArgs> resourceQuery) {
            this.resourceQuery = Objects.requireNonNull(resourceQuery);
            return this;
        }

        public Builder resourceQuery(GroupResourceQueryArgs resourceQuery) {
            this.resourceQuery = Output.of(Objects.requireNonNull(resourceQuery));
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public GroupArgs build() {
            return new GroupArgs(description, name, resourceQuery, tags);
        }
    }
}
