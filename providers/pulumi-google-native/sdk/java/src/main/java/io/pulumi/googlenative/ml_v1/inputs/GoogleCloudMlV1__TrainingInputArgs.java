// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.ml_v1.enums.GoogleCloudMlV1__TrainingInputScaleTier;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__EncryptionConfigArgs;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__HyperparameterSpecArgs;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__ReplicaConfigArgs;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__SchedulingArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents input parameters for a training job. When using the gcloud command to submit your training job, you can specify the input parameters as command-line arguments and/or in a YAML configuration file referenced from the --config command-line argument. For details, see the guide to [submitting a training job](/ai-platform/training/docs/training-jobs).
 * 
 */
public final class GoogleCloudMlV1__TrainingInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1__TrainingInputArgs Empty = new GoogleCloudMlV1__TrainingInputArgs();

    /**
     * Optional. Command-line arguments passed to the training application when it starts. If your job uses a custom container, then the arguments are passed to the container's `ENTRYPOINT` command.
     * 
     */
    @Import(name="args")
      private final @Nullable Output<List<String>> args;

    public Output<List<String>> getArgs() {
        return this.args == null ? Output.empty() : this.args;
    }

    /**
     * Optional. Whether you want AI Platform Training to enable [interactive shell access](https://cloud.google.com/ai-platform/training/docs/monitor-debug-interactive-shell) to training containers. If set to `true`, you can access interactive shells at the URIs given by TrainingOutput.web_access_uris or HyperparameterOutput.web_access_uris (within TrainingOutput.trials).
     * 
     */
    @Import(name="enableWebAccess")
      private final @Nullable Output<Boolean> enableWebAccess;

    public Output<Boolean> getEnableWebAccess() {
        return this.enableWebAccess == null ? Output.empty() : this.enableWebAccess;
    }

    /**
     * Optional. Options for using customer-managed encryption keys (CMEK) to protect resources created by a training job, instead of using Google's default encryption. If this is set, then all resources created by the training job will be encrypted with the customer-managed encryption key that you specify. [Learn how and when to use CMEK with AI Platform Training](/ai-platform/training/docs/cmek).
     * 
     */
    @Import(name="encryptionConfig")
      private final @Nullable Output<GoogleCloudMlV1__EncryptionConfigArgs> encryptionConfig;

    public Output<GoogleCloudMlV1__EncryptionConfigArgs> getEncryptionConfig() {
        return this.encryptionConfig == null ? Output.empty() : this.encryptionConfig;
    }

    /**
     * Optional. The configuration for evaluators. You should only set `evaluatorConfig.acceleratorConfig` if `evaluatorType` is set to a Compute Engine machine type. [Learn about restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu) Set `evaluatorConfig.imageUri` only if you build a custom image for your evaluator. If `evaluatorConfig.imageUri` has not been set, AI Platform uses the value of `masterConfig.imageUri`. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
     * 
     */
    @Import(name="evaluatorConfig")
      private final @Nullable Output<GoogleCloudMlV1__ReplicaConfigArgs> evaluatorConfig;

    public Output<GoogleCloudMlV1__ReplicaConfigArgs> getEvaluatorConfig() {
        return this.evaluatorConfig == null ? Output.empty() : this.evaluatorConfig;
    }

    /**
     * Optional. The number of evaluator replicas to use for the training job. Each replica in the cluster will be of the type specified in `evaluator_type`. This value can only be used when `scale_tier` is set to `CUSTOM`. If you set this value, you must also set `evaluator_type`. The default value is zero.
     * 
     */
    @Import(name="evaluatorCount")
      private final @Nullable Output<String> evaluatorCount;

    public Output<String> getEvaluatorCount() {
        return this.evaluatorCount == null ? Output.empty() : this.evaluatorCount;
    }

    /**
     * Optional. Specifies the type of virtual machine to use for your training job's evaluator nodes. The supported values are the same as those described in the entry for `masterType`. This value must be consistent with the category of machine type that `masterType` uses. In other words, both must be Compute Engine machine types or both must be legacy machine types. This value must be present when `scaleTier` is set to `CUSTOM` and `evaluatorCount` is greater than zero.
     * 
     */
    @Import(name="evaluatorType")
      private final @Nullable Output<String> evaluatorType;

    public Output<String> getEvaluatorType() {
        return this.evaluatorType == null ? Output.empty() : this.evaluatorType;
    }

    /**
     * Optional. The set of Hyperparameters to tune.
     * 
     */
    @Import(name="hyperparameters")
      private final @Nullable Output<GoogleCloudMlV1__HyperparameterSpecArgs> hyperparameters;

    public Output<GoogleCloudMlV1__HyperparameterSpecArgs> getHyperparameters() {
        return this.hyperparameters == null ? Output.empty() : this.hyperparameters;
    }

    /**
     * Optional. A Google Cloud Storage path in which to store training outputs and other data needed for training. This path is passed to your TensorFlow program as the '--job-dir' command-line argument. The benefit of specifying this field is that Cloud ML validates the path for use in training.
     * 
     */
    @Import(name="jobDir")
      private final @Nullable Output<String> jobDir;

    public Output<String> getJobDir() {
        return this.jobDir == null ? Output.empty() : this.jobDir;
    }

    /**
     * Optional. The configuration for your master worker. You should only set `masterConfig.acceleratorConfig` if `masterType` is set to a Compute Engine machine type. Learn about [restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu) Set `masterConfig.imageUri` only if you build a custom image. Only one of `masterConfig.imageUri` and `runtimeVersion` should be set. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
     * 
     */
    @Import(name="masterConfig")
      private final @Nullable Output<GoogleCloudMlV1__ReplicaConfigArgs> masterConfig;

    public Output<GoogleCloudMlV1__ReplicaConfigArgs> getMasterConfig() {
        return this.masterConfig == null ? Output.empty() : this.masterConfig;
    }

    /**
     * Optional. Specifies the type of virtual machine to use for your training job's master worker. You must specify this field when `scaleTier` is set to `CUSTOM`. You can use certain Compute Engine machine types directly in this field. See the [list of compatible Compute Engine machine types](/ai-platform/training/docs/machine-types#compute-engine-machine-types). Alternatively, you can use the certain legacy machine types in this field. See the [list of legacy machine types](/ai-platform/training/docs/machine-types#legacy-machine-types). Finally, if you want to use a TPU for training, specify `cloud_tpu` in this field. Learn more about the [special configuration options for training with TPUs](/ai-platform/training/docs/using-tpus#configuring_a_custom_tpu_machine).
     * 
     */
    @Import(name="masterType")
      private final @Nullable Output<String> masterType;

    public Output<String> getMasterType() {
        return this.masterType == null ? Output.empty() : this.masterType;
    }

    /**
     * Optional. The full name of the [Compute Engine network](/vpc/docs/vpc) to which the Job is peered. For example, `projects/12345/global/networks/myVPC`. The format of this field is `projects/{project}/global/networks/{network}`, where {project} is a project number (like `12345`) and {network} is network name. Private services access must already be configured for the network. If left unspecified, the Job is not peered with any network. [Learn about using VPC Network Peering.](/ai-platform/training/docs/vpc-peering).
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    /**
     * The Google Cloud Storage location of the packages with the training program and any additional dependencies. The maximum number of package URIs is 100.
     * 
     */
    @Import(name="packageUris", required=true)
      private final Output<List<String>> packageUris;

    public Output<List<String>> getPackageUris() {
        return this.packageUris;
    }

    /**
     * Optional. The configuration for parameter servers. You should only set `parameterServerConfig.acceleratorConfig` if `parameterServerType` is set to a Compute Engine machine type. [Learn about restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu) Set `parameterServerConfig.imageUri` only if you build a custom image for your parameter server. If `parameterServerConfig.imageUri` has not been set, AI Platform uses the value of `masterConfig.imageUri`. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
     * 
     */
    @Import(name="parameterServerConfig")
      private final @Nullable Output<GoogleCloudMlV1__ReplicaConfigArgs> parameterServerConfig;

    public Output<GoogleCloudMlV1__ReplicaConfigArgs> getParameterServerConfig() {
        return this.parameterServerConfig == null ? Output.empty() : this.parameterServerConfig;
    }

    /**
     * Optional. The number of parameter server replicas to use for the training job. Each replica in the cluster will be of the type specified in `parameter_server_type`. This value can only be used when `scale_tier` is set to `CUSTOM`. If you set this value, you must also set `parameter_server_type`. The default value is zero.
     * 
     */
    @Import(name="parameterServerCount")
      private final @Nullable Output<String> parameterServerCount;

    public Output<String> getParameterServerCount() {
        return this.parameterServerCount == null ? Output.empty() : this.parameterServerCount;
    }

    /**
     * Optional. Specifies the type of virtual machine to use for your training job's parameter server. The supported values are the same as those described in the entry for `master_type`. This value must be consistent with the category of machine type that `masterType` uses. In other words, both must be Compute Engine machine types or both must be legacy machine types. This value must be present when `scaleTier` is set to `CUSTOM` and `parameter_server_count` is greater than zero.
     * 
     */
    @Import(name="parameterServerType")
      private final @Nullable Output<String> parameterServerType;

    public Output<String> getParameterServerType() {
        return this.parameterServerType == null ? Output.empty() : this.parameterServerType;
    }

    /**
     * The Python module name to run after installing the packages.
     * 
     */
    @Import(name="pythonModule", required=true)
      private final Output<String> pythonModule;

    public Output<String> getPythonModule() {
        return this.pythonModule;
    }

    /**
     * Optional. The version of Python used in training. You must either specify this field or specify `masterConfig.imageUri`. The following Python versions are available: * Python '3.7' is available when `runtime_version` is set to '1.15' or later. * Python '3.5' is available when `runtime_version` is set to a version from '1.4' to '1.14'. * Python '2.7' is available when `runtime_version` is set to '1.15' or earlier. Read more about the Python versions available for [each runtime version](/ml-engine/docs/runtime-version-list).
     * 
     */
    @Import(name="pythonVersion")
      private final @Nullable Output<String> pythonVersion;

    public Output<String> getPythonVersion() {
        return this.pythonVersion == null ? Output.empty() : this.pythonVersion;
    }

    /**
     * The region to run the training job in. See the [available regions](/ai-platform/training/docs/regions) for AI Platform Training.
     * 
     */
    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    /**
     * Optional. The AI Platform runtime version to use for training. You must either specify this field or specify `masterConfig.imageUri`. For more information, see the [runtime version list](/ai-platform/training/docs/runtime-version-list) and learn [how to manage runtime versions](/ai-platform/training/docs/versioning).
     * 
     */
    @Import(name="runtimeVersion")
      private final @Nullable Output<String> runtimeVersion;

    public Output<String> getRuntimeVersion() {
        return this.runtimeVersion == null ? Output.empty() : this.runtimeVersion;
    }

    /**
     * Specifies the machine types, the number of replicas for workers and parameter servers.
     * 
     */
    @Import(name="scaleTier", required=true)
      private final Output<GoogleCloudMlV1__TrainingInputScaleTier> scaleTier;

    public Output<GoogleCloudMlV1__TrainingInputScaleTier> getScaleTier() {
        return this.scaleTier;
    }

    /**
     * Optional. Scheduling options for a training job.
     * 
     */
    @Import(name="scheduling")
      private final @Nullable Output<GoogleCloudMlV1__SchedulingArgs> scheduling;

    public Output<GoogleCloudMlV1__SchedulingArgs> getScheduling() {
        return this.scheduling == null ? Output.empty() : this.scheduling;
    }

    /**
     * Optional. The email address of a service account to use when running the training appplication. You must have the `iam.serviceAccounts.actAs` permission for the specified service account. In addition, the AI Platform Training Google-managed service account must have the `roles/iam.serviceAccountAdmin` role for the specified service account. [Learn more about configuring a service account.](/ai-platform/training/docs/custom-service-account) If not specified, the AI Platform Training Google-managed service account is used by default.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> getServiceAccount() {
        return this.serviceAccount == null ? Output.empty() : this.serviceAccount;
    }

    /**
     * Optional. Use `chief` instead of `master` in the `TF_CONFIG` environment variable when training with a custom container. Defaults to `false`. [Learn more about this field.](/ai-platform/training/docs/distributed-training-details#chief-versus-master) This field has no effect for training jobs that don't use a custom container.
     * 
     */
    @Import(name="useChiefInTfConfig")
      private final @Nullable Output<Boolean> useChiefInTfConfig;

    public Output<Boolean> getUseChiefInTfConfig() {
        return this.useChiefInTfConfig == null ? Output.empty() : this.useChiefInTfConfig;
    }

    /**
     * Optional. The configuration for workers. You should only set `workerConfig.acceleratorConfig` if `workerType` is set to a Compute Engine machine type. [Learn about restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu) Set `workerConfig.imageUri` only if you build a custom image for your worker. If `workerConfig.imageUri` has not been set, AI Platform uses the value of `masterConfig.imageUri`. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
     * 
     */
    @Import(name="workerConfig")
      private final @Nullable Output<GoogleCloudMlV1__ReplicaConfigArgs> workerConfig;

    public Output<GoogleCloudMlV1__ReplicaConfigArgs> getWorkerConfig() {
        return this.workerConfig == null ? Output.empty() : this.workerConfig;
    }

    /**
     * Optional. The number of worker replicas to use for the training job. Each replica in the cluster will be of the type specified in `worker_type`. This value can only be used when `scale_tier` is set to `CUSTOM`. If you set this value, you must also set `worker_type`. The default value is zero.
     * 
     */
    @Import(name="workerCount")
      private final @Nullable Output<String> workerCount;

    public Output<String> getWorkerCount() {
        return this.workerCount == null ? Output.empty() : this.workerCount;
    }

    /**
     * Optional. Specifies the type of virtual machine to use for your training job's worker nodes. The supported values are the same as those described in the entry for `masterType`. This value must be consistent with the category of machine type that `masterType` uses. In other words, both must be Compute Engine machine types or both must be legacy machine types. If you use `cloud_tpu` for this value, see special instructions for [configuring a custom TPU machine](/ml-engine/docs/tensorflow/using-tpus#configuring_a_custom_tpu_machine). This value must be present when `scaleTier` is set to `CUSTOM` and `workerCount` is greater than zero.
     * 
     */
    @Import(name="workerType")
      private final @Nullable Output<String> workerType;

    public Output<String> getWorkerType() {
        return this.workerType == null ? Output.empty() : this.workerType;
    }

    public GoogleCloudMlV1__TrainingInputArgs(
        @Nullable Output<List<String>> args,
        @Nullable Output<Boolean> enableWebAccess,
        @Nullable Output<GoogleCloudMlV1__EncryptionConfigArgs> encryptionConfig,
        @Nullable Output<GoogleCloudMlV1__ReplicaConfigArgs> evaluatorConfig,
        @Nullable Output<String> evaluatorCount,
        @Nullable Output<String> evaluatorType,
        @Nullable Output<GoogleCloudMlV1__HyperparameterSpecArgs> hyperparameters,
        @Nullable Output<String> jobDir,
        @Nullable Output<GoogleCloudMlV1__ReplicaConfigArgs> masterConfig,
        @Nullable Output<String> masterType,
        @Nullable Output<String> network,
        Output<List<String>> packageUris,
        @Nullable Output<GoogleCloudMlV1__ReplicaConfigArgs> parameterServerConfig,
        @Nullable Output<String> parameterServerCount,
        @Nullable Output<String> parameterServerType,
        Output<String> pythonModule,
        @Nullable Output<String> pythonVersion,
        Output<String> region,
        @Nullable Output<String> runtimeVersion,
        Output<GoogleCloudMlV1__TrainingInputScaleTier> scaleTier,
        @Nullable Output<GoogleCloudMlV1__SchedulingArgs> scheduling,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<Boolean> useChiefInTfConfig,
        @Nullable Output<GoogleCloudMlV1__ReplicaConfigArgs> workerConfig,
        @Nullable Output<String> workerCount,
        @Nullable Output<String> workerType) {
        this.args = args;
        this.enableWebAccess = enableWebAccess;
        this.encryptionConfig = encryptionConfig;
        this.evaluatorConfig = evaluatorConfig;
        this.evaluatorCount = evaluatorCount;
        this.evaluatorType = evaluatorType;
        this.hyperparameters = hyperparameters;
        this.jobDir = jobDir;
        this.masterConfig = masterConfig;
        this.masterType = masterType;
        this.network = network;
        this.packageUris = Objects.requireNonNull(packageUris, "expected parameter 'packageUris' to be non-null");
        this.parameterServerConfig = parameterServerConfig;
        this.parameterServerCount = parameterServerCount;
        this.parameterServerType = parameterServerType;
        this.pythonModule = Objects.requireNonNull(pythonModule, "expected parameter 'pythonModule' to be non-null");
        this.pythonVersion = pythonVersion;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.runtimeVersion = runtimeVersion;
        this.scaleTier = Objects.requireNonNull(scaleTier, "expected parameter 'scaleTier' to be non-null");
        this.scheduling = scheduling;
        this.serviceAccount = serviceAccount;
        this.useChiefInTfConfig = useChiefInTfConfig;
        this.workerConfig = workerConfig;
        this.workerCount = workerCount;
        this.workerType = workerType;
    }

    private GoogleCloudMlV1__TrainingInputArgs() {
        this.args = Output.empty();
        this.enableWebAccess = Output.empty();
        this.encryptionConfig = Output.empty();
        this.evaluatorConfig = Output.empty();
        this.evaluatorCount = Output.empty();
        this.evaluatorType = Output.empty();
        this.hyperparameters = Output.empty();
        this.jobDir = Output.empty();
        this.masterConfig = Output.empty();
        this.masterType = Output.empty();
        this.network = Output.empty();
        this.packageUris = Output.empty();
        this.parameterServerConfig = Output.empty();
        this.parameterServerCount = Output.empty();
        this.parameterServerType = Output.empty();
        this.pythonModule = Output.empty();
        this.pythonVersion = Output.empty();
        this.region = Output.empty();
        this.runtimeVersion = Output.empty();
        this.scaleTier = Output.empty();
        this.scheduling = Output.empty();
        this.serviceAccount = Output.empty();
        this.useChiefInTfConfig = Output.empty();
        this.workerConfig = Output.empty();
        this.workerCount = Output.empty();
        this.workerType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__TrainingInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> args;
        private @Nullable Output<Boolean> enableWebAccess;
        private @Nullable Output<GoogleCloudMlV1__EncryptionConfigArgs> encryptionConfig;
        private @Nullable Output<GoogleCloudMlV1__ReplicaConfigArgs> evaluatorConfig;
        private @Nullable Output<String> evaluatorCount;
        private @Nullable Output<String> evaluatorType;
        private @Nullable Output<GoogleCloudMlV1__HyperparameterSpecArgs> hyperparameters;
        private @Nullable Output<String> jobDir;
        private @Nullable Output<GoogleCloudMlV1__ReplicaConfigArgs> masterConfig;
        private @Nullable Output<String> masterType;
        private @Nullable Output<String> network;
        private Output<List<String>> packageUris;
        private @Nullable Output<GoogleCloudMlV1__ReplicaConfigArgs> parameterServerConfig;
        private @Nullable Output<String> parameterServerCount;
        private @Nullable Output<String> parameterServerType;
        private Output<String> pythonModule;
        private @Nullable Output<String> pythonVersion;
        private Output<String> region;
        private @Nullable Output<String> runtimeVersion;
        private Output<GoogleCloudMlV1__TrainingInputScaleTier> scaleTier;
        private @Nullable Output<GoogleCloudMlV1__SchedulingArgs> scheduling;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<Boolean> useChiefInTfConfig;
        private @Nullable Output<GoogleCloudMlV1__ReplicaConfigArgs> workerConfig;
        private @Nullable Output<String> workerCount;
        private @Nullable Output<String> workerType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__TrainingInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.enableWebAccess = defaults.enableWebAccess;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.evaluatorConfig = defaults.evaluatorConfig;
    	      this.evaluatorCount = defaults.evaluatorCount;
    	      this.evaluatorType = defaults.evaluatorType;
    	      this.hyperparameters = defaults.hyperparameters;
    	      this.jobDir = defaults.jobDir;
    	      this.masterConfig = defaults.masterConfig;
    	      this.masterType = defaults.masterType;
    	      this.network = defaults.network;
    	      this.packageUris = defaults.packageUris;
    	      this.parameterServerConfig = defaults.parameterServerConfig;
    	      this.parameterServerCount = defaults.parameterServerCount;
    	      this.parameterServerType = defaults.parameterServerType;
    	      this.pythonModule = defaults.pythonModule;
    	      this.pythonVersion = defaults.pythonVersion;
    	      this.region = defaults.region;
    	      this.runtimeVersion = defaults.runtimeVersion;
    	      this.scaleTier = defaults.scaleTier;
    	      this.scheduling = defaults.scheduling;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.useChiefInTfConfig = defaults.useChiefInTfConfig;
    	      this.workerConfig = defaults.workerConfig;
    	      this.workerCount = defaults.workerCount;
    	      this.workerType = defaults.workerType;
        }

        public Builder args(@Nullable Output<List<String>> args) {
            this.args = args;
            return this;
        }

        public Builder args(@Nullable List<String> args) {
            this.args = Output.ofNullable(args);
            return this;
        }

        public Builder enableWebAccess(@Nullable Output<Boolean> enableWebAccess) {
            this.enableWebAccess = enableWebAccess;
            return this;
        }

        public Builder enableWebAccess(@Nullable Boolean enableWebAccess) {
            this.enableWebAccess = Output.ofNullable(enableWebAccess);
            return this;
        }

        public Builder encryptionConfig(@Nullable Output<GoogleCloudMlV1__EncryptionConfigArgs> encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }

        public Builder encryptionConfig(@Nullable GoogleCloudMlV1__EncryptionConfigArgs encryptionConfig) {
            this.encryptionConfig = Output.ofNullable(encryptionConfig);
            return this;
        }

        public Builder evaluatorConfig(@Nullable Output<GoogleCloudMlV1__ReplicaConfigArgs> evaluatorConfig) {
            this.evaluatorConfig = evaluatorConfig;
            return this;
        }

        public Builder evaluatorConfig(@Nullable GoogleCloudMlV1__ReplicaConfigArgs evaluatorConfig) {
            this.evaluatorConfig = Output.ofNullable(evaluatorConfig);
            return this;
        }

        public Builder evaluatorCount(@Nullable Output<String> evaluatorCount) {
            this.evaluatorCount = evaluatorCount;
            return this;
        }

        public Builder evaluatorCount(@Nullable String evaluatorCount) {
            this.evaluatorCount = Output.ofNullable(evaluatorCount);
            return this;
        }

        public Builder evaluatorType(@Nullable Output<String> evaluatorType) {
            this.evaluatorType = evaluatorType;
            return this;
        }

        public Builder evaluatorType(@Nullable String evaluatorType) {
            this.evaluatorType = Output.ofNullable(evaluatorType);
            return this;
        }

        public Builder hyperparameters(@Nullable Output<GoogleCloudMlV1__HyperparameterSpecArgs> hyperparameters) {
            this.hyperparameters = hyperparameters;
            return this;
        }

        public Builder hyperparameters(@Nullable GoogleCloudMlV1__HyperparameterSpecArgs hyperparameters) {
            this.hyperparameters = Output.ofNullable(hyperparameters);
            return this;
        }

        public Builder jobDir(@Nullable Output<String> jobDir) {
            this.jobDir = jobDir;
            return this;
        }

        public Builder jobDir(@Nullable String jobDir) {
            this.jobDir = Output.ofNullable(jobDir);
            return this;
        }

        public Builder masterConfig(@Nullable Output<GoogleCloudMlV1__ReplicaConfigArgs> masterConfig) {
            this.masterConfig = masterConfig;
            return this;
        }

        public Builder masterConfig(@Nullable GoogleCloudMlV1__ReplicaConfigArgs masterConfig) {
            this.masterConfig = Output.ofNullable(masterConfig);
            return this;
        }

        public Builder masterType(@Nullable Output<String> masterType) {
            this.masterType = masterType;
            return this;
        }

        public Builder masterType(@Nullable String masterType) {
            this.masterType = Output.ofNullable(masterType);
            return this;
        }

        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = Output.ofNullable(network);
            return this;
        }

        public Builder packageUris(Output<List<String>> packageUris) {
            this.packageUris = Objects.requireNonNull(packageUris);
            return this;
        }

        public Builder packageUris(List<String> packageUris) {
            this.packageUris = Output.of(Objects.requireNonNull(packageUris));
            return this;
        }

        public Builder parameterServerConfig(@Nullable Output<GoogleCloudMlV1__ReplicaConfigArgs> parameterServerConfig) {
            this.parameterServerConfig = parameterServerConfig;
            return this;
        }

        public Builder parameterServerConfig(@Nullable GoogleCloudMlV1__ReplicaConfigArgs parameterServerConfig) {
            this.parameterServerConfig = Output.ofNullable(parameterServerConfig);
            return this;
        }

        public Builder parameterServerCount(@Nullable Output<String> parameterServerCount) {
            this.parameterServerCount = parameterServerCount;
            return this;
        }

        public Builder parameterServerCount(@Nullable String parameterServerCount) {
            this.parameterServerCount = Output.ofNullable(parameterServerCount);
            return this;
        }

        public Builder parameterServerType(@Nullable Output<String> parameterServerType) {
            this.parameterServerType = parameterServerType;
            return this;
        }

        public Builder parameterServerType(@Nullable String parameterServerType) {
            this.parameterServerType = Output.ofNullable(parameterServerType);
            return this;
        }

        public Builder pythonModule(Output<String> pythonModule) {
            this.pythonModule = Objects.requireNonNull(pythonModule);
            return this;
        }

        public Builder pythonModule(String pythonModule) {
            this.pythonModule = Output.of(Objects.requireNonNull(pythonModule));
            return this;
        }

        public Builder pythonVersion(@Nullable Output<String> pythonVersion) {
            this.pythonVersion = pythonVersion;
            return this;
        }

        public Builder pythonVersion(@Nullable String pythonVersion) {
            this.pythonVersion = Output.ofNullable(pythonVersion);
            return this;
        }

        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder runtimeVersion(@Nullable Output<String> runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }

        public Builder runtimeVersion(@Nullable String runtimeVersion) {
            this.runtimeVersion = Output.ofNullable(runtimeVersion);
            return this;
        }

        public Builder scaleTier(Output<GoogleCloudMlV1__TrainingInputScaleTier> scaleTier) {
            this.scaleTier = Objects.requireNonNull(scaleTier);
            return this;
        }

        public Builder scaleTier(GoogleCloudMlV1__TrainingInputScaleTier scaleTier) {
            this.scaleTier = Output.of(Objects.requireNonNull(scaleTier));
            return this;
        }

        public Builder scheduling(@Nullable Output<GoogleCloudMlV1__SchedulingArgs> scheduling) {
            this.scheduling = scheduling;
            return this;
        }

        public Builder scheduling(@Nullable GoogleCloudMlV1__SchedulingArgs scheduling) {
            this.scheduling = Output.ofNullable(scheduling);
            return this;
        }

        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Output.ofNullable(serviceAccount);
            return this;
        }

        public Builder useChiefInTfConfig(@Nullable Output<Boolean> useChiefInTfConfig) {
            this.useChiefInTfConfig = useChiefInTfConfig;
            return this;
        }

        public Builder useChiefInTfConfig(@Nullable Boolean useChiefInTfConfig) {
            this.useChiefInTfConfig = Output.ofNullable(useChiefInTfConfig);
            return this;
        }

        public Builder workerConfig(@Nullable Output<GoogleCloudMlV1__ReplicaConfigArgs> workerConfig) {
            this.workerConfig = workerConfig;
            return this;
        }

        public Builder workerConfig(@Nullable GoogleCloudMlV1__ReplicaConfigArgs workerConfig) {
            this.workerConfig = Output.ofNullable(workerConfig);
            return this;
        }

        public Builder workerCount(@Nullable Output<String> workerCount) {
            this.workerCount = workerCount;
            return this;
        }

        public Builder workerCount(@Nullable String workerCount) {
            this.workerCount = Output.ofNullable(workerCount);
            return this;
        }

        public Builder workerType(@Nullable Output<String> workerType) {
            this.workerType = workerType;
            return this;
        }

        public Builder workerType(@Nullable String workerType) {
            this.workerType = Output.ofNullable(workerType);
            return this;
        }
        public GoogleCloudMlV1__TrainingInputArgs build() {
            return new GoogleCloudMlV1__TrainingInputArgs(args, enableWebAccess, encryptionConfig, evaluatorConfig, evaluatorCount, evaluatorType, hyperparameters, jobDir, masterConfig, masterType, network, packageUris, parameterServerConfig, parameterServerCount, parameterServerType, pythonModule, pythonVersion, region, runtimeVersion, scaleTier, scheduling, serviceAccount, useChiefInTfConfig, workerConfig, workerCount, workerType);
        }
    }
}
