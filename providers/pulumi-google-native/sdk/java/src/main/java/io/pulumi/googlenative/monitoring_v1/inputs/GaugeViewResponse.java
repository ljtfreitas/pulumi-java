// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;


public final class GaugeViewResponse extends io.pulumi.resources.InvokeArgs {

    public static final GaugeViewResponse Empty = new GaugeViewResponse();

    @InputImport(name="lowerBound", required=true)
    private final Double lowerBound;

    public Double getLowerBound() {
        return this.lowerBound;
    }

    @InputImport(name="upperBound", required=true)
    private final Double upperBound;

    public Double getUpperBound() {
        return this.upperBound;
    }

    public GaugeViewResponse(
        Double lowerBound,
        Double upperBound) {
        this.lowerBound = Objects.requireNonNull(lowerBound, "expected parameter 'lowerBound' to be non-null");
        this.upperBound = Objects.requireNonNull(upperBound, "expected parameter 'upperBound' to be non-null");
    }

    private GaugeViewResponse() {
        this.lowerBound = null;
        this.upperBound = null;
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