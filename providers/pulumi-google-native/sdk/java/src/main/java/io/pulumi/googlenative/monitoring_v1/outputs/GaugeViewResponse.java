// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;

@OutputCustomType
public final class GaugeViewResponse {
    /**
     * The lower bound for this gauge chart. The value of the chart should always be greater than or equal to this.
     * 
     */
    private final Double lowerBound;
    /**
     * The upper bound for this gauge chart. The value of the chart should always be less than or equal to this.
     * 
     */
    private final Double upperBound;

    @OutputCustomType.Constructor({"lowerBound","upperBound"})
    private GaugeViewResponse(
        Double lowerBound,
        Double upperBound) {
        this.lowerBound = Objects.requireNonNull(lowerBound);
        this.upperBound = Objects.requireNonNull(upperBound);
    }

    /**
     * The lower bound for this gauge chart. The value of the chart should always be greater than or equal to this.
     * 
     */
    public Double getLowerBound() {
        return this.lowerBound;
    }
    /**
     * The upper bound for this gauge chart. The value of the chart should always be less than or equal to this.
     * 
     */
    public Double getUpperBound() {
        return this.upperBound;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GaugeViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double lowerBound;
        private Double upperBound;

        public Builder() {
    	      // Empty
        }

        public Builder(GaugeViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lowerBound = defaults.lowerBound;
    	      this.upperBound = defaults.upperBound;
        }

        public Builder setLowerBound(Double lowerBound) {
            this.lowerBound = Objects.requireNonNull(lowerBound);
            return this;
        }

        public Builder setUpperBound(Double upperBound) {
            this.upperBound = Objects.requireNonNull(upperBound);
            return this;
        }
        public GaugeViewResponse build() {
            return new GaugeViewResponse(lowerBound, upperBound);
        }
    }
}
