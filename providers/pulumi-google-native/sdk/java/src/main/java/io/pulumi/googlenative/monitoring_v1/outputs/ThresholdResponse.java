// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ThresholdResponse {
    /**
     * The state color for this threshold. Color is not allowed in a XyChart.
     * 
     */
    private final String color;
    /**
     * The direction for the current threshold. Direction is not allowed in a XyChart.
     * 
     */
    private final String direction;
    /**
     * A label for the threshold.
     * 
     */
    private final String label;
    /**
     * The target axis to use for plotting the threshold. Target axis is not allowed in a Scorecard.
     * 
     */
    private final String targetAxis;
    /**
     * The value of the threshold. The value should be defined in the native scale of the metric.
     * 
     */
    private final Double value;

    @OutputCustomType.Constructor({"color","direction","label","targetAxis","value"})
    private ThresholdResponse(
        String color,
        String direction,
        String label,
        String targetAxis,
        Double value) {
        this.color = Objects.requireNonNull(color);
        this.direction = Objects.requireNonNull(direction);
        this.label = Objects.requireNonNull(label);
        this.targetAxis = Objects.requireNonNull(targetAxis);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The state color for this threshold. Color is not allowed in a XyChart.
     * 
     */
    public String getColor() {
        return this.color;
    }
    /**
     * The direction for the current threshold. Direction is not allowed in a XyChart.
     * 
     */
    public String getDirection() {
        return this.direction;
    }
    /**
     * A label for the threshold.
     * 
     */
    public String getLabel() {
        return this.label;
    }
    /**
     * The target axis to use for plotting the threshold. Target axis is not allowed in a Scorecard.
     * 
     */
    public String getTargetAxis() {
        return this.targetAxis;
    }
    /**
     * The value of the threshold. The value should be defined in the native scale of the metric.
     * 
     */
    public Double getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThresholdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String color;
        private String direction;
        private String label;
        private String targetAxis;
        private Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(ThresholdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.color = defaults.color;
    	      this.direction = defaults.direction;
    	      this.label = defaults.label;
    	      this.targetAxis = defaults.targetAxis;
    	      this.value = defaults.value;
        }

        public Builder setColor(String color) {
            this.color = Objects.requireNonNull(color);
            return this;
        }

        public Builder setDirection(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setLabel(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }

        public Builder setTargetAxis(String targetAxis) {
            this.targetAxis = Objects.requireNonNull(targetAxis);
            return this;
        }

        public Builder setValue(Double value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ThresholdResponse build() {
            return new ThresholdResponse(color, direction, label, targetAxis, value);
        }
    }
}
