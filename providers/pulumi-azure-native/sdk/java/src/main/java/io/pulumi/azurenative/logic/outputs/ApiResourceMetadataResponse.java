// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.ApiDeploymentParameterMetadataSetResponse;
import io.pulumi.azurenative.logic.outputs.WsdlServiceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApiResourceMetadataResponse {
    /**
     * The api type.
     * 
     */
    private final @Nullable String apiType;
    /**
     * The brand color.
     * 
     */
    private final @Nullable String brandColor;
    /**
     * The connection type.
     * 
     */
    private final @Nullable String connectionType;
    /**
     * The connector deployment parameters metadata.
     * 
     */
    private final @Nullable ApiDeploymentParameterMetadataSetResponse deploymentParameters;
    /**
     * The hide key.
     * 
     */
    private final @Nullable String hideKey;
    /**
     * The provisioning state.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * The source.
     * 
     */
    private final @Nullable String source;
    /**
     * The tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The WSDL import method.
     * 
     */
    private final @Nullable String wsdlImportMethod;
    /**
     * The WSDL service.
     * 
     */
    private final @Nullable WsdlServiceResponse wsdlService;

    @OutputCustomType.Constructor({"apiType","brandColor","connectionType","deploymentParameters","hideKey","provisioningState","source","tags","wsdlImportMethod","wsdlService"})
    private ApiResourceMetadataResponse(
        @Nullable String apiType,
        @Nullable String brandColor,
        @Nullable String connectionType,
        @Nullable ApiDeploymentParameterMetadataSetResponse deploymentParameters,
        @Nullable String hideKey,
        @Nullable String provisioningState,
        @Nullable String source,
        @Nullable Map<String,String> tags,
        @Nullable String wsdlImportMethod,
        @Nullable WsdlServiceResponse wsdlService) {
        this.apiType = apiType;
        this.brandColor = brandColor;
        this.connectionType = connectionType;
        this.deploymentParameters = deploymentParameters;
        this.hideKey = hideKey;
        this.provisioningState = provisioningState;
        this.source = source;
        this.tags = tags;
        this.wsdlImportMethod = wsdlImportMethod;
        this.wsdlService = wsdlService;
    }

    /**
     * The api type.
     * 
     */
    public Optional<String> getApiType() {
        return Optional.ofNullable(this.apiType);
    }
    /**
     * The brand color.
     * 
     */
    public Optional<String> getBrandColor() {
        return Optional.ofNullable(this.brandColor);
    }
    /**
     * The connection type.
     * 
     */
    public Optional<String> getConnectionType() {
        return Optional.ofNullable(this.connectionType);
    }
    /**
     * The connector deployment parameters metadata.
     * 
     */
    public Optional<ApiDeploymentParameterMetadataSetResponse> getDeploymentParameters() {
        return Optional.ofNullable(this.deploymentParameters);
    }
    /**
     * The hide key.
     * 
     */
    public Optional<String> getHideKey() {
        return Optional.ofNullable(this.hideKey);
    }
    /**
     * The provisioning state.
     * 
     */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * The source.
     * 
     */
    public Optional<String> getSource() {
        return Optional.ofNullable(this.source);
    }
    /**
     * The tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The WSDL import method.
     * 
     */
    public Optional<String> getWsdlImportMethod() {
        return Optional.ofNullable(this.wsdlImportMethod);
    }
    /**
     * The WSDL service.
     * 
     */
    public Optional<WsdlServiceResponse> getWsdlService() {
        return Optional.ofNullable(this.wsdlService);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiResourceMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiType;
        private @Nullable String brandColor;
        private @Nullable String connectionType;
        private @Nullable ApiDeploymentParameterMetadataSetResponse deploymentParameters;
        private @Nullable String hideKey;
        private @Nullable String provisioningState;
        private @Nullable String source;
        private @Nullable Map<String,String> tags;
        private @Nullable String wsdlImportMethod;
        private @Nullable WsdlServiceResponse wsdlService;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiResourceMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiType = defaults.apiType;
    	      this.brandColor = defaults.brandColor;
    	      this.connectionType = defaults.connectionType;
    	      this.deploymentParameters = defaults.deploymentParameters;
    	      this.hideKey = defaults.hideKey;
    	      this.provisioningState = defaults.provisioningState;
    	      this.source = defaults.source;
    	      this.tags = defaults.tags;
    	      this.wsdlImportMethod = defaults.wsdlImportMethod;
    	      this.wsdlService = defaults.wsdlService;
        }

        public Builder setApiType(@Nullable String apiType) {
            this.apiType = apiType;
            return this;
        }

        public Builder setBrandColor(@Nullable String brandColor) {
            this.brandColor = brandColor;
            return this;
        }

        public Builder setConnectionType(@Nullable String connectionType) {
            this.connectionType = connectionType;
            return this;
        }

        public Builder setDeploymentParameters(@Nullable ApiDeploymentParameterMetadataSetResponse deploymentParameters) {
            this.deploymentParameters = deploymentParameters;
            return this;
        }

        public Builder setHideKey(@Nullable String hideKey) {
            this.hideKey = hideKey;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = source;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setWsdlImportMethod(@Nullable String wsdlImportMethod) {
            this.wsdlImportMethod = wsdlImportMethod;
            return this;
        }

        public Builder setWsdlService(@Nullable WsdlServiceResponse wsdlService) {
            this.wsdlService = wsdlService;
            return this;
        }

        public ApiResourceMetadataResponse build() {
            return new ApiResourceMetadataResponse(apiType, brandColor, connectionType, deploymentParameters, hideKey, provisioningState, source, tags, wsdlImportMethod, wsdlService);
        }
    }
}
