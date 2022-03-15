// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfig {
    /**
     * The name of the CloudWatch log group where you want to send command output. If you don't specify a group name, Systems Manager automatically creates a log group for you. The log group uses the following naming format: aws/ssm/SystemsManagerDocumentName.
     * 
     */
    private final @Nullable String cloudwatchLogGroupName;
    /**
     * Enables Systems Manager to send command output to CloudWatch Logs.
     * 
     */
    private final @Nullable Boolean cloudwatchOutputEnabled;

    @CustomType.Constructor
    private MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfig(
        @CustomType.Parameter("cloudwatchLogGroupName") @Nullable String cloudwatchLogGroupName,
        @CustomType.Parameter("cloudwatchOutputEnabled") @Nullable Boolean cloudwatchOutputEnabled) {
        this.cloudwatchLogGroupName = cloudwatchLogGroupName;
        this.cloudwatchOutputEnabled = cloudwatchOutputEnabled;
    }

    /**
     * The name of the CloudWatch log group where you want to send command output. If you don't specify a group name, Systems Manager automatically creates a log group for you. The log group uses the following naming format: aws/ssm/SystemsManagerDocumentName.
     * 
    */
    public Optional<String> getCloudwatchLogGroupName() {
        return Optional.ofNullable(this.cloudwatchLogGroupName);
    }
    /**
     * Enables Systems Manager to send command output to CloudWatch Logs.
     * 
    */
    public Optional<Boolean> getCloudwatchOutputEnabled() {
        return Optional.ofNullable(this.cloudwatchOutputEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cloudwatchLogGroupName;
        private @Nullable Boolean cloudwatchOutputEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLogGroupName = defaults.cloudwatchLogGroupName;
    	      this.cloudwatchOutputEnabled = defaults.cloudwatchOutputEnabled;
        }

        public Builder cloudwatchLogGroupName(@Nullable String cloudwatchLogGroupName) {
            this.cloudwatchLogGroupName = cloudwatchLogGroupName;
            return this;
        }

        public Builder cloudwatchOutputEnabled(@Nullable Boolean cloudwatchOutputEnabled) {
            this.cloudwatchOutputEnabled = cloudwatchOutputEnabled;
            return this;
        }
        public MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfig build() {
            return new MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfig(cloudwatchLogGroupName, cloudwatchOutputEnabled);
        }
    }
}
