// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines an early termination policy that cancels a given percentage of runs at each evaluation interval.
 * 
 */
public final class TruncationSelectionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TruncationSelectionPolicyArgs Empty = new TruncationSelectionPolicyArgs();

    /**
     * Number of intervals by which to delay the first evaluation.
     * 
     */
    @InputImport(name="delayEvaluation")
        private final @Nullable Input<Integer> delayEvaluation;

    public Input<Integer> getDelayEvaluation() {
        return this.delayEvaluation == null ? Input.empty() : this.delayEvaluation;
    }

    /**
     * Interval (number of runs) between policy evaluations.
     * 
     */
    @InputImport(name="evaluationInterval")
        private final @Nullable Input<Integer> evaluationInterval;

    public Input<Integer> getEvaluationInterval() {
        return this.evaluationInterval == null ? Input.empty() : this.evaluationInterval;
    }

    /**
     * Expected value is 'TruncationSelection'.
     * 
     */
    @InputImport(name="policyType", required=true)
        private final Input<String> policyType;

    public Input<String> getPolicyType() {
        return this.policyType;
    }

    /**
     * The percentage of runs to cancel at each evaluation interval.
     * 
     */
    @InputImport(name="truncationPercentage")
        private final @Nullable Input<Integer> truncationPercentage;

    public Input<Integer> getTruncationPercentage() {
        return this.truncationPercentage == null ? Input.empty() : this.truncationPercentage;
    }

    public TruncationSelectionPolicyArgs(
        @Nullable Input<Integer> delayEvaluation,
        @Nullable Input<Integer> evaluationInterval,
        Input<String> policyType,
        @Nullable Input<Integer> truncationPercentage) {
        this.delayEvaluation = delayEvaluation;
        this.evaluationInterval = evaluationInterval;
        this.policyType = Objects.requireNonNull(policyType, "expected parameter 'policyType' to be non-null");
        this.truncationPercentage = truncationPercentage;
    }

    private TruncationSelectionPolicyArgs() {
        this.delayEvaluation = Input.empty();
        this.evaluationInterval = Input.empty();
        this.policyType = Input.empty();
        this.truncationPercentage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TruncationSelectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> delayEvaluation;
        private @Nullable Input<Integer> evaluationInterval;
        private Input<String> policyType;
        private @Nullable Input<Integer> truncationPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(TruncationSelectionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delayEvaluation = defaults.delayEvaluation;
    	      this.evaluationInterval = defaults.evaluationInterval;
    	      this.policyType = defaults.policyType;
    	      this.truncationPercentage = defaults.truncationPercentage;
        }

        public Builder setDelayEvaluation(@Nullable Input<Integer> delayEvaluation) {
            this.delayEvaluation = delayEvaluation;
            return this;
        }

        public Builder setDelayEvaluation(@Nullable Integer delayEvaluation) {
            this.delayEvaluation = Input.ofNullable(delayEvaluation);
            return this;
        }

        public Builder setEvaluationInterval(@Nullable Input<Integer> evaluationInterval) {
            this.evaluationInterval = evaluationInterval;
            return this;
        }

        public Builder setEvaluationInterval(@Nullable Integer evaluationInterval) {
            this.evaluationInterval = Input.ofNullable(evaluationInterval);
            return this;
        }

        public Builder setPolicyType(Input<String> policyType) {
            this.policyType = Objects.requireNonNull(policyType);
            return this;
        }

        public Builder setPolicyType(String policyType) {
            this.policyType = Input.of(Objects.requireNonNull(policyType));
            return this;
        }

        public Builder setTruncationPercentage(@Nullable Input<Integer> truncationPercentage) {
            this.truncationPercentage = truncationPercentage;
            return this;
        }

        public Builder setTruncationPercentage(@Nullable Integer truncationPercentage) {
            this.truncationPercentage = Input.ofNullable(truncationPercentage);
            return this;
        }
        public TruncationSelectionPolicyArgs build() {
            return new TruncationSelectionPolicyArgs(delayEvaluation, evaluationInterval, policyType, truncationPercentage);
        }
    }
}
