// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint;

import io.pulumi.azurenative.blueprint.enums.BlueprintTargetScope;
import io.pulumi.azurenative.blueprint.inputs.ParameterDefinitionArgs;
import io.pulumi.azurenative.blueprint.inputs.ResourceGroupDefinitionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PublishedBlueprintArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublishedBlueprintArgs Empty = new PublishedBlueprintArgs();

    /**
     * Name of the published blueprint definition.
     * 
     */
    @InputImport(name="blueprintName", required=true)
        private final Input<String> blueprintName;

    public Input<String> getBlueprintName() {
        return this.blueprintName;
    }

    /**
     * Version-specific change notes.
     * 
     */
    @InputImport(name="changeNotes")
        private final @Nullable Input<String> changeNotes;

    public Input<String> getChangeNotes() {
        return this.changeNotes == null ? Input.empty() : this.changeNotes;
    }

    /**
     * Multi-line explain this resource.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * One-liner string explain this resource.
     * 
     */
    @InputImport(name="displayName")
        private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Parameters required by this blueprint definition.
     * 
     */
    @InputImport(name="parameters")
        private final @Nullable Input<Map<String,ParameterDefinitionArgs>> parameters;

    public Input<Map<String,ParameterDefinitionArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Resource group placeholders defined by this blueprint definition.
     * 
     */
    @InputImport(name="resourceGroups")
        private final @Nullable Input<Map<String,ResourceGroupDefinitionArgs>> resourceGroups;

    public Input<Map<String,ResourceGroupDefinitionArgs>> getResourceGroups() {
        return this.resourceGroups == null ? Input.empty() : this.resourceGroups;
    }

    /**
     * The scope of the resource. Valid scopes are: management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format: '/subscriptions/{subscriptionId}').
     * 
     */
    @InputImport(name="resourceScope", required=true)
        private final Input<String> resourceScope;

    public Input<String> getResourceScope() {
        return this.resourceScope;
    }

    /**
     * The scope where this blueprint definition can be assigned.
     * 
     */
    @InputImport(name="targetScope")
        private final @Nullable Input<Either<String,BlueprintTargetScope>> targetScope;

    public Input<Either<String,BlueprintTargetScope>> getTargetScope() {
        return this.targetScope == null ? Input.empty() : this.targetScope;
    }

    /**
     * Version of the published blueprint definition.
     * 
     */
    @InputImport(name="versionId")
        private final @Nullable Input<String> versionId;

    public Input<String> getVersionId() {
        return this.versionId == null ? Input.empty() : this.versionId;
    }

    public PublishedBlueprintArgs(
        Input<String> blueprintName,
        @Nullable Input<String> changeNotes,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<Map<String,ParameterDefinitionArgs>> parameters,
        @Nullable Input<Map<String,ResourceGroupDefinitionArgs>> resourceGroups,
        Input<String> resourceScope,
        @Nullable Input<Either<String,BlueprintTargetScope>> targetScope,
        @Nullable Input<String> versionId) {
        this.blueprintName = Objects.requireNonNull(blueprintName, "expected parameter 'blueprintName' to be non-null");
        this.changeNotes = changeNotes;
        this.description = description;
        this.displayName = displayName;
        this.parameters = parameters;
        this.resourceGroups = resourceGroups;
        this.resourceScope = Objects.requireNonNull(resourceScope, "expected parameter 'resourceScope' to be non-null");
        this.targetScope = targetScope;
        this.versionId = versionId;
    }

    private PublishedBlueprintArgs() {
        this.blueprintName = Input.empty();
        this.changeNotes = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.parameters = Input.empty();
        this.resourceGroups = Input.empty();
        this.resourceScope = Input.empty();
        this.targetScope = Input.empty();
        this.versionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublishedBlueprintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> blueprintName;
        private @Nullable Input<String> changeNotes;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<Map<String,ParameterDefinitionArgs>> parameters;
        private @Nullable Input<Map<String,ResourceGroupDefinitionArgs>> resourceGroups;
        private Input<String> resourceScope;
        private @Nullable Input<Either<String,BlueprintTargetScope>> targetScope;
        private @Nullable Input<String> versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(PublishedBlueprintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blueprintName = defaults.blueprintName;
    	      this.changeNotes = defaults.changeNotes;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroups = defaults.resourceGroups;
    	      this.resourceScope = defaults.resourceScope;
    	      this.targetScope = defaults.targetScope;
    	      this.versionId = defaults.versionId;
        }

        public Builder setBlueprintName(Input<String> blueprintName) {
            this.blueprintName = Objects.requireNonNull(blueprintName);
            return this;
        }

        public Builder setBlueprintName(String blueprintName) {
            this.blueprintName = Input.of(Objects.requireNonNull(blueprintName));
            return this;
        }

        public Builder setChangeNotes(@Nullable Input<String> changeNotes) {
            this.changeNotes = changeNotes;
            return this;
        }

        public Builder setChangeNotes(@Nullable String changeNotes) {
            this.changeNotes = Input.ofNullable(changeNotes);
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

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,ParameterDefinitionArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterDefinitionArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setResourceGroups(@Nullable Input<Map<String,ResourceGroupDefinitionArgs>> resourceGroups) {
            this.resourceGroups = resourceGroups;
            return this;
        }

        public Builder setResourceGroups(@Nullable Map<String,ResourceGroupDefinitionArgs> resourceGroups) {
            this.resourceGroups = Input.ofNullable(resourceGroups);
            return this;
        }

        public Builder setResourceScope(Input<String> resourceScope) {
            this.resourceScope = Objects.requireNonNull(resourceScope);
            return this;
        }

        public Builder setResourceScope(String resourceScope) {
            this.resourceScope = Input.of(Objects.requireNonNull(resourceScope));
            return this;
        }

        public Builder setTargetScope(@Nullable Input<Either<String,BlueprintTargetScope>> targetScope) {
            this.targetScope = targetScope;
            return this;
        }

        public Builder setTargetScope(@Nullable Either<String,BlueprintTargetScope> targetScope) {
            this.targetScope = Input.ofNullable(targetScope);
            return this;
        }

        public Builder setVersionId(@Nullable Input<String> versionId) {
            this.versionId = versionId;
            return this;
        }

        public Builder setVersionId(@Nullable String versionId) {
            this.versionId = Input.ofNullable(versionId);
            return this;
        }
        public PublishedBlueprintArgs build() {
            return new PublishedBlueprintArgs(blueprintName, changeNotes, description, displayName, parameters, resourceGroups, resourceScope, targetScope, versionId);
        }
    }
}
