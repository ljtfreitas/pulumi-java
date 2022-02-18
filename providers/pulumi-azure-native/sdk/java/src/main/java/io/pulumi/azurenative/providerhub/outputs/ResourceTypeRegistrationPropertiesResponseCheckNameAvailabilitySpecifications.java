// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceTypeRegistrationPropertiesResponseCheckNameAvailabilitySpecifications {
    private final @Nullable Boolean enableDefaultValidation;
    private final @Nullable List<String> resourceTypesWithCustomValidation;

    @OutputCustomType.Constructor({"enableDefaultValidation","resourceTypesWithCustomValidation"})
    private ResourceTypeRegistrationPropertiesResponseCheckNameAvailabilitySpecifications(
        @Nullable Boolean enableDefaultValidation,
        @Nullable List<String> resourceTypesWithCustomValidation) {
        this.enableDefaultValidation = enableDefaultValidation;
        this.resourceTypesWithCustomValidation = resourceTypesWithCustomValidation;
    }

    public Optional<Boolean> getEnableDefaultValidation() {
        return Optional.ofNullable(this.enableDefaultValidation);
    }
    public List<String> getResourceTypesWithCustomValidation() {
        return this.resourceTypesWithCustomValidation == null ? List.of() : this.resourceTypesWithCustomValidation;
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

        public Builder setEnableDefaultValidation(@Nullable Boolean enableDefaultValidation) {
            this.enableDefaultValidation = enableDefaultValidation;
            return this;
        }

        public Builder setResourceTypesWithCustomValidation(@Nullable List<String> resourceTypesWithCustomValidation) {
            this.resourceTypesWithCustomValidation = resourceTypesWithCustomValidation;
            return this;
        }

        public ResourceTypeRegistrationPropertiesResponseCheckNameAvailabilitySpecifications build() {
            return new ResourceTypeRegistrationPropertiesResponseCheckNameAvailabilitySpecifications(enableDefaultValidation, resourceTypesWithCustomValidation);
        }
    }
}
