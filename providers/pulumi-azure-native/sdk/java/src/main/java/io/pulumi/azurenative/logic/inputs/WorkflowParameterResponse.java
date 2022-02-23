// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The workflow parameters.
 * 
 */
public final class WorkflowParameterResponse extends io.pulumi.resources.InvokeArgs {

    public static final WorkflowParameterResponse Empty = new WorkflowParameterResponse();

    /**
     * The description.
     * 
     */
    @InputImport(name="description")
        private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The metadata.
     * 
     */
    @InputImport(name="metadata")
        private final @Nullable Object metadata;

    public Optional<Object> getMetadata() {
        return this.metadata == null ? Optional.empty() : Optional.ofNullable(this.metadata);
    }

    /**
     * The type.
     * 
     */
    @InputImport(name="type")
        private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * The value.
     * 
     */
    @InputImport(name="value")
        private final @Nullable Object value;

    public Optional<Object> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public WorkflowParameterResponse(
        @Nullable String description,
        @Nullable Object metadata,
        @Nullable String type,
        @Nullable Object value) {
        this.description = description;
        this.metadata = metadata;
        this.type = type;
        this.value = value;
    }

    private WorkflowParameterResponse() {
        this.description = null;
        this.metadata = null;
        this.type = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Object metadata;
        private @Nullable String type;
        private @Nullable Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.metadata = defaults.metadata;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setMetadata(@Nullable Object metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setValue(@Nullable Object value) {
            this.value = value;
            return this;
        }
        public WorkflowParameterResponse build() {
            return new WorkflowParameterResponse(description, metadata, type, value);
        }
    }
}
