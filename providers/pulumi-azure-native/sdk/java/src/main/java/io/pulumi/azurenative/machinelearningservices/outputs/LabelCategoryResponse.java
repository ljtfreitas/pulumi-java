// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.LabelClassResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LabelCategoryResponse {
    /**
     * Indicates whether it is allowed to select multiple classes in this category.
     * 
     */
    private final @Nullable Boolean allowMultiSelect;
    /**
     * Dictionary of label classes in this category.
     * 
     */
    private final Map<String,LabelClassResponse> classes;
    /**
     * Display name of the label category.
     * 
     */
    private final @Nullable String displayName;

    @CustomType.Constructor
    private LabelCategoryResponse(
        @CustomType.Parameter("allowMultiSelect") @Nullable Boolean allowMultiSelect,
        @CustomType.Parameter("classes") Map<String,LabelClassResponse> classes,
        @CustomType.Parameter("displayName") @Nullable String displayName) {
        this.allowMultiSelect = allowMultiSelect;
        this.classes = classes;
        this.displayName = displayName;
    }

    /**
     * Indicates whether it is allowed to select multiple classes in this category.
     * 
    */
    public Optional<Boolean> getAllowMultiSelect() {
        return Optional.ofNullable(this.allowMultiSelect);
    }
    /**
     * Dictionary of label classes in this category.
     * 
    */
    public Map<String,LabelClassResponse> getClasses() {
        return this.classes;
    }
    /**
     * Display name of the label category.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
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

        public Builder allowMultiSelect(@Nullable Boolean allowMultiSelect) {
            this.allowMultiSelect = allowMultiSelect;
            return this;
        }

        public Builder classes(Map<String,LabelClassResponse> classes) {
            this.classes = Objects.requireNonNull(classes);
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public LabelCategoryResponse build() {
            return new LabelCategoryResponse(allowMultiSelect, classes, displayName);
        }
    }
}
