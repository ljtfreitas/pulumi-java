// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleEndpointInput;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class MonitoringScheduleMonitoringInput {
    private final MonitoringScheduleEndpointInput endpointInput;

    @OutputCustomType.Constructor({"endpointInput"})
    private MonitoringScheduleMonitoringInput(MonitoringScheduleEndpointInput endpointInput) {
        this.endpointInput = Objects.requireNonNull(endpointInput);
    }

    public MonitoringScheduleEndpointInput getEndpointInput() {
        return this.endpointInput;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleMonitoringInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringScheduleEndpointInput endpointInput;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleMonitoringInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointInput = defaults.endpointInput;
        }

        public Builder setEndpointInput(MonitoringScheduleEndpointInput endpointInput) {
            this.endpointInput = Objects.requireNonNull(endpointInput);
            return this;
        }
        public MonitoringScheduleMonitoringInput build() {
            return new MonitoringScheduleMonitoringInput(endpointInput);
        }
    }
}
