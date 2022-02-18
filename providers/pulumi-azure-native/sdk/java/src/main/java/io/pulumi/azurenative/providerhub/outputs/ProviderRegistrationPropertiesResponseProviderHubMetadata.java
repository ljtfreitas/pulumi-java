// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.azurenative.providerhub.outputs.ProviderHubMetadataResponseProviderAuthentication;
import io.pulumi.azurenative.providerhub.outputs.ProviderHubMetadataResponseThirdPartyProviderAuthorization;
import io.pulumi.azurenative.providerhub.outputs.ResourceProviderAuthorizationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProviderRegistrationPropertiesResponseProviderHubMetadata {
    private final @Nullable ProviderHubMetadataResponseProviderAuthentication providerAuthentication;
    private final @Nullable List<ResourceProviderAuthorizationResponse> providerAuthorizations;
    private final @Nullable ProviderHubMetadataResponseThirdPartyProviderAuthorization thirdPartyProviderAuthorization;

    @OutputCustomType.Constructor({"providerAuthentication","providerAuthorizations","thirdPartyProviderAuthorization"})
    private ProviderRegistrationPropertiesResponseProviderHubMetadata(
        @Nullable ProviderHubMetadataResponseProviderAuthentication providerAuthentication,
        @Nullable List<ResourceProviderAuthorizationResponse> providerAuthorizations,
        @Nullable ProviderHubMetadataResponseThirdPartyProviderAuthorization thirdPartyProviderAuthorization) {
        this.providerAuthentication = providerAuthentication;
        this.providerAuthorizations = providerAuthorizations;
        this.thirdPartyProviderAuthorization = thirdPartyProviderAuthorization;
    }

    public Optional<ProviderHubMetadataResponseProviderAuthentication> getProviderAuthentication() {
        return Optional.ofNullable(this.providerAuthentication);
    }
    public List<ResourceProviderAuthorizationResponse> getProviderAuthorizations() {
        return this.providerAuthorizations == null ? List.of() : this.providerAuthorizations;
    }
    public Optional<ProviderHubMetadataResponseThirdPartyProviderAuthorization> getThirdPartyProviderAuthorization() {
        return Optional.ofNullable(this.thirdPartyProviderAuthorization);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderRegistrationPropertiesResponseProviderHubMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ProviderHubMetadataResponseProviderAuthentication providerAuthentication;
        private @Nullable List<ResourceProviderAuthorizationResponse> providerAuthorizations;
        private @Nullable ProviderHubMetadataResponseThirdPartyProviderAuthorization thirdPartyProviderAuthorization;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderRegistrationPropertiesResponseProviderHubMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.providerAuthentication = defaults.providerAuthentication;
    	      this.providerAuthorizations = defaults.providerAuthorizations;
    	      this.thirdPartyProviderAuthorization = defaults.thirdPartyProviderAuthorization;
        }

        public Builder setProviderAuthentication(@Nullable ProviderHubMetadataResponseProviderAuthentication providerAuthentication) {
            this.providerAuthentication = providerAuthentication;
            return this;
        }

        public Builder setProviderAuthorizations(@Nullable List<ResourceProviderAuthorizationResponse> providerAuthorizations) {
            this.providerAuthorizations = providerAuthorizations;
            return this;
        }

        public Builder setThirdPartyProviderAuthorization(@Nullable ProviderHubMetadataResponseThirdPartyProviderAuthorization thirdPartyProviderAuthorization) {
            this.thirdPartyProviderAuthorization = thirdPartyProviderAuthorization;
            return this;
        }

        public ProviderRegistrationPropertiesResponseProviderHubMetadata build() {
            return new ProviderRegistrationPropertiesResponseProviderHubMetadata(providerAuthentication, providerAuthorizations, thirdPartyProviderAuthorization);
        }
    }
}
