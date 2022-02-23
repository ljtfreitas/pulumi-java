// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mwaa.inputs;

import io.pulumi.awsnative.mwaa.enums.EnvironmentLoggingLevel;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Logging configuration for a specific airflow component.
 * 
 */
public final class EnvironmentModuleLoggingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentModuleLoggingConfigurationArgs Empty = new EnvironmentModuleLoggingConfigurationArgs();

    @InputImport(name="cloudWatchLogGroupArn")
        private final @Nullable Input<String> cloudWatchLogGroupArn;

    public Input<String> getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn == null ? Input.empty() : this.cloudWatchLogGroupArn;
    }

    @InputImport(name="enabled")
        private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    @InputImport(name="logLevel")
        private final @Nullable Input<EnvironmentLoggingLevel> logLevel;

    public Input<EnvironmentLoggingLevel> getLogLevel() {
        return this.logLevel == null ? Input.empty() : this.logLevel;
    }

    public EnvironmentModuleLoggingConfigurationArgs(
        @Nullable Input<String> cloudWatchLogGroupArn,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<EnvironmentLoggingLevel> logLevel) {
        this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
        this.enabled = enabled;
        this.logLevel = logLevel;
    }

    private EnvironmentModuleLoggingConfigurationArgs() {
        this.cloudWatchLogGroupArn = Input.empty();
        this.enabled = Input.empty();
        this.logLevel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentModuleLoggingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cloudWatchLogGroupArn;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<EnvironmentLoggingLevel> logLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentModuleLoggingConfigurationArgs defaults) {
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

        public Builder setLogLevel(@Nullable Input<EnvironmentLoggingLevel> logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public Builder setLogLevel(@Nullable EnvironmentLoggingLevel logLevel) {
            this.logLevel = Input.ofNullable(logLevel);
            return this;
        }
        public EnvironmentModuleLoggingConfigurationArgs build() {
            return new EnvironmentModuleLoggingConfigurationArgs(cloudWatchLogGroupArn, enabled, logLevel);
        }
    }
}
