// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SchedulingPolicyFairSharePolicyShareDistributionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchedulingPolicyFairSharePolicyShareDistributionGetArgs Empty = new SchedulingPolicyFairSharePolicyShareDistributionGetArgs();

    /**
     * A fair share identifier or fair share identifier prefix. For more information, see [ShareAttributes](https://docs.aws.amazon.com/batch/latest/APIReference/API_ShareAttributes.html).
     * 
     */
    @Import(name="shareIdentifier", required=true)
      private final Output<String> shareIdentifier;

    public Output<String> getShareIdentifier() {
        return this.shareIdentifier;
    }

    /**
     * The weight factor for the fair share identifier. For more information, see [ShareAttributes](https://docs.aws.amazon.com/batch/latest/APIReference/API_ShareAttributes.html).
     * 
     */
    @Import(name="weightFactor")
      private final @Nullable Output<Double> weightFactor;

    public Output<Double> getWeightFactor() {
        return this.weightFactor == null ? Output.empty() : this.weightFactor;
    }

    public SchedulingPolicyFairSharePolicyShareDistributionGetArgs(
        Output<String> shareIdentifier,
        @Nullable Output<Double> weightFactor) {
        this.shareIdentifier = Objects.requireNonNull(shareIdentifier, "expected parameter 'shareIdentifier' to be non-null");
        this.weightFactor = weightFactor;
    }

    private SchedulingPolicyFairSharePolicyShareDistributionGetArgs() {
        this.shareIdentifier = Output.empty();
        this.weightFactor = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingPolicyFairSharePolicyShareDistributionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> shareIdentifier;
        private @Nullable Output<Double> weightFactor;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingPolicyFairSharePolicyShareDistributionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shareIdentifier = defaults.shareIdentifier;
    	      this.weightFactor = defaults.weightFactor;
        }

        public Builder shareIdentifier(Output<String> shareIdentifier) {
            this.shareIdentifier = Objects.requireNonNull(shareIdentifier);
            return this;
        }

        public Builder shareIdentifier(String shareIdentifier) {
            this.shareIdentifier = Output.of(Objects.requireNonNull(shareIdentifier));
            return this;
        }

        public Builder weightFactor(@Nullable Output<Double> weightFactor) {
            this.weightFactor = weightFactor;
            return this;
        }

        public Builder weightFactor(@Nullable Double weightFactor) {
            this.weightFactor = Output.ofNullable(weightFactor);
            return this;
        }
        public SchedulingPolicyFairSharePolicyShareDistributionGetArgs build() {
            return new SchedulingPolicyFairSharePolicyShareDistributionGetArgs(shareIdentifier, weightFactor);
        }
    }
}
