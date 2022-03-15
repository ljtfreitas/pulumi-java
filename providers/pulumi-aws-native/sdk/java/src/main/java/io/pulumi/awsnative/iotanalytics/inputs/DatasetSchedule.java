// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DatasetSchedule extends io.pulumi.resources.InvokeArgs {

    public static final DatasetSchedule Empty = new DatasetSchedule();

    @Import(name="scheduleExpression", required=true)
      private final String scheduleExpression;

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    public DatasetSchedule(String scheduleExpression) {
        this.scheduleExpression = Objects.requireNonNull(scheduleExpression, "expected parameter 'scheduleExpression' to be non-null");
    }

    private DatasetSchedule() {
        this.scheduleExpression = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scheduleExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduleExpression = defaults.scheduleExpression;
        }

        public Builder scheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }
        public DatasetSchedule build() {
            return new DatasetSchedule(scheduleExpression);
        }
    }
}
