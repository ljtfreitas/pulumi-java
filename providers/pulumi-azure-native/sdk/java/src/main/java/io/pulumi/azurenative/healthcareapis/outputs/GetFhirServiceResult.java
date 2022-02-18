// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.outputs;

import io.pulumi.azurenative.healthcareapis.outputs.FhirServiceAccessPolicyEntryResponse;
import io.pulumi.azurenative.healthcareapis.outputs.FhirServiceAcrConfigurationResponse;
import io.pulumi.azurenative.healthcareapis.outputs.FhirServiceAuthenticationConfigurationResponse;
import io.pulumi.azurenative.healthcareapis.outputs.FhirServiceCorsConfigurationResponse;
import io.pulumi.azurenative.healthcareapis.outputs.FhirServiceExportConfigurationResponse;
import io.pulumi.azurenative.healthcareapis.outputs.ServiceManagedIdentityResponseIdentity;
import io.pulumi.azurenative.healthcareapis.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFhirServiceResult {
    /**
     * Fhir Service access policies.
     * 
     */
    private final @Nullable List<FhirServiceAccessPolicyEntryResponse> accessPolicies;
    /**
     * Fhir Service Azure container registry configuration.
     * 
     */
    private final @Nullable FhirServiceAcrConfigurationResponse acrConfiguration;
    /**
     * Fhir Service authentication configuration.
     * 
     */
    private final @Nullable FhirServiceAuthenticationConfigurationResponse authenticationConfiguration;
    /**
     * Fhir Service Cors configuration.
     * 
     */
    private final @Nullable FhirServiceCorsConfigurationResponse corsConfiguration;
    /**
     * An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    private final @Nullable String etag;
    /**
     * Fhir Service export configuration.
     * 
     */
    private final @Nullable FhirServiceExportConfigurationResponse exportConfiguration;
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * Setting indicating whether the service has a managed identity associated with it.
     * 
     */
    private final @Nullable ServiceManagedIdentityResponseIdentity identity;
    /**
     * The kind of the service.
     * 
     */
    private final @Nullable String kind;
    /**
     * The resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * The provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"accessPolicies","acrConfiguration","authenticationConfiguration","corsConfiguration","etag","exportConfiguration","id","identity","kind","location","name","provisioningState","systemData","tags","type"})
    private GetFhirServiceResult(
        @Nullable List<FhirServiceAccessPolicyEntryResponse> accessPolicies,
        @Nullable FhirServiceAcrConfigurationResponse acrConfiguration,
        @Nullable FhirServiceAuthenticationConfigurationResponse authenticationConfiguration,
        @Nullable FhirServiceCorsConfigurationResponse corsConfiguration,
        @Nullable String etag,
        @Nullable FhirServiceExportConfigurationResponse exportConfiguration,
        String id,
        @Nullable ServiceManagedIdentityResponseIdentity identity,
        @Nullable String kind,
        @Nullable String location,
        String name,
        String provisioningState,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.accessPolicies = accessPolicies;
        this.acrConfiguration = acrConfiguration;
        this.authenticationConfiguration = authenticationConfiguration;
        this.corsConfiguration = corsConfiguration;
        this.etag = etag;
        this.exportConfiguration = exportConfiguration;
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.kind = kind;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Fhir Service access policies.
     * 
     */
    public List<FhirServiceAccessPolicyEntryResponse> getAccessPolicies() {
        return this.accessPolicies == null ? List.of() : this.accessPolicies;
    }
    /**
     * Fhir Service Azure container registry configuration.
     * 
     */
    public Optional<FhirServiceAcrConfigurationResponse> getAcrConfiguration() {
        return Optional.ofNullable(this.acrConfiguration);
    }
    /**
     * Fhir Service authentication configuration.
     * 
     */
    public Optional<FhirServiceAuthenticationConfigurationResponse> getAuthenticationConfiguration() {
        return Optional.ofNullable(this.authenticationConfiguration);
    }
    /**
     * Fhir Service Cors configuration.
     * 
     */
    public Optional<FhirServiceCorsConfigurationResponse> getCorsConfiguration() {
        return Optional.ofNullable(this.corsConfiguration);
    }
    /**
     * An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Fhir Service export configuration.
     * 
     */
    public Optional<FhirServiceExportConfigurationResponse> getExportConfiguration() {
        return Optional.ofNullable(this.exportConfiguration);
    }
    /**
     * The resource identifier.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Setting indicating whether the service has a managed identity associated with it.
     * 
     */
    public Optional<ServiceManagedIdentityResponseIdentity> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The kind of the service.
     * 
     */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * The resource location.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFhirServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FhirServiceAccessPolicyEntryResponse> accessPolicies;
        private @Nullable FhirServiceAcrConfigurationResponse acrConfiguration;
        private @Nullable FhirServiceAuthenticationConfigurationResponse authenticationConfiguration;
        private @Nullable FhirServiceCorsConfigurationResponse corsConfiguration;
        private @Nullable String etag;
        private @Nullable FhirServiceExportConfigurationResponse exportConfiguration;
        private String id;
        private @Nullable ServiceManagedIdentityResponseIdentity identity;
        private @Nullable String kind;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFhirServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicies = defaults.accessPolicies;
    	      this.acrConfiguration = defaults.acrConfiguration;
    	      this.authenticationConfiguration = defaults.authenticationConfiguration;
    	      this.corsConfiguration = defaults.corsConfiguration;
    	      this.etag = defaults.etag;
    	      this.exportConfiguration = defaults.exportConfiguration;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAccessPolicies(@Nullable List<FhirServiceAccessPolicyEntryResponse> accessPolicies) {
            this.accessPolicies = accessPolicies;
            return this;
        }

        public Builder setAcrConfiguration(@Nullable FhirServiceAcrConfigurationResponse acrConfiguration) {
            this.acrConfiguration = acrConfiguration;
            return this;
        }

        public Builder setAuthenticationConfiguration(@Nullable FhirServiceAuthenticationConfigurationResponse authenticationConfiguration) {
            this.authenticationConfiguration = authenticationConfiguration;
            return this;
        }

        public Builder setCorsConfiguration(@Nullable FhirServiceCorsConfigurationResponse corsConfiguration) {
            this.corsConfiguration = corsConfiguration;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setExportConfiguration(@Nullable FhirServiceExportConfigurationResponse exportConfiguration) {
            this.exportConfiguration = exportConfiguration;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable ServiceManagedIdentityResponseIdentity identity) {
            this.identity = identity;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetFhirServiceResult build() {
            return new GetFhirServiceResult(accessPolicies, acrConfiguration, authenticationConfiguration, corsConfiguration, etag, exportConfiguration, id, identity, kind, location, name, provisioningState, systemData, tags, type);
        }
    }
}
