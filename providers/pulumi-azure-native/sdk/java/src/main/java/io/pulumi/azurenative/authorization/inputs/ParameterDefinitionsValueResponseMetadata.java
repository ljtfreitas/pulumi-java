// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * General metadata for the parameter.
 * 
 */
public final class ParameterDefinitionsValueResponseMetadata extends io.pulumi.resources.InvokeArgs {

    public static final ParameterDefinitionsValueResponseMetadata Empty = new ParameterDefinitionsValueResponseMetadata();

    /**
     * Set to true to have Azure portal create role assignments on the resource ID or resource scope value of this parameter during policy assignment. This property is useful in case you wish to assign permissions outside the assignment scope.
     * 
     */
    @InputImport(name="assignPermissions")
        private final @Nullable Boolean assignPermissions;

    public Optional<Boolean> getAssignPermissions() {
        return this.assignPermissions == null ? Optional.empty() : Optional.ofNullable(this.assignPermissions);
    }

    /**
     * The description of the parameter.
     * 
     */
    @InputImport(name="description")
        private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The display name for the parameter.
     * 
     */
    @InputImport(name="displayName")
        private final @Nullable String displayName;

    public Optional<String> getDisplayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * Used when assigning the policy definition through the portal. Provides a context aware list of values for the user to choose from.
     * 
     */
    @InputImport(name="strongType")
        private final @Nullable String strongType;

    public Optional<String> getStrongType() {
        return this.strongType == null ? Optional.empty() : Optional.ofNullable(this.strongType);
    }

    public ParameterDefinitionsValueResponseMetadata(
        @Nullable Boolean assignPermissions,
        @Nullable String description,
        @Nullable String displayName,
        @Nullable String strongType) {
        this.assignPermissions = assignPermissions;
        this.description = description;
        this.displayName = displayName;
        this.strongType = strongType;
    }

    private ParameterDefinitionsValueResponseMetadata() {
        this.assignPermissions = null;
        this.description = null;
        this.displayName = null;
        this.strongType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterDefinitionsValueResponseMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean assignPermissions;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable String strongType;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterDefinitionsValueResponseMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignPermissions = defaults.assignPermissions;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.strongType = defaults.strongType;
        }

        public Builder setAssignPermissions(@Nullable Boolean assignPermissions) {
            this.assignPermissions = assignPermissions;
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

        public Builder setStrongType(@Nullable String strongType) {
            this.strongType = strongType;
            return this;
        }
        public ParameterDefinitionsValueResponseMetadata build() {
            return new ParameterDefinitionsValueResponseMetadata(assignPermissions, description, displayName, strongType);
        }
    }
}
