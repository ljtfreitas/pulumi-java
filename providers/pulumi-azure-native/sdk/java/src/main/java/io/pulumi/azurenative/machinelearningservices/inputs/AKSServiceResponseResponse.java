// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.AKSServiceResponseResponseAutoScaler;
import io.pulumi.azurenative.machinelearningservices.inputs.AKSServiceResponseResponseDataCollection;
import io.pulumi.azurenative.machinelearningservices.inputs.AKSServiceResponseResponseDeploymentStatus;
import io.pulumi.azurenative.machinelearningservices.inputs.AKSServiceResponseResponseEnvironmentImageRequest;
import io.pulumi.azurenative.machinelearningservices.inputs.AKSServiceResponseResponseLivenessProbeRequirements;
import io.pulumi.azurenative.machinelearningservices.inputs.ContainerResourceRequirementsResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.ModelResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.ServiceResponseBaseResponseError;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The response for an AKS service.
 * 
 */
public final class AKSServiceResponseResponse extends io.pulumi.resources.InvokeArgs {

    public static final AKSServiceResponseResponse Empty = new AKSServiceResponseResponse();

    /**
     * Whether or not AAD authentication is enabled.
     * 
     */
    @InputImport(name="aadAuthEnabled")
        private final @Nullable Boolean aadAuthEnabled;

    public Optional<Boolean> getAadAuthEnabled() {
        return this.aadAuthEnabled == null ? Optional.empty() : Optional.ofNullable(this.aadAuthEnabled);
    }

    /**
     * Whether or not Application Insights is enabled.
     * 
     */
    @InputImport(name="appInsightsEnabled")
        private final @Nullable Boolean appInsightsEnabled;

    public Optional<Boolean> getAppInsightsEnabled() {
        return this.appInsightsEnabled == null ? Optional.empty() : Optional.ofNullable(this.appInsightsEnabled);
    }

    /**
     * Whether or not authentication is enabled.
     * 
     */
    @InputImport(name="authEnabled")
        private final @Nullable Boolean authEnabled;

    public Optional<Boolean> getAuthEnabled() {
        return this.authEnabled == null ? Optional.empty() : Optional.ofNullable(this.authEnabled);
    }

    /**
     * The auto scaler properties.
     * 
     */
    @InputImport(name="autoScaler")
        private final @Nullable AKSServiceResponseResponseAutoScaler autoScaler;

    public Optional<AKSServiceResponseResponseAutoScaler> getAutoScaler() {
        return this.autoScaler == null ? Optional.empty() : Optional.ofNullable(this.autoScaler);
    }

    /**
     * The name of the compute resource.
     * 
     */
    @InputImport(name="computeName")
        private final @Nullable String computeName;

    public Optional<String> getComputeName() {
        return this.computeName == null ? Optional.empty() : Optional.ofNullable(this.computeName);
    }

    /**
     * The compute environment type for the service.
     * Expected value is 'AKS'.
     * 
     */
    @InputImport(name="computeType", required=true)
        private final String computeType;

    public String getComputeType() {
        return this.computeType;
    }

    /**
     * The container resource requirements.
     * 
     */
    @InputImport(name="containerResourceRequirements")
        private final @Nullable ContainerResourceRequirementsResponse containerResourceRequirements;

    public Optional<ContainerResourceRequirementsResponse> getContainerResourceRequirements() {
        return this.containerResourceRequirements == null ? Optional.empty() : Optional.ofNullable(this.containerResourceRequirements);
    }

    /**
     * Details of the data collection options specified.
     * 
     */
    @InputImport(name="dataCollection")
        private final @Nullable AKSServiceResponseResponseDataCollection dataCollection;

    public Optional<AKSServiceResponseResponseDataCollection> getDataCollection() {
        return this.dataCollection == null ? Optional.empty() : Optional.ofNullable(this.dataCollection);
    }

    /**
     * The deployment status.
     * 
     */
    @InputImport(name="deploymentStatus", required=true)
        private final AKSServiceResponseResponseDeploymentStatus deploymentStatus;

    public AKSServiceResponseResponseDeploymentStatus getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * The deployment type for the service.
     * 
     */
    @InputImport(name="deploymentType")
        private final @Nullable String deploymentType;

    public Optional<String> getDeploymentType() {
        return this.deploymentType == null ? Optional.empty() : Optional.ofNullable(this.deploymentType);
    }

    /**
     * The service description.
     * 
     */
    @InputImport(name="description")
        private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The Environment, models and assets used for inferencing.
     * 
     */
    @InputImport(name="environmentImageRequest")
        private final @Nullable AKSServiceResponseResponseEnvironmentImageRequest environmentImageRequest;

    public Optional<AKSServiceResponseResponseEnvironmentImageRequest> getEnvironmentImageRequest() {
        return this.environmentImageRequest == null ? Optional.empty() : Optional.ofNullable(this.environmentImageRequest);
    }

    /**
     * The error details.
     * 
     */
    @InputImport(name="error", required=true)
        private final ServiceResponseBaseResponseError error;

    public ServiceResponseBaseResponseError getError() {
        return this.error;
    }

    /**
     * Is this the default variant.
     * 
     */
    @InputImport(name="isDefault")
        private final @Nullable Boolean isDefault;

    public Optional<Boolean> getIsDefault() {
        return this.isDefault == null ? Optional.empty() : Optional.ofNullable(this.isDefault);
    }

    /**
     * The service tag dictionary. Tags are mutable.
     * 
     */
    @InputImport(name="kvTags")
        private final @Nullable Map<String,String> kvTags;

    public Map<String,String> getKvTags() {
        return this.kvTags == null ? Map.of() : this.kvTags;
    }

    /**
     * The liveness probe requirements.
     * 
     */
    @InputImport(name="livenessProbeRequirements")
        private final @Nullable AKSServiceResponseResponseLivenessProbeRequirements livenessProbeRequirements;

    public Optional<AKSServiceResponseResponseLivenessProbeRequirements> getLivenessProbeRequirements() {
        return this.livenessProbeRequirements == null ? Optional.empty() : Optional.ofNullable(this.livenessProbeRequirements);
    }

    /**
     * The maximum number of concurrent requests per container.
     * 
     */
    @InputImport(name="maxConcurrentRequestsPerContainer")
        private final @Nullable Integer maxConcurrentRequestsPerContainer;

    public Optional<Integer> getMaxConcurrentRequestsPerContainer() {
        return this.maxConcurrentRequestsPerContainer == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentRequestsPerContainer);
    }

    /**
     * Maximum time a request will wait in the queue (in milliseconds). After this time, the service will return 503 (Service Unavailable)
     * 
     */
    @InputImport(name="maxQueueWaitMs")
        private final @Nullable Integer maxQueueWaitMs;

    public Optional<Integer> getMaxQueueWaitMs() {
        return this.maxQueueWaitMs == null ? Optional.empty() : Optional.ofNullable(this.maxQueueWaitMs);
    }

    /**
     * Details on the models and configurations.
     * 
     */
    @InputImport(name="modelConfigMap", required=true)
        private final Map<String,Object> modelConfigMap;

    public Map<String,Object> getModelConfigMap() {
        return this.modelConfigMap;
    }

    /**
     * The list of models.
     * 
     */
    @InputImport(name="models")
        private final @Nullable List<ModelResponse> models;

    public List<ModelResponse> getModels() {
        return this.models == null ? List.of() : this.models;
    }

    /**
     * The Kubernetes namespace of the deployment.
     * 
     */
    @InputImport(name="namespace")
        private final @Nullable String namespace;

    public Optional<String> getNamespace() {
        return this.namespace == null ? Optional.empty() : Optional.ofNullable(this.namespace);
    }

    /**
     * The number of replicas on the cluster.
     * 
     */
    @InputImport(name="numReplicas")
        private final @Nullable Integer numReplicas;

    public Optional<Integer> getNumReplicas() {
        return this.numReplicas == null ? Optional.empty() : Optional.ofNullable(this.numReplicas);
    }

    /**
     * The service property dictionary. Properties are immutable.
     * 
     */
    @InputImport(name="properties")
        private final @Nullable Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    /**
     * The scoring timeout in milliseconds.
     * 
     */
    @InputImport(name="scoringTimeoutMs")
        private final @Nullable Integer scoringTimeoutMs;

    public Optional<Integer> getScoringTimeoutMs() {
        return this.scoringTimeoutMs == null ? Optional.empty() : Optional.ofNullable(this.scoringTimeoutMs);
    }

    /**
     * The Uri for sending scoring requests.
     * 
     */
    @InputImport(name="scoringUri", required=true)
        private final String scoringUri;

    public String getScoringUri() {
        return this.scoringUri;
    }

    /**
     * The current state of the service.
     * 
     */
    @InputImport(name="state", required=true)
        private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * The Uri for sending swagger requests.
     * 
     */
    @InputImport(name="swaggerUri", required=true)
        private final String swaggerUri;

    public String getSwaggerUri() {
        return this.swaggerUri;
    }

    /**
     * The amount of traffic variant receives.
     * 
     */
    @InputImport(name="trafficPercentile")
        private final @Nullable Double trafficPercentile;

    public Optional<Double> getTrafficPercentile() {
        return this.trafficPercentile == null ? Optional.empty() : Optional.ofNullable(this.trafficPercentile);
    }

    /**
     * The type of the variant.
     * 
     */
    @InputImport(name="type")
        private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public AKSServiceResponseResponse(
        @Nullable Boolean aadAuthEnabled,
        @Nullable Boolean appInsightsEnabled,
        @Nullable Boolean authEnabled,
        @Nullable AKSServiceResponseResponseAutoScaler autoScaler,
        @Nullable String computeName,
        String computeType,
        @Nullable ContainerResourceRequirementsResponse containerResourceRequirements,
        @Nullable AKSServiceResponseResponseDataCollection dataCollection,
        AKSServiceResponseResponseDeploymentStatus deploymentStatus,
        @Nullable String deploymentType,
        @Nullable String description,
        @Nullable AKSServiceResponseResponseEnvironmentImageRequest environmentImageRequest,
        ServiceResponseBaseResponseError error,
        @Nullable Boolean isDefault,
        @Nullable Map<String,String> kvTags,
        @Nullable AKSServiceResponseResponseLivenessProbeRequirements livenessProbeRequirements,
        @Nullable Integer maxConcurrentRequestsPerContainer,
        @Nullable Integer maxQueueWaitMs,
        Map<String,Object> modelConfigMap,
        @Nullable List<ModelResponse> models,
        @Nullable String namespace,
        @Nullable Integer numReplicas,
        @Nullable Map<String,String> properties,
        @Nullable Integer scoringTimeoutMs,
        String scoringUri,
        String state,
        String swaggerUri,
        @Nullable Double trafficPercentile,
        @Nullable String type) {
        this.aadAuthEnabled = aadAuthEnabled;
        this.appInsightsEnabled = appInsightsEnabled;
        this.authEnabled = authEnabled;
        this.autoScaler = autoScaler;
        this.computeName = computeName;
        this.computeType = Objects.requireNonNull(computeType, "expected parameter 'computeType' to be non-null");
        this.containerResourceRequirements = containerResourceRequirements;
        this.dataCollection = dataCollection;
        this.deploymentStatus = Objects.requireNonNull(deploymentStatus, "expected parameter 'deploymentStatus' to be non-null");
        this.deploymentType = deploymentType;
        this.description = description;
        this.environmentImageRequest = environmentImageRequest;
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.isDefault = isDefault;
        this.kvTags = kvTags;
        this.livenessProbeRequirements = livenessProbeRequirements;
        this.maxConcurrentRequestsPerContainer = maxConcurrentRequestsPerContainer;
        this.maxQueueWaitMs = maxQueueWaitMs;
        this.modelConfigMap = Objects.requireNonNull(modelConfigMap, "expected parameter 'modelConfigMap' to be non-null");
        this.models = models;
        this.namespace = namespace;
        this.numReplicas = numReplicas;
        this.properties = properties;
        this.scoringTimeoutMs = scoringTimeoutMs;
        this.scoringUri = Objects.requireNonNull(scoringUri, "expected parameter 'scoringUri' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.swaggerUri = Objects.requireNonNull(swaggerUri, "expected parameter 'swaggerUri' to be non-null");
        this.trafficPercentile = trafficPercentile;
        this.type = type;
    }

    private AKSServiceResponseResponse() {
        this.aadAuthEnabled = null;
        this.appInsightsEnabled = null;
        this.authEnabled = null;
        this.autoScaler = null;
        this.computeName = null;
        this.computeType = null;
        this.containerResourceRequirements = null;
        this.dataCollection = null;
        this.deploymentStatus = null;
        this.deploymentType = null;
        this.description = null;
        this.environmentImageRequest = null;
        this.error = null;
        this.isDefault = null;
        this.kvTags = Map.of();
        this.livenessProbeRequirements = null;
        this.maxConcurrentRequestsPerContainer = null;
        this.maxQueueWaitMs = null;
        this.modelConfigMap = Map.of();
        this.models = List.of();
        this.namespace = null;
        this.numReplicas = null;
        this.properties = Map.of();
        this.scoringTimeoutMs = null;
        this.scoringUri = null;
        this.state = null;
        this.swaggerUri = null;
        this.trafficPercentile = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AKSServiceResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean aadAuthEnabled;
        private @Nullable Boolean appInsightsEnabled;
        private @Nullable Boolean authEnabled;
        private @Nullable AKSServiceResponseResponseAutoScaler autoScaler;
        private @Nullable String computeName;
        private String computeType;
        private @Nullable ContainerResourceRequirementsResponse containerResourceRequirements;
        private @Nullable AKSServiceResponseResponseDataCollection dataCollection;
        private AKSServiceResponseResponseDeploymentStatus deploymentStatus;
        private @Nullable String deploymentType;
        private @Nullable String description;
        private @Nullable AKSServiceResponseResponseEnvironmentImageRequest environmentImageRequest;
        private ServiceResponseBaseResponseError error;
        private @Nullable Boolean isDefault;
        private @Nullable Map<String,String> kvTags;
        private @Nullable AKSServiceResponseResponseLivenessProbeRequirements livenessProbeRequirements;
        private @Nullable Integer maxConcurrentRequestsPerContainer;
        private @Nullable Integer maxQueueWaitMs;
        private Map<String,Object> modelConfigMap;
        private @Nullable List<ModelResponse> models;
        private @Nullable String namespace;
        private @Nullable Integer numReplicas;
        private @Nullable Map<String,String> properties;
        private @Nullable Integer scoringTimeoutMs;
        private String scoringUri;
        private String state;
        private String swaggerUri;
        private @Nullable Double trafficPercentile;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AKSServiceResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadAuthEnabled = defaults.aadAuthEnabled;
    	      this.appInsightsEnabled = defaults.appInsightsEnabled;
    	      this.authEnabled = defaults.authEnabled;
    	      this.autoScaler = defaults.autoScaler;
    	      this.computeName = defaults.computeName;
    	      this.computeType = defaults.computeType;
    	      this.containerResourceRequirements = defaults.containerResourceRequirements;
    	      this.dataCollection = defaults.dataCollection;
    	      this.deploymentStatus = defaults.deploymentStatus;
    	      this.deploymentType = defaults.deploymentType;
    	      this.description = defaults.description;
    	      this.environmentImageRequest = defaults.environmentImageRequest;
    	      this.error = defaults.error;
    	      this.isDefault = defaults.isDefault;
    	      this.kvTags = defaults.kvTags;
    	      this.livenessProbeRequirements = defaults.livenessProbeRequirements;
    	      this.maxConcurrentRequestsPerContainer = defaults.maxConcurrentRequestsPerContainer;
    	      this.maxQueueWaitMs = defaults.maxQueueWaitMs;
    	      this.modelConfigMap = defaults.modelConfigMap;
    	      this.models = defaults.models;
    	      this.namespace = defaults.namespace;
    	      this.numReplicas = defaults.numReplicas;
    	      this.properties = defaults.properties;
    	      this.scoringTimeoutMs = defaults.scoringTimeoutMs;
    	      this.scoringUri = defaults.scoringUri;
    	      this.state = defaults.state;
    	      this.swaggerUri = defaults.swaggerUri;
    	      this.trafficPercentile = defaults.trafficPercentile;
    	      this.type = defaults.type;
        }

        public Builder setAadAuthEnabled(@Nullable Boolean aadAuthEnabled) {
            this.aadAuthEnabled = aadAuthEnabled;
            return this;
        }

        public Builder setAppInsightsEnabled(@Nullable Boolean appInsightsEnabled) {
            this.appInsightsEnabled = appInsightsEnabled;
            return this;
        }

        public Builder setAuthEnabled(@Nullable Boolean authEnabled) {
            this.authEnabled = authEnabled;
            return this;
        }

        public Builder setAutoScaler(@Nullable AKSServiceResponseResponseAutoScaler autoScaler) {
            this.autoScaler = autoScaler;
            return this;
        }

        public Builder setComputeName(@Nullable String computeName) {
            this.computeName = computeName;
            return this;
        }

        public Builder setComputeType(String computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }

        public Builder setContainerResourceRequirements(@Nullable ContainerResourceRequirementsResponse containerResourceRequirements) {
            this.containerResourceRequirements = containerResourceRequirements;
            return this;
        }

        public Builder setDataCollection(@Nullable AKSServiceResponseResponseDataCollection dataCollection) {
            this.dataCollection = dataCollection;
            return this;
        }

        public Builder setDeploymentStatus(AKSServiceResponseResponseDeploymentStatus deploymentStatus) {
            this.deploymentStatus = Objects.requireNonNull(deploymentStatus);
            return this;
        }

        public Builder setDeploymentType(@Nullable String deploymentType) {
            this.deploymentType = deploymentType;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEnvironmentImageRequest(@Nullable AKSServiceResponseResponseEnvironmentImageRequest environmentImageRequest) {
            this.environmentImageRequest = environmentImageRequest;
            return this;
        }

        public Builder setError(ServiceResponseBaseResponseError error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setIsDefault(@Nullable Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        public Builder setKvTags(@Nullable Map<String,String> kvTags) {
            this.kvTags = kvTags;
            return this;
        }

        public Builder setLivenessProbeRequirements(@Nullable AKSServiceResponseResponseLivenessProbeRequirements livenessProbeRequirements) {
            this.livenessProbeRequirements = livenessProbeRequirements;
            return this;
        }

        public Builder setMaxConcurrentRequestsPerContainer(@Nullable Integer maxConcurrentRequestsPerContainer) {
            this.maxConcurrentRequestsPerContainer = maxConcurrentRequestsPerContainer;
            return this;
        }

        public Builder setMaxQueueWaitMs(@Nullable Integer maxQueueWaitMs) {
            this.maxQueueWaitMs = maxQueueWaitMs;
            return this;
        }

        public Builder setModelConfigMap(Map<String,Object> modelConfigMap) {
            this.modelConfigMap = Objects.requireNonNull(modelConfigMap);
            return this;
        }

        public Builder setModels(@Nullable List<ModelResponse> models) {
            this.models = models;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setNumReplicas(@Nullable Integer numReplicas) {
            this.numReplicas = numReplicas;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setScoringTimeoutMs(@Nullable Integer scoringTimeoutMs) {
            this.scoringTimeoutMs = scoringTimeoutMs;
            return this;
        }

        public Builder setScoringUri(String scoringUri) {
            this.scoringUri = Objects.requireNonNull(scoringUri);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setSwaggerUri(String swaggerUri) {
            this.swaggerUri = Objects.requireNonNull(swaggerUri);
            return this;
        }

        public Builder setTrafficPercentile(@Nullable Double trafficPercentile) {
            this.trafficPercentile = trafficPercentile;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public AKSServiceResponseResponse build() {
            return new AKSServiceResponseResponse(aadAuthEnabled, appInsightsEnabled, authEnabled, autoScaler, computeName, computeType, containerResourceRequirements, dataCollection, deploymentStatus, deploymentType, description, environmentImageRequest, error, isDefault, kvTags, livenessProbeRequirements, maxConcurrentRequestsPerContainer, maxQueueWaitMs, modelConfigMap, models, namespace, numReplicas, properties, scoringTimeoutMs, scoringUri, state, swaggerUri, trafficPercentile, type);
        }
    }
}
