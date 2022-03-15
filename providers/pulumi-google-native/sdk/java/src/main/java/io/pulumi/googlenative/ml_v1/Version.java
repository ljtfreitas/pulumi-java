// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.ml_v1.VersionArgs;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__AcceleratorConfigResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__AutoScalingResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__ContainerSpecResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__ExplanationConfigResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__ManualScalingResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__RequestLoggingConfigResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__RouteMapResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new version of a model from a trained TensorFlow model. If the version created in the cloud by this call is the first deployed version of the specified model, it will be made the default version of the model. When you add a version to a model that already has one or more versions, the default version does not automatically change. If you want a new version to be the default, you must call projects.models.versions.setDefault.
 * 
 */
@ResourceType(type="google-native:ml/v1:Version")
public class Version extends io.pulumi.resources.CustomResource {
    /**
     * Optional. Accelerator config for using GPUs for online prediction (beta). Only specify this field if you have specified a Compute Engine (N1) machine type in the `machineType` field. Learn more about [using GPUs for online prediction](/ml-engine/docs/machine-types-online-prediction#gpus).
     * 
     */
    @Export(name="acceleratorConfig", type=GoogleCloudMlV1__AcceleratorConfigResponse.class, parameters={})
    private Output<GoogleCloudMlV1__AcceleratorConfigResponse> acceleratorConfig;

    /**
     * @return Optional. Accelerator config for using GPUs for online prediction (beta). Only specify this field if you have specified a Compute Engine (N1) machine type in the `machineType` field. Learn more about [using GPUs for online prediction](/ml-engine/docs/machine-types-online-prediction#gpus).
     * 
     */
    public Output<GoogleCloudMlV1__AcceleratorConfigResponse> getAcceleratorConfig() {
        return this.acceleratorConfig;
    }
    /**
     * Automatically scale the number of nodes used to serve the model in response to increases and decreases in traffic. Care should be taken to ramp up traffic according to the model's ability to scale or you will start seeing increases in latency and 429 response codes.
     * 
     */
    @Export(name="autoScaling", type=GoogleCloudMlV1__AutoScalingResponse.class, parameters={})
    private Output<GoogleCloudMlV1__AutoScalingResponse> autoScaling;

    /**
     * @return Automatically scale the number of nodes used to serve the model in response to increases and decreases in traffic. Care should be taken to ramp up traffic according to the model's ability to scale or you will start seeing increases in latency and 429 response codes.
     * 
     */
    public Output<GoogleCloudMlV1__AutoScalingResponse> getAutoScaling() {
        return this.autoScaling;
    }
    /**
     * Optional. Specifies a custom container to use for serving predictions. If you specify this field, then `machineType` is required. If you specify this field, then `deploymentUri` is optional. If you specify this field, then you must not specify `runtimeVersion`, `packageUris`, `framework`, `pythonVersion`, or `predictionClass`.
     * 
     */
    @Export(name="container", type=GoogleCloudMlV1__ContainerSpecResponse.class, parameters={})
    private Output<GoogleCloudMlV1__ContainerSpecResponse> container;

    /**
     * @return Optional. Specifies a custom container to use for serving predictions. If you specify this field, then `machineType` is required. If you specify this field, then `deploymentUri` is optional. If you specify this field, then you must not specify `runtimeVersion`, `packageUris`, `framework`, `pythonVersion`, or `predictionClass`.
     * 
     */
    public Output<GoogleCloudMlV1__ContainerSpecResponse> getContainer() {
        return this.container;
    }
    /**
     * The time the version was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time the version was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The Cloud Storage URI of a directory containing trained model artifacts to be used to create the model version. See the [guide to deploying models](/ai-platform/prediction/docs/deploying-models) for more information. The total number of files under this directory must not exceed 1000. During projects.models.versions.create, AI Platform Prediction copies all files from the specified directory to a location managed by the service. From then on, AI Platform Prediction uses these copies of the model artifacts to serve predictions, not the original files in Cloud Storage, so this location is useful only as a historical record. If you specify container, then this field is optional. Otherwise, it is required. Learn [how to use this field with a custom container](/ai-platform/prediction/docs/custom-container-requirements#artifacts).
     * 
     */
    @Export(name="deploymentUri", type=String.class, parameters={})
    private Output<String> deploymentUri;

    /**
     * @return The Cloud Storage URI of a directory containing trained model artifacts to be used to create the model version. See the [guide to deploying models](/ai-platform/prediction/docs/deploying-models) for more information. The total number of files under this directory must not exceed 1000. During projects.models.versions.create, AI Platform Prediction copies all files from the specified directory to a location managed by the service. From then on, AI Platform Prediction uses these copies of the model artifacts to serve predictions, not the original files in Cloud Storage, so this location is useful only as a historical record. If you specify container, then this field is optional. Otherwise, it is required. Learn [how to use this field with a custom container](/ai-platform/prediction/docs/custom-container-requirements#artifacts).
     * 
     */
    public Output<String> getDeploymentUri() {
        return this.deploymentUri;
    }
    /**
     * Optional. The description specified for the version when it was created.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. The description specified for the version when it was created.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The details of a failure or a cancellation.
     * 
     */
    @Export(name="errorMessage", type=String.class, parameters={})
    private Output<String> errorMessage;

    /**
     * @return The details of a failure or a cancellation.
     * 
     */
    public Output<String> getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a model from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform model updates in order to avoid race conditions: An `etag` is returned in the response to `GetVersion`, and systems are expected to put that etag in the request to `UpdateVersion` to ensure that their change will be applied to the model as intended.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a model from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform model updates in order to avoid race conditions: An `etag` is returned in the response to `GetVersion`, and systems are expected to put that etag in the request to `UpdateVersion` to ensure that their change will be applied to the model as intended.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Optional. Configures explainability features on the model's version. Some explanation features require additional metadata to be loaded as part of the model payload.
     * 
     */
    @Export(name="explanationConfig", type=GoogleCloudMlV1__ExplanationConfigResponse.class, parameters={})
    private Output<GoogleCloudMlV1__ExplanationConfigResponse> explanationConfig;

    /**
     * @return Optional. Configures explainability features on the model's version. Some explanation features require additional metadata to be loaded as part of the model payload.
     * 
     */
    public Output<GoogleCloudMlV1__ExplanationConfigResponse> getExplanationConfig() {
        return this.explanationConfig;
    }
    /**
     * Optional. The machine learning framework AI Platform uses to train this version of the model. Valid values are `TENSORFLOW`, `SCIKIT_LEARN`, `XGBOOST`. If you do not specify a framework, AI Platform will analyze files in the deployment_uri to determine a framework. If you choose `SCIKIT_LEARN` or `XGBOOST`, you must also set the runtime version of the model to 1.4 or greater. Do **not** specify a framework if you're deploying a [custom prediction routine](/ai-platform/prediction/docs/custom-prediction-routines) or if you're using a [custom container](/ai-platform/prediction/docs/use-custom-container).
     * 
     */
    @Export(name="framework", type=String.class, parameters={})
    private Output<String> framework;

    /**
     * @return Optional. The machine learning framework AI Platform uses to train this version of the model. Valid values are `TENSORFLOW`, `SCIKIT_LEARN`, `XGBOOST`. If you do not specify a framework, AI Platform will analyze files in the deployment_uri to determine a framework. If you choose `SCIKIT_LEARN` or `XGBOOST`, you must also set the runtime version of the model to 1.4 or greater. Do **not** specify a framework if you're deploying a [custom prediction routine](/ai-platform/prediction/docs/custom-prediction-routines) or if you're using a [custom container](/ai-platform/prediction/docs/use-custom-container).
     * 
     */
    public Output<String> getFramework() {
        return this.framework;
    }
    /**
     * If true, this version will be used to handle prediction requests that do not specify a version. You can change the default version by calling projects.methods.versions.setDefault.
     * 
     */
    @Export(name="isDefault", type=Boolean.class, parameters={})
    private Output<Boolean> isDefault;

    /**
     * @return If true, this version will be used to handle prediction requests that do not specify a version. You can change the default version by calling projects.methods.versions.setDefault.
     * 
     */
    public Output<Boolean> getIsDefault() {
        return this.isDefault;
    }
    /**
     * Optional. One or more labels that you can add, to organize your model versions. Each label is a key-value pair, where both the key and the value are arbitrary strings that you supply. For more information, see the documentation on using labels.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. One or more labels that you can add, to organize your model versions. Each label is a key-value pair, where both the key and the value are arbitrary strings that you supply. For more information, see the documentation on using labels.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The [AI Platform (Unified) `Model`](https://cloud.google.com/ai-platform-unified/docs/reference/rest/v1beta1/projects.locations.models) ID for the last [model migration](https://cloud.google.com/ai-platform-unified/docs/start/migrating-to-ai-platform-unified).
     * 
     */
    @Export(name="lastMigrationModelId", type=String.class, parameters={})
    private Output<String> lastMigrationModelId;

    /**
     * @return The [AI Platform (Unified) `Model`](https://cloud.google.com/ai-platform-unified/docs/reference/rest/v1beta1/projects.locations.models) ID for the last [model migration](https://cloud.google.com/ai-platform-unified/docs/start/migrating-to-ai-platform-unified).
     * 
     */
    public Output<String> getLastMigrationModelId() {
        return this.lastMigrationModelId;
    }
    /**
     * The last time this version was successfully [migrated to AI Platform (Unified)](https://cloud.google.com/ai-platform-unified/docs/start/migrating-to-ai-platform-unified).
     * 
     */
    @Export(name="lastMigrationTime", type=String.class, parameters={})
    private Output<String> lastMigrationTime;

    /**
     * @return The last time this version was successfully [migrated to AI Platform (Unified)](https://cloud.google.com/ai-platform-unified/docs/start/migrating-to-ai-platform-unified).
     * 
     */
    public Output<String> getLastMigrationTime() {
        return this.lastMigrationTime;
    }
    /**
     * The time the version was last used for prediction.
     * 
     */
    @Export(name="lastUseTime", type=String.class, parameters={})
    private Output<String> lastUseTime;

    /**
     * @return The time the version was last used for prediction.
     * 
     */
    public Output<String> getLastUseTime() {
        return this.lastUseTime;
    }
    /**
     * Optional. The type of machine on which to serve the model. Currently only applies to online prediction service. To learn about valid values for this field, read [Choosing a machine type for online prediction](/ai-platform/prediction/docs/machine-types-online-prediction). If this field is not specified and you are using a [regional endpoint](/ai-platform/prediction/docs/regional-endpoints), then the machine type defaults to `n1-standard-2`. If this field is not specified and you are using the global endpoint (`ml.googleapis.com`), then the machine type defaults to `mls1-c1-m2`.
     * 
     */
    @Export(name="machineType", type=String.class, parameters={})
    private Output<String> machineType;

    /**
     * @return Optional. The type of machine on which to serve the model. Currently only applies to online prediction service. To learn about valid values for this field, read [Choosing a machine type for online prediction](/ai-platform/prediction/docs/machine-types-online-prediction). If this field is not specified and you are using a [regional endpoint](/ai-platform/prediction/docs/regional-endpoints), then the machine type defaults to `n1-standard-2`. If this field is not specified and you are using the global endpoint (`ml.googleapis.com`), then the machine type defaults to `mls1-c1-m2`.
     * 
     */
    public Output<String> getMachineType() {
        return this.machineType;
    }
    /**
     * Manually select the number of nodes to use for serving the model. You should generally use `auto_scaling` with an appropriate `min_nodes` instead, but this option is available if you want more predictable billing. Beware that latency and error rates will increase if the traffic exceeds that capability of the system to serve it based on the selected number of nodes.
     * 
     */
    @Export(name="manualScaling", type=GoogleCloudMlV1__ManualScalingResponse.class, parameters={})
    private Output<GoogleCloudMlV1__ManualScalingResponse> manualScaling;

    /**
     * @return Manually select the number of nodes to use for serving the model. You should generally use `auto_scaling` with an appropriate `min_nodes` instead, but this option is available if you want more predictable billing. Beware that latency and error rates will increase if the traffic exceeds that capability of the system to serve it based on the selected number of nodes.
     * 
     */
    public Output<GoogleCloudMlV1__ManualScalingResponse> getManualScaling() {
        return this.manualScaling;
    }
    /**
     * The name specified for the version when it was created. The version name must be unique within the model it is created in.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name specified for the version when it was created. The version name must be unique within the model it is created in.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Optional. Cloud Storage paths (`gs://…`) of packages for [custom prediction routines](/ml-engine/docs/tensorflow/custom-prediction-routines) or [scikit-learn pipelines with custom code](/ml-engine/docs/scikit/exporting-for-prediction#custom-pipeline-code). For a custom prediction routine, one of these packages must contain your Predictor class (see [`predictionClass`](#Version.FIELDS.prediction_class)). Additionally, include any dependencies used by your Predictor or scikit-learn pipeline uses that are not already included in your selected [runtime version](/ml-engine/docs/tensorflow/runtime-version-list). If you specify this field, you must also set [`runtimeVersion`](#Version.FIELDS.runtime_version) to 1.4 or greater.
     * 
     */
    @Export(name="packageUris", type=List.class, parameters={String.class})
    private Output<List<String>> packageUris;

    /**
     * @return Optional. Cloud Storage paths (`gs://…`) of packages for [custom prediction routines](/ml-engine/docs/tensorflow/custom-prediction-routines) or [scikit-learn pipelines with custom code](/ml-engine/docs/scikit/exporting-for-prediction#custom-pipeline-code). For a custom prediction routine, one of these packages must contain your Predictor class (see [`predictionClass`](#Version.FIELDS.prediction_class)). Additionally, include any dependencies used by your Predictor or scikit-learn pipeline uses that are not already included in your selected [runtime version](/ml-engine/docs/tensorflow/runtime-version-list). If you specify this field, you must also set [`runtimeVersion`](#Version.FIELDS.runtime_version) to 1.4 or greater.
     * 
     */
    public Output<List<String>> getPackageUris() {
        return this.packageUris;
    }
    /**
     * Optional. The fully qualified name (module_name.class_name) of a class that implements the Predictor interface described in this reference field. The module containing this class should be included in a package provided to the [`packageUris` field](#Version.FIELDS.package_uris). Specify this field if and only if you are deploying a [custom prediction routine (beta)](/ml-engine/docs/tensorflow/custom-prediction-routines). If you specify this field, you must set [`runtimeVersion`](#Version.FIELDS.runtime_version) to 1.4 or greater and you must set `machineType` to a [legacy (MLS1) machine type](/ml-engine/docs/machine-types-online-prediction). The following code sample provides the Predictor interface: class Predictor(object): """Interface for constructing custom predictors.""" def predict(self, instances, **kwargs): """Performs custom prediction. Instances are the decoded values from the request. They have already been deserialized from JSON. Args: instances: A list of prediction input instances. **kwargs: A dictionary of keyword args provided as additional fields on the predict request body. Returns: A list of outputs containing the prediction results. This list must be JSON serializable. """ raise NotImplementedError() @classmethod def from_path(cls, model_dir): """Creates an instance of Predictor using the given path. Loading of the predictor should be done in this method. Args: model_dir: The local directory that contains the exported model file along with any additional files uploaded when creating the version resource. Returns: An instance implementing this Predictor class. """ raise NotImplementedError() Learn more about [the Predictor interface and custom prediction routines](/ml-engine/docs/tensorflow/custom-prediction-routines).
     * 
     */
    @Export(name="predictionClass", type=String.class, parameters={})
    private Output<String> predictionClass;

    /**
     * @return Optional. The fully qualified name (module_name.class_name) of a class that implements the Predictor interface described in this reference field. The module containing this class should be included in a package provided to the [`packageUris` field](#Version.FIELDS.package_uris). Specify this field if and only if you are deploying a [custom prediction routine (beta)](/ml-engine/docs/tensorflow/custom-prediction-routines). If you specify this field, you must set [`runtimeVersion`](#Version.FIELDS.runtime_version) to 1.4 or greater and you must set `machineType` to a [legacy (MLS1) machine type](/ml-engine/docs/machine-types-online-prediction). The following code sample provides the Predictor interface: class Predictor(object): """Interface for constructing custom predictors.""" def predict(self, instances, **kwargs): """Performs custom prediction. Instances are the decoded values from the request. They have already been deserialized from JSON. Args: instances: A list of prediction input instances. **kwargs: A dictionary of keyword args provided as additional fields on the predict request body. Returns: A list of outputs containing the prediction results. This list must be JSON serializable. """ raise NotImplementedError() @classmethod def from_path(cls, model_dir): """Creates an instance of Predictor using the given path. Loading of the predictor should be done in this method. Args: model_dir: The local directory that contains the exported model file along with any additional files uploaded when creating the version resource. Returns: An instance implementing this Predictor class. """ raise NotImplementedError() Learn more about [the Predictor interface and custom prediction routines](/ml-engine/docs/tensorflow/custom-prediction-routines).
     * 
     */
    public Output<String> getPredictionClass() {
        return this.predictionClass;
    }
    /**
     * The version of Python used in prediction. The following Python versions are available: * Python '3.7' is available when `runtime_version` is set to '1.15' or later. * Python '3.5' is available when `runtime_version` is set to a version from '1.4' to '1.14'. * Python '2.7' is available when `runtime_version` is set to '1.15' or earlier. Read more about the Python versions available for [each runtime version](/ml-engine/docs/runtime-version-list).
     * 
     */
    @Export(name="pythonVersion", type=String.class, parameters={})
    private Output<String> pythonVersion;

    /**
     * @return The version of Python used in prediction. The following Python versions are available: * Python '3.7' is available when `runtime_version` is set to '1.15' or later. * Python '3.5' is available when `runtime_version` is set to a version from '1.4' to '1.14'. * Python '2.7' is available when `runtime_version` is set to '1.15' or earlier. Read more about the Python versions available for [each runtime version](/ml-engine/docs/runtime-version-list).
     * 
     */
    public Output<String> getPythonVersion() {
        return this.pythonVersion;
    }
    /**
     * Optional. *Only* specify this field in a projects.models.versions.patch request. Specifying it in a projects.models.versions.create request has no effect. Configures the request-response pair logging on predictions from this Version.
     * 
     */
    @Export(name="requestLoggingConfig", type=GoogleCloudMlV1__RequestLoggingConfigResponse.class, parameters={})
    private Output<GoogleCloudMlV1__RequestLoggingConfigResponse> requestLoggingConfig;

    /**
     * @return Optional. *Only* specify this field in a projects.models.versions.patch request. Specifying it in a projects.models.versions.create request has no effect. Configures the request-response pair logging on predictions from this Version.
     * 
     */
    public Output<GoogleCloudMlV1__RequestLoggingConfigResponse> getRequestLoggingConfig() {
        return this.requestLoggingConfig;
    }
    /**
     * Optional. Specifies paths on a custom container's HTTP server where AI Platform Prediction sends certain requests. If you specify this field, then you must also specify the `container` field. If you specify the `container` field and do not specify this field, it defaults to the following: ``` json { "predict": "/v1/models/MODEL/versions/VERSION:predict", "health": "/v1/models/MODEL/versions/VERSION" }  ``` See RouteMap for more details about these default values.
     * 
     */
    @Export(name="routes", type=GoogleCloudMlV1__RouteMapResponse.class, parameters={})
    private Output<GoogleCloudMlV1__RouteMapResponse> routes;

    /**
     * @return Optional. Specifies paths on a custom container's HTTP server where AI Platform Prediction sends certain requests. If you specify this field, then you must also specify the `container` field. If you specify the `container` field and do not specify this field, it defaults to the following: ``` json { "predict": "/v1/models/MODEL/versions/VERSION:predict", "health": "/v1/models/MODEL/versions/VERSION" }  ``` See RouteMap for more details about these default values.
     * 
     */
    public Output<GoogleCloudMlV1__RouteMapResponse> getRoutes() {
        return this.routes;
    }
    /**
     * The AI Platform runtime version to use for this deployment. For more information, see the [runtime version list](/ml-engine/docs/runtime-version-list) and [how to manage runtime versions](/ml-engine/docs/versioning).
     * 
     */
    @Export(name="runtimeVersion", type=String.class, parameters={})
    private Output<String> runtimeVersion;

    /**
     * @return The AI Platform runtime version to use for this deployment. For more information, see the [runtime version list](/ml-engine/docs/runtime-version-list) and [how to manage runtime versions](/ml-engine/docs/versioning).
     * 
     */
    public Output<String> getRuntimeVersion() {
        return this.runtimeVersion;
    }
    /**
     * Optional. Specifies the service account for resource access control. If you specify this field, then you must also specify either the `containerSpec` or the `predictionClass` field. Learn more about [using a custom service account](/ai-platform/prediction/docs/custom-service-account).
     * 
     */
    @Export(name="serviceAccount", type=String.class, parameters={})
    private Output<String> serviceAccount;

    /**
     * @return Optional. Specifies the service account for resource access control. If you specify this field, then you must also specify either the `containerSpec` or the `predictionClass` field. Learn more about [using a custom service account](/ai-platform/prediction/docs/custom-service-account).
     * 
     */
    public Output<String> getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * The state of a version.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of a version.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    public interface BuilderApplicator {
        public void apply(VersionArgs.Builder a);
    }
    private static io.pulumi.googlenative.ml_v1.VersionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.ml_v1.VersionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Version(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Version(String name) {
        this(name, VersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Version(String name, VersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Version(String name, VersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:ml/v1:Version", name, args == null ? VersionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Version(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:ml/v1:Version", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Version get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Version(name, id, options);
    }
}
