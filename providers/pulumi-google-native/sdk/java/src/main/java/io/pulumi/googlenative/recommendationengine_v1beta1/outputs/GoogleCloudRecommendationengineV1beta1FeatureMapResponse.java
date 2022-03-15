// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recommendationengine_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GoogleCloudRecommendationengineV1beta1FeatureMapResponse {
    /**
     * Categorical features that can take on one of a limited number of possible values. Some examples would be the brand/maker of a product, or country of a customer. Feature names and values must be UTF-8 encoded strings. For example: `{ "colors": {"value": ["yellow", "green"]}, "sizes": {"value":["S", "M"]}`
     * 
     */
    private final Map<String,String> categoricalFeatures;
    /**
     * Numerical features. Some examples would be the height/weight of a product, or age of a customer. Feature names must be UTF-8 encoded strings. For example: `{ "lengths_cm": {"value":[2.3, 15.4]}, "heights_cm": {"value":[8.1, 6.4]} }`
     * 
     */
    private final Map<String,String> numericalFeatures;

    @CustomType.Constructor
    private GoogleCloudRecommendationengineV1beta1FeatureMapResponse(
        @CustomType.Parameter("categoricalFeatures") Map<String,String> categoricalFeatures,
        @CustomType.Parameter("numericalFeatures") Map<String,String> numericalFeatures) {
        this.categoricalFeatures = categoricalFeatures;
        this.numericalFeatures = numericalFeatures;
    }

    /**
     * Categorical features that can take on one of a limited number of possible values. Some examples would be the brand/maker of a product, or country of a customer. Feature names and values must be UTF-8 encoded strings. For example: `{ "colors": {"value": ["yellow", "green"]}, "sizes": {"value":["S", "M"]}`
     * 
    */
    public Map<String,String> getCategoricalFeatures() {
        return this.categoricalFeatures;
    }
    /**
     * Numerical features. Some examples would be the height/weight of a product, or age of a customer. Feature names must be UTF-8 encoded strings. For example: `{ "lengths_cm": {"value":[2.3, 15.4]}, "heights_cm": {"value":[8.1, 6.4]} }`
     * 
    */
    public Map<String,String> getNumericalFeatures() {
        return this.numericalFeatures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecommendationengineV1beta1FeatureMapResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> categoricalFeatures;
        private Map<String,String> numericalFeatures;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecommendationengineV1beta1FeatureMapResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoricalFeatures = defaults.categoricalFeatures;
    	      this.numericalFeatures = defaults.numericalFeatures;
        }

        public Builder categoricalFeatures(Map<String,String> categoricalFeatures) {
            this.categoricalFeatures = Objects.requireNonNull(categoricalFeatures);
            return this;
        }

        public Builder numericalFeatures(Map<String,String> numericalFeatures) {
            this.numericalFeatures = Objects.requireNonNull(numericalFeatures);
            return this;
        }
        public GoogleCloudRecommendationengineV1beta1FeatureMapResponse build() {
            return new GoogleCloudRecommendationengineV1beta1FeatureMapResponse(categoricalFeatures, numericalFeatures);
        }
    }
}
