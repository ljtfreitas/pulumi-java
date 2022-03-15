// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.ApiResourceBackendServiceResponse;
import io.pulumi.azurenative.web.outputs.ApiResourceDefinitionsResponse;
import io.pulumi.azurenative.web.outputs.ConnectionParameterResponse;
import io.pulumi.azurenative.web.outputs.WsdlDefinitionResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomApiPropertiesDefinitionResponse {
    /**
     * API Definitions
     * 
     */
    private final @Nullable ApiResourceDefinitionsResponse apiDefinitions;
    /**
     * The API type
     * 
     */
    private final @Nullable String apiType;
    /**
     * The API backend service
     * 
     */
    private final @Nullable ApiResourceBackendServiceResponse backendService;
    /**
     * Brand color
     * 
     */
    private final @Nullable String brandColor;
    /**
     * The custom API capabilities
     * 
     */
    private final @Nullable List<String> capabilities;
    /**
     * Connection parameters
     * 
     */
    private final @Nullable Map<String,ConnectionParameterResponse> connectionParameters;
    /**
     * The custom API description
     * 
     */
    private final @Nullable String description;
    /**
     * The display name
     * 
     */
    private final @Nullable String displayName;
    /**
     * The icon URI
     * 
     */
    private final @Nullable String iconUri;
    /**
     * Runtime URLs
     * 
     */
    private final @Nullable List<String> runtimeUrls;
    /**
     * The JSON representation of the swagger
     * 
     */
    private final @Nullable Object swagger;
    /**
     * The WSDL definition
     * 
     */
    private final @Nullable WsdlDefinitionResponse wsdlDefinition;

    @CustomType.Constructor
    private CustomApiPropertiesDefinitionResponse(
        @CustomType.Parameter("apiDefinitions") @Nullable ApiResourceDefinitionsResponse apiDefinitions,
        @CustomType.Parameter("apiType") @Nullable String apiType,
        @CustomType.Parameter("backendService") @Nullable ApiResourceBackendServiceResponse backendService,
        @CustomType.Parameter("brandColor") @Nullable String brandColor,
        @CustomType.Parameter("capabilities") @Nullable List<String> capabilities,
        @CustomType.Parameter("connectionParameters") @Nullable Map<String,ConnectionParameterResponse> connectionParameters,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("iconUri") @Nullable String iconUri,
        @CustomType.Parameter("runtimeUrls") @Nullable List<String> runtimeUrls,
        @CustomType.Parameter("swagger") @Nullable Object swagger,
        @CustomType.Parameter("wsdlDefinition") @Nullable WsdlDefinitionResponse wsdlDefinition) {
        this.apiDefinitions = apiDefinitions;
        this.apiType = apiType;
        this.backendService = backendService;
        this.brandColor = brandColor;
        this.capabilities = capabilities;
        this.connectionParameters = connectionParameters;
        this.description = description;
        this.displayName = displayName;
        this.iconUri = iconUri;
        this.runtimeUrls = runtimeUrls;
        this.swagger = swagger;
        this.wsdlDefinition = wsdlDefinition;
    }

    /**
     * API Definitions
     * 
    */
    public Optional<ApiResourceDefinitionsResponse> getApiDefinitions() {
        return Optional.ofNullable(this.apiDefinitions);
    }
    /**
     * The API type
     * 
    */
    public Optional<String> getApiType() {
        return Optional.ofNullable(this.apiType);
    }
    /**
     * The API backend service
     * 
    */
    public Optional<ApiResourceBackendServiceResponse> getBackendService() {
        return Optional.ofNullable(this.backendService);
    }
    /**
     * Brand color
     * 
    */
    public Optional<String> getBrandColor() {
        return Optional.ofNullable(this.brandColor);
    }
    /**
     * The custom API capabilities
     * 
    */
    public List<String> getCapabilities() {
        return this.capabilities == null ? List.of() : this.capabilities;
    }
    /**
     * Connection parameters
     * 
    */
    public Map<String,ConnectionParameterResponse> getConnectionParameters() {
        return this.connectionParameters == null ? Map.of() : this.connectionParameters;
    }
    /**
     * The custom API description
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The display name
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The icon URI
     * 
    */
    public Optional<String> getIconUri() {
        return Optional.ofNullable(this.iconUri);
    }
    /**
     * Runtime URLs
     * 
    */
    public List<String> getRuntimeUrls() {
        return this.runtimeUrls == null ? List.of() : this.runtimeUrls;
    }
    /**
     * The JSON representation of the swagger
     * 
    */
    public Optional<Object> getSwagger() {
        return Optional.ofNullable(this.swagger);
    }
    /**
     * The WSDL definition
     * 
    */
    public Optional<WsdlDefinitionResponse> getWsdlDefinition() {
        return Optional.ofNullable(this.wsdlDefinition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomApiPropertiesDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApiResourceDefinitionsResponse apiDefinitions;
        private @Nullable String apiType;
        private @Nullable ApiResourceBackendServiceResponse backendService;
        private @Nullable String brandColor;
        private @Nullable List<String> capabilities;
        private @Nullable Map<String,ConnectionParameterResponse> connectionParameters;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable String iconUri;
        private @Nullable List<String> runtimeUrls;
        private @Nullable Object swagger;
        private @Nullable WsdlDefinitionResponse wsdlDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomApiPropertiesDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiDefinitions = defaults.apiDefinitions;
    	      this.apiType = defaults.apiType;
    	      this.backendService = defaults.backendService;
    	      this.brandColor = defaults.brandColor;
    	      this.capabilities = defaults.capabilities;
    	      this.connectionParameters = defaults.connectionParameters;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.iconUri = defaults.iconUri;
    	      this.runtimeUrls = defaults.runtimeUrls;
    	      this.swagger = defaults.swagger;
    	      this.wsdlDefinition = defaults.wsdlDefinition;
        }

        public Builder apiDefinitions(@Nullable ApiResourceDefinitionsResponse apiDefinitions) {
            this.apiDefinitions = apiDefinitions;
            return this;
        }

        public Builder apiType(@Nullable String apiType) {
            this.apiType = apiType;
            return this;
        }

        public Builder backendService(@Nullable ApiResourceBackendServiceResponse backendService) {
            this.backendService = backendService;
            return this;
        }

        public Builder brandColor(@Nullable String brandColor) {
            this.brandColor = brandColor;
            return this;
        }

        public Builder capabilities(@Nullable List<String> capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        public Builder connectionParameters(@Nullable Map<String,ConnectionParameterResponse> connectionParameters) {
            this.connectionParameters = connectionParameters;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder iconUri(@Nullable String iconUri) {
            this.iconUri = iconUri;
            return this;
        }

        public Builder runtimeUrls(@Nullable List<String> runtimeUrls) {
            this.runtimeUrls = runtimeUrls;
            return this;
        }

        public Builder swagger(@Nullable Object swagger) {
            this.swagger = swagger;
            return this;
        }

        public Builder wsdlDefinition(@Nullable WsdlDefinitionResponse wsdlDefinition) {
            this.wsdlDefinition = wsdlDefinition;
            return this;
        }
        public CustomApiPropertiesDefinitionResponse build() {
            return new CustomApiPropertiesDefinitionResponse(apiDefinitions, apiType, backendService, brandColor, capabilities, connectionParameters, description, displayName, iconUri, runtimeUrls, swagger, wsdlDefinition);
        }
    }
}
