// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs Empty = new ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs();

    /**
     * Whether or not to enable encryption on the CloudWatch logs. If not specified, encryption will be disabled.
     * 
     */
    @Import(name="cloudWatchEncryptionEnabled")
      private final @Nullable Output<Boolean> cloudWatchEncryptionEnabled;

    public Output<Boolean> getCloudWatchEncryptionEnabled() {
        return this.cloudWatchEncryptionEnabled == null ? Output.empty() : this.cloudWatchEncryptionEnabled;
    }

    /**
     * The name of the CloudWatch log group to send logs to.
     * 
     */
    @Import(name="cloudWatchLogGroupName")
      private final @Nullable Output<String> cloudWatchLogGroupName;

    public Output<String> getCloudWatchLogGroupName() {
        return this.cloudWatchLogGroupName == null ? Output.empty() : this.cloudWatchLogGroupName;
    }

    /**
     * Whether or not to enable encryption on the logs sent to S3. If not specified, encryption will be disabled.
     * 
     */
    @Import(name="s3BucketEncryptionEnabled")
      private final @Nullable Output<Boolean> s3BucketEncryptionEnabled;

    public Output<Boolean> getS3BucketEncryptionEnabled() {
        return this.s3BucketEncryptionEnabled == null ? Output.empty() : this.s3BucketEncryptionEnabled;
    }

    /**
     * The name of the S3 bucket to send logs to.
     * 
     */
    @Import(name="s3BucketName")
      private final @Nullable Output<String> s3BucketName;

    public Output<String> getS3BucketName() {
        return this.s3BucketName == null ? Output.empty() : this.s3BucketName;
    }

    /**
     * An optional folder in the S3 bucket to place logs in.
     * 
     */
    @Import(name="s3KeyPrefix")
      private final @Nullable Output<String> s3KeyPrefix;

    public Output<String> getS3KeyPrefix() {
        return this.s3KeyPrefix == null ? Output.empty() : this.s3KeyPrefix;
    }

    public ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs(
        @Nullable Output<Boolean> cloudWatchEncryptionEnabled,
        @Nullable Output<String> cloudWatchLogGroupName,
        @Nullable Output<Boolean> s3BucketEncryptionEnabled,
        @Nullable Output<String> s3BucketName,
        @Nullable Output<String> s3KeyPrefix) {
        this.cloudWatchEncryptionEnabled = cloudWatchEncryptionEnabled;
        this.cloudWatchLogGroupName = cloudWatchLogGroupName;
        this.s3BucketEncryptionEnabled = s3BucketEncryptionEnabled;
        this.s3BucketName = s3BucketName;
        this.s3KeyPrefix = s3KeyPrefix;
    }

    private ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs() {
        this.cloudWatchEncryptionEnabled = Output.empty();
        this.cloudWatchLogGroupName = Output.empty();
        this.s3BucketEncryptionEnabled = Output.empty();
        this.s3BucketName = Output.empty();
        this.s3KeyPrefix = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> cloudWatchEncryptionEnabled;
        private @Nullable Output<String> cloudWatchLogGroupName;
        private @Nullable Output<Boolean> s3BucketEncryptionEnabled;
        private @Nullable Output<String> s3BucketName;
        private @Nullable Output<String> s3KeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchEncryptionEnabled = defaults.cloudWatchEncryptionEnabled;
    	      this.cloudWatchLogGroupName = defaults.cloudWatchLogGroupName;
    	      this.s3BucketEncryptionEnabled = defaults.s3BucketEncryptionEnabled;
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        public Builder cloudWatchEncryptionEnabled(@Nullable Output<Boolean> cloudWatchEncryptionEnabled) {
            this.cloudWatchEncryptionEnabled = cloudWatchEncryptionEnabled;
            return this;
        }

        public Builder cloudWatchEncryptionEnabled(@Nullable Boolean cloudWatchEncryptionEnabled) {
            this.cloudWatchEncryptionEnabled = Output.ofNullable(cloudWatchEncryptionEnabled);
            return this;
        }

        public Builder cloudWatchLogGroupName(@Nullable Output<String> cloudWatchLogGroupName) {
            this.cloudWatchLogGroupName = cloudWatchLogGroupName;
            return this;
        }

        public Builder cloudWatchLogGroupName(@Nullable String cloudWatchLogGroupName) {
            this.cloudWatchLogGroupName = Output.ofNullable(cloudWatchLogGroupName);
            return this;
        }

        public Builder s3BucketEncryptionEnabled(@Nullable Output<Boolean> s3BucketEncryptionEnabled) {
            this.s3BucketEncryptionEnabled = s3BucketEncryptionEnabled;
            return this;
        }

        public Builder s3BucketEncryptionEnabled(@Nullable Boolean s3BucketEncryptionEnabled) {
            this.s3BucketEncryptionEnabled = Output.ofNullable(s3BucketEncryptionEnabled);
            return this;
        }

        public Builder s3BucketName(@Nullable Output<String> s3BucketName) {
            this.s3BucketName = s3BucketName;
            return this;
        }

        public Builder s3BucketName(@Nullable String s3BucketName) {
            this.s3BucketName = Output.ofNullable(s3BucketName);
            return this;
        }

        public Builder s3KeyPrefix(@Nullable Output<String> s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }

        public Builder s3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = Output.ofNullable(s3KeyPrefix);
            return this;
        }
        public ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs build() {
            return new ClusterConfigurationExecuteCommandConfigurationLogConfigurationArgs(cloudWatchEncryptionEnabled, cloudWatchLogGroupName, s3BucketEncryptionEnabled, s3BucketName, s3KeyPrefix);
        }
    }
}
