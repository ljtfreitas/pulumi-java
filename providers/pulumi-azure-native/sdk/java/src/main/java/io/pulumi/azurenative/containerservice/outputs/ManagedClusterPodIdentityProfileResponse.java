// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.azurenative.containerservice.outputs.ManagedClusterPodIdentityExceptionResponse;
import io.pulumi.azurenative.containerservice.outputs.ManagedClusterPodIdentityResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedClusterPodIdentityProfileResponse {
    private final @Nullable Boolean allowNetworkPluginKubenet;
    private final @Nullable Boolean enabled;
    private final @Nullable List<ManagedClusterPodIdentityResponse> userAssignedIdentities;
    private final @Nullable List<ManagedClusterPodIdentityExceptionResponse> userAssignedIdentityExceptions;

    @OutputCustomType.Constructor({"allowNetworkPluginKubenet","enabled","userAssignedIdentities","userAssignedIdentityExceptions"})
    private ManagedClusterPodIdentityProfileResponse(
        @Nullable Boolean allowNetworkPluginKubenet,
        @Nullable Boolean enabled,
        @Nullable List<ManagedClusterPodIdentityResponse> userAssignedIdentities,
        @Nullable List<ManagedClusterPodIdentityExceptionResponse> userAssignedIdentityExceptions) {
        this.allowNetworkPluginKubenet = allowNetworkPluginKubenet;
        this.enabled = enabled;
        this.userAssignedIdentities = userAssignedIdentities;
        this.userAssignedIdentityExceptions = userAssignedIdentityExceptions;
    }

    public Optional<Boolean> getAllowNetworkPluginKubenet() {
        return Optional.ofNullable(this.allowNetworkPluginKubenet);
    }
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public List<ManagedClusterPodIdentityResponse> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? List.of() : this.userAssignedIdentities;
    }
    public List<ManagedClusterPodIdentityExceptionResponse> getUserAssignedIdentityExceptions() {
        return this.userAssignedIdentityExceptions == null ? List.of() : this.userAssignedIdentityExceptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterPodIdentityProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowNetworkPluginKubenet;
        private @Nullable Boolean enabled;
        private @Nullable List<ManagedClusterPodIdentityResponse> userAssignedIdentities;
        private @Nullable List<ManagedClusterPodIdentityExceptionResponse> userAssignedIdentityExceptions;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterPodIdentityProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowNetworkPluginKubenet = defaults.allowNetworkPluginKubenet;
    	      this.enabled = defaults.enabled;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
    	      this.userAssignedIdentityExceptions = defaults.userAssignedIdentityExceptions;
        }

        public Builder setAllowNetworkPluginKubenet(@Nullable Boolean allowNetworkPluginKubenet) {
            this.allowNetworkPluginKubenet = allowNetworkPluginKubenet;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable List<ManagedClusterPodIdentityResponse> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public Builder setUserAssignedIdentityExceptions(@Nullable List<ManagedClusterPodIdentityExceptionResponse> userAssignedIdentityExceptions) {
            this.userAssignedIdentityExceptions = userAssignedIdentityExceptions;
            return this;
        }

        public ManagedClusterPodIdentityProfileResponse build() {
            return new ManagedClusterPodIdentityProfileResponse(allowNetworkPluginKubenet, enabled, userAssignedIdentities, userAssignedIdentityExceptions);
        }
    }
}