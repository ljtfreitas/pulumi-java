// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mwaa;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.mwaa.EnvironmentArgs;
import io.pulumi.aws.mwaa.inputs.EnvironmentState;
import io.pulumi.aws.mwaa.outputs.EnvironmentLastUpdated;
import io.pulumi.aws.mwaa.outputs.EnvironmentLoggingConfiguration;
import io.pulumi.aws.mwaa.outputs.EnvironmentNetworkConfiguration;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a MWAA Environment resource.
 * 
 * ## Example Usage
 * 
 * A MWAA Environment requires an IAM role (`aws.iam.Role`), two subnets in the private zone (`aws.ec2.Subnet`) and a versioned S3 bucket (`aws.s3.Bucket`).
 * 
 * ## Import
 * 
 * MWAA Environment can be imported using `Name` e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:mwaa/environment:Environment example MyAirflowEnvironment
 * ```
 * 
 */
@ResourceType(type="aws:mwaa/environment:Environment")
public class Environment extends io.pulumi.resources.CustomResource {
    /**
     * The `airflow_configuration_options` parameter specifies airflow override options. Check the [Official documentation](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html#configuring-env-variables-reference) for all possible configuration options.
     * 
     */
    @Export(name="airflowConfigurationOptions", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> airflowConfigurationOptions;

    /**
     * @return The `airflow_configuration_options` parameter specifies airflow override options. Check the [Official documentation](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-env-variables.html#configuring-env-variables-reference) for all possible configuration options.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getAirflowConfigurationOptions() {
        return this.airflowConfigurationOptions;
    }
    /**
     * Airflow version of your environment, will be set by default to the latest version that MWAA supports.
     * 
     */
    @Export(name="airflowVersion", type=String.class, parameters={})
    private Output<String> airflowVersion;

    /**
     * @return Airflow version of your environment, will be set by default to the latest version that MWAA supports.
     * 
     */
    public Output<String> getAirflowVersion() {
        return this.airflowVersion;
    }
    /**
     * The ARN of the MWAA Environment
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the MWAA Environment
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The Created At date of the MWAA Environment
     * * `logging_configuration[0].<LOG_CONFIGURATION_TYPE>[0].cloud_watch_log_group_arn` - Provides the ARN for the CloudWatch group where the logs will be published
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The Created At date of the MWAA Environment
     * * `logging_configuration[0].<LOG_CONFIGURATION_TYPE>[0].cloud_watch_log_group_arn` - Provides the ARN for the CloudWatch group where the logs will be published
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The relative path to the DAG folder on your Amazon S3 storage bucket. For example, dags. For more information, see [Importing DAGs on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html).
     * 
     */
    @Export(name="dagS3Path", type=String.class, parameters={})
    private Output<String> dagS3Path;

    /**
     * @return The relative path to the DAG folder on your Amazon S3 storage bucket. For example, dags. For more information, see [Importing DAGs on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html).
     * 
     */
    public Output<String> getDagS3Path() {
        return this.dagS3Path;
    }
    /**
     * Environment class for the cluster. Possible options are `mw1.small`, `mw1.medium`, `mw1.large`. Will be set by default to `mw1.small`. Please check the [AWS Pricing](https://aws.amazon.com/de/managed-workflows-for-apache-airflow/pricing/) for more information about the environment classes.
     * 
     */
    @Export(name="environmentClass", type=String.class, parameters={})
    private Output<String> environmentClass;

    /**
     * @return Environment class for the cluster. Possible options are `mw1.small`, `mw1.medium`, `mw1.large`. Will be set by default to `mw1.small`. Please check the [AWS Pricing](https://aws.amazon.com/de/managed-workflows-for-apache-airflow/pricing/) for more information about the environment classes.
     * 
     */
    public Output<String> getEnvironmentClass() {
        return this.environmentClass;
    }
    /**
     * The Amazon Resource Name (ARN) of the task execution role that the Amazon MWAA and its environment can assume. Check the [official AWS documentation](https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-create-role.html) for the detailed role specification.
     * 
     */
    @Export(name="executionRoleArn", type=String.class, parameters={})
    private Output<String> executionRoleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the task execution role that the Amazon MWAA and its environment can assume. Check the [official AWS documentation](https://docs.aws.amazon.com/mwaa/latest/userguide/mwaa-create-role.html) for the detailed role specification.
     * 
     */
    public Output<String> getExecutionRoleArn() {
        return this.executionRoleArn;
    }
    /**
     * The Amazon Resource Name (ARN) of your KMS key that you want to use for encryption. Will be set to the ARN of the managed KMS key `aws/airflow` by default. Please check the [Official Documentation](https://docs.aws.amazon.com/mwaa/latest/userguide/custom-keys-certs.html) for more information.
     * 
     */
    @Export(name="kmsKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKey;

    /**
     * @return The Amazon Resource Name (ARN) of your KMS key that you want to use for encryption. Will be set to the ARN of the managed KMS key `aws/airflow` by default. Please check the [Official Documentation](https://docs.aws.amazon.com/mwaa/latest/userguide/custom-keys-certs.html) for more information.
     * 
     */
    public Output</* @Nullable */ String> getKmsKey() {
        return this.kmsKey;
    }
    @Export(name="lastUpdateds", type=List.class, parameters={EnvironmentLastUpdated.class})
    private Output<List<EnvironmentLastUpdated>> lastUpdateds;

    public Output<List<EnvironmentLastUpdated>> getLastUpdateds() {
        return this.lastUpdateds;
    }
    /**
     * The Apache Airflow logs you want to send to Amazon CloudWatch Logs.
     * 
     */
    @Export(name="loggingConfiguration", type=EnvironmentLoggingConfiguration.class, parameters={})
    private Output<EnvironmentLoggingConfiguration> loggingConfiguration;

    /**
     * @return The Apache Airflow logs you want to send to Amazon CloudWatch Logs.
     * 
     */
    public Output<EnvironmentLoggingConfiguration> getLoggingConfiguration() {
        return this.loggingConfiguration;
    }
    /**
     * The maximum number of workers that can be automatically scaled up. Value need to be between `1` and `25`. Will be `10` by default.
     * 
     */
    @Export(name="maxWorkers", type=Integer.class, parameters={})
    private Output<Integer> maxWorkers;

    /**
     * @return The maximum number of workers that can be automatically scaled up. Value need to be between `1` and `25`. Will be `10` by default.
     * 
     */
    public Output<Integer> getMaxWorkers() {
        return this.maxWorkers;
    }
    /**
     * The minimum number of workers that you want to run in your environment. Will be `1` by default.
     * 
     */
    @Export(name="minWorkers", type=Integer.class, parameters={})
    private Output<Integer> minWorkers;

    /**
     * @return The minimum number of workers that you want to run in your environment. Will be `1` by default.
     * 
     */
    public Output<Integer> getMinWorkers() {
        return this.minWorkers;
    }
    /**
     * The name of the Apache Airflow Environment
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Apache Airflow Environment
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies the network configuration for your Apache Airflow Environment. This includes two private subnets as well as security groups for the Airflow environment. Each subnet requires internet connection, otherwise the deployment will fail. See Network configuration below for details.
     * 
     */
    @Export(name="networkConfiguration", type=EnvironmentNetworkConfiguration.class, parameters={})
    private Output<EnvironmentNetworkConfiguration> networkConfiguration;

    /**
     * @return Specifies the network configuration for your Apache Airflow Environment. This includes two private subnets as well as security groups for the Airflow environment. Each subnet requires internet connection, otherwise the deployment will fail. See Network configuration below for details.
     * 
     */
    public Output<EnvironmentNetworkConfiguration> getNetworkConfiguration() {
        return this.networkConfiguration;
    }
    /**
     * The plugins.zip file version you want to use.
     * 
     */
    @Export(name="pluginsS3ObjectVersion", type=String.class, parameters={})
    private Output<String> pluginsS3ObjectVersion;

    /**
     * @return The plugins.zip file version you want to use.
     * 
     */
    public Output<String> getPluginsS3ObjectVersion() {
        return this.pluginsS3ObjectVersion;
    }
    /**
     * The relative path to the plugins.zip file on your Amazon S3 storage bucket. For example, plugins.zip. If a relative path is provided in the request, then plugins_s3_object_version is required. For more information, see [Importing DAGs on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html).
     * 
     */
    @Export(name="pluginsS3Path", type=String.class, parameters={})
    private Output</* @Nullable */ String> pluginsS3Path;

    /**
     * @return The relative path to the plugins.zip file on your Amazon S3 storage bucket. For example, plugins.zip. If a relative path is provided in the request, then plugins_s3_object_version is required. For more information, see [Importing DAGs on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html).
     * 
     */
    public Output</* @Nullable */ String> getPluginsS3Path() {
        return this.pluginsS3Path;
    }
    /**
     * The requirements.txt file version you want to use.
     * 
     */
    @Export(name="requirementsS3ObjectVersion", type=String.class, parameters={})
    private Output<String> requirementsS3ObjectVersion;

    /**
     * @return The requirements.txt file version you want to use.
     * 
     */
    public Output<String> getRequirementsS3ObjectVersion() {
        return this.requirementsS3ObjectVersion;
    }
    /**
     * The relative path to the requirements.txt file on your Amazon S3 storage bucket. For example, requirements.txt. If a relative path is provided in the request, then requirements_s3_object_version is required. For more information, see [Importing DAGs on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html).
     * 
     */
    @Export(name="requirementsS3Path", type=String.class, parameters={})
    private Output</* @Nullable */ String> requirementsS3Path;

    /**
     * @return The relative path to the requirements.txt file on your Amazon S3 storage bucket. For example, requirements.txt. If a relative path is provided in the request, then requirements_s3_object_version is required. For more information, see [Importing DAGs on Amazon MWAA](https://docs.aws.amazon.com/mwaa/latest/userguide/configuring-dag-import.html).
     * 
     */
    public Output</* @Nullable */ String> getRequirementsS3Path() {
        return this.requirementsS3Path;
    }
    /**
     * The Service Role ARN of the Amazon MWAA Environment
     * 
     */
    @Export(name="serviceRoleArn", type=String.class, parameters={})
    private Output<String> serviceRoleArn;

    /**
     * @return The Service Role ARN of the Amazon MWAA Environment
     * 
     */
    public Output<String> getServiceRoleArn() {
        return this.serviceRoleArn;
    }
    /**
     * The Amazon Resource Name (ARN) of your Amazon S3 storage bucket. For example, arn:aws:s3:::airflow-mybucketname.
     * 
     */
    @Export(name="sourceBucketArn", type=String.class, parameters={})
    private Output<String> sourceBucketArn;

    /**
     * @return The Amazon Resource Name (ARN) of your Amazon S3 storage bucket. For example, arn:aws:s3:::airflow-mybucketname.
     * 
     */
    public Output<String> getSourceBucketArn() {
        return this.sourceBucketArn;
    }
    /**
     * The status of the Amazon MWAA Environment
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the Amazon MWAA Environment
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * A map of resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Specifies whether the webserver should be accessible over the internet or via your specified VPC. Possible options: `PRIVATE_ONLY` (default) and `PUBLIC_ONLY`.
     * 
     */
    @Export(name="webserverAccessMode", type=String.class, parameters={})
    private Output<String> webserverAccessMode;

    /**
     * @return Specifies whether the webserver should be accessible over the internet or via your specified VPC. Possible options: `PRIVATE_ONLY` (default) and `PUBLIC_ONLY`.
     * 
     */
    public Output<String> getWebserverAccessMode() {
        return this.webserverAccessMode;
    }
    /**
     * The webserver URL of the MWAA Environment
     * 
     */
    @Export(name="webserverUrl", type=String.class, parameters={})
    private Output<String> webserverUrl;

    /**
     * @return The webserver URL of the MWAA Environment
     * 
     */
    public Output<String> getWebserverUrl() {
        return this.webserverUrl;
    }
    /**
     * Specifies the start date for the weekly maintenance window.
     * 
     */
    @Export(name="weeklyMaintenanceWindowStart", type=String.class, parameters={})
    private Output<String> weeklyMaintenanceWindowStart;

    /**
     * @return Specifies the start date for the weekly maintenance window.
     * 
     */
    public Output<String> getWeeklyMaintenanceWindowStart() {
        return this.weeklyMaintenanceWindowStart;
    }

    public interface BuilderApplicator {
        public void apply(EnvironmentArgs.Builder a);
    }
    private static io.pulumi.aws.mwaa.EnvironmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.mwaa.EnvironmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Environment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Environment(String name) {
        this(name, EnvironmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Environment(String name, EnvironmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Environment(String name, EnvironmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:mwaa/environment:Environment", name, args == null ? EnvironmentArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Environment(String name, Output<String> id, @Nullable EnvironmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:mwaa/environment:Environment", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Environment get(String name, Output<String> id, @Nullable EnvironmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Environment(name, id, state, options);
    }
}
