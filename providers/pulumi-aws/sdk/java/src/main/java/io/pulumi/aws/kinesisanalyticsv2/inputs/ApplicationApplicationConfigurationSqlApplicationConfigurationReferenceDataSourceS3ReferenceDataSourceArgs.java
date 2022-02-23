// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs();

    /**
     * The ARN for the S3 bucket containing the application code.
     * 
     */
    @InputImport(name="bucketArn", required=true)
    private final Input<String> bucketArn;

    public Input<String> getBucketArn() {
        return this.bucketArn;
    }

    /**
     * The file key for the object containing the application code.
     * 
     */
    @InputImport(name="fileKey", required=true)
    private final Input<String> fileKey;

    public Input<String> getFileKey() {
        return this.fileKey;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs(
        Input<String> bucketArn,
        Input<String> fileKey) {
        this.bucketArn = Objects.requireNonNull(bucketArn, "expected parameter 'bucketArn' to be non-null");
        this.fileKey = Objects.requireNonNull(fileKey, "expected parameter 'fileKey' to be non-null");
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs() {
        this.bucketArn = Input.empty();
        this.fileKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucketArn;
        private Input<String> fileKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketArn = defaults.bucketArn;
    	      this.fileKey = defaults.fileKey;
        }

        public Builder setBucketArn(Input<String> bucketArn) {
            this.bucketArn = Objects.requireNonNull(bucketArn);
            return this;
        }

        public Builder setBucketArn(String bucketArn) {
            this.bucketArn = Input.of(Objects.requireNonNull(bucketArn));
            return this;
        }

        public Builder setFileKey(Input<String> fileKey) {
            this.fileKey = Objects.requireNonNull(fileKey);
            return this;
        }

        public Builder setFileKey(String fileKey) {
            this.fileKey = Input.of(Objects.requireNonNull(fileKey));
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceArgs(bucketArn, fileKey);
        }
    }
}