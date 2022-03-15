// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetImagePipelineSchedule {
    /**
     * Condition when the pipeline should trigger a new image build.
     * 
     */
    private final String pipelineExecutionStartCondition;
    /**
     * Cron expression of how often the pipeline start condition is evaluated.
     * 
     */
    private final String scheduleExpression;

    @CustomType.Constructor
    private GetImagePipelineSchedule(
        @CustomType.Parameter("pipelineExecutionStartCondition") String pipelineExecutionStartCondition,
        @CustomType.Parameter("scheduleExpression") String scheduleExpression) {
        this.pipelineExecutionStartCondition = pipelineExecutionStartCondition;
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * Condition when the pipeline should trigger a new image build.
     * 
    */
    public String getPipelineExecutionStartCondition() {
        return this.pipelineExecutionStartCondition;
    }
    /**
     * Cron expression of how often the pipeline start condition is evaluated.
     * 
    */
    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagePipelineSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pipelineExecutionStartCondition;
        private String scheduleExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImagePipelineSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pipelineExecutionStartCondition = defaults.pipelineExecutionStartCondition;
    	      this.scheduleExpression = defaults.scheduleExpression;
        }

        public Builder pipelineExecutionStartCondition(String pipelineExecutionStartCondition) {
            this.pipelineExecutionStartCondition = Objects.requireNonNull(pipelineExecutionStartCondition);
            return this;
        }

        public Builder scheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }
        public GetImagePipelineSchedule build() {
            return new GetImagePipelineSchedule(pipelineExecutionStartCondition, scheduleExpression);
        }
    }
}
