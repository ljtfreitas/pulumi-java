// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TopicRuleCloudwatchAlarmAction {
    private final String alarmName;
    private final String roleArn;
    private final String stateReason;
    private final String stateValue;

    @CustomType.Constructor
    private TopicRuleCloudwatchAlarmAction(
        @CustomType.Parameter("alarmName") String alarmName,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("stateReason") String stateReason,
        @CustomType.Parameter("stateValue") String stateValue) {
        this.alarmName = alarmName;
        this.roleArn = roleArn;
        this.stateReason = stateReason;
        this.stateValue = stateValue;
    }

    public String getAlarmName() {
        return this.alarmName;
    }
    public String getRoleArn() {
        return this.roleArn;
    }
    public String getStateReason() {
        return this.stateReason;
    }
    public String getStateValue() {
        return this.stateValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleCloudwatchAlarmAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alarmName;
        private String roleArn;
        private String stateReason;
        private String stateValue;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleCloudwatchAlarmAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmName = defaults.alarmName;
    	      this.roleArn = defaults.roleArn;
    	      this.stateReason = defaults.stateReason;
    	      this.stateValue = defaults.stateValue;
        }

        public Builder alarmName(String alarmName) {
            this.alarmName = Objects.requireNonNull(alarmName);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder stateReason(String stateReason) {
            this.stateReason = Objects.requireNonNull(stateReason);
            return this;
        }

        public Builder stateValue(String stateValue) {
            this.stateValue = Objects.requireNonNull(stateValue);
            return this;
        }
        public TopicRuleCloudwatchAlarmAction build() {
            return new TopicRuleCloudwatchAlarmAction(alarmName, roleArn, stateReason, stateValue);
        }
    }
}
