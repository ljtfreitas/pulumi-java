// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.resourcegroups;

import io.pulumi.aws.resourcegroups.inputs.GroupResourceQueryArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
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
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The resource group's name. A resource group name can have a maximum of 127 characters, including letters, numbers, hyphens, dots, and underscores. The name cannot start with `AWS` or `aws`.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A `resource_query` block. Resource queries are documented below.
     * 
     */
    @InputImport(name="resourceQuery", required=true)
    private final Input<GroupResourceQueryArgs> resourceQuery;

    public Input<GroupResourceQueryArgs> getResourceQuery() {
        return this.resourceQuery;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public GroupArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        Input<GroupResourceQueryArgs> resourceQuery,
        @Nullable Input<Map<String,String>> tags) {
        this.description = description;
        this.name = name;
        this.resourceQuery = Objects.requireNonNull(resourceQuery, "expected parameter 'resourceQuery' to be non-null");
        this.tags = tags;
    }

    private GroupArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.resourceQuery = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private Input<GroupResourceQueryArgs> resourceQuery;
        private @Nullable Input<Map<String,String>> tags;

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

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder setResourceQuery(Input<GroupResourceQueryArgs> resourceQuery) {
            this.resourceQuery = Objects.requireNonNull(resourceQuery);
            return this;
        }

        public Builder setResourceQuery(GroupResourceQueryArgs resourceQuery) {
            this.resourceQuery = Input.of(Objects.requireNonNull(resourceQuery));
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
        public GroupArgs build() {
            return new GroupArgs(description, name, resourceQuery, tags);
        }
    }
}
