// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.azurenative.containerservice.outputs.OpenShiftManagedClusterIdentityProviderResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class OpenShiftManagedClusterAuthProfileResponse {
    /**
     * Type of authentication profile to use.
     * 
     */
    private final @Nullable List<OpenShiftManagedClusterIdentityProviderResponse> identityProviders;

    @CustomType.Constructor
    private OpenShiftManagedClusterAuthProfileResponse(@CustomType.Parameter("identityProviders") @Nullable List<OpenShiftManagedClusterIdentityProviderResponse> identityProviders) {
        this.identityProviders = identityProviders;
    }

    /**
     * Type of authentication profile to use.
     * 
    */
    public List<OpenShiftManagedClusterIdentityProviderResponse> getIdentityProviders() {
        return this.identityProviders == null ? List.of() : this.identityProviders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenShiftManagedClusterAuthProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<OpenShiftManagedClusterIdentityProviderResponse> identityProviders;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenShiftManagedClusterAuthProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityProviders = defaults.identityProviders;
        }

        public Builder identityProviders(@Nullable List<OpenShiftManagedClusterIdentityProviderResponse> identityProviders) {
            this.identityProviders = identityProviders;
            return this;
        }
        public OpenShiftManagedClusterAuthProfileResponse build() {
            return new OpenShiftManagedClusterAuthProfileResponse(identityProviders);
        }
    }
}
