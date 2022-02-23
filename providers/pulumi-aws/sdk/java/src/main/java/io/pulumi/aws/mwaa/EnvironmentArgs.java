// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mwaa;

import io.pulumi.aws.mwaa.inputs.EnvironmentLoggingConfigurationArgs;
import io.pulumi.aws.mwaa.inputs.EnvironmentNetworkConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * The `airflow_configuration_options` parameter specifies airflow override options. Check the [Official documentation](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html#configuring-env-variables-reference) for all possible configuration options.
     * 
     */
    @InputImport(name="airflowConfigurationOptions")
    private final @Nullable Input<Map<String,String>> airflowConfigurationOptions;

    public Input<Map<String,String>> getAirflowConfigurationOptions() {
        return this.airflowConfigurationOptions == null ? Input.empty() : this.airflowConfigurationOptions;
    }

    /**
     * Airflow version of your environment, will be set by default to the latest version that MWAA supports.
     * 
     */
    @InputImport(name="airflowVersion")
    private final @Nullable Input<String> airflowVersion;

    public Input<String> getAirflowVersion() {
        return this.airflowVersion == null ? Input.empty() : this.airflowVersion;
    }

    /**
     * The relative path to the DAG folder on your Amazon S3 storage bucket. For example, dags. For more information, see [Importing DAGs on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html).
     * 
     */
    @InputImport(name="dagS3Path", required=true)
    private final Input<String> dagS3Path;

    public Input<String> getDagS3Path() {
        return this.dagS3Path;
    }

    /**
     * Environment class for the cluster. Possible options are `mw1.small`, `mw1.medium`, `mw1.large`. Will be set by default to `mw1.small`. Please check the [AWS Pricing](https://aws.amazon.com/de/managed-workflows-for-apache-airflow/pricing/) for more information about the environment classes.
     * 
     */
    @InputImport(name="environmentClass")
    private final @Nullable Input<String> environmentClass;

    public Input<String> getEnvironmentClass() {
        return this.environmentClass == null ? Input.empty() : this.environmentClass;
    }

    /**
     * The Amazon Resource Name (ARN) of the task execution role that the Amazon MWAA and its environment can assume. Check the [official AWS documentation](https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-create-role.html) for the detailed role specification.
     * 
     */
    @InputImport(name="executionRoleArn", required=true)
    private final Input<String> executionRoleArn;

    public Input<String> getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * The Amazon Resource Name (ARN) of your KMS key that you want to use for encryption. Will be set to the ARN of the managed KMS key `aws/airflow` by default. Please check the [Official Documentation](https://docs.aws.amazon.com/mwaa/latest/userguide/custom-keys-certs.html) for more information.
     * 
     */
    @InputImport(name="kmsKey")
    private final @Nullable Input<String> kmsKey;

    public Input<String> getKmsKey() {
        return this.kmsKey == null ? Input.empty() : this.kmsKey;
    }

    /**
     * The Apache Airflow logs you want to send to Amazon CloudWatch Logs.
     * 
     */
    @InputImport(name="loggingConfiguration")
    private final @Nullable Input<EnvironmentLoggingConfigurationArgs> loggingConfiguration;

    public Input<EnvironmentLoggingConfigurationArgs> getLoggingConfiguration() {
        return this.loggingConfiguration == null ? Input.empty() : this.loggingConfiguration;
    }

    /**
     * The maximum number of workers that can be automatically scaled up. Value need to be between `1` and `25`. Will be `10` by default.
     * 
     */
    @InputImport(name="maxWorkers")
    private final @Nullable Input<Integer> maxWorkers;

    public Input<Integer> getMaxWorkers() {
        return this.maxWorkers == null ? Input.empty() : this.maxWorkers;
    }

    /**
     * The minimum number of workers that you want to run in your environment. Will be `1` by default.
     * 
     */
    @InputImport(name="minWorkers")
    private final @Nullable Input<Integer> minWorkers;

    public Input<Integer> getMinWorkers() {
        return this.minWorkers == null ? Input.empty() : this.minWorkers;
    }

    /**
     * The name of the Apache Airflow Environment
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specifies the network configuration for your Apache Airflow Environment. This includes two private subnets as well as security groups for the Airflow environment. Each subnet requires internet connection, otherwise the deployment will fail. See Network configuration below for details.
     * 
     */
    @InputImport(name="networkConfiguration", required=true)
    private final Input<EnvironmentNetworkConfigurationArgs> networkConfiguration;

    public Input<EnvironmentNetworkConfigurationArgs> getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * The plugins.zip file version you want to use.
     * 
     */
    @InputImport(name="pluginsS3ObjectVersion")
    private final @Nullable Input<String> pluginsS3ObjectVersion;

    public Input<String> getPluginsS3ObjectVersion() {
        return this.pluginsS3ObjectVersion == null ? Input.empty() : this.pluginsS3ObjectVersion;
    }

    /**
     * The relative path to the plugins.zip file on your Amazon S3 storage bucket. For example, plugins.zip. If a relative path is provided in the request, then plugins_s3_object_version is required. For more information, see [Importing DAGs on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html).
     * 
     */
    @InputImport(name="pluginsS3Path")
    private final @Nullable Input<String> pluginsS3Path;

    public Input<String> getPluginsS3Path() {
        return this.pluginsS3Path == null ? Input.empty() : this.pluginsS3Path;
    }

    /**
     * The requirements.txt file version you want to use.
     * 
     */
    @InputImport(name="requirementsS3ObjectVersion")
    private final @Nullable Input<String> requirementsS3ObjectVersion;

    public Input<String> getRequirementsS3ObjectVersion() {
        return this.requirementsS3ObjectVersion == null ? Input.empty() : this.requirementsS3ObjectVersion;
    }

    /**
     * The relative path to the requirements.txt file on your Amazon S3 storage bucket. For example, requirements.txt. If a relative path is provided in the request, then requirements_s3_object_version is required. For more information, see [Importing DAGs on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html).
     * 
     */
    @InputImport(name="requirementsS3Path")
    private final @Nullable Input<String> requirementsS3Path;

    public Input<String> getRequirementsS3Path() {
        return this.requirementsS3Path == null ? Input.empty() : this.requirementsS3Path;
    }

    /**
     * The Amazon Resource Name (ARN) of your Amazon S3 storage bucket. For example, arn:aws:s3:::airflow-mybucketname.
     * 
     */
    @InputImport(name="sourceBucketArn", required=true)
    private final Input<String> sourceBucketArn;

    public Input<String> getSourceBucketArn() {
        return this.sourceBucketArn;
    }

    /**
     * A map of resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Specifies whether the webserver should be accessible over the internet or via your specified VPC. Possible options: `PRIVATE_ONLY` (default) and `PUBLIC_ONLY`.
     * 
     */
    @InputImport(name="webserverAccessMode")
    private final @Nullable Input<String> webserverAccessMode;

    public Input<String> getWebserverAccessMode() {
        return this.webserverAccessMode == null ? Input.empty() : this.webserverAccessMode;
    }

    /**
     * Specifies the start date for the weekly maintenance window.
     * 
     */
    @InputImport(name="weeklyMaintenanceWindowStart")
    private final @Nullable Input<String> weeklyMaintenanceWindowStart;

    public Input<String> getWeeklyMaintenanceWindowStart() {
        return this.weeklyMaintenanceWindowStart == null ? Input.empty() : this.weeklyMaintenanceWindowStart;
    }

    public EnvironmentArgs(
        @Nullable Input<Map<String,String>> airflowConfigurationOptions,
        @Nullable Input<String> airflowVersion,
        Input<String> dagS3Path,
        @Nullable Input<String> environmentClass,
        Input<String> executionRoleArn,
        @Nullable Input<String> kmsKey,
        @Nullable Input<EnvironmentLoggingConfigurationArgs> loggingConfiguration,
        @Nullable Input<Integer> maxWorkers,
        @Nullable Input<Integer> minWorkers,
        @Nullable Input<String> name,
        Input<EnvironmentNetworkConfigurationArgs> networkConfiguration,
        @Nullable Input<String> pluginsS3ObjectVersion,
        @Nullable Input<String> pluginsS3Path,
        @Nullable Input<String> requirementsS3ObjectVersion,
        @Nullable Input<String> requirementsS3Path,
        Input<String> sourceBucketArn,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> webserverAccessMode,
        @Nullable Input<String> weeklyMaintenanceWindowStart) {
        this.airflowConfigurationOptions = airflowConfigurationOptions;
        this.airflowVersion = airflowVersion;
        this.dagS3Path = Objects.requireNonNull(dagS3Path, "expected parameter 'dagS3Path' to be non-null");
        this.environmentClass = environmentClass;
        this.executionRoleArn = Objects.requireNonNull(executionRoleArn, "expected parameter 'executionRoleArn' to be non-null");
        this.kmsKey = kmsKey;
        this.loggingConfiguration = loggingConfiguration;
        this.maxWorkers = maxWorkers;
        this.minWorkers = minWorkers;
        this.name = name;
        this.networkConfiguration = Objects.requireNonNull(networkConfiguration, "expected parameter 'networkConfiguration' to be non-null");
        this.pluginsS3ObjectVersion = pluginsS3ObjectVersion;
        this.pluginsS3Path = pluginsS3Path;
        this.requirementsS3ObjectVersion = requirementsS3ObjectVersion;
        this.requirementsS3Path = requirementsS3Path;
        this.sourceBucketArn = Objects.requireNonNull(sourceBucketArn, "expected parameter 'sourceBucketArn' to be non-null");
        this.tags = tags;
        this.webserverAccessMode = webserverAccessMode;
        this.weeklyMaintenanceWindowStart = weeklyMaintenanceWindowStart;
    }

    private EnvironmentArgs() {
        this.airflowConfigurationOptions = Input.empty();
        this.airflowVersion = Input.empty();
        this.dagS3Path = Input.empty();
        this.environmentClass = Input.empty();
        this.executionRoleArn = Input.empty();
        this.kmsKey = Input.empty();
        this.loggingConfiguration = Input.empty();
        this.maxWorkers = Input.empty();
        this.minWorkers = Input.empty();
        this.name = Input.empty();
        this.networkConfiguration = Input.empty();
        this.pluginsS3ObjectVersion = Input.empty();
        this.pluginsS3Path = Input.empty();
        this.requirementsS3ObjectVersion = Input.empty();
        this.requirementsS3Path = Input.empty();
        this.sourceBucketArn = Input.empty();
        this.tags = Input.empty();
        this.webserverAccessMode = Input.empty();
        this.weeklyMaintenanceWindowStart = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> airflowConfigurationOptions;
        private @Nullable Input<String> airflowVersion;
        private Input<String> dagS3Path;
        private @Nullable Input<String> environmentClass;
        private Input<String> executionRoleArn;
        private @Nullable Input<String> kmsKey;
        private @Nullable Input<EnvironmentLoggingConfigurationArgs> loggingConfiguration;
        private @Nullable Input<Integer> maxWorkers;
        private @Nullable Input<Integer> minWorkers;
        private @Nullable Input<String> name;
        private Input<EnvironmentNetworkConfigurationArgs> networkConfiguration;
        private @Nullable Input<String> pluginsS3ObjectVersion;
        private @Nullable Input<String> pluginsS3Path;
        private @Nullable Input<String> requirementsS3ObjectVersion;
        private @Nullable Input<String> requirementsS3Path;
        private Input<String> sourceBucketArn;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> webserverAccessMode;
        private @Nullable Input<String> weeklyMaintenanceWindowStart;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.airflowConfigurationOptions = defaults.airflowConfigurationOptions;
    	      this.airflowVersion = defaults.airflowVersion;
    	      this.dagS3Path = defaults.dagS3Path;
    	      this.environmentClass = defaults.environmentClass;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.kmsKey = defaults.kmsKey;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
    	      this.maxWorkers = defaults.maxWorkers;
    	      this.minWorkers = defaults.minWorkers;
    	      this.name = defaults.name;
    	      this.networkConfiguration = defaults.networkConfiguration;
    	      this.pluginsS3ObjectVersion = defaults.pluginsS3ObjectVersion;
    	      this.pluginsS3Path = defaults.pluginsS3Path;
    	      this.requirementsS3ObjectVersion = defaults.requirementsS3ObjectVersion;
    	      this.requirementsS3Path = defaults.requirementsS3Path;
    	      this.sourceBucketArn = defaults.sourceBucketArn;
    	      this.tags = defaults.tags;
    	      this.webserverAccessMode = defaults.webserverAccessMode;
    	      this.weeklyMaintenanceWindowStart = defaults.weeklyMaintenanceWindowStart;
        }

        public Builder setAirflowConfigurationOptions(@Nullable Input<Map<String,String>> airflowConfigurationOptions) {
            this.airflowConfigurationOptions = airflowConfigurationOptions;
            return this;
        }

        public Builder setAirflowConfigurationOptions(@Nullable Map<String,String> airflowConfigurationOptions) {
            this.airflowConfigurationOptions = Input.ofNullable(airflowConfigurationOptions);
            return this;
        }

        public Builder setAirflowVersion(@Nullable Input<String> airflowVersion) {
            this.airflowVersion = airflowVersion;
            return this;
        }

        public Builder setAirflowVersion(@Nullable String airflowVersion) {
            this.airflowVersion = Input.ofNullable(airflowVersion);
            return this;
        }

        public Builder setDagS3Path(Input<String> dagS3Path) {
            this.dagS3Path = Objects.requireNonNull(dagS3Path);
            return this;
        }

        public Builder setDagS3Path(String dagS3Path) {
            this.dagS3Path = Input.of(Objects.requireNonNull(dagS3Path));
            return this;
        }

        public Builder setEnvironmentClass(@Nullable Input<String> environmentClass) {
            this.environmentClass = environmentClass;
            return this;
        }

        public Builder setEnvironmentClass(@Nullable String environmentClass) {
            this.environmentClass = Input.ofNullable(environmentClass);
            return this;
        }

        public Builder setExecutionRoleArn(Input<String> executionRoleArn) {
            this.executionRoleArn = Objects.requireNonNull(executionRoleArn);
            return this;
        }

        public Builder setExecutionRoleArn(String executionRoleArn) {
            this.executionRoleArn = Input.of(Objects.requireNonNull(executionRoleArn));
            return this;
        }

        public Builder setKmsKey(@Nullable Input<String> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }

        public Builder setKmsKey(@Nullable String kmsKey) {
            this.kmsKey = Input.ofNullable(kmsKey);
            return this;
        }

        public Builder setLoggingConfiguration(@Nullable Input<EnvironmentLoggingConfigurationArgs> loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }

        public Builder setLoggingConfiguration(@Nullable EnvironmentLoggingConfigurationArgs loggingConfiguration) {
            this.loggingConfiguration = Input.ofNullable(loggingConfiguration);
            return this;
        }

        public Builder setMaxWorkers(@Nullable Input<Integer> maxWorkers) {
            this.maxWorkers = maxWorkers;
            return this;
        }

        public Builder setMaxWorkers(@Nullable Integer maxWorkers) {
            this.maxWorkers = Input.ofNullable(maxWorkers);
            return this;
        }

        public Builder setMinWorkers(@Nullable Input<Integer> minWorkers) {
            this.minWorkers = minWorkers;
            return this;
        }

        public Builder setMinWorkers(@Nullable Integer minWorkers) {
            this.minWorkers = Input.ofNullable(minWorkers);
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

        public Builder setNetworkConfiguration(Input<EnvironmentNetworkConfigurationArgs> networkConfiguration) {
            this.networkConfiguration = Objects.requireNonNull(networkConfiguration);
            return this;
        }

        public Builder setNetworkConfiguration(EnvironmentNetworkConfigurationArgs networkConfiguration) {
            this.networkConfiguration = Input.of(Objects.requireNonNull(networkConfiguration));
            return this;
        }

        public Builder setPluginsS3ObjectVersion(@Nullable Input<String> pluginsS3ObjectVersion) {
            this.pluginsS3ObjectVersion = pluginsS3ObjectVersion;
            return this;
        }

        public Builder setPluginsS3ObjectVersion(@Nullable String pluginsS3ObjectVersion) {
            this.pluginsS3ObjectVersion = Input.ofNullable(pluginsS3ObjectVersion);
            return this;
        }

        public Builder setPluginsS3Path(@Nullable Input<String> pluginsS3Path) {
            this.pluginsS3Path = pluginsS3Path;
            return this;
        }

        public Builder setPluginsS3Path(@Nullable String pluginsS3Path) {
            this.pluginsS3Path = Input.ofNullable(pluginsS3Path);
            return this;
        }

        public Builder setRequirementsS3ObjectVersion(@Nullable Input<String> requirementsS3ObjectVersion) {
            this.requirementsS3ObjectVersion = requirementsS3ObjectVersion;
            return this;
        }

        public Builder setRequirementsS3ObjectVersion(@Nullable String requirementsS3ObjectVersion) {
            this.requirementsS3ObjectVersion = Input.ofNullable(requirementsS3ObjectVersion);
            return this;
        }

        public Builder setRequirementsS3Path(@Nullable Input<String> requirementsS3Path) {
            this.requirementsS3Path = requirementsS3Path;
            return this;
        }

        public Builder setRequirementsS3Path(@Nullable String requirementsS3Path) {
            this.requirementsS3Path = Input.ofNullable(requirementsS3Path);
            return this;
        }

        public Builder setSourceBucketArn(Input<String> sourceBucketArn) {
            this.sourceBucketArn = Objects.requireNonNull(sourceBucketArn);
            return this;
        }

        public Builder setSourceBucketArn(String sourceBucketArn) {
            this.sourceBucketArn = Input.of(Objects.requireNonNull(sourceBucketArn));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setWebserverAccessMode(@Nullable Input<String> webserverAccessMode) {
            this.webserverAccessMode = webserverAccessMode;
            return this;
        }

        public Builder setWebserverAccessMode(@Nullable String webserverAccessMode) {
            this.webserverAccessMode = Input.ofNullable(webserverAccessMode);
            return this;
        }

        public Builder setWeeklyMaintenanceWindowStart(@Nullable Input<String> weeklyMaintenanceWindowStart) {
            this.weeklyMaintenanceWindowStart = weeklyMaintenanceWindowStart;
            return this;
        }

        public Builder setWeeklyMaintenanceWindowStart(@Nullable String weeklyMaintenanceWindowStart) {
            this.weeklyMaintenanceWindowStart = Input.ofNullable(weeklyMaintenanceWindowStart);
            return this;
        }
        public EnvironmentArgs build() {
            return new EnvironmentArgs(airflowConfigurationOptions, airflowVersion, dagS3Path, environmentClass, executionRoleArn, kmsKey, loggingConfiguration, maxWorkers, minWorkers, name, networkConfiguration, pluginsS3ObjectVersion, pluginsS3Path, requirementsS3ObjectVersion, requirementsS3Path, sourceBucketArn, tags, webserverAccessMode, weeklyMaintenanceWindowStart);
        }
    }
}
