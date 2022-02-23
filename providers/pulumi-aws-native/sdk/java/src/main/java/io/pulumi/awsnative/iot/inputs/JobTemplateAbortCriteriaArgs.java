// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.enums.JobTemplateAction;
import io.pulumi.awsnative.iot.enums.JobTemplateFailureType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;


/**
 * The criteria that determine when and how a job abort takes place.
 * 
 */
public final class JobTemplateAbortCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobTemplateAbortCriteriaArgs Empty = new JobTemplateAbortCriteriaArgs();

    /**
     * The type of job action to take to initiate the job abort.
     * 
     */
    @InputImport(name="action", required=true)
        private final Input<JobTemplateAction> action;

    public Input<JobTemplateAction> getAction() {
        return this.action;
    }

    /**
     * The type of job execution failures that can initiate a job abort.
     * 
     */
    @InputImport(name="failureType", required=true)
        private final Input<JobTemplateFailureType> failureType;

    public Input<JobTemplateFailureType> getFailureType() {
        return this.failureType;
    }

    /**
     * The minimum number of things which must receive job execution notifications before the job can be aborted.
     * 
     */
    @InputImport(name="minNumberOfExecutedThings", required=true)
        private final Input<Integer> minNumberOfExecutedThings;

    public Input<Integer> getMinNumberOfExecutedThings() {
        return this.minNumberOfExecutedThings;
    }

    /**
     * The minimum percentage of job execution failures that must occur to initiate the job abort.
     * 
     */
    @InputImport(name="thresholdPercentage", required=true)
        private final Input<Double> thresholdPercentage;

    public Input<Double> getThresholdPercentage() {
        return this.thresholdPercentage;
    }

    public JobTemplateAbortCriteriaArgs(
        Input<JobTemplateAction> action,
        Input<JobTemplateFailureType> failureType,
        Input<Integer> minNumberOfExecutedThings,
        Input<Double> thresholdPercentage) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.failureType = Objects.requireNonNull(failureType, "expected parameter 'failureType' to be non-null");
        this.minNumberOfExecutedThings = Objects.requireNonNull(minNumberOfExecutedThings, "expected parameter 'minNumberOfExecutedThings' to be non-null");
        this.thresholdPercentage = Objects.requireNonNull(thresholdPercentage, "expected parameter 'thresholdPercentage' to be non-null");
    }

    private JobTemplateAbortCriteriaArgs() {
        this.action = Input.empty();
        this.failureType = Input.empty();
        this.minNumberOfExecutedThings = Input.empty();
        this.thresholdPercentage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateAbortCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<JobTemplateAction> action;
        private Input<JobTemplateFailureType> failureType;
        private Input<Integer> minNumberOfExecutedThings;
        private Input<Double> thresholdPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTemplateAbortCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.failureType = defaults.failureType;
    	      this.minNumberOfExecutedThings = defaults.minNumberOfExecutedThings;
    	      this.thresholdPercentage = defaults.thresholdPercentage;
        }

        public Builder setAction(Input<JobTemplateAction> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(JobTemplateAction action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder setFailureType(Input<JobTemplateFailureType> failureType) {
            this.failureType = Objects.requireNonNull(failureType);
            return this;
        }

        public Builder setFailureType(JobTemplateFailureType failureType) {
            this.failureType = Input.of(Objects.requireNonNull(failureType));
            return this;
        }

        public Builder setMinNumberOfExecutedThings(Input<Integer> minNumberOfExecutedThings) {
            this.minNumberOfExecutedThings = Objects.requireNonNull(minNumberOfExecutedThings);
            return this;
        }

        public Builder setMinNumberOfExecutedThings(Integer minNumberOfExecutedThings) {
            this.minNumberOfExecutedThings = Input.of(Objects.requireNonNull(minNumberOfExecutedThings));
            return this;
        }

        public Builder setThresholdPercentage(Input<Double> thresholdPercentage) {
            this.thresholdPercentage = Objects.requireNonNull(thresholdPercentage);
            return this;
        }

        public Builder setThresholdPercentage(Double thresholdPercentage) {
            this.thresholdPercentage = Input.of(Objects.requireNonNull(thresholdPercentage));
            return this;
        }
        public JobTemplateAbortCriteriaArgs build() {
            return new JobTemplateAbortCriteriaArgs(action, failureType, minNumberOfExecutedThings, thresholdPercentage);
        }
    }
}
