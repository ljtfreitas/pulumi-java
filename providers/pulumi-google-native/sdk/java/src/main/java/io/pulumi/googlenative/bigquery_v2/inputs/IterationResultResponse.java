// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class IterationResultResponse extends io.pulumi.resources.InvokeArgs {

    public static final IterationResultResponse Empty = new IterationResultResponse();

    @InputImport(name="durationMs", required=true)
    private final String durationMs;

    public String getDurationMs() {
        return this.durationMs;
    }

    @InputImport(name="evalLoss", required=true)
    private final Double evalLoss;

    public Double getEvalLoss() {
        return this.evalLoss;
    }

    @InputImport(name="index", required=true)
    private final Integer index;

    public Integer getIndex() {
        return this.index;
    }

    @InputImport(name="learnRate", required=true)
    private final Double learnRate;

    public Double getLearnRate() {
        return this.learnRate;
    }

    @InputImport(name="trainingLoss", required=true)
    private final Double trainingLoss;

    public Double getTrainingLoss() {
        return this.trainingLoss;
    }

    public IterationResultResponse(
        String durationMs,
        Double evalLoss,
        Integer index,
        Double learnRate,
        Double trainingLoss) {
        this.durationMs = Objects.requireNonNull(durationMs, "expected parameter 'durationMs' to be non-null");
        this.evalLoss = Objects.requireNonNull(evalLoss, "expected parameter 'evalLoss' to be non-null");
        this.index = Objects.requireNonNull(index, "expected parameter 'index' to be non-null");
        this.learnRate = Objects.requireNonNull(learnRate, "expected parameter 'learnRate' to be non-null");
        this.trainingLoss = Objects.requireNonNull(trainingLoss, "expected parameter 'trainingLoss' to be non-null");
    }

    private IterationResultResponse() {
        this.durationMs = null;
        this.evalLoss = null;
        this.index = null;
        this.learnRate = null;
        this.trainingLoss = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IterationResultResponse defaults) {
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

        public Builder(IterationResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationMs = defaults.durationMs;
    	      this.evalLoss = defaults.evalLoss;
    	      this.index = defaults.index;
    	      this.learnRate = defaults.learnRate;
    	      this.trainingLoss = defaults.trainingLoss;
        }

        public Builder setDurationMs(String durationMs) {
            this.durationMs = Objects.requireNonNull(durationMs);
            return this;
        }

        public Builder setEvalLoss(Double evalLoss) {
            this.evalLoss = Objects.requireNonNull(evalLoss);
            return this;
        }

        public Builder setIndex(Integer index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }

        public Builder setLearnRate(Double learnRate) {
            this.learnRate = Objects.requireNonNull(learnRate);
            return this;
        }

        public Builder setTrainingLoss(Double trainingLoss) {
            this.trainingLoss = Objects.requireNonNull(trainingLoss);
            return this;
        }

        public IterationResultResponse build() {
            return new IterationResultResponse(durationMs, evalLoss, index, learnRate, trainingLoss);
        }
    }
}