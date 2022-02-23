// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.inputs;

import io.pulumi.azurenative.healthcareapis.inputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.healthcareapis.inputs.ServiceAccessPolicyEntryResponse;
import io.pulumi.azurenative.healthcareapis.inputs.ServiceAcrConfigurationInfoResponse;
import io.pulumi.azurenative.healthcareapis.inputs.ServiceAuthenticationConfigurationInfoResponse;
import io.pulumi.azurenative.healthcareapis.inputs.ServiceCorsConfigurationInfoResponse;
import io.pulumi.azurenative.healthcareapis.inputs.ServiceCosmosDbConfigurationInfoResponse;
import io.pulumi.azurenative.healthcareapis.inputs.ServiceExportConfigurationInfoResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a service instance.
 * 
 */
public final class ServicesPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServicesPropertiesResponse Empty = new ServicesPropertiesResponse();

    /**
     * The access policies of the service instance.
     * 
     */
    @InputImport(name="accessPolicies")
        private final @Nullable List<ServiceAccessPolicyEntryResponse> accessPolicies;

    public List<ServiceAccessPolicyEntryResponse> getAccessPolicies() {
        return this.accessPolicies == null ? List.of() : this.accessPolicies;
    }

    /**
     * The azure container registry settings used for convert data operation of the service instance.
     * 
     */
    @InputImport(name="acrConfiguration")
        private final @Nullable ServiceAcrConfigurationInfoResponse acrConfiguration;

    public Optional<ServiceAcrConfigurationInfoResponse> getAcrConfiguration() {
        return this.acrConfiguration == null ? Optional.empty() : Optional.ofNullable(this.acrConfiguration);
    }

    /**
     * The authentication configuration for the service instance.
     * 
     */
    @InputImport(name="authenticationConfiguration")
        private final @Nullable ServiceAuthenticationConfigurationInfoResponse authenticationConfiguration;

    public Optional<ServiceAuthenticationConfigurationInfoResponse> getAuthenticationConfiguration() {
        return this.authenticationConfiguration == null ? Optional.empty() : Optional.ofNullable(this.authenticationConfiguration);
    }

    /**
     * The settings for the CORS configuration of the service instance.
     * 
     */
    @InputImport(name="corsConfiguration")
        private final @Nullable ServiceCorsConfigurationInfoResponse corsConfiguration;

    public Optional<ServiceCorsConfigurationInfoResponse> getCorsConfiguration() {
        return this.corsConfiguration == null ? Optional.empty() : Optional.ofNullable(this.corsConfiguration);
    }

    /**
     * The settings for the Cosmos DB database backing the service.
     * 
     */
    @InputImport(name="cosmosDbConfiguration")
        private final @Nullable ServiceCosmosDbConfigurationInfoResponse cosmosDbConfiguration;

    public Optional<ServiceCosmosDbConfigurationInfoResponse> getCosmosDbConfiguration() {
        return this.cosmosDbConfiguration == null ? Optional.empty() : Optional.ofNullable(this.cosmosDbConfiguration);
    }

    /**
     * The settings for the export operation of the service instance.
     * 
     */
    @InputImport(name="exportConfiguration")
        private final @Nullable ServiceExportConfigurationInfoResponse exportConfiguration;

    public Optional<ServiceExportConfigurationInfoResponse> getExportConfiguration() {
        return this.exportConfiguration == null ? Optional.empty() : Optional.ofNullable(this.exportConfiguration);
    }

    /**
     * The list of private endpoint connections that are set up for this resource.
     * 
     */
    @InputImport(name="privateEndpointConnections")
        private final @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;

    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections == null ? List.of() : this.privateEndpointConnections;
    }

    /**
     * The provisioning state.
     * 
     */
    @InputImport(name="provisioningState", required=true)
        private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Control permission for data plane traffic coming from public networks while private endpoint is enabled.
     * 
     */
    @InputImport(name="publicNetworkAccess")
        private final @Nullable String publicNetworkAccess;

    public Optional<String> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Optional.empty() : Optional.ofNullable(this.publicNetworkAccess);
    }

    public ServicesPropertiesResponse(
        @Nullable List<ServiceAccessPolicyEntryResponse> accessPolicies,
        @Nullable ServiceAcrConfigurationInfoResponse acrConfiguration,
        @Nullable ServiceAuthenticationConfigurationInfoResponse authenticationConfiguration,
        @Nullable ServiceCorsConfigurationInfoResponse corsConfiguration,
        @Nullable ServiceCosmosDbConfigurationInfoResponse cosmosDbConfiguration,
        @Nullable ServiceExportConfigurationInfoResponse exportConfiguration,
        @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        String provisioningState,
        @Nullable String publicNetworkAccess) {
        this.accessPolicies = accessPolicies;
        this.acrConfiguration = acrConfiguration;
        this.authenticationConfiguration = authenticationConfiguration;
        this.corsConfiguration = corsConfiguration;
        this.cosmosDbConfiguration = cosmosDbConfiguration;
        this.exportConfiguration = exportConfiguration;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.publicNetworkAccess = publicNetworkAccess;
    }

    private ServicesPropertiesResponse() {
        this.accessPolicies = List.of();
        this.acrConfiguration = null;
        this.authenticationConfiguration = null;
        this.corsConfiguration = null;
        this.cosmosDbConfiguration = null;
        this.exportConfiguration = null;
        this.privateEndpointConnections = List.of();
        this.provisioningState = null;
        this.publicNetworkAccess = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicesPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ServiceAccessPolicyEntryResponse> accessPolicies;
        private @Nullable ServiceAcrConfigurationInfoResponse acrConfiguration;
        private @Nullable ServiceAuthenticationConfigurationInfoResponse authenticationConfiguration;
        private @Nullable ServiceCorsConfigurationInfoResponse corsConfiguration;
        private @Nullable ServiceCosmosDbConfigurationInfoResponse cosmosDbConfiguration;
        private @Nullable ServiceExportConfigurationInfoResponse exportConfiguration;
        private @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicesPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicies = defaults.accessPolicies;
    	      this.acrConfiguration = defaults.acrConfiguration;
    	      this.authenticationConfiguration = defaults.authenticationConfiguration;
    	      this.corsConfiguration = defaults.corsConfiguration;
    	      this.cosmosDbConfiguration = defaults.cosmosDbConfiguration;
    	      this.exportConfiguration = defaults.exportConfiguration;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
        }

        public Builder setAccessPolicies(@Nullable List<ServiceAccessPolicyEntryResponse> accessPolicies) {
            this.accessPolicies = accessPolicies;
            return this;
        }

        public Builder setAcrConfiguration(@Nullable ServiceAcrConfigurationInfoResponse acrConfiguration) {
            this.acrConfiguration = acrConfiguration;
            return this;
        }

        public Builder setAuthenticationConfiguration(@Nullable ServiceAuthenticationConfigurationInfoResponse authenticationConfiguration) {
            this.authenticationConfiguration = authenticationConfiguration;
            return this;
        }

        public Builder setCorsConfiguration(@Nullable ServiceCorsConfigurationInfoResponse corsConfiguration) {
            this.corsConfiguration = corsConfiguration;
            return this;
        }

        public Builder setCosmosDbConfiguration(@Nullable ServiceCosmosDbConfigurationInfoResponse cosmosDbConfiguration) {
            this.cosmosDbConfiguration = cosmosDbConfiguration;
            return this;
        }

        public Builder setExportConfiguration(@Nullable ServiceExportConfigurationInfoResponse exportConfiguration) {
            this.exportConfiguration = exportConfiguration;
            return this;
        }

        public Builder setPrivateEndpointConnections(@Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = privateEndpointConnections;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public ServicesPropertiesResponse build() {
            return new ServicesPropertiesResponse(accessPolicies, acrConfiguration, authenticationConfiguration, corsConfiguration, cosmosDbConfiguration, exportConfiguration, privateEndpointConnections, provisioningState, publicNetworkAccess);
        }
    }
}
