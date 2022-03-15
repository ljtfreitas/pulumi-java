// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.DefaultRolloutSpecificationResponseCanary;
import io.pulumi.azurenative.providerhub.inputs.DefaultRolloutSpecificationResponseHighTraffic;
import io.pulumi.azurenative.providerhub.inputs.DefaultRolloutSpecificationResponseLowTraffic;
import io.pulumi.azurenative.providerhub.inputs.DefaultRolloutSpecificationResponseMediumTraffic;
import io.pulumi.azurenative.providerhub.inputs.DefaultRolloutSpecificationResponseProviderRegistration;
import io.pulumi.azurenative.providerhub.inputs.DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne;
import io.pulumi.azurenative.providerhub.inputs.DefaultRolloutSpecificationResponseRestOfTheWorldGroupTwo;
import io.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationResponse;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefaultRolloutPropertiesResponseSpecification extends io.pulumi.resources.InvokeArgs {

    public static final DefaultRolloutPropertiesResponseSpecification Empty = new DefaultRolloutPropertiesResponseSpecification();

    @Import(name="canary")
      private final @Nullable DefaultRolloutSpecificationResponseCanary canary;

    public Optional<DefaultRolloutSpecificationResponseCanary> getCanary() {
        return this.canary == null ? Optional.empty() : Optional.ofNullable(this.canary);
    }

    @Import(name="highTraffic")
      private final @Nullable DefaultRolloutSpecificationResponseHighTraffic highTraffic;

    public Optional<DefaultRolloutSpecificationResponseHighTraffic> getHighTraffic() {
        return this.highTraffic == null ? Optional.empty() : Optional.ofNullable(this.highTraffic);
    }

    @Import(name="lowTraffic")
      private final @Nullable DefaultRolloutSpecificationResponseLowTraffic lowTraffic;

    public Optional<DefaultRolloutSpecificationResponseLowTraffic> getLowTraffic() {
        return this.lowTraffic == null ? Optional.empty() : Optional.ofNullable(this.lowTraffic);
    }

    @Import(name="mediumTraffic")
      private final @Nullable DefaultRolloutSpecificationResponseMediumTraffic mediumTraffic;

    public Optional<DefaultRolloutSpecificationResponseMediumTraffic> getMediumTraffic() {
        return this.mediumTraffic == null ? Optional.empty() : Optional.ofNullable(this.mediumTraffic);
    }

    @Import(name="providerRegistration")
      private final @Nullable DefaultRolloutSpecificationResponseProviderRegistration providerRegistration;

    public Optional<DefaultRolloutSpecificationResponseProviderRegistration> getProviderRegistration() {
        return this.providerRegistration == null ? Optional.empty() : Optional.ofNullable(this.providerRegistration);
    }

    @Import(name="resourceTypeRegistrations")
      private final @Nullable List<ResourceTypeRegistrationResponse> resourceTypeRegistrations;

    public List<ResourceTypeRegistrationResponse> getResourceTypeRegistrations() {
        return this.resourceTypeRegistrations == null ? List.of() : this.resourceTypeRegistrations;
    }

    @Import(name="restOfTheWorldGroupOne")
      private final @Nullable DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne restOfTheWorldGroupOne;

    public Optional<DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne> getRestOfTheWorldGroupOne() {
        return this.restOfTheWorldGroupOne == null ? Optional.empty() : Optional.ofNullable(this.restOfTheWorldGroupOne);
    }

    @Import(name="restOfTheWorldGroupTwo")
      private final @Nullable DefaultRolloutSpecificationResponseRestOfTheWorldGroupTwo restOfTheWorldGroupTwo;

    public Optional<DefaultRolloutSpecificationResponseRestOfTheWorldGroupTwo> getRestOfTheWorldGroupTwo() {
        return this.restOfTheWorldGroupTwo == null ? Optional.empty() : Optional.ofNullable(this.restOfTheWorldGroupTwo);
    }

    public DefaultRolloutPropertiesResponseSpecification(
        @Nullable DefaultRolloutSpecificationResponseCanary canary,
        @Nullable DefaultRolloutSpecificationResponseHighTraffic highTraffic,
        @Nullable DefaultRolloutSpecificationResponseLowTraffic lowTraffic,
        @Nullable DefaultRolloutSpecificationResponseMediumTraffic mediumTraffic,
        @Nullable DefaultRolloutSpecificationResponseProviderRegistration providerRegistration,
        @Nullable List<ResourceTypeRegistrationResponse> resourceTypeRegistrations,
        @Nullable DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne restOfTheWorldGroupOne,
        @Nullable DefaultRolloutSpecificationResponseRestOfTheWorldGroupTwo restOfTheWorldGroupTwo) {
        this.canary = canary;
        this.highTraffic = highTraffic;
        this.lowTraffic = lowTraffic;
        this.mediumTraffic = mediumTraffic;
        this.providerRegistration = providerRegistration;
        this.resourceTypeRegistrations = resourceTypeRegistrations;
        this.restOfTheWorldGroupOne = restOfTheWorldGroupOne;
        this.restOfTheWorldGroupTwo = restOfTheWorldGroupTwo;
    }

    private DefaultRolloutPropertiesResponseSpecification() {
        this.canary = null;
        this.highTraffic = null;
        this.lowTraffic = null;
        this.mediumTraffic = null;
        this.providerRegistration = null;
        this.resourceTypeRegistrations = List.of();
        this.restOfTheWorldGroupOne = null;
        this.restOfTheWorldGroupTwo = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultRolloutPropertiesResponseSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DefaultRolloutSpecificationResponseCanary canary;
        private @Nullable DefaultRolloutSpecificationResponseHighTraffic highTraffic;
        private @Nullable DefaultRolloutSpecificationResponseLowTraffic lowTraffic;
        private @Nullable DefaultRolloutSpecificationResponseMediumTraffic mediumTraffic;
        private @Nullable DefaultRolloutSpecificationResponseProviderRegistration providerRegistration;
        private @Nullable List<ResourceTypeRegistrationResponse> resourceTypeRegistrations;
        private @Nullable DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne restOfTheWorldGroupOne;
        private @Nullable DefaultRolloutSpecificationResponseRestOfTheWorldGroupTwo restOfTheWorldGroupTwo;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultRolloutPropertiesResponseSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canary = defaults.canary;
    	      this.highTraffic = defaults.highTraffic;
    	      this.lowTraffic = defaults.lowTraffic;
    	      this.mediumTraffic = defaults.mediumTraffic;
    	      this.providerRegistration = defaults.providerRegistration;
    	      this.resourceTypeRegistrations = defaults.resourceTypeRegistrations;
    	      this.restOfTheWorldGroupOne = defaults.restOfTheWorldGroupOne;
    	      this.restOfTheWorldGroupTwo = defaults.restOfTheWorldGroupTwo;
        }

        public Builder canary(@Nullable DefaultRolloutSpecificationResponseCanary canary) {
            this.canary = canary;
            return this;
        }

        public Builder highTraffic(@Nullable DefaultRolloutSpecificationResponseHighTraffic highTraffic) {
            this.highTraffic = highTraffic;
            return this;
        }

        public Builder lowTraffic(@Nullable DefaultRolloutSpecificationResponseLowTraffic lowTraffic) {
            this.lowTraffic = lowTraffic;
            return this;
        }

        public Builder mediumTraffic(@Nullable DefaultRolloutSpecificationResponseMediumTraffic mediumTraffic) {
            this.mediumTraffic = mediumTraffic;
            return this;
        }

        public Builder providerRegistration(@Nullable DefaultRolloutSpecificationResponseProviderRegistration providerRegistration) {
            this.providerRegistration = providerRegistration;
            return this;
        }

        public Builder resourceTypeRegistrations(@Nullable List<ResourceTypeRegistrationResponse> resourceTypeRegistrations) {
            this.resourceTypeRegistrations = resourceTypeRegistrations;
            return this;
        }

        public Builder restOfTheWorldGroupOne(@Nullable DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne restOfTheWorldGroupOne) {
            this.restOfTheWorldGroupOne = restOfTheWorldGroupOne;
            return this;
        }

        public Builder restOfTheWorldGroupTwo(@Nullable DefaultRolloutSpecificationResponseRestOfTheWorldGroupTwo restOfTheWorldGroupTwo) {
            this.restOfTheWorldGroupTwo = restOfTheWorldGroupTwo;
            return this;
        }
        public DefaultRolloutPropertiesResponseSpecification build() {
            return new DefaultRolloutPropertiesResponseSpecification(canary, highTraffic, lowTraffic, mediumTraffic, providerRegistration, resourceTypeRegistrations, restOfTheWorldGroupOne, restOfTheWorldGroupTwo);
        }
    }
}
