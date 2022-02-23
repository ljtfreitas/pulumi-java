// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamRedshiftConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamRedshiftConfigurationArgs Empty = new FirehoseDeliveryStreamRedshiftConfigurationArgs();

    /**
     * The CloudWatch Logging Options for the delivery stream. More details are given below
     * 
     */
    @InputImport(name="cloudwatchLoggingOptions")
    private final @Nullable Input<FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions;

    public Input<FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsArgs> getCloudwatchLoggingOptions() {
        return this.cloudwatchLoggingOptions == null ? Input.empty() : this.cloudwatchLoggingOptions;
    }

    /**
     * The jdbcurl of the redshift cluster.
     * 
     */
    @InputImport(name="clusterJdbcurl", required=true)
    private final Input<String> clusterJdbcurl;

    public Input<String> getClusterJdbcurl() {
        return this.clusterJdbcurl;
    }

    /**
     * Copy options for copying the data from the s3 intermediate bucket into redshift, for example to change the default delimiter. For valid values, see the [AWS documentation](http://docs.aws.amazon.com/firehose/latest/APIReference/API_CopyCommand.html)
     * 
     */
    @InputImport(name="copyOptions")
    private final @Nullable Input<String> copyOptions;

    public Input<String> getCopyOptions() {
        return this.copyOptions == null ? Input.empty() : this.copyOptions;
    }

    /**
     * The data table columns that will be targeted by the copy command.
     * 
     */
    @InputImport(name="dataTableColumns")
    private final @Nullable Input<String> dataTableColumns;

    public Input<String> getDataTableColumns() {
        return this.dataTableColumns == null ? Input.empty() : this.dataTableColumns;
    }

    /**
     * The name of the table in the redshift cluster that the s3 bucket will copy to.
     * 
     */
    @InputImport(name="dataTableName", required=true)
    private final Input<String> dataTableName;

    public Input<String> getDataTableName() {
        return this.dataTableName;
    }

    /**
     * The password for the username above.
     * 
     */
    @InputImport(name="password", required=true)
    private final Input<String> password;

    public Input<String> getPassword() {
        return this.password;
    }

    /**
     * The data processing configuration.  More details are given below.
     * 
     */
    @InputImport(name="processingConfiguration")
    private final @Nullable Input<FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationArgs> processingConfiguration;

    public Input<FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationArgs> getProcessingConfiguration() {
        return this.processingConfiguration == null ? Input.empty() : this.processingConfiguration;
    }

    /**
     * The length of time during which Firehose retries delivery after a failure, starting from the initial request and including the first attempt. The default value is 3600 seconds (60 minutes). Firehose does not retry if the value of DurationInSeconds is 0 (zero) or if the first delivery attempt takes longer than the current value.
     * 
     */
    @InputImport(name="retryDuration")
    private final @Nullable Input<Integer> retryDuration;

    public Input<Integer> getRetryDuration() {
        return this.retryDuration == null ? Input.empty() : this.retryDuration;
    }

    /**
     * The arn of the role the stream assumes.
     * 
     */
    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * The configuration for backup in Amazon S3. Required if `s3_backup_mode` is `Enabled`. Supports the same fields as `s3_configuration` object.
     * 
     */
    @InputImport(name="s3BackupConfiguration")
    private final @Nullable Input<FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs> s3BackupConfiguration;

    public Input<FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs> getS3BackupConfiguration() {
        return this.s3BackupConfiguration == null ? Input.empty() : this.s3BackupConfiguration;
    }

    /**
     * The Amazon S3 backup mode.  Valid values are `Disabled` and `Enabled`.  Default value is `Disabled`.
     * 
     */
    @InputImport(name="s3BackupMode")
    private final @Nullable Input<String> s3BackupMode;

    public Input<String> getS3BackupMode() {
        return this.s3BackupMode == null ? Input.empty() : this.s3BackupMode;
    }

    /**
     * The username that the firehose delivery stream will assume. It is strongly recommended that the username and password provided is used exclusively for Amazon Kinesis Firehose purposes, and that the permissions for the account are restricted for Amazon Redshift INSERT permissions.
     * 
     */
    @InputImport(name="username", required=true)
    private final Input<String> username;

    public Input<String> getUsername() {
        return this.username;
    }

    public FirehoseDeliveryStreamRedshiftConfigurationArgs(
        @Nullable Input<FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions,
        Input<String> clusterJdbcurl,
        @Nullable Input<String> copyOptions,
        @Nullable Input<String> dataTableColumns,
        Input<String> dataTableName,
        Input<String> password,
        @Nullable Input<FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationArgs> processingConfiguration,
        @Nullable Input<Integer> retryDuration,
        Input<String> roleArn,
        @Nullable Input<FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs> s3BackupConfiguration,
        @Nullable Input<String> s3BackupMode,
        Input<String> username) {
        this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
        this.clusterJdbcurl = Objects.requireNonNull(clusterJdbcurl, "expected parameter 'clusterJdbcurl' to be non-null");
        this.copyOptions = copyOptions;
        this.dataTableColumns = dataTableColumns;
        this.dataTableName = Objects.requireNonNull(dataTableName, "expected parameter 'dataTableName' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.processingConfiguration = processingConfiguration;
        this.retryDuration = retryDuration;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.s3BackupConfiguration = s3BackupConfiguration;
        this.s3BackupMode = s3BackupMode;
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private FirehoseDeliveryStreamRedshiftConfigurationArgs() {
        this.cloudwatchLoggingOptions = Input.empty();
        this.clusterJdbcurl = Input.empty();
        this.copyOptions = Input.empty();
        this.dataTableColumns = Input.empty();
        this.dataTableName = Input.empty();
        this.password = Input.empty();
        this.processingConfiguration = Input.empty();
        this.retryDuration = Input.empty();
        this.roleArn = Input.empty();
        this.s3BackupConfiguration = Input.empty();
        this.s3BackupMode = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamRedshiftConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions;
        private Input<String> clusterJdbcurl;
        private @Nullable Input<String> copyOptions;
        private @Nullable Input<String> dataTableColumns;
        private Input<String> dataTableName;
        private Input<String> password;
        private @Nullable Input<FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationArgs> processingConfiguration;
        private @Nullable Input<Integer> retryDuration;
        private Input<String> roleArn;
        private @Nullable Input<FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs> s3BackupConfiguration;
        private @Nullable Input<String> s3BackupMode;
        private Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamRedshiftConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLoggingOptions = defaults.cloudwatchLoggingOptions;
    	      this.clusterJdbcurl = defaults.clusterJdbcurl;
    	      this.copyOptions = defaults.copyOptions;
    	      this.dataTableColumns = defaults.dataTableColumns;
    	      this.dataTableName = defaults.dataTableName;
    	      this.password = defaults.password;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.retryDuration = defaults.retryDuration;
    	      this.roleArn = defaults.roleArn;
    	      this.s3BackupConfiguration = defaults.s3BackupConfiguration;
    	      this.s3BackupMode = defaults.s3BackupMode;
    	      this.username = defaults.username;
        }

        public Builder setCloudwatchLoggingOptions(@Nullable Input<FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }

        public Builder setCloudwatchLoggingOptions(@Nullable FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptionsArgs cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = Input.ofNullable(cloudwatchLoggingOptions);
            return this;
        }

        public Builder setClusterJdbcurl(Input<String> clusterJdbcurl) {
            this.clusterJdbcurl = Objects.requireNonNull(clusterJdbcurl);
            return this;
        }

        public Builder setClusterJdbcurl(String clusterJdbcurl) {
            this.clusterJdbcurl = Input.of(Objects.requireNonNull(clusterJdbcurl));
            return this;
        }

        public Builder setCopyOptions(@Nullable Input<String> copyOptions) {
            this.copyOptions = copyOptions;
            return this;
        }

        public Builder setCopyOptions(@Nullable String copyOptions) {
            this.copyOptions = Input.ofNullable(copyOptions);
            return this;
        }

        public Builder setDataTableColumns(@Nullable Input<String> dataTableColumns) {
            this.dataTableColumns = dataTableColumns;
            return this;
        }

        public Builder setDataTableColumns(@Nullable String dataTableColumns) {
            this.dataTableColumns = Input.ofNullable(dataTableColumns);
            return this;
        }

        public Builder setDataTableName(Input<String> dataTableName) {
            this.dataTableName = Objects.requireNonNull(dataTableName);
            return this;
        }

        public Builder setDataTableName(String dataTableName) {
            this.dataTableName = Input.of(Objects.requireNonNull(dataTableName));
            return this;
        }

        public Builder setPassword(Input<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Input.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder setProcessingConfiguration(@Nullable Input<FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationArgs> processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }

        public Builder setProcessingConfiguration(@Nullable FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationArgs processingConfiguration) {
            this.processingConfiguration = Input.ofNullable(processingConfiguration);
            return this;
        }

        public Builder setRetryDuration(@Nullable Input<Integer> retryDuration) {
            this.retryDuration = retryDuration;
            return this;
        }

        public Builder setRetryDuration(@Nullable Integer retryDuration) {
            this.retryDuration = Input.ofNullable(retryDuration);
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setS3BackupConfiguration(@Nullable Input<FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs> s3BackupConfiguration) {
            this.s3BackupConfiguration = s3BackupConfiguration;
            return this;
        }

        public Builder setS3BackupConfiguration(@Nullable FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs s3BackupConfiguration) {
            this.s3BackupConfiguration = Input.ofNullable(s3BackupConfiguration);
            return this;
        }

        public Builder setS3BackupMode(@Nullable Input<String> s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }

        public Builder setS3BackupMode(@Nullable String s3BackupMode) {
            this.s3BackupMode = Input.ofNullable(s3BackupMode);
            return this;
        }

        public Builder setUsername(Input<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Input.of(Objects.requireNonNull(username));
            return this;
        }
        public FirehoseDeliveryStreamRedshiftConfigurationArgs build() {
            return new FirehoseDeliveryStreamRedshiftConfigurationArgs(cloudwatchLoggingOptions, clusterJdbcurl, copyOptions, dataTableColumns, dataTableName, password, processingConfiguration, retryDuration, roleArn, s3BackupConfiguration, s3BackupMode, username);
        }
    }
}
