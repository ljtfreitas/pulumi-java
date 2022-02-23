// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.ResourceTypeEndpointResponseFeaturesRule;
import io.pulumi.azurenative.providerhub.inputs.ResourceTypeExtensionResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceTypeEndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceTypeEndpointResponse Empty = new ResourceTypeEndpointResponse();

    @InputImport(name="apiVersions")
        private final @Nullable List<String> apiVersions;

    public List<String> getApiVersions() {
        return this.apiVersions == null ? List.of() : this.apiVersions;
    }

    @InputImport(name="enabled")
        private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    @InputImport(name="extensions")
        private final @Nullable List<ResourceTypeExtensionResponse> extensions;

    public List<ResourceTypeExtensionResponse> getExtensions() {
        return this.extensions == null ? List.of() : this.extensions;
    }

    @InputImport(name="featuresRule")
        private final @Nullable ResourceTypeEndpointResponseFeaturesRule featuresRule;

    public Optional<ResourceTypeEndpointResponseFeaturesRule> getFeaturesRule() {
        return this.featuresRule == null ? Optional.empty() : Optional.ofNullable(this.featuresRule);
    }

    @InputImport(name="locations")
        private final @Nullable List<String> locations;

    public List<String> getLocations() {
        return this.locations == null ? List.of() : this.locations;
    }

    @InputImport(name="requiredFeatures")
        private final @Nullable List<String> requiredFeatures;

    public List<String> getRequiredFeatures() {
        return this.requiredFeatures == null ? List.of() : this.requiredFeatures;
    }

    @InputImport(name="timeout")
        private final @Nullable String timeout;

    public Optional<String> getTimeout() {
        return this.timeout == null ? Optional.empty() : Optional.ofNullable(this.timeout);
    }

    public ResourceTypeEndpointResponse(
        @Nullable List<String> apiVersions,
        @Nullable Boolean enabled,
        @Nullable List<ResourceTypeExtensionResponse> extensions,
        @Nullable ResourceTypeEndpointResponseFeaturesRule featuresRule,
        @Nullable List<String> locations,
        @Nullable List<String> requiredFeatures,
        @Nullable String timeout) {
        this.apiVersions = apiVersions;
        this.enabled = enabled;
        this.extensions = extensions;
        this.featuresRule = featuresRule;
        this.locations = locations;
        this.requiredFeatures = requiredFeatures;
        this.timeout = timeout;
    }

    private ResourceTypeEndpointResponse() {
        this.apiVersions = List.of();
        this.enabled = null;
        this.extensions = List.of();
        this.featuresRule = null;
        this.locations = List.of();
        this.requiredFeatures = List.of();
        this.timeout = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> apiVersions;
        private @Nullable Boolean enabled;
        private @Nullable List<ResourceTypeExtensionResponse> extensions;
        private @Nullable ResourceTypeEndpointResponseFeaturesRule featuresRule;
        private @Nullable List<String> locations;
        private @Nullable List<String> requiredFeatures;
        private @Nullable String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersions = defaults.apiVersions;
    	      this.enabled = defaults.enabled;
    	      this.extensions = defaults.extensions;
    	      this.featuresRule = defaults.featuresRule;
    	      this.locations = defaults.locations;
    	      this.requiredFeatures = defaults.requiredFeatures;
    	      this.timeout = defaults.timeout;
        }

        public Builder setApiVersions(@Nullable List<String> apiVersions) {
            this.apiVersions = apiVersions;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setExtensions(@Nullable List<ResourceTypeExtensionResponse> extensions) {
            this.extensions = extensions;
            return this;
        }

        public Builder setFeaturesRule(@Nullable ResourceTypeEndpointResponseFeaturesRule featuresRule) {
            this.featuresRule = featuresRule;
            return this;
        }

        public Builder setLocations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setRequiredFeatures(@Nullable List<String> requiredFeatures) {
            this.requiredFeatures = requiredFeatures;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }
        public ResourceTypeEndpointResponse build() {
            return new ResourceTypeEndpointResponse(apiVersions, enabled, extensions, featuresRule, locations, requiredFeatures, timeout);
        }
    }
}
