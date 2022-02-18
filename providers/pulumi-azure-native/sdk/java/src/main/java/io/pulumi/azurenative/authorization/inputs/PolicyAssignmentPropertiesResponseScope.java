// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the resource scope
 * 
 */
public final class PolicyAssignmentPropertiesResponseScope extends io.pulumi.resources.InvokeArgs {

    public static final PolicyAssignmentPropertiesResponseScope Empty = new PolicyAssignmentPropertiesResponseScope();

    /**
     * Display name of the resource
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable String displayName;

    public Optional<String> getDisplayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * Scope id of the resource
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Type of the resource
     * 
     */
    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public PolicyAssignmentPropertiesResponseScope(
        @Nullable String displayName,
        @Nullable String id,
        @Nullable String type) {
        this.displayName = displayName;
        this.id = id;
        this.type = type;
    }

    private PolicyAssignmentPropertiesResponseScope() {
        this.displayName = null;
        this.id = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAssignmentPropertiesResponseScope defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable String id;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAssignmentPropertiesResponseScope defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public PolicyAssignmentPropertiesResponseScope build() {
            return new PolicyAssignmentPropertiesResponseScope(displayName, id, type);
        }
    }
}
