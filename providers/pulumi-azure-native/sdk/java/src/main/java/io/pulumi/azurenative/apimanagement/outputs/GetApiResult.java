// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.azurenative.apimanagement.outputs.ApiVersionSetContractDetailsResponse;
import io.pulumi.azurenative.apimanagement.outputs.AuthenticationSettingsContractResponse;
import io.pulumi.azurenative.apimanagement.outputs.SubscriptionKeyParameterNamesContractResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetApiResult {
    /**
     * Describes the Revision of the Api. If no value is provided, default revision 1 is created
     * 
     */
    private final @Nullable String apiRevision;
    /**
     * Description of the Api Revision.
     * 
     */
    private final @Nullable String apiRevisionDescription;
    /**
     * Type of API.
     * 
     */
    private final @Nullable String apiType;
    /**
     * Indicates the Version identifier of the API if the API is versioned
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * Description of the Api Version.
     * 
     */
    private final @Nullable String apiVersionDescription;
    /**
     * Version set details
     * 
     */
    private final @Nullable ApiVersionSetContractDetailsResponse apiVersionSet;
    /**
     * A resource identifier for the related ApiVersionSet.
     * 
     */
    private final @Nullable String apiVersionSetId;
    /**
     * Collection of authentication settings included into this API.
     * 
     */
    private final @Nullable AuthenticationSettingsContractResponse authenticationSettings;
    /**
     * Description of the API. May include HTML formatting tags.
     * 
     */
    private final @Nullable String description;
    /**
     * API name. Must be 1 to 300 characters long.
     * 
     */
    private final @Nullable String displayName;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Indicates if API revision is current api revision.
     * 
     */
    private final @Nullable Boolean isCurrent;
    /**
     * Indicates if API revision is accessible via the gateway.
     * 
     */
    private final Boolean isOnline;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Relative URL uniquely identifying this API and all of its resource paths within the API Management service instance. It is appended to the API endpoint base URL specified during the service instance creation to form a public URL for this API.
     * 
     */
    private final String path;
    /**
     * Describes on which protocols the operations in this API can be invoked.
     * 
     */
    private final @Nullable List<String> protocols;
    /**
     * Absolute URL of the backend service implementing this API. Cannot be more than 2000 characters long.
     * 
     */
    private final @Nullable String serviceUrl;
    /**
     * API identifier of the source API.
     * 
     */
    private final @Nullable String sourceApiId;
    /**
     * Protocols over which API is made available.
     * 
     */
    private final @Nullable SubscriptionKeyParameterNamesContractResponse subscriptionKeyParameterNames;
    /**
     * Specifies whether an API or Product subscription is required for accessing the API.
     * 
     */
    private final @Nullable Boolean subscriptionRequired;
    /**
     * Resource type for API Management resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"apiRevision","apiRevisionDescription","apiType","apiVersion","apiVersionDescription","apiVersionSet","apiVersionSetId","authenticationSettings","description","displayName","id","isCurrent","isOnline","name","path","protocols","serviceUrl","sourceApiId","subscriptionKeyParameterNames","subscriptionRequired","type"})
    private GetApiResult(
        @Nullable String apiRevision,
        @Nullable String apiRevisionDescription,
        @Nullable String apiType,
        @Nullable String apiVersion,
        @Nullable String apiVersionDescription,
        @Nullable ApiVersionSetContractDetailsResponse apiVersionSet,
        @Nullable String apiVersionSetId,
        @Nullable AuthenticationSettingsContractResponse authenticationSettings,
        @Nullable String description,
        @Nullable String displayName,
        String id,
        @Nullable Boolean isCurrent,
        Boolean isOnline,
        String name,
        String path,
        @Nullable List<String> protocols,
        @Nullable String serviceUrl,
        @Nullable String sourceApiId,
        @Nullable SubscriptionKeyParameterNamesContractResponse subscriptionKeyParameterNames,
        @Nullable Boolean subscriptionRequired,
        String type) {
        this.apiRevision = apiRevision;
        this.apiRevisionDescription = apiRevisionDescription;
        this.apiType = apiType;
        this.apiVersion = apiVersion;
        this.apiVersionDescription = apiVersionDescription;
        this.apiVersionSet = apiVersionSet;
        this.apiVersionSetId = apiVersionSetId;
        this.authenticationSettings = authenticationSettings;
        this.description = description;
        this.displayName = displayName;
        this.id = Objects.requireNonNull(id);
        this.isCurrent = isCurrent;
        this.isOnline = Objects.requireNonNull(isOnline);
        this.name = Objects.requireNonNull(name);
        this.path = Objects.requireNonNull(path);
        this.protocols = protocols;
        this.serviceUrl = serviceUrl;
        this.sourceApiId = sourceApiId;
        this.subscriptionKeyParameterNames = subscriptionKeyParameterNames;
        this.subscriptionRequired = subscriptionRequired;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Describes the Revision of the Api. If no value is provided, default revision 1 is created
     * 
     */
    public Optional<String> getApiRevision() {
        return Optional.ofNullable(this.apiRevision);
    }
    /**
     * Description of the Api Revision.
     * 
     */
    public Optional<String> getApiRevisionDescription() {
        return Optional.ofNullable(this.apiRevisionDescription);
    }
    /**
     * Type of API.
     * 
     */
    public Optional<String> getApiType() {
        return Optional.ofNullable(this.apiType);
    }
    /**
     * Indicates the Version identifier of the API if the API is versioned
     * 
     */
    public Optional<String> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * Description of the Api Version.
     * 
     */
    public Optional<String> getApiVersionDescription() {
        return Optional.ofNullable(this.apiVersionDescription);
    }
    /**
     * Version set details
     * 
     */
    public Optional<ApiVersionSetContractDetailsResponse> getApiVersionSet() {
        return Optional.ofNullable(this.apiVersionSet);
    }
    /**
     * A resource identifier for the related ApiVersionSet.
     * 
     */
    public Optional<String> getApiVersionSetId() {
        return Optional.ofNullable(this.apiVersionSetId);
    }
    /**
     * Collection of authentication settings included into this API.
     * 
     */
    public Optional<AuthenticationSettingsContractResponse> getAuthenticationSettings() {
        return Optional.ofNullable(this.authenticationSettings);
    }
    /**
     * Description of the API. May include HTML formatting tags.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * API name. Must be 1 to 300 characters long.
     * 
     */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Indicates if API revision is current api revision.
     * 
     */
    public Optional<Boolean> getIsCurrent() {
        return Optional.ofNullable(this.isCurrent);
    }
    /**
     * Indicates if API revision is accessible via the gateway.
     * 
     */
    public Boolean getIsOnline() {
        return this.isOnline;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Relative URL uniquely identifying this API and all of its resource paths within the API Management service instance. It is appended to the API endpoint base URL specified during the service instance creation to form a public URL for this API.
     * 
     */
    public String getPath() {
        return this.path;
    }
    /**
     * Describes on which protocols the operations in this API can be invoked.
     * 
     */
    public List<String> getProtocols() {
        return this.protocols == null ? List.of() : this.protocols;
    }
    /**
     * Absolute URL of the backend service implementing this API. Cannot be more than 2000 characters long.
     * 
     */
    public Optional<String> getServiceUrl() {
        return Optional.ofNullable(this.serviceUrl);
    }
    /**
     * API identifier of the source API.
     * 
     */
    public Optional<String> getSourceApiId() {
        return Optional.ofNullable(this.sourceApiId);
    }
    /**
     * Protocols over which API is made available.
     * 
     */
    public Optional<SubscriptionKeyParameterNamesContractResponse> getSubscriptionKeyParameterNames() {
        return Optional.ofNullable(this.subscriptionKeyParameterNames);
    }
    /**
     * Specifies whether an API or Product subscription is required for accessing the API.
     * 
     */
    public Optional<Boolean> getSubscriptionRequired() {
        return Optional.ofNullable(this.subscriptionRequired);
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiRevision;
        private @Nullable String apiRevisionDescription;
        private @Nullable String apiType;
        private @Nullable String apiVersion;
        private @Nullable String apiVersionDescription;
        private @Nullable ApiVersionSetContractDetailsResponse apiVersionSet;
        private @Nullable String apiVersionSetId;
        private @Nullable AuthenticationSettingsContractResponse authenticationSettings;
        private @Nullable String description;
        private @Nullable String displayName;
        private String id;
        private @Nullable Boolean isCurrent;
        private Boolean isOnline;
        private String name;
        private String path;
        private @Nullable List<String> protocols;
        private @Nullable String serviceUrl;
        private @Nullable String sourceApiId;
        private @Nullable SubscriptionKeyParameterNamesContractResponse subscriptionKeyParameterNames;
        private @Nullable Boolean subscriptionRequired;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiRevision = defaults.apiRevision;
    	      this.apiRevisionDescription = defaults.apiRevisionDescription;
    	      this.apiType = defaults.apiType;
    	      this.apiVersion = defaults.apiVersion;
    	      this.apiVersionDescription = defaults.apiVersionDescription;
    	      this.apiVersionSet = defaults.apiVersionSet;
    	      this.apiVersionSetId = defaults.apiVersionSetId;
    	      this.authenticationSettings = defaults.authenticationSettings;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.isCurrent = defaults.isCurrent;
    	      this.isOnline = defaults.isOnline;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.protocols = defaults.protocols;
    	      this.serviceUrl = defaults.serviceUrl;
    	      this.sourceApiId = defaults.sourceApiId;
    	      this.subscriptionKeyParameterNames = defaults.subscriptionKeyParameterNames;
    	      this.subscriptionRequired = defaults.subscriptionRequired;
    	      this.type = defaults.type;
        }

        public Builder setApiRevision(@Nullable String apiRevision) {
            this.apiRevision = apiRevision;
            return this;
        }

        public Builder setApiRevisionDescription(@Nullable String apiRevisionDescription) {
            this.apiRevisionDescription = apiRevisionDescription;
            return this;
        }

        public Builder setApiType(@Nullable String apiType) {
            this.apiType = apiType;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersionDescription(@Nullable String apiVersionDescription) {
            this.apiVersionDescription = apiVersionDescription;
            return this;
        }

        public Builder setApiVersionSet(@Nullable ApiVersionSetContractDetailsResponse apiVersionSet) {
            this.apiVersionSet = apiVersionSet;
            return this;
        }

        public Builder setApiVersionSetId(@Nullable String apiVersionSetId) {
            this.apiVersionSetId = apiVersionSetId;
            return this;
        }

        public Builder setAuthenticationSettings(@Nullable AuthenticationSettingsContractResponse authenticationSettings) {
            this.authenticationSettings = authenticationSettings;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsCurrent(@Nullable Boolean isCurrent) {
            this.isCurrent = isCurrent;
            return this;
        }

        public Builder setIsOnline(Boolean isOnline) {
            this.isOnline = Objects.requireNonNull(isOnline);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setProtocols(@Nullable List<String> protocols) {
            this.protocols = protocols;
            return this;
        }

        public Builder setServiceUrl(@Nullable String serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }

        public Builder setSourceApiId(@Nullable String sourceApiId) {
            this.sourceApiId = sourceApiId;
            return this;
        }

        public Builder setSubscriptionKeyParameterNames(@Nullable SubscriptionKeyParameterNamesContractResponse subscriptionKeyParameterNames) {
            this.subscriptionKeyParameterNames = subscriptionKeyParameterNames;
            return this;
        }

        public Builder setSubscriptionRequired(@Nullable Boolean subscriptionRequired) {
            this.subscriptionRequired = subscriptionRequired;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetApiResult build() {
            return new GetApiResult(apiRevision, apiRevisionDescription, apiType, apiVersion, apiVersionDescription, apiVersionSet, apiVersionSetId, authenticationSettings, description, displayName, id, isCurrent, isOnline, name, path, protocols, serviceUrl, sourceApiId, subscriptionKeyParameterNames, subscriptionRequired, type);
        }
    }
}
