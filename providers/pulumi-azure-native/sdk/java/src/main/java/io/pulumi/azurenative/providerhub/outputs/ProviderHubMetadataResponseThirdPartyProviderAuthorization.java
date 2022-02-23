// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.azurenative.providerhub.outputs.LightHouseAuthorizationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProviderHubMetadataResponseThirdPartyProviderAuthorization {
    private final @Nullable List<LightHouseAuthorizationResponse> authorizations;
    private final @Nullable String managedByTenantId;

    @OutputCustomType.Constructor({"authorizations","managedByTenantId"})
    private ProviderHubMetadataResponseThirdPartyProviderAuthorization(
        @Nullable List<LightHouseAuthorizationResponse> authorizations,
        @Nullable String managedByTenantId) {
        this.authorizations = authorizations;
        this.managedByTenantId = managedByTenantId;
    }

    public List<LightHouseAuthorizationResponse> getAuthorizations() {
        return this.authorizations == null ? List.of() : this.authorizations;
    }
    public Optional<String> getManagedByTenantId() {
        return Optional.ofNullable(this.managedByTenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderHubMetadataResponseThirdPartyProviderAuthorization defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<LightHouseAuthorizationResponse> authorizations;
        private @Nullable String managedByTenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderHubMetadataResponseThirdPartyProviderAuthorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizations = defaults.authorizations;
    	      this.managedByTenantId = defaults.managedByTenantId;
        }

        public Builder setAuthorizations(@Nullable List<LightHouseAuthorizationResponse> authorizations) {
            this.authorizations = authorizations;
            return this;
        }

        public Builder setManagedByTenantId(@Nullable String managedByTenantId) {
            this.managedByTenantId = managedByTenantId;
            return this;
        }
        public ProviderHubMetadataResponseThirdPartyProviderAuthorization build() {
            return new ProviderHubMetadataResponseThirdPartyProviderAuthorization(authorizations, managedByTenantId);
        }
    }
}
