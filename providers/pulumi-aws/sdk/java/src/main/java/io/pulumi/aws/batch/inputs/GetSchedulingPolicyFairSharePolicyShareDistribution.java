// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class GetSchedulingPolicyFairSharePolicyShareDistribution extends io.pulumi.resources.InvokeArgs {

    public static final GetSchedulingPolicyFairSharePolicyShareDistribution Empty = new GetSchedulingPolicyFairSharePolicyShareDistribution();

    /**
     * A fair share identifier or fair share identifier prefix. For more information, see [ShareAttributes](https://docs.aws.amazon.com/batch/latest/APIReference/API_ShareAttributes.html).
     * 
     */
    @InputImport(name="shareIdentifier", required=true)
    private final String shareIdentifier;

    public String getShareIdentifier() {
        return this.shareIdentifier;
    }

    /**
     * The weight factor for the fair share identifier. For more information, see [ShareAttributes](https://docs.aws.amazon.com/batch/latest/APIReference/API_ShareAttributes.html).
     * 
     */
    @InputImport(name="weightFactor", required=true)
    private final Double weightFactor;

    public Double getWeightFactor() {
        return this.weightFactor;
    }

    public GetSchedulingPolicyFairSharePolicyShareDistribution(
        String shareIdentifier,
        Double weightFactor) {
        this.shareIdentifier = Objects.requireNonNull(shareIdentifier, "expected parameter 'shareIdentifier' to be non-null");
        this.weightFactor = Objects.requireNonNull(weightFactor, "expected parameter 'weightFactor' to be non-null");
    }

    private GetSchedulingPolicyFairSharePolicyShareDistribution() {
        this.shareIdentifier = null;
        this.weightFactor = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchedulingPolicyFairSharePolicyShareDistribution defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String shareIdentifier;
        private Double weightFactor;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSchedulingPolicyFairSharePolicyShareDistribution defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shareIdentifier = defaults.shareIdentifier;
    	      this.weightFactor = defaults.weightFactor;
        }

        public Builder setShareIdentifier(String shareIdentifier) {
            this.shareIdentifier = Objects.requireNonNull(shareIdentifier);
            return this;
        }

        public Builder setWeightFactor(Double weightFactor) {
            this.weightFactor = Objects.requireNonNull(weightFactor);
            return this;
        }
        public GetSchedulingPolicyFairSharePolicyShareDistribution build() {
            return new GetSchedulingPolicyFairSharePolicyShareDistribution(shareIdentifier, weightFactor);
        }
    }
}
