// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs Empty = new ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs();

    @InputImport(name="enableDefaultValidation")
        private final @Nullable Input<Boolean> enableDefaultValidation;

    public Input<Boolean> getEnableDefaultValidation() {
        return this.enableDefaultValidation == null ? Input.empty() : this.enableDefaultValidation;
    }

    @InputImport(name="resourceTypesWithCustomValidation")
        private final @Nullable Input<List<String>> resourceTypesWithCustomValidation;

    public Input<List<String>> getResourceTypesWithCustomValidation() {
        return this.resourceTypesWithCustomValidation == null ? Input.empty() : this.resourceTypesWithCustomValidation;
    }

    public ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs(
        @Nullable Input<Boolean> enableDefaultValidation,
        @Nullable Input<List<String>> resourceTypesWithCustomValidation) {
        this.enableDefaultValidation = enableDefaultValidation;
        this.resourceTypesWithCustomValidation = resourceTypesWithCustomValidation;
    }

    private ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs() {
        this.enableDefaultValidation = Input.empty();
        this.resourceTypesWithCustomValidation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableDefaultValidation;
        private @Nullable Input<List<String>> resourceTypesWithCustomValidation;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDefaultValidation = defaults.enableDefaultValidation;
    	      this.resourceTypesWithCustomValidation = defaults.resourceTypesWithCustomValidation;
        }

        public Builder setEnableDefaultValidation(@Nullable Input<Boolean> enableDefaultValidation) {
            this.enableDefaultValidation = enableDefaultValidation;
            return this;
        }

        public Builder setEnableDefaultValidation(@Nullable Boolean enableDefaultValidation) {
            this.enableDefaultValidation = Input.ofNullable(enableDefaultValidation);
            return this;
        }

        public Builder setResourceTypesWithCustomValidation(@Nullable Input<List<String>> resourceTypesWithCustomValidation) {
            this.resourceTypesWithCustomValidation = resourceTypesWithCustomValidation;
            return this;
        }

        public Builder setResourceTypesWithCustomValidation(@Nullable List<String> resourceTypesWithCustomValidation) {
            this.resourceTypesWithCustomValidation = Input.ofNullable(resourceTypesWithCustomValidation);
            return this;
        }
        public ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs build() {
            return new ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs(enableDefaultValidation, resourceTypesWithCustomValidation);
        }
    }
}
