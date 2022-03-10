// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.MonitoringScheduleS3Output;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class MonitoringScheduleMonitoringOutput {
    private final MonitoringScheduleS3Output s3Output;

    @OutputCustomType.Constructor
    private MonitoringScheduleMonitoringOutput(@OutputCustomType.Parameter("s3Output") MonitoringScheduleS3Output s3Output) {
        this.s3Output = s3Output;
    }

    public MonitoringScheduleS3Output getS3Output() {
        return this.s3Output;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringScheduleMonitoringOutput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringScheduleS3Output s3Output;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringScheduleMonitoringOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Output = defaults.s3Output;
        }

        public Builder setS3Output(MonitoringScheduleS3Output s3Output) {
            this.s3Output = Objects.requireNonNull(s3Output);
            return this;
        }
        public MonitoringScheduleMonitoringOutput build() {
            return new MonitoringScheduleMonitoringOutput(s3Output);
        }
    }
}
