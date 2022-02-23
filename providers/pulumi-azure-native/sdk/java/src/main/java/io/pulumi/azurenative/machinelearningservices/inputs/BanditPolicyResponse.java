// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines an early termination policy based on slack criteria, and a frequency and delay interval for evaluation.
 * 
 */
public final class BanditPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final BanditPolicyResponse Empty = new BanditPolicyResponse();

    /**
     * Number of intervals by which to delay the first evaluation.
     * 
     */
    @InputImport(name="delayEvaluation")
        private final @Nullable Integer delayEvaluation;

    public Optional<Integer> getDelayEvaluation() {
        return this.delayEvaluation == null ? Optional.empty() : Optional.ofNullable(this.delayEvaluation);
    }

    /**
     * Interval (number of runs) between policy evaluations.
     * 
     */
    @InputImport(name="evaluationInterval")
        private final @Nullable Integer evaluationInterval;

    public Optional<Integer> getEvaluationInterval() {
        return this.evaluationInterval == null ? Optional.empty() : Optional.ofNullable(this.evaluationInterval);
    }

    /**
     * Expected value is 'Bandit'.
     * 
     */
    @InputImport(name="policyType", required=true)
        private final String policyType;

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * Absolute distance allowed from the best performing run.
     * 
     */
    @InputImport(name="slackAmount")
        private final @Nullable Double slackAmount;

    public Optional<Double> getSlackAmount() {
        return this.slackAmount == null ? Optional.empty() : Optional.ofNullable(this.slackAmount);
    }

    /**
     * Ratio of the allowed distance from the best performing run.
     * 
     */
    @InputImport(name="slackFactor")
        private final @Nullable Double slackFactor;

    public Optional<Double> getSlackFactor() {
        return this.slackFactor == null ? Optional.empty() : Optional.ofNullable(this.slackFactor);
    }

    public BanditPolicyResponse(
        @Nullable Integer delayEvaluation,
        @Nullable Integer evaluationInterval,
        String policyType,
        @Nullable Double slackAmount,
        @Nullable Double slackFactor) {
        this.delayEvaluation = delayEvaluation;
        this.evaluationInterval = evaluationInterval;
        this.policyType = Objects.requireNonNull(policyType, "expected parameter 'policyType' to be non-null");
        this.slackAmount = slackAmount;
        this.slackFactor = slackFactor;
    }

    private BanditPolicyResponse() {
        this.delayEvaluation = null;
        this.evaluationInterval = null;
        this.policyType = null;
        this.slackAmount = null;
        this.slackFactor = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BanditPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer delayEvaluation;
        private @Nullable Integer evaluationInterval;
        private String policyType;
        private @Nullable Double slackAmount;
        private @Nullable Double slackFactor;

        public Builder() {
    	      // Empty
        }

        public Builder(BanditPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delayEvaluation = defaults.delayEvaluation;
    	      this.evaluationInterval = defaults.evaluationInterval;
    	      this.policyType = defaults.policyType;
    	      this.slackAmount = defaults.slackAmount;
    	      this.slackFactor = defaults.slackFactor;
        }

        public Builder setDelayEvaluation(@Nullable Integer delayEvaluation) {
            this.delayEvaluation = delayEvaluation;
            return this;
        }

        public Builder setEvaluationInterval(@Nullable Integer evaluationInterval) {
            this.evaluationInterval = evaluationInterval;
            return this;
        }

        public Builder setPolicyType(String policyType) {
            this.policyType = Objects.requireNonNull(policyType);
            return this;
        }

        public Builder setSlackAmount(@Nullable Double slackAmount) {
            this.slackAmount = slackAmount;
            return this;
        }

        public Builder setSlackFactor(@Nullable Double slackFactor) {
            this.slackFactor = slackFactor;
            return this;
        }
        public BanditPolicyResponse build() {
            return new BanditPolicyResponse(delayEvaluation, evaluationInterval, policyType, slackAmount, slackFactor);
        }
    }
}
