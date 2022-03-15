// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class GoogleCloudContactcenterinsightsV1SentimentDataResponse {
    /**
     * A non-negative number from 0 to infinity which represents the abolute magnitude of sentiment regardless of score.
     * 
     */
    private final Double magnitude;
    /**
     * The sentiment score between -1.0 (negative) and 1.0 (positive).
     * 
     */
    private final Double score;

    @CustomType.Constructor
    private GoogleCloudContactcenterinsightsV1SentimentDataResponse(
        @CustomType.Parameter("magnitude") Double magnitude,
        @CustomType.Parameter("score") Double score) {
        this.magnitude = magnitude;
        this.score = score;
    }

    /**
     * A non-negative number from 0 to infinity which represents the abolute magnitude of sentiment regardless of score.
     * 
    */
    public Double getMagnitude() {
        return this.magnitude;
    }
    /**
     * The sentiment score between -1.0 (negative) and 1.0 (positive).
     * 
    */
    public Double getScore() {
        return this.score;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1SentimentDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double magnitude;
        private Double score;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1SentimentDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.magnitude = defaults.magnitude;
    	      this.score = defaults.score;
        }

        public Builder magnitude(Double magnitude) {
            this.magnitude = Objects.requireNonNull(magnitude);
            return this;
        }

        public Builder score(Double score) {
            this.score = Objects.requireNonNull(score);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1SentimentDataResponse build() {
            return new GoogleCloudContactcenterinsightsV1SentimentDataResponse(magnitude, score);
        }
    }
}
