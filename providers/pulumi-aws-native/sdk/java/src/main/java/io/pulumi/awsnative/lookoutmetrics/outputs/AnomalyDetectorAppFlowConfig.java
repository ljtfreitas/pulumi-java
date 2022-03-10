// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AnomalyDetectorAppFlowConfig {
    private final String flowName;
    private final String roleArn;

    @OutputCustomType.Constructor
    private AnomalyDetectorAppFlowConfig(
        @OutputCustomType.Parameter("flowName") String flowName,
        @OutputCustomType.Parameter("roleArn") String roleArn) {
        this.flowName = flowName;
        this.roleArn = roleArn;
    }

    public String getFlowName() {
        return this.flowName;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorAppFlowConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String flowName;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorAppFlowConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flowName = defaults.flowName;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setFlowName(String flowName) {
            this.flowName = Objects.requireNonNull(flowName);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public AnomalyDetectorAppFlowConfig build() {
            return new AnomalyDetectorAppFlowConfig(flowName, roleArn);
        }
    }
}
