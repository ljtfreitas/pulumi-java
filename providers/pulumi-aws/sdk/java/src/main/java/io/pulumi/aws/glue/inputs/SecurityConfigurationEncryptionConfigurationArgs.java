// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionArgs;
import io.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionArgs;
import io.pulumi.aws.glue.inputs.SecurityConfigurationEncryptionConfigurationS3EncryptionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


public final class SecurityConfigurationEncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityConfigurationEncryptionConfigurationArgs Empty = new SecurityConfigurationEncryptionConfigurationArgs();

    @Import(name="cloudwatchEncryption", required=true)
      private final Output<SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionArgs> cloudwatchEncryption;

    public Output<SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionArgs> getCloudwatchEncryption() {
        return this.cloudwatchEncryption;
    }

    @Import(name="jobBookmarksEncryption", required=true)
      private final Output<SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionArgs> jobBookmarksEncryption;

    public Output<SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionArgs> getJobBookmarksEncryption() {
        return this.jobBookmarksEncryption;
    }

    /**
     * A ` s3_encryption  ` block as described below, which contains encryption configuration for S3 data.
     * 
     */
    @Import(name="s3Encryption", required=true)
      private final Output<SecurityConfigurationEncryptionConfigurationS3EncryptionArgs> s3Encryption;

    public Output<SecurityConfigurationEncryptionConfigurationS3EncryptionArgs> getS3Encryption() {
        return this.s3Encryption;
    }

    public SecurityConfigurationEncryptionConfigurationArgs(
        Output<SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionArgs> cloudwatchEncryption,
        Output<SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionArgs> jobBookmarksEncryption,
        Output<SecurityConfigurationEncryptionConfigurationS3EncryptionArgs> s3Encryption) {
        this.cloudwatchEncryption = Objects.requireNonNull(cloudwatchEncryption, "expected parameter 'cloudwatchEncryption' to be non-null");
        this.jobBookmarksEncryption = Objects.requireNonNull(jobBookmarksEncryption, "expected parameter 'jobBookmarksEncryption' to be non-null");
        this.s3Encryption = Objects.requireNonNull(s3Encryption, "expected parameter 's3Encryption' to be non-null");
    }

    private SecurityConfigurationEncryptionConfigurationArgs() {
        this.cloudwatchEncryption = Output.empty();
        this.jobBookmarksEncryption = Output.empty();
        this.s3Encryption = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityConfigurationEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionArgs> cloudwatchEncryption;
        private Output<SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionArgs> jobBookmarksEncryption;
        private Output<SecurityConfigurationEncryptionConfigurationS3EncryptionArgs> s3Encryption;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityConfigurationEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchEncryption = defaults.cloudwatchEncryption;
    	      this.jobBookmarksEncryption = defaults.jobBookmarksEncryption;
    	      this.s3Encryption = defaults.s3Encryption;
        }

        public Builder cloudwatchEncryption(Output<SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionArgs> cloudwatchEncryption) {
            this.cloudwatchEncryption = Objects.requireNonNull(cloudwatchEncryption);
            return this;
        }

        public Builder cloudwatchEncryption(SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionArgs cloudwatchEncryption) {
            this.cloudwatchEncryption = Output.of(Objects.requireNonNull(cloudwatchEncryption));
            return this;
        }

        public Builder jobBookmarksEncryption(Output<SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionArgs> jobBookmarksEncryption) {
            this.jobBookmarksEncryption = Objects.requireNonNull(jobBookmarksEncryption);
            return this;
        }

        public Builder jobBookmarksEncryption(SecurityConfigurationEncryptionConfigurationJobBookmarksEncryptionArgs jobBookmarksEncryption) {
            this.jobBookmarksEncryption = Output.of(Objects.requireNonNull(jobBookmarksEncryption));
            return this;
        }

        public Builder s3Encryption(Output<SecurityConfigurationEncryptionConfigurationS3EncryptionArgs> s3Encryption) {
            this.s3Encryption = Objects.requireNonNull(s3Encryption);
            return this;
        }

        public Builder s3Encryption(SecurityConfigurationEncryptionConfigurationS3EncryptionArgs s3Encryption) {
            this.s3Encryption = Output.of(Objects.requireNonNull(s3Encryption));
            return this;
        }
        public SecurityConfigurationEncryptionConfigurationArgs build() {
            return new SecurityConfigurationEncryptionConfigurationArgs(cloudwatchEncryption, jobBookmarksEncryption, s3Encryption);
        }
    }
}
