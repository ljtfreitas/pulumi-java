// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions;
import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration;
import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfiguration;
import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration;
import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirehoseDeliveryStreamExtendedS3Configuration {
    /**
     * The ARN of the S3 bucket
     * 
     */
    private final String bucketArn;
    /**
     * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300.
     * 
     */
    private final @Nullable Integer bufferInterval;
    /**
     * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
     * We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be 10 MB or higher.
     * 
     */
    private final @Nullable Integer bufferSize;
    /**
     * The CloudWatch Logging Options for the delivery stream. More details are given below
     * 
     */
    private final @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
    /**
     * The compression format. If no value is specified, the default is `UNCOMPRESSED`. Other supported values are `GZIP`, `ZIP`, `Snappy`, & `HADOOP_SNAPPY`.
     * 
     */
    private final @Nullable String compressionFormat;
    /**
     * Nested argument for the serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC format before writing it to Amazon S3. More details given below.
     * 
     */
    private final @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration dataFormatConversionConfiguration;
    private final @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfiguration dynamicPartitioningConfiguration;
    /**
     * Prefix added to failed records before writing them to S3. Not currently supported for `redshift` destination. This prefix appears immediately following the bucket name. For information about how to specify this prefix, see [Custom Prefixes for Amazon S3 Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html).
     * 
     */
    private final @Nullable String errorOutputPrefix;
    /**
     * Specifies the KMS key ARN the stream will use to encrypt data. If not set, no encryption will
     * be used.
     * 
     */
    private final @Nullable String kmsKeyArn;
    /**
     * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered S3 files. You can specify an extra prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it appears as a folder in the S3 bucket
     * 
     */
    private final @Nullable String prefix;
    /**
     * The data processing configuration.  More details are given below.
     * 
     */
    private final @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration processingConfiguration;
    /**
     * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
     * 
     */
    private final String roleArn;
    /**
     * The configuration for backup in Amazon S3. Required if `s3_backup_mode` is `Enabled`. Supports the same fields as `s3_configuration` object.
     * 
     */
    private final @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration s3BackupConfiguration;
    /**
     * The Amazon S3 backup mode.  Valid values are `Disabled` and `Enabled`.  Default value is `Disabled`.
     * 
     */
    private final @Nullable String s3BackupMode;

    @OutputCustomType.Constructor({"bucketArn","bufferInterval","bufferSize","cloudwatchLoggingOptions","compressionFormat","dataFormatConversionConfiguration","dynamicPartitioningConfiguration","errorOutputPrefix","kmsKeyArn","prefix","processingConfiguration","roleArn","s3BackupConfiguration","s3BackupMode"})
    private FirehoseDeliveryStreamExtendedS3Configuration(
        String bucketArn,
        @Nullable Integer bufferInterval,
        @Nullable Integer bufferSize,
        @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions,
        @Nullable String compressionFormat,
        @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration dataFormatConversionConfiguration,
        @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfiguration dynamicPartitioningConfiguration,
        @Nullable String errorOutputPrefix,
        @Nullable String kmsKeyArn,
        @Nullable String prefix,
        @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration processingConfiguration,
        String roleArn,
        @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration s3BackupConfiguration,
        @Nullable String s3BackupMode) {
        this.bucketArn = Objects.requireNonNull(bucketArn);
        this.bufferInterval = bufferInterval;
        this.bufferSize = bufferSize;
        this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
        this.compressionFormat = compressionFormat;
        this.dataFormatConversionConfiguration = dataFormatConversionConfiguration;
        this.dynamicPartitioningConfiguration = dynamicPartitioningConfiguration;
        this.errorOutputPrefix = errorOutputPrefix;
        this.kmsKeyArn = kmsKeyArn;
        this.prefix = prefix;
        this.processingConfiguration = processingConfiguration;
        this.roleArn = Objects.requireNonNull(roleArn);
        this.s3BackupConfiguration = s3BackupConfiguration;
        this.s3BackupMode = s3BackupMode;
    }

    /**
     * The ARN of the S3 bucket
     * 
     */
    public String getBucketArn() {
        return this.bucketArn;
    }
    /**
     * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300.
     * 
     */
    public Optional<Integer> getBufferInterval() {
        return Optional.ofNullable(this.bufferInterval);
    }
    /**
     * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
     * We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be 10 MB or higher.
     * 
     */
    public Optional<Integer> getBufferSize() {
        return Optional.ofNullable(this.bufferSize);
    }
    /**
     * The CloudWatch Logging Options for the delivery stream. More details are given below
     * 
     */
    public Optional<FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
        return Optional.ofNullable(this.cloudwatchLoggingOptions);
    }
    /**
     * The compression format. If no value is specified, the default is `UNCOMPRESSED`. Other supported values are `GZIP`, `ZIP`, `Snappy`, & `HADOOP_SNAPPY`.
     * 
     */
    public Optional<String> getCompressionFormat() {
        return Optional.ofNullable(this.compressionFormat);
    }
    /**
     * Nested argument for the serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC format before writing it to Amazon S3. More details given below.
     * 
     */
    public Optional<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration> getDataFormatConversionConfiguration() {
        return Optional.ofNullable(this.dataFormatConversionConfiguration);
    }
    public Optional<FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfiguration> getDynamicPartitioningConfiguration() {
        return Optional.ofNullable(this.dynamicPartitioningConfiguration);
    }
    /**
     * Prefix added to failed records before writing them to S3. Not currently supported for `redshift` destination. This prefix appears immediately following the bucket name. For information about how to specify this prefix, see [Custom Prefixes for Amazon S3 Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html).
     * 
     */
    public Optional<String> getErrorOutputPrefix() {
        return Optional.ofNullable(this.errorOutputPrefix);
    }
    /**
     * Specifies the KMS key ARN the stream will use to encrypt data. If not set, no encryption will
     * be used.
     * 
     */
    public Optional<String> getKmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }
    /**
     * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered S3 files. You can specify an extra prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it appears as a folder in the S3 bucket
     * 
     */
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * The data processing configuration.  More details are given below.
     * 
     */
    public Optional<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration> getProcessingConfiguration() {
        return Optional.ofNullable(this.processingConfiguration);
    }
    /**
     * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
     * 
     */
    public String getRoleArn() {
        return this.roleArn;
    }
    /**
     * The configuration for backup in Amazon S3. Required if `s3_backup_mode` is `Enabled`. Supports the same fields as `s3_configuration` object.
     * 
     */
    public Optional<FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration> getS3BackupConfiguration() {
        return Optional.ofNullable(this.s3BackupConfiguration);
    }
    /**
     * The Amazon S3 backup mode.  Valid values are `Disabled` and `Enabled`.  Default value is `Disabled`.
     * 
     */
    public Optional<String> getS3BackupMode() {
        return Optional.ofNullable(this.s3BackupMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3Configuration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketArn;
        private @Nullable Integer bufferInterval;
        private @Nullable Integer bufferSize;
        private @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
        private @Nullable String compressionFormat;
        private @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration dataFormatConversionConfiguration;
        private @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfiguration dynamicPartitioningConfiguration;
        private @Nullable String errorOutputPrefix;
        private @Nullable String kmsKeyArn;
        private @Nullable String prefix;
        private @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration processingConfiguration;
        private String roleArn;
        private @Nullable FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration s3BackupConfiguration;
        private @Nullable String s3BackupMode;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3Configuration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketArn = defaults.bucketArn;
    	      this.bufferInterval = defaults.bufferInterval;
    	      this.bufferSize = defaults.bufferSize;
    	      this.cloudwatchLoggingOptions = defaults.cloudwatchLoggingOptions;
    	      this.compressionFormat = defaults.compressionFormat;
    	      this.dataFormatConversionConfiguration = defaults.dataFormatConversionConfiguration;
    	      this.dynamicPartitioningConfiguration = defaults.dynamicPartitioningConfiguration;
    	      this.errorOutputPrefix = defaults.errorOutputPrefix;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.prefix = defaults.prefix;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.roleArn = defaults.roleArn;
    	      this.s3BackupConfiguration = defaults.s3BackupConfiguration;
    	      this.s3BackupMode = defaults.s3BackupMode;
        }

        public Builder setBucketArn(String bucketArn) {
            this.bucketArn = Objects.requireNonNull(bucketArn);
            return this;
        }

        public Builder setBufferInterval(@Nullable Integer bufferInterval) {
            this.bufferInterval = bufferInterval;
            return this;
        }

        public Builder setBufferSize(@Nullable Integer bufferSize) {
            this.bufferSize = bufferSize;
            return this;
        }

        public Builder setCloudwatchLoggingOptions(@Nullable FirehoseDeliveryStreamExtendedS3ConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }

        public Builder setCompressionFormat(@Nullable String compressionFormat) {
            this.compressionFormat = compressionFormat;
            return this;
        }

        public Builder setDataFormatConversionConfiguration(@Nullable FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration dataFormatConversionConfiguration) {
            this.dataFormatConversionConfiguration = dataFormatConversionConfiguration;
            return this;
        }

        public Builder setDynamicPartitioningConfiguration(@Nullable FirehoseDeliveryStreamExtendedS3ConfigurationDynamicPartitioningConfiguration dynamicPartitioningConfiguration) {
            this.dynamicPartitioningConfiguration = dynamicPartitioningConfiguration;
            return this;
        }

        public Builder setErrorOutputPrefix(@Nullable String errorOutputPrefix) {
            this.errorOutputPrefix = errorOutputPrefix;
            return this;
        }

        public Builder setKmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setProcessingConfiguration(@Nullable FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfiguration processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setS3BackupConfiguration(@Nullable FirehoseDeliveryStreamExtendedS3ConfigurationS3BackupConfiguration s3BackupConfiguration) {
            this.s3BackupConfiguration = s3BackupConfiguration;
            return this;
        }

        public Builder setS3BackupMode(@Nullable String s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }
        public FirehoseDeliveryStreamExtendedS3Configuration build() {
            return new FirehoseDeliveryStreamExtendedS3Configuration(bucketArn, bufferInterval, bufferSize, cloudwatchLoggingOptions, compressionFormat, dataFormatConversionConfiguration, dynamicPartitioningConfiguration, errorOutputPrefix, kmsKeyArn, prefix, processingConfiguration, roleArn, s3BackupConfiguration, s3BackupMode);
        }
    }
}
