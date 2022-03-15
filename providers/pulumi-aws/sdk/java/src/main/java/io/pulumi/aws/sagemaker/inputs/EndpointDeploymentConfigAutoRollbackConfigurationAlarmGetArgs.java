// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EndpointDeploymentConfigAutoRollbackConfigurationAlarmGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointDeploymentConfigAutoRollbackConfigurationAlarmGetArgs Empty = new EndpointDeploymentConfigAutoRollbackConfigurationAlarmGetArgs();

    /**
     * The name of a CloudWatch alarm in your account.
     * 
     */
    @Import(name="alarmName", required=true)
      private final Output<String> alarmName;

    public Output<String> getAlarmName() {
        return this.alarmName;
    }

    public EndpointDeploymentConfigAutoRollbackConfigurationAlarmGetArgs(Output<String> alarmName) {
        this.alarmName = Objects.requireNonNull(alarmName, "expected parameter 'alarmName' to be non-null");
    }

    private EndpointDeploymentConfigAutoRollbackConfigurationAlarmGetArgs() {
        this.alarmName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeploymentConfigAutoRollbackConfigurationAlarmGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> alarmName;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointDeploymentConfigAutoRollbackConfigurationAlarmGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmName = defaults.alarmName;
        }

        public Builder alarmName(Output<String> alarmName) {
            this.alarmName = Objects.requireNonNull(alarmName);
            return this;
        }

        public Builder alarmName(String alarmName) {
            this.alarmName = Output.of(Objects.requireNonNull(alarmName));
            return this;
        }
        public EndpointDeploymentConfigAutoRollbackConfigurationAlarmGetArgs build() {
            return new EndpointDeploymentConfigAutoRollbackConfigurationAlarmGetArgs(alarmName);
        }
    }
}
