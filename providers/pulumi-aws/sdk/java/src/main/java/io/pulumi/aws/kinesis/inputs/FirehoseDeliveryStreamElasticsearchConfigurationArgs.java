// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamElasticsearchConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamElasticsearchConfigurationArgs Empty = new FirehoseDeliveryStreamElasticsearchConfigurationArgs();

    /**
     * Buffer incoming data for the specified period of time, in seconds between 60 to 900, before delivering it to the destination.  The default value is 300s.
     * 
     */
    @Import(name="bufferingInterval")
      private final @Nullable Output<Integer> bufferingInterval;

    public Output<Integer> getBufferingInterval() {
        return this.bufferingInterval == null ? Output.empty() : this.bufferingInterval;
    }

    /**
     * Buffer incoming data to the specified size, in MBs between 1 to 100, before delivering it to the destination.  The default value is 5MB.
     * 
     */
    @Import(name="bufferingSize")
      private final @Nullable Output<Integer> bufferingSize;

    public Output<Integer> getBufferingSize() {
        return this.bufferingSize == null ? Output.empty() : this.bufferingSize;
    }

    /**
     * The CloudWatch Logging Options for the delivery stream. More details are given below
     * 
     */
    @Import(name="cloudwatchLoggingOptions")
      private final @Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions;

    public Output<FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs> getCloudwatchLoggingOptions() {
        return this.cloudwatchLoggingOptions == null ? Output.empty() : this.cloudwatchLoggingOptions;
    }

    /**
     * The endpoint to use when communicating with the cluster. Conflicts with `domain_arn`.
     * 
     */
    @Import(name="clusterEndpoint")
      private final @Nullable Output<String> clusterEndpoint;

    public Output<String> getClusterEndpoint() {
        return this.clusterEndpoint == null ? Output.empty() : this.clusterEndpoint;
    }

    /**
     * The ARN of the Amazon ES domain.  The IAM role must have permission for `DescribeElasticsearchDomain`, `DescribeElasticsearchDomains`, and `DescribeElasticsearchDomainConfig` after assuming `RoleARN`.  The pattern needs to be `arn:.*`. Conflicts with `cluster_endpoint`.
     * 
     */
    @Import(name="domainArn")
      private final @Nullable Output<String> domainArn;

    public Output<String> getDomainArn() {
        return this.domainArn == null ? Output.empty() : this.domainArn;
    }

    /**
     * The Elasticsearch index name.
     * 
     */
    @Import(name="indexName", required=true)
      private final Output<String> indexName;

    public Output<String> getIndexName() {
        return this.indexName;
    }

    /**
     * The Elasticsearch index rotation period.  Index rotation appends a timestamp to the IndexName to facilitate expiration of old data.  Valid values are `NoRotation`, `OneHour`, `OneDay`, `OneWeek`, and `OneMonth`.  The default value is `OneDay`.
     * 
     */
    @Import(name="indexRotationPeriod")
      private final @Nullable Output<String> indexRotationPeriod;

    public Output<String> getIndexRotationPeriod() {
        return this.indexRotationPeriod == null ? Output.empty() : this.indexRotationPeriod;
    }

    /**
     * The data processing configuration.  More details are given below.
     * 
     */
    @Import(name="processingConfiguration")
      private final @Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs> processingConfiguration;

    public Output<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs> getProcessingConfiguration() {
        return this.processingConfiguration == null ? Output.empty() : this.processingConfiguration;
    }

    /**
     * After an initial failure to deliver to Amazon Elasticsearch, the total amount of time, in seconds between 0 to 7200, during which Firehose re-attempts delivery (including the first attempt).  After this time has elapsed, the failed documents are written to Amazon S3.  The default value is 300s.  There will be no retry if the value is 0.
     * 
     */
    @Import(name="retryDuration")
      private final @Nullable Output<Integer> retryDuration;

    public Output<Integer> getRetryDuration() {
        return this.retryDuration == null ? Output.empty() : this.retryDuration;
    }

    /**
     * The ARN of the IAM role to be assumed by Firehose for calling the Amazon ES Configuration API and for indexing documents.  The pattern needs to be `arn:.*`.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedDocumentsOnly` and `AllDocuments`.  Default value is `FailedDocumentsOnly`.
     * 
     */
    @Import(name="s3BackupMode")
      private final @Nullable Output<String> s3BackupMode;

    public Output<String> getS3BackupMode() {
        return this.s3BackupMode == null ? Output.empty() : this.s3BackupMode;
    }

    /**
     * The Elasticsearch type name with maximum length of 100 characters.
     * 
     */
    @Import(name="typeName")
      private final @Nullable Output<String> typeName;

    public Output<String> getTypeName() {
        return this.typeName == null ? Output.empty() : this.typeName;
    }

    /**
     * The VPC configuration for the delivery stream to connect to Elastic Search associated with the VPC. More details are given below
     * 
     */
    @Import(name="vpcConfig")
      private final @Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs> vpcConfig;

    public Output<FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs> getVpcConfig() {
        return this.vpcConfig == null ? Output.empty() : this.vpcConfig;
    }

    public FirehoseDeliveryStreamElasticsearchConfigurationArgs(
        @Nullable Output<Integer> bufferingInterval,
        @Nullable Output<Integer> bufferingSize,
        @Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions,
        @Nullable Output<String> clusterEndpoint,
        @Nullable Output<String> domainArn,
        Output<String> indexName,
        @Nullable Output<String> indexRotationPeriod,
        @Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs> processingConfiguration,
        @Nullable Output<Integer> retryDuration,
        Output<String> roleArn,
        @Nullable Output<String> s3BackupMode,
        @Nullable Output<String> typeName,
        @Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs> vpcConfig) {
        this.bufferingInterval = bufferingInterval;
        this.bufferingSize = bufferingSize;
        this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
        this.clusterEndpoint = clusterEndpoint;
        this.domainArn = domainArn;
        this.indexName = Objects.requireNonNull(indexName, "expected parameter 'indexName' to be non-null");
        this.indexRotationPeriod = indexRotationPeriod;
        this.processingConfiguration = processingConfiguration;
        this.retryDuration = retryDuration;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.s3BackupMode = s3BackupMode;
        this.typeName = typeName;
        this.vpcConfig = vpcConfig;
    }

    private FirehoseDeliveryStreamElasticsearchConfigurationArgs() {
        this.bufferingInterval = Output.empty();
        this.bufferingSize = Output.empty();
        this.cloudwatchLoggingOptions = Output.empty();
        this.clusterEndpoint = Output.empty();
        this.domainArn = Output.empty();
        this.indexName = Output.empty();
        this.indexRotationPeriod = Output.empty();
        this.processingConfiguration = Output.empty();
        this.retryDuration = Output.empty();
        this.roleArn = Output.empty();
        this.s3BackupMode = Output.empty();
        this.typeName = Output.empty();
        this.vpcConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamElasticsearchConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> bufferingInterval;
        private @Nullable Output<Integer> bufferingSize;
        private @Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions;
        private @Nullable Output<String> clusterEndpoint;
        private @Nullable Output<String> domainArn;
        private Output<String> indexName;
        private @Nullable Output<String> indexRotationPeriod;
        private @Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs> processingConfiguration;
        private @Nullable Output<Integer> retryDuration;
        private Output<String> roleArn;
        private @Nullable Output<String> s3BackupMode;
        private @Nullable Output<String> typeName;
        private @Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamElasticsearchConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bufferingInterval = defaults.bufferingInterval;
    	      this.bufferingSize = defaults.bufferingSize;
    	      this.cloudwatchLoggingOptions = defaults.cloudwatchLoggingOptions;
    	      this.clusterEndpoint = defaults.clusterEndpoint;
    	      this.domainArn = defaults.domainArn;
    	      this.indexName = defaults.indexName;
    	      this.indexRotationPeriod = defaults.indexRotationPeriod;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.retryDuration = defaults.retryDuration;
    	      this.roleArn = defaults.roleArn;
    	      this.s3BackupMode = defaults.s3BackupMode;
    	      this.typeName = defaults.typeName;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder bufferingInterval(@Nullable Output<Integer> bufferingInterval) {
            this.bufferingInterval = bufferingInterval;
            return this;
        }

        public Builder bufferingInterval(@Nullable Integer bufferingInterval) {
            this.bufferingInterval = Output.ofNullable(bufferingInterval);
            return this;
        }

        public Builder bufferingSize(@Nullable Output<Integer> bufferingSize) {
            this.bufferingSize = bufferingSize;
            return this;
        }

        public Builder bufferingSize(@Nullable Integer bufferingSize) {
            this.bufferingSize = Output.ofNullable(bufferingSize);
            return this;
        }

        public Builder cloudwatchLoggingOptions(@Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }

        public Builder cloudwatchLoggingOptions(@Nullable FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptionsArgs cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = Output.ofNullable(cloudwatchLoggingOptions);
            return this;
        }

        public Builder clusterEndpoint(@Nullable Output<String> clusterEndpoint) {
            this.clusterEndpoint = clusterEndpoint;
            return this;
        }

        public Builder clusterEndpoint(@Nullable String clusterEndpoint) {
            this.clusterEndpoint = Output.ofNullable(clusterEndpoint);
            return this;
        }

        public Builder domainArn(@Nullable Output<String> domainArn) {
            this.domainArn = domainArn;
            return this;
        }

        public Builder domainArn(@Nullable String domainArn) {
            this.domainArn = Output.ofNullable(domainArn);
            return this;
        }

        public Builder indexName(Output<String> indexName) {
            this.indexName = Objects.requireNonNull(indexName);
            return this;
        }

        public Builder indexName(String indexName) {
            this.indexName = Output.of(Objects.requireNonNull(indexName));
            return this;
        }

        public Builder indexRotationPeriod(@Nullable Output<String> indexRotationPeriod) {
            this.indexRotationPeriod = indexRotationPeriod;
            return this;
        }

        public Builder indexRotationPeriod(@Nullable String indexRotationPeriod) {
            this.indexRotationPeriod = Output.ofNullable(indexRotationPeriod);
            return this;
        }

        public Builder processingConfiguration(@Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs> processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }

        public Builder processingConfiguration(@Nullable FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationArgs processingConfiguration) {
            this.processingConfiguration = Output.ofNullable(processingConfiguration);
            return this;
        }

        public Builder retryDuration(@Nullable Output<Integer> retryDuration) {
            this.retryDuration = retryDuration;
            return this;
        }

        public Builder retryDuration(@Nullable Integer retryDuration) {
            this.retryDuration = Output.ofNullable(retryDuration);
            return this;
        }

        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder s3BackupMode(@Nullable Output<String> s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }

        public Builder s3BackupMode(@Nullable String s3BackupMode) {
            this.s3BackupMode = Output.ofNullable(s3BackupMode);
            return this;
        }

        public Builder typeName(@Nullable Output<String> typeName) {
            this.typeName = typeName;
            return this;
        }

        public Builder typeName(@Nullable String typeName) {
            this.typeName = Output.ofNullable(typeName);
            return this;
        }

        public Builder vpcConfig(@Nullable Output<FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public Builder vpcConfig(@Nullable FirehoseDeliveryStreamElasticsearchConfigurationVpcConfigArgs vpcConfig) {
            this.vpcConfig = Output.ofNullable(vpcConfig);
            return this;
        }
        public FirehoseDeliveryStreamElasticsearchConfigurationArgs build() {
            return new FirehoseDeliveryStreamElasticsearchConfigurationArgs(bufferingInterval, bufferingSize, cloudwatchLoggingOptions, clusterEndpoint, domainArn, indexName, indexRotationPeriod, processingConfiguration, retryDuration, roleArn, s3BackupMode, typeName, vpcConfig);
        }
    }
}
