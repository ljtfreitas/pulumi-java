// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PolicyDefinitionGroupResponse {
    /**
     * A resource ID of a resource that contains additional metadata about the group.
     * 
     */
    private final @Nullable String additionalMetadataId;
    /**
     * The group's category.
     * 
     */
    private final @Nullable String category;
    /**
     * The group's description.
     * 
     */
    private final @Nullable String description;
    /**
     * The group's display name.
     * 
     */
    private final @Nullable String displayName;
    /**
     * The name of the group.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"additionalMetadataId","category","description","displayName","name"})
    private PolicyDefinitionGroupResponse(
        @Nullable String additionalMetadataId,
        @Nullable String category,
        @Nullable String description,
        @Nullable String displayName,
        String name) {
        this.additionalMetadataId = additionalMetadataId;
        this.category = category;
        this.description = description;
        this.displayName = displayName;
        this.name = Objects.requireNonNull(name);
    }

    /**
     * A resource ID of a resource that contains additional metadata about the group.
     * 
     */
    public Optional<String> getAdditionalMetadataId() {
        return Optional.ofNullable(this.additionalMetadataId);
    }
    /**
     * The group's category.
     * 
     */
    public Optional<String> getCategory() {
        return Optional.ofNullable(this.category);
    }
    /**
     * The group's description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The group's display name.
     * 
     */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The name of the group.
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyDefinitionGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String additionalMetadataId;
        private @Nullable String category;
        private @Nullable String description;
        private @Nullable String displayName;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyDefinitionGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalMetadataId = defaults.additionalMetadataId;
    	      this.category = defaults.category;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
        }

        public Builder setAdditionalMetadataId(@Nullable String additionalMetadataId) {
            this.additionalMetadataId = additionalMetadataId;
            return this;
        }

        public Builder setCategory(@Nullable String category) {
            this.category = category;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public PolicyDefinitionGroupResponse build() {
            return new PolicyDefinitionGroupResponse(additionalMetadataId, category, description, displayName, name);
        }
    }
}
