// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetInfrastructureConfigurationLoggingS3Log extends io.pulumi.resources.InvokeArgs {

    public static final GetInfrastructureConfigurationLoggingS3Log Empty = new GetInfrastructureConfigurationLoggingS3Log();

    /**
     * Name of the S3 Bucket for logging.
     * 
     */
    @InputImport(name="s3BucketName", required=true)
    private final String s3BucketName;

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * Key prefix for S3 Bucket logging.
     * 
     */
    @InputImport(name="s3KeyPrefix", required=true)
    private final String s3KeyPrefix;

    public String getS3KeyPrefix() {
        return this.s3KeyPrefix;
    }

    public GetInfrastructureConfigurationLoggingS3Log(
        String s3BucketName,
        String s3KeyPrefix) {
        this.s3BucketName = Objects.requireNonNull(s3BucketName, "expected parameter 's3BucketName' to be non-null");
        this.s3KeyPrefix = Objects.requireNonNull(s3KeyPrefix, "expected parameter 's3KeyPrefix' to be non-null");
    }

    private GetInfrastructureConfigurationLoggingS3Log() {
        this.s3BucketName = null;
        this.s3KeyPrefix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInfrastructureConfigurationLoggingS3Log defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String s3BucketName;
        private String s3KeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInfrastructureConfigurationLoggingS3Log defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        public Builder setS3BucketName(String s3BucketName) {
            this.s3BucketName = Objects.requireNonNull(s3BucketName);
            return this;
        }

        public Builder setS3KeyPrefix(String s3KeyPrefix) {
            this.s3KeyPrefix = Objects.requireNonNull(s3KeyPrefix);
            return this;
        }
        public GetInfrastructureConfigurationLoggingS3Log build() {
            return new GetInfrastructureConfigurationLoggingS3Log(s3BucketName, s3KeyPrefix);
        }
    }
}