// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.azurenative.providerhub.outputs.ProviderRegistrationPropertiesResponseProviderHubMetadata;
import io.pulumi.azurenative.providerhub.outputs.ProviderRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications;
import io.pulumi.azurenative.providerhub.outputs.ResourceProviderAuthorizationResponse;
import io.pulumi.azurenative.providerhub.outputs.ResourceProviderCapabilitiesResponse;
import io.pulumi.azurenative.providerhub.outputs.ResourceProviderManifestPropertiesResponseFeaturesRule;
import io.pulumi.azurenative.providerhub.outputs.ResourceProviderManifestPropertiesResponseManagement;
import io.pulumi.azurenative.providerhub.outputs.ResourceProviderManifestPropertiesResponseProviderAuthentication;
import io.pulumi.azurenative.providerhub.outputs.ResourceProviderManifestPropertiesResponseRequestHeaderOptions;
import io.pulumi.azurenative.providerhub.outputs.ResourceProviderManifestPropertiesResponseTemplateDeploymentOptions;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProviderRegistrationResponseProperties {
    private final @Nullable List<ResourceProviderCapabilitiesResponse> capabilities;
    private final @Nullable ResourceProviderManifestPropertiesResponseFeaturesRule featuresRule;
    private final @Nullable ResourceProviderManifestPropertiesResponseManagement management;
    private final @Nullable Object metadata;
    private final @Nullable String namespace;
    private final @Nullable ResourceProviderManifestPropertiesResponseProviderAuthentication providerAuthentication;
    private final @Nullable List<ResourceProviderAuthorizationResponse> providerAuthorizations;
    private final @Nullable ProviderRegistrationPropertiesResponseProviderHubMetadata providerHubMetadata;
    private final @Nullable String providerType;
    private final @Nullable String providerVersion;
    private final @Nullable String provisioningState;
    private final @Nullable ResourceProviderManifestPropertiesResponseRequestHeaderOptions requestHeaderOptions;
    private final @Nullable List<String> requiredFeatures;
    private final @Nullable ProviderRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications subscriptionLifecycleNotificationSpecifications;
    private final @Nullable ResourceProviderManifestPropertiesResponseTemplateDeploymentOptions templateDeploymentOptions;

    @OutputCustomType.Constructor({"capabilities","featuresRule","management","metadata","namespace","providerAuthentication","providerAuthorizations","providerHubMetadata","providerType","providerVersion","provisioningState","requestHeaderOptions","requiredFeatures","subscriptionLifecycleNotificationSpecifications","templateDeploymentOptions"})
    private ProviderRegistrationResponseProperties(
        @Nullable List<ResourceProviderCapabilitiesResponse> capabilities,
        @Nullable ResourceProviderManifestPropertiesResponseFeaturesRule featuresRule,
        @Nullable ResourceProviderManifestPropertiesResponseManagement management,
        @Nullable Object metadata,
        @Nullable String namespace,
        @Nullable ResourceProviderManifestPropertiesResponseProviderAuthentication providerAuthentication,
        @Nullable List<ResourceProviderAuthorizationResponse> providerAuthorizations,
        @Nullable ProviderRegistrationPropertiesResponseProviderHubMetadata providerHubMetadata,
        @Nullable String providerType,
        @Nullable String providerVersion,
        @Nullable String provisioningState,
        @Nullable ResourceProviderManifestPropertiesResponseRequestHeaderOptions requestHeaderOptions,
        @Nullable List<String> requiredFeatures,
        @Nullable ProviderRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications subscriptionLifecycleNotificationSpecifications,
        @Nullable ResourceProviderManifestPropertiesResponseTemplateDeploymentOptions templateDeploymentOptions) {
        this.capabilities = capabilities;
        this.featuresRule = featuresRule;
        this.management = management;
        this.metadata = metadata;
        this.namespace = namespace;
        this.providerAuthentication = providerAuthentication;
        this.providerAuthorizations = providerAuthorizations;
        this.providerHubMetadata = providerHubMetadata;
        this.providerType = providerType;
        this.providerVersion = providerVersion;
        this.provisioningState = provisioningState;
        this.requestHeaderOptions = requestHeaderOptions;
        this.requiredFeatures = requiredFeatures;
        this.subscriptionLifecycleNotificationSpecifications = subscriptionLifecycleNotificationSpecifications;
        this.templateDeploymentOptions = templateDeploymentOptions;
    }

    public List<ResourceProviderCapabilitiesResponse> getCapabilities() {
        return this.capabilities == null ? List.of() : this.capabilities;
    }
    public Optional<ResourceProviderManifestPropertiesResponseFeaturesRule> getFeaturesRule() {
        return Optional.ofNullable(this.featuresRule);
    }
    public Optional<ResourceProviderManifestPropertiesResponseManagement> getManagement() {
        return Optional.ofNullable(this.management);
    }
    public Optional<Object> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    public Optional<String> getNamespace() {
        return Optional.ofNullable(this.namespace);
    }
    public Optional<ResourceProviderManifestPropertiesResponseProviderAuthentication> getProviderAuthentication() {
        return Optional.ofNullable(this.providerAuthentication);
    }
    public List<ResourceProviderAuthorizationResponse> getProviderAuthorizations() {
        return this.providerAuthorizations == null ? List.of() : this.providerAuthorizations;
    }
    public Optional<ProviderRegistrationPropertiesResponseProviderHubMetadata> getProviderHubMetadata() {
        return Optional.ofNullable(this.providerHubMetadata);
    }
    public Optional<String> getProviderType() {
        return Optional.ofNullable(this.providerType);
    }
    public Optional<String> getProviderVersion() {
        return Optional.ofNullable(this.providerVersion);
    }
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    public Optional<ResourceProviderManifestPropertiesResponseRequestHeaderOptions> getRequestHeaderOptions() {
        return Optional.ofNullable(this.requestHeaderOptions);
    }
    public List<String> getRequiredFeatures() {
        return this.requiredFeatures == null ? List.of() : this.requiredFeatures;
    }
    public Optional<ProviderRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications> getSubscriptionLifecycleNotificationSpecifications() {
        return Optional.ofNullable(this.subscriptionLifecycleNotificationSpecifications);
    }
    public Optional<ResourceProviderManifestPropertiesResponseTemplateDeploymentOptions> getTemplateDeploymentOptions() {
        return Optional.ofNullable(this.templateDeploymentOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderRegistrationResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ResourceProviderCapabilitiesResponse> capabilities;
        private @Nullable ResourceProviderManifestPropertiesResponseFeaturesRule featuresRule;
        private @Nullable ResourceProviderManifestPropertiesResponseManagement management;
        private @Nullable Object metadata;
        private @Nullable String namespace;
        private @Nullable ResourceProviderManifestPropertiesResponseProviderAuthentication providerAuthentication;
        private @Nullable List<ResourceProviderAuthorizationResponse> providerAuthorizations;
        private @Nullable ProviderRegistrationPropertiesResponseProviderHubMetadata providerHubMetadata;
        private @Nullable String providerType;
        private @Nullable String providerVersion;
        private @Nullable String provisioningState;
        private @Nullable ResourceProviderManifestPropertiesResponseRequestHeaderOptions requestHeaderOptions;
        private @Nullable List<String> requiredFeatures;
        private @Nullable ProviderRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications subscriptionLifecycleNotificationSpecifications;
        private @Nullable ResourceProviderManifestPropertiesResponseTemplateDeploymentOptions templateDeploymentOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderRegistrationResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.featuresRule = defaults.featuresRule;
    	      this.management = defaults.management;
    	      this.metadata = defaults.metadata;
    	      this.namespace = defaults.namespace;
    	      this.providerAuthentication = defaults.providerAuthentication;
    	      this.providerAuthorizations = defaults.providerAuthorizations;
    	      this.providerHubMetadata = defaults.providerHubMetadata;
    	      this.providerType = defaults.providerType;
    	      this.providerVersion = defaults.providerVersion;
    	      this.provisioningState = defaults.provisioningState;
    	      this.requestHeaderOptions = defaults.requestHeaderOptions;
    	      this.requiredFeatures = defaults.requiredFeatures;
    	      this.subscriptionLifecycleNotificationSpecifications = defaults.subscriptionLifecycleNotificationSpecifications;
    	      this.templateDeploymentOptions = defaults.templateDeploymentOptions;
        }

        public Builder setCapabilities(@Nullable List<ResourceProviderCapabilitiesResponse> capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        public Builder setFeaturesRule(@Nullable ResourceProviderManifestPropertiesResponseFeaturesRule featuresRule) {
            this.featuresRule = featuresRule;
            return this;
        }

        public Builder setManagement(@Nullable ResourceProviderManifestPropertiesResponseManagement management) {
            this.management = management;
            return this;
        }

        public Builder setMetadata(@Nullable Object metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setProviderAuthentication(@Nullable ResourceProviderManifestPropertiesResponseProviderAuthentication providerAuthentication) {
            this.providerAuthentication = providerAuthentication;
            return this;
        }

        public Builder setProviderAuthorizations(@Nullable List<ResourceProviderAuthorizationResponse> providerAuthorizations) {
            this.providerAuthorizations = providerAuthorizations;
            return this;
        }

        public Builder setProviderHubMetadata(@Nullable ProviderRegistrationPropertiesResponseProviderHubMetadata providerHubMetadata) {
            this.providerHubMetadata = providerHubMetadata;
            return this;
        }

        public Builder setProviderType(@Nullable String providerType) {
            this.providerType = providerType;
            return this;
        }

        public Builder setProviderVersion(@Nullable String providerVersion) {
            this.providerVersion = providerVersion;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setRequestHeaderOptions(@Nullable ResourceProviderManifestPropertiesResponseRequestHeaderOptions requestHeaderOptions) {
            this.requestHeaderOptions = requestHeaderOptions;
            return this;
        }

        public Builder setRequiredFeatures(@Nullable List<String> requiredFeatures) {
            this.requiredFeatures = requiredFeatures;
            return this;
        }

        public Builder setSubscriptionLifecycleNotificationSpecifications(@Nullable ProviderRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications subscriptionLifecycleNotificationSpecifications) {
            this.subscriptionLifecycleNotificationSpecifications = subscriptionLifecycleNotificationSpecifications;
            return this;
        }

        public Builder setTemplateDeploymentOptions(@Nullable ResourceProviderManifestPropertiesResponseTemplateDeploymentOptions templateDeploymentOptions) {
            this.templateDeploymentOptions = templateDeploymentOptions;
            return this;
        }

        public ProviderRegistrationResponseProperties build() {
            return new ProviderRegistrationResponseProperties(capabilities, featuresRule, management, metadata, namespace, providerAuthentication, providerAuthorizations, providerHubMetadata, providerType, providerVersion, provisioningState, requestHeaderOptions, requiredFeatures, subscriptionLifecycleNotificationSpecifications, templateDeploymentOptions);
        }
    }
}
