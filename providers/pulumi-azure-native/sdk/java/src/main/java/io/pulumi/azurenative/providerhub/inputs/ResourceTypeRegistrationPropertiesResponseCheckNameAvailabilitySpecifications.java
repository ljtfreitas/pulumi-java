// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationPropertiesResponseCheckNameAvailabilitySpecifications extends io.pulumi.resources.InvokeArgs {

    public static final ResourceTypeRegistrationPropertiesResponseCheckNameAvailabilitySpecifications Empty = new ResourceTypeRegistrationPropertiesResponseCheckNameAvailabilitySpecifications();

    @Import(name="enableDefaultValidation")
      private final @Nullable Boolean enableDefaultValidation;

    public Optional<Boolean> getEnableDefaultValidation() {
        return this.enableDefaultValidation == null ? Optional.empty() : Optional.ofNullable(this.enableDefaultValidation);
    }

    @Import(name="resourceTypesWithCustomValidation")
      private final @Nullable List<String> resourceTypesWithCustomValidation;

    public List<String> getResourceTypesWithCustomValidation() {
        return this.resourceTypesWithCustomValidation == null ? List.of() : this.resourceTypesWithCustomValidation;
    }

    public ResourceTypeRegistrationPropertiesResponseCheckNameAvailabilitySpecifications(
        @Nullable Boolean enableDefaultValidation,
        @Nullable List<String> resourceTypesWithCustomValidation) {
        this.enableDefaultValidation = enableDefaultValidation;
        this.resourceTypesWithCustomValidation = resourceTypesWithCustomValidation;
    }

    private ResourceTypeRegistrationPropertiesResponseCheckNameAvailabilitySpecifications() {
        this.enableDefaultValidation = null;
        this.resourceTypesWithCustomValidation = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesResponseCheckNameAvailabilitySpecifications defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableDefaultValidation;
        private @Nullable List<String> resourceTypesWithCustomValidation;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesResponseCheckNameAvailabilitySpecifications defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDefaultValidation = defaults.enableDefaultValidation;
    	      this.resourceTypesWithCustomValidation = defaults.resourceTypesWithCustomValidation;
        }

        public Builder enableDefaultValidation(@Nullable Boolean enableDefaultValidation) {
            this.enableDefaultValidation = enableDefaultValidation;
            return this;
        }

        public Builder resourceTypesWithCustomValidation(@Nullable List<String> resourceTypesWithCustomValidation) {
            this.resourceTypesWithCustomValidation = resourceTypesWithCustomValidation;
            return this;
        }
        public ResourceTypeRegistrationPropertiesResponseCheckNameAvailabilitySpecifications build() {
            return new ResourceTypeRegistrationPropertiesResponseCheckNameAvailabilitySpecifications(enableDefaultValidation, resourceTypesWithCustomValidation);
        }
    }
}
