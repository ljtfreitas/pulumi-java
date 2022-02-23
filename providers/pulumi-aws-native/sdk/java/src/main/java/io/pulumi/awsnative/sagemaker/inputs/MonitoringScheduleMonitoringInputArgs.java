// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.MonitoringScheduleEndpointInputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * The inputs for a monitoring job.
 * 
 */
public final class MonitoringScheduleMonitoringInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitoringScheduleMonitoringInputArgs Empty = new MonitoringScheduleMonitoringInputArgs();

    @InputImport(name="endpointInput", required=true)
        private final Input<MonitoringScheduleEndpointInputArgs> endpointInput;

    public Input<MonitoringScheduleEndpointInputArgs> getEndpointInput() {
        return this.endpointInput;
    }

    public MonitoringScheduleMonitoringInputArgs(Input<MonitoringScheduleEndpointInputArgs> endpointInput) {
        this.endpointInput = Objects.requireNonNull(endpointInput, "expected parameter 'endpointInput' to be non-null");
    }

    private MonitoringScheduleMonitoringInputArgs() {
        this.endpointInput = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleMonitoringInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<MonitoringScheduleEndpointInputArgs> endpointInput;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleMonitoringInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointInput = defaults.endpointInput;
        }

        public Builder setEndpointInput(Input<MonitoringScheduleEndpointInputArgs> endpointInput) {
            this.endpointInput = Objects.requireNonNull(endpointInput);
            return this;
        }

        public Builder setEndpointInput(MonitoringScheduleEndpointInputArgs endpointInput) {
            this.endpointInput = Input.of(Objects.requireNonNull(endpointInput));
            return this;
        }
        public MonitoringScheduleMonitoringInputArgs build() {
            return new MonitoringScheduleMonitoringInputArgs(endpointInput);
        }
    }
}
