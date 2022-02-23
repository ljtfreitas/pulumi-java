// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.inputs;

import io.pulumi.awsnative.evidently.inputs.ExperimentTreatmentToWeightArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExperimentOnlineAbConfigObjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExperimentOnlineAbConfigObjectArgs Empty = new ExperimentOnlineAbConfigObjectArgs();

    @InputImport(name="controlTreatmentName")
        private final @Nullable Input<String> controlTreatmentName;

    public Input<String> getControlTreatmentName() {
        return this.controlTreatmentName == null ? Input.empty() : this.controlTreatmentName;
    }

    @InputImport(name="treatmentWeights")
        private final @Nullable Input<List<ExperimentTreatmentToWeightArgs>> treatmentWeights;

    public Input<List<ExperimentTreatmentToWeightArgs>> getTreatmentWeights() {
        return this.treatmentWeights == null ? Input.empty() : this.treatmentWeights;
    }

    public ExperimentOnlineAbConfigObjectArgs(
        @Nullable Input<String> controlTreatmentName,
        @Nullable Input<List<ExperimentTreatmentToWeightArgs>> treatmentWeights) {
        this.controlTreatmentName = controlTreatmentName;
        this.treatmentWeights = treatmentWeights;
    }

    private ExperimentOnlineAbConfigObjectArgs() {
        this.controlTreatmentName = Input.empty();
        this.treatmentWeights = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentOnlineAbConfigObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> controlTreatmentName;
        private @Nullable Input<List<ExperimentTreatmentToWeightArgs>> treatmentWeights;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentOnlineAbConfigObjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controlTreatmentName = defaults.controlTreatmentName;
    	      this.treatmentWeights = defaults.treatmentWeights;
        }

        public Builder setControlTreatmentName(@Nullable Input<String> controlTreatmentName) {
            this.controlTreatmentName = controlTreatmentName;
            return this;
        }

        public Builder setControlTreatmentName(@Nullable String controlTreatmentName) {
            this.controlTreatmentName = Input.ofNullable(controlTreatmentName);
            return this;
        }

        public Builder setTreatmentWeights(@Nullable Input<List<ExperimentTreatmentToWeightArgs>> treatmentWeights) {
            this.treatmentWeights = treatmentWeights;
            return this;
        }

        public Builder setTreatmentWeights(@Nullable List<ExperimentTreatmentToWeightArgs> treatmentWeights) {
            this.treatmentWeights = Input.ofNullable(treatmentWeights);
            return this;
        }
        public ExperimentOnlineAbConfigObjectArgs build() {
            return new ExperimentOnlineAbConfigObjectArgs(controlTreatmentName, treatmentWeights);
        }
    }
}
