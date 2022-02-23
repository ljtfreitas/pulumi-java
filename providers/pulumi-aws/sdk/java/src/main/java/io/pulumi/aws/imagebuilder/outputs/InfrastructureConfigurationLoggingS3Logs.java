// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InfrastructureConfigurationLoggingS3Logs {
    /**
     * Name of the S3 Bucket.
     * 
     */
    private final String s3BucketName;
    /**
     * Prefix to use for S3 logs. Defaults to `/`.
     * 
     */
    private final @Nullable String s3KeyPrefix;

    @OutputCustomType.Constructor({"s3BucketName","s3KeyPrefix"})
    private InfrastructureConfigurationLoggingS3Logs(
        String s3BucketName,
        @Nullable String s3KeyPrefix) {
        this.s3BucketName = Objects.requireNonNull(s3BucketName);
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * Name of the S3 Bucket.
     * 
     */
    public String getS3BucketName() {
        return this.s3BucketName;
    }
    /**
     * Prefix to use for S3 logs. Defaults to `/`.
     * 
     */
    public Optional<String> getS3KeyPrefix() {
        return Optional.ofNullable(this.s3KeyPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InfrastructureConfigurationLoggingS3Logs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String s3BucketName;
        private @Nullable String s3KeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(InfrastructureConfigurationLoggingS3Logs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        public Builder setS3BucketName(String s3BucketName) {
            this.s3BucketName = Objects.requireNonNull(s3BucketName);
            return this;
        }

        public Builder setS3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }
        public InfrastructureConfigurationLoggingS3Logs build() {
            return new InfrastructureConfigurationLoggingS3Logs(s3BucketName, s3KeyPrefix);
        }
    }
}