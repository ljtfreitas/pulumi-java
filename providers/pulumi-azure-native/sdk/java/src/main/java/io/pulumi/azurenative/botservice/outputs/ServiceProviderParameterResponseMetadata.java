// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.azurenative.botservice.outputs.ServiceProviderParameterResponseConstraints;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceProviderParameterResponseMetadata {
    /**
     * the constraints of the bot meta data.
     * 
     */
    private final @Nullable ServiceProviderParameterResponseConstraints constraints;

    @CustomType.Constructor
    private ServiceProviderParameterResponseMetadata(@CustomType.Parameter("constraints") @Nullable ServiceProviderParameterResponseConstraints constraints) {
        this.constraints = constraints;
    }

    /**
     * the constraints of the bot meta data.
     * 
    */
    public Optional<ServiceProviderParameterResponseConstraints> getConstraints() {
        return Optional.ofNullable(this.constraints);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceProviderParameterResponseMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceProviderParameterResponseConstraints constraints;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceProviderParameterResponseMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constraints = defaults.constraints;
        }

        public Builder constraints(@Nullable ServiceProviderParameterResponseConstraints constraints) {
            this.constraints = constraints;
            return this;
        }
        public ServiceProviderParameterResponseMetadata build() {
            return new ServiceProviderParameterResponseMetadata(constraints);
        }
    }
}
