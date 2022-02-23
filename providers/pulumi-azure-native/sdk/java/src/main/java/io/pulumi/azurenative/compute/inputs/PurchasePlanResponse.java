// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Used for establishing the purchase context of any 3rd Party artifact through MarketPlace.
 * 
 */
public final class PurchasePlanResponse extends io.pulumi.resources.InvokeArgs {

    public static final PurchasePlanResponse Empty = new PurchasePlanResponse();

    /**
     * The plan ID.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Specifies the product of the image from the marketplace. This is the same value as Offer under the imageReference element.
     * 
     */
    @InputImport(name="product", required=true)
        private final String product;

    public String getProduct() {
        return this.product;
    }

    /**
     * The Offer Promotion Code.
     * 
     */
    @InputImport(name="promotionCode")
        private final @Nullable String promotionCode;

    public Optional<String> getPromotionCode() {
        return this.promotionCode == null ? Optional.empty() : Optional.ofNullable(this.promotionCode);
    }

    /**
     * The publisher ID.
     * 
     */
    @InputImport(name="publisher", required=true)
        private final String publisher;

    public String getPublisher() {
        return this.publisher;
    }

    public PurchasePlanResponse(
        String name,
        String product,
        @Nullable String promotionCode,
        String publisher) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.product = Objects.requireNonNull(product, "expected parameter 'product' to be non-null");
        this.promotionCode = promotionCode;
        this.publisher = Objects.requireNonNull(publisher, "expected parameter 'publisher' to be non-null");
    }

    private PurchasePlanResponse() {
        this.name = null;
        this.product = null;
        this.promotionCode = null;
        this.publisher = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PurchasePlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String product;
        private @Nullable String promotionCode;
        private String publisher;

        public Builder() {
    	      // Empty
        }

        public Builder(PurchasePlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.promotionCode = defaults.promotionCode;
    	      this.publisher = defaults.publisher;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProduct(String product) {
            this.product = Objects.requireNonNull(product);
            return this;
        }

        public Builder setPromotionCode(@Nullable String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }

        public Builder setPublisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }
        public PurchasePlanResponse build() {
            return new PurchasePlanResponse(name, product, promotionCode, publisher);
        }
    }
}
