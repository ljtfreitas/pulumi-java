// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.azurenative.resources.inputs.DebugSettingResponse;
import io.pulumi.azurenative.resources.inputs.DependencyResponse;
import io.pulumi.azurenative.resources.inputs.ErrorResponseResponse;
import io.pulumi.azurenative.resources.inputs.OnErrorDeploymentExtendedResponse;
import io.pulumi.azurenative.resources.inputs.ParametersLinkResponse;
import io.pulumi.azurenative.resources.inputs.ProviderResponse;
import io.pulumi.azurenative.resources.inputs.ResourceReferenceResponse;
import io.pulumi.azurenative.resources.inputs.TemplateLinkResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Deployment properties with additional details.
 * 
 */
public final class DeploymentPropertiesExtendedResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeploymentPropertiesExtendedResponse Empty = new DeploymentPropertiesExtendedResponse();

    /**
     * The correlation ID of the deployment.
     * 
     */
    @InputImport(name="correlationId", required=true)
        private final String correlationId;

    public String getCorrelationId() {
        return this.correlationId;
    }

    /**
     * The debug setting of the deployment.
     * 
     */
    @InputImport(name="debugSetting", required=true)
        private final DebugSettingResponse debugSetting;

    public DebugSettingResponse getDebugSetting() {
        return this.debugSetting;
    }

    /**
     * The list of deployment dependencies.
     * 
     */
    @InputImport(name="dependencies", required=true)
        private final List<DependencyResponse> dependencies;

    public List<DependencyResponse> getDependencies() {
        return this.dependencies;
    }

    /**
     * The duration of the template deployment.
     * 
     */
    @InputImport(name="duration", required=true)
        private final String duration;

    public String getDuration() {
        return this.duration;
    }

    /**
     * The deployment error.
     * 
     */
    @InputImport(name="error", required=true)
        private final ErrorResponseResponse error;

    public ErrorResponseResponse getError() {
        return this.error;
    }

    /**
     * The deployment mode. Possible values are Incremental and Complete.
     * 
     */
    @InputImport(name="mode", required=true)
        private final String mode;

    public String getMode() {
        return this.mode;
    }

    /**
     * The deployment on error behavior.
     * 
     */
    @InputImport(name="onErrorDeployment", required=true)
        private final OnErrorDeploymentExtendedResponse onErrorDeployment;

    public OnErrorDeploymentExtendedResponse getOnErrorDeployment() {
        return this.onErrorDeployment;
    }

    /**
     * Array of provisioned resources.
     * 
     */
    @InputImport(name="outputResources", required=true)
        private final List<ResourceReferenceResponse> outputResources;

    public List<ResourceReferenceResponse> getOutputResources() {
        return this.outputResources;
    }

    /**
     * Key/value pairs that represent deployment output.
     * 
     */
    @InputImport(name="outputs", required=true)
        private final Object outputs;

    public Object getOutputs() {
        return this.outputs;
    }

    /**
     * Deployment parameters.
     * 
     */
    @InputImport(name="parameters", required=true)
        private final Object parameters;

    public Object getParameters() {
        return this.parameters;
    }

    /**
     * The URI referencing the parameters.
     * 
     */
    @InputImport(name="parametersLink", required=true)
        private final ParametersLinkResponse parametersLink;

    public ParametersLinkResponse getParametersLink() {
        return this.parametersLink;
    }

    /**
     * The list of resource providers needed for the deployment.
     * 
     */
    @InputImport(name="providers", required=true)
        private final List<ProviderResponse> providers;

    public List<ProviderResponse> getProviders() {
        return this.providers;
    }

    /**
     * Denotes the state of provisioning.
     * 
     */
    @InputImport(name="provisioningState", required=true)
        private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The hash produced for the template.
     * 
     */
    @InputImport(name="templateHash", required=true)
        private final String templateHash;

    public String getTemplateHash() {
        return this.templateHash;
    }

    /**
     * The URI referencing the template.
     * 
     */
    @InputImport(name="templateLink", required=true)
        private final TemplateLinkResponse templateLink;

    public TemplateLinkResponse getTemplateLink() {
        return this.templateLink;
    }

    /**
     * The timestamp of the template deployment.
     * 
     */
    @InputImport(name="timestamp", required=true)
        private final String timestamp;

    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * Array of validated resources.
     * 
     */
    @InputImport(name="validatedResources", required=true)
        private final List<ResourceReferenceResponse> validatedResources;

    public List<ResourceReferenceResponse> getValidatedResources() {
        return this.validatedResources;
    }

    public DeploymentPropertiesExtendedResponse(
        String correlationId,
        DebugSettingResponse debugSetting,
        List<DependencyResponse> dependencies,
        String duration,
        ErrorResponseResponse error,
        String mode,
        OnErrorDeploymentExtendedResponse onErrorDeployment,
        List<ResourceReferenceResponse> outputResources,
        Object outputs,
        Object parameters,
        ParametersLinkResponse parametersLink,
        List<ProviderResponse> providers,
        String provisioningState,
        String templateHash,
        TemplateLinkResponse templateLink,
        String timestamp,
        List<ResourceReferenceResponse> validatedResources) {
        this.correlationId = Objects.requireNonNull(correlationId, "expected parameter 'correlationId' to be non-null");
        this.debugSetting = Objects.requireNonNull(debugSetting, "expected parameter 'debugSetting' to be non-null");
        this.dependencies = Objects.requireNonNull(dependencies, "expected parameter 'dependencies' to be non-null");
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.onErrorDeployment = Objects.requireNonNull(onErrorDeployment, "expected parameter 'onErrorDeployment' to be non-null");
        this.outputResources = Objects.requireNonNull(outputResources, "expected parameter 'outputResources' to be non-null");
        this.outputs = Objects.requireNonNull(outputs, "expected parameter 'outputs' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.parametersLink = Objects.requireNonNull(parametersLink, "expected parameter 'parametersLink' to be non-null");
        this.providers = Objects.requireNonNull(providers, "expected parameter 'providers' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.templateHash = Objects.requireNonNull(templateHash, "expected parameter 'templateHash' to be non-null");
        this.templateLink = Objects.requireNonNull(templateLink, "expected parameter 'templateLink' to be non-null");
        this.timestamp = Objects.requireNonNull(timestamp, "expected parameter 'timestamp' to be non-null");
        this.validatedResources = Objects.requireNonNull(validatedResources, "expected parameter 'validatedResources' to be non-null");
    }

    private DeploymentPropertiesExtendedResponse() {
        this.correlationId = null;
        this.debugSetting = null;
        this.dependencies = List.of();
        this.duration = null;
        this.error = null;
        this.mode = null;
        this.onErrorDeployment = null;
        this.outputResources = List.of();
        this.outputs = null;
        this.parameters = null;
        this.parametersLink = null;
        this.providers = List.of();
        this.provisioningState = null;
        this.templateHash = null;
        this.templateLink = null;
        this.timestamp = null;
        this.validatedResources = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentPropertiesExtendedResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String correlationId;
        private DebugSettingResponse debugSetting;
        private List<DependencyResponse> dependencies;
        private String duration;
        private ErrorResponseResponse error;
        private String mode;
        private OnErrorDeploymentExtendedResponse onErrorDeployment;
        private List<ResourceReferenceResponse> outputResources;
        private Object outputs;
        private Object parameters;
        private ParametersLinkResponse parametersLink;
        private List<ProviderResponse> providers;
        private String provisioningState;
        private String templateHash;
        private TemplateLinkResponse templateLink;
        private String timestamp;
        private List<ResourceReferenceResponse> validatedResources;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentPropertiesExtendedResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.correlationId = defaults.correlationId;
    	      this.debugSetting = defaults.debugSetting;
    	      this.dependencies = defaults.dependencies;
    	      this.duration = defaults.duration;
    	      this.error = defaults.error;
    	      this.mode = defaults.mode;
    	      this.onErrorDeployment = defaults.onErrorDeployment;
    	      this.outputResources = defaults.outputResources;
    	      this.outputs = defaults.outputs;
    	      this.parameters = defaults.parameters;
    	      this.parametersLink = defaults.parametersLink;
    	      this.providers = defaults.providers;
    	      this.provisioningState = defaults.provisioningState;
    	      this.templateHash = defaults.templateHash;
    	      this.templateLink = defaults.templateLink;
    	      this.timestamp = defaults.timestamp;
    	      this.validatedResources = defaults.validatedResources;
        }

        public Builder setCorrelationId(String correlationId) {
            this.correlationId = Objects.requireNonNull(correlationId);
            return this;
        }

        public Builder setDebugSetting(DebugSettingResponse debugSetting) {
            this.debugSetting = Objects.requireNonNull(debugSetting);
            return this;
        }

        public Builder setDependencies(List<DependencyResponse> dependencies) {
            this.dependencies = Objects.requireNonNull(dependencies);
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setError(ErrorResponseResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setOnErrorDeployment(OnErrorDeploymentExtendedResponse onErrorDeployment) {
            this.onErrorDeployment = Objects.requireNonNull(onErrorDeployment);
            return this;
        }

        public Builder setOutputResources(List<ResourceReferenceResponse> outputResources) {
            this.outputResources = Objects.requireNonNull(outputResources);
            return this;
        }

        public Builder setOutputs(Object outputs) {
            this.outputs = Objects.requireNonNull(outputs);
            return this;
        }

        public Builder setParameters(Object parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setParametersLink(ParametersLinkResponse parametersLink) {
            this.parametersLink = Objects.requireNonNull(parametersLink);
            return this;
        }

        public Builder setProviders(List<ProviderResponse> providers) {
            this.providers = Objects.requireNonNull(providers);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setTemplateHash(String templateHash) {
            this.templateHash = Objects.requireNonNull(templateHash);
            return this;
        }

        public Builder setTemplateLink(TemplateLinkResponse templateLink) {
            this.templateLink = Objects.requireNonNull(templateLink);
            return this;
        }

        public Builder setTimestamp(String timestamp) {
            this.timestamp = Objects.requireNonNull(timestamp);
            return this;
        }

        public Builder setValidatedResources(List<ResourceReferenceResponse> validatedResources) {
            this.validatedResources = Objects.requireNonNull(validatedResources);
            return this;
        }
        public DeploymentPropertiesExtendedResponse build() {
            return new DeploymentPropertiesExtendedResponse(correlationId, debugSetting, dependencies, duration, error, mode, onErrorDeployment, outputResources, outputs, parameters, parametersLink, providers, provisioningState, templateHash, templateLink, timestamp, validatedResources);
        }
    }
}
