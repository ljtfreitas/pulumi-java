// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

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
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Specifies the product of the image from the marketplace. This is the same value as Offer under the imageReference element.
     * 
     */
    @InputImport(name="product")
    private final @Nullable String product;

    public Optional<String> getProduct() {
        return this.product == null ? Optional.empty() : Optional.ofNullable(this.product);
    }

    /**
     * The promotion code.
     * 
     */
    @InputImport(name="promotionCode")
    private final @Nullable String promotionCode;

    public Optional<String> getPromotionCode() {
        return this.promotionCode == null ? Optional.empty() : Optional.ofNullable(this.promotionCode);
    }

    /**
     * The plan ID.
     * 
     */
    @InputImport(name="publisher")
    private final @Nullable String publisher;

    public Optional<String> getPublisher() {
        return this.publisher == null ? Optional.empty() : Optional.ofNullable(this.publisher);
    }

    public PurchasePlanResponse(
        @Nullable String name,
        @Nullable String product,
        @Nullable String promotionCode,
        @Nullable String publisher) {
        this.name = name;
        this.product = product;
        this.promotionCode = promotionCode;
        this.publisher = publisher;
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
        private @Nullable String name;
        private @Nullable String product;
        private @Nullable String promotionCode;
        private @Nullable String publisher;

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

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProduct(@Nullable String product) {
            this.product = product;
            return this;
        }

        public Builder setPromotionCode(@Nullable String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }

        public Builder setPublisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }

        public PurchasePlanResponse build() {
            return new PurchasePlanResponse(name, product, promotionCode, publisher);
        }
    }
}
