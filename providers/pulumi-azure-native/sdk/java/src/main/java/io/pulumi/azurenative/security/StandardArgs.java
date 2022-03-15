// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.security.inputs.StandardComponentPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StandardArgs extends io.pulumi.resources.ResourceArgs {

    public static final StandardArgs Empty = new StandardArgs();

    /**
     * category of the standard provided
     * 
     */
    @Import(name="category")
      private final @Nullable Output<String> category;

    public Output<String> getCategory() {
        return this.category == null ? Output.empty() : this.category;
    }

    /**
     * List of component objects containing component unique keys (such as assessment keys) to apply to standard scope.  Currently only supports assessment keys.
     * 
     */
    @Import(name="components")
      private final @Nullable Output<List<StandardComponentPropertiesArgs>> components;

    public Output<List<StandardComponentPropertiesArgs>> getComponents() {
        return this.components == null ? Output.empty() : this.components;
    }

    /**
     * description of the standard
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * display name of the standard, equivalent to the standardId
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Kind of the resource
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Location where the resource is stored
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Security Standard key - unique key for the standard type
     * 
     */
    @Import(name="standardId")
      private final @Nullable Output<String> standardId;

    public Output<String> getStandardId() {
        return this.standardId == null ? Output.empty() : this.standardId;
    }

    /**
     * A list of key value pairs that describe the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public StandardArgs(
        @Nullable Output<String> category,
        @Nullable Output<List<StandardComponentPropertiesArgs>> components,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<String> kind,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<String> standardId,
        @Nullable Output<Map<String,String>> tags) {
        this.category = category;
        this.components = components;
        this.description = description;
        this.displayName = displayName;
        this.kind = kind;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.standardId = standardId;
        this.tags = tags;
    }

    private StandardArgs() {
        this.category = Output.empty();
        this.components = Output.empty();
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.kind = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.standardId = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> category;
        private @Nullable Output<List<StandardComponentPropertiesArgs>> components;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> standardId;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.components = defaults.components;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.standardId = defaults.standardId;
    	      this.tags = defaults.tags;
        }

        public Builder category(@Nullable Output<String> category) {
            this.category = category;
            return this;
        }

        public Builder category(@Nullable String category) {
            this.category = Output.ofNullable(category);
            return this;
        }

        public Builder components(@Nullable Output<List<StandardComponentPropertiesArgs>> components) {
            this.components = components;
            return this;
        }

        public Builder components(@Nullable List<StandardComponentPropertiesArgs> components) {
            this.components = Output.ofNullable(components);
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

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder standardId(@Nullable Output<String> standardId) {
            this.standardId = standardId;
            return this;
        }

        public Builder standardId(@Nullable String standardId) {
            this.standardId = Output.ofNullable(standardId);
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
        public StandardArgs build() {
            return new StandardArgs(category, components, description, displayName, kind, location, resourceGroupName, standardId, tags);
        }
    }
}
