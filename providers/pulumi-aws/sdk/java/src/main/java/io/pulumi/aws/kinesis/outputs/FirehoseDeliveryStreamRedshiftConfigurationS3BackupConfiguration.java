// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptions;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration {
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
    private final @Nullable FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
    /**
     * The compression format. If no value is specified, the default is `UNCOMPRESSED`. Other supported values are `GZIP`, `ZIP`, `Snappy`, & `HADOOP_SNAPPY`.
     * 
     */
    private final @Nullable String compressionFormat;
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
     * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
     * 
     */
    private final String roleArn;

    @OutputCustomType.Constructor({"bucketArn","bufferInterval","bufferSize","cloudwatchLoggingOptions","compressionFormat","errorOutputPrefix","kmsKeyArn","prefix","roleArn"})
    private FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration(
        String bucketArn,
        @Nullable Integer bufferInterval,
        @Nullable Integer bufferSize,
        @Nullable FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions,
        @Nullable String compressionFormat,
        @Nullable String errorOutputPrefix,
        @Nullable String kmsKeyArn,
        @Nullable String prefix,
        String roleArn) {
        this.bucketArn = Objects.requireNonNull(bucketArn);
        this.bufferInterval = bufferInterval;
        this.bufferSize = bufferSize;
        this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
        this.compressionFormat = compressionFormat;
        this.errorOutputPrefix = errorOutputPrefix;
        this.kmsKeyArn = kmsKeyArn;
        this.prefix = prefix;
        this.roleArn = Objects.requireNonNull(roleArn);
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
    public Optional<FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptions> getCloudwatchLoggingOptions() {
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
     * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
     * 
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketArn;
        private @Nullable Integer bufferInterval;
        private @Nullable Integer bufferSize;
        private @Nullable FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions;
        private @Nullable String compressionFormat;
        private @Nullable String errorOutputPrefix;
        private @Nullable String kmsKeyArn;
        private @Nullable String prefix;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketArn = defaults.bucketArn;
    	      this.bufferInterval = defaults.bufferInterval;
    	      this.bufferSize = defaults.bufferSize;
    	      this.cloudwatchLoggingOptions = defaults.cloudwatchLoggingOptions;
    	      this.compressionFormat = defaults.compressionFormat;
    	      this.errorOutputPrefix = defaults.errorOutputPrefix;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.prefix = defaults.prefix;
    	      this.roleArn = defaults.roleArn;
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

        public Builder setCloudwatchLoggingOptions(@Nullable FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptions cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }

        public Builder setCompressionFormat(@Nullable String compressionFormat) {
            this.compressionFormat = compressionFormat;
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

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration build() {
            return new FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration(bucketArn, bufferInterval, bufferSize, cloudwatchLoggingOptions, compressionFormat, errorOutputPrefix, kmsKeyArn, prefix, roleArn);
        }
    }
}
