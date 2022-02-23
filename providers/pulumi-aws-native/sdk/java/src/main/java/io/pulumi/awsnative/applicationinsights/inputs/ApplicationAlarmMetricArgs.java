// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A metric to be monitored for the component.
 * 
 */
public final class ApplicationAlarmMetricArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationAlarmMetricArgs Empty = new ApplicationAlarmMetricArgs();

    /**
     * The name of the metric to be monitored for the component.
     * 
     */
    @InputImport(name="alarmMetricName", required=true)
        private final Input<String> alarmMetricName;

    public Input<String> getAlarmMetricName() {
        return this.alarmMetricName;
    }

    public ApplicationAlarmMetricArgs(Input<String> alarmMetricName) {
        this.alarmMetricName = Objects.requireNonNull(alarmMetricName, "expected parameter 'alarmMetricName' to be non-null");
    }

    private ApplicationAlarmMetricArgs() {
        this.alarmMetricName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationAlarmMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> alarmMetricName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationAlarmMetricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmMetricName = defaults.alarmMetricName;
        }

        public Builder setAlarmMetricName(Input<String> alarmMetricName) {
            this.alarmMetricName = Objects.requireNonNull(alarmMetricName);
            return this;
        }

        public Builder setAlarmMetricName(String alarmMetricName) {
            this.alarmMetricName = Input.of(Objects.requireNonNull(alarmMetricName));
            return this;
        }
        public ApplicationAlarmMetricArgs build() {
            return new ApplicationAlarmMetricArgs(alarmMetricName);
        }
    }
}
