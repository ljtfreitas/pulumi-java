// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCanaryEvaluationResult {
    /**
     * The stable version that is serving requests.
     * 
     */
    private final String control;
    /**
     * Create time of the canary evaluation.
     * 
     */
    private final String createTime;
    /**
     * End time for the evaluation's analysis.
     * 
     */
    private final String endTime;
    /**
     * Labels used to filter the metrics used for a canary evaluation.
     * 
     */
    private final GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse metricLabels;
    /**
     * Name of the canary evalution.
     * 
     */
    private final String name;
    /**
     * Start time for the canary evaluation's analysis.
     * 
     */
    private final String startTime;
    /**
     * The current state of the canary evaluation.
     * 
     */
    private final String state;
    /**
     * The newer version that is serving requests.
     * 
     */
    private final String treatment;
    /**
     * The resulting verdict of the canary evaluations: NONE, PASS, or FAIL.
     * 
     */
    private final String verdict;

    @CustomType.Constructor
    private GetCanaryEvaluationResult(
        @CustomType.Parameter("control") String control,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("metricLabels") GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse metricLabels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("treatment") String treatment,
        @CustomType.Parameter("verdict") String verdict) {
        this.control = control;
        this.createTime = createTime;
        this.endTime = endTime;
        this.metricLabels = metricLabels;
        this.name = name;
        this.startTime = startTime;
        this.state = state;
        this.treatment = treatment;
        this.verdict = verdict;
    }

    /**
     * The stable version that is serving requests.
     * 
    */
    public String getControl() {
        return this.control;
    }
    /**
     * Create time of the canary evaluation.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * End time for the evaluation's analysis.
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * Labels used to filter the metrics used for a canary evaluation.
     * 
    */
    public GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse getMetricLabels() {
        return this.metricLabels;
    }
    /**
     * Name of the canary evalution.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Start time for the canary evaluation's analysis.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * The current state of the canary evaluation.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The newer version that is serving requests.
     * 
    */
    public String getTreatment() {
        return this.treatment;
    }
    /**
     * The resulting verdict of the canary evaluations: NONE, PASS, or FAIL.
     * 
    */
    public String getVerdict() {
        return this.verdict;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCanaryEvaluationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String control;
        private String createTime;
        private String endTime;
        private GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse metricLabels;
        private String name;
        private String startTime;
        private String state;
        private String treatment;
        private String verdict;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCanaryEvaluationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.control = defaults.control;
    	      this.createTime = defaults.createTime;
    	      this.endTime = defaults.endTime;
    	      this.metricLabels = defaults.metricLabels;
    	      this.name = defaults.name;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.treatment = defaults.treatment;
    	      this.verdict = defaults.verdict;
        }

        public Builder control(String control) {
            this.control = Objects.requireNonNull(control);
            return this;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder metricLabels(GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse metricLabels) {
            this.metricLabels = Objects.requireNonNull(metricLabels);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder treatment(String treatment) {
            this.treatment = Objects.requireNonNull(treatment);
            return this;
        }

        public Builder verdict(String verdict) {
            this.verdict = Objects.requireNonNull(verdict);
            return this;
        }
        public GetCanaryEvaluationResult build() {
            return new GetCanaryEvaluationResult(control, createTime, endTime, metricLabels, name, startTime, state, treatment, verdict);
        }
    }
}
