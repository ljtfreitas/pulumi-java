// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="delayEvaluation")
      private final @Nullable Output<Integer> delayEvaluation;

    public Output<Integer> getDelayEvaluation() {
        return this.delayEvaluation == null ? Output.empty() : this.delayEvaluation;
    }

    /**
     * Interval (number of runs) between policy evaluations.
     * 
     */
    @Import(name="evaluationInterval")
      private final @Nullable Output<Integer> evaluationInterval;

    public Output<Integer> getEvaluationInterval() {
        return this.evaluationInterval == null ? Output.empty() : this.evaluationInterval;
    }

    /**
     * Expected value is 'TruncationSelection'.
     * 
     */
    @Import(name="policyType", required=true)
      private final Output<String> policyType;

    public Output<String> getPolicyType() {
        return this.policyType;
    }

    /**
     * The percentage of runs to cancel at each evaluation interval.
     * 
     */
    @Import(name="truncationPercentage")
      private final @Nullable Output<Integer> truncationPercentage;

    public Output<Integer> getTruncationPercentage() {
        return this.truncationPercentage == null ? Output.empty() : this.truncationPercentage;
    }

    public TruncationSelectionPolicyArgs(
        @Nullable Output<Integer> delayEvaluation,
        @Nullable Output<Integer> evaluationInterval,
        Output<String> policyType,
        @Nullable Output<Integer> truncationPercentage) {
        this.delayEvaluation = delayEvaluation;
        this.evaluationInterval = evaluationInterval;
        this.policyType = Objects.requireNonNull(policyType, "expected parameter 'policyType' to be non-null");
        this.truncationPercentage = truncationPercentage;
    }

    private TruncationSelectionPolicyArgs() {
        this.delayEvaluation = Output.empty();
        this.evaluationInterval = Output.empty();
        this.policyType = Output.empty();
        this.truncationPercentage = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TruncationSelectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> delayEvaluation;
        private @Nullable Output<Integer> evaluationInterval;
        private Output<String> policyType;
        private @Nullable Output<Integer> truncationPercentage;

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

        public Builder delayEvaluation(@Nullable Output<Integer> delayEvaluation) {
            this.delayEvaluation = delayEvaluation;
            return this;
        }

        public Builder delayEvaluation(@Nullable Integer delayEvaluation) {
            this.delayEvaluation = Output.ofNullable(delayEvaluation);
            return this;
        }

        public Builder evaluationInterval(@Nullable Output<Integer> evaluationInterval) {
            this.evaluationInterval = evaluationInterval;
            return this;
        }

        public Builder evaluationInterval(@Nullable Integer evaluationInterval) {
            this.evaluationInterval = Output.ofNullable(evaluationInterval);
            return this;
        }

        public Builder policyType(Output<String> policyType) {
            this.policyType = Objects.requireNonNull(policyType);
            return this;
        }

        public Builder policyType(String policyType) {
            this.policyType = Output.of(Objects.requireNonNull(policyType));
            return this;
        }

        public Builder truncationPercentage(@Nullable Output<Integer> truncationPercentage) {
            this.truncationPercentage = truncationPercentage;
            return this;
        }

        public Builder truncationPercentage(@Nullable Integer truncationPercentage) {
            this.truncationPercentage = Output.ofNullable(truncationPercentage);
            return this;
        }
        public TruncationSelectionPolicyArgs build() {
            return new TruncationSelectionPolicyArgs(delayEvaluation, evaluationInterval, policyType, truncationPercentage);
        }
    }
}
