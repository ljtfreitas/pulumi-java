// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs Empty = new FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs();

    /**
     * Enables or disables the logging. Defaults to `false`.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The CloudWatch group name for logging. This value is required if `enabled` is true.
     * 
     */
    @InputImport(name="logGroupName")
    private final @Nullable Input<String> logGroupName;

    public Input<String> getLogGroupName() {
        return this.logGroupName == null ? Input.empty() : this.logGroupName;
    }

    /**
     * The CloudWatch log stream name for logging. This value is required if `enabled` is true.
     * 
     */
    @InputImport(name="logStreamName")
    private final @Nullable Input<String> logStreamName;

    public Input<String> getLogStreamName() {
        return this.logStreamName == null ? Input.empty() : this.logStreamName;
    }

    public FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> logGroupName,
        @Nullable Input<String> logStreamName) {
        this.enabled = enabled;
        this.logGroupName = logGroupName;
        this.logStreamName = logStreamName;
    }

    private FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs() {
        this.enabled = Input.empty();
        this.logGroupName = Input.empty();
        this.logStreamName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> logGroupName;
        private @Nullable Input<String> logStreamName;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logGroupName = defaults.logGroupName;
    	      this.logStreamName = defaults.logStreamName;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setLogGroupName(@Nullable Input<String> logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }

        public Builder setLogGroupName(@Nullable String logGroupName) {
            this.logGroupName = Input.ofNullable(logGroupName);
            return this;
        }

        public Builder setLogStreamName(@Nullable Input<String> logStreamName) {
            this.logStreamName = logStreamName;
            return this;
        }

        public Builder setLogStreamName(@Nullable String logStreamName) {
            this.logStreamName = Input.ofNullable(logStreamName);
            return this;
        }
        public FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs build() {
            return new FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs(enabled, logGroupName, logStreamName);
        }
    }
}
