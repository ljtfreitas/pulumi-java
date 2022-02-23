// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.LabelClassResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a category of labels in a labeling job.
 * 
 */
public final class LabelCategoryResponse extends io.pulumi.resources.InvokeArgs {

    public static final LabelCategoryResponse Empty = new LabelCategoryResponse();

    /**
     * Indicates whether it is allowed to select multiple classes in this category.
     * 
     */
    @InputImport(name="allowMultiSelect")
        private final @Nullable Boolean allowMultiSelect;

    public Optional<Boolean> getAllowMultiSelect() {
        return this.allowMultiSelect == null ? Optional.empty() : Optional.ofNullable(this.allowMultiSelect);
    }

    /**
     * Dictionary of label classes in this category.
     * 
     */
    @InputImport(name="classes", required=true)
        private final Map<String,LabelClassResponse> classes;

    public Map<String,LabelClassResponse> getClasses() {
        return this.classes;
    }

    /**
     * Display name of the label category.
     * 
     */
    @InputImport(name="displayName")
        private final @Nullable String displayName;

    public Optional<String> getDisplayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    public LabelCategoryResponse(
        @Nullable Boolean allowMultiSelect,
        Map<String,LabelClassResponse> classes,
        @Nullable String displayName) {
        this.allowMultiSelect = allowMultiSelect;
        this.classes = Objects.requireNonNull(classes, "expected parameter 'classes' to be non-null");
        this.displayName = displayName;
    }

    private LabelCategoryResponse() {
        this.allowMultiSelect = null;
        this.classes = Map.of();
        this.displayName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelCategoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowMultiSelect;
        private Map<String,LabelClassResponse> classes;
        private @Nullable String displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelCategoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowMultiSelect = defaults.allowMultiSelect;
    	      this.classes = defaults.classes;
    	      this.displayName = defaults.displayName;
        }

        public Builder setAllowMultiSelect(@Nullable Boolean allowMultiSelect) {
            this.allowMultiSelect = allowMultiSelect;
            return this;
        }

        public Builder setClasses(Map<String,LabelClassResponse> classes) {
            this.classes = Objects.requireNonNull(classes);
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public LabelCategoryResponse build() {
            return new LabelCategoryResponse(allowMultiSelect, classes, displayName);
        }
    }
}
