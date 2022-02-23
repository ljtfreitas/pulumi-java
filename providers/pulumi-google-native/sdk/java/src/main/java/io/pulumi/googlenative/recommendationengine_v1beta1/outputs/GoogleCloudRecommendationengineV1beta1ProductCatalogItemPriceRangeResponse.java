// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recommendationengine_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse {
    /**
     * The maximum product price.
     * 
     */
    private final Double max;
    /**
     * The minimum product price.
     * 
     */
    private final Double min;

    @OutputCustomType.Constructor({"max","min"})
    private GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse(
        Double max,
        Double min) {
        this.max = Objects.requireNonNull(max);
        this.min = Objects.requireNonNull(min);
    }

    /**
     * The maximum product price.
     * 
     */
    public Double getMax() {
        return this.max;
    }
    /**
     * The minimum product price.
     * 
     */
    public Double getMin() {
        return this.min;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double max;
        private Double min;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder setMax(Double max) {
            this.max = Objects.requireNonNull(max);
            return this;
        }

        public Builder setMin(Double min) {
            this.min = Objects.requireNonNull(min);
            return this;
        }
        public GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse build() {
            return new GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse(max, min);
        }
    }
}
