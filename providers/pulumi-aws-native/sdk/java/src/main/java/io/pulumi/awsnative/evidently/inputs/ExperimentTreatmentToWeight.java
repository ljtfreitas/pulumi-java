// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ExperimentTreatmentToWeight extends io.pulumi.resources.InvokeArgs {

    public static final ExperimentTreatmentToWeight Empty = new ExperimentTreatmentToWeight();

    @Import(name="splitWeight", required=true)
      private final Integer splitWeight;

    public Integer getSplitWeight() {
        return this.splitWeight;
    }

    @Import(name="treatment", required=true)
      private final String treatment;

    public String getTreatment() {
        return this.treatment;
    }

    public ExperimentTreatmentToWeight(
        Integer splitWeight,
        String treatment) {
        this.splitWeight = Objects.requireNonNull(splitWeight, "expected parameter 'splitWeight' to be non-null");
        this.treatment = Objects.requireNonNull(treatment, "expected parameter 'treatment' to be non-null");
    }

    private ExperimentTreatmentToWeight() {
        this.splitWeight = null;
        this.treatment = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentTreatmentToWeight defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer splitWeight;
        private String treatment;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentTreatmentToWeight defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.splitWeight = defaults.splitWeight;
    	      this.treatment = defaults.treatment;
        }

        public Builder splitWeight(Integer splitWeight) {
            this.splitWeight = Objects.requireNonNull(splitWeight);
            return this;
        }

        public Builder treatment(String treatment) {
            this.treatment = Objects.requireNonNull(treatment);
            return this;
        }
        public ExperimentTreatmentToWeight build() {
            return new ExperimentTreatmentToWeight(splitWeight, treatment);
        }
    }
}
