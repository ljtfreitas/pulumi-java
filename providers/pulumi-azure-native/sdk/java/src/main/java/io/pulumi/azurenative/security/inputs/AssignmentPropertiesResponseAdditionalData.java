// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Additional data about the assignment
 * 
 */
public final class AssignmentPropertiesResponseAdditionalData extends io.pulumi.resources.InvokeArgs {

    public static final AssignmentPropertiesResponseAdditionalData Empty = new AssignmentPropertiesResponseAdditionalData();

    /**
     * Exemption category of this assignment
     * 
     */
    @InputImport(name="exemptionCategory")
        private final @Nullable String exemptionCategory;

    public Optional<String> getExemptionCategory() {
        return this.exemptionCategory == null ? Optional.empty() : Optional.ofNullable(this.exemptionCategory);
    }

    public AssignmentPropertiesResponseAdditionalData(@Nullable String exemptionCategory) {
        this.exemptionCategory = exemptionCategory;
    }

    private AssignmentPropertiesResponseAdditionalData() {
        this.exemptionCategory = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentPropertiesResponseAdditionalData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String exemptionCategory;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentPropertiesResponseAdditionalData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exemptionCategory = defaults.exemptionCategory;
        }

        public Builder setExemptionCategory(@Nullable String exemptionCategory) {
            this.exemptionCategory = exemptionCategory;
            return this;
        }
        public AssignmentPropertiesResponseAdditionalData build() {
            return new AssignmentPropertiesResponseAdditionalData(exemptionCategory);
        }
    }
}
