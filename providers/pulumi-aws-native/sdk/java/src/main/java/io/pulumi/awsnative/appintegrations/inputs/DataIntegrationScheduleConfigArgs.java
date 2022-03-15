// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appintegrations.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DataIntegrationScheduleConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataIntegrationScheduleConfigArgs Empty = new DataIntegrationScheduleConfigArgs();

    /**
     * The start date for objects to import in the first flow run. Epoch or ISO timestamp format is supported.
     * 
     */
    @Import(name="firstExecutionFrom", required=true)
      private final Output<String> firstExecutionFrom;

    public Output<String> getFirstExecutionFrom() {
        return this.firstExecutionFrom;
    }

    /**
     * The name of the object to pull from the data source.
     * 
     */
    @Import(name="object", required=true)
      private final Output<String> object;

    public Output<String> getObject() {
        return this.object;
    }

    /**
     * How often the data should be pulled from data source.
     * 
     */
    @Import(name="scheduleExpression", required=true)
      private final Output<String> scheduleExpression;

    public Output<String> getScheduleExpression() {
        return this.scheduleExpression;
    }

    public DataIntegrationScheduleConfigArgs(
        Output<String> firstExecutionFrom,
        Output<String> object,
        Output<String> scheduleExpression) {
        this.firstExecutionFrom = Objects.requireNonNull(firstExecutionFrom, "expected parameter 'firstExecutionFrom' to be non-null");
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
        this.scheduleExpression = Objects.requireNonNull(scheduleExpression, "expected parameter 'scheduleExpression' to be non-null");
    }

    private DataIntegrationScheduleConfigArgs() {
        this.firstExecutionFrom = Output.empty();
        this.object = Output.empty();
        this.scheduleExpression = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataIntegrationScheduleConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> firstExecutionFrom;
        private Output<String> object;
        private Output<String> scheduleExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(DataIntegrationScheduleConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firstExecutionFrom = defaults.firstExecutionFrom;
    	      this.object = defaults.object;
    	      this.scheduleExpression = defaults.scheduleExpression;
        }

        public Builder firstExecutionFrom(Output<String> firstExecutionFrom) {
            this.firstExecutionFrom = Objects.requireNonNull(firstExecutionFrom);
            return this;
        }

        public Builder firstExecutionFrom(String firstExecutionFrom) {
            this.firstExecutionFrom = Output.of(Objects.requireNonNull(firstExecutionFrom));
            return this;
        }

        public Builder object(Output<String> object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public Builder object(String object) {
            this.object = Output.of(Objects.requireNonNull(object));
            return this;
        }

        public Builder scheduleExpression(Output<String> scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }

        public Builder scheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Output.of(Objects.requireNonNull(scheduleExpression));
            return this;
        }
        public DataIntegrationScheduleConfigArgs build() {
            return new DataIntegrationScheduleConfigArgs(firstExecutionFrom, object, scheduleExpression);
        }
    }
}
