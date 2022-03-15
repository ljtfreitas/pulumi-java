// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.inputs.ServiceProviderPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Service Provider Definition
 * 
 */
public final class ServiceProviderResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceProviderResponse Empty = new ServiceProviderResponse();

    /**
     * The Properties of a Service Provider Object
     * 
     */
    @Import(name="properties")
      private final @Nullable ServiceProviderPropertiesResponse properties;

    public Optional<ServiceProviderPropertiesResponse> getProperties() {
        return this.properties == null ? Optional.empty() : Optional.ofNullable(this.properties);
    }

    public ServiceProviderResponse(@Nullable ServiceProviderPropertiesResponse properties) {
        this.properties = properties;
    }

    private ServiceProviderResponse() {
        this.properties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceProviderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceProviderPropertiesResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceProviderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
        }

        public Builder properties(@Nullable ServiceProviderPropertiesResponse properties) {
            this.properties = properties;
            return this;
        }
        public ServiceProviderResponse build() {
            return new ServiceProviderResponse(properties);
        }
    }
}
