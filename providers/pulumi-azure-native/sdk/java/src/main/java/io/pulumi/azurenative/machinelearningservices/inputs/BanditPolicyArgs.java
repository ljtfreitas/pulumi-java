// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BanditPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BanditPolicyArgs Empty = new BanditPolicyArgs();

    @InputImport(name="delayEvaluation")
    private final @Nullable Input<Integer> delayEvaluation;

    public Input<Integer> getDelayEvaluation() {
        return this.delayEvaluation == null ? Input.empty() : this.delayEvaluation;
    }

    @InputImport(name="evaluationInterval")
    private final @Nullable Input<Integer> evaluationInterval;

    public Input<Integer> getEvaluationInterval() {
        return this.evaluationInterval == null ? Input.empty() : this.evaluationInterval;
    }

    @InputImport(name="policyType", required=true)
    private final Input<String> policyType;

    public Input<String> getPolicyType() {
        return this.policyType;
    }

    @InputImport(name="slackAmount")
    private final @Nullable Input<Double> slackAmount;

    public Input<Double> getSlackAmount() {
        return this.slackAmount == null ? Input.empty() : this.slackAmount;
    }

    @InputImport(name="slackFactor")
    private final @Nullable Input<Double> slackFactor;

    public Input<Double> getSlackFactor() {
        return this.slackFactor == null ? Input.empty() : this.slackFactor;
    }

    public BanditPolicyArgs(
        @Nullable Input<Integer> delayEvaluation,
        @Nullable Input<Integer> evaluationInterval,
        Input<String> policyType,
        @Nullable Input<Double> slackAmount,
        @Nullable Input<Double> slackFactor) {
        this.delayEvaluation = delayEvaluation;
        this.evaluationInterval = evaluationInterval;
        this.policyType = Objects.requireNonNull(policyType, "expected parameter 'policyType' to be non-null");
        this.slackAmount = slackAmount;
        this.slackFactor = slackFactor;
    }

    private BanditPolicyArgs() {
        this.delayEvaluation = Input.empty();
        this.evaluationInterval = Input.empty();
        this.policyType = Input.empty();
        this.slackAmount = Input.empty();
        this.slackFactor = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BanditPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> delayEvaluation;
        private @Nullable Input<Integer> evaluationInterval;
        private Input<String> policyType;
        private @Nullable Input<Double> slackAmount;
        private @Nullable Input<Double> slackFactor;

        public Builder() {
    	      // Empty
        }

        public Builder(BanditPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delayEvaluation = defaults.delayEvaluation;
    	      this.evaluationInterval = defaults.evaluationInterval;
    	      this.policyType = defaults.policyType;
    	      this.slackAmount = defaults.slackAmount;
    	      this.slackFactor = defaults.slackFactor;
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

        public Builder setSlackAmount(@Nullable Input<Double> slackAmount) {
            this.slackAmount = slackAmount;
            return this;
        }

        public Builder setSlackAmount(@Nullable Double slackAmount) {
            this.slackAmount = Input.ofNullable(slackAmount);
            return this;
        }

        public Builder setSlackFactor(@Nullable Input<Double> slackFactor) {
            this.slackFactor = slackFactor;
            return this;
        }

        public Builder setSlackFactor(@Nullable Double slackFactor) {
            this.slackFactor = Input.ofNullable(slackFactor);
            return this;
        }

        public BanditPolicyArgs build() {
            return new BanditPolicyArgs(delayEvaluation, evaluationInterval, policyType, slackAmount, slackFactor);
        }
    }
}