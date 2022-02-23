// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mwaa.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentLoggingConfigurationDagProcessingLogsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentLoggingConfigurationDagProcessingLogsGetArgs Empty = new EnvironmentLoggingConfigurationDagProcessingLogsGetArgs();

    @InputImport(name="cloudWatchLogGroupArn")
    private final @Nullable Input<String> cloudWatchLogGroupArn;

    public Input<String> getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn == null ? Input.empty() : this.cloudWatchLogGroupArn;
    }

    /**
     * Enabling or disabling the collection of logs
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Logging level. Valid values: `CRITICAL`, `ERROR`, `WARNING`, `INFO`, `DEBUG`. Will be `INFO` by default.
     * 
     */
    @InputImport(name="logLevel")
    private final @Nullable Input<String> logLevel;

    public Input<String> getLogLevel() {
        return this.logLevel == null ? Input.empty() : this.logLevel;
    }

    public EnvironmentLoggingConfigurationDagProcessingLogsGetArgs(
        @Nullable Input<String> cloudWatchLogGroupArn,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> logLevel) {
        this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
        this.enabled = enabled;
        this.logLevel = logLevel;
    }

    private EnvironmentLoggingConfigurationDagProcessingLogsGetArgs() {
        this.cloudWatchLogGroupArn = Input.empty();
        this.enabled = Input.empty();
        this.logLevel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentLoggingConfigurationDagProcessingLogsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cloudWatchLogGroupArn;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> logLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentLoggingConfigurationDagProcessingLogsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchLogGroupArn = defaults.cloudWatchLogGroupArn;
    	      this.enabled = defaults.enabled;
    	      this.logLevel = defaults.logLevel;
        }

        public Builder setCloudWatchLogGroupArn(@Nullable Input<String> cloudWatchLogGroupArn) {
            this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
            return this;
        }

        public Builder setCloudWatchLogGroupArn(@Nullable String cloudWatchLogGroupArn) {
            this.cloudWatchLogGroupArn = Input.ofNullable(cloudWatchLogGroupArn);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setLogLevel(@Nullable Input<String> logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public Builder setLogLevel(@Nullable String logLevel) {
            this.logLevel = Input.ofNullable(logLevel);
            return this;
        }
        public EnvironmentLoggingConfigurationDagProcessingLogsGetArgs build() {
            return new EnvironmentLoggingConfigurationDagProcessingLogsGetArgs(cloudWatchLogGroupArn, enabled, logLevel);
        }
    }
}
