// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mwaa.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentLoggingConfigurationSchedulerLogsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentLoggingConfigurationSchedulerLogsArgs Empty = new EnvironmentLoggingConfigurationSchedulerLogsArgs();

    @Import(name="cloudWatchLogGroupArn")
      private final @Nullable Output<String> cloudWatchLogGroupArn;

    public Output<String> getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn == null ? Output.empty() : this.cloudWatchLogGroupArn;
    }

    /**
     * Enabling or disabling the collection of logs
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * Logging level. Valid values: `CRITICAL`, `ERROR`, `WARNING`, `INFO`, `DEBUG`. Will be `INFO` by default.
     * 
     */
    @Import(name="logLevel")
      private final @Nullable Output<String> logLevel;

    public Output<String> getLogLevel() {
        return this.logLevel == null ? Output.empty() : this.logLevel;
    }

    public EnvironmentLoggingConfigurationSchedulerLogsArgs(
        @Nullable Output<String> cloudWatchLogGroupArn,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> logLevel) {
        this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
        this.enabled = enabled;
        this.logLevel = logLevel;
    }

    private EnvironmentLoggingConfigurationSchedulerLogsArgs() {
        this.cloudWatchLogGroupArn = Output.empty();
        this.enabled = Output.empty();
        this.logLevel = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentLoggingConfigurationSchedulerLogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cloudWatchLogGroupArn;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> logLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentLoggingConfigurationSchedulerLogsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchLogGroupArn = defaults.cloudWatchLogGroupArn;
    	      this.enabled = defaults.enabled;
    	      this.logLevel = defaults.logLevel;
        }

        public Builder cloudWatchLogGroupArn(@Nullable Output<String> cloudWatchLogGroupArn) {
            this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
            return this;
        }

        public Builder cloudWatchLogGroupArn(@Nullable String cloudWatchLogGroupArn) {
            this.cloudWatchLogGroupArn = Output.ofNullable(cloudWatchLogGroupArn);
            return this;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }

        public Builder logLevel(@Nullable Output<String> logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public Builder logLevel(@Nullable String logLevel) {
            this.logLevel = Output.ofNullable(logLevel);
            return this;
        }
        public EnvironmentLoggingConfigurationSchedulerLogsArgs build() {
            return new EnvironmentLoggingConfigurationSchedulerLogsArgs(cloudWatchLogGroupArn, enabled, logLevel);
        }
    }
}
