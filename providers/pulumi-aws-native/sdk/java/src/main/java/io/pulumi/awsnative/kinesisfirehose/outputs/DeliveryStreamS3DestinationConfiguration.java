// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamS3DestinationConfigurationCompressionFormat;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamBufferingHints;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamCloudWatchLoggingOptions;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamEncryptionConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeliveryStreamS3DestinationConfiguration {
    private final String bucketARN;
    private final @Nullable DeliveryStreamBufferingHints bufferingHints;
    private final @Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions;
    private final @Nullable DeliveryStreamS3DestinationConfigurationCompressionFormat compressionFormat;
    private final @Nullable DeliveryStreamEncryptionConfiguration encryptionConfiguration;
    private final @Nullable String errorOutputPrefix;
    private final @Nullable String prefix;
    private final String roleARN;

    @OutputCustomType.Constructor({"bucketARN","bufferingHints","cloudWatchLoggingOptions","compressionFormat","encryptionConfiguration","errorOutputPrefix","prefix","roleARN"})
    private DeliveryStreamS3DestinationConfiguration(
        String bucketARN,
        @Nullable DeliveryStreamBufferingHints bufferingHints,
        @Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions,
        @Nullable DeliveryStreamS3DestinationConfigurationCompressionFormat compressionFormat,
        @Nullable DeliveryStreamEncryptionConfiguration encryptionConfiguration,
        @Nullable String errorOutputPrefix,
        @Nullable String prefix,
        String roleARN) {
        this.bucketARN = Objects.requireNonNull(bucketARN);
        this.bufferingHints = bufferingHints;
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
        this.compressionFormat = compressionFormat;
        this.encryptionConfiguration = encryptionConfiguration;
        this.errorOutputPrefix = errorOutputPrefix;
        this.prefix = prefix;
        this.roleARN = Objects.requireNonNull(roleARN);
    }

    public String getBucketARN() {
        return this.bucketARN;
    }
    public Optional<DeliveryStreamBufferingHints> getBufferingHints() {
        return Optional.ofNullable(this.bufferingHints);
    }
    public Optional<DeliveryStreamCloudWatchLoggingOptions> getCloudWatchLoggingOptions() {
        return Optional.ofNullable(this.cloudWatchLoggingOptions);
    }
    public Optional<DeliveryStreamS3DestinationConfigurationCompressionFormat> getCompressionFormat() {
        return Optional.ofNullable(this.compressionFormat);
    }
    public Optional<DeliveryStreamEncryptionConfiguration> getEncryptionConfiguration() {
        return Optional.ofNullable(this.encryptionConfiguration);
    }
    public Optional<String> getErrorOutputPrefix() {
        return Optional.ofNullable(this.errorOutputPrefix);
    }
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }
    public String getRoleARN() {
        return this.roleARN;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamS3DestinationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketARN;
        private @Nullable DeliveryStreamBufferingHints bufferingHints;
        private @Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions;
        private @Nullable DeliveryStreamS3DestinationConfigurationCompressionFormat compressionFormat;
        private @Nullable DeliveryStreamEncryptionConfiguration encryptionConfiguration;
        private @Nullable String errorOutputPrefix;
        private @Nullable String prefix;
        private String roleARN;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamS3DestinationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketARN = defaults.bucketARN;
    	      this.bufferingHints = defaults.bufferingHints;
    	      this.cloudWatchLoggingOptions = defaults.cloudWatchLoggingOptions;
    	      this.compressionFormat = defaults.compressionFormat;
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.errorOutputPrefix = defaults.errorOutputPrefix;
    	      this.prefix = defaults.prefix;
    	      this.roleARN = defaults.roleARN;
        }

        public Builder setBucketARN(String bucketARN) {
            this.bucketARN = Objects.requireNonNull(bucketARN);
            return this;
        }

        public Builder setBufferingHints(@Nullable DeliveryStreamBufferingHints bufferingHints) {
            this.bufferingHints = bufferingHints;
            return this;
        }

        public Builder setCloudWatchLoggingOptions(@Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions) {
            this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
            return this;
        }

        public Builder setCompressionFormat(@Nullable DeliveryStreamS3DestinationConfigurationCompressionFormat compressionFormat) {
            this.compressionFormat = compressionFormat;
            return this;
        }

        public Builder setEncryptionConfiguration(@Nullable DeliveryStreamEncryptionConfiguration encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder setErrorOutputPrefix(@Nullable String errorOutputPrefix) {
            this.errorOutputPrefix = errorOutputPrefix;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setRoleARN(String roleARN) {
            this.roleARN = Objects.requireNonNull(roleARN);
            return this;
        }
        public DeliveryStreamS3DestinationConfiguration build() {
            return new DeliveryStreamS3DestinationConfiguration(bucketARN, bufferingHints, cloudWatchLoggingOptions, compressionFormat, encryptionConfiguration, errorOutputPrefix, prefix, roleARN);
        }
    }
}
