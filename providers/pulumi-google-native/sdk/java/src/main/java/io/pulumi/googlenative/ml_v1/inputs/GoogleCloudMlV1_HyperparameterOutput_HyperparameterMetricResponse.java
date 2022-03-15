// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * An observed value of a metric.
 * 
 */
public final class GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse Empty = new GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse();

    /**
     * The objective value at this training step.
     * 
     */
    @Import(name="objectiveValue", required=true)
      private final Double objectiveValue;

    public Double getObjectiveValue() {
        return this.objectiveValue;
    }

    /**
     * The global training step for this metric.
     * 
     */
    @Import(name="trainingStep", required=true)
      private final String trainingStep;

    public String getTrainingStep() {
        return this.trainingStep;
    }

    public GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse(
        Double objectiveValue,
        String trainingStep) {
        this.objectiveValue = Objects.requireNonNull(objectiveValue, "expected parameter 'objectiveValue' to be non-null");
        this.trainingStep = Objects.requireNonNull(trainingStep, "expected parameter 'trainingStep' to be non-null");
    }

    private GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse() {
        this.objectiveValue = null;
        this.trainingStep = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double objectiveValue;
        private String trainingStep;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectiveValue = defaults.objectiveValue;
    	      this.trainingStep = defaults.trainingStep;
        }

        public Builder objectiveValue(Double objectiveValue) {
            this.objectiveValue = Objects.requireNonNull(objectiveValue);
            return this;
        }

        public Builder trainingStep(String trainingStep) {
            this.trainingStep = Objects.requireNonNull(trainingStep);
            return this;
        }
        public GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse build() {
            return new GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse(objectiveValue, trainingStep);
        }
    }
}
