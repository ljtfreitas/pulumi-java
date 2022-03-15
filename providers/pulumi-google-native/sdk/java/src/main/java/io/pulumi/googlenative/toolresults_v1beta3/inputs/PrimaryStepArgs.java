// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.toolresults_v1beta3.enums.PrimaryStepRollUp;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.IndividualOutcomeArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Stores rollup test status of multiple steps that were run as a group and outcome of each individual step.
 * 
 */
public final class PrimaryStepArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrimaryStepArgs Empty = new PrimaryStepArgs();

    /**
     * Step Id and outcome of each individual step.
     * 
     */
    @Import(name="individualOutcome")
      private final @Nullable Output<List<IndividualOutcomeArgs>> individualOutcome;

    public Output<List<IndividualOutcomeArgs>> getIndividualOutcome() {
        return this.individualOutcome == null ? Output.empty() : this.individualOutcome;
    }

    /**
     * Rollup test status of multiple steps that were run with the same configuration as a group.
     * 
     */
    @Import(name="rollUp")
      private final @Nullable Output<PrimaryStepRollUp> rollUp;

    public Output<PrimaryStepRollUp> getRollUp() {
        return this.rollUp == null ? Output.empty() : this.rollUp;
    }

    public PrimaryStepArgs(
        @Nullable Output<List<IndividualOutcomeArgs>> individualOutcome,
        @Nullable Output<PrimaryStepRollUp> rollUp) {
        this.individualOutcome = individualOutcome;
        this.rollUp = rollUp;
    }

    private PrimaryStepArgs() {
        this.individualOutcome = Output.empty();
        this.rollUp = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrimaryStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<IndividualOutcomeArgs>> individualOutcome;
        private @Nullable Output<PrimaryStepRollUp> rollUp;

        public Builder() {
    	      // Empty
        }

        public Builder(PrimaryStepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.individualOutcome = defaults.individualOutcome;
    	      this.rollUp = defaults.rollUp;
        }

        public Builder individualOutcome(@Nullable Output<List<IndividualOutcomeArgs>> individualOutcome) {
            this.individualOutcome = individualOutcome;
            return this;
        }

        public Builder individualOutcome(@Nullable List<IndividualOutcomeArgs> individualOutcome) {
            this.individualOutcome = Output.ofNullable(individualOutcome);
            return this;
        }

        public Builder rollUp(@Nullable Output<PrimaryStepRollUp> rollUp) {
            this.rollUp = rollUp;
            return this;
        }

        public Builder rollUp(@Nullable PrimaryStepRollUp rollUp) {
            this.rollUp = Output.ofNullable(rollUp);
            return this;
        }
        public PrimaryStepArgs build() {
            return new PrimaryStepArgs(individualOutcome, rollUp);
        }
    }
}
