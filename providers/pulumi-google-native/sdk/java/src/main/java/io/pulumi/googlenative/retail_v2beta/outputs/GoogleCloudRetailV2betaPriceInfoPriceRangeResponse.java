// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaIntervalResponse;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRetailV2betaPriceInfoPriceRangeResponse {
    private final GoogleCloudRetailV2betaIntervalResponse originalPrice;
    private final GoogleCloudRetailV2betaIntervalResponse price;

    @OutputCustomType.Constructor({"originalPrice","price"})
    private GoogleCloudRetailV2betaPriceInfoPriceRangeResponse(
        GoogleCloudRetailV2betaIntervalResponse originalPrice,
        GoogleCloudRetailV2betaIntervalResponse price) {
        this.originalPrice = Objects.requireNonNull(originalPrice);
        this.price = Objects.requireNonNull(price);
    }

    public GoogleCloudRetailV2betaIntervalResponse getOriginalPrice() {
        return this.originalPrice;
    }
    public GoogleCloudRetailV2betaIntervalResponse getPrice() {
        return this.price;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaPriceInfoPriceRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2betaIntervalResponse originalPrice;
        private GoogleCloudRetailV2betaIntervalResponse price;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaPriceInfoPriceRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.originalPrice = defaults.originalPrice;
    	      this.price = defaults.price;
        }

        public Builder setOriginalPrice(GoogleCloudRetailV2betaIntervalResponse originalPrice) {
            this.originalPrice = Objects.requireNonNull(originalPrice);
            return this;
        }

        public Builder setPrice(GoogleCloudRetailV2betaIntervalResponse price) {
            this.price = Objects.requireNonNull(price);
            return this;
        }

        public GoogleCloudRetailV2betaPriceInfoPriceRangeResponse build() {
            return new GoogleCloudRetailV2betaPriceInfoPriceRangeResponse(originalPrice, price);
        }
    }
}