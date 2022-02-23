// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.IndividualOutcomeResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class PrimaryStepResponse {
    /**
     * Step Id and outcome of each individual step.
     * 
     */
    private final List<IndividualOutcomeResponse> individualOutcome;
    /**
     * Rollup test status of multiple steps that were run with the same configuration as a group.
     * 
     */
    private final String rollUp;

    @OutputCustomType.Constructor({"individualOutcome","rollUp"})
    private PrimaryStepResponse(
        List<IndividualOutcomeResponse> individualOutcome,
        String rollUp) {
        this.individualOutcome = Objects.requireNonNull(individualOutcome);
        this.rollUp = Objects.requireNonNull(rollUp);
    }

    /**
     * Step Id and outcome of each individual step.
     * 
     */
    public List<IndividualOutcomeResponse> getIndividualOutcome() {
        return this.individualOutcome;
    }
    /**
     * Rollup test status of multiple steps that were run with the same configuration as a group.
     * 
     */
    public String getRollUp() {
        return this.rollUp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrimaryStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<IndividualOutcomeResponse> individualOutcome;
        private String rollUp;

        public Builder() {
    	      // Empty
        }

        public Builder(PrimaryStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.individualOutcome = defaults.individualOutcome;
    	      this.rollUp = defaults.rollUp;
        }

        public Builder setIndividualOutcome(List<IndividualOutcomeResponse> individualOutcome) {
            this.individualOutcome = Objects.requireNonNull(individualOutcome);
            return this;
        }

        public Builder setRollUp(String rollUp) {
            this.rollUp = Objects.requireNonNull(rollUp);
            return this;
        }
        public PrimaryStepResponse build() {
            return new PrimaryStepResponse(individualOutcome, rollUp);
        }
    }
}
