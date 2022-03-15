// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.azurenative.providerhub.outputs.ResourceTypeExtensionOptionsResponseResourceCreationBegin;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceTypeRegistrationPropertiesResponseExtensionOptions {
    private final @Nullable ResourceTypeExtensionOptionsResponseResourceCreationBegin resourceCreationBegin;

    @CustomType.Constructor
    private ResourceTypeRegistrationPropertiesResponseExtensionOptions(@CustomType.Parameter("resourceCreationBegin") @Nullable ResourceTypeExtensionOptionsResponseResourceCreationBegin resourceCreationBegin) {
        this.resourceCreationBegin = resourceCreationBegin;
    }

    public Optional<ResourceTypeExtensionOptionsResponseResourceCreationBegin> getResourceCreationBegin() {
        return Optional.ofNullable(this.resourceCreationBegin);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesResponseExtensionOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResourceTypeExtensionOptionsResponseResourceCreationBegin resourceCreationBegin;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesResponseExtensionOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceCreationBegin = defaults.resourceCreationBegin;
        }

        public Builder resourceCreationBegin(@Nullable ResourceTypeExtensionOptionsResponseResourceCreationBegin resourceCreationBegin) {
            this.resourceCreationBegin = resourceCreationBegin;
            return this;
        }
        public ResourceTypeRegistrationPropertiesResponseExtensionOptions build() {
            return new ResourceTypeRegistrationPropertiesResponseExtensionOptions(resourceCreationBegin);
        }
    }
}
