// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BqmlIterationResultResponse {
    /**
     * [Output-only, Beta] Time taken to run the training iteration in milliseconds.
     * 
     */
    private final String durationMs;
    /**
     * [Output-only, Beta] Eval loss computed on the eval data at the end of the iteration. The eval loss is used for early stopping to avoid overfitting. No eval loss if eval_split_method option is specified as no_split or auto_split with input data size less than 500 rows.
     * 
     */
    private final Double evalLoss;
    /**
     * [Output-only, Beta] Index of the ML training iteration, starting from zero for each training run.
     * 
     */
    private final Integer index;
    /**
     * [Output-only, Beta] Learning rate used for this iteration, it varies for different training iterations if learn_rate_strategy option is not constant.
     * 
     */
    private final Double learnRate;
    /**
     * [Output-only, Beta] Training loss computed on the training data at the end of the iteration. The training loss function is defined by model type.
     * 
     */
    private final Double trainingLoss;

    @CustomType.Constructor
    private BqmlIterationResultResponse(
        @CustomType.Parameter("durationMs") String durationMs,
        @CustomType.Parameter("evalLoss") Double evalLoss,
        @CustomType.Parameter("index") Integer index,
        @CustomType.Parameter("learnRate") Double learnRate,
        @CustomType.Parameter("trainingLoss") Double trainingLoss) {
        this.durationMs = durationMs;
        this.evalLoss = evalLoss;
        this.index = index;
        this.learnRate = learnRate;
        this.trainingLoss = trainingLoss;
    }

    /**
     * [Output-only, Beta] Time taken to run the training iteration in milliseconds.
     * 
    */
    public String getDurationMs() {
        return this.durationMs;
    }
    /**
     * [Output-only, Beta] Eval loss computed on the eval data at the end of the iteration. The eval loss is used for early stopping to avoid overfitting. No eval loss if eval_split_method option is specified as no_split or auto_split with input data size less than 500 rows.
     * 
    */
    public Double getEvalLoss() {
        return this.evalLoss;
    }
    /**
     * [Output-only, Beta] Index of the ML training iteration, starting from zero for each training run.
     * 
    */
    public Integer getIndex() {
        return this.index;
    }
    /**
     * [Output-only, Beta] Learning rate used for this iteration, it varies for different training iterations if learn_rate_strategy option is not constant.
     * 
    */
    public Double getLearnRate() {
        return this.learnRate;
    }
    /**
     * [Output-only, Beta] Training loss computed on the training data at the end of the iteration. The training loss function is defined by model type.
     * 
    */
    public Double getTrainingLoss() {
        return this.trainingLoss;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BqmlIterationResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String durationMs;
        private Double evalLoss;
        private Integer index;
        private Double learnRate;
        private Double trainingLoss;

        public Builder() {
    	      // Empty
        }

        public Builder(BqmlIterationResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationMs = defaults.durationMs;
    	      this.evalLoss = defaults.evalLoss;
    	      this.index = defaults.index;
    	      this.learnRate = defaults.learnRate;
    	      this.trainingLoss = defaults.trainingLoss;
        }

        public Builder durationMs(String durationMs) {
            this.durationMs = Objects.requireNonNull(durationMs);
            return this;
        }

        public Builder evalLoss(Double evalLoss) {
            this.evalLoss = Objects.requireNonNull(evalLoss);
            return this;
        }

        public Builder index(Integer index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }

        public Builder learnRate(Double learnRate) {
            this.learnRate = Objects.requireNonNull(learnRate);
            return this;
        }

        public Builder trainingLoss(Double trainingLoss) {
            this.trainingLoss = Objects.requireNonNull(trainingLoss);
            return this;
        }
        public BqmlIterationResultResponse build() {
            return new BqmlIterationResultResponse(durationMs, evalLoss, index, learnRate, trainingLoss);
        }
    }
}
