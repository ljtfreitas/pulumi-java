// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.ml_v1.enums.VersionFramework;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__AcceleratorConfigArgs;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__AutoScalingArgs;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__ContainerSpecArgs;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__ExplanationConfigArgs;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__ManualScalingArgs;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__RequestLoggingConfigArgs;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__RouteMapArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final VersionArgs Empty = new VersionArgs();

    /**
     * Optional. Accelerator config for using GPUs for online prediction (beta). Only specify this field if you have specified a Compute Engine (N1) machine type in the `machineType` field. Learn more about [using GPUs for online prediction](/ml-engine/docs/machine-types-online-prediction#gpus).
     * 
     */
    @InputImport(name="acceleratorConfig")
      private final @Nullable Input<GoogleCloudMlV1__AcceleratorConfigArgs> acceleratorConfig;

    public Input<GoogleCloudMlV1__AcceleratorConfigArgs> getAcceleratorConfig() {
        return this.acceleratorConfig == null ? Input.empty() : this.acceleratorConfig;
    }

    /**
     * Automatically scale the number of nodes used to serve the model in response to increases and decreases in traffic. Care should be taken to ramp up traffic according to the model's ability to scale or you will start seeing increases in latency and 429 response codes.
     * 
     */
    @InputImport(name="autoScaling")
      private final @Nullable Input<GoogleCloudMlV1__AutoScalingArgs> autoScaling;

    public Input<GoogleCloudMlV1__AutoScalingArgs> getAutoScaling() {
        return this.autoScaling == null ? Input.empty() : this.autoScaling;
    }

    /**
     * Optional. Specifies a custom container to use for serving predictions. If you specify this field, then `machineType` is required. If you specify this field, then `deploymentUri` is optional. If you specify this field, then you must not specify `runtimeVersion`, `packageUris`, `framework`, `pythonVersion`, or `predictionClass`.
     * 
     */
    @InputImport(name="container")
      private final @Nullable Input<GoogleCloudMlV1__ContainerSpecArgs> container;

    public Input<GoogleCloudMlV1__ContainerSpecArgs> getContainer() {
        return this.container == null ? Input.empty() : this.container;
    }

    /**
     * The Cloud Storage URI of a directory containing trained model artifacts to be used to create the model version. See the [guide to deploying models](/ai-platform/prediction/docs/deploying-models) for more information. The total number of files under this directory must not exceed 1000. During projects.models.versions.create, AI Platform Prediction copies all files from the specified directory to a location managed by the service. From then on, AI Platform Prediction uses these copies of the model artifacts to serve predictions, not the original files in Cloud Storage, so this location is useful only as a historical record. If you specify container, then this field is optional. Otherwise, it is required. Learn [how to use this field with a custom container](/ai-platform/prediction/docs/custom-container-requirements#artifacts).
     * 
     */
    @InputImport(name="deploymentUri")
      private final @Nullable Input<String> deploymentUri;

    public Input<String> getDeploymentUri() {
        return this.deploymentUri == null ? Input.empty() : this.deploymentUri;
    }

    /**
     * Optional. The description specified for the version when it was created.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a model from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform model updates in order to avoid race conditions: An `etag` is returned in the response to `GetVersion`, and systems are expected to put that etag in the request to `UpdateVersion` to ensure that their change will be applied to the model as intended.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * Optional. Configures explainability features on the model's version. Some explanation features require additional metadata to be loaded as part of the model payload.
     * 
     */
    @InputImport(name="explanationConfig")
      private final @Nullable Input<GoogleCloudMlV1__ExplanationConfigArgs> explanationConfig;

    public Input<GoogleCloudMlV1__ExplanationConfigArgs> getExplanationConfig() {
        return this.explanationConfig == null ? Input.empty() : this.explanationConfig;
    }

    /**
     * Optional. The machine learning framework AI Platform uses to train this version of the model. Valid values are `TENSORFLOW`, `SCIKIT_LEARN`, `XGBOOST`. If you do not specify a framework, AI Platform will analyze files in the deployment_uri to determine a framework. If you choose `SCIKIT_LEARN` or `XGBOOST`, you must also set the runtime version of the model to 1.4 or greater. Do **not** specify a framework if you're deploying a [custom prediction routine](/ai-platform/prediction/docs/custom-prediction-routines) or if you're using a [custom container](/ai-platform/prediction/docs/use-custom-container).
     * 
     */
    @InputImport(name="framework")
      private final @Nullable Input<VersionFramework> framework;

    public Input<VersionFramework> getFramework() {
        return this.framework == null ? Input.empty() : this.framework;
    }

    /**
     * Optional. One or more labels that you can add, to organize your model versions. Each label is a key-value pair, where both the key and the value are arbitrary strings that you supply. For more information, see the documentation on using labels.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Optional. The type of machine on which to serve the model. Currently only applies to online prediction service. To learn about valid values for this field, read [Choosing a machine type for online prediction](/ai-platform/prediction/docs/machine-types-online-prediction). If this field is not specified and you are using a [regional endpoint](/ai-platform/prediction/docs/regional-endpoints), then the machine type defaults to `n1-standard-2`. If this field is not specified and you are using the global endpoint (`ml.googleapis.com`), then the machine type defaults to `mls1-c1-m2`.
     * 
     */
    @InputImport(name="machineType")
      private final @Nullable Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType == null ? Input.empty() : this.machineType;
    }

    /**
     * Manually select the number of nodes to use for serving the model. You should generally use `auto_scaling` with an appropriate `min_nodes` instead, but this option is available if you want more predictable billing. Beware that latency and error rates will increase if the traffic exceeds that capability of the system to serve it based on the selected number of nodes.
     * 
     */
    @InputImport(name="manualScaling")
      private final @Nullable Input<GoogleCloudMlV1__ManualScalingArgs> manualScaling;

    public Input<GoogleCloudMlV1__ManualScalingArgs> getManualScaling() {
        return this.manualScaling == null ? Input.empty() : this.manualScaling;
    }

    @InputImport(name="modelId", required=true)
      private final Input<String> modelId;

    public Input<String> getModelId() {
        return this.modelId;
    }

    /**
     * The name specified for the version when it was created. The version name must be unique within the model it is created in.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Optional. Cloud Storage paths (`gs://…`) of packages for [custom prediction routines](/ml-engine/docs/tensorflow/custom-prediction-routines) or [scikit-learn pipelines with custom code](/ml-engine/docs/scikit/exporting-for-prediction#custom-pipeline-code). For a custom prediction routine, one of these packages must contain your Predictor class (see [`predictionClass`](#Version.FIELDS.prediction_class)). Additionally, include any dependencies used by your Predictor or scikit-learn pipeline uses that are not already included in your selected [runtime version](/ml-engine/docs/tensorflow/runtime-version-list). If you specify this field, you must also set [`runtimeVersion`](#Version.FIELDS.runtime_version) to 1.4 or greater.
     * 
     */
    @InputImport(name="packageUris")
      private final @Nullable Input<List<String>> packageUris;

    public Input<List<String>> getPackageUris() {
        return this.packageUris == null ? Input.empty() : this.packageUris;
    }

    /**
     * Optional. The fully qualified name (module_name.class_name) of a class that implements the Predictor interface described in this reference field. The module containing this class should be included in a package provided to the [`packageUris` field](#Version.FIELDS.package_uris). Specify this field if and only if you are deploying a [custom prediction routine (beta)](/ml-engine/docs/tensorflow/custom-prediction-routines). If you specify this field, you must set [`runtimeVersion`](#Version.FIELDS.runtime_version) to 1.4 or greater and you must set `machineType` to a [legacy (MLS1) machine type](/ml-engine/docs/machine-types-online-prediction). The following code sample provides the Predictor interface: class Predictor(object): """Interface for constructing custom predictors.""" def predict(self, instances, **kwargs): """Performs custom prediction. Instances are the decoded values from the request. They have already been deserialized from JSON. Args: instances: A list of prediction input instances. **kwargs: A dictionary of keyword args provided as additional fields on the predict request body. Returns: A list of outputs containing the prediction results. This list must be JSON serializable. """ raise NotImplementedError() @classmethod def from_path(cls, model_dir): """Creates an instance of Predictor using the given path. Loading of the predictor should be done in this method. Args: model_dir: The local directory that contains the exported model file along with any additional files uploaded when creating the version resource. Returns: An instance implementing this Predictor class. """ raise NotImplementedError() Learn more about [the Predictor interface and custom prediction routines](/ml-engine/docs/tensorflow/custom-prediction-routines).
     * 
     */
    @InputImport(name="predictionClass")
      private final @Nullable Input<String> predictionClass;

    public Input<String> getPredictionClass() {
        return this.predictionClass == null ? Input.empty() : this.predictionClass;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The version of Python used in prediction. The following Python versions are available: * Python '3.7' is available when `runtime_version` is set to '1.15' or later. * Python '3.5' is available when `runtime_version` is set to a version from '1.4' to '1.14'. * Python '2.7' is available when `runtime_version` is set to '1.15' or earlier. Read more about the Python versions available for [each runtime version](/ml-engine/docs/runtime-version-list).
     * 
     */
    @InputImport(name="pythonVersion", required=true)
      private final Input<String> pythonVersion;

    public Input<String> getPythonVersion() {
        return this.pythonVersion;
    }

    /**
     * Optional. *Only* specify this field in a projects.models.versions.patch request. Specifying it in a projects.models.versions.create request has no effect. Configures the request-response pair logging on predictions from this Version.
     * 
     */
    @InputImport(name="requestLoggingConfig")
      private final @Nullable Input<GoogleCloudMlV1__RequestLoggingConfigArgs> requestLoggingConfig;

    public Input<GoogleCloudMlV1__RequestLoggingConfigArgs> getRequestLoggingConfig() {
        return this.requestLoggingConfig == null ? Input.empty() : this.requestLoggingConfig;
    }

    /**
     * Optional. Specifies paths on a custom container's HTTP server where AI Platform Prediction sends certain requests. If you specify this field, then you must also specify the `container` field. If you specify the `container` field and do not specify this field, it defaults to the following: ``` json { "predict": "/v1/models/MODEL/versions/VERSION:predict", "health": "/v1/models/MODEL/versions/VERSION" }  ``` See RouteMap for more details about these default values.
     * 
     */
    @InputImport(name="routes")
      private final @Nullable Input<GoogleCloudMlV1__RouteMapArgs> routes;

    public Input<GoogleCloudMlV1__RouteMapArgs> getRoutes() {
        return this.routes == null ? Input.empty() : this.routes;
    }

    /**
     * The AI Platform runtime version to use for this deployment. For more information, see the [runtime version list](/ml-engine/docs/runtime-version-list) and [how to manage runtime versions](/ml-engine/docs/versioning).
     * 
     */
    @InputImport(name="runtimeVersion", required=true)
      private final Input<String> runtimeVersion;

    public Input<String> getRuntimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Optional. Specifies the service account for resource access control. If you specify this field, then you must also specify either the `containerSpec` or the `predictionClass` field. Learn more about [using a custom service account](/ai-platform/prediction/docs/custom-service-account).
     * 
     */
    @InputImport(name="serviceAccount")
      private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    public VersionArgs(
        @Nullable Input<GoogleCloudMlV1__AcceleratorConfigArgs> acceleratorConfig,
        @Nullable Input<GoogleCloudMlV1__AutoScalingArgs> autoScaling,
        @Nullable Input<GoogleCloudMlV1__ContainerSpecArgs> container,
        @Nullable Input<String> deploymentUri,
        @Nullable Input<String> description,
        @Nullable Input<String> etag,
        @Nullable Input<GoogleCloudMlV1__ExplanationConfigArgs> explanationConfig,
        @Nullable Input<VersionFramework> framework,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> machineType,
        @Nullable Input<GoogleCloudMlV1__ManualScalingArgs> manualScaling,
        Input<String> modelId,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> packageUris,
        @Nullable Input<String> predictionClass,
        @Nullable Input<String> project,
        Input<String> pythonVersion,
        @Nullable Input<GoogleCloudMlV1__RequestLoggingConfigArgs> requestLoggingConfig,
        @Nullable Input<GoogleCloudMlV1__RouteMapArgs> routes,
        Input<String> runtimeVersion,
        @Nullable Input<String> serviceAccount) {
        this.acceleratorConfig = acceleratorConfig;
        this.autoScaling = autoScaling;
        this.container = container;
        this.deploymentUri = deploymentUri;
        this.description = description;
        this.etag = etag;
        this.explanationConfig = explanationConfig;
        this.framework = framework;
        this.labels = labels;
        this.machineType = machineType;
        this.manualScaling = manualScaling;
        this.modelId = Objects.requireNonNull(modelId, "expected parameter 'modelId' to be non-null");
        this.name = name;
        this.packageUris = packageUris;
        this.predictionClass = predictionClass;
        this.project = project;
        this.pythonVersion = Objects.requireNonNull(pythonVersion, "expected parameter 'pythonVersion' to be non-null");
        this.requestLoggingConfig = requestLoggingConfig;
        this.routes = routes;
        this.runtimeVersion = Objects.requireNonNull(runtimeVersion, "expected parameter 'runtimeVersion' to be non-null");
        this.serviceAccount = serviceAccount;
    }

    private VersionArgs() {
        this.acceleratorConfig = Input.empty();
        this.autoScaling = Input.empty();
        this.container = Input.empty();
        this.deploymentUri = Input.empty();
        this.description = Input.empty();
        this.etag = Input.empty();
        this.explanationConfig = Input.empty();
        this.framework = Input.empty();
        this.labels = Input.empty();
        this.machineType = Input.empty();
        this.manualScaling = Input.empty();
        this.modelId = Input.empty();
        this.name = Input.empty();
        this.packageUris = Input.empty();
        this.predictionClass = Input.empty();
        this.project = Input.empty();
        this.pythonVersion = Input.empty();
        this.requestLoggingConfig = Input.empty();
        this.routes = Input.empty();
        this.runtimeVersion = Input.empty();
        this.serviceAccount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudMlV1__AcceleratorConfigArgs> acceleratorConfig;
        private @Nullable Input<GoogleCloudMlV1__AutoScalingArgs> autoScaling;
        private @Nullable Input<GoogleCloudMlV1__ContainerSpecArgs> container;
        private @Nullable Input<String> deploymentUri;
        private @Nullable Input<String> description;
        private @Nullable Input<String> etag;
        private @Nullable Input<GoogleCloudMlV1__ExplanationConfigArgs> explanationConfig;
        private @Nullable Input<VersionFramework> framework;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> machineType;
        private @Nullable Input<GoogleCloudMlV1__ManualScalingArgs> manualScaling;
        private Input<String> modelId;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> packageUris;
        private @Nullable Input<String> predictionClass;
        private @Nullable Input<String> project;
        private Input<String> pythonVersion;
        private @Nullable Input<GoogleCloudMlV1__RequestLoggingConfigArgs> requestLoggingConfig;
        private @Nullable Input<GoogleCloudMlV1__RouteMapArgs> routes;
        private Input<String> runtimeVersion;
        private @Nullable Input<String> serviceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(VersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorConfig = defaults.acceleratorConfig;
    	      this.autoScaling = defaults.autoScaling;
    	      this.container = defaults.container;
    	      this.deploymentUri = defaults.deploymentUri;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.explanationConfig = defaults.explanationConfig;
    	      this.framework = defaults.framework;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.manualScaling = defaults.manualScaling;
    	      this.modelId = defaults.modelId;
    	      this.name = defaults.name;
    	      this.packageUris = defaults.packageUris;
    	      this.predictionClass = defaults.predictionClass;
    	      this.project = defaults.project;
    	      this.pythonVersion = defaults.pythonVersion;
    	      this.requestLoggingConfig = defaults.requestLoggingConfig;
    	      this.routes = defaults.routes;
    	      this.runtimeVersion = defaults.runtimeVersion;
    	      this.serviceAccount = defaults.serviceAccount;
        }

        public Builder setAcceleratorConfig(@Nullable Input<GoogleCloudMlV1__AcceleratorConfigArgs> acceleratorConfig) {
            this.acceleratorConfig = acceleratorConfig;
            return this;
        }

        public Builder setAcceleratorConfig(@Nullable GoogleCloudMlV1__AcceleratorConfigArgs acceleratorConfig) {
            this.acceleratorConfig = Input.ofNullable(acceleratorConfig);
            return this;
        }

        public Builder setAutoScaling(@Nullable Input<GoogleCloudMlV1__AutoScalingArgs> autoScaling) {
            this.autoScaling = autoScaling;
            return this;
        }

        public Builder setAutoScaling(@Nullable GoogleCloudMlV1__AutoScalingArgs autoScaling) {
            this.autoScaling = Input.ofNullable(autoScaling);
            return this;
        }

        public Builder setContainer(@Nullable Input<GoogleCloudMlV1__ContainerSpecArgs> container) {
            this.container = container;
            return this;
        }

        public Builder setContainer(@Nullable GoogleCloudMlV1__ContainerSpecArgs container) {
            this.container = Input.ofNullable(container);
            return this;
        }

        public Builder setDeploymentUri(@Nullable Input<String> deploymentUri) {
            this.deploymentUri = deploymentUri;
            return this;
        }

        public Builder setDeploymentUri(@Nullable String deploymentUri) {
            this.deploymentUri = Input.ofNullable(deploymentUri);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setExplanationConfig(@Nullable Input<GoogleCloudMlV1__ExplanationConfigArgs> explanationConfig) {
            this.explanationConfig = explanationConfig;
            return this;
        }

        public Builder setExplanationConfig(@Nullable GoogleCloudMlV1__ExplanationConfigArgs explanationConfig) {
            this.explanationConfig = Input.ofNullable(explanationConfig);
            return this;
        }

        public Builder setFramework(@Nullable Input<VersionFramework> framework) {
            this.framework = framework;
            return this;
        }

        public Builder setFramework(@Nullable VersionFramework framework) {
            this.framework = Input.ofNullable(framework);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setMachineType(@Nullable Input<String> machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder setMachineType(@Nullable String machineType) {
            this.machineType = Input.ofNullable(machineType);
            return this;
        }

        public Builder setManualScaling(@Nullable Input<GoogleCloudMlV1__ManualScalingArgs> manualScaling) {
            this.manualScaling = manualScaling;
            return this;
        }

        public Builder setManualScaling(@Nullable GoogleCloudMlV1__ManualScalingArgs manualScaling) {
            this.manualScaling = Input.ofNullable(manualScaling);
            return this;
        }

        public Builder setModelId(Input<String> modelId) {
            this.modelId = Objects.requireNonNull(modelId);
            return this;
        }

        public Builder setModelId(String modelId) {
            this.modelId = Input.of(Objects.requireNonNull(modelId));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPackageUris(@Nullable Input<List<String>> packageUris) {
            this.packageUris = packageUris;
            return this;
        }

        public Builder setPackageUris(@Nullable List<String> packageUris) {
            this.packageUris = Input.ofNullable(packageUris);
            return this;
        }

        public Builder setPredictionClass(@Nullable Input<String> predictionClass) {
            this.predictionClass = predictionClass;
            return this;
        }

        public Builder setPredictionClass(@Nullable String predictionClass) {
            this.predictionClass = Input.ofNullable(predictionClass);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setPythonVersion(Input<String> pythonVersion) {
            this.pythonVersion = Objects.requireNonNull(pythonVersion);
            return this;
        }

        public Builder setPythonVersion(String pythonVersion) {
            this.pythonVersion = Input.of(Objects.requireNonNull(pythonVersion));
            return this;
        }

        public Builder setRequestLoggingConfig(@Nullable Input<GoogleCloudMlV1__RequestLoggingConfigArgs> requestLoggingConfig) {
            this.requestLoggingConfig = requestLoggingConfig;
            return this;
        }

        public Builder setRequestLoggingConfig(@Nullable GoogleCloudMlV1__RequestLoggingConfigArgs requestLoggingConfig) {
            this.requestLoggingConfig = Input.ofNullable(requestLoggingConfig);
            return this;
        }

        public Builder setRoutes(@Nullable Input<GoogleCloudMlV1__RouteMapArgs> routes) {
            this.routes = routes;
            return this;
        }

        public Builder setRoutes(@Nullable GoogleCloudMlV1__RouteMapArgs routes) {
            this.routes = Input.ofNullable(routes);
            return this;
        }

        public Builder setRuntimeVersion(Input<String> runtimeVersion) {
            this.runtimeVersion = Objects.requireNonNull(runtimeVersion);
            return this;
        }

        public Builder setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = Input.of(Objects.requireNonNull(runtimeVersion));
            return this;
        }

        public Builder setServiceAccount(@Nullable Input<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }
        public VersionArgs build() {
            return new VersionArgs(acceleratorConfig, autoScaling, container, deploymentUri, description, etag, explanationConfig, framework, labels, machineType, manualScaling, modelId, name, packageUris, predictionClass, project, pythonVersion, requestLoggingConfig, routes, runtimeVersion, serviceAccount);
        }
    }
}
