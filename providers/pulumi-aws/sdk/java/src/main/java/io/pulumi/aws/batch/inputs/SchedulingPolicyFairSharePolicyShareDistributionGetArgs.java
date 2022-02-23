// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
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
    @InputImport(name="shareIdentifier", required=true)
    private final Input<String> shareIdentifier;

    public Input<String> getShareIdentifier() {
        return this.shareIdentifier;
    }

    /**
     * The weight factor for the fair share identifier. For more information, see [ShareAttributes](https://docs.aws.amazon.com/batch/latest/APIReference/API_ShareAttributes.html).
     * 
     */
    @InputImport(name="weightFactor")
    private final @Nullable Input<Double> weightFactor;

    public Input<Double> getWeightFactor() {
        return this.weightFactor == null ? Input.empty() : this.weightFactor;
    }

    public SchedulingPolicyFairSharePolicyShareDistributionGetArgs(
        Input<String> shareIdentifier,
        @Nullable Input<Double> weightFactor) {
        this.shareIdentifier = Objects.requireNonNull(shareIdentifier, "expected parameter 'shareIdentifier' to be non-null");
        this.weightFactor = weightFactor;
    }

    private SchedulingPolicyFairSharePolicyShareDistributionGetArgs() {
        this.shareIdentifier = Input.empty();
        this.weightFactor = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingPolicyFairSharePolicyShareDistributionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> shareIdentifier;
        private @Nullable Input<Double> weightFactor;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingPolicyFairSharePolicyShareDistributionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shareIdentifier = defaults.shareIdentifier;
    	      this.weightFactor = defaults.weightFactor;
        }

        public Builder setShareIdentifier(Input<String> shareIdentifier) {
            this.shareIdentifier = Objects.requireNonNull(shareIdentifier);
            return this;
        }

        public Builder setShareIdentifier(String shareIdentifier) {
            this.shareIdentifier = Input.of(Objects.requireNonNull(shareIdentifier));
            return this;
        }

        public Builder setWeightFactor(@Nullable Input<Double> weightFactor) {
            this.weightFactor = weightFactor;
            return this;
        }

        public Builder setWeightFactor(@Nullable Double weightFactor) {
            this.weightFactor = Input.ofNullable(weightFactor);
            return this;
        }
        public SchedulingPolicyFairSharePolicyShareDistributionGetArgs build() {
            return new SchedulingPolicyFairSharePolicyShareDistributionGetArgs(shareIdentifier, weightFactor);
        }
    }
}
