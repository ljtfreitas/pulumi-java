// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EndpointDeploymentConfigAutoRollbackConfigurationAlarm {
    /**
     * The name of a CloudWatch alarm in your account.
     * 
     */
    private final String alarmName;

    @CustomType.Constructor
    private EndpointDeploymentConfigAutoRollbackConfigurationAlarm(@CustomType.Parameter("alarmName") String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * The name of a CloudWatch alarm in your account.
     * 
    */
    public String getAlarmName() {
        return this.alarmName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeploymentConfigAutoRollbackConfigurationAlarm defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alarmName;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointDeploymentConfigAutoRollbackConfigurationAlarm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmName = defaults.alarmName;
        }

        public Builder alarmName(String alarmName) {
            this.alarmName = Objects.requireNonNull(alarmName);
            return this;
        }
        public EndpointDeploymentConfigAutoRollbackConfigurationAlarm build() {
            return new EndpointDeploymentConfigAutoRollbackConfigurationAlarm(alarmName);
        }
    }
}
