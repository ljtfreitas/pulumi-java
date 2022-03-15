// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigGetArgs Empty = new MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigGetArgs();

    /**
     * The name of the CloudWatch log group where you want to send command output. If you don't specify a group name, Systems Manager automatically creates a log group for you. The log group uses the following naming format: aws/ssm/SystemsManagerDocumentName.
     * 
     */
    @Import(name="cloudwatchLogGroupName")
      private final @Nullable Output<String> cloudwatchLogGroupName;

    public Output<String> getCloudwatchLogGroupName() {
        return this.cloudwatchLogGroupName == null ? Output.empty() : this.cloudwatchLogGroupName;
    }

    /**
     * Enables Systems Manager to send command output to CloudWatch Logs.
     * 
     */
    @Import(name="cloudwatchOutputEnabled")
      private final @Nullable Output<Boolean> cloudwatchOutputEnabled;

    public Output<Boolean> getCloudwatchOutputEnabled() {
        return this.cloudwatchOutputEnabled == null ? Output.empty() : this.cloudwatchOutputEnabled;
    }

    public MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigGetArgs(
        @Nullable Output<String> cloudwatchLogGroupName,
        @Nullable Output<Boolean> cloudwatchOutputEnabled) {
        this.cloudwatchLogGroupName = cloudwatchLogGroupName;
        this.cloudwatchOutputEnabled = cloudwatchOutputEnabled;
    }

    private MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigGetArgs() {
        this.cloudwatchLogGroupName = Output.empty();
        this.cloudwatchOutputEnabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cloudwatchLogGroupName;
        private @Nullable Output<Boolean> cloudwatchOutputEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchLogGroupName = defaults.cloudwatchLogGroupName;
    	      this.cloudwatchOutputEnabled = defaults.cloudwatchOutputEnabled;
        }

        public Builder cloudwatchLogGroupName(@Nullable Output<String> cloudwatchLogGroupName) {
            this.cloudwatchLogGroupName = cloudwatchLogGroupName;
            return this;
        }

        public Builder cloudwatchLogGroupName(@Nullable String cloudwatchLogGroupName) {
            this.cloudwatchLogGroupName = Output.ofNullable(cloudwatchLogGroupName);
            return this;
        }

        public Builder cloudwatchOutputEnabled(@Nullable Output<Boolean> cloudwatchOutputEnabled) {
            this.cloudwatchOutputEnabled = cloudwatchOutputEnabled;
            return this;
        }

        public Builder cloudwatchOutputEnabled(@Nullable Boolean cloudwatchOutputEnabled) {
            this.cloudwatchOutputEnabled = Output.ofNullable(cloudwatchOutputEnabled);
            return this;
        }
        public MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigGetArgs build() {
            return new MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfigGetArgs(cloudwatchLogGroupName, cloudwatchOutputEnabled);
        }
    }
}
